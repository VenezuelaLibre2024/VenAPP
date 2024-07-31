package kg;

/* renamed from: kg.o */
/* loaded from: classes2.dex */
public final class C9277o {

    /* renamed from: a */
    private final float f22520a;

    /* renamed from: b */
    private final float f22521b;

    /* renamed from: c */
    private final float f22522c;

    /* renamed from: d */
    private final float f22523d;

    /* renamed from: e */
    private final float f22524e;

    /* renamed from: f */
    private final float f22525f;

    /* renamed from: g */
    private final float f22526g;

    /* renamed from: h */
    private final float f22527h;

    /* renamed from: i */
    private final float f22528i;

    private C9277o(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f22520a = f10;
        this.f22521b = f13;
        this.f22522c = f16;
        this.f22523d = f11;
        this.f22524e = f14;
        this.f22525f = f17;
        this.f22526g = f12;
        this.f22527h = f15;
        this.f22528i = f18;
    }

    /* renamed from: b */
    public static C9277o m27678b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        return m27680d(f18, f19, f20, f21, f22, f23, f24, f25).m27682e(m27679c(f10, f11, f12, f13, f14, f15, f16, f17));
    }

    /* renamed from: c */
    public static C9277o m27679c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        return m27680d(f10, f11, f12, f13, f14, f15, f16, f17).m27681a();
    }

    /* renamed from: d */
    public static C9277o m27680d(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        float f18 = ((f10 - f12) + f14) - f16;
        float f19 = ((f11 - f13) + f15) - f17;
        if (f18 == 0.0f && f19 == 0.0f) {
            return new C9277o(f12 - f10, f14 - f12, f10, f13 - f11, f15 - f13, f11, 0.0f, 0.0f, 1.0f);
        }
        float f20 = f12 - f14;
        float f21 = f16 - f14;
        float f22 = f13 - f15;
        float f23 = f17 - f15;
        float f24 = (f20 * f23) - (f21 * f22);
        float f25 = ((f23 * f18) - (f21 * f19)) / f24;
        float f26 = ((f20 * f19) - (f18 * f22)) / f24;
        return new C9277o((f25 * f12) + (f12 - f10), (f26 * f16) + (f16 - f10), f10, (f13 - f11) + (f25 * f13), (f17 - f11) + (f26 * f17), f11, f25, f26, 1.0f);
    }

    /* renamed from: a */
    C9277o m27681a() {
        float f10 = this.f22524e;
        float f11 = this.f22528i;
        float f12 = this.f22525f;
        float f13 = this.f22527h;
        float f14 = (f10 * f11) - (f12 * f13);
        float f15 = this.f22526g;
        float f16 = this.f22523d;
        float f17 = (f12 * f15) - (f16 * f11);
        float f18 = (f16 * f13) - (f10 * f15);
        float f19 = this.f22522c;
        float f20 = this.f22521b;
        float f21 = (f19 * f13) - (f20 * f11);
        float f22 = this.f22520a;
        return new C9277o(f14, f17, f18, f21, (f11 * f22) - (f19 * f15), (f15 * f20) - (f13 * f22), (f20 * f12) - (f19 * f10), (f19 * f16) - (f12 * f22), (f22 * f10) - (f20 * f16));
    }

    /* renamed from: e */
    C9277o m27682e(C9277o c9277o) {
        float f10 = this.f22520a;
        float f11 = c9277o.f22520a;
        float f12 = this.f22523d;
        float f13 = c9277o.f22521b;
        float f14 = this.f22526g;
        float f15 = c9277o.f22522c;
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = c9277o.f22523d;
        float f18 = c9277o.f22524e;
        float f19 = c9277o.f22525f;
        float f20 = (f10 * f17) + (f12 * f18) + (f14 * f19);
        float f21 = c9277o.f22526g;
        float f22 = c9277o.f22527h;
        float f23 = c9277o.f22528i;
        float f24 = (f10 * f21) + (f12 * f22) + (f14 * f23);
        float f25 = this.f22521b;
        float f26 = this.f22524e;
        float f27 = this.f22527h;
        float f28 = (f25 * f11) + (f26 * f13) + (f27 * f15);
        float f29 = (f25 * f17) + (f26 * f18) + (f27 * f19);
        float f30 = (f27 * f23) + (f25 * f21) + (f26 * f22);
        float f31 = this.f22522c;
        float f32 = this.f22525f;
        float f33 = (f11 * f31) + (f13 * f32);
        float f34 = this.f22528i;
        return new C9277o(f16, f20, f24, f28, f29, f30, (f15 * f34) + f33, (f17 * f31) + (f18 * f32) + (f19 * f34), (f31 * f21) + (f32 * f22) + (f34 * f23));
    }

    /* renamed from: f */
    public void m27683f(float[] fArr) {
        float f10 = this.f22520a;
        float f11 = this.f22521b;
        float f12 = this.f22522c;
        float f13 = this.f22523d;
        float f14 = this.f22524e;
        float f15 = this.f22525f;
        float f16 = this.f22526g;
        float f17 = this.f22527h;
        float f18 = this.f22528i;
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
