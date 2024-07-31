package p363t8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.Charset;

/* renamed from: t8.d0 */
/* loaded from: classes.dex */
public final class C11144d0 {

    /* renamed from: a */
    public byte[] f28941a;

    /* renamed from: b */
    private int f28942b;

    /* renamed from: c */
    private int f28943c;

    /* renamed from: d */
    private int f28944d;

    public C11144d0() {
        this.f28941a = C11172r0.f29045f;
    }

    public C11144d0(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C11144d0(byte[] bArr, int i10) {
        this.f28941a = bArr;
        this.f28944d = i10;
    }

    /* renamed from: a */
    private void m34625a() {
        int i10;
        int i11 = this.f28942b;
        C11137a.m34605g(i11 >= 0 && (i11 < (i10 = this.f28944d) || (i11 == i10 && this.f28943c == 0)));
    }

    /* renamed from: b */
    public int m34626b() {
        return ((this.f28944d - this.f28942b) * 8) - this.f28943c;
    }

    /* renamed from: c */
    public void m34627c() {
        if (this.f28943c == 0) {
            return;
        }
        this.f28943c = 0;
        this.f28942b++;
        m34625a();
    }

    /* renamed from: d */
    public int m34628d() {
        C11137a.m34605g(this.f28943c == 0);
        return this.f28942b;
    }

    /* renamed from: e */
    public int m34629e() {
        return (this.f28942b * 8) + this.f28943c;
    }

    /* renamed from: f */
    public void m34630f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f28943c, i11);
        int i12 = this.f28943c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f28941a;
        int i14 = this.f28942b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f28941a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f28941a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        m34642r(i11);
        m34625a();
    }

    /* renamed from: g */
    public boolean m34631g() {
        boolean z10 = (this.f28941a[this.f28942b] & (RecognitionOptions.ITF >> this.f28943c)) != 0;
        m34641q();
        return z10;
    }

    /* renamed from: h */
    public int m34632h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f28943c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f28943c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f28943c = i13;
            byte[] bArr = this.f28941a;
            int i14 = this.f28942b;
            this.f28942b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f28941a;
        int i15 = this.f28942b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f28943c = 0;
            this.f28942b = i15 + 1;
        }
        m34625a();
        return i16;
    }

    /* renamed from: i */
    public void m34633i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f28941a;
            int i13 = this.f28942b;
            int i14 = i13 + 1;
            this.f28942b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f28943c;
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
        int i17 = this.f28943c;
        if (i17 + i16 > 8) {
            byte[] bArr3 = this.f28941a;
            int i18 = this.f28942b;
            this.f28942b = i18 + 1;
            bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
            this.f28943c = i17 - 8;
        }
        int i19 = this.f28943c + i16;
        this.f28943c = i19;
        byte[] bArr4 = this.f28941a;
        int i20 = this.f28942b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
        if (i19 == 8) {
            this.f28943c = 0;
            this.f28942b = i20 + 1;
        }
        m34625a();
    }

    /* renamed from: j */
    public long m34634j(int i10) {
        return i10 <= 32 ? C11172r0.m34905Y0(m34632h(i10)) : C11172r0.m34903X0(m34632h(i10 - 32), m34632h(32));
    }

    /* renamed from: k */
    public void m34635k(byte[] bArr, int i10, int i11) {
        C11137a.m34605g(this.f28943c == 0);
        System.arraycopy(this.f28941a, this.f28942b, bArr, i10, i11);
        this.f28942b += i11;
        m34625a();
    }

    /* renamed from: l */
    public String m34636l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        m34635k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    /* renamed from: m */
    public void m34637m(C11146e0 c11146e0) {
        m34639o(c11146e0.m34682e(), c11146e0.m34684g());
        m34640p(c11146e0.m34683f() * 8);
    }

    /* renamed from: n */
    public void m34638n(byte[] bArr) {
        m34639o(bArr, bArr.length);
    }

    /* renamed from: o */
    public void m34639o(byte[] bArr, int i10) {
        this.f28941a = bArr;
        this.f28942b = 0;
        this.f28943c = 0;
        this.f28944d = i10;
    }

    /* renamed from: p */
    public void m34640p(int i10) {
        int i11 = i10 / 8;
        this.f28942b = i11;
        this.f28943c = i10 - (i11 * 8);
        m34625a();
    }

    /* renamed from: q */
    public void m34641q() {
        int i10 = this.f28943c + 1;
        this.f28943c = i10;
        if (i10 == 8) {
            this.f28943c = 0;
            this.f28942b++;
        }
        m34625a();
    }

    /* renamed from: r */
    public void m34642r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f28942b + i11;
        this.f28942b = i12;
        int i13 = this.f28943c + (i10 - (i11 * 8));
        this.f28943c = i13;
        if (i13 > 7) {
            this.f28942b = i12 + 1;
            this.f28943c = i13 - 8;
        }
        m34625a();
    }

    /* renamed from: s */
    public void m34643s(int i10) {
        C11137a.m34605g(this.f28943c == 0);
        this.f28942b += i10;
        m34625a();
    }
}
