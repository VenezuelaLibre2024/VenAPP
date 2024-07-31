package g7;

import t8.r0;

/* loaded from: classes.dex */
final class r {

    /* renamed from: a, reason: collision with root package name */
    public final o f16034a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16035b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f16036c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f16037d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16038e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f16039f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f16040g;

    /* renamed from: h, reason: collision with root package name */
    public final long f16041h;

    public r(o oVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        t8.a.a(iArr.length == jArr2.length);
        t8.a.a(jArr.length == jArr2.length);
        t8.a.a(iArr2.length == jArr2.length);
        this.f16034a = oVar;
        this.f16036c = jArr;
        this.f16037d = iArr;
        this.f16038e = i10;
        this.f16039f = jArr2;
        this.f16040g = iArr2;
        this.f16041h = j10;
        this.f16035b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int i10 = r0.i(this.f16039f, j10, true, false); i10 >= 0; i10--) {
            if ((this.f16040g[i10] & 1) != 0) {
                return i10;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int e10 = r0.e(this.f16039f, j10, true, false); e10 < this.f16039f.length; e10++) {
            if ((this.f16040g[e10] & 1) != 0) {
                return e10;
            }
        }
        return -1;
    }
}
