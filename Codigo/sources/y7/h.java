package y7;

import z7.i;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    private final y6.c f31806a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31807b;

    public h(y6.c cVar, long j10) {
        this.f31806a = cVar;
        this.f31807b = j10;
    }

    @Override // y7.f
    public long a(long j10, long j11) {
        return this.f31806a.f31696d[(int) j10];
    }

    @Override // y7.f
    public long b(long j10, long j11) {
        return 0L;
    }

    @Override // y7.f
    public long c(long j10) {
        return this.f31806a.f31697e[(int) j10] - this.f31807b;
    }

    @Override // y7.f
    public long d(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // y7.f
    public i e(long j10) {
        return new i(null, this.f31806a.f31695c[(int) j10], r0.f31694b[r8]);
    }

    @Override // y7.f
    public long f(long j10, long j11) {
        return this.f31806a.a(j10 + this.f31807b);
    }

    @Override // y7.f
    public long g(long j10) {
        return this.f31806a.f31693a;
    }

    @Override // y7.f
    public boolean h() {
        return true;
    }

    @Override // y7.f
    public long i() {
        return 0L;
    }

    @Override // y7.f
    public long j(long j10, long j11) {
        return this.f31806a.f31693a;
    }
}
