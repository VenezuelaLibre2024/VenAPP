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
import kotlin.jvm.internal.C9322n;
import p450xk.C12525q;

/* renamed from: sh.i */
/* loaded from: classes3.dex */
public final class C10922i {

    /* renamed from: a */
    private final String f27786a;

    /* renamed from: b */
    private final int f27787b;

    /* renamed from: c */
    private final String f27788c;

    /* renamed from: d */
    private final MethodChannel f27789d;

    /* renamed from: e */
    private final MethodChannel.Result f27790e;

    /* renamed from: f */
    private final InterfaceC10918e f27791f;

    /* renamed from: g */
    private final Context f27792g;

    /* renamed from: h */
    private MediaCodec f27793h;

    /* renamed from: i */
    private MediaExtractor f27794i;

    /* renamed from: j */
    private long f27795j;

    /* renamed from: k */
    private float f27796k;

    /* renamed from: l */
    private float f27797l;

    /* renamed from: m */
    private volatile boolean f27798m;

    /* renamed from: n */
    private final CountDownLatch f27799n;

    /* renamed from: o */
    private boolean f27800o;

    /* renamed from: p */
    private int f27801p;

    /* renamed from: q */
    private int f27802q;

    /* renamed from: r */
    private int f27803r;

    /* renamed from: s */
    private long f27804s;

    /* renamed from: t */
    private long f27805t;

    /* renamed from: u */
    private ArrayList<Float> f27806u;

    /* renamed from: v */
    private long f27807v;

    /* renamed from: w */
    private double f27808w;

    /* renamed from: sh.i$a */
    /* loaded from: classes3.dex */
    public static final class a extends MediaCodec.Callback {
        a() {
        }

        @Override // android.media.MediaCodec.Callback
        public void onError(MediaCodec codec, MediaCodec.CodecException e10) {
            C9322n.m27781e(codec, "codec");
            C9322n.m27781e(e10, "e");
            C10922i.this.f27790e.error("AudioWaveforms", e10.getMessage(), "An error is thrown while decoding the audio file");
            C10922i.this.f27799n.countDown();
        }

