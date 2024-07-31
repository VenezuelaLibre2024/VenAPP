package p442xc;

import p442xc.AbstractC12428g0;
import sc.C10888f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xc.c0 */
/* loaded from: classes.dex */
public final class C12420c0 extends AbstractC12428g0.a {

    /* renamed from: a */
    private final String f33488a;

    /* renamed from: b */
    private final String f33489b;

    /* renamed from: c */
    private final String f33490c;

    /* renamed from: d */
    private final String f33491d;

    /* renamed from: e */
    private final int f33492e;

    /* renamed from: f */
    private final C10888f f33493f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12420c0(String str, String str2, String str3, String str4, int i10, C10888f c10888f) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f33488a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f33489b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f33490c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f33491d = str4;
        this.f33492e = i10;
        if (c10888f == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f33493f = c10888f;
    }

    @Override // p442xc.AbstractC12428g0.a
    /* renamed from: a */
    public String mo40147a() {
        return this.f33488a;
    }

    @Override // p442xc.AbstractC12428g0.a
    /* renamed from: c */
    public int mo40148c() {
        return this.f33492e;
    }

    @Override // p442xc.AbstractC12428g0.a
    /* renamed from: d */
    public C10888f mo40149d() {
        return this.f33493f;
    }

    @Override // p442xc.AbstractC12428g0.a
    /* renamed from: e */
    public String mo40150e() {
        return this.f33491d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12428g0.a)) {
            return false;
        }
        AbstractC12428g0.a aVar = (AbstractC12428g0.a) obj;
        return this.f33488a.equals(aVar.mo40147a()) && this.f33489b.equals(aVar.mo40151f()) && this.f33490c.equals(aVar.mo40152g()) && this.f33491d.equals(aVar.mo40150e()) && this.f33492e == aVar.mo40148c() && this.f33493f.equals(aVar.mo40149d());
    }

    @Override // p442xc.AbstractC12428g0.a
    /* renamed from: f */
    public String mo40151f() {
        return this.f33489b;
    }

    @Override // p442xc.AbstractC12428g0.a
    /* renamed from: g */
    public String mo40152g() {
        return this.f33490c;
    }

    public int hashCode() {
        return ((((((((((this.f33488a.hashCode() ^ 1000003) * 1000003) ^ this.f33489b.hashCode()) * 1000003) ^ this.f33490c.hashCode()) * 1000003) ^ this.f33491d.hashCode()) * 1000003) ^ this.f33492e) * 1000003) ^ this.f33493f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f33488a + ", versionCode=" + this.f33489b + ", versionName=" + this.f33490c + ", installUuid=" + this.f33491d + ", deliveryMechanism=" + this.f33492e + ", developmentPlatformProvider=" + this.f33493f + "}";
    }
}
