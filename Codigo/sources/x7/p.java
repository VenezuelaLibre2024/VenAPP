package x7;

import com.google.android.gms.common.api.a;
import t6.u1;
import y6.b0;

/* loaded from: classes.dex */
public final class p extends a {

    /* renamed from: o, reason: collision with root package name */
    private final int f30646o;

    /* renamed from: p, reason: collision with root package name */
    private final u1 f30647p;

    /* renamed from: q, reason: collision with root package name */
    private long f30648q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f30649r;

    public p(s8.j jVar, s8.n nVar, u1 u1Var, int i10, Object obj, long j10, long j11, long j12, int i11, u1 u1Var2) {
        super(jVar, nVar, u1Var, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f30646o = i11;
        this.f30647p = u1Var2;
    }

    @Override // s8.e0.e
    public void b() {
        c j10 = j();
        j10.b(0L);
        b0 d10 = j10.d(0, this.f30646o);
        d10.c(this.f30647p);
        try {
            long o10 = this.f30609i.o(this.f30602b.e(this.f30648q));
            if (o10 != -1) {
                o10 += this.f30648q;
            }
            y6.e eVar = new y6.e(this.f30609i, this.f30648q, o10);
            for (int i10 = 0; i10 != -1; i10 = d10.f(eVar, a.e.API_PRIORITY_OTHER, true)) {
                this.f30648q += i10;
            }
            d10.b(this.f30607g, 1, (int) this.f30648q, 0, null);
            s8.m.a(this.f30609i);
            this.f30649r = true;
        } catch (Throwable th2) {
            s8.m.a(this.f30609i);
            throw th2;
        }
    }

    @Override // s8.e0.e
    public void c() {
    }

    @Override // x7.n
    public boolean h() {
        return this.f30649r;
    }
}