        @Override // android.media.MediaCodec.Callback
        public void onInputBufferAvailable(MediaCodec codec, int i10) {
            MediaExtractor mediaExtractor;
            ByteBuffer inputBuffer;
            C9322n.m27781e(codec, "codec");
            if (C10922i.this.f27800o || (mediaExtractor = C10922i.this.f27794i) == null || (inputBuffer = codec.getInputBuffer(i10)) == null) {
                return;
            }
            C10922i c10922i = C10922i.this;
            int readSampleData = mediaExtractor.readSampleData(inputBuffer, 0);
            if (readSampleData > 0) {
                codec.queueInputBuffer(i10, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                mediaExtractor.advance();
            } else {
                codec.queueInputBuffer(i10, 0, 0, 0L, 4);
                c10922i.f27800o = true;
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputBufferAvailable(MediaCodec codec, int i10, MediaCodec.BufferInfo info) {
            ByteBuffer outputBuffer;
            C9322n.m27781e(codec, "codec");
            C9322n.m27781e(info, "info");
            if (info.size > 0 && (outputBuffer = codec.getOutputBuffer(i10)) != null) {
                C10922i c10922i = C10922i.this;
                int i11 = info.size;
                outputBuffer.position(info.offset);
                int i12 = c10922i.f27803r;
                if (i12 == 8) {
                    c10922i.m33390w(i11, outputBuffer);
                } else if (i12 == 16) {
                    c10922i.m33388u(i11, outputBuffer);
                } else if (i12 == 32) {
                    c10922i.m33389v(i11, outputBuffer);
                }
                codec.releaseOutputBuffer(i10, false);
            }
            if (C10923j.m33395a(info)) {
                C10922i.this.m33394z();
            }
        }

        @Override // android.media.MediaCodec.Callback
        public void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
            int integer;
            C9322n.m27781e(codec, "codec");
            C9322n.m27781e(format, "format");
            C10922i.this.f27801p = format.getInteger("sample-rate");
            C10922i.this.f27802q = format.getInteger("channel-count");
            C10922i c10922i = C10922i.this;
            int i10 = 16;
            if (format.containsKey("pcm-encoding") && (integer = format.getInteger("pcm-encoding")) != 2) {
                if (integer == 3) {
                    i10 = 8;
                } else if (integer == 4) {
                    i10 = 32;
                }
            }
            c10922i.f27803r = i10;
            C10922i.this.f27804s = (r5.f27801p * C10922i.this.f27795j) / AdError.NETWORK_ERROR_CODE;
            C10922i c10922i2 = C10922i.this;
            c10922i2.f27805t = c10922i2.f27804s / C10922i.this.f27787b;
        }
    }

    public C10922i(String path, int i10, String key, MethodChannel methodChannel, MethodChannel.Result result, InterfaceC10918e extractorCallBack, Context context) {
        C9322n.m27781e(path, "path");
        C9322n.m27781e(key, "key");
        C9322n.m27781e(methodChannel, "methodChannel");
        C9322n.m27781e(result, "result");
        C9322n.m27781e(extractorCallBack, "extractorCallBack");
        C9322n.m27781e(context, "context");
        this.f27786a = path;
        this.f27787b = i10;
        this.f27788c = key;
        this.f27789d = methodChannel;
        this.f27790e = result;
        this.f27791f = extractorCallBack;
        this.f27792g = context;
        this.f27799n = new CountDownLatch(1);
        this.f27802q = 1;
        this.f27803r = 16;
        this.f27806u = new ArrayList<>();
    }

    /* renamed from: s */
    private final MediaFormat m33387s(String str) {
        boolean m41059J;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f27794i = mediaExtractor;
        mediaExtractor.setDataSource(this.f27792g, Uri.parse(str), (Map<String, String>) null);
        int trackCount = mediaExtractor.getTrackCount();
        for (int i10 = 0; i10 < trackCount; i10++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
            C9322n.m27780d(trackFormat, "getTrackFormat(...)");
            String string = trackFormat.getString("mime");
            if (string == null) {
                string = "";
            }
            C9322n.m27778b(string);
            m41059J = C12525q.m41059J(string, "audio", false, 2, null);
            if (m41059J) {
                this.f27795j = trackFormat.getLong("durationUs") / AdError.NETWORK_ERROR_CODE;
                mediaExtractor.selectTrack(i10);
                return trackFormat;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public final void m33388u(int i10, ByteBuffer byteBuffer) {
        int i11 = i10 / (this.f27802q == 2 ? 4 : 2);
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = (byteBuffer.get() | (byteBuffer.get() << 8)) / 32767.0f;
            if (this.f27802q == 2) {
                byteBuffer.get();
                byteBuffer.get();
            }
            m33391x(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public final void m33389v(int i10, ByteBuffer byteBuffer) {
        int i11 = i10 / (this.f27802q == 2 ? 8 : 4);
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = ((float) (((byteBuffer.get() | (byteBuffer.get() << 8)) | (byteBuffer.get() << 16)) | (byteBuffer.get() << 24))) / 2.1474836E9f;
            if (this.f27802q == 2) {
                byteBuffer.get();
                byteBuffer.get();
                byteBuffer.get();
                byteBuffer.get();
            }
            m33391x(f10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public final void m33390w(int i10, ByteBuffer byteBuffer) {
        int i11 = i10 / (this.f27802q == 2 ? 2 : 1);
        for (int i12 = 0; i12 < i11; i12++) {
            float f10 = byteBuffer.get() / 128.0f;
            if (this.f27802q == 2) {
                byteBuffer.get();
            }
            m33391x(f10);
        }
    }

    /* renamed from: x */
    private final void m33391x(float f10) {
        long j10 = this.f27807v;
        long j11 = this.f27805t;
        if (j10 == j11) {
            float f11 = this.f27797l + 1.0f;
            this.f27797l = f11;
            float f12 = f11 / this.f27787b;
            this.f27796k = f12;
            if (f12 > 1.0f) {
                m33394z();
                return;
            }
            this.f27806u.add(Float.valueOf((float) Math.sqrt(this.f27808w / j11)));
            this.f27791f.mo33362a(this.f27796k);
            this.f27807v = 0L;
            this.f27808w = 0.0d;
            HashMap hashMap = new HashMap();
            hashMap.put("waveformData", this.f27806u);
            hashMap.put("progress", Float.valueOf(this.f27796k));
            hashMap.put("playerKey", this.f27788c);
            this.f27789d.invokeMethod("onCurrentExtractedWaveformData", hashMap);
        }
        this.f27807v++;
        this.f27808w += Math.pow(f10, 2.0d);
    }

    /* renamed from: t */
    public final ArrayList<Float> m33392t() {
        return this.f27806u;
    }

    /* renamed from: y */
    public final void m33393y() {
        try {
            MediaFormat m33387s = m33387s(this.f27786a);
            if (m33387s == null) {
                throw new IllegalStateException("No audio format found".toString());
            }
            String string = m33387s.getString("mime");
            if (string == null) {
                throw new IllegalStateException("No MIME type found".toString());
            }
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(string);
            createDecoderByType.configure(m33387s, (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.setCallback(new a());
            createDecoderByType.start();
            this.f27793h = createDecoderByType;
        } catch (Exception e10) {
            this.f27790e.error("AudioWaveforms", e10.getMessage(), "An error is thrown before decoding the audio file");
        }
    }

    /* renamed from: z */
    public final void m33394z() {
        if (this.f27798m) {
            this.f27798m = false;
            MediaCodec mediaCodec = this.f27793h;
            if (mediaCodec != null) {
                mediaCodec.stop();
            }
            MediaCodec mediaCodec2 = this.f27793h;
            if (mediaCodec2 != null) {
                mediaCodec2.release();
            }
            MediaExtractor mediaExtractor = this.f27794i;
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
            this.f27799n.countDown();
        }
    }
}
