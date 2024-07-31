package androidx.core.content.res;

/* loaded from: classes.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f3654a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3655b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3656c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3657d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3658e;

    /* renamed from: f, reason: collision with root package name */
    private final float f3659f;

    /* renamed from: g, reason: collision with root package name */
    private final float f3660g;

    /* renamed from: h, reason: collision with root package name */
    private final float f3661h;

    /* renamed from: i, reason: collision with root package name */
    private final float f3662i;

    a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f3654a = f10;
        this.f3655b = f11;
        this.f3656c = f12;
        this.f3657d = f13;
        this.f3658e = f14;
        this.f3659f = f15;
        this.f3660g = f16;
        this.f3661h = f17;
        this.f3662i = f18;
    }

    private static a b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        a aVar = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int p10 = e(f17, f11, f10).p();
            float b10 = b.b(p10);
            float abs = Math.abs(f12 - b10);
            if (abs < 0.2f) {
                a c10 = c(p10);
                float a10 = c10.a(e(c10.k(), c10.i(), f10));
                if (a10 <= 1.0f) {
                    aVar = c10;
                    f14 = abs;
                    f16 = a10;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                break;
            }
            if (b10 < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a c(int i10) {
        return d(i10, j.f3694k);
    }

    static a d(int i10, j jVar) {
        float[] f10 = b.f(i10);
        float[][] fArr = b.f3663a;
        float f11 = f10[0];
        float[] fArr2 = fArr[0];
        float f12 = fArr2[0] * f11;
        float f13 = f10[1];
        float f14 = f12 + (fArr2[1] * f13);
        float f15 = f10[2];
        float f16 = f14 + (fArr2[2] * f15);
        float[] fArr3 = fArr[1];
        float f17 = (fArr3[0] * f11) + (fArr3[1] * f13) + (fArr3[2] * f15);
        float[] fArr4 = fArr[2];
        float f18 = (f11 * fArr4[0]) + (f13 * fArr4[1]) + (f15 * fArr4[2]);
        float f19 = jVar.i()[0] * f16;
        float f20 = jVar.i()[1] * f17;
        float f21 = jVar.i()[2] * f18;
        float pow = (float) Math.pow((jVar.c() * Math.abs(f19)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((jVar.c() * Math.abs(f20)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((jVar.c() * Math.abs(f21)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f19) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f20) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f21) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = signum3;
        float f22 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d10)) / 11.0f;
        float f23 = ((float) ((signum + signum2) - (d10 * 2.0d))) / 9.0f;
        float f24 = signum2 * 20.0f;
        float f25 = (((signum * 20.0f) + f24) + (21.0f * signum3)) / 20.0f;
        float f26 = (((signum * 40.0f) + f24) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f23, f22)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f27 = atan2;
        float f28 = (3.1415927f * f27) / 180.0f;
        float pow4 = ((float) Math.pow((f26 * jVar.f()) / jVar.a(), jVar.b() * jVar.j())) * 100.0f;
        float d11 = jVar.d() * (4.0f / jVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (jVar.a() + 4.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f27) < 20.14d ? 360.0f + f27 : f27) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.g()) * jVar.h()) * ((float) Math.sqrt((f22 * f22) + (f23 * f23)))) / (f25 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d12 = pow5 * jVar.d();
        float sqrt = ((float) Math.sqrt((r3 * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f29 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d12) + 1.0f)) * 43.85965f;
        double d13 = f28;
        return new a(f27, pow5, pow4, d11, d12, sqrt, f29, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    private static a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, j.f3694k);
    }

    private static a f(float f10, float f11, float f12, j jVar) {
        float b10 = (4.0f / jVar.b()) * ((float) Math.sqrt(f10 / 100.0d)) * (jVar.a() + 4.0f) * jVar.d();
        float d10 = f11 * jVar.d();
        float sqrt = ((float) Math.sqrt(((f11 / ((float) Math.sqrt(r4))) * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f13 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float log = ((float) Math.log((d10 * 0.0228d) + 1.0d)) * 43.85965f;
        double d11 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f10, b10, d10, sqrt, f13, log * ((float) Math.cos(d11)), log * ((float) Math.sin(d11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, j.f3694k);
    }

    static int n(float f10, float f11, float f12, j jVar) {
        if (f11 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return b.a(f12);
        }
        float min = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        a aVar = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            a b10 = b(min, f14, f12);
            if (!z10) {
                if (b10 == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    aVar = b10;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else {
                if (b10 != null) {
                    return b10.o(jVar);
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return aVar == null ? b.a(f12) : aVar.o(jVar);
    }

    float a(a aVar) {
        float l10 = l() - aVar.l();
        float g10 = g() - aVar.g();
        float h10 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l10 * l10) + (g10 * g10) + (h10 * h10)), 0.63d) * 1.41d);
    }

    float g() {
        return this.f3661h;
    }

    float h() {
        return this.f3662i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.f3655b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f3654a;
    }

    float k() {
        return this.f3656c;
    }

    float l() {
        return this.f3660g;
    }

    int o(j jVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d), 1.1111111111111112d);
        double j10 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j10) + 3.8d)) * 0.25f;
        float a10 = jVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / jVar.b()) / jVar.j()));
        float g10 = cos * 3846.1538f * jVar.g() * jVar.h();
        float f10 = a10 / jVar.f();
        float sin = (float) Math.sin(j10);
        float cos2 = (float) Math.cos(j10);
        float f11 = (((0.305f + f10) * 23.0f) * pow) / (((g10 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f12 = cos2 * f11;
        float f13 = f11 * sin;
        float f14 = f10 * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float signum = Math.signum(f15) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f15) * 27.13d) / (400.0d - Math.abs(f15))), 2.380952380952381d));
        float signum2 = Math.signum(f16) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f16) * 27.13d) / (400.0d - Math.abs(f16))), 2.380952380952381d));
        float signum3 = Math.signum(((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f17 = signum / jVar.i()[0];
        float f18 = signum2 / jVar.i()[1];
        float f19 = signum3 / jVar.i()[2];
        float[][] fArr = b.f3664b;
        float[] fArr2 = fArr[0];
        float f20 = (fArr2[0] * f17) + (fArr2[1] * f18) + (fArr2[2] * f19);
        float[] fArr3 = fArr[1];
        float f21 = (fArr3[0] * f17) + (fArr3[1] * f18) + (fArr3[2] * f19);
        float[] fArr4 = fArr[2];
        return androidx.core.graphics.a.a(f20, f21, (f17 * fArr4[0]) + (f18 * fArr4[1]) + (f19 * fArr4[2]));
    }

    int p() {
        return o(j.f3694k);
    }
}
