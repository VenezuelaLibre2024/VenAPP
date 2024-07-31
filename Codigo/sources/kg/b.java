package kg;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f20661a;

    /* renamed from: b, reason: collision with root package name */
    private int f20662b;

    /* renamed from: c, reason: collision with root package name */
    private int f20663c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f20664d;

    public b(int i10) {
        this(i10, i10);
    }

    public b(int i10, int i11) {
        if (i10 < 1 || i11 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f20661a = i10;
        this.f20662b = i11;
        int i12 = (i10 + 31) / 32;
        this.f20663c = i12;
        this.f20664d = new int[i12 * i11];
    }

    private b(int i10, int i11, int i12, int[] iArr) {
        this.f20661a = i10;
        this.f20662b = i11;
        this.f20663c = i12;
        this.f20664d = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(this.f20662b * (this.f20661a + 1));
        for (int i10 = 0; i10 < this.f20662b; i10++) {
            for (int i11 = 0; i11 < this.f20661a; i11++) {
                sb2.append(g(i11, i10) ? str : str2);
            }
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public void b() {
        int length = this.f20664d.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f20664d[i10] = 0;
        }
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f20661a, this.f20662b, this.f20663c, (int[]) this.f20664d.clone());
    }

    public void d() {
        int length = this.f20664d.length;
        for (int i10 = 0; i10 < length; i10++) {
            int[] iArr = this.f20664d;
            iArr[i10] = ~iArr[i10];
        }
    }

    public void e(int i10, int i11) {
        int i12 = (i11 * this.f20663c) + (i10 / 32);
        int[] iArr = this.f20664d;
        iArr[i12] = (1 << (i10 & 31)) ^ iArr[i12];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f20661a == bVar.f20661a && this.f20662b == bVar.f20662b && this.f20663c == bVar.f20663c && Arrays.equals(this.f20664d, bVar.f20664d);
    }

    public boolean g(int i10, int i11) {
        return ((this.f20664d[(i11 * this.f20663c) + (i10 / 32)] >>> (i10 & 31)) & 1) != 0;
    }

    public int[] h() {
        int length = this.f20664d.length - 1;
        while (length >= 0 && this.f20664d[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i10 = this.f20663c;
        int i11 = length / i10;
        int i12 = (length % i10) * 32;
        int i13 = 31;
        while ((this.f20664d[length] >>> i13) == 0) {
            i13--;
        }
        return new int[]{i12 + i13, i11};
    }

    public int hashCode() {
        int i10 = this.f20661a;
        return (((((((i10 * 31) + i10) * 31) + this.f20662b) * 31) + this.f20663c) * 31) + Arrays.hashCode(this.f20664d);
    }

    public int[] i() {
        int i10 = this.f20661a;
        int i11 = this.f20662b;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < this.f20662b; i14++) {
            int i15 = 0;
            while (true) {
                int i16 = this.f20663c;
                if (i15 < i16) {
                    int i17 = this.f20664d[(i16 * i14) + i15];
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

    public int j() {
        return this.f20662b;
    }

    public a k(int i10, a aVar) {
        if (aVar == null || aVar.l() < this.f20661a) {
            aVar = new a(this.f20661a);
        } else {
            aVar.d();
        }
        int i11 = i10 * this.f20663c;
        for (int i12 = 0; i12 < this.f20663c; i12++) {
            aVar.t(i12 * 32, this.f20664d[i11 + i12]);
        }
        return aVar;
    }

    public int[] l() {
        int[] iArr;
        int i10 = 0;
        while (true) {
            iArr = this.f20664d;
            if (i10 >= iArr.length || iArr[i10] != 0) {
                break;
            }
            i10++;
        }
        if (i10 == iArr.length) {
            return null;
        }
        int i11 = this.f20663c;
        int i12 = i10 / i11;
        int i13 = (i10 % i11) * 32;
        int i14 = iArr[i10];
        int i15 = 0;
        while ((i14 << (31 - i15)) == 0) {
            i15++;
        }
        return new int[]{i13 + i15, i12};
    }

    public int m() {
        return this.f20661a;
    }

    public void p() {
        a aVar = new a(this.f20661a);
        a aVar2 = new a(this.f20661a);
        int i10 = (this.f20662b + 1) / 2;
        for (int i11 = 0; i11 < i10; i11++) {
            aVar = k(i11, aVar);
            int i12 = (this.f20662b - 1) - i11;
            aVar2 = k(i12, aVar2);
            aVar.r();
            aVar2.r();
            t(i11, aVar2);
            t(i12, aVar);
        }
    }

    public void q() {
        int i10 = this.f20662b;
        int i11 = this.f20661a;
        int i12 = (i10 + 31) / 32;
        int[] iArr = new int[i12 * i11];
        for (int i13 = 0; i13 < this.f20662b; i13++) {
            for (int i14 = 0; i14 < this.f20661a; i14++) {
                if (((this.f20664d[(this.f20663c * i13) + (i14 / 32)] >>> (i14 & 31)) & 1) != 0) {
                    int i15 = (((i11 - 1) - i14) * i12) + (i13 / 32);
                    iArr[i15] = (1 << (i13 & 31)) | iArr[i15];
                }
            }
        }
        this.f20661a = i10;
        this.f20662b = i11;
        this.f20663c = i12;
        this.f20664d = iArr;
    }

    public void r(int i10, int i11) {
        int i12 = (i11 * this.f20663c) + (i10 / 32);
        int[] iArr = this.f20664d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public void s(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 < 1 || i12 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f20662b || i14 > this.f20661a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f20663c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int[] iArr = this.f20664d;
                int i18 = (i17 / 32) + i16;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public void t(int i10, a aVar) {
        int[] i11 = aVar.i();
        int[] iArr = this.f20664d;
        int i12 = this.f20663c;
        System.arraycopy(i11, 0, iArr, i10 * i12, i12);
    }

    public String toString() {
        return u("X ", "  ");
    }

    public String u(String str, String str2) {
        return a(str, str2, "\n");
    }
}
