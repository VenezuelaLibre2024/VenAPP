package androidx.camera.camera2.internal;

import p343s0.C10765a;
import p407w.InterfaceC12021k1;

/* renamed from: androidx.camera.camera2.internal.v3 */
/* loaded from: classes.dex */
class C0566v3 implements InterfaceC12021k1 {

    /* renamed from: a */
    private float f2621a;

    /* renamed from: b */
    private final float f2622b;

    /* renamed from: c */
    private final float f2623c;

    /* renamed from: d */
    private float f2624d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0566v3(float f10, float f11) {
        this.f2622b = f10;
        this.f2623c = f11;
    }

    /* renamed from: e */
    private float m2789e(float f10) {
        float f11 = this.f2622b;
        float f12 = this.f2623c;
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

    /* renamed from: f */
    private float m2790f(float f10) {
        if (f10 == 1.0f) {
            return this.f2622b;
        }
        if (f10 == 0.0f) {
            return this.f2623c;
        }
        float f11 = this.f2622b;
        float f12 = this.f2623c;
        double d10 = 1.0f / f12;
        return (float) C10765a.m32748a(1.0d / (d10 + (((1.0f / f11) - d10) * f10)), f12, f11);
    }

    @Override // p407w.InterfaceC12021k1
    /* renamed from: a */
    public float mo2791a() {
        return this.f2622b;
    }

    @Override // p407w.InterfaceC12021k1
    /* renamed from: b */
    public float mo2792b() {
        return this.f2624d;
    }

    @Override // p407w.InterfaceC12021k1
    /* renamed from: c */
    public float mo2793c() {
        return this.f2623c;
    }

    @Override // p407w.InterfaceC12021k1
    /* renamed from: d */
    public float mo2794d() {
        return this.f2621a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m2795g(float f10) {
        if (f10 <= 1.0f && f10 >= 0.0f) {
            this.f2624d = f10;
            this.f2621a = m2790f(f10);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m2796h(float f10) {
        if (f10 <= this.f2622b && f10 >= this.f2623c) {
            this.f2621a = f10;
            this.f2624d = m2789e(f10);
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f2623c + " , " + this.f2622b + "]");
    }
}
