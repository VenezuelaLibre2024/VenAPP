package p397v7;

import java.util.Arrays;
import java.util.Random;

/* renamed from: v7.x0 */
/* loaded from: classes.dex */
public interface InterfaceC11738x0 {

    /* renamed from: v7.x0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC11738x0 {

        /* renamed from: a */
        private final Random f30956a;

        /* renamed from: b */
        private final int[] f30957b;

        /* renamed from: c */
        private final int[] f30958c;

        public a(int i10) {
            this(i10, new Random());
        }

        private a(int i10, Random random) {
            this(m37104h(i10, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f30957b = iArr;
            this.f30956a = random;
            this.f30958c = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f30958c[iArr[i10]] = i10;
            }
        }

        /* renamed from: h */
        private static int[] m37104h(int i10, Random random) {
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                int nextInt = random.nextInt(i12);
                iArr[i11] = iArr[nextInt];
                iArr[nextInt] = i11;
                i11 = i12;
            }
            return iArr;
        }

        @Override // p397v7.InterfaceC11738x0
        /* renamed from: a */
        public InterfaceC11738x0 mo37097a(int i10, int i11) {
            int i12 = i11 - i10;
            int[] iArr = new int[this.f30957b.length - i12];
            int i13 = 0;
            int i14 = 0;
            while (true) {
                int[] iArr2 = this.f30957b;
                if (i13 >= iArr2.length) {
                    return new a(iArr, new Random(this.f30956a.nextLong()));
                }
                int i15 = iArr2[i13];
                if (i15 < i10 || i15 >= i11) {
                    int i16 = i13 - i14;
                    if (i15 >= i10) {
                        i15 -= i12;
                    }
                    iArr[i16] = i15;
                } else {
                    i14++;
                }
                i13++;
            }
        }

        @Override // p397v7.InterfaceC11738x0
        /* renamed from: b */
        public int mo37098b(int i10) {
            int i11 = this.f30958c[i10] - 1;
            if (i11 >= 0) {
                return this.f30957b[i11];
            }
            return -1;
        }

        @Override // p397v7.InterfaceC11738x0
        /* renamed from: c */
        public int mo37099c(int i10) {
            int i11 = this.f30958c[i10] + 1;
            int[] iArr = this.f30957b;
            if (i11 < iArr.length) {
                return iArr[i11];
            }
            return -1;
        }

        @Override // p397v7.InterfaceC11738x0
        /* renamed from: d */
        public int mo37100d() {
            int[] iArr = this.f30957b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p397v7.InterfaceC11738x0
        /* renamed from: e */
        public InterfaceC11738x0 mo37101e() {
            return new a(0, new Random(this.f30956a.nextLong()));
        }

        @Override // p397v7.InterfaceC11738x0
        /* renamed from: f */
        public int mo37102f() {
            int[] iArr = this.f30957b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p397v7.InterfaceC11738x0
        /* renamed from: g */
        public InterfaceC11738x0 mo37103g(int i10, int i11) {
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int i12 = 0;
            int i13 = 0;
            while (i13 < i11) {
                iArr[i13] = this.f30956a.nextInt(this.f30957b.length + 1);
                int i14 = i13 + 1;
                int nextInt = this.f30956a.nextInt(i14);
                iArr2[i13] = iArr2[nextInt];
                iArr2[nextInt] = i13 + i10;
                i13 = i14;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f30957b.length + i11];
            int i15 = 0;
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.f30957b;
                if (i12 >= iArr4.length + i11) {
                    return new a(iArr3, new Random(this.f30956a.nextLong()));
                }
                if (i15 >= i11 || i16 != iArr[i15]) {
                    int i17 = i16 + 1;
                    int i18 = iArr4[i16];
                    iArr3[i12] = i18;
                    if (i18 >= i10) {
                        iArr3[i12] = i18 + i11;
                    }
                    i16 = i17;
                } else {
                    iArr3[i12] = iArr2[i15];
                    i15++;
                }
                i12++;
            }
        }

        @Override // p397v7.InterfaceC11738x0
        public int getLength() {
            return this.f30957b.length;
        }
    }

    /* renamed from: a */
    InterfaceC11738x0 mo37097a(int i10, int i11);

    /* renamed from: b */
    int mo37098b(int i10);

    /* renamed from: c */
    int mo37099c(int i10);

    /* renamed from: d */
    int mo37100d();

    /* renamed from: e */
    InterfaceC11738x0 mo37101e();

    /* renamed from: f */
    int mo37102f();

    /* renamed from: g */
    InterfaceC11738x0 mo37103g(int i10, int i11);

    int getLength();
}
