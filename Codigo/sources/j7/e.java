package j7;

import t8.r0;
import y6.a0;
import y6.z;

/* loaded from: classes.dex */
final class e implements z {

    /* renamed from: a, reason: collision with root package name */
    private final c f19803a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19804b;

    /* renamed from: c, reason: collision with root package name */
    private final long f19805c;

    /* renamed from: d, reason: collision with root package name */
    private final long f19806d;

    /* renamed from: e, reason: collision with root package name */
    private final long f19807e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f19803a = cVar;
        this.f19804b = i10;
        this.f19805c = j10;
        long j12 = (j11 - j10) / cVar.f19798e;
        this.f19806d = j12;
        this.f19807e = a(j12);
    }

    private long a(long j10) {
        return r0.O0(j10 * this.f19804b, 1000000L, this.f19803a.f19796c);
    }

    @Override // y6.z
    public z.a d(long j10) {
        long r10 = r0.r((this.f19803a.f19796c * j10) / (this.f19804b * 1000000), 0L, this.f19806d - 1);
        long j11 = this.f19805c + (this.f19803a.f19798e * r10);
        long a10 = a(r10);
        a0 a0Var = new a0(a10, j11);
        if (a10 >= j10 || r10 == this.f19806d - 1) {
            return new z.a(a0Var);
        }
        long j12 = r10 + 1;
        return new z.a(a0Var, new a0(a(j12), this.f19805c + (this.f19803a.f19798e * j12)));
    }

    @Override // y6.z
    public boolean h() {
        return true;
    }

    @Override // y6.z
    public long i() {
        return this.f19807e;
    }
}
