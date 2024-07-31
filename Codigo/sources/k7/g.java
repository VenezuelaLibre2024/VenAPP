package k7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import t8.r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f20426b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f20427c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f20432h;

    /* renamed from: i, reason: collision with root package name */
    private MediaFormat f20433i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f20434j;

    /* renamed from: k, reason: collision with root package name */
    private long f20435k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20436l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f20437m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f20425a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final k f20428d = new k();

    /* renamed from: e, reason: collision with root package name */
    private final k f20429e = new k();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f20430f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f20431g = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(HandlerThread handlerThread) {
        this.f20426b = handlerThread;
    }

    private void b(MediaFormat mediaFormat) {
        this.f20429e.a(-2);
        this.f20431g.add(mediaFormat);
    }

    private void f() {
        if (!this.f20431g.isEmpty()) {
            this.f20433i = this.f20431g.getLast();
        }
        this.f20428d.b();
        this.f20429e.b();
        this.f20430f.clear();
        this.f20431g.clear();
    }

    private boolean i() {
        return this.f20435k > 0 || this.f20436l;
    }

    private void j() {
        k();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f20437m;
        if (illegalStateException == null) {
            return;
        }
        this.f20437m = null;
        throw illegalStateException;
    }

    private void l() {
        MediaCodec.CodecException codecException = this.f20434j;
        if (codecException == null) {
            return;
        }
        this.f20434j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        synchronized (this.f20425a) {
            if (this.f20436l) {
                return;
            }
            long j10 = this.f20435k - 1;
            this.f20435k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                n(new IllegalStateException());
            } else {
                f();
            }
        }
    }

    private void n(IllegalStateException illegalStateException) {
        synchronized (this.f20425a) {
            this.f20437m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f20425a) {
            int i10 = -1;
            if (i()) {
                return -1;
            }
            j();
            if (!this.f20428d.d()) {
                i10 = this.f20428d.e();
            }
            return i10;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f20425a) {
            if (i()) {
                return -1;
            }
            j();
            if (this.f20429e.d()) {
                return -1;
            }
            int e10 = this.f20429e.e();
            if (e10 >= 0) {
                t8.a.i(this.f20432h);
                MediaCodec.BufferInfo remove = this.f20430f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e10 == -2) {
                this.f20432h = this.f20431g.remove();
            }
            return e10;
        }
    }

    public void e() {
        synchronized (this.f20425a) {
            this.f20435k++;
            ((Handler) r0.j(this.f20427c)).post(new Runnable() { // from class: k7.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.m();
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f20425a) {
            mediaFormat = this.f20432h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        t8.a.g(this.f20427c == null);
        this.f20426b.start();
        Handler handler = new Handler(this.f20426b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f20427c = handler;
    }

    public void o() {
        synchronized (this.f20425a) {
            this.f20436l = true;
            this.f20426b.quit();
            f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f20425a) {
            this.f20434j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f20425a) {
            this.f20428d.a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f20425a) {
            MediaFormat mediaFormat = this.f20433i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f20433i = null;
            }
            this.f20429e.a(i10);
            this.f20430f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f20425a) {
            b(mediaFormat);
            this.f20433i = null;
        }
    }
}
