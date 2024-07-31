package kg;

import java.util.Arrays;

/* renamed from: kg.b */
/* loaded from: classes2.dex */
public final class C9264b implements Cloneable {

    /* renamed from: a */
    private int f22483a;

    /* renamed from: b */
    private int f22484b;

    /* renamed from: c */
    private int f22485c;

    /* renamed from: d */
    private int[] f22486d;

    public C9264b(int i10) {
        this(i10, i10);
    }

    public C9264b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f22483a = i10;
        this.f22484b = i11;
        int i12 = (i10 + 31) / 32;
        this.f22485c = i12;
        this.f22486d = new int[i12 * i11];
    }

    private C9264b(int i10, int i11, int i12, int[] iArr) {
        this.f22483a = i10;
        this.f22484b = i11;
        this.f22485c = i12;
        this.f22486d = iArr;
    }

    /* renamed from: a */
    private String m27598a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f22484b * (this.f22483a + 1));
        for (int i10 = 0; i10 < this.f22484b; i10++) {
            for (int i11 = 0; i11 < this.f22483a; i11++) {
                sb2.append(m27603g(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public void m27599b() {
        int length = this.f22486d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f22486d[i10] = 0;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C9264b clone() {
        return new C9264b(this.f22483a, this.f22484b, this.f22485c, (int[]) this.f22486d.clone());
    }

    /* renamed from: d */
    public void m27601d() {
        int length = this.f22486d.length;
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr = this.f22486d;
            iArr[i10] = ~iArr[i10];
        }
    }

    /* renamed from: e */
    public void m27602e(int i10, int i11) {
        int i12 = (i11 * this.f22485c) + (i10 / 32);
        int[] iArr = this.f22486d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9264b)) {
            return false;
        }
        C9264b c9264b = (C9264b) obj;
        return this.f22483a == c9264b.f22483a && this.f22484b == c9264b.f22484b && this.f22485c == c9264b.f22485c && Arrays.equals(this.f22486d, c9264b.f22486d);
    }

    /* renamed from: g */
    public boolean m27603g(int i10, int i11) {
        return ((this.f22486d[(i11 * this.f22485c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    /* renamed from: h */
    public int[] m27604h() {
        int length = this.f22486d.length - 1;
        while (length >= 0 && this.f22486d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f22485c;
        int i11 = length / i10;
        int i12 = (length % i10) * 32;
        int i13 = 31;
        while ((this.f22486d[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int hashCode() {
        int i10 = this.f22483a;
        return (((((((i10 * 31) + i10) * 31) + this.f22484b) * 31) + this.f22485c) * 31) + Arrays.hashCode(this.f22486d);
    }

    /* renamed from: i */
    public int[] m27605i() {
        int i10 = this.f22483a;
        int i11 = this.f22484b;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f22484b; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f22485c;
                if (i15 < i16) {
                    int i17 = this.f22486d[(i16 * i14) + i15];
                    if (i17 != 0) {
                        if (i14 < i11) {
                            i11 = i14;
                        }
                        if (i14 > i13) {
                            i13 = i14;
                        }
                        int i18 = i15 * 32;
                        if (i18 < i10) {
                            int i19 = 0;
                            while ((i17 << (31 - i19)) == 0) {
                                i19++;
                            }
                            int i20 = i19 + i18;
                            if (i20 < i10) {
                                i10 = i20;
                            }
                        }
                        if (i18 + 31 > i12) {
                            int i21 = 31;
                            while ((i17 >>> i21) == 0) {
                                i21--;
                            }
                            int i22 = i18 + i21;
                            if (i22 > i12) {
                                i12 = i22;
                            }
                        }
                    }
                    i15++;
                }
            }
        }
        if (i12 < i10 || i13 < i11) {
            return null;
        }
        return new int[]{i10, i11, (i12 - i10) + 1, (i13 - i11) + 1};
    }

    /* renamed from: j */
    public int m27606j() {
        return this.f22484b;
    }

    /* renamed from: k */
    public C9263a m27607k(int i10, C9263a c9263a) {
        if (c9263a == null || c9263a.m27590l() < this.f22483a) {
            c9263a = new C9263a(this.f22483a);
        } else {
            c9263a.m27584d();
        }
        int i11 = i10 * this.f22485c;
        for (int i12 = 0; i12 < this.f22485c; i12++) {
            c9263a.m27595t(i12 * 32, this.f22486d[i11 + i12]);
        }
        return c9263a;
    }

    /* renamed from: l */
    public int[] m27608l() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f22486d;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f22485c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) * 32;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    /* renamed from: m */
    public int m27609m() {
        return this.f22483a;
    }

    /* renamed from: p */
    public void m27610p() {
        C9263a c9263a = new C9263a(this.f22483a);
        C9263a c9263a2 = new C9263a(this.f22483a);
        int i10 = (this.f22484b + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            c9263a = m27607k(i11, c9263a);
            int i12 = (this.f22484b - 1) - i11;
            c9263a2 = m27607k(i12, c9263a2);
            c9263a.m27593r();
            c9263a2.m27593r();
            m27614t(i11, c9263a2);
            m27614t(i12, c9263a);
        }
    }

    /* renamed from: q */
    public void m27611q() {
        int i10 = this.f22484b;
        int i11 = this.f22483a;
        int i12 = (i10 + 31) / 32;
        int[] iArr = new int[i12 * i11];
        for (int i13 = 0; i13 < this.f22484b; i13++) {
            for (int i14 = 0; i14 < this.f22483a; i14++) {
                if (((this.f22486d[(this.f22485c * i13) + (i14 / 32)] >>> (i14 & 31)) & 1) != 0) {
                    int i15 = (((i11 - 1) - i14) * i12) + (i13 / 32);
                    iArr[i15] = (1 << (i13 & 31)) | iArr[i15];
                }
            }
        }
        this.f22483a = i10;
        this.f22484b = i11;
        this.f22485c = i12;
        this.f22486d = iArr;
    }

    /* renamed from: r */
    public void m27612r(int i10, int i11) {
        int i12 = (i11 * this.f22485c) + (i10 / 32);
        int[] iArr = this.f22486d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    /* renamed from: s */
    public void m27613s(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f22484b || i14 > this.f22483a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f22485c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f22486d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    /* renamed from: t */
    public void m27614t(int i10, C9263a c9263a) {
        int[] m27587i = c9263a.m27587i();
        int[] iArr = this.f22486d;
        int i11 = this.f22485c;
        System.arraycopy(m27587i, 0, iArr, i10 * i11, i11);
    }

    public String toString() {
        return m27615u("X ", "  ");
    }

    /* renamed from: u */
    public String m27615u(String str, String str2) {
        return m27598a(str, str2, "\n");
    }
}
