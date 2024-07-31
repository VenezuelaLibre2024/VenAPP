package kg;

import java.util.Arrays;

/* renamed from: kg.a */
/* loaded from: classes2.dex */
public final class C9263a implements Cloneable {

    /* renamed from: c */
    private static final int[] f22480c = new int[0];

    /* renamed from: a */
    private int[] f22481a;

    /* renamed from: b */
    private int f22482b;

    public C9263a() {
        this.f22482b = 0;
        this.f22481a = f22480c;
    }

    public C9263a(int i10) {
        this.f22482b = i10;
        this.f22481a = m27580q(i10);
    }

    C9263a(int[] iArr, int i10) {
        this.f22481a = iArr;
        this.f22482b = i10;
    }

    /* renamed from: g */
    private void m27579g(int i10) {
        if (i10 > this.f22481a.length * 32) {
            int[] m27580q = m27580q((int) Math.ceil(i10 / 0.75f));
            int[] iArr = this.f22481a;
            System.arraycopy(iArr, 0, m27580q, 0, iArr.length);
            this.f22481a = m27580q;
        }
    }

    /* renamed from: q */
    private static int[] m27580q(int i10) {
        return new int[(i10 + 31) / 32];
    }

    /* renamed from: a */
    public void m27581a(boolean z10) {
        m27579g(this.f22482b + 1);
        if (z10) {
            int[] iArr = this.f22481a;
            int i10 = this.f22482b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f22482b++;
    }

    /* renamed from: b */
    public void m27582b(C9263a c9263a) {
        int i10 = c9263a.f22482b;
        m27579g(this.f22482b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            m27581a(c9263a.m27586h(i11));
        }
    }

    /* renamed from: c */
    public void m27583c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f22482b;
        m27579g(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f22481a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f22482b = i12;
    }

    /* renamed from: d */
    public void m27584d() {
        int length = this.f22481a.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f22481a[i10] = 0;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C9263a clone() {
        return new C9263a((int[]) this.f22481a.clone(), this.f22482b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9263a)) {
            return false;
        }
        C9263a c9263a = (C9263a) obj;
        return this.f22482b == c9263a.f22482b && Arrays.equals(this.f22481a, c9263a.f22481a);
    }

    /* renamed from: h */
    public boolean m27586h(int i10) {
        return ((1 << (i10 & 31)) & this.f22481a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f22482b * 31) + Arrays.hashCode(this.f22481a);
    }

    /* renamed from: i */
    public int[] m27587i() {
        return this.f22481a;
    }

    /* renamed from: j */
    public int m27588j(int i10) {
        int i11 = this.f22482b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f22481a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f22481a;
            if (i12 == iArr.length) {
                return this.f22482b;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f22482b);
    }

    /* renamed from: k */
    public int m27589k(int i10) {
        int i11 = this.f22482b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f22481a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f22481a;
            if (i12 == iArr.length) {
                return this.f22482b;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f22482b);
    }

    /* renamed from: l */
    public int m27590l() {
        return this.f22482b;
    }

    /* renamed from: m */
    public int m27591m() {
        return (this.f22482b + 7) / 8;
    }

    /* renamed from: p */
    public boolean m27592p(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f22482b) {
            throw new IllegalArgumentException();
        }
        if (i11 == i10) {
            return true;
        }
        int i12 = i11 - 1;
        int i13 = i10 / 32;
        int i14 = i12 / 32;
        int i15 = i13;
        while (i15 <= i14) {
            int i16 = (2 << (i15 >= i14 ? 31 & i12 : 31)) - (1 << (i15 > i13 ? 0 : i10 & 31));
            int i17 = this.f22481a[i15] & i16;
            if (!z10) {
                i16 = 0;
            }
            if (i17 != i16) {
                return false;
            }
            i15++;
        }
        return true;
    }

    /* renamed from: r */
    public void m27593r() {
        int[] iArr = new int[this.f22481a.length];
        int i10 = (this.f22482b - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 - i12] = Integer.reverse(this.f22481a[i12]);
        }
        int i13 = this.f22482b;
        int i14 = i11 * 32;
        if (i13 != i14) {
            int i15 = i14 - i13;
            int i16 = iArr[0] >>> i15;
            for (int i17 = 1; i17 < i11; i17++) {
                int i18 = iArr[i17];
                iArr[i17 - 1] = i16 | (i18 << (32 - i15));
                i16 = i18 >>> i15;
            }
            iArr[i11 - 1] = i16;
        }
        this.f22481a = iArr;
    }

    /* renamed from: s */
    public void m27594s(int i10) {
        int[] iArr = this.f22481a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    /* renamed from: t */
    public void m27595t(int i10, int i11) {
        this.f22481a[i10 / 32] = i11;
    }

    public String toString() {
        int i10 = this.f22482b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f22482b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(m27586h(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public void m27596u(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (m27586h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    /* renamed from: v */
    public void m27597v(C9263a c9263a) {
        if (this.f22482b != c9263a.f22482b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f22481a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ c9263a.f22481a[i10];
            i10++;
        }
    }
}
