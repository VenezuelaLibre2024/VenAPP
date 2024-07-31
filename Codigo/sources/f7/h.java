package f7;

import t8.e0;
import t8.r0;
import t8.s;
import v6.s0;
import y6.a0;
import y6.z;

/* loaded from: classes.dex */
final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f14987a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f14988b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14989c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14990d;

    private h(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f14987a = jArr;
        this.f14988b = jArr2;
        this.f14989c = j10;
        this.f14990d = j11;
    }

    public static h a(long j10, long j11, s0.a aVar, e0 e0Var) {
        int H;
        e0Var.V(10);
        int q10 = e0Var.q();
        if (q10 <= 0) {
            return null;
        }
        int i10 = aVar.f28115d;
        long O0 = r0.O0(q10, (i10 >= 32000 ? 1152 : 576) * 1000000, i10);
        int N = e0Var.N();
        int N2 = e0Var.N();
        int N3 = e0Var.N();
        e0Var.V(2);
        long j12 = j11 + aVar.f28114c;
        long[] jArr = new long[N];
        long[] jArr2 = new long[N];
        int i11 = 0;
        long j13 = j11;
        while (i11 < N) {
            int i12 = N2;
            long j14 = j12;
            jArr[i11] = (i11 * O0) / N;
            jArr2[i11] = Math.max(j13, j14);
            if (N3 == 1) {
                H = e0Var.H();
            } else if (N3 == 2) {
                H = e0Var.N();
            } else if (N3 == 3) {
                H = e0Var.K();
            } else {
                if (N3 != 4) {
                    return null;
                }
                H = e0Var.L();
            }
            j13 += H * i12;
            i11++;
            jArr = jArr;
            N2 = i12;
            j12 = j14;
        }
        long[] jArr3 = jArr;
        if (j10 != -1 && j10 != j13) {
            s.i("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new h(jArr3, jArr2, O0, j13);
    }

    @Override // f7.g
    public long c(long j10) {
        return this.f14987a[r0.i(this.f14988b, j10, true, true)];
    }

    @Override // y6.z
    public z.a d(long j10) {
        int i10 = r0.i(this.f14987a, j10, true, true);
        a0 a0Var = new a0(this.f14987a[i10], this.f14988b[i10]);
        if (a0Var.f31687a >= j10 || i10 == this.f14987a.length - 1) {
            return new z.a(a0Var);
        }
        int i11 = i10 + 1;
        return new z.a(a0Var, new a0(this.f14987a[i11], this.f14988b[i11]));
    }

    @Override // f7.g
    public long g() {
        return this.f14990d;
    }

    @Override // y6.z
    public boolean h() {
        return true;
    }

    @Override // y6.z
    public long i() {
        return this.f14989c;
    }
}
