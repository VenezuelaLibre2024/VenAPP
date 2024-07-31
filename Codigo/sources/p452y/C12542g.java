package p452y;

import androidx.camera.core.InterfaceC0710o;
import p452y.C12539e0;

/* renamed from: y.g */
/* loaded from: classes.dex */
final class C12542g extends C12539e0.b {

    /* renamed from: a */
    private final C12541f0 f34019a;

    /* renamed from: b */
    private final InterfaceC0710o f34020b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12542g(C12541f0 c12541f0, InterfaceC0710o interfaceC0710o) {
        if (c12541f0 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f34019a = c12541f0;
        if (interfaceC0710o == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f34020b = interfaceC0710o;
    }

    @Override // p452y.C12539e0.b
    /* renamed from: a */
    InterfaceC0710o mo41174a() {
        return this.f34020b;
    }

    @Override // p452y.C12539e0.b
    /* renamed from: b */
    C12541f0 mo41175b() {
        return this.f34019a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12539e0.b)) {
            return false;
        }
        C12539e0.b bVar = (C12539e0.b) obj;
        return this.f34019a.equals(bVar.mo41175b()) && this.f34020b.equals(bVar.mo41174a());
    }

    public int hashCode() {
        return ((this.f34019a.hashCode() ^ 1000003) * 1000003) ^ this.f34020b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f34019a + ", imageProxy=" + this.f34020b + "}";
    }
}
