package androidx.core.content.res;

import androidx.core.graphics.C0876a;

/* renamed from: androidx.core.content.res.a */
/* loaded from: classes.dex */
class C0866a {

    /* renamed from: a */
    private final float f4326a;

    /* renamed from: b */
    private final float f4327b;

    /* renamed from: c */
    private final float f4328c;

    /* renamed from: d */
    private final float f4329d;

    /* renamed from: e */
    private final float f4330e;

    /* renamed from: f */
    private final float f4331f;

    /* renamed from: g */
    private final float f4332g;

    /* renamed from: h */
    private final float f4333h;

    /* renamed from: i */
    private final float f4334i;

    C0866a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f4326a = f10;
        this.f4327b = f11;
        this.f4328c = f12;
        this.f4329d = f13;
        this.f4330e = f14;
        this.f4331f = f15;
        this.f4332g = f16;
        this.f4333h = f17;
        this.f4334i = f18;
    }

    /* renamed from: b */
    private static C0866a m4396b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        C0866a c0866a = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int m4411p = m4399e(f17, f11, f10).m4411p();
            float m4413b = C0867b.m4413b(m4411p);
            float abs = Math.abs(f12 - m4413b);
            if (abs < 0.2f) {
                C0866a m4397c = m4397c(m4411p);
                float m4403a = m4397c.m4403a(m4399e(m4397c.m4408k(), m4397c.m4406i(), f10));
                if (m4403a <= 1.0f) {
                    c0866a = m4397c;
                    f14 = abs;
                    f16 = m4403a;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                break;
            }
            if (m4413b < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return c0866a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C0866a m4397c(int i10) {
        return m4398d(i10, C0875j.f4366k);
    }

    /* renamed from: d */
    static C0866a m4398d(int i10, C0875j c0875j) {
        float[] m4417f = C0867b.m4417f(i10);
        float[][] fArr = C0867b.f4335a;
        float f10 = m4417f[0];
        float[] fArr2 = fArr[0];
        float f11 = fArr2[0] * f10;
        float f12 = m4417f[1];
        float f13 = f11 + (fArr2[1] * f12);
        float f14 = m4417f[2];
        float f15 = f13 + (fArr2[2] * f14);
        float[] fArr3 = fArr[1];
        float f16 = (fArr3[0] * f10) + (fArr3[1] * f12) + (fArr3[2] * f14);
        float[] fArr4 = fArr[2];
        float f17 = (f10 * fArr4[0]) + (f12 * fArr4[1]) + (f14 * fArr4[2]);
        float f18 = c0875j.m4485i()[0] * f15;
        float f19 = c0875j.m4485i()[1] * f16;
        float f20 = c0875j.m4485i()[2] * f17;
        float pow = (float) Math.pow((c0875j.m4479c() * Math.abs(f18)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((c0875j.m4479c() * Math.abs(f19)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((c0875j.m4479c() * Math.abs(f20)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f18) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f19) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f20) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f21 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d10)) / 11.0f;
        float f22 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f23 = signum2 * 20.0f;
        float f24 = (((signum * 20.0f) + f23) + (21.0f * signum3)) / 20.0f;
        float f25 = (((signum * 40.0f) + f23) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f22, f21)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f26 = atan2;
        float f27 = (3.1415927f * f26) / 180.0f;
        float pow4 = ((float) Math.pow((f25 * c0875j.m4482f()) / c0875j.m4477a(), c0875j.m4478b() * c0875j.m4486j())) * 100.0f;
        float m4480d = c0875j.m4480d() * (4.0f / c0875j.m4478b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (c0875j.m4477a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0875j.m4481e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f26) < 20.14d ? 360.0f + f26 : f26) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0875j.m4483g()) * c0875j.m4484h()) * ((float) Math.sqrt((f21 * f21) + (f22 * f22)))) / (f24 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float m4480d2 = pow5 * c0875j.m4480d();
        float sqrt = ((float) Math.sqrt((r3 * c0875j.m4478b()) / (c0875j.m4477a() + 4.0f))) * 50.0f;
        float f28 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * m4480d2) + 1.0f)) * 43.85965f;
        double d11 = f27;
        return new C0866a(f26, pow5, pow4, m4480d, m4480d2, sqrt, f28, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    /* renamed from: e */
    private static C0866a m4399e(float f10, float f11, float f12) {
        return m4400f(f10, f11, f12, C0875j.f4366k);
    }

    /* renamed from: f */
    private static C0866a m4400f(float f10, float f11, float f12, C0875j c0875j) {
        float m4478b = (4.0f / c0875j.m4478b()) * ((float) Math.sqrt(f10 / 100.0d)) * (c0875j.m4477a() + 4.0f) * c0875j.m4480d();
        float m4480d = f11 * c0875j.m4480d();
        float sqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * c0875j.m4478b()) / (c0875j.m4477a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((m4480d * 0.0228d) + 1.0d)) * 43.85965f;
        double d10 = (3.1415927f * f12) / 180.0f;
        return new C0866a(f12, f11, f10, m4478b, m4480d, sqrt, f13, log * ((float) Math.cos(d10)), log * ((float) Math.sin(d10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int m4401m(float f10, float f11, float f12) {
        return m4402n(f10, f11, f12, C0875j.f4366k);
    }

    /* renamed from: n */
    static int m4402n(float f10, float f11, float f12, C0875j c0875j) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return C0867b.m4412a(f12);
        }
        float min = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        C0866a c0866a = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            C0866a m4396b = m4396b(min, f14, f12);
            if (!z10) {
                if (m4396b == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    c0866a = m4396b;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else {
                if (m4396b != null) {
                    return m4396b.m4410o(c0875j);
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return c0866a == null ? C0867b.m4412a(f12) : c0866a.m4410o(c0875j);
    }

    /* renamed from: a */
    float m4403a(C0866a c0866a) {
        float m4409l = m4409l() - c0866a.m4409l();
        float m4404g = m4404g() - c0866a.m4404g();
        float m4405h = m4405h() - c0866a.m4405h();
        return (float) (Math.pow(Math.sqrt((m4409l * m4409l) + (m4404g * m4404g) + (m4405h * m4405h)), 0.63d) * 1.41d);
    }

    /* renamed from: g */
    float m4404g() {
        return this.f4333h;
    }

    /* renamed from: h */
    float m4405h() {
        return this.f4334i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float m4406i() {
        return this.f4327b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m4407j() {
        return this.f4326a;
    }

    /* renamed from: k */
    float m4408k() {
        return this.f4328c;
    }

    /* renamed from: l */
    float m4409l() {
        return this.f4332g;
    }

    /* renamed from: o */
    int m4410o(C0875j c0875j) {
        float pow = (float) Math.pow(((((double) m4406i()) == 0.0d || ((double) m4408k()) == 0.0d) ? 0.0f : m4406i() / ((float) Math.sqrt(m4408k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, c0875j.m4481e()), 0.73d), 1.1111111111111112d);
        double m4407j = (m4407j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + m4407j) + 3.8d)) * 0.25f;
        float m4477a = c0875j.m4477a() * ((float) Math.pow(m4408k() / 100.0d, (1.0d / c0875j.m4478b()) / c0875j.m4486j()));
        float m4483g = cos * 3846.1538f * c0875j.m4483g() * c0875j.m4484h();
        float m4482f = m4477a / c0875j.m4482f();
        float sin = (float) Math.sin(m4407j);
        float cos2 = (float) Math.cos(m4407j);
        float f10 = (((0.305f + m4482f) * 23.0f) * pow) / (((m4483g * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f11 = cos2 * f10;
        float f12 = f10 * sin;
        float f13 = m4482f * 460.0f;
        float f14 = (((451.0f * f11) + f13) + (288.0f * f12)) / 1403.0f;
        float f15 = ((f13 - (891.0f * f11)) - (261.0f * f12)) / 1403.0f;
        float signum = Math.signum(f14) * (100.0f / c0875j.m4479c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f14) * 27.13d) / (400.0d - Math.abs(f14))), 2.380952380952381d));
        float signum2 = Math.signum(f15) * (100.0f / c0875j.m4479c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float signum3 = Math.signum(((f13 - (f11 * 220.0f)) - (f12 * 6300.0f)) / 1403.0f) * (100.0f / c0875j.m4479c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f16 = signum / c0875j.m4485i()[0];
        float f17 = signum2 / c0875j.m4485i()[1];
        float f18 = signum3 / c0875j.m4485i()[2];
        float[][] fArr = C0867b.f4336b;
        float[] fArr2 = fArr[0];
        float f19 = (fArr2[0] * f16) + (fArr2[1] * f17) + (fArr2[2] * f18);
        float[] fArr3 = fArr[1];
        float f20 = (fArr3[0] * f16) + (fArr3[1] * f17) + (fArr3[2] * f18);
        float[] fArr4 = fArr[2];
        return C0876a.m4487a(f19, f20, (f16 * fArr4[0]) + (f17 * fArr4[1]) + (f18 * fArr4[2]));
    }

    /* renamed from: p */
    int m4411p() {
        return m4410o(C0875j.f4366k);
    }
}
