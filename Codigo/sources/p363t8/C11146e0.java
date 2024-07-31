package p363t8;

import com.google.common.collect.AbstractC5855a0;
import java.nio.charset.Charset;
import java.util.Arrays;
import p082eb.C7149e;
import p137hb.C7687b;
import p137hb.C7693h;

/* renamed from: t8.e0 */
/* loaded from: classes.dex */
public final class C11146e0 {

    /* renamed from: d */
    private static final char[] f28947d = {'\r', '\n'};

    /* renamed from: e */
    private static final char[] f28948e = {'\n'};

    /* renamed from: f */
    private static final AbstractC5855a0<Charset> f28949f = AbstractC5855a0.m14718z(C7149e.f16017a, C7149e.f16019c, C7149e.f16022f, C7149e.f16020d, C7149e.f16021e);

    /* renamed from: a */
    private byte[] f28950a;

    /* renamed from: b */
    private int f28951b;

    /* renamed from: c */
    private int f28952c;

    public C11146e0() {
        this.f28950a = C11172r0.f29045f;
    }

    public C11146e0(int i10) {
        this.f28950a = new byte[i10];
        this.f28952c = i10;
    }

    public C11146e0(byte[] bArr) {
        this.f28950a = bArr;
        this.f28952c = bArr.length;
    }

    public C11146e0(byte[] bArr, int i10) {
        this.f28950a = bArr;
        this.f28952c = i10;
    }

    /* renamed from: W */
    private void m34653W(Charset charset) {
        if (m34656m(charset, f28947d) == '\r') {
            m34656m(charset, f28948e);
        }
    }

