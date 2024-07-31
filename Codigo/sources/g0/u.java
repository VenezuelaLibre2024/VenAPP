package g0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import androidx.concurrent.futures.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import w.i1;
import w.x0;

/* loaded from: classes.dex */
public class u implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    private final a0 f15663a;

    /* renamed from: b, reason: collision with root package name */
    final HandlerThread f15664b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f15665c;

    /* renamed from: d, reason: collision with root package name */
    final Handler f15666d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f15667e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f15668f;

    /* renamed from: r, reason: collision with root package name */
    private final float[] f15669r;

    /* renamed from: s, reason: collision with root package name */
    final Map<w.x0, Surface> f15670s;

    /* renamed from: t, reason: collision with root package name */
    private int f15671t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f15672u;

    /* renamed from: v, reason: collision with root package name */
    private final List<b> f15673v;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static m.a<w.y, r0> f15674a = new m.a() { // from class: g0.t
            @Override // m.a
            public final Object apply(Object obj) {
                return new u((w.y) obj);
            }
        };

        public static r0 a(w.y yVar) {
            return f15674a.apply(yVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b {
        static g0.a d(int i10, int i11, c.a<Void> aVar) {
            return new g0.a(i10, i11, aVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract c.a<Void> a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(w.y yVar) {
        this(yVar, d0.f15569a);
    }

    u(w.y yVar, d0 d0Var) {
        this.f15667e = new AtomicBoolean(false);
        this.f15668f = new float[16];
        this.f15669r = new float[16];
        this.f15670s = new LinkedHashMap();
        this.f15671t = 0;
        this.f15672u = false;
        this.f15673v = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f15664b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f15666d = handler;
        this.f15665c = z.a.e(handler);
        this.f15663a = new a0();
        try {
            u(yVar, d0Var);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(i1 i1Var) {
        this.f15671t++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(this.f15663a.v());
        surfaceTexture.setDefaultBufferSize(i1Var.k().getWidth(), i1Var.k().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        i1Var.v(surface, this.f15665c, new androidx.core.util.a() { // from class: g0.h
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                u.this.z(surfaceTexture, surface, (i1.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(this, this.f15666d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(w.x0 x0Var, x0.a aVar) {
        x0Var.close();
        Surface remove = this.f15670s.remove(x0Var);
        if (remove != null) {
            this.f15663a.J(remove);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C(final w.x0 x0Var) {
        Surface A0 = x0Var.A0(this.f15665c, new androidx.core.util.a() { // from class: g0.g
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                u.this.B(x0Var, (x0.a) obj);
            }
        });
        this.f15663a.C(A0);
        this.f15670s.put(x0Var, A0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f15672u = true;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(b bVar) {
        this.f15673v.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F(c.a aVar) {
        aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object G(int i10, int i11, final c.a aVar) {
        final g0.a d10 = b.d(i10, i11, aVar);
        r(new Runnable() { // from class: g0.i
            @Override // java.lang.Runnable
            public final void run() {
                u.this.E(d10);
            }
        }, new Runnable() { // from class: g0.j
            @Override // java.lang.Runnable
            public final void run() {
                u.F(c.a.this);
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    private void H(ck.q<Surface, Size, float[]> qVar) {
        if (this.f15673v.isEmpty()) {
            return;
        }
        if (qVar == null) {
            s(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f15673v.iterator();
                int i10 = -1;
                int i11 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (i10 != next.c() || bitmap == null) {
                        i10 = next.c();
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = t(qVar.b(), qVar.c(), i10);
                        i11 = -1;
                    }
                    if (i11 != next.b()) {
                        byteArrayOutputStream.reset();
                        i11 = next.b();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i11, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                    }
                    Surface a10 = qVar.a();
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.p(a10, bArr);
                    next.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            s(e10);
        }
    }

    private void p() {
        if (this.f15672u && this.f15671t == 0) {
            Iterator<w.x0> it = this.f15670s.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it2 = this.f15673v.iterator();
            while (it2.hasNext()) {
                it2.next().a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f15670s.clear();
            this.f15663a.D();
            this.f15664b.quit();
        }
    }

    private void q(Runnable runnable) {
        r(runnable, new Runnable() { // from class: g0.s
            @Override // java.lang.Runnable
            public final void run() {
                u.v();
            }
        });
    }

    private void r(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f15665c.execute(new Runnable() { // from class: g0.q
                @Override // java.lang.Runnable
                public final void run() {
                    u.this.w(runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            w.o0.l("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void s(Throwable th2) {
        Iterator<b> it = this.f15673v.iterator();
        while (it.hasNext()) {
            it.next().a().f(th2);
        }
        this.f15673v.clear();
    }

    private Bitmap t(Size size, float[] fArr, int i10) {
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        androidx.camera.core.impl.utils.o.d(fArr2, 0.5f);
        androidx.camera.core.impl.utils.o.c(fArr2, i10, 0.5f, 0.5f);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        return this.f15663a.H(androidx.camera.core.impl.utils.r.k(size, i10), fArr2);
    }

    private void u(final w.y yVar, final d0 d0Var) {
        try {
            androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: g0.o
                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object y10;
                    y10 = u.this.y(yVar, d0Var, aVar);
                    return y10;
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void v() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(Runnable runnable, Runnable runnable2) {
        if (this.f15672u) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(w.y yVar, d0 d0Var, c.a aVar) {
        try {
            this.f15663a.w(yVar, d0Var);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object y(final w.y yVar, final d0 d0Var, final c.a aVar) {
        q(new Runnable() { // from class: g0.p
            @Override // java.lang.Runnable
            public final void run() {
                u.this.x(yVar, d0Var, aVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(SurfaceTexture surfaceTexture, Surface surface, i1.g gVar) {
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        this.f15671t--;
        p();
    }

    @Override // w.y0
    public void a(final w.x0 x0Var) {
        if (this.f15667e.get()) {
            x0Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: g0.f
            @Override // java.lang.Runnable
            public final void run() {
                u.this.C(x0Var);
            }
        };
        Objects.requireNonNull(x0Var);
        r(runnable, new Runnable() { // from class: g0.k
            @Override // java.lang.Runnable
            public final void run() {
                w.x0.this.close();
            }
        });
    }

    @Override // w.y0
    public void b(final i1 i1Var) {
        if (this.f15667e.get()) {
            i1Var.y();
            return;
        }
        Runnable runnable = new Runnable() { // from class: g0.l
            @Override // java.lang.Runnable
            public final void run() {
                u.this.A(i1Var);
            }
        };
        Objects.requireNonNull(i1Var);
        r(runnable, new Runnable() { // from class: g0.m
            @Override // java.lang.Runnable
            public final void run() {
                i1.this.y();
            }
        });
    }

    @Override // g0.r0
    public com.google.common.util.concurrent.f<Void> c(final int i10, final int i11) {
        return a0.f.j(androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: g0.r
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object G;
                G = u.this.G(i10, i11, aVar);
                return G;
            }
        }));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f15667e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f15668f);
        ck.q<Surface, Size, float[]> qVar = null;
        for (Map.Entry<w.x0, Surface> entry : this.f15670s.entrySet()) {
            Surface value = entry.getValue();
            w.x0 key = entry.getKey();
            key.y0(this.f15669r, this.f15668f);
            if (key.getFormat() == 34) {
                try {
                    this.f15663a.G(surfaceTexture.getTimestamp(), this.f15669r, value);
                } catch (RuntimeException e10) {
                    w.o0.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                androidx.core.util.h.n(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                androidx.core.util.h.n(qVar == null, "Only one JPEG output is supported.");
                qVar = new ck.q<>(value, key.p(), (float[]) this.f15669r.clone());
            }
        }
        try {
            H(qVar);
        } catch (RuntimeException e11) {
            s(e11);
        }
    }

    @Override // g0.r0
    public void release() {
        if (this.f15667e.getAndSet(true)) {
            return;
        }
        q(new Runnable() { // from class: g0.n
            @Override // java.lang.Runnable
            public final void run() {
                u.this.D();
            }
        });
    }
}
