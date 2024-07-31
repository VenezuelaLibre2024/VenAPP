package p396v6;

import java.nio.ShortBuffer;
import java.util.Arrays;
import p363t8.C11137a;

/* renamed from: v6.w0 */
/* loaded from: classes.dex */
final class C11676w0 {

    /* renamed from: a */
    private final int f30519a;

    /* renamed from: b */
    private final int f30520b;

    /* renamed from: c */
    private final float f30521c;

    /* renamed from: d */
    private final float f30522d;

    /* renamed from: e */
    private final float f30523e;

    /* renamed from: f */
    private final int f30524f;

    /* renamed from: g */
    private final int f30525g;

    /* renamed from: h */
    private final int f30526h;

    /* renamed from: i */
    private final short[] f30527i;

    /* renamed from: j */
    private short[] f30528j;

    /* renamed from: k */
    private int f30529k;

    /* renamed from: l */
    private short[] f30530l;

    /* renamed from: m */
    private int f30531m;

    /* renamed from: n */
    private short[] f30532n;

    /* renamed from: o */
    private int f30533o;

    /* renamed from: p */
    private int f30534p;

    /* renamed from: q */
    private int f30535q;

    /* renamed from: r */
    private int f30536r;

    /* renamed from: s */
    private int f30537s;

    /* renamed from: t */
    private int f30538t;

    /* renamed from: u */
    private int f30539u;

    /* renamed from: v */
    private int f30540v;

    public C11676w0(int i10, int i11, float f10, float f11, int i12) {
        this.f30519a = i10;
        this.f30520b = i11;
        this.f30521c = f10;
        this.f30522d = f11;
        this.f30523e = i10 / i12;
        this.f30524f = i10 / 400;
        int i13 = i10 / 65;
        this.f30525g = i13;
        int i14 = i13 * 2;
        this.f30526h = i14;
        this.f30527i = new short[i14];
        this.f30528j = new short[i14 * i11];
        this.f30530l = new short[i14 * i11];
        this.f30532n = new short[i14 * i11];
    }

