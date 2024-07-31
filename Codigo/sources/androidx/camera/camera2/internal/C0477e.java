package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.C0570w2;

/* renamed from: androidx.camera.camera2.internal.e */
/* loaded from: classes.dex */
final class C0477e extends C0570w2.b {

    /* renamed from: a */
    private final int f2273a;

    /* renamed from: b */
    private final int f2274b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0477e(int i10, int i11) {
        this.f2273a = i10;
        this.f2274b = i11;
    }

    @Override // androidx.camera.camera2.internal.C0570w2.b
    /* renamed from: a */
    int mo2362a() {
        return this.f2273a;
    }

    @Override // androidx.camera.camera2.internal.C0570w2.b
    /* renamed from: b */
    int mo2363b() {
        return this.f2274b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0570w2.b)) {
            return false;
        }
        C0570w2.b bVar = (C0570w2.b) obj;
        return this.f2273a == bVar.mo2362a() && this.f2274b == bVar.mo2363b();
    }

    public int hashCode() {
        return ((this.f2273a ^ 1000003) * 1000003) ^ this.f2274b;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f2273a + ", requiredMaxBitDepth=" + this.f2274b + "}";
    }
}
