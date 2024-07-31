package p197k7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import p082eb.InterfaceC7166v;
import p197k7.C9177b;
import p197k7.InterfaceC9191l;
import p363t8.C11166o0;
import p414w6.C12078c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k7.b */
/* loaded from: classes.dex */
public final class C9177b implements InterfaceC9191l {

    /* renamed from: a */
    private final MediaCodec f22166a;

    /* renamed from: b */
    private final C9186g f22167b;

    /* renamed from: c */
    private final C9183e f22168c;

    /* renamed from: d */
    private final boolean f22169d;

    /* renamed from: e */
    private boolean f22170e;

    /* renamed from: f */
    private int f22171f;

    /* renamed from: k7.b$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC9191l.b {

        /* renamed from: a */
        private final InterfaceC7166v<HandlerThread> f22172a;

        /* renamed from: b */
        private final InterfaceC7166v<HandlerThread> f22173b;

        /* renamed from: c */
        private final boolean f22174c;

        public b(final int i10, boolean z10) {
            this(new InterfaceC7166v() { // from class: k7.c
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    HandlerThread m27151e;
                    m27151e = C9177b.b.m27151e(i10);
                    return m27151e;
                }
            }, new InterfaceC7166v() { // from class: k7.d
                @Override // p082eb.InterfaceC7166v
                public final Object get() {
                    HandlerThread m27152f;
                    m27152f = C9177b.b.m27152f(i10);
                    return m27152f;
                }
            }, z10);
        }

        b(InterfaceC7166v<HandlerThread> interfaceC7166v, InterfaceC7166v<HandlerThread> interfaceC7166v2, boolean z10) {
            this.f22172a = interfaceC7166v;
            this.f22173b = interfaceC7166v2;
            this.f22174c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ HandlerThread m27151e(int i10) {
            return new HandlerThread(C9177b.m27129s(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ HandlerThread m27152f(int i10) {
            return new HandlerThread(C9177b.m27130t(i10));
        }

        @Override // p197k7.InterfaceC9191l.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C9177b mo27153a(InterfaceC9191l.a aVar) {
            MediaCodec mediaCodec;
            String str = aVar.f22233a.f22241a;
            C9177b c9177b = null;
            try {
                C11166o0.m34831a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    C9177b c9177b2 = new C9177b(mediaCodec, this.f22172a.get(), this.f22173b.get(), this.f22174c);
                    try {
                        C11166o0.m34833c();
                        c9177b2.m27132v(aVar.f22234b, aVar.f22236d, aVar.f22237e, aVar.f22238f);
                        return c9177b2;
                    } catch (Exception e10) {
                        e = e10;
                        c9177b = c9177b2;
                        if (c9177b != null) {
                            c9177b.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodec = null;
            }
        }
    }

    private C9177b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f22166a = mediaCodec;
        this.f22167b = new C9186g(handlerThread);
        this.f22168c = new C9183e(mediaCodec, handlerThread2);
        this.f22169d = z10;
        this.f22171f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static String m27129s(int i10) {
        return m27131u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static String m27130t(int i10) {
        return m27131u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    /* renamed from: u */
    private static String m27131u(int i10, String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            str2 = "Audio";
        } else if (i10 == 2) {
            str2 = "Video";
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            str2 = ")";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m27132v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f22167b.m27240h(this.f22166a);
        C11166o0.m34831a("configureCodec");
        this.f22166a.configure(mediaFormat, surface, mediaCrypto, i10);
        C11166o0.m34833c();
        this.f22168c.m27221q();
        C11166o0.m34831a("startCodec");
        this.f22166a.start();
        C11166o0.m34833c();
        this.f22171f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m27133w(InterfaceC9191l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.mo27260a(this, j10, j11);
    }

    /* renamed from: x */
    private void m27134x() {
        if (this.f22169d) {
            try {
                this.f22168c.m27222r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: a */
    public MediaFormat mo27135a() {
        return this.f22167b.m27239g();
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: b */
    public void mo27136b(int i10) {
        m27134x();
        this.f22166a.setVideoScalingMode(i10);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: c */
    public ByteBuffer mo27137c(int i10) {
        return this.f22166a.getInputBuffer(i10);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: d */
    public void mo27138d(Surface surface) {
        m27134x();
        this.f22166a.setOutputSurface(surface);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: e */
    public void mo27139e(int i10, int i11, int i12, long j10, int i13) {
        this.f22168c.m27218m(i10, i11, i12, j10, i13);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: f */
    public void mo27140f(int i10, int i11, C12078c c12078c, long j10, int i12) {
        this.f22168c.m27219n(i10, i11, c12078c, j10, i12);
    }

    @Override // p197k7.InterfaceC9191l
    public void flush() {
        this.f22168c.m27216i();
        this.f22166a.flush();
        this.f22167b.m27238e();
        this.f22166a.start();
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: g */
    public boolean mo27141g() {
        return false;
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: h */
    public void mo27142h(final InterfaceC9191l.c cVar, Handler handler) {
        m27134x();
        this.f22166a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: k7.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                C9177b.this.m27133w(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: i */
    public void mo27143i(Bundle bundle) {
        m27134x();
        this.f22166a.setParameters(bundle);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: j */
    public void mo27144j(int i10, long j10) {
        this.f22166a.releaseOutputBuffer(i10, j10);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: k */
    public int mo27145k() {
        this.f22168c.m27217l();
        return this.f22167b.m27236c();
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: l */
    public int mo27146l(MediaCodec.BufferInfo bufferInfo) {
        this.f22168c.m27217l();
        return this.f22167b.m27237d(bufferInfo);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: m */
    public void mo27147m(int i10, boolean z10) {
        this.f22166a.releaseOutputBuffer(i10, z10);
    }

    @Override // p197k7.InterfaceC9191l
    /* renamed from: n */
    public ByteBuffer mo27148n(int i10) {
        return this.f22166a.getOutputBuffer(i10);
    }

    @Override // p197k7.InterfaceC9191l
    public void release() {
        try {
            if (this.f22171f == 1) {
                this.f22168c.m27220p();
                this.f22167b.m27241o();
            }
            this.f22171f = 2;
        } finally {
            if (!this.f22170e) {
                this.f22166a.release();
                this.f22170e = true;
            }
        }
    }
}
