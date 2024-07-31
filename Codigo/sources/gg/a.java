package gg;

import dg.m;
import dg.s;
import kg.b;
import kg.l;
import mg.c;
import mg.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f16252g = {3808, 476, 2107, 1799};

    /* renamed from: a, reason: collision with root package name */
    private final b f16253a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16254b;

    /* renamed from: c, reason: collision with root package name */
    private int f16255c;

    /* renamed from: d, reason: collision with root package name */
    private int f16256d;

    /* renamed from: e, reason: collision with root package name */
    private int f16257e;

    /* renamed from: f, reason: collision with root package name */
    private int f16258f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gg.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0265a {

        /* renamed from: a, reason: collision with root package name */
        private final int f16259a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16260b;

        C0265a(int i10, int i11) {
            this.f16259a = i10;
            this.f16260b = i11;
        }

        int a() {
            return this.f16259a;
        }

        int b() {
            return this.f16260b;
        }

        s c() {
            return new s(this.f16259a, this.f16260b);
        }

        public String toString() {
            return "<" + this.f16259a + ' ' + this.f16260b + '>';
        }
    }

    public a(b bVar) {
        this.f16253a = bVar;
    }

    private static float b(s sVar, s sVar2) {
        return lg.a.a(sVar.c(), sVar.d(), sVar2.c(), sVar2.d());
    }

    private static float c(C0265a c0265a, C0265a c0265a2) {
        return lg.a.b(c0265a.a(), c0265a.b(), c0265a2.a(), c0265a2.b());
    }

    private static s[] d(s[] sVarArr, int i10, int i11) {
        float f10 = i11 / (i10 * 2.0f);
        float c10 = sVarArr[0].c() - sVarArr[2].c();
        float d10 = sVarArr[0].d() - sVarArr[2].d();
        float c11 = (sVarArr[0].c() + sVarArr[2].c()) / 2.0f;
        float d11 = (sVarArr[0].d() + sVarArr[2].d()) / 2.0f;
        float f11 = c10 * f10;
        float f12 = d10 * f10;
        s sVar = new s(c11 + f11, d11 + f12);
        s sVar2 = new s(c11 - f11, d11 - f12);
        float c12 = sVarArr[1].c() - sVarArr[3].c();
        float d12 = sVarArr[1].d() - sVarArr[3].d();
        float c13 = (sVarArr[1].c() + sVarArr[3].c()) / 2.0f;
        float d13 = (sVarArr[1].d() + sVarArr[3].d()) / 2.0f;
        float f13 = c12 * f10;
        float f14 = f10 * d12;
        return new s[]{sVar, new s(c13 + f13, d13 + f14), sVar2, new s(c13 - f13, d13 - f14)};
    }

    private void e(s[] sVarArr) {
        int i10;
        long j10;
        long j11;
        if (!o(sVarArr[0]) || !o(sVarArr[1]) || !o(sVarArr[2]) || !o(sVarArr[3])) {
            throw m.a();
        }
        int i11 = this.f16257e * 2;
        int[] iArr = {r(sVarArr[0], sVarArr[1], i11), r(sVarArr[1], sVarArr[2], i11), r(sVarArr[2], sVarArr[3], i11), r(sVarArr[3], sVarArr[0], i11)};
        this.f16258f = m(iArr, i11);
        long j12 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = iArr[(this.f16258f + i12) % 4];
            if (this.f16254b) {
                j10 = j12 << 7;
                j11 = (i13 >> 1) & 127;
            } else {
                j10 = j12 << 10;
                j11 = ((i13 >> 2) & 992) + ((i13 >> 1) & 31);
            }
            j12 = j10 + j11;
        }
        int h10 = h(j12, this.f16254b);
        if (this.f16254b) {
            this.f16255c = (h10 >> 6) + 1;
            i10 = h10 & 63;
        } else {
            this.f16255c = (h10 >> 11) + 1;
            i10 = h10 & 2047;
        }
        this.f16256d = i10 + 1;
    }

    private s[] f(C0265a c0265a) {
        this.f16257e = 1;
        C0265a c0265a2 = c0265a;
        C0265a c0265a3 = c0265a2;
        C0265a c0265a4 = c0265a3;
        boolean z10 = true;
        while (this.f16257e < 9) {
            C0265a j10 = j(c0265a, z10, 1, -1);
            C0265a j11 = j(c0265a2, z10, 1, 1);
            C0265a j12 = j(c0265a3, z10, -1, 1);
            C0265a j13 = j(c0265a4, z10, -1, -1);
            if (this.f16257e > 2) {
                double c10 = (c(j13, j10) * this.f16257e) / (c(c0265a4, c0265a) * (this.f16257e + 2));
                if (c10 < 0.75d || c10 > 1.25d || !p(j10, j11, j12, j13)) {
                    break;
                }
            }
            z10 = !z10;
            this.f16257e++;
            c0265a4 = j13;
            c0265a = j10;
            c0265a2 = j11;
            c0265a3 = j12;
        }
        int i10 = this.f16257e;
        if (i10 != 5 && i10 != 7) {
            throw m.a();
        }
        this.f16254b = i10 == 5;
        s[] sVarArr = {new s(c0265a.a() + 0.5f, c0265a.b() - 0.5f), new s(c0265a2.a() + 0.5f, c0265a2.b() + 0.5f), new s(c0265a3.a() - 0.5f, c0265a3.b() + 0.5f), new s(c0265a4.a() - 0.5f, c0265a4.b() - 0.5f)};
        int i11 = this.f16257e;
        return d(sVarArr, (i11 * 2) - 3, i11 * 2);
    }

    private int g(C0265a c0265a, C0265a c0265a2) {
        float c10 = c(c0265a, c0265a2);
        if (c10 == 0.0f) {
            return 0;
        }
        float a10 = (c0265a2.a() - c0265a.a()) / c10;
        float b10 = (c0265a2.b() - c0265a.b()) / c10;
        float a11 = c0265a.a();
        float b11 = c0265a.b();
        boolean g10 = this.f16253a.g(c0265a.a(), c0265a.b());
        int floor = (int) Math.floor(c10);
        int i10 = 0;
        for (int i11 = 0; i11 < floor; i11++) {
            if (this.f16253a.g(lg.a.c(a11), lg.a.c(b11)) != g10) {
                i10++;
            }
            a11 += a10;
            b11 += b10;
        }
        float f10 = i10 / c10;
        if (f10 <= 0.1f || f10 >= 0.9f) {
            return (f10 <= 0.1f) == g10 ? 1 : -1;
        }
        return 0;
    }

    private static int h(long j10, boolean z10) {
        int i10;
        int i11;
        if (z10) {
            i10 = 7;
            i11 = 2;
        } else {
            i10 = 10;
            i11 = 4;
        }
        int i12 = i10 - i11;
        int[] iArr = new int[i10];
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            iArr[i13] = ((int) j10) & 15;
            j10 >>= 4;
        }
        try {
            new c(mg.a.f21489k).a(iArr, i12);
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                i14 = (i14 << 4) + iArr[i15];
            }
            return i14;
        } catch (e unused) {
            throw m.a();
        }
    }

    private int i() {
        if (this.f16254b) {
            return (this.f16255c * 4) + 11;
        }
        int i10 = this.f16255c;
        return (i10 * 4) + ((((i10 * 2) + 6) / 15) * 2) + 15;
    }

    private C0265a j(C0265a c0265a, boolean z10, int i10, int i11) {
        int a10 = c0265a.a() + i10;
        int b10 = c0265a.b();
        while (true) {
            b10 += i11;
            if (!n(a10, b10) || this.f16253a.g(a10, b10) != z10) {
                break;
            }
            a10 += i10;
        }
        int i12 = a10 - i10;
        int i13 = b10 - i11;
        while (n(i12, i13) && this.f16253a.g(i12, i13) == z10) {
            i12 += i10;
        }
        int i14 = i12 - i10;
        while (n(i14, i13) && this.f16253a.g(i14, i13) == z10) {
            i13 += i11;
        }
        return new C0265a(i14, i13 - i11);
    }

    private C0265a k() {
        s c10;
        s sVar;
        s sVar2;
        s sVar3;
        s c11;
        s c12;
        s c13;
        s c14;
        try {
            s[] c15 = new lg.b(this.f16253a).c();
            sVar2 = c15[0];
            sVar3 = c15[1];
            sVar = c15[2];
            c10 = c15[3];
        } catch (m unused) {
            int m10 = this.f16253a.m() / 2;
            int j10 = this.f16253a.j() / 2;
            int i10 = m10 + 7;
            int i11 = j10 - 7;
            s c16 = j(new C0265a(i10, i11), false, 1, -1).c();
            int i12 = j10 + 7;
            s c17 = j(new C0265a(i10, i12), false, 1, 1).c();
            int i13 = m10 - 7;
            s c18 = j(new C0265a(i13, i12), false, -1, 1).c();
            c10 = j(new C0265a(i13, i11), false, -1, -1).c();
            sVar = c18;
            sVar2 = c16;
            sVar3 = c17;
        }
        int c19 = lg.a.c((((sVar2.c() + c10.c()) + sVar3.c()) + sVar.c()) / 4.0f);
        int c20 = lg.a.c((((sVar2.d() + c10.d()) + sVar3.d()) + sVar.d()) / 4.0f);
        try {
            s[] c21 = new lg.b(this.f16253a, 15, c19, c20).c();
            c11 = c21[0];
            c12 = c21[1];
            c13 = c21[2];
            c14 = c21[3];
        } catch (m unused2) {
            int i14 = c19 + 7;
            int i15 = c20 - 7;
            c11 = j(new C0265a(i14, i15), false, 1, -1).c();
            int i16 = c20 + 7;
            c12 = j(new C0265a(i14, i16), false, 1, 1).c();
            int i17 = c19 - 7;
            c13 = j(new C0265a(i17, i16), false, -1, 1).c();
            c14 = j(new C0265a(i17, i15), false, -1, -1).c();
        }
        return new C0265a(lg.a.c((((c11.c() + c14.c()) + c12.c()) + c13.c()) / 4.0f), lg.a.c((((c11.d() + c14.d()) + c12.d()) + c13.d()) / 4.0f));
    }

    private s[] l(s[] sVarArr) {
        return d(sVarArr, this.f16257e * 2, i());
    }

    private static int m(int[] iArr, int i10) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 = (i11 << 3) + ((i12 >> (i10 - 2)) << 1) + (i12 & 1);
        }
        int i13 = ((i11 & 1) << 11) + (i11 >> 1);
        for (int i14 = 0; i14 < 4; i14++) {
            if (Integer.bitCount(f16252g[i14] ^ i13) <= 2) {
                return i14;
            }
        }
        throw m.a();
    }

    private boolean n(int i10, int i11) {
        return i10 >= 0 && i10 < this.f16253a.m() && i11 >= 0 && i11 < this.f16253a.j();
    }

    private boolean o(s sVar) {
        return n(lg.a.c(sVar.c()), lg.a.c(sVar.d()));
    }

    private boolean p(C0265a c0265a, C0265a c0265a2, C0265a c0265a3, C0265a c0265a4) {
        C0265a c0265a5 = new C0265a(Math.max(0, c0265a.a() - 3), Math.min(this.f16253a.j() - 1, c0265a.b() + 3));
        C0265a c0265a6 = new C0265a(Math.max(0, c0265a2.a() - 3), Math.max(0, c0265a2.b() - 3));
        C0265a c0265a7 = new C0265a(Math.min(this.f16253a.m() - 1, c0265a3.a() + 3), Math.max(0, Math.min(this.f16253a.j() - 1, c0265a3.b() - 3)));
        C0265a c0265a8 = new C0265a(Math.min(this.f16253a.m() - 1, c0265a4.a() + 3), Math.min(this.f16253a.j() - 1, c0265a4.b() + 3));
        int g10 = g(c0265a8, c0265a5);
        return g10 != 0 && g(c0265a5, c0265a6) == g10 && g(c0265a6, c0265a7) == g10 && g(c0265a7, c0265a8) == g10;
    }

    private b q(b bVar, s sVar, s sVar2, s sVar3, s sVar4) {
        l b10 = l.b();
        int i10 = i();
        float f10 = i10 / 2.0f;
        int i11 = this.f16257e;
        float f11 = f10 - i11;
        float f12 = f10 + i11;
        return b10.c(bVar, i10, i10, f11, f11, f12, f11, f12, f12, f11, f12, sVar.c(), sVar.d(), sVar2.c(), sVar2.d(), sVar3.c(), sVar3.d(), sVar4.c(), sVar4.d());
    }

    private int r(s sVar, s sVar2, int i10) {
        float b10 = b(sVar, sVar2);
        float f10 = b10 / i10;
        float c10 = sVar.c();
        float d10 = sVar.d();
        float c11 = ((sVar2.c() - sVar.c()) * f10) / b10;
        float d11 = (f10 * (sVar2.d() - sVar.d())) / b10;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f11 = i12;
            if (this.f16253a.g(lg.a.c((f11 * c11) + c10), lg.a.c((f11 * d11) + d10))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }

    public eg.a a(boolean z10) {
        s[] f10 = f(k());
        if (z10) {
            s sVar = f10[0];
            f10[0] = f10[2];
            f10[2] = sVar;
        }
        e(f10);
        b bVar = this.f16253a;
        int i10 = this.f16258f;
        return new eg.a(q(bVar, f10[i10 % 4], f10[(i10 + 1) % 4], f10[(i10 + 2) % 4], f10[(i10 + 3) % 4]), l(f10), this.f16254b, this.f16256d, this.f16255c);
    }
}
