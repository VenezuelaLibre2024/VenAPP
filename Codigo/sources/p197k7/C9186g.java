package p197k7;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import p363t8.C11137a;
import p363t8.C11172r0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k7.g */
/* loaded from: classes.dex */
public final class C9186g extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f22208b;

    /* renamed from: c */
    private Handler f22209c;

    /* renamed from: h */
    private MediaFormat f22214h;

    /* renamed from: i */
    private MediaFormat f22215i;

    /* renamed from: j */
    private MediaCodec.CodecException f22216j;

    /* renamed from: k */
    private long f22217k;

    /* renamed from: l */
    private boolean f22218l;

    /* renamed from: m */
    private IllegalStateException f22219m;

    /* renamed from: a */
    private final Object f22207a = new Object();

    /* renamed from: d */
    private final C9190k f22210d = new C9190k();

    /* renamed from: e */
    private final C9190k f22211e = new C9190k();

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f22212f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f22213g = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9186g(HandlerThread handlerThread) {
        this.f22208b = handlerThread;
    }

    /* renamed from: b */
    private void m27228b(MediaFormat mediaFormat) {
        this.f22211e.m27254a(-2);
        this.f22213g.add(mediaFormat);
    }

    /* renamed from: f */
    private void m27229f() {
        if (!this.f22213g.isEmpty()) {
            this.f22215i = this.f22213g.getLast();
        }
        this.f22210d.m27255b();
        this.f22211e.m27255b();
        this.f22212f.clear();
        this.f22213g.clear();
    }

    /* renamed from: i */
    private boolean m27230i() {
        return this.f22217k > 0 || this.f22218l;
    }

    /* renamed from: j */
    private void m27231j() {
        m27232k();
        m27233l();
    }

    /* renamed from: k */
    private void m27232k() {
        IllegalStateException illegalStateException = this.f22219m;
        if (illegalStateException == null) {
            return;
        }
        this.f22219m = null;
        throw illegalStateException;
    }

    /* renamed from: l */
    private void m27233l() {
        MediaCodec.CodecException codecException = this.f22216j;
        if (codecException == null) {
            return;
        }
        this.f22216j = null;
        throw codecException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m27234m() {
        synchronized (this.f22207a) {
            if (this.f22218l) {
                return;
            }
            long j10 = this.f22217k - 1;
            this.f22217k = j10;
            if (j10 > 0) {
                return;
            }
            if (j10 < 0) {
                m27235n(new IllegalStateException());
            } else {
                m27229f();
            }
        }
    }

    /* renamed from: n */
    private void m27235n(IllegalStateException illegalStateException) {
        synchronized (this.f22207a) {
            this.f22219m = illegalStateException;
        }
    }

    /* renamed from: c */
    public int m27236c() {
        synchronized (this.f22207a) {
            int i10 = -1;
            if (m27230i()) {
                return -1;
            }
            m27231j();
            if (!this.f22210d.m27256d()) {
                i10 = this.f22210d.m27257e();
            }
            return i10;
        }
    }

    /* renamed from: d */
    public int m27237d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f22207a) {
            if (m27230i()) {
                return -1;
            }
            m27231j();
            if (this.f22211e.m27256d()) {
                return -1;
            }
            int m27257e = this.f22211e.m27257e();
            if (m27257e >= 0) {
                C11137a.m34607i(this.f22214h);
                MediaCodec.BufferInfo remove = this.f22212f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (m27257e == -2) {
                this.f22214h = this.f22213g.remove();
            }
            return m27257e;
        }
    }

    /* renamed from: e */
    public void m27238e() {
        synchronized (this.f22207a) {
            this.f22217k++;
            ((Handler) C11172r0.m34928j(this.f22209c)).post(new Runnable() { // from class: k7.f
                @Override // java.lang.Runnable
                public final void run() {
                    C9186g.this.m27234m();
                }
            });
        }
    }

    /* renamed from: g */
    public MediaFormat m27239g() {
        MediaFormat mediaFormat;
        synchronized (this.f22207a) {
            mediaFormat = this.f22214h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: h */
    public void m27240h(MediaCodec mediaCodec) {
        C11137a.m34605g(this.f22209c == null);
        this.f22208b.start();
        Handler handler = new Handler(this.f22208b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f22209c = handler;
    }

    /* renamed from: o */
    public void m27241o() {
        synchronized (this.f22207a) {
            this.f22218l = true;
            this.f22208b.quit();
            m27229f();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f22207a) {
            this.f22216j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f22207a) {
            this.f22210d.m27254a(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f22207a) {
            MediaFormat mediaFormat = this.f22215i;
            if (mediaFormat != null) {
                m27228b(mediaFormat);
                this.f22215i = null;
            }
            this.f22211e.m27254a(i10);
            this.f22212f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f22207a) {
            m27228b(mediaFormat);
            this.f22215i = null;
        }
    }
}
