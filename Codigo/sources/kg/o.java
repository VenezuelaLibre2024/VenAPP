package kg;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final float f20698a;

    /* renamed from: b, reason: collision with root package name */
    private final float f20699b;

    /* renamed from: c, reason: collision with root package name */
    private final float f20700c;

    /* renamed from: d, reason: collision with root package name */
    private final float f20701d;

    /* renamed from: e, reason: collision with root package name */
    private final float f20702e;

    /* renamed from: f, reason: collision with root package name */
    private final float f20703f;

    /* renamed from: g, reason: collision with root package name */
    private final float f20704g;

    /* renamed from: h, reason: collision with root package name */
    private final float f20705h;

    /* renamed from: i, reason: collision with root package name */
    private final float f20706i;

    private o(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f20698a = f10;
        this.f20699b = f13;
        this.f20700c = f16;
        this.f20701d = f11;
        this.f20702e = f14;
        this.f20703f = f17;
        this.f20704g = f12;
        this.f20705h = f15;
        this.f20706i = f18;
    }

    public static o b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return d(f18, f19, f20, f21, f22, f23, f24, f25).e(c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    public static o c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return d(f10, f11, f12, f13, f14, f15, f16, f17).a();
    }

    public static o d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new o(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new o((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    o a() {
        float f10 = this.f20702e;
        float f11 = this.f20706i;
        float f12 = this.f20703f;
        float f13 = this.f20705h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f20704g;
        float f16 = this.f20701d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f20700c;
        float f20 = this.f20699b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f20698a;
        return new o(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    o e(o oVar) {
        float f10 = this.f20698a;
        float f11 = oVar.f20698a;
        float f12 = this.f20701d;
        float f13 = oVar.f20699b;
        float f14 = this.f20704g;
        float f15 = oVar.f20700c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = oVar.f20701d;
        float f18 = oVar.f20702e;
        float f19 = oVar.f20703f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = oVar.f20704g;
        float f22 = oVar.f20705h;
        float f23 = oVar.f20706i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f20699b;
        float f26 = this.f20702e;
        float f27 = this.f20705h;
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f27 * f23) + (f25 * f21) + (f26 * f22);
        float f31 = this.f20700c;
        float f32 = this.f20703f;
        float f33 = (f11 * f31) + (f13 * f32);
        float f34 = this.f20706i;
        return new o(f16, f20, f24, f28, f29, f30, (f15 * f34) + f33, (f17 * f31) + (f18 * f32) + (f19 * f34), (f31 * f21) + (f32 * f22) + (f34 * f23));
    }

    public void f(float[] fArr) {
        float f10 = this.f20698a;
        float f11 = this.f20699b;
        float f12 = this.f20700c;
        float f13 = this.f20701d;
        float f14 = this.f20702e;
        float f15 = this.f20703f;
        float f16 = this.f20704g;
        float f17 = this.f20705h;
        float f18 = this.f20706i;
        int length = fArr.length - 1;
        for (int i10 = 0; i10 < length; i10 += 2) {
            float f19 = fArr[i10];
            int i11 = i10 + 1;
            float f20 = fArr[i11];
            float f21 = (f12 * f19) + (f15 * f20) + f18;
            fArr[i10] = (((f10 * f19) + (f13 * f20)) + f16) / f21;
            fArr[i11] = (((f19 * f11) + (f20 * f14)) + f17) / f21;
        }
    }
}
