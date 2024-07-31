package p452y;

import androidx.camera.core.InterfaceC0710o;
import p112g0.AbstractC7392c0;
import p452y.C12560p;

/* renamed from: y.d */
/* loaded from: classes.dex */
final class C12536d extends C12560p.a {

    /* renamed from: a */
    private final AbstractC7392c0<InterfaceC0710o> f33990a;

    /* renamed from: b */
    private final int f33991b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12536d(AbstractC7392c0<InterfaceC0710o> abstractC7392c0, int i10) {
        if (abstractC7392c0 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f33990a = abstractC7392c0;
        this.f33991b = i10;
    }

    @Override // p452y.C12560p.a
    /* renamed from: a */
    int mo41148a() {
        return this.f33991b;
    }

    @Override // p452y.C12560p.a
    /* renamed from: b */
    AbstractC7392c0<InterfaceC0710o> mo41149b() {
        return this.f33990a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12560p.a)) {
            return false;
        }
        C12560p.a aVar = (C12560p.a) obj;
        return this.f33990a.equals(aVar.mo41149b()) && this.f33991b == aVar.mo41148a();
    }

    public int hashCode() {
        return ((this.f33990a.hashCode() ^ 1000003) * 1000003) ^ this.f33991b;
    }

    public String toString() {
        return "In{packet=" + this.f33990a + ", jpegQuality=" + this.f33991b + "}";
    }
}