    /* renamed from: a */
    private void m36746a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f30531m == i10) {
            return;
        }
        int i13 = this.f30519a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        m36756o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f30533o;
            if (i15 >= i16 - 1) {
                m36760u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f30534p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f30535q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f30530l = m36751f(this.f30530l, this.f30531m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f30520b;
                    if (i18 < i19) {
                        this.f30530l[(this.f30531m * i19) + i18] = m36755n(this.f30532n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f30535q++;
                this.f30531m++;
            }
            int i20 = i11 + 1;
            this.f30534p = i20;
            if (i20 == i13) {
                this.f30534p = 0;
                C11137a.m34605g(i12 == i14);
                this.f30535q = 0;
            }
            i15++;
        }
    }

    /* renamed from: b */
    private void m36747b(float f10) {
        int m36762w;
        int i10 = this.f30529k;
        if (i10 < this.f30526h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f30536r > 0) {
                m36762w = m36748c(i11);
            } else {
                int m36752g = m36752g(this.f30528j, i11);
                m36762w = ((double) f10) > 1.0d ? m36752g + m36762w(this.f30528j, i11, f10, m36752g) : m36754m(this.f30528j, i11, f10, m36752g);
            }
            i11 += m36762w;
        } while (this.f30526h + i11 <= i10);
        m36761v(i11);
    }

    /* renamed from: c */
    private int m36748c(int i10) {
        int min = Math.min(this.f30526h, this.f30536r);
        m36749d(this.f30528j, i10, min);
        this.f30536r -= min;
        return min;
    }

    /* renamed from: d */
    private void m36749d(short[] sArr, int i10, int i11) {
        short[] m36751f = m36751f(this.f30530l, this.f30531m, i11);
        this.f30530l = m36751f;
        int i12 = this.f30520b;
        System.arraycopy(sArr, i10 * i12, m36751f, this.f30531m * i12, i12 * i11);
        this.f30531m += i11;
    }

    /* renamed from: e */
    private void m36750e(short[] sArr, int i10, int i11) {
        int i12 = this.f30526h / i11;
        int i13 = this.f30520b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f30527i[i16] = (short) (i17 / i14);
        }
    }

    /* renamed from: f */
    private short[] m36751f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f30520b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    /* renamed from: g */
    private int m36752g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f30519a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f30520b == 1 && i13 == 1) {
            i11 = m36753h(sArr, i10, this.f30524f, this.f30525g);
        } else {
            m36750e(sArr, i10, i13);
            int m36753h = m36753h(this.f30527i, 0, this.f30524f / i13, this.f30525g / i13);
            if (i13 != 1) {
                int i14 = m36753h * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f30524f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f30525g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f30520b == 1) {
                    i11 = m36753h(sArr, i10, i16, i17);
                } else {
                    m36750e(sArr, i10, 1);
                    i11 = m36753h(this.f30527i, 0, i16, i17);
                }
            } else {
                i11 = m36753h;
            }
        }
        int i20 = m36758q(this.f30539u, this.f30540v) ? this.f30537s : i11;
        this.f30538t = this.f30539u;
        this.f30537s = i11;
        return i20;
    }

    /* renamed from: h */
    private int m36753h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f30520b;
        int i14 = 255;
        int i15 = 1;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i15 * i11) {
                i16 = i11;
                i15 = i18;
            }
            if (i18 * i14 > i17 * i11) {
                i14 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f30539u = i15 / i16;
        this.f30540v = i17 / i14;
        return i16;
    }

    /* renamed from: m */
    private int m36754m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f30536r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] m36751f = m36751f(this.f30530l, this.f30531m, i13);
        this.f30530l = m36751f;
        int i14 = this.f30520b;
        System.arraycopy(sArr, i10 * i14, m36751f, this.f30531m * i14, i14 * i11);
        m36757p(i12, this.f30520b, this.f30530l, this.f30531m + i11, sArr, i10 + i11, sArr, i10);
        this.f30531m += i13;
        return i12;
    }

    /* renamed from: n */
    private short m36755n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f30520b];
        int i13 = this.f30535q * i11;
        int i14 = this.f30534p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    /* renamed from: o */
    private void m36756o(int i10) {
        int i11 = this.f30531m - i10;
        short[] m36751f = m36751f(this.f30532n, this.f30533o, i11);
        this.f30532n = m36751f;
        short[] sArr = this.f30530l;
        int i12 = this.f30520b;
        System.arraycopy(sArr, i10 * i12, m36751f, this.f30533o * i12, i12 * i11);
        this.f30531m = i10;
        this.f30533o += i11;
    }

    /* renamed from: p */
    private static void m36757p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr2[i18] * (i10 - i19)) + (sArr3[i17] * i19)) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    /* renamed from: q */
    private boolean m36758q(int i10, int i11) {
        return i10 != 0 && this.f30537s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f30538t * 3;
    }

    /* renamed from: r */
    private void m36759r() {
        int i10 = this.f30531m;
        float f10 = this.f30521c;
        float f11 = this.f30522d;
        float f12 = f10 / f11;
        float f13 = this.f30523e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            m36747b(f12);
        } else {
            m36749d(this.f30528j, 0, this.f30529k);
            this.f30529k = 0;
        }
        if (f13 != 1.0f) {
            m36746a(f13, i10);
        }
    }

    /* renamed from: u */
    private void m36760u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f30532n;
        int i11 = this.f30520b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f30533o - i10) * i11);
        this.f30533o -= i10;
    }

    /* renamed from: v */
    private void m36761v(int i10) {
        int i11 = this.f30529k - i10;
        short[] sArr = this.f30528j;
        int i12 = this.f30520b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f30529k = i11;
    }

    /* renamed from: w */
    private int m36762w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f30536r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] m36751f = m36751f(this.f30530l, this.f30531m, i12);
        this.f30530l = m36751f;
        m36757p(i12, this.f30520b, m36751f, this.f30531m, sArr, i10, sArr, i10 + i11);
        this.f30531m += i12;
        return i12;
    }

    /* renamed from: i */
    public void m36763i() {
        this.f30529k = 0;
        this.f30531m = 0;
        this.f30533o = 0;
        this.f30534p = 0;
        this.f30535q = 0;
        this.f30536r = 0;
        this.f30537s = 0;
        this.f30538t = 0;
        this.f30539u = 0;
        this.f30540v = 0;
    }

    /* renamed from: j */
    public void m36764j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f30520b, this.f30531m);
        shortBuffer.put(this.f30530l, 0, this.f30520b * min);
        int i10 = this.f30531m - min;
        this.f30531m = i10;
        short[] sArr = this.f30530l;
        int i11 = this.f30520b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    /* renamed from: k */
    public int m36765k() {
        return this.f30531m * this.f30520b * 2;
    }

    /* renamed from: l */
    public int m36766l() {
        return this.f30529k * this.f30520b * 2;
    }

    /* renamed from: s */
    public void m36767s() {
        int i10;
        int i11 = this.f30529k;
        float f10 = this.f30521c;
        float f11 = this.f30522d;
        int i12 = this.f30531m + ((int) ((((i11 / (f10 / f11)) + this.f30533o) / (this.f30523e * f11)) + 0.5f));
        this.f30528j = m36751f(this.f30528j, i11, (this.f30526h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f30526h;
            int i14 = this.f30520b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f30528j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f30529k += i10 * 2;
        m36759r();
        if (this.f30531m > i12) {
            this.f30531m = i12;
        }
        this.f30529k = 0;
        this.f30536r = 0;
        this.f30533o = 0;
    }

    /* renamed from: t */
    public void m36768t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f30520b;
        int i11 = remaining / i10;
        short[] m36751f = m36751f(this.f30528j, this.f30529k, i11);
        this.f30528j = m36751f;
        shortBuffer.get(m36751f, this.f30529k * this.f30520b, ((i10 * i11) * 2) / 2);
        this.f30529k += i11;
        m36759r();
    }
}
