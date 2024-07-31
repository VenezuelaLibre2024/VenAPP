package y6;

import t8.r0;
import y6.z;

/* loaded from: classes.dex */
public final class x implements z {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f31791a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f31792b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31793c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f31794d;

    public x(long[] jArr, long[] jArr2, long j10) {
        t8.a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f31794d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f31791a = jArr;
            this.f31792b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f31791a = jArr3;
            long[] jArr4 = new long[i10];
            this.f31792b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f31793c = j10;
    }

    @Override // y6.z
    public z.a d(long j10) {
        if (!this.f31794d) {
            return new z.a(a0.f31686c);
        }
        int i10 = r0.i(this.f31792b, j10, true, true);
        a0 a0Var = new a0(this.f31792b[i10], this.f31791a[i10]);
        if (a0Var.f31687a == j10 || i10 == this.f31792b.length - 1) {
            return new z.a(a0Var);
        }
        int i11 = i10 + 1;
        return new z.a(a0Var, new a0(this.f31792b[i11], this.f31791a[i11]));
    }

    @Override // y6.z
    public boolean h() {
        return this.f31794d;
    }

    @Override // y6.z
    public long i() {
        return this.f31793c;
    }
}
