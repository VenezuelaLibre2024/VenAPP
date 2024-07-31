package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.j */
/* loaded from: classes.dex */
final class C12431j extends AbstractC12426f0.e.a.b {

    /* renamed from: a */
    private final String f33563a;

    @Override // p442xc.AbstractC12426f0.e.a.b
    /* renamed from: a */
    public String mo40233a() {
        return this.f33563a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12426f0.e.a.b) {
            return this.f33563a.equals(((AbstractC12426f0.e.a.b) obj).mo40233a());
        }
        return false;
    }

    public int hashCode() {
        return this.f33563a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f33563a + "}";
    }
}
