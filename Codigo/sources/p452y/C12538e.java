package p452y;

import androidx.camera.core.C0709n;
import p112g0.AbstractC7392c0;
import p452y.C12568t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y.e */
/* loaded from: classes.dex */
public final class C12538e extends C12568t.a {

    /* renamed from: a */
    private final AbstractC7392c0<byte[]> f33994a;

    /* renamed from: b */
    private final C0709n.g f33995b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12538e(AbstractC7392c0<byte[]> abstractC7392c0, C0709n.g gVar) {
        if (abstractC7392c0 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f33994a = abstractC7392c0;
        if (gVar == null) {
            throw new NullPointerException("Null outputFileOptions");
        }
        this.f33995b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p452y.C12568t.a
    /* renamed from: a */
    public C0709n.g mo41150a() {
        return this.f33995b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p452y.C12568t.a
    /* renamed from: b */
    public AbstractC7392c0<byte[]> mo41151b() {
        return this.f33994a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12568t.a)) {
            return false;
        }
        C12568t.a aVar = (C12568t.a) obj;
        return this.f33994a.equals(aVar.mo41151b()) && this.f33995b.equals(aVar.mo41150a());
    }

    public int hashCode() {
        return ((this.f33994a.hashCode() ^ 1000003) * 1000003) ^ this.f33995b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f33994a + ", outputFileOptions=" + this.f33995b + "}";
    }
}
