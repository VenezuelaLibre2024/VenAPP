package sh;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.view.Surface;
import com.facebook.ads.AdError;
import io.flutter.plugin.common.MethodChannel;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.n;
import xk.q;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final String f25642a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25643b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25644c;

    /* renamed from: d, reason: collision with root package name */
    private final MethodChannel f25645d;

    /* renamed from: e, reason: collision with root package name */
    private final MethodChannel.Result f25646e;

    /* renamed from: f, reason: collision with root package name */
    private final e f25647f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f25648g;

    /* renamed from: h, reason: collision with root package name */
    private MediaCodec f25649h;

    /* renamed from: i, reason: collision with root package name */
    private MediaExtractor f25650i;

    /* renamed from: j, reason: collision with root package name */
    private long f25651j;

    /* renamed from: k, reason: collision with root package name */
    private float f25652k;

    /* renamed from: l, reason: collision with root package name */
    private float f25653l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f25654m;

    /* renamed from: n, reason: collision with root package name */
    private final CountDownLatch f25655n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25656o;

    /* renamed from: p, reason: collision with root package name */
    private int f25657p;

    /* renamed from: q, reason: collision with root package name */
    private int f25658q;

    /* renamed from: r, reason: collision with root package name */
    private int f25659r;

    /* renamed from: s, reason: collision with root package name */
    private long f25660s;

    /* renamed from: t, reason: collision with root package name */
    private long f25661t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList<Float> f25662u;

    /* renamed from: v, reason: collision with root package name */
    private long f25663v;

    /* renamed from: w, reason: collision with root package name */
    private double f25664w;

    /* loaded from: classes3.dex */
    public static final class a extends MediaCodec.Callback {
        a() {
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec codec, MediaCodec.CodecException e10) {
            n.e(codec, "codec");
            n.e(e10, "e");
            i.this.f25646e.error("AudioWaveforms", e10.getMessage(), "An error is thrown while decoding the audio file");
            i.this.f25655n.countDown();
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec codec, int i10) {
            MediaExtractor mediaExtractor;
            ByteBuffer inputBuffer;
            n.e(codec, "codec");
            if (i.this.f25656o || (mediaExtractor = i.this.f25650i) == null || (inputBuffer = codec.getInputBuffer(i10)) == null) {
                return;
            }
            i iVar = i.this;
            int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
            if (readSampleData > 0) {
                codec.queueInputBuffer(i10, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                mediaExtractor.advance();
            } else {
                codec.queueInputBuffer(i10, 0, 0, 0L, 4);
                iVar.f25656o = true;
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec codec, int i10, MediaCodec.BufferInfo info) {
            ByteBuffer outputBuffer;
            n.e(codec, "codec");
            n.e(info, "info");
            if (info.size > 0 && (outputBuffer = codec.getOutputBuffer(i10)) != null) {
                i iVar = i.this;
                int i11 = info.size;
                outputBuffer.position(info.offset);
                int i12 = iVar.f25659r;
                if (i12 == 8) {
                    iVar.w(i11, outputBuffer);
                } else if (i12 == 16) {
                    iVar.u(i11, outputBuffer);
                } else if (i12 == 32) {
                    iVar.v(i11, outputBuffer);
                }
                codec.releaseOutputBuffer(i10, false);
            }
            if (j.a(info)) {
                i.this.z();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
            int integer;
            n.e(codec, "codec");
            n.e(format, "format");
            i.this.f25657p = format.getInteger("sample-rate");
            i.this.f25658q = format.getInteger("channel-count");
            i iVar = i.this;
            int i10 = 16;
            if (format.containsKey("pcm-encoding") && (integer = format.getInteger("pcm-encoding")) != 2) {
                if (integer == 3) {
                    i10 = 8;
                } else if (integer == 4) {
                    i10 = 32;
                }
            }
            iVar.f25659r = i10;
            i.this.f25660s = (r5.f25657p * i.this.f25651j) / AdError.NETWORK_ERROR_CODE;
            i iVar2 = i.this;
            iVar2.f25661t = iVar2.f25660s / i.this.f25643b;
        }
    }

    public i(String path, int i10, String key, MethodChannel methodChannel, MethodChannel.Result result, e extractorCallBack, Context context) {
        n.e(path, "path");
        n.e(key, "key");
        n.e(methodChannel, "methodChannel");
        n.e(result, "result");
        n.e(extractorCallBack, "extractorCallBack");
        n.e(context, "context");
        this.f25642a = path;
        this.f25643b = i10;
        this.f25644c = key;
        this.f25645d = methodChannel;
        this.f25646e = result;
        this.f25647f = extractorCallBack;
        this.f25648g = context;
        this.f25655n = new CountDownLatch(1);
        this.f25658q = 1;
        this.f25659r = 16;
        this.f25662u = new ArrayList<>();
    }

    private final MediaFormat s(String str) {
        boolean J;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f25650i = mediaExtractor;
        mediaExtractor.setDataSource(this.f25648g, Uri.parse(str), (Map<String, String>) null);
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
            n.d(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            n.b(string);
            J = q.J(string, "audio", false, 2, null);
            if (J) {
                this.f25651j = trackFormat.getLong("durationUs") / AdError.NETWORK_ERROR_CODE;
                mediaExtractor.selectTrack(i10);
                return trackFormat;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(int i10, ByteBuffer byteBuffer) {
        int i11 = i10 / (this.f25658q == 2 ? 4 : 2);
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = (byteBuffer.get() | (byteBuffer.get() << 8)) / 32767.0f;
            if (this.f25658q == 2) {
                byteBuffer.get();
                byteBuffer.get();
            }
            x(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(int i10, ByteBuffer byteBuffer) {
        int i11 = i10 / (this.f25658q == 2 ? 8 : 4);
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = ((float) (((byteBuffer.get() | (byteBuffer.get() << 8)) | (byteBuffer.get() << 16)) | (byteBuffer.get() << 24))) / 2.1474836E9f;
            if (this.f25658q == 2) {
                byteBuffer.get();
                byteBuffer.get();
                byteBuffer.get();
                byteBuffer.get();
            }
            x(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int i10, ByteBuffer byteBuffer) {
        int i11 = i10 / (this.f25658q == 2 ? 2 : 1);
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = byteBuffer.get() / 128.0f;
            if (this.f25658q == 2) {
                byteBuffer.get();
            }
            x(f10);
        }
    }

    private final void x(float f10) {
        long j10 = this.f25663v;
        long j11 = this.f25661t;
        if (j10 == j11) {
            float f11 = this.f25653l + 1.0f;
            this.f25653l = f11;
            float f12 = f11 / this.f25643b;
            this.f25652k = f12;
            if (f12 > 1.0f) {
                z();
                return;
            }
            this.f25662u.add(Float.valueOf((float) Math.sqrt(this.f25664w / j11)));
            this.f25647f.a(this.f25652k);
            this.f25663v = 0L;
            this.f25664w = 0.0d;
            HashMap hashMap = new HashMap();
            hashMap.put("waveformData", this.f25662u);
            hashMap.put("progress", Float.valueOf(this.f25652k));
            hashMap.put("playerKey", this.f25644c);
            this.f25645d.invokeMethod("onCurrentExtractedWaveformData", hashMap);
        }
        this.f25663v++;
        this.f25664w += Math.pow(f10, 2.0d);
    }

    public final ArrayList<Float> t() {
        return this.f25662u;
    }

    public final void y() {
        try {
            MediaFormat s10 = s(this.f25642a);
            if (s10 == null) {
                throw new IllegalStateException("No audio format found".toString());
            }
            String string = s10.getString("mime");
            if (string == null) {
                throw new IllegalStateException("No MIME type found".toString());
            }
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
            createDecoderByType.configure(s10, (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.setCallback(new a());
            createDecoderByType.start();
            this.f25649h = createDecoderByType;
        } catch (Exception e10) {
            this.f25646e.error("AudioWaveforms", e10.getMessage(), "An error is thrown before decoding the audio file");
        }
    }

    public final void z() {
        if (this.f25654m) {
            this.f25654m = false;
            MediaCodec mediaCodec = this.f25649h;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            MediaCodec mediaCodec2 = this.f25649h;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            MediaExtractor mediaExtractor = this.f25650i;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.f25655n.countDown();
        }
    }
}
