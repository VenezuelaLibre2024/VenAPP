package p119g7;

import p363t8.C11137a;
import p363t8.C11172r0;

/* renamed from: g7.r */
/* loaded from: classes.dex */
final class C7482r {

    /* renamed from: a */
    public final C7479o f17627a;

    /* renamed from: b */
    public final int f17628b;

    /* renamed from: c */
    public final long[] f17629c;

    /* renamed from: d */
    public final int[] f17630d;

    /* renamed from: e */
    public final int f17631e;

    /* renamed from: f */
    public final long[] f17632f;

    /* renamed from: g */
    public final int[] f17633g;

    /* renamed from: h */
    public final long f17634h;

    public C7482r(C7479o c7479o, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        C11137a.m34599a(iArr.length == jArr2.length);
        C11137a.m34599a(jArr.length == jArr2.length);
        C11137a.m34599a(iArr2.length == jArr2.length);
        this.f17627a = c7479o;
        this.f17629c = jArr;
        this.f17630d = iArr;
        this.f17631e = i10;
        this.f17632f = jArr2;
        this.f17633g = iArr2;
        this.f17634h = j10;
        this.f17628b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public int m22757a(long j10) {
        for (int m34926i = C11172r0.m34926i(this.f17632f, j10, true, false); m34926i >= 0; m34926i--) {
            if ((this.f17633g[m34926i] & 1) != 0) {
                return m34926i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public int m22758b(long j10) {
        for (int m34918e = C11172r0.m34918e(this.f17632f, j10, true, false); m34918e < this.f17632f.length; m34918e++) {
            if ((this.f17633g[m34918e] & 1) != 0) {
                return m34918e;
            }
        }
        return -1;
    }
}
