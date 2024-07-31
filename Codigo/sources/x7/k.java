package x7;

import s8.l0;
import t6.u1;
import x7.g;

/* loaded from: classes.dex */
public class k extends a {

    /* renamed from: o, reason: collision with root package name */
    private final int f30632o;

    /* renamed from: p, reason: collision with root package name */
    private final long f30633p;

    /* renamed from: q, reason: collision with root package name */
    private final g f30634q;

    /* renamed from: r, reason: collision with root package name */
    private long f30635r;

    /* renamed from: s, reason: collision with root package name */
    private volatile boolean f30636s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f30637t;

    public k(s8.j jVar, s8.n nVar, u1 u1Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, g gVar) {
        super(jVar, nVar, u1Var, i10, obj, j10, j11, j12, j13, j14);
        this.f30632o = i11;
        this.f30633p = j15;
        this.f30634q = gVar;
    }

    @Override // s8.e0.e
    public final void b() {
        if (this.f30635r == 0) {
            c j10 = j();
            j10.b(this.f30633p);
            g gVar = this.f30634q;
            g.b l10 = l(j10);
            long j11 = this.f30574k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f30633p;
            long j13 = this.f30575l;
            gVar.c(l10, j12, j13 == -9223372036854775807L ? -9223372036854775807L : j13 - this.f30633p);
        }
        try {
            s8.n e10 = this.f30602b.e(this.f30635r);
            l0 l0Var = this.f30609i;
            y6.e eVar = new y6.e(l0Var, e10.f25294g, l0Var.o(e10));
            do {
                try {
                    if (this.f30636s) {
                        break;
                    }
                } finally {
                    this.f30635r = eVar.getPosition() - this.f30602b.f25294g;
                }
            } while (this.f30634q.a(eVar));
            s8.m.a(this.f30609i);
            this.f30637t = !this.f30636s;
        } catch (Throwable th2) {
            s8.m.a(this.f30609i);
            throw th2;
        }
    }

    @Override // s8.e0.e
    public final void c() {
        this.f30636s = true;
    }

    @Override // x7.n
    public long g() {
        return this.f30644j + this.f30632o;
    }

    @Override // x7.n
    public boolean h() {
        return this.f30637t;
    }

    protected g.b l(c cVar) {
        return cVar;
    }
}
