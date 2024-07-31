package eh;

import dg.s;

/* loaded from: classes2.dex */
public final class a extends s {

    /* renamed from: c, reason: collision with root package name */
    private final float f14661c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(float f10, float f11, float f12) {
        super(f10, f11);
        this.f14661c = f12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(float f10, float f11, float f12) {
        if (Math.abs(f11 - d()) > f10 || Math.abs(f12 - c()) > f10) {
            return false;
        }
        float abs = Math.abs(f10 - this.f14661c);
        return abs <= 1.0f || abs <= this.f14661c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a g(float f10, float f11, float f12) {
        return new a((c() + f11) / 2.0f, (d() + f10) / 2.0f, (this.f14661c + f12) / 2.0f);
    }
}
