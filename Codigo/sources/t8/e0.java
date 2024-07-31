package t8;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d */
    private static final char[] f26651d = {'\r', '\n'};

    /* renamed from: e */
    private static final char[] f26652e = {'\n'};

    /* renamed from: f */
    private static final com.google.common.collect.a0<Charset> f26653f = com.google.common.collect.a0.z(eb.e.f14594a, eb.e.f14596c, eb.e.f14599f, eb.e.f14597d, eb.e.f14598e);

    /* renamed from: a */
    private byte[] f26654a;

    /* renamed from: b */
    private int f26655b;

    /* renamed from: c */
    private int f26656c;

    public e0() {
        this.f26654a = r0.f26749f;
    }

    public e0(int i10) {
        this.f26654a = new byte[i10];
        this.f26656c = i10;
    }

    public e0(byte[] bArr) {
        this.f26654a = bArr;
        this.f26656c = bArr.length;
    }

    public e0(byte[] bArr, int i10) {
        this.f26654a = bArr;
        this.f26656c = i10;
    }

    private void W(Charset charset) {
        if (m(charset, f26651d) == '\r') {
            m(charset, f26652e);
        }
    }

    private int d(Charset charset) {
        int i10;
        if (charset.equals(eb.e.f14596c) || charset.equals(eb.e.f14594a)) {
            i10 = 1;
        } else {
            if (!charset.equals(eb.e.f14599f) && !charset.equals(eb.e.f14598e) && !charset.equals(eb.e.f14597d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        }
        int i11 = this.f26655b;
        while (true) {
            int i12 = this.f26656c;
            if (i11 >= i12 - (i10 - 1)) {
                return i12;
            }
            if ((charset.equals(eb.e.f14596c) || charset.equals(eb.e.f14594a)) && r0.v0(this.f26654a[i11])) {
                return i11;
            }
            if (charset.equals(eb.e.f14599f) || charset.equals(eb.e.f14597d)) {
                byte[] bArr = this.f26654a;
                if (bArr[i11] == 0 && r0.v0(bArr[i11 + 1])) {
                    return i11;
                }
            }
            if (charset.equals(eb.e.f14598e)) {
                byte[] bArr2 = this.f26654a;
                if (bArr2[i11 + 1] == 0 && r0.v0(bArr2[i11])) {
                    return i11;
                }
            }
            i11 += i10;
        }
    }

    private int i(Charset charset) {
        byte a10;
        char c10;
        int i10 = 1;
        if ((charset.equals(eb.e.f14596c) || charset.equals(eb.e.f14594a)) && a() >= 1) {
            a10 = (byte) hb.b.a(hb.h.a(this.f26654a[this.f26655b]));
        } else {
            if ((charset.equals(eb.e.f14599f) || charset.equals(eb.e.f14597d)) && a() >= 2) {
                byte[] bArr = this.f26654a;
                int i11 = this.f26655b;
                c10 = hb.b.c(bArr[i11], bArr[i11 + 1]);
            } else {
                if (!charset.equals(eb.e.f14598e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f26654a;
                int i12 = this.f26655b;
                c10 = hb.b.c(bArr2[i12 + 1], bArr2[i12]);
            }
            a10 = (byte) c10;
            i10 = 2;
        }
        return (hb.b.a(a10) << 16) + i10;
    }

    private char m(Charset charset, char[] cArr) {
        int i10 = i(charset);
        if (i10 == 0) {
            return (char) 0;
        }
        char c10 = (char) (i10 >> 16);
        if (!hb.b.b(cArr, c10)) {
            return (char) 0;
        }
        this.f26655b += i10 & 65535;
        return c10;
    }

    public long A() {
        byte[] bArr = this.f26654a;
        long j10 = (bArr[r1] & 255) << 56;
        int i10 = this.f26655b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j12 = j11 | ((bArr[i10] & 255) << 32);
        long j13 = j12 | ((bArr[r3] & 255) << 24);
        long j14 = j13 | ((bArr[r4] & 255) << 16);
        long j15 = j14 | ((bArr[r3] & 255) << 8);
        this.f26655b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | (bArr[r4] & 255);
    }

    public String B() {
        return n((char) 0);
    }

    public String C(int i10) {
        if (i10 == 0) {
            return "";
        }
        int i11 = this.f26655b;
        int i12 = (i11 + i10) - 1;
        String E = r0.E(this.f26654a, i11, (i12 >= this.f26656c || this.f26654a[i12] != 0) ? i10 : i10 - 1);
        this.f26655b += i10;
        return E;
    }

    public short D() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f26655b = i11 + 1;
        return (short) ((bArr[i11] & 255) | i12);
    }

    public String E(int i10) {
        return F(i10, eb.e.f14596c);
    }

    public String F(int i10, Charset charset) {
        String str = new String(this.f26654a, this.f26655b, i10, charset);
        this.f26655b += i10;
        return str;
    }

    public int G() {
        return (H() << 21) | (H() << 14) | (H() << 7) | H();
    }

    public int H() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        this.f26655b = i10 + 1;
        return bArr[i10] & 255;
    }

    public int I() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = (bArr[i11] & 255) | ((bArr[i10] & 255) << 8);
        this.f26655b = i11 + 1 + 2;
        return i12;
    }

    public long J() {
        byte[] bArr = this.f26654a;
        long j10 = (bArr[r1] & 255) << 24;
        int i10 = this.f26655b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f26655b = i10 + 1;
        return j11 | (bArr[i10] & 255);
    }

    public int K() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 16) | ((bArr[i11] & 255) << 8);
        this.f26655b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public int L() {
        int q10 = q();
        if (q10 >= 0) {
            return q10;
        }
        throw new IllegalStateException("Top bit not zero: " + q10);
    }

    public long M() {
        long A = A();
        if (A >= 0) {
            return A;
        }
        throw new IllegalStateException("Top bit not zero: " + A);
    }

    public int N() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & 255) << 8;
        this.f26655b = i11 + 1;
        return (bArr[i11] & 255) | i12;
    }

    public long O() {
        int i10;
        int i11;
        long j10 = this.f26654a[this.f26655b];
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
            if ((this.f26654a[this.f26655b + i10] & 192) != 128) {
                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j10);
            }
            j10 = (j10 << 6) | (r3 & 63);
        }
        this.f26655b += i11;
        return j10;
    }

    public Charset P() {
        if (a() >= 3) {
            byte[] bArr = this.f26654a;
            int i10 = this.f26655b;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                this.f26655b = i10 + 3;
                return eb.e.f14596c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f26654a;
        int i11 = this.f26655b;
        byte b10 = bArr2[i11];
        if (b10 == -2 && bArr2[i11 + 1] == -1) {
            this.f26655b = i11 + 2;
            return eb.e.f14597d;
        }
        if (b10 != -1 || bArr2[i11 + 1] != -2) {
            return null;
        }
        this.f26655b = i11 + 2;
        return eb.e.f14598e;
    }

    public void Q(int i10) {
        S(b() < i10 ? new byte[i10] : this.f26654a, i10);
    }

    public void R(byte[] bArr) {
        S(bArr, bArr.length);
    }

    public void S(byte[] bArr, int i10) {
        this.f26654a = bArr;
        this.f26656c = i10;
        this.f26655b = 0;
    }

    public void T(int i10) {
        a.a(i10 >= 0 && i10 <= this.f26654a.length);
        this.f26656c = i10;
    }

    public void U(int i10) {
        a.a(i10 >= 0 && i10 <= this.f26656c);
        this.f26655b = i10;
    }

    public void V(int i10) {
        U(this.f26655b + i10);
    }

    public int a() {
        return this.f26656c - this.f26655b;
    }

    public int b() {
        return this.f26654a.length;
    }

    public void c(int i10) {
        if (i10 > b()) {
            this.f26654a = Arrays.copyOf(this.f26654a, i10);
        }
    }

    public byte[] e() {
        return this.f26654a;
    }

    public int f() {
        return this.f26655b;
    }

    public int g() {
        return this.f26656c;
    }

    public char h(Charset charset) {
        a.b(f26653f.contains(charset), "Unsupported charset: " + charset);
        return (char) (i(charset) >> 16);
    }

    public int j() {
        return this.f26654a[this.f26655b] & 255;
    }

    public void k(d0 d0Var, int i10) {
        l(d0Var.f26645a, 0, i10);
        d0Var.p(0);
    }

    public void l(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.f26654a, this.f26655b, bArr, i10, i11);
        this.f26655b += i11;
    }

    public String n(char c10) {
        if (a() == 0) {
            return null;
        }
        int i10 = this.f26655b;
        while (i10 < this.f26656c && this.f26654a[i10] != c10) {
            i10++;
        }
        byte[] bArr = this.f26654a;
        int i11 = this.f26655b;
        String E = r0.E(bArr, i11, i10 - i11);
        this.f26655b = i10;
        if (i10 < this.f26656c) {
            this.f26655b = i10 + 1;
        }
        return E;
    }

    public double o() {
        return Double.longBitsToDouble(A());
    }

    public float p() {
        return Float.intBitsToFloat(q());
    }

    public int q() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & 255) << 24) | ((bArr[i11] & 255) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f26655b = i14 + 1;
        return (bArr[i14] & 255) | i15;
    }

    public int r() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        this.f26655b = i12 + 1;
        return (bArr[i12] & 255) | i13;
    }

    public String s() {
        return t(eb.e.f14596c);
    }

    public String t(Charset charset) {
        a.b(f26653f.contains(charset), "Unsupported charset: " + charset);
        if (a() == 0) {
            return null;
        }
        if (!charset.equals(eb.e.f14594a)) {
            P();
        }
        String F = F(d(charset) - this.f26655b, charset);
        if (this.f26655b == this.f26656c) {
            return F;
        }
        W(charset);
        return F;
    }

    public int u() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & 255) | ((bArr[i11] & 255) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f26655b = i14 + 1;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public long v() {
        byte[] bArr = this.f26654a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f26655b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j12 = j11 | ((bArr[i10] & 255) << 24);
        long j13 = j12 | ((bArr[r3] & 255) << 32);
        long j14 = j13 | ((bArr[r4] & 255) << 40);
        long j15 = j14 | ((bArr[r3] & 255) << 48);
        this.f26655b = i10 + 1 + 1 + 1 + 1 + 1;
        return j15 | ((bArr[r4] & 255) << 56);
    }

    public short w() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f26655b = i11 + 1;
        return (short) (((bArr[i11] & 255) << 8) | i12);
    }

    public long x() {
        byte[] bArr = this.f26654a;
        long j10 = bArr[r1] & 255;
        int i10 = this.f26655b + 1 + 1 + 1;
        long j11 = j10 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f26655b = i10 + 1;
        return j11 | ((bArr[i10] & 255) << 24);
    }

    public int y() {
        int u10 = u();
        if (u10 >= 0) {
            return u10;
        }
        throw new IllegalStateException("Top bit not zero: " + u10);
    }

    public int z() {
        byte[] bArr = this.f26654a;
        int i10 = this.f26655b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & 255;
        this.f26655b = i11 + 1;
        return ((bArr[i11] & 255) << 8) | i12;
    }
}
