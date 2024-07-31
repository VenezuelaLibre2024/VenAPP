package f7;

import t8.r0;
import t8.t;
import y6.a0;
import y6.z;

/* loaded from: classes.dex */
final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f14958a;

    /* renamed from: b, reason: collision with root package name */
    private final t f14959b;

    /* renamed from: c, reason: collision with root package name */
    private final t f14960c;

    /* renamed from: d, reason: collision with root package name */
    private long f14961d;

    public b(long j10, long j11, long j12) {
        this.f14961d = j10;
        this.f14958a = j12;
        t tVar = new t();
        this.f14959b = tVar;
        t tVar2 = new t();
        this.f14960c = tVar2;
        tVar.a(0L);
        tVar2.a(j11);
    }

    public boolean a(long j10) {
        t tVar = this.f14959b;
        return j10 - tVar.b(tVar.c() - 1) < 100000;
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f14959b.a(j10);
        this.f14960c.a(j11);
    }

    @Override // f7.g
    public long c(long j10) {
        return this.f14959b.b(r0.g(this.f14960c, j10, true, true));
    }

    @Override // y6.z
    public z.a d(long j10) {
        int g10 = r0.g(this.f14959b, j10, true, true);
        a0 a0Var = new a0(this.f14959b.b(g10), this.f14960c.b(g10));
        if (a0Var.f31687a == j10 || g10 == this.f14959b.c() - 1) {
            return new z.a(a0Var);
        }
        int i10 = g10 + 1;
        return new z.a(a0Var, new a0(this.f14959b.b(i10), this.f14960c.b(i10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(long j10) {
        this.f14961d = j10;
    }

    @Override // f7.g
    public long g() {
        return this.f14958a;
    }

    @Override // y6.z
    public boolean h() {
        return true;
    }

    @Override // y6.z
    public long i() {
        return this.f14961d;
    }
}
