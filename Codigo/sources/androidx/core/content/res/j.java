package androidx.core.content.res;

/* loaded from: classes.dex */
final class j {

    /* renamed from: k, reason: collision with root package name */
    static final j f3694k = k(b.f3665c, (float) ((b.h(50.0f) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a, reason: collision with root package name */
    private final float f3695a;

    /* renamed from: b, reason: collision with root package name */
    private final float f3696b;

    /* renamed from: c, reason: collision with root package name */
    private final float f3697c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3698d;

    /* renamed from: e, reason: collision with root package name */
    private final float f3699e;

    /* renamed from: f, reason: collision with root package name */
    private final float f3700f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f3701g;

    /* renamed from: h, reason: collision with root package name */
    private final float f3702h;

    /* renamed from: i, reason: collision with root package name */
    private final float f3703i;

    /* renamed from: j, reason: collision with root package name */
    private final float f3704j;

    private j(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f3700f = f10;
        this.f3695a = f11;
        this.f3696b = f12;
        this.f3697c = f13;
        this.f3698d = f14;
        this.f3699e = f15;
        this.f3701g = fArr;
        this.f3702h = f16;
        this.f3703i = f17;
        this.f3704j = f18;
    }

    static j k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float[][] fArr2 = b.f3663a;
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
        float d10 = ((double) f21) >= 0.9d ? b.d(0.59f, 0.69f, (f21 - 0.9f) * 10.0f) : b.d(0.525f, 0.59f, (f21 - 0.8f) * 10.0f);
        float exp = z10 ? 1.0f : (1.0f - (((float) Math.exp(((-f10) - 42.0f) / 92.0f)) * 0.2777778f)) * f21;
        double d11 = exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp, (((100.0f / f20) * exp) + 1.0f) - exp};
        float f22 = 1.0f / ((5.0f * f10) + 1.0f);
        float f23 = f22 * f22 * f22 * f22;
        float f24 = 1.0f - f23;
        float cbrt = (f23 * f10) + (0.1f * f24 * f24 * ((float) Math.cbrt(f10 * 5.0d)));
        float h10 = b.h(f11) / fArr[1];
        double d12 = h10;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f20) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f19) / 100.0d, 0.42d), pow2};
        float f25 = fArr7[0];
        float f26 = fArr7[1];
        return new j(h10, ((((f25 * 400.0f) / (f25 + 27.13f)) * 2.0f) + ((f26 * 400.0f) / (f26 + 27.13f)) + (((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f)) * pow, pow, pow, d10, f21, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float a() {
        return this.f3695a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f3698d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float c() {
        return this.f3702h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f3703i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.f3700f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.f3696b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        return this.f3699e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float h() {
        return this.f3697c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float[] i() {
        return this.f3701g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.f3704j;
    }
}
