package p163ih;

import android.graphics.Rect;

/* renamed from: ih.m */
/* loaded from: classes3.dex */
public class C7996m {

    /* renamed from: a */
    private byte[] f19459a;

    /* renamed from: b */
    private int f19460b;

    /* renamed from: c */
    private int f19461c;

    public C7996m(byte[] bArr, int i10, int i11) {
        this.f19459a = bArr;
        this.f19460b = i10;
        this.f19461c = i11;
    }

    /* renamed from: e */
    public static byte[] m24554e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i13] = bArr[i14];
            i13--;
        }
        return bArr2;
    }

    /* renamed from: f */
    public static byte[] m24555f(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = i11 - 1; i15 >= 0; i15--) {
                bArr2[i13] = bArr[(i15 * i10) + i14];
                i13--;
            }
        }
        return bArr2;
    }

    /* renamed from: g */
    public static byte[] m24556g(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i10 * i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            for (int i14 = i11 - 1; i14 >= 0; i14--) {
                bArr2[i12] = bArr[(i14 * i10) + i13];
                i12++;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public C7996m m24557a(Rect rect, int i10) {
        int width = rect.width() / i10;
        int height = rect.height() / i10;
        int i11 = rect.top;
        byte[] bArr = new byte[width * height];
        if (i10 == 1) {
            int i12 = (i11 * this.f19460b) + rect.left;
            for (int i13 = 0; i13 < height; i13++) {
                System.arraycopy(this.f19459a, i12, bArr, i13 * width, width);
                i12 += this.f19460b;
            }
        } else {
            int i14 = (i11 * this.f19460b) + rect.left;
            for (int i15 = 0; i15 < height; i15++) {
                int i16 = i15 * width;
                int i17 = i14;
                for (int i18 = 0; i18 < width; i18++) {
                    bArr[i16] = this.f19459a[i17];
                    i17 += i10;
                    i16++;
                }
                i14 += this.f19460b * i10;
            }
        }
        return new C7996m(bArr, width, height);
    }

    /* renamed from: b */
    public byte[] m24558b() {
        return this.f19459a;
    }

    /* renamed from: c */
    public int m24559c() {
        return this.f19461c;
    }

    /* renamed from: d */
    public int m24560d() {
        return this.f19460b;
    }

    /* renamed from: h */
    public C7996m m24561h(int i10) {
        return i10 != 90 ? i10 != 180 ? i10 != 270 ? this : new C7996m(m24555f(this.f19459a, this.f19460b, this.f19461c), this.f19461c, this.f19460b) : new C7996m(m24554e(this.f19459a, this.f19460b, this.f19461c), this.f19460b, this.f19461c) : new C7996m(m24556g(this.f19459a, this.f19460b, this.f19461c), this.f19461c, this.f19460b);
    }
}
