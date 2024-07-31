package androidx.camera.lifecycle;

import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.InterfaceC1310k;
import p018b0.C1597e;

/* renamed from: androidx.camera.lifecycle.a */
/* loaded from: classes.dex */
final class C0720a extends LifecycleCameraRepository.AbstractC0719a {

    /* renamed from: a */
    private final InterfaceC1310k f3135a;

    /* renamed from: b */
    private final C1597e.b f3136b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0720a(InterfaceC1310k interfaceC1310k, C1597e.b bVar) {
        if (interfaceC1310k == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f3135a = interfaceC1310k;
        if (bVar == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.f3136b = bVar;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC0719a
    /* renamed from: b */
    public C1597e.b mo3597b() {
        return this.f3136b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.AbstractC0719a
    /* renamed from: c */
    public InterfaceC1310k mo3598c() {
        return this.f3135a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.AbstractC0719a)) {
            return false;
        }
        LifecycleCameraRepository.AbstractC0719a abstractC0719a = (LifecycleCameraRepository.AbstractC0719a) obj;
        return this.f3135a.equals(abstractC0719a.mo3598c()) && this.f3136b.equals(abstractC0719a.mo3597b());
    }

    public int hashCode() {
        return ((this.f3135a.hashCode() ^ 1000003) * 1000003) ^ this.f3136b.hashCode();
    }

    public String toString() {
        return "Key{lifecycleOwner=" + this.f3135a + ", cameraId=" + this.f3136b + "}";
    }
}
