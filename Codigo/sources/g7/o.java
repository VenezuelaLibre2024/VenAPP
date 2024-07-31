package g7;

import t6.u1;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f16000a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16001b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16002c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16003d;

    /* renamed from: e, reason: collision with root package name */
    public final long f16004e;

    /* renamed from: f, reason: collision with root package name */
    public final u1 f16005f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16006g;

    /* renamed from: h, reason: collision with root package name */
    public final long[] f16007h;

    /* renamed from: i, reason: collision with root package name */
    public final long[] f16008i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16009j;

    /* renamed from: k, reason: collision with root package name */
    private final p[] f16010k;

    public o(int i10, int i11, long j10, long j11, long j12, u1 u1Var, int i12, p[] pVarArr, int i13, long[] jArr, long[] jArr2) {
        this.f16000a = i10;
        this.f16001b = i11;
        this.f16002c = j10;
        this.f16003d = j11;
        this.f16004e = j12;
        this.f16005f = u1Var;
        this.f16006g = i12;
        this.f16010k = pVarArr;
        this.f16009j = i13;
        this.f16007h = jArr;
        this.f16008i = jArr2;
    }

    public p a(int i10) {
        p[] pVarArr = this.f16010k;
        if (pVarArr == null) {
            return null;
        }
        return pVarArr[i10];
    }
}
