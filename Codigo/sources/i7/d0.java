package i7;

import i7.i0;
import java.util.List;
import t6.u1;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<u1> f17224a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.b0[] f17225b;

    public d0(List<u1> list) {
        this.f17224a = list;
        this.f17225b = new y6.b0[list.size()];
    }

    public void a(long j10, t8.e0 e0Var) {
        y6.b.a(j10, e0Var, this.f17225b);
    }

    public void b(y6.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f17225b.length; i10++) {
            dVar.a();
            y6.b0 d10 = mVar.d(dVar.c(), 3);
            u1 u1Var = this.f17224a.get(i10);
            String str = u1Var.f26517w;
            t8.a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String str2 = u1Var.f26506a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            d10.c(new u1.b().U(str2).g0(str).i0(u1Var.f26509d).X(u1Var.f26508c).H(u1Var.O).V(u1Var.f26519y).G());
            this.f17225b[i10] = d10;
        }
    }
}
