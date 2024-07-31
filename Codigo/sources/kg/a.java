package kg;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f20658c = new int[0];

    /* renamed from: a, reason: collision with root package name */
    private int[] f20659a;

    /* renamed from: b, reason: collision with root package name */
    private int f20660b;

    public a() {
        this.f20660b = 0;
        this.f20659a = f20658c;
    }

    public a(int i10) {
        this.f20660b = i10;
        this.f20659a = q(i10);
    }

    a(int[] iArr, int i10) {
        this.f20659a = iArr;
        this.f20660b = i10;
    }

    private void g(int i10) {
        if (i10 > this.f20659a.length * 32) {
            int[] q10 = q((int) Math.ceil(i10 / 0.75f));
            int[] iArr = this.f20659a;
            System.arraycopy(iArr, 0, q10, 0, iArr.length);
            this.f20659a = q10;
        }
    }

    private static int[] q(int i10) {
        return new int[(i10 + 31) / 32];
    }

    public void a(boolean z10) {
        g(this.f20660b + 1);
        if (z10) {
            int[] iArr = this.f20659a;
            int i10 = this.f20660b;
            int i11 = i10 / 32;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        }
        this.f20660b++;
    }

    public void b(a aVar) {
        int i10 = aVar.f20660b;
        g(this.f20660b + i10);
        for (int i11 = 0; i11 < i10; i11++) {
            a(aVar.h(i11));
        }
    }

    public void c(int i10, int i11) {
        if (i11 < 0 || i11 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i12 = this.f20660b;
        g(i12 + i11);
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            if (((1 << i13) & i10) != 0) {
                int[] iArr = this.f20659a;
                int i14 = i12 / 32;
                iArr[i14] = iArr[i14] | (1 << (i12 & 31));
            }
            i12++;
        }
        this.f20660b = i12;
    }

    public void d() {
        int length = this.f20659a.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f20659a[i10] = 0;
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f20659a.clone(), this.f20660b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f20660b == aVar.f20660b && Arrays.equals(this.f20659a, aVar.f20659a);
    }

    public boolean h(int i10) {
        return ((1 << (i10 & 31)) & this.f20659a[i10 / 32]) != 0;
    }

    public int hashCode() {
        return (this.f20660b * 31) + Arrays.hashCode(this.f20659a);
    }

    public int[] i() {
        return this.f20659a;
    }

    public int j(int i10) {
        int i11 = this.f20660b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & this.f20659a[i12];
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f20659a;
            if (i12 == iArr.length) {
                return this.f20660b;
            }
            i13 = iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f20660b);
    }

    public int k(int i10) {
        int i11 = this.f20660b;
        if (i10 >= i11) {
            return i11;
        }
        int i12 = i10 / 32;
        int i13 = (-(1 << (i10 & 31))) & (~this.f20659a[i12]);
        while (i13 == 0) {
            i12++;
            int[] iArr = this.f20659a;
            if (i12 == iArr.length) {
                return this.f20660b;
            }
            i13 = ~iArr[i12];
        }
        return Math.min((i12 * 32) + Integer.numberOfTrailingZeros(i13), this.f20660b);
    }

    public int l() {
        return this.f20660b;
    }

    public int m() {
        return (this.f20660b + 7) / 8;
    }

    public boolean p(int i10, int i11, boolean z10) {
        if (i11 < i10 || i10 < 0 || i11 > this.f20660b) {
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
            int i17 = this.f20659a[i15] & i16;
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

    public void r() {
        int[] iArr = new int[this.f20659a.length];
        int i10 = (this.f20660b - 1) / 32;
        int i11 = i10 + 1;
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i10 - i12] = Integer.reverse(this.f20659a[i12]);
        }
        int i13 = this.f20660b;
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
        this.f20659a = iArr;
    }

    public void s(int i10) {
        int[] iArr = this.f20659a;
        int i11 = i10 / 32;
        iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
    }

    public void t(int i10, int i11) {
        this.f20659a[i10 / 32] = i11;
    }

    public String toString() {
        int i10 = this.f20660b;
        StringBuilder sb2 = new StringBuilder(i10 + (i10 / 8) + 1);
        for (int i11 = 0; i11 < this.f20660b; i11++) {
            if ((i11 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(h(i11) ? 'X' : '.');
        }
        return sb2.toString();
    }

    public void u(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = 0;
            for (int i15 = 0; i15 < 8; i15++) {
                if (h(i10)) {
                    i14 |= 1 << (7 - i15);
                }
                i10++;
            }
            bArr[i11 + i13] = (byte) i14;
        }
    }

    public void v(a aVar) {
        if (this.f20660b != aVar.f20660b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i10 = 0;
        while (true) {
            int[] iArr = this.f20659a;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = iArr[i10] ^ aVar.f20659a[i10];
            i10++;
        }
    }
}
