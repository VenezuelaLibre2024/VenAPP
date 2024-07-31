package androidx.camera.camera2.internal;

/* loaded from: classes.dex */
class v3 implements w.k1 {

    /* renamed from: a, reason: collision with root package name */
    private float f2300a;

    /* renamed from: b, reason: collision with root package name */
    private final float f2301b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2302c;

    /* renamed from: d, reason: collision with root package name */
    private float f2303d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v3(float f10, float f11) {
        this.f2301b = f10;
        this.f2302c = f11;
    }

    private float e(float f10) {
        float f11 = this.f2301b;
        float f12 = this.f2302c;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    private float f(float f10) {
        if (f10 == 1.0f) {
            return this.f2301b;
        }
        if (f10 == 0.0f) {
            return this.f2302c;
        }
        float f11 = this.f2301b;
        float f12 = this.f2302c;
        double d10 = 1.0f / f12;
        return (float) s0.a.a(1.0d / (d10 + (((1.0f / f11) - d10) * f10)), f12, f11);
    }

    @Override // w.k1
    public float a() {
        return this.f2301b;
    }

    @Override // w.k1
    public float b() {
        return this.f2303d;
    }

    @Override // w.k1
    public float c() {
        return this.f2302c;
    }

    @Override // w.k1
    public float d() {
        return this.f2300a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(float f10) {
        if (f10 <= 1.0f && f10 >= 0.0f) {
            this.f2303d = f10;
            this.f2300a = f(f10);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 <= this.f2301b && f10 >= this.f2302c) {
            this.f2300a = f10;
            this.f2303d = e(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f2302c + " , " + this.f2301b + "]");
    }
}
