package f7;

import t8.e0;
import t8.r0;
import t8.s;
import v6.s0;
import y6.a0;
import y6.z;

/* loaded from: classes.dex */
final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f14991a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14992b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14993c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14994d;

    /* renamed from: e, reason: collision with root package name */
    private final long f14995e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f14996f;

    private i(long j10, int i10, long j11) {
        this(j10, i10, j11, -1L, null);
    }

    private i(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f14991a = j10;
        this.f14992b = i10;
        this.f14993c = j11;
        this.f14996f = jArr;
        this.f14994d = j12;
        this.f14995e = j12 != -1 ? j10 + j12 : -1L;
    }

    public static i a(long j10, long j11, s0.a aVar, e0 e0Var) {
        int L;
        int i10 = aVar.f28118g;
        int i11 = aVar.f28115d;
        int q10 = e0Var.q();
        if ((q10 & 1) != 1 || (L = e0Var.L()) == 0) {
            return null;
        }
        long O0 = r0.O0(L, i10 * 1000000, i11);
        if ((q10 & 6) != 6) {
            return new i(j11, aVar.f28114c, O0);
        }
        long J = e0Var.J();
        long[] jArr = new long[100];
        for (int i12 = 0; i12 < 100; i12++) {
            jArr[i12] = e0Var.H();
        }
        if (j10 != -1) {
            long j12 = j11 + J;
            if (j10 != j12) {
                s.i("XingSeeker", "XING data size mismatch: " + j10 + ", " + j12);
            }
        }
        return new i(j11, aVar.f28114c, O0, J, jArr);
    }

    private long b(int i10) {
        return (this.f14993c * i10) / 100;
    }

    @Override // f7.g
    public long c(long j10) {
        long j11 = j10 - this.f14991a;
        if (!h() || j11 <= this.f14992b) {
            return 0L;
        }
        long[] jArr = (long[]) t8.a.i(this.f14996f);
        double d10 = (j11 * 256.0d) / this.f14994d;
        int i10 = r0.i(jArr, (long) d10, true, true);
        long b10 = b(i10);
        long j12 = jArr[i10];
        int i11 = i10 + 1;
        long b11 = b(i11);
        return b10 + Math.round((j12 == (i10 == 99 ? 256L : jArr[i11]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (b11 - b10));
    }

    @Override // y6.z
    public z.a d(long j10) {
        if (!h()) {
            return new z.a(new a0(0L, this.f14991a + this.f14992b));
        }
        long r10 = r0.r(j10, 0L, this.f14993c);
        double d10 = (r10 * 100.0d) / this.f14993c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                double d12 = ((long[]) t8.a.i(this.f14996f))[i10];
                d11 = d12 + ((d10 - i10) * ((i10 == 99 ? 256.0d : r3[i10 + 1]) - d12));
            }
        }
        return new z.a(new a0(r10, this.f14991a + r0.r(Math.round((d11 / 256.0d) * this.f14994d), this.f14992b, this.f14994d - 1)));
    }

    @Override // f7.g
    public long g() {
        return this.f14995e;
    }

    @Override // y6.z
    public boolean h() {
        return this.f14996f != null;
    }

    @Override // y6.z
    public long i() {
        return this.f14993c;
    }
}