    /* renamed from: d */
    private int m34654d(Charset charset) {
        int i10;
        if (charset.equals(C7149e.f16019c) || charset.equals(C7149e.f16017a)) {
            i10 = 1;
        } else {
            if (!charset.equals(C7149e.f16022f) && !charset.equals(C7149e.f16021e) && !charset.equals(C7149e.f16020d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f28951b;
        while (true) {
            int i12 = this.f28952c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(C7149e.f16019c) || charset.equals(C7149e.f16017a)) && C11172r0.m34953v0(this.f28950a[i11])) {
                return i11;
            }
            if (charset.equals(C7149e.f16022f) || charset.equals(C7149e.f16020d)) {
                byte[] bArr = this.f28950a;
                if (bArr[i11] == 0 && C11172r0.m34953v0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(C7149e.f16021e)) {
                byte[] bArr2 = this.f28950a;
                if (bArr2[i11 + 1] == 0 && C11172r0.m34953v0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    /* renamed from: i */
    private int m34655i(Charset charset) {
        byte m23406a;
        char m23408c;
        int i10 = 1;
        if ((charset.equals(C7149e.f16019c) || charset.equals(C7149e.f16017a)) && m34679a() >= 1) {
            m23406a = (byte) C7687b.m23406a(C7693h.m23428a(this.f28950a[this.f28951b]));
        } else {
            if ((charset.equals(C7149e.f16022f) || charset.equals(C7149e.f16020d)) && m34679a() >= 2) {
                byte[] bArr = this.f28950a;
                int i11 = this.f28951b;
                m23408c = C7687b.m23408c(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(C7149e.f16021e) || m34679a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f28950a;
                int i12 = this.f28951b;
                m23408c = C7687b.m23408c(bArr2[i12 + 1], bArr2[i12]);
            }
            m23406a = (byte) m23408c;
            i10 = 2;
        }
        return (C7687b.m23406a(m23406a) << 16) + i10;
    }

    /* renamed from: m */
    private char m34656m(Charset charset, char[] cArr) {
        int m34655i = m34655i(charset);
        if (m34655i == 0) {
            return (char) 0;
        }
        char c10 = (char) (m34655i >> 16);
        if (!C7687b.m23407b(cArr, c10)) {
            return (char) 0;
        }
        this.f28951b += m34655i & 65535;
        return c10;
    }

    /* renamed from: A */
    public long m34657A() {
        byte[] bArr = this.f28950a;
        long j10 = (bArr[r1] & 255) << 56;
        int i10 = this.f28951b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j12 = j11 | ((bArr[i10] & 255) << 32);
        long j13 = j12 | ((bArr[r3] & 255) << 24);
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        long j15 = j14 | ((bArr[r3] & 255) << 8);
        this.f28951b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | (bArr[r4] & 255);
    }

    /* renamed from: B */
    public String m34658B() {
        return m34689n((char) 0);
    }

    /* renamed from: C */
    public String m34659C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f28951b;
        int i12 = (i11 + i10) - 1;
        String m34864E = C11172r0.m34864E(this.f28950a, i11, (i12 >= this.f28952c || this.f28950a[i12] != 0) ? i10 : i10 - 1);
        this.f28951b += i10;
        return m34864E;
    }

    /* renamed from: D */
    public short m34660D() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f28951b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    /* renamed from: E */
    public String m34661E(int i10) {
        return m34662F(i10, C7149e.f16019c);
    }

    /* renamed from: F */
    public String m34662F(int i10, Charset charset) {
        String str = new String(this.f28950a, this.f28951b, i10, charset);
        this.f28951b += i10;
        return str;
    }

    /* renamed from: G */
    public int m34663G() {
        return (m34664H() << 21) | (m34664H() << 14) | (m34664H() << 7) | m34664H();
    }

    /* renamed from: H */
    public int m34664H() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        this.f28951b = i10 + 1;
        return bArr[i10] & 255;
    }

    /* renamed from: I */
    public int m34665I() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f28951b = i11 + 1 + 2;
        return i12;
    }

    /* renamed from: J */
    public long m34666J() {
        byte[] bArr = this.f28950a;
        long j10 = (bArr[r1] & 255) << 24;
        int i10 = this.f28951b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f28951b = i10 + 1;
        return j11 | (bArr[i10] & 255);
    }

    /* renamed from: K */
    public int m34667K() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f28951b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    /* renamed from: L */
    public int m34668L() {
        int m34692q = m34692q();
        if (m34692q >= 0) {
            return m34692q;
        }
        throw new IllegalStateException("Top bit not zero: " + m34692q);
    }

    /* renamed from: M */
    public long m34669M() {
        long m34657A = m34657A();
        if (m34657A >= 0) {
            return m34657A;
        }
        throw new IllegalStateException("Top bit not zero: " + m34657A);
    }

    /* renamed from: N */
    public int m34670N() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f28951b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    /* renamed from: O */
    public long m34671O() {
        int i10;
        int i11;
        long j10 = this.f28950a[this.f28951b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j10) != 0) {
                i12--;
            } else if (i12 < 6) {
                j10 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 == 0) {
            throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j10);
        }
        for (i10 = 1; i10 < i11; i10++) {
            if ((this.f28950a[this.f28951b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.f28951b += i11;
        return j10;
    }

    /* renamed from: P */
    public Charset m34672P() {
        if (m34679a() >= 3) {
            byte[] bArr = this.f28950a;
            int i10 = this.f28951b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f28951b = i10 + 3;
                return C7149e.f16019c;
            }
        }
        if (m34679a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f28950a;
        int i11 = this.f28951b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f28951b = i11 + 2;
            return C7149e.f16020d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f28951b = i11 + 2;
        return C7149e.f16021e;
    }

    /* renamed from: Q */
    public void m34673Q(int i10) {
        m34675S(m34680b() < i10 ? new byte[i10] : this.f28950a, i10);
    }

    /* renamed from: R */
    public void m34674R(byte[] bArr) {
        m34675S(bArr, bArr.length);
    }

    /* renamed from: S */
    public void m34675S(byte[] bArr, int i10) {
        this.f28950a = bArr;
        this.f28952c = i10;
        this.f28951b = 0;
    }

    /* renamed from: T */
    public void m34676T(int i10) {
        C11137a.m34599a(i10 >= 0 && i10 <= this.f28950a.length);
        this.f28952c = i10;
    }

    /* renamed from: U */
    public void m34677U(int i10) {
        C11137a.m34599a(i10 >= 0 && i10 <= this.f28952c);
        this.f28951b = i10;
    }

    /* renamed from: V */
    public void m34678V(int i10) {
        m34677U(this.f28951b + i10);
    }

    /* renamed from: a */
    public int m34679a() {
        return this.f28952c - this.f28951b;
    }

    /* renamed from: b */
    public int m34680b() {
        return this.f28950a.length;
    }

    /* renamed from: c */
    public void m34681c(int i10) {
        if (i10 > m34680b()) {
            this.f28950a = Arrays.copyOf(this.f28950a, i10);
        }
    }

    /* renamed from: e */
    public byte[] m34682e() {
        return this.f28950a;
    }

    /* renamed from: f */
    public int m34683f() {
        return this.f28951b;
    }

    /* renamed from: g */
    public int m34684g() {
        return this.f28952c;
    }

    /* renamed from: h */
    public char m34685h(Charset charset) {
        C11137a.m34600b(f28949f.contains(charset), "Unsupported charset: " + charset);
        return (char) (m34655i(charset) >> 16);
    }

    /* renamed from: j */
    public int m34686j() {
        return this.f28950a[this.f28951b] & 255;
    }

    /* renamed from: k */
    public void m34687k(C11144d0 c11144d0, int i10) {
        m34688l(c11144d0.f28941a, 0, i10);
        c11144d0.m34640p(0);
    }

    /* renamed from: l */
    public void m34688l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f28950a, this.f28951b, bArr, i10, i11);
        this.f28951b += i11;
    }

    /* renamed from: n */
    public String m34689n(char c10) {
        if (m34679a() == 0) {
            return null;
        }
        int i10 = this.f28951b;
        while (i10 < this.f28952c && this.f28950a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f28950a;
        int i11 = this.f28951b;
        String m34864E = C11172r0.m34864E(bArr, i11, i10 - i11);
        this.f28951b = i10;
        if (i10 < this.f28952c) {
            this.f28951b = i10 + 1;
        }
        return m34864E;
    }

    /* renamed from: o */
    public double m34690o() {
        return Double.longBitsToDouble(m34657A());
    }

    /* renamed from: p */
    public float m34691p() {
        return Float.intBitsToFloat(m34692q());
    }

    /* renamed from: q */
    public int m34692q() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f28951b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    /* renamed from: r */
    public int m34693r() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f28951b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    /* renamed from: s */
    public String m34694s() {
        return m34695t(C7149e.f16019c);
    }

    /* renamed from: t */
    public String m34695t(Charset charset) {
        C11137a.m34600b(f28949f.contains(charset), "Unsupported charset: " + charset);
        if (m34679a() == 0) {
            return null;
        }
        if (!charset.equals(C7149e.f16017a)) {
            m34672P();
        }
        String m34662F = m34662F(m34654d(charset) - this.f28951b, charset);
        if (this.f28951b == this.f28952c) {
            return m34662F;
        }
        m34653W(charset);
        return m34662F;
    }

    /* renamed from: u */
    public int m34696u() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f28951b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    /* renamed from: v */
    public long m34697v() {
        byte[] bArr = this.f28950a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f28951b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j12 = j11 | ((bArr[i10] & 255) << 24);
        long j13 = j12 | ((bArr[r3] & 255) << 32);
        long j14 = j13 | ((bArr[r4] & 255) << 40);
        long j15 = j14 | ((bArr[r3] & 255) << 48);
        this.f28951b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | ((bArr[r4] & 255) << 56);
    }

    /* renamed from: w */
    public short m34698w() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f28951b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    /* renamed from: x */
    public long m34699x() {
        byte[] bArr = this.f28950a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f28951b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f28951b = i10 + 1;
        return j11 | ((bArr[i10] & 255) << 24);
    }

    /* renamed from: y */
    public int m34700y() {
        int m34696u = m34696u();
        if (m34696u >= 0) {
            return m34696u;
        }
        throw new IllegalStateException("Top bit not zero: " + m34696u);
    }

    /* renamed from: z */
    public int m34701z() {
        byte[] bArr = this.f28950a;
        int i10 = this.f28951b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f28951b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }
}
