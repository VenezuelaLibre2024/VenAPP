package androidx.camera.lifecycle;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.k;
import b0.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends LifecycleCameraRepository.a {

    /* renamed from: a */
    private final k f2790a;

    /* renamed from: b */
    private final e.b f2791b;

    public a(k kVar, e.b bVar) {
        if (kVar == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f2790a = kVar;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f2791b = bVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public e.b b() {
        return this.f2791b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.a
    public k c() {
        return this.f2790a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.a)) {
            return false;
        }
        LifecycleCameraRepository.a aVar = (LifecycleCameraRepository.a) obj;
        return this.f2790a.equals(aVar.c()) && this.f2791b.equals(aVar.b());
    }

    public int hashCode() {
        return ((this.f2790a.hashCode() ^ 1000003) * 1000003) ^ this.f2791b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f2790a + ", cameraId=" + this.f2791b + "}";
    }
}
