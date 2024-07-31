package y6;

import java.util.Arrays;
import t8.r0;
import y6.z;

/* loaded from: classes.dex */
public final class c implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f31693a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f31694b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f31695c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f31696d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f31697e;

    /* renamed from: f, reason: collision with root package name */
    private final long f31698f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f31694b = iArr;
        this.f31695c = jArr;
        this.f31696d = jArr2;
        this.f31697e = jArr3;
        int length = iArr.length;
        this.f31693a = length;
        if (length > 0) {
            this.f31698f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f31698f = 0L;
        }
    }

    public int a(long j10) {
        return r0.i(this.f31697e, j10, true, true);
    }

    @Override // y6.z
    public z.a d(long j10) {
        int a10 = a(j10);
        a0 a0Var = new a0(this.f31697e[a10], this.f31695c[a10]);
        if (a0Var.f31687a >= j10 || a10 == this.f31693a - 1) {
            return new z.a(a0Var);
        }
        int i10 = a10 + 1;
        return new z.a(a0Var, new a0(this.f31697e[i10], this.f31695c[i10]));
    }

    @Override // y6.z
    public boolean h() {
        return true;
    }

    @Override // y6.z
    public long i() {
        return this.f31698f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f31693a + ", sizes=" + Arrays.toString(this.f31694b) + ", offsets=" + Arrays.toString(this.f31695c) + ", timeUs=" + Arrays.toString(this.f31697e) + ", durationsUs=" + Arrays.toString(this.f31696d) + ")";
    }
}
