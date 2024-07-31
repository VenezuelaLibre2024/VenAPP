package xc;

import xc.f0;

/* loaded from: classes.dex */
final class j extends f0.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f31043a;

    @Override // xc.f0.e.a.b
    public String a() {
        return this.f31043a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.e.a.b) {
            return this.f31043a.equals(((f0.e.a.b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f31043a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Organization{clsId=" + this.f31043a + "}";
    }
}
