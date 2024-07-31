package x7;

import s8.l0;
import t6.u1;
import x7.g;

/* loaded from: classes.dex */
public final class m extends f {

    /* renamed from: j, reason: collision with root package name */
    private final g f30640j;

    /* renamed from: k, reason: collision with root package name */
    private g.b f30641k;

    /* renamed from: l, reason: collision with root package name */
    private long f30642l;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f30643m;

    public m(s8.j jVar, s8.n nVar, u1 u1Var, int i10, Object obj, g gVar) {
        super(jVar, nVar, 2, u1Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f30640j = gVar;
    }

    @Override // s8.e0.e
    public void b() {
        if (this.f30642l == 0) {
            this.f30640j.c(this.f30641k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            s8.n e10 = this.f30602b.e(this.f30642l);
            l0 l0Var = this.f30609i;
            y6.e eVar = new y6.e(l0Var, e10.f25294g, l0Var.o(e10));
            while (!this.f30643m && this.f30640j.a(eVar)) {
                try {
                } finally {
                    this.f30642l = eVar.getPosition() - this.f30602b.f25294g;
                }
            }
        } finally {
            s8.m.a(this.f30609i);
        }
    }

    @Override // s8.e0.e
    public void c() {
        this.f30643m = true;
    }

    public void g(g.b bVar) {
        this.f30641k = bVar;
    }
}
