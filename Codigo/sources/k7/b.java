package k7;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import k7.b;
import k7.l;
import t8.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f20384a;

    /* renamed from: b, reason: collision with root package name */
    private final g f20385b;

    /* renamed from: c, reason: collision with root package name */
    private final e f20386c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f20387d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20388e;

    /* renamed from: f, reason: collision with root package name */
    private int f20389f;

    /* renamed from: k7.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0321b implements l.b {

        /* renamed from: a, reason: collision with root package name */
        private final eb.v<HandlerThread> f20390a;

        /* renamed from: b, reason: collision with root package name */
        private final eb.v<HandlerThread> f20391b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f20392c;

        public C0321b(final int i10, boolean z10) {
            this(new eb.v() { // from class: k7.c
                @Override // eb.v
                public final Object get() {
                    HandlerThread e10;
                    e10 = b.C0321b.e(i10);
                    return e10;
                }
            }, new eb.v() { // from class: k7.d
                @Override // eb.v
                public final Object get() {
                    HandlerThread f10;
                    f10 = b.C0321b.f(i10);
                    return f10;
                }
            }, z10);
        }

        C0321b(eb.v<HandlerThread> vVar, eb.v<HandlerThread> vVar2, boolean z10) {
            this.f20390a = vVar;
            this.f20391b = vVar2;
            this.f20392c = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread e(int i10) {
            return new HandlerThread(b.s(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(b.t(i10));
        }

        @Override // k7.l.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(l.a aVar) {
            MediaCodec mediaCodec;
            String str = aVar.f20451a.f20459a;
            b bVar = null;
            try {
                o0.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    b bVar2 = new b(mediaCodec, this.f20390a.get(), this.f20391b.get(), this.f20392c);
                    try {
                        o0.c();
                        bVar2.v(aVar.f20452b, aVar.f20454d, aVar.f20455e, aVar.f20456f);
                        return bVar2;
                    } catch (Exception e10) {
                        e = e10;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.release();
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

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f20384a = mediaCodec;
        this.f20385b = new g(handlerThread);
        this.f20386c = new e(mediaCodec, handlerThread2);
        this.f20387d = z10;
        this.f20389f = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(int i10) {
        return u(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String t(int i10) {
        return u(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String u(int i10, String str) {
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
    public void v(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f20385b.h(this.f20384a);
        o0.a("configureCodec");
        this.f20384a.configure(mediaFormat, surface, mediaCrypto, i10);
        o0.c();
        this.f20386c.q();
        o0.a("startCodec");
        this.f20384a.start();
        o0.c();
        this.f20389f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    private void x() {
        if (this.f20387d) {
            try {
                this.f20386c.r();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // k7.l
    public MediaFormat a() {
        return this.f20385b.g();
    }

    @Override // k7.l
    public void b(int i10) {
        x();
        this.f20384a.setVideoScalingMode(i10);
    }

    @Override // k7.l
    public ByteBuffer c(int i10) {
        return this.f20384a.getInputBuffer(i10);
    }

    @Override // k7.l
    public void d(Surface surface) {
        x();
        this.f20384a.setOutputSurface(surface);
    }

    @Override // k7.l
    public void e(int i10, int i11, int i12, long j10, int i13) {
        this.f20386c.m(i10, i11, i12, j10, i13);
    }

    @Override // k7.l
    public void f(int i10, int i11, w6.c cVar, long j10, int i12) {
        this.f20386c.n(i10, i11, cVar, j10, i12);
    }

    @Override // k7.l
    public void flush() {
        this.f20386c.i();
        this.f20384a.flush();
        this.f20385b.e();
        this.f20384a.start();
    }

    @Override // k7.l
    public boolean g() {
        return false;
    }

    @Override // k7.l
    public void h(final l.c cVar, Handler handler) {
        x();
        this.f20384a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: k7.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.this.w(cVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // k7.l
    public void i(Bundle bundle) {
        x();
        this.f20384a.setParameters(bundle);
    }

    @Override // k7.l
    public void j(int i10, long j10) {
        this.f20384a.releaseOutputBuffer(i10, j10);
    }

    @Override // k7.l
    public int k() {
        this.f20386c.l();
        return this.f20385b.c();
    }

    @Override // k7.l
    public int l(MediaCodec.BufferInfo bufferInfo) {
        this.f20386c.l();
        return this.f20385b.d(bufferInfo);
    }

    @Override // k7.l
    public void m(int i10, boolean z10) {
        this.f20384a.releaseOutputBuffer(i10, z10);
    }

    @Override // k7.l
    public ByteBuffer n(int i10) {
        return this.f20384a.getOutputBuffer(i10);
    }

    @Override // k7.l
    public void release() {
        try {
            if (this.f20389f == 1) {
                this.f20386c.p();
                this.f20385b.o();
            }
            this.f20389f = 2;
        } finally {
            if (!this.f20388e) {
                this.f20384a.release();
                this.f20388e = true;
            }
        }
    }
}
