package t8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f26645a;

    /* renamed from: b, reason: collision with root package name */
    private int f26646b;

    /* renamed from: c, reason: collision with root package name */
    private int f26647c;

    /* renamed from: d, reason: collision with root package name */
    private int f26648d;

    public d0() {
        this.f26645a = r0.f26749f;
    }

    public d0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public d0(byte[] bArr, int i10) {
        this.f26645a = bArr;
        this.f26648d = i10;
    }

    private void a() {
        int i10;
        int i11 = this.f26646b;
        a.g(i11 >= 0 && (i11 < (i10 = this.f26648d) || (i11 == i10 && this.f26647c == 0)));
    }

    public int b() {
        return ((this.f26648d - this.f26646b) * 8) - this.f26647c;
    }

    public void c() {
        if (this.f26647c == 0) {
            return;
        }
        this.f26647c = 0;
        this.f26646b++;
        a();
    }

    public int d() {
        a.g(this.f26647c == 0);
        return this.f26646b;
    }

    public int e() {
        return (this.f26646b * 8) + this.f26647c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f26647c, i11);
        int i12 = this.f26647c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f26645a;
        int i14 = this.f26646b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f26645a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f26645a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f26645a[this.f26646b] & (RecognitionOptions.ITF >> this.f26647c)) != 0;
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f26647c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f26647c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f26647c = i13;
            byte[] bArr = this.f26645a;
            int i14 = this.f26646b;
            this.f26646b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f26645a;
        int i15 = this.f26646b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f26647c = 0;
            this.f26646b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f26645a;
            int i13 = this.f26646b;
            int i14 = i13 + 1;
            this.f26646b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f26647c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i12] & (255 >> i16));
        bArr[i12] = b12;
        int i17 = this.f26647c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f26645a;
            int i18 = this.f26646b;
            this.f26646b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f26647c = i17 - 8;
        }
        int i19 = this.f26647c + i16;
        this.f26647c = i19;
        byte[] bArr4 = this.f26645a;
        int i20 = this.f26646b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f26647c = 0;
            this.f26646b = i20 + 1;
        }
        a();
    }

    public long j(int i10) {
        return i10 <= 32 ? r0.Y0(h(i10)) : r0.X0(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        a.g(this.f26647c == 0);
        System.arraycopy(this.f26645a, this.f26646b, bArr, i10, i11);
        this.f26646b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(e0 e0Var) {
        o(e0Var.e(), e0Var.g());
        p(e0Var.f() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.f26645a = bArr;
        this.f26646b = 0;
        this.f26647c = 0;
        this.f26648d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f26646b = i11;
        this.f26647c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f26647c + 1;
        this.f26647c = i10;
        if (i10 == 8) {
            this.f26647c = 0;
            this.f26646b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f26646b + i11;
        this.f26646b = i12;
        int i13 = this.f26647c + (i10 - (i11 * 8));
        this.f26647c = i13;
        if (i13 > 7) {
            this.f26646b = i12 + 1;
            this.f26647c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        a.g(this.f26647c == 0);
        this.f26646b += i10;
        a();
    }
}
