package p119g7;

import p363t8.C11172r0;

/* renamed from: g7.d */
/* loaded from: classes.dex */
final class C7468d {

    /* renamed from: g7.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final long[] f17491a;

        /* renamed from: b */
        public final int[] f17492b;

        /* renamed from: c */
        public final int f17493c;

        /* renamed from: d */
        public final long[] f17494d;

        /* renamed from: e */
        public final int[] f17495e;

        /* renamed from: f */
        public final long f17496f;

        private b(long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
            this.f17491a = jArr;
            this.f17492b = iArr;
            this.f17493c = i10;
            this.f17494d = jArr2;
            this.f17495e = iArr2;
            this.f17496f = j10;
        }
    }

    /* renamed from: a */
    public static b m22638a(int i10, long[] jArr, int[] iArr, long j10) {
        int i11 = 8192 / i10;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += C11172r0.m34932l(i13, i11);
        }
        long[] jArr2 = new long[i12];
        int[] iArr2 = new int[i12];
        long[] jArr3 = new long[i12];
        int[] iArr3 = new int[i12];
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < iArr.length; i17++) {
            int i18 = iArr[i17];
            long j11 = jArr[i17];
            while (i18 > 0) {
                int min = Math.min(i11, i18);
                jArr2[i15] = j11;
                int i19 = i10 * min;
                iArr2[i15] = i19;
                i16 = Math.max(i16, i19);
                jArr3[i15] = i14 * j10;
                iArr3[i15] = 1;
                j11 += iArr2[i15];
                i14 += min;
                i18 -= min;
                i15++;
            }
        }
        return new b(jArr2, iArr2, i16, jArr3, iArr3, j10 * i14);
    }
}
