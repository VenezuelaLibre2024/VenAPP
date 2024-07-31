package v6;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f28157a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28158b;

    /* renamed from: c, reason: collision with root package name */
    private final float f28159c;

    /* renamed from: d, reason: collision with root package name */
    private final float f28160d;

    /* renamed from: e, reason: collision with root package name */
    private final float f28161e;

    /* renamed from: f, reason: collision with root package name */
    private final int f28162f;

    /* renamed from: g, reason: collision with root package name */
    private final int f28163g;

    /* renamed from: h, reason: collision with root package name */
    private final int f28164h;

    /* renamed from: i, reason: collision with root package name */
    private final short[] f28165i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f28166j;

    /* renamed from: k, reason: collision with root package name */
    private int f28167k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f28168l;

    /* renamed from: m, reason: collision with root package name */
    private int f28169m;

    /* renamed from: n, reason: collision with root package name */
    private short[] f28170n;

    /* renamed from: o, reason: collision with root package name */
    private int f28171o;

    /* renamed from: p, reason: collision with root package name */
    private int f28172p;

    /* renamed from: q, reason: collision with root package name */
    private int f28173q;

    /* renamed from: r, reason: collision with root package name */
    private int f28174r;

    /* renamed from: s, reason: collision with root package name */
    private int f28175s;

    /* renamed from: t, reason: collision with root package name */
    private int f28176t;

    /* renamed from: u, reason: collision with root package name */
    private int f28177u;

    /* renamed from: v, reason: collision with root package name */
    private int f28178v;

    public w0(int i10, int i11, float f10, float f11, int i12) {
        this.f28157a = i10;
        this.f28158b = i11;
        this.f28159c = f10;
        this.f28160d = f11;
        this.f28161e = i10 / i12;
        this.f28162f = i10 / 400;
        int i13 = i10 / 65;
        this.f28163g = i13;
        int i14 = i13 * 2;
        this.f28164h = i14;
        this.f28165i = new short[i14];
        this.f28166j = new short[i14 * i11];
        this.f28168l = new short[i14 * i11];
        this.f28170n = new short[i14 * i11];
    }

    private void a(float f10, int i10) {
        int i11;
        int i12;
        if (this.f28169m == i10) {
            return;
        }
        int i13 = this.f28157a;
        int i14 = (int) (i13 / f10);
        while (true) {
            if (i14 <= 16384 && i13 <= 16384) {
                break;
            }
            i14 /= 2;
            i13 /= 2;
        }
        o(i10);
        int i15 = 0;
        while (true) {
            int i16 = this.f28171o;
            if (i15 >= i16 - 1) {
                u(i16 - 1);
                return;
            }
            while (true) {
                i11 = this.f28172p;
                int i17 = (i11 + 1) * i14;
                i12 = this.f28173q;
                if (i17 <= i12 * i13) {
                    break;
                }
                this.f28168l = f(this.f28168l, this.f28169m, 1);
                int i18 = 0;
                while (true) {
                    int i19 = this.f28158b;
                    if (i18 < i19) {
                        this.f28168l[(this.f28169m * i19) + i18] = n(this.f28170n, (i19 * i15) + i18, i13, i14);
                        i18++;
                    }
                }
                this.f28173q++;
                this.f28169m++;
            }
            int i20 = i11 + 1;
            this.f28172p = i20;
            if (i20 == i13) {
                this.f28172p = 0;
                t8.a.g(i12 == i14);
                this.f28173q = 0;
            }
            i15++;
        }
    }

    private void b(float f10) {
        int w10;
        int i10 = this.f28167k;
        if (i10 < this.f28164h) {
            return;
        }
        int i11 = 0;
        do {
            if (this.f28174r > 0) {
                w10 = c(i11);
            } else {
                int g10 = g(this.f28166j, i11);
                w10 = ((double) f10) > 1.0d ? g10 + w(this.f28166j, i11, f10, g10) : m(this.f28166j, i11, f10, g10);
            }
            i11 += w10;
        } while (this.f28164h + i11 <= i10);
        v(i11);
    }

    private int c(int i10) {
        int min = Math.min(this.f28164h, this.f28174r);
        d(this.f28166j, i10, min);
        this.f28174r -= min;
        return min;
    }

    private void d(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f28168l, this.f28169m, i11);
        this.f28168l = f10;
        int i12 = this.f28158b;
        System.arraycopy(sArr, i10 * i12, f10, this.f28169m * i12, i12 * i11);
        this.f28169m += i11;
    }

    private void e(short[] sArr, int i10, int i11) {
        int i12 = this.f28164h / i11;
        int i13 = this.f28158b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f28165i[i16] = (short) (i17 / i14);
        }
    }

    private short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f28158b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    private int g(short[] sArr, int i10) {
        int i11;
        int i12 = this.f28157a;
        int i13 = i12 > 4000 ? i12 / 4000 : 1;
        if (this.f28158b == 1 && i13 == 1) {
            i11 = h(sArr, i10, this.f28162f, this.f28163g);
        } else {
            e(sArr, i10, i13);
            int h10 = h(this.f28165i, 0, this.f28162f / i13, this.f28163g / i13);
            if (i13 != 1) {
                int i14 = h10 * i13;
                int i15 = i13 * 4;
                int i16 = i14 - i15;
                int i17 = i14 + i15;
                int i18 = this.f28162f;
                if (i16 < i18) {
                    i16 = i18;
                }
                int i19 = this.f28163g;
                if (i17 > i19) {
                    i17 = i19;
                }
                if (this.f28158b == 1) {
                    i11 = h(sArr, i10, i16, i17);
                } else {
                    e(sArr, i10, 1);
                    i11 = h(this.f28165i, 0, i16, i17);
                }
            } else {
                i11 = h10;
            }
        }
        int i20 = q(this.f28177u, this.f28178v) ? this.f28175s : i11;
        this.f28176t = this.f28177u;
        this.f28175s = i11;
        return i20;
    }

    private int h(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f28158b;
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
        this.f28177u = i15 / i16;
        this.f28178v = i17 / i14;
        return i16;
    }

    private int m(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 < 0.5f) {
            i12 = (int) ((i11 * f10) / (1.0f - f10));
        } else {
            this.f28174r = (int) ((i11 * ((2.0f * f10) - 1.0f)) / (1.0f - f10));
            i12 = i11;
        }
        int i13 = i11 + i12;
        short[] f11 = f(this.f28168l, this.f28169m, i13);
        this.f28168l = f11;
        int i14 = this.f28158b;
        System.arraycopy(sArr, i10 * i14, f11, this.f28169m * i14, i14 * i11);
        p(i12, this.f28158b, this.f28168l, this.f28169m + i11, sArr, i10 + i11, sArr, i10);
        this.f28169m += i13;
        return i12;
    }

    private short n(short[] sArr, int i10, int i11, int i12) {
        short s10 = sArr[i10];
        short s11 = sArr[i10 + this.f28158b];
        int i13 = this.f28173q * i11;
        int i14 = this.f28172p;
        int i15 = i14 * i12;
        int i16 = (i14 + 1) * i12;
        int i17 = i16 - i13;
        int i18 = i16 - i15;
        return (short) (((s10 * i17) + ((i18 - i17) * s11)) / i18);
    }

    private void o(int i10) {
        int i11 = this.f28169m - i10;
        short[] f10 = f(this.f28170n, this.f28171o, i11);
        this.f28170n = f10;
        short[] sArr = this.f28168l;
        int i12 = this.f28158b;
        System.arraycopy(sArr, i10 * i12, f10, this.f28171o * i12, i12 * i11);
        this.f28169m = i10;
        this.f28171o += i11;
    }

    private static void p(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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

    private boolean q(int i10, int i11) {
        return i10 != 0 && this.f28175s != 0 && i11 <= i10 * 3 && i10 * 2 > this.f28176t * 3;
    }

    private void r() {
        int i10 = this.f28169m;
        float f10 = this.f28159c;
        float f11 = this.f28160d;
        float f12 = f10 / f11;
        float f13 = this.f28161e * f11;
        double d10 = f12;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            b(f12);
        } else {
            d(this.f28166j, 0, this.f28167k);
            this.f28167k = 0;
        }
        if (f13 != 1.0f) {
            a(f13, i10);
        }
    }

    private void u(int i10) {
        if (i10 == 0) {
            return;
        }
        short[] sArr = this.f28170n;
        int i11 = this.f28158b;
        System.arraycopy(sArr, i10 * i11, sArr, 0, (this.f28171o - i10) * i11);
        this.f28171o -= i10;
    }

    private void v(int i10) {
        int i11 = this.f28167k - i10;
        short[] sArr = this.f28166j;
        int i12 = this.f28158b;
        System.arraycopy(sArr, i10 * i12, sArr, 0, i12 * i11);
        this.f28167k = i11;
    }

    private int w(short[] sArr, int i10, float f10, int i11) {
        int i12;
        if (f10 >= 2.0f) {
            i12 = (int) (i11 / (f10 - 1.0f));
        } else {
            this.f28174r = (int) ((i11 * (2.0f - f10)) / (f10 - 1.0f));
            i12 = i11;
        }
        short[] f11 = f(this.f28168l, this.f28169m, i12);
        this.f28168l = f11;
        p(i12, this.f28158b, f11, this.f28169m, sArr, i10, sArr, i10 + i11);
        this.f28169m += i12;
        return i12;
    }

    public void i() {
        this.f28167k = 0;
        this.f28169m = 0;
        this.f28171o = 0;
        this.f28172p = 0;
        this.f28173q = 0;
        this.f28174r = 0;
        this.f28175s = 0;
        this.f28176t = 0;
        this.f28177u = 0;
        this.f28178v = 0;
    }

    public void j(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.f28158b, this.f28169m);
        shortBuffer.put(this.f28168l, 0, this.f28158b * min);
        int i10 = this.f28169m - min;
        this.f28169m = i10;
        short[] sArr = this.f28168l;
        int i11 = this.f28158b;
        System.arraycopy(sArr, min * i11, sArr, 0, i10 * i11);
    }

    public int k() {
        return this.f28169m * this.f28158b * 2;
    }

    public int l() {
        return this.f28167k * this.f28158b * 2;
    }

    public void s() {
        int i10;
        int i11 = this.f28167k;
        float f10 = this.f28159c;
        float f11 = this.f28160d;
        int i12 = this.f28169m + ((int) ((((i11 / (f10 / f11)) + this.f28171o) / (this.f28161e * f11)) + 0.5f));
        this.f28166j = f(this.f28166j, i11, (this.f28164h * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = this.f28164h;
            int i14 = this.f28158b;
            if (i13 >= i10 * 2 * i14) {
                break;
            }
            this.f28166j[(i14 * i11) + i13] = 0;
            i13++;
        }
        this.f28167k += i10 * 2;
        r();
        if (this.f28169m > i12) {
            this.f28169m = i12;
        }
        this.f28167k = 0;
        this.f28174r = 0;
        this.f28171o = 0;
    }

    public void t(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i10 = this.f28158b;
        int i11 = remaining / i10;
        short[] f10 = f(this.f28166j, this.f28167k, i11);
        this.f28166j = f10;
        shortBuffer.get(f10, this.f28167k * this.f28158b, ((i10 * i11) * 2) / 2);
        this.f28167k += i11;
        r();
    }
}
