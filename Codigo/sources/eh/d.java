package eh;

import dg.s;

/* loaded from: classes2.dex */
public final class d extends s {

    /* renamed from: c, reason: collision with root package name */
    private final float f14673c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14674d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(float f10, float f11, float f12) {
        this(f10, f11, f12, 1);
    }

    private d(float f10, float f11, float f12, int i10) {
        super(f10, f11);
        this.f14673c = f12;
        this.f14674d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f14673c);
        return abs <= 1.0f || abs <= this.f14673c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d g(float f10, float f11, float f12) {
        int i10 = this.f14674d;
        int i11 = i10 + 1;
        float c10 = (i10 * c()) + f11;
        float f13 = i11;
        return new d(c10 / f13, ((this.f14674d * d()) + f10) / f13, ((this.f14674d * this.f14673c) + f12) / f13, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f14674d;
    }

    public float i() {
        return this.f14673c;
    }
}
