package i7;

import i7.i0;
import java.util.List;
import t6.u1;

/* loaded from: classes.dex */
final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<u1> f17343a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.b0[] f17344b;

    public k0(List<u1> list) {
        this.f17343a = list;
        this.f17344b = new y6.b0[list.size()];
    }

    public void a(long j10, t8.e0 e0Var) {
        if (e0Var.a() < 9) {
            return;
        }
        int q10 = e0Var.q();
        int q11 = e0Var.q();
        int H = e0Var.H();
        if (q10 == 434 && q11 == 1195456820 && H == 3) {
            y6.b.b(j10, e0Var, this.f17344b);
        }
    }

    public void b(y6.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f17344b.length; i10++) {
            dVar.a();
            y6.b0 d10 = mVar.d(dVar.c(), 3);
            u1 u1Var = this.f17343a.get(i10);
            String str = u1Var.f26517w;
            t8.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            d10.c(new u1.b().U(dVar.b()).g0(str).i0(u1Var.f26509d).X(u1Var.f26508c).H(u1Var.O).V(u1Var.f26519y).G());
            this.f17344b[i10] = d10;
        }
    }
}
