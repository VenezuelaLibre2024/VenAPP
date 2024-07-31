package ih;

import android.graphics.Rect;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f17796a;

    /* renamed from: b, reason: collision with root package name */
    private int f17797b;

    /* renamed from: c, reason: collision with root package name */
    private int f17798c;

    public m(byte[] bArr, int i10, int i11) {
        this.f17796a = bArr;
        this.f17797b = i10;
        this.f17798c = i11;
    }

    public static byte[] e(byte[] bArr, int i10, int i11) {
        int i12 = i10 * i11;
        byte[] bArr2 = new byte[i12];
        int i13 = i12 - 1;
        for (int i14 = 0; i14 < i12; i14++) {
            bArr2[i13] = bArr[i14];
            i13--;
        }
        return bArr2;
    }

    public static byte[] f(byte[] bArr, int i10, int i11) {
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

    public static byte[] g(byte[] bArr, int i10, int i11) {
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

    public m a(Rect rect, int i10) {
        int width = rect.width() / i10;
        int height = rect.height() / i10;
        int i11 = rect.top;
        byte[] bArr = new byte[width * height];
        if (i10 == 1) {
            int i12 = (i11 * this.f17797b) + rect.left;
            for (int i13 = 0; i13 < height; i13++) {
                System.arraycopy(this.f17796a, i12, bArr, i13 * width, width);
                i12 += this.f17797b;
            }
        } else {
            int i14 = (i11 * this.f17797b) + rect.left;
            for (int i15 = 0; i15 < height; i15++) {
                int i16 = i15 * width;
                int i17 = i14;
                for (int i18 = 0; i18 < width; i18++) {
                    bArr[i16] = this.f17796a[i17];
                    i17 += i10;
                    i16++;
                }
                i14 += this.f17797b * i10;
            }
        }
        return new m(bArr, width, height);
    }

    public byte[] b() {
        return this.f17796a;
    }

    public int c() {
        return this.f17798c;
    }

    public int d() {
        return this.f17797b;
    }

    public m h(int i10) {
        return i10 != 90 ? i10 != 180 ? i10 != 270 ? this : new m(f(this.f17796a, this.f17797b, this.f17798c), this.f17798c, this.f17797b) : new m(e(this.f17796a, this.f17797b, this.f17798c), this.f17797b, this.f17798c) : new m(g(this.f17796a, this.f17797b, this.f17798c), this.f17798c, this.f17797b);
    }
}
