package i7;

import i7.i0;
import t6.u1;
import t8.n0;
import t8.r0;

/* loaded from: classes.dex */
public final class v implements b0 {

    /* renamed from: a, reason: collision with root package name */
    private u1 f17519a;

    /* renamed from: b, reason: collision with root package name */
    private n0 f17520b;

    /* renamed from: c, reason: collision with root package name */
    private y6.b0 f17521c;

    public v(String str) {
        this.f17519a = new u1.b().g0(str).G();
    }

    private void c() {
        t8.a.i(this.f17520b);
        r0.j(this.f17521c);
    }

    @Override // i7.b0
    public void a(n0 n0Var, y6.m mVar, i0.d dVar) {
        this.f17520b = n0Var;
        dVar.a();
        y6.b0 d10 = mVar.d(dVar.c(), 5);
        this.f17521c = d10;
        d10.c(this.f17519a);
    }

    @Override // i7.b0
    public void b(t8.e0 e0Var) {
        c();
        long d10 = this.f17520b.d();
        long e10 = this.f17520b.e();
        if (d10 == -9223372036854775807L || e10 == -9223372036854775807L) {
            return;
        }
        u1 u1Var = this.f17519a;
        if (e10 != u1Var.A) {
            u1 G = u1Var.c().k0(e10).G();
            this.f17519a = G;
            this.f17521c.c(G);
        }
        int a10 = e0Var.a();
        this.f17521c.a(e0Var, a10);
        this.f17521c.b(d10, 1, a10, 0, null);
    }
}
