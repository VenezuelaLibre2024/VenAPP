package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.w2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends w2.b {

    /* renamed from: a */
    private final int f1970a;

    /* renamed from: b */
    private final int f1971b;

    public e(int i10, int i11) {
        this.f1970a = i10;
        this.f1971b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.w2.b
    public int a() {
        return this.f1970a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.w2.b
    public int b() {
        return this.f1971b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w2.b)) {
            return false;
        }
        w2.b bVar = (w2.b) obj;
        return this.f1970a == bVar.a() && this.f1971b == bVar.b();
    }

    public int hashCode() {
        return ((this.f1970a ^ 1000003) * 1000003) ^ this.f1971b;
    }

    public String toString() {
        return "FeatureSettings{cameraMode=" + this.f1970a + ", requiredMaxBitDepth=" + this.f1971b + "}";
    }
}
