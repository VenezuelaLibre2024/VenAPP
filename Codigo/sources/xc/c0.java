package xc;

import xc.g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c0 extends g0.a {

    /* renamed from: a */
    private final String f30968a;

    /* renamed from: b */
    private final String f30969b;

    /* renamed from: c */
    private final String f30970c;

    /* renamed from: d */
    private final String f30971d;

    /* renamed from: e */
    private final int f30972e;

    /* renamed from: f */
    private final sc.f f30973f;

    public c0(String str, String str2, String str3, String str4, int i10, sc.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f30968a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f30969b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f30970c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f30971d = str4;
        this.f30972e = i10;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f30973f = fVar;
    }

    @Override // xc.g0.a
    public String a() {
        return this.f30968a;
    }

    @Override // xc.g0.a
    public int c() {
        return this.f30972e;
    }

    @Override // xc.g0.a
    public sc.f d() {
        return this.f30973f;
    }

    @Override // xc.g0.a
    public String e() {
        return this.f30971d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.a)) {
            return false;
        }
        g0.a aVar = (g0.a) obj;
        return this.f30968a.equals(aVar.a()) && this.f30969b.equals(aVar.f()) && this.f30970c.equals(aVar.g()) && this.f30971d.equals(aVar.e()) && this.f30972e == aVar.c() && this.f30973f.equals(aVar.d());
    }

    @Override // xc.g0.a
    public String f() {
        return this.f30969b;
    }

    @Override // xc.g0.a
    public String g() {
        return this.f30970c;
    }

    public int hashCode() {
        return ((((((((((this.f30968a.hashCode() ^ 1000003) * 1000003) ^ this.f30969b.hashCode()) * 1000003) ^ this.f30970c.hashCode()) * 1000003) ^ this.f30971d.hashCode()) * 1000003) ^ this.f30972e) * 1000003) ^ this.f30973f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f30968a + ", versionCode=" + this.f30969b + ", versionName=" + this.f30970c + ", installUuid=" + this.f30971d + ", deliveryMechanism=" + this.f30972e + ", developmentPlatformProvider=" + this.f30973f + "}";
    }
}
