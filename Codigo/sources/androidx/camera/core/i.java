package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.f;
import androidx.camera.core.impl.g1;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import w.m0;
import w.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i implements g1.a {

    /* renamed from: a, reason: collision with root package name */
    private f.a f2417a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f2418b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f2419c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f2421e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f2422f;

    /* renamed from: g, reason: collision with root package name */
    private Executor f2423g;

    /* renamed from: h, reason: collision with root package name */
    private t f2424h;

    /* renamed from: i, reason: collision with root package name */
    private ImageWriter f2425i;

    /* renamed from: n, reason: collision with root package name */
    ByteBuffer f2430n;

    /* renamed from: o, reason: collision with root package name */
    ByteBuffer f2431o;

    /* renamed from: p, reason: collision with root package name */
    ByteBuffer f2432p;

    /* renamed from: q, reason: collision with root package name */
    ByteBuffer f2433q;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f2420d = 1;

    /* renamed from: j, reason: collision with root package name */
    private Rect f2426j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private Rect f2427k = new Rect();

    /* renamed from: l, reason: collision with root package name */
    private Matrix f2428l = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private Matrix f2429m = new Matrix();

    /* renamed from: r, reason: collision with root package name */
    private final Object f2434r = new Object();

    /* renamed from: s, reason: collision with root package name */
    protected boolean f2435s = true;

    private void h(o oVar) {
        if (this.f2420d != 1) {
            if (this.f2420d == 2 && this.f2430n == null) {
                this.f2430n = ByteBuffer.allocateDirect(oVar.getWidth() * oVar.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f2431o == null) {
            this.f2431o = ByteBuffer.allocateDirect(oVar.getWidth() * oVar.getHeight());
        }
        this.f2431o.position(0);
        if (this.f2432p == null) {
            this.f2432p = ByteBuffer.allocateDirect((oVar.getWidth() * oVar.getHeight()) / 4);
        }
        this.f2432p.position(0);
        if (this.f2433q == null) {
            this.f2433q = ByteBuffer.allocateDirect((oVar.getWidth() * oVar.getHeight()) / 4);
        }
        this.f2433q.position(0);
    }

    private static t i(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new t(p.a(i15, i10, i13, i14));
    }

    static Matrix k(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), androidx.camera.core.impl.utils.r.f2659a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(androidx.camera.core.impl.utils.r.a(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(o oVar, Matrix matrix, o oVar2, Rect rect, f.a aVar, c.a aVar2) {
        if (!this.f2435s) {
            aVar2.f(new androidx.core.os.k("ImageAnalysis is detached"));
            return;
        }
        u uVar = new u(oVar2, m0.e(oVar.e1().b(), oVar.e1().c(), this.f2421e ? 0 : this.f2418b, matrix));
        if (!rect.isEmpty()) {
            uVar.Z(rect);
        }
        aVar.b(uVar);
        aVar2.c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Executor executor, final o oVar, final Matrix matrix, final o oVar2, final Rect rect, final f.a aVar, final c.a aVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.h
            @Override // java.lang.Runnable
            public final void run() {
                i.this.m(oVar, matrix, oVar2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    private void p(int i10, int i11, int i12, int i13) {
        Matrix k10 = k(i10, i11, i12, i13, this.f2418b);
        this.f2427k = l(this.f2426j, k10);
        this.f2429m.setConcat(this.f2428l, k10);
    }

    private void q(o oVar, int i10) {
        t tVar = this.f2424h;
        if (tVar == null) {
            return;
        }
        tVar.l();
        this.f2424h = i(oVar.getWidth(), oVar.getHeight(), i10, this.f2424h.c(), this.f2424h.e());
        if (this.f2420d == 1) {
            ImageWriter imageWriter = this.f2425i;
            if (imageWriter != null) {
                c0.a.a(imageWriter);
            }
            this.f2425i = c0.a.c(this.f2424h.getSurface(), this.f2424h.e());
        }
    }

    @Override // androidx.camera.core.impl.g1.a
    public void a(g1 g1Var) {
        try {
            o d10 = d(g1Var);
            if (d10 != null) {
                o(d10);
            }
        } catch (IllegalStateException e10) {
            o0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    abstract o d(g1 g1Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.f<java.lang.Void> e(final androidx.camera.core.o r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.i.e(androidx.camera.core.o):com.google.common.util.concurrent.f");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.f2435s = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void j() {
        this.f2435s = false;
        g();
    }

    abstract void o(o oVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(Executor executor, f.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.f2434r) {
            this.f2417a = aVar;
            this.f2423g = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f2422f = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(int i10) {
        this.f2420d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(boolean z10) {
        this.f2421e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void v(t tVar) {
        synchronized (this.f2434r) {
            this.f2424h = tVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(int i10) {
        this.f2418b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(Matrix matrix) {
        synchronized (this.f2434r) {
            this.f2428l = matrix;
            this.f2429m = new Matrix(this.f2428l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(Rect rect) {
        synchronized (this.f2434r) {
            this.f2426j = rect;
            this.f2427k = new Rect(this.f2426j);
        }
    }
}
