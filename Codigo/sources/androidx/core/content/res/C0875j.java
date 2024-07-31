package androidx.core.content.res;

/* renamed from: androidx.core.content.res.j */
/* loaded from: classes.dex */
final class C0875j {

    /* renamed from: k */
    static final C0875j f4366k = m4476k(C0867b.f4337c, (float) ((C0867b.m4419h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a */
    private final float f4367a;

    /* renamed from: b */
    private final float f4368b;

    /* renamed from: c */
    private final float f4369c;

    /* renamed from: d */
    private final float f4370d;

    /* renamed from: e */
    private final float f4371e;

    /* renamed from: f */
    private final float f4372f;

    /* renamed from: g */
    private final float[] f4373g;

    /* renamed from: h */
    private final float f4374h;

    /* renamed from: i */
    private final float f4375i;

    /* renamed from: j */
    private final float f4376j;

    private C0875j(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f4372f = f10;
        this.f4367a = f11;
        this.f4368b = f12;
        this.f4369c = f13;
        this.f4370d = f14;
        this.f4371e = f15;
        this.f4373g = fArr;
        this.f4374h = f16;
        this.f4375i = f17;
        this.f4376j = f18;
    }

    /* renamed from: k */
    static C0875j m4476k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = C0867b.f4335a;
        float f13 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f14 = fArr3[0] * f13;
        float f15 = fArr[1];
        float f16 = f14 + (fArr3[1] * f15);
        float f17 = fArr[2];
        float f18 = f16 + (fArr3[2] * f17);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[0] * f13) + (fArr4[1] * f15) + (fArr4[2] * f17);
        float[] fArr5 = fArr2[2];
        float f20 = (f13 * fArr5[0]) + (f15 * fArr5[1]) + (f17 * fArr5[2]);
        float f21 = (f12 / 10.0f) + 0.8f;
        float m4415d = ((double) f21) >= 0.9d ? C0867b.m4415d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : C0867b.m4415d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float exp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d10 = exp;
        if (d10 > 1.0d) {
            exp = 1.0f;
        } else if (d10 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f20) * exp) + 1.0f) - exp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float cbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(f10 * 5.0d)));
        float m4419h = C0867b.m4419h(f11) / fArr[1];
        double d11 = m4419h;
        float sqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f20) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f19) / 100.0d, 0.42d), pow2};
        float f25 = fArr7[0];
        float f26 = fArr7[1];
        return new C0875j(m4419h, ((((f25 * 400.0f) / (f25 + 27.13f)) * 2.0f) + ((f26 * 400.0f) / (f26 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, m4415d, f21, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float m4477a() {
        return this.f4367a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public float m4478b() {
        return this.f4370d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public float m4479c() {
        return this.f4374h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public float m4480d() {
        return this.f4375i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m4481e() {
        return this.f4372f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public float m4482f() {
        return this.f4368b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m4483g() {
        return this.f4371e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public float m4484h() {
        return this.f4369c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public float[] m4485i() {
        return this.f4373g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public float m4486j() {
        return this.f4376j;
    }
}
