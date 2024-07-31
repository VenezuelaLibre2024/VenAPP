package di;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private RectF f14195a;

    /* renamed from: b, reason: collision with root package name */
    private RectF f14196b;

    /* renamed from: c, reason: collision with root package name */
    private float f14197c;

    /* renamed from: d, reason: collision with root package name */
    private float f14198d;

    public d(RectF rectF, RectF rectF2, float f10, float f11) {
        this.f14195a = rectF;
        this.f14196b = rectF2;
        this.f14197c = f10;
        this.f14198d = f11;
    }

    public RectF a() {
        return this.f14195a;
    }

    public float b() {
        return this.f14198d;
    }

    public RectF c() {
        return this.f14196b;
    }

    public float d() {
        return this.f14197c;
    }
}
