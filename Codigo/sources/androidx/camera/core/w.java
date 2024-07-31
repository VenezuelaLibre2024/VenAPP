package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.y1;
import g0.z0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import w.u0;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: d, reason: collision with root package name */
    private k2<?> f2766d;

    /* renamed from: e, reason: collision with root package name */
    private k2<?> f2767e;

    /* renamed from: f, reason: collision with root package name */
    private k2<?> f2768f;

    /* renamed from: g, reason: collision with root package name */
    private b2 f2769g;

    /* renamed from: h, reason: collision with root package name */
    private k2<?> f2770h;

    /* renamed from: i, reason: collision with root package name */
    private Rect f2771i;

    /* renamed from: k, reason: collision with root package name */
    private c0 f2773k;

    /* renamed from: l, reason: collision with root package name */
    private w.k f2774l;

    /* renamed from: a, reason: collision with root package name */
    private final Set<d> f2763a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final Object f2764b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private c f2765c = c.INACTIVE;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f2772j = new Matrix();

    /* renamed from: m, reason: collision with root package name */
    private y1 f2775m = y1.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2776a;

        static {
            int[] iArr = new int[c.values().length];
            f2776a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2776a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();

        void b(w.o oVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum c {
        ACTIVE,
        INACTIVE
    }

    /* loaded from: classes.dex */
    public interface d {
        void c(w wVar);

        void k(w wVar);

        void n(w wVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public w(k2<?> k2Var) {
        this.f2767e = k2Var;
        this.f2768f = k2Var;
    }

    private void N(d dVar) {
        this.f2763a.remove(dVar);
    }

    private void a(d dVar) {
        this.f2763a.add(dVar);
    }

    public k2<?> A(b0 b0Var, k2<?> k2Var, k2<?> k2Var2) {
        m1 a02;
        if (k2Var2 != null) {
            a02 = m1.b0(k2Var2);
            a02.c0(b0.j.C);
        } else {
            a02 = m1.a0();
        }
        if (this.f2767e.b(f1.f2462h) || this.f2767e.b(f1.f2466l)) {
            n0.a<h0.c> aVar = f1.f2470p;
            if (a02.b(aVar)) {
                a02.c0(aVar);
            }
        }
        k2<?> k2Var3 = this.f2767e;
        n0.a<h0.c> aVar2 = f1.f2470p;
        if (k2Var3.b(aVar2)) {
            n0.a<Size> aVar3 = f1.f2468n;
            if (a02.b(aVar3) && ((h0.c) this.f2767e.a(aVar2)).d() != null) {
                a02.c0(aVar3);
            }
        }
        Iterator<n0.a<?>> it = this.f2767e.e().iterator();
        while (it.hasNext()) {
            n0.D(a02, a02, this.f2767e, it.next());
        }
        if (k2Var != null) {
            for (n0.a<?> aVar4 : k2Var.e()) {
                if (!aVar4.c().equals(b0.j.C.c())) {
                    n0.D(a02, a02, k2Var, aVar4);
                }
            }
        }
        if (a02.b(f1.f2466l)) {
            n0.a<Integer> aVar5 = f1.f2462h;
            if (a02.b(aVar5)) {
                a02.c0(aVar5);
            }
        }
        n0.a<h0.c> aVar6 = f1.f2470p;
        if (a02.b(aVar6) && ((h0.c) a02.a(aVar6)).a() != 0) {
            a02.r(k2.f2533y, Boolean.TRUE);
        }
        return H(b0Var, v(a02));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B() {
        this.f2765c = c.ACTIVE;
        E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        this.f2765c = c.INACTIVE;
        E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D() {
        Iterator<d> it = this.f2763a.iterator();
        while (it.hasNext()) {
            it.next().k(this);
        }
    }

    public final void E() {
        int i10 = a.f2776a[this.f2765c.ordinal()];
        if (i10 == 1) {
            Iterator<d> it = this.f2763a.iterator();
            while (it.hasNext()) {
                it.next().n(this);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            Iterator<d> it2 = this.f2763a.iterator();
            while (it2.hasNext()) {
                it2.next().c(this);
            }
        }
    }

    public void F() {
    }

    public void G() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    protected k2<?> H(b0 b0Var, k2.a<?, ?, ?> aVar) {
        return aVar.b();
    }

    public void I() {
    }

    public void J() {
    }

    protected b2 K(n0 n0Var) {
        b2 b2Var = this.f2769g;
        if (b2Var != null) {
            return b2Var.f().d(n0Var).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    protected b2 L(b2 b2Var) {
        return b2Var;
    }

    public void M() {
    }

    public void O(w.k kVar) {
        androidx.core.util.h.a(kVar == null || y(kVar.f()));
        this.f2774l = kVar;
    }

    public void P(Matrix matrix) {
        this.f2772j = new Matrix(matrix);
    }

    public void Q(Rect rect) {
        this.f2771i = rect;
    }

    public final void R(c0 c0Var) {
        M();
        b S = this.f2768f.S(null);
        if (S != null) {
            S.a();
        }
        synchronized (this.f2764b) {
            androidx.core.util.h.a(c0Var == this.f2773k);
            N(this.f2773k);
            this.f2773k = null;
        }
        this.f2769g = null;
        this.f2771i = null;
        this.f2768f = this.f2767e;
        this.f2766d = null;
        this.f2770h = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(y1 y1Var) {
        this.f2775m = y1Var;
        for (r0 r0Var : y1Var.k()) {
            if (r0Var.g() == null) {
                r0Var.s(getClass());
            }
        }
    }

    public void T(b2 b2Var) {
        this.f2769g = L(b2Var);
    }

    public void U(n0 n0Var) {
        this.f2769g = K(n0Var);
    }

    public final void b(c0 c0Var, k2<?> k2Var, k2<?> k2Var2) {
        synchronized (this.f2764b) {
            this.f2773k = c0Var;
            a(c0Var);
        }
        this.f2766d = k2Var;
        this.f2770h = k2Var2;
        k2<?> A = A(c0Var.i(), this.f2766d, this.f2770h);
        this.f2768f = A;
        b S = A.S(null);
        if (S != null) {
            S.b(c0Var.i());
        }
        F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c() {
        return ((f1) this.f2768f).t(-1);
    }

    public b2 d() {
        return this.f2769g;
    }

    public Size e() {
        b2 b2Var = this.f2769g;
        if (b2Var != null) {
            return b2Var.e();
        }
        return null;
    }

    public c0 f() {
        c0 c0Var;
        synchronized (this.f2764b) {
            c0Var = this.f2773k;
        }
        return c0Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public y g() {
        synchronized (this.f2764b) {
            c0 c0Var = this.f2773k;
            if (c0Var == null) {
                return y.f2671a;
            }
            return c0Var.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String h() {
        return ((c0) androidx.core.util.h.l(f(), "No camera attached to use case: " + this)).i().b();
    }

    public k2<?> i() {
        return this.f2768f;
    }

    public abstract k2<?> j(boolean z10, l2 l2Var);

    public w.k k() {
        return this.f2774l;
    }

    public int l() {
        return this.f2768f.n();
    }

    protected int m() {
        return ((f1) this.f2768f).U(0);
    }

    public String n() {
        String u10 = this.f2768f.u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(u10);
        return u10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int o(c0 c0Var) {
        return p(c0Var, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int p(c0 c0Var, boolean z10) {
        int i10 = c0Var.i().i(u());
        return !c0Var.m() && z10 ? androidx.camera.core.impl.utils.r.q(-i10) : i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public u0 q() {
        c0 f10 = f();
        Size e10 = e();
        if (f10 == null || e10 == null) {
            return null;
        }
        Rect w10 = w();
        if (w10 == null) {
            w10 = new Rect(0, 0, e10.getWidth(), e10.getHeight());
        }
        return new u0(e10, w10, o(f10));
    }

    public Matrix r() {
        return this.f2772j;
    }

    public y1 s() {
        return this.f2775m;
    }

    protected Set<Integer> t() {
        return Collections.emptySet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int u() {
        return ((f1) this.f2768f).C(0);
    }

    public abstract k2.a<?, ?, ?> v(n0 n0Var);

    public Rect w() {
        return this.f2771i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean x(String str) {
        if (f() == null) {
            return false;
        }
        return Objects.equals(str, h());
    }

    public boolean y(int i10) {
        Iterator<Integer> it = t().iterator();
        while (it.hasNext()) {
            if (z0.b(i10, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean z(c0 c0Var) {
        int m10 = m();
        if (m10 == 0) {
            return false;
        }
        if (m10 == 1) {
            return true;
        }
        if (m10 == 2) {
            return c0Var.j();
        }
        throw new AssertionError("Unknown mirrorMode: " + m10);
    }
}
