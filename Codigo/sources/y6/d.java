package y6;

import y6.z;

/* loaded from: classes.dex */
public class d implements z {

    /* renamed from: a, reason: collision with root package name */
    private final long f31706a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31707b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31708c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31709d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31710e;

    /* renamed from: f, reason: collision with root package name */
    private final long f31711f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f31712g;

    public d(long j10, long j11, int i10, int i11, boolean z10) {
        long e10;
        this.f31706a = j10;
        this.f31707b = j11;
        this.f31708c = i11 == -1 ? 1 : i11;
        this.f31710e = i10;
        this.f31712g = z10;
        if (j10 == -1) {
            this.f31709d = -1L;
            e10 = -9223372036854775807L;
        } else {
            this.f31709d = j10 - j11;
            e10 = e(j10, j11, i10);
        }
        this.f31711f = e10;
    }

    private long a(long j10) {
        int i10 = this.f31708c;
        long j11 = (((j10 * this.f31710e) / 8000000) / i10) * i10;
        long j12 = this.f31709d;
        if (j12 != -1) {
            j11 = Math.min(j11, j12 - i10);
        }
        return this.f31707b + Math.max(j11, 0L);
    }

    private static long e(long j10, long j11, int i10) {
        return ((Math.max(0L, j10 - j11) * 8) * 1000000) / i10;
    }

    public long b(long j10) {
        return e(j10, this.f31707b, this.f31710e);
    }

    @Override // y6.z
    public z.a d(long j10) {
        if (this.f31709d == -1 && !this.f31712g) {
            return new z.a(new a0(0L, this.f31707b));
        }
        long a10 = a(j10);
        long b10 = b(a10);
        a0 a0Var = new a0(b10, a10);
        if (this.f31709d != -1 && b10 < j10) {
            int i10 = this.f31708c;
            if (i10 + a10 < this.f31706a) {
                long j11 = a10 + i10;
                return new z.a(a0Var, new a0(b(j11), j11));
            }
        }
        return new z.a(a0Var);
    }

    @Override // y6.z
    public boolean h() {
        return this.f31709d != -1 || this.f31712g;
    }

    @Override // y6.z
    public long i() {
        return this.f31711f;
    }
}
