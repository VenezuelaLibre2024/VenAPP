package t6;

import android.util.Pair;
import t6.d4;

/* loaded from: classes.dex */
public abstract class a extends d4 {

    /* renamed from: f, reason: collision with root package name */
    private final int f25827f;

    /* renamed from: r, reason: collision with root package name */
    private final v7.x0 f25828r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f25829s;

    public a(boolean z10, v7.x0 x0Var) {
        this.f25829s = z10;
        this.f25828r = x0Var;
        this.f25827f = x0Var.getLength();
    }

    public static Object A(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object B(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object D(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    private int G(int i10, boolean z10) {
        if (z10) {
            return this.f25828r.c(i10);
        }
        if (i10 < this.f25827f - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int H(int i10, boolean z10) {
        if (z10) {
            return this.f25828r.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    protected abstract Object C(int i10);

    protected abstract int E(int i10);

    protected abstract int F(int i10);

    protected abstract d4 I(int i10);

    @Override // t6.d4
    public int f(boolean z10) {
        if (this.f25827f == 0) {
            return -1;
        }
        if (this.f25829s) {
            z10 = false;
        }
        int f10 = z10 ? this.f25828r.f() : 0;
        while (I(f10).v()) {
            f10 = G(f10, z10);
            if (f10 == -1) {
                return -1;
            }
        }
        return F(f10) + I(f10).f(z10);
    }

    @Override // t6.d4
    public final int g(Object obj) {
        int g10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object B = B(obj);
        Object A = A(obj);
        int x10 = x(B);
        if (x10 == -1 || (g10 = I(x10).g(A)) == -1) {
            return -1;
        }
        return E(x10) + g10;
    }

    @Override // t6.d4
    public int h(boolean z10) {
        int i10 = this.f25827f;
        if (i10 == 0) {
            return -1;
        }
        if (this.f25829s) {
            z10 = false;
        }
        int d10 = z10 ? this.f25828r.d() : i10 - 1;
        while (I(d10).v()) {
            d10 = H(d10, z10);
            if (d10 == -1) {
                return -1;
            }
        }
        return F(d10) + I(d10).h(z10);
    }

    @Override // t6.d4
    public int j(int i10, int i11, boolean z10) {
        if (this.f25829s) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        int j10 = I(z11).j(i10 - F, i11 != 2 ? i11 : 0, z10);
        if (j10 != -1) {
            return F + j10;
        }
        int G = G(z11, z10);
        while (G != -1 && I(G).v()) {
            G = G(G, z10);
        }
        if (G != -1) {
            return F(G) + I(G).f(z10);
        }
        if (i11 == 2) {
            return f(z10);
        }
        return -1;
    }

    @Override // t6.d4
    public final d4.b l(int i10, d4.b bVar, boolean z10) {
        int y10 = y(i10);
        int F = F(y10);
        I(y10).l(i10 - E(y10), bVar, z10);
        bVar.f26057c += F;
        if (z10) {
            bVar.f26056b = D(C(y10), t8.a.e(bVar.f26056b));
        }
        return bVar;
    }

    @Override // t6.d4
    public final d4.b m(Object obj, d4.b bVar) {
        Object B = B(obj);
        Object A = A(obj);
        int x10 = x(B);
        int F = F(x10);
        I(x10).m(A, bVar);
        bVar.f26057c += F;
        bVar.f26056b = obj;
        return bVar;
    }

    @Override // t6.d4
    public int q(int i10, int i11, boolean z10) {
        if (this.f25829s) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int z11 = z(i10);
        int F = F(z11);
        int q10 = I(z11).q(i10 - F, i11 != 2 ? i11 : 0, z10);
        if (q10 != -1) {
            return F + q10;
        }
        int H = H(z11, z10);
        while (H != -1 && I(H).v()) {
            H = H(H, z10);
        }
        if (H != -1) {
            return F(H) + I(H).h(z10);
        }
        if (i11 == 2) {
            return h(z10);
        }
        return -1;
    }

    @Override // t6.d4
    public final Object r(int i10) {
        int y10 = y(i10);
        return D(C(y10), I(y10).r(i10 - E(y10)));
    }

    @Override // t6.d4
    public final d4.d t(int i10, d4.d dVar, long j10) {
        int z10 = z(i10);
        int F = F(z10);
        int E = E(z10);
        I(z10).t(i10 - F, dVar, j10);
        Object C = C(z10);
        if (!d4.d.C.equals(dVar.f26066a)) {
            C = D(C, dVar.f26066a);
        }
        dVar.f26066a = C;
        dVar.f26080z += E;
        dVar.A += E;
        return dVar;
    }

    protected abstract int x(Object obj);

    protected abstract int y(int i10);

    protected abstract int z(int i10);
}
