package a7;

import com.google.common.collect.h1;
import com.google.common.collect.w;
import t8.e0;

/* loaded from: classes.dex */
final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final w<a> f110a;

    /* renamed from: b, reason: collision with root package name */
    private final int f111b;

    private f(int i10, w<a> wVar) {
        this.f111b = i10;
        this.f110a = wVar;
    }

    private static a a(int i10, int i11, e0 e0Var) {
        switch (i10) {
            case 1718776947:
                return g.d(i11, e0Var);
            case 1751742049:
                return c.b(e0Var);
            case 1752331379:
                return d.c(e0Var);
            case 1852994675:
                return h.a(e0Var);
            default:
                return null;
        }
    }

    public static f c(int i10, e0 e0Var) {
        w.a aVar = new w.a();
        int g10 = e0Var.g();
        int i11 = -2;
        while (e0Var.a() > 8) {
            int u10 = e0Var.u();
            int f10 = e0Var.f() + e0Var.u();
            e0Var.T(f10);
            a c10 = u10 == 1414744396 ? c(e0Var.u(), e0Var) : a(u10, i11, e0Var);
            if (c10 != null) {
                if (c10.getType() == 1752331379) {
                    i11 = ((d) c10).b();
                }
                aVar.a(c10);
            }
            e0Var.U(f10);
            e0Var.T(g10);
        }
        return new f(i10, aVar.k());
    }

    public <T extends a> T b(Class<T> cls) {
        h1<a> it = this.f110a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }

    @Override // a7.a
    public int getType() {
        return this.f111b;
    }
}
