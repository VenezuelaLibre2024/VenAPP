package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.C0593f;
import androidx.camera.core.impl.InterfaceC0623g1;
import androidx.camera.core.impl.utils.C0689r;
import androidx.concurrent.futures.C0742c;
import androidx.core.os.C0952k;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import p032c0.C1826a;
import p407w.AbstractC12025m0;
import p407w.C12029o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.i */
/* loaded from: classes.dex */
public abstract class AbstractC0596i implements InterfaceC0623g1.a {

    /* renamed from: a */
    private C0593f.a f2738a;

    /* renamed from: b */
    private volatile int f2739b;

    /* renamed from: c */
    private volatile int f2740c;

    /* renamed from: e */
    private volatile boolean f2742e;

    /* renamed from: f */
    private volatile boolean f2743f;

    /* renamed from: g */
    private Executor f2744g;

    /* renamed from: h */
    private C0715t f2745h;

    /* renamed from: i */
    private ImageWriter f2746i;

    /* renamed from: n */
    ByteBuffer f2751n;

    /* renamed from: o */
    ByteBuffer f2752o;

    /* renamed from: p */
    ByteBuffer f2753p;

    /* renamed from: q */
    ByteBuffer f2754q;

    /* renamed from: d */
    private volatile int f2741d = 1;

    /* renamed from: j */
    private Rect f2747j = new Rect();

    /* renamed from: k */
    private Rect f2748k = new Rect();

    /* renamed from: l */
    private Matrix f2749l = new Matrix();

    /* renamed from: m */
    private Matrix f2750m = new Matrix();

    /* renamed from: r */
    private final Object f2755r = new Object();

    /* renamed from: s */
    protected boolean f2756s = true;

    /* renamed from: h */
    private void m2949h(InterfaceC0710o interfaceC0710o) {
        if (this.f2741d != 1) {
            if (this.f2741d == 2 && this.f2751n == null) {
                this.f2751n = ByteBuffer.allocateDirect(interfaceC0710o.getWidth() * interfaceC0710o.getHeight() * 4);
                return;
            }
            return;
        }
        if (this.f2752o == null) {
            this.f2752o = ByteBuffer.allocateDirect(interfaceC0710o.getWidth() * interfaceC0710o.getHeight());
        }
        this.f2752o.position(0);
        if (this.f2753p == null) {
            this.f2753p = ByteBuffer.allocateDirect((interfaceC0710o.getWidth() * interfaceC0710o.getHeight()) / 4);
        }
        this.f2753p.position(0);
        if (this.f2754q == null) {
            this.f2754q = ByteBuffer.allocateDirect((interfaceC0710o.getWidth() * interfaceC0710o.getHeight()) / 4);
        }
        this.f2754q.position(0);
    }

    /* renamed from: i */
    private static C0715t m2950i(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new C0715t(C0711p.m3485a(i15, i10, i13, i14));
    }

    /* renamed from: k */
    static Matrix m2951k(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), C0689r.f3003a, Matrix.ScaleToFit.FILL);
            matrix.postRotate(i14);
            matrix.postConcat(C0689r.m3343a(new RectF(0.0f, 0.0f, i12, i13)));
        }
        return matrix;
    }

    /* renamed from: l */
    static Rect m2952l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m2953m(InterfaceC0710o interfaceC0710o, Matrix matrix, InterfaceC0710o interfaceC0710o2, Rect rect, C0593f.a aVar, C0742c.a aVar2) {
        if (!this.f2756s) {
            aVar2.m3758f(new C0952k("ImageAnalysis is detached"));
            return;
        }
        C0716u c0716u = new C0716u(interfaceC0710o2, AbstractC12025m0.m38636e(interfaceC0710o.mo2883e1().mo8852b(), interfaceC0710o.mo2883e1().mo8853c(), this.f2742e ? 0 : this.f2739b, matrix));
        if (!rect.isEmpty()) {
            c0716u.mo2882Z(rect);
        }
        aVar.mo2930b(c0716u);
        aVar2.m3756c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m2954n(Executor executor, final InterfaceC0710o interfaceC0710o, final Matrix matrix, final InterfaceC0710o interfaceC0710o2, final Rect rect, final C0593f.a aVar, final C0742c.a aVar2) {
        executor.execute(new Runnable() { // from class: androidx.camera.core.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0596i.this.m2953m(interfaceC0710o, matrix, interfaceC0710o2, rect, aVar, aVar2);
            }
        });
        return "analyzeImage";
    }

    /* renamed from: p */
    private void m2955p(int i10, int i11, int i12, int i13) {
        Matrix m2951k = m2951k(i10, i11, i12, i13, this.f2739b);
        this.f2748k = m2952l(this.f2747j, m2951k);
        this.f2750m.setConcat(this.f2749l, m2951k);
    }

    /* renamed from: q */
    private void m2956q(InterfaceC0710o interfaceC0710o, int i10) {
        C0715t c0715t = this.f2745h;
        if (c0715t == null) {
            return;
        }
        c0715t.m3534l();
        this.f2745h = m2950i(interfaceC0710o.getWidth(), interfaceC0710o.getHeight(), i10, this.f2745h.mo2895c(), this.f2745h.mo2897e());
        if (this.f2741d == 1) {
            ImageWriter imageWriter = this.f2746i;
            if (imageWriter != null) {
                C1826a.m9828a(imageWriter);
            }
            this.f2746i = C1826a.m9830c(this.f2745h.getSurface(), this.f2745h.mo2897e());
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0623g1.a
    /* renamed from: a */
    public void mo2863a(InterfaceC0623g1 interfaceC0623g1) {
        try {
            InterfaceC0710o mo2957d = mo2957d(interfaceC0623g1);
            if (mo2957d != null) {
                mo2962o(mo2957d);
            }
        } catch (IllegalStateException e10) {
            C12029o0.m38641d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    /* renamed from: d */
    abstract InterfaceC0710o mo2957d(InterfaceC0623g1 interfaceC0623g1);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0070  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.InterfaceFutureC5920f<java.lang.Void> m2958e(final androidx.camera.core.InterfaceC0710o r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.AbstractC0596i.m2958e(androidx.camera.core.o):com.google.common.util.concurrent.f");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m2959f() {
        this.f2756s = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo2960g();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m2961j() {
        this.f2756s = false;
        mo2960g();
    }

    /* renamed from: o */
    abstract void mo2962o(InterfaceC0710o interfaceC0710o);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m2963r(Executor executor, C0593f.a aVar) {
        if (aVar == null) {
            mo2960g();
        }
        synchronized (this.f2755r) {
            this.f2738a = aVar;
            this.f2744g = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m2964s(boolean z10) {
        this.f2743f = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m2965t(int i10) {
        this.f2741d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m2966u(boolean z10) {
        this.f2742e = z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m2967v(C0715t c0715t) {
        synchronized (this.f2755r) {
            this.f2745h = c0715t;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m2968w(int i10) {
        this.f2739b = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m2969x(Matrix matrix) {
        synchronized (this.f2755r) {
            this.f2749l = matrix;
            this.f2750m = new Matrix(this.f2749l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m2970y(Rect rect) {
        synchronized (this.f2755r) {
            this.f2747j = rect;
            this.f2748k = new Rect(this.f2747j);
        }
    }
}
