package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import w.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q0 implements w.x0 {
    private final com.google.common.util.concurrent.f<Void> A;
    private c.a<Void> B;
    private androidx.camera.core.impl.c0 C;
    private Matrix D;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f15642b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15643c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15644d;

    /* renamed from: e, reason: collision with root package name */
    private final Size f15645e;

    /* renamed from: f, reason: collision with root package name */
    private final Size f15646f;

    /* renamed from: r, reason: collision with root package name */
    private final Rect f15647r;

    /* renamed from: s, reason: collision with root package name */
    private final int f15648s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f15649t;

    /* renamed from: w, reason: collision with root package name */
    private androidx.core.util.a<x0.a> f15652w;

    /* renamed from: x, reason: collision with root package name */
    private Executor f15653x;

    /* renamed from: a, reason: collision with root package name */
    private final Object f15641a = new Object();

    /* renamed from: u, reason: collision with root package name */
    private final float[] f15650u = new float[16];

    /* renamed from: v, reason: collision with root package name */
    private final float[] f15651v = new float[16];

    /* renamed from: y, reason: collision with root package name */
    private boolean f15654y = false;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15655z = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(Surface surface, int i10, int i11, Size size, Size size2, Rect rect, int i12, boolean z10, androidx.camera.core.impl.c0 c0Var, Matrix matrix) {
        this.f15642b = surface;
        this.f15643c = i10;
        this.f15644d = i11;
        this.f15645e = size;
        this.f15646f = size2;
        this.f15647r = new Rect(rect);
        this.f15649t = z10;
        this.f15648s = i12;
        this.C = c0Var;
        this.D = matrix;
        e();
        this.A = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: g0.o0
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object i13;
                i13 = q0.this.i(aVar);
                return i13;
            }
        });
    }

    private void e() {
        android.opengl.Matrix.setIdentityM(this.f15650u, 0);
        androidx.camera.core.impl.utils.o.d(this.f15650u, 0.5f);
        androidx.camera.core.impl.utils.o.c(this.f15650u, this.f15648s, 0.5f, 0.5f);
        if (this.f15649t) {
            android.opengl.Matrix.translateM(this.f15650u, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(this.f15650u, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix c10 = androidx.camera.core.impl.utils.r.c(androidx.camera.core.impl.utils.r.n(this.f15646f), androidx.camera.core.impl.utils.r.n(androidx.camera.core.impl.utils.r.k(this.f15646f, this.f15648s)), this.f15648s, this.f15649t);
        RectF rectF = new RectF(this.f15647r);
        c10.mapRect(rectF);
        float width = rectF.left / r0.getWidth();
        float height = ((r0.getHeight() - rectF.height()) - rectF.top) / r0.getHeight();
        float width2 = rectF.width() / r0.getWidth();
        float height2 = rectF.height() / r0.getHeight();
        android.opengl.Matrix.translateM(this.f15650u, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(this.f15650u, 0, width2, height2, 1.0f);
        f();
        float[] fArr = this.f15650u;
        android.opengl.Matrix.multiplyMM(fArr, 0, this.f15651v, 0, fArr, 0);
    }

    private void f() {
        android.opengl.Matrix.setIdentityM(this.f15651v, 0);
        androidx.camera.core.impl.utils.o.d(this.f15651v, 0.5f);
        androidx.camera.core.impl.c0 c0Var = this.C;
        if (c0Var != null) {
            androidx.core.util.h.n(c0Var.m(), "Camera has no transform.");
            androidx.camera.core.impl.utils.o.c(this.f15651v, this.C.b().a(), 0.5f, 0.5f);
            if (this.C.j()) {
                android.opengl.Matrix.translateM(this.f15651v, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(this.f15651v, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        float[] fArr = this.f15651v;
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object i(c.a aVar) {
        this.B = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(AtomicReference atomicReference) {
        ((androidx.core.util.a) atomicReference.get()).accept(x0.a.c(0, this));
    }

    @Override // w.x0
    public Surface A0(Executor executor, androidx.core.util.a<x0.a> aVar) {
        boolean z10;
        synchronized (this.f15641a) {
            this.f15653x = executor;
            this.f15652w = aVar;
            z10 = this.f15654y;
        }
        if (z10) {
            l();
        }
        return this.f15642b;
    }

    @Override // w.x0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f15641a) {
            if (!this.f15655z) {
                this.f15655z = true;
            }
        }
        this.B.c(null);
    }

    public com.google.common.util.concurrent.f<Void> g() {
        return this.A;
    }

    @Override // w.x0
    public int getFormat() {
        return this.f15644d;
    }

    public void l() {
        Executor executor;
        androidx.core.util.a<x0.a> aVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f15641a) {
            if (this.f15653x != null && (aVar = this.f15652w) != null) {
                if (!this.f15655z) {
                    atomicReference.set(aVar);
                    executor = this.f15653x;
                    this.f15654y = false;
                }
                executor = null;
            }
            this.f15654y = true;
            executor = null;
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: g0.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        q0.this.j(atomicReference);
                    }
                });
            } catch (RejectedExecutionException e10) {
                w.o0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }

    @Override // w.x0
    public Size p() {
        return this.f15645e;
    }

    @Override // w.x0
    public void y0(float[] fArr, float[] fArr2) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, this.f15650u, 0);
    }
}
