package df;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a */
    private final String f13965a;

    /* renamed from: b */
    private final String f13966b;

    /* renamed from: c */
    private final String f13967c;

    /* renamed from: d */
    private final String f13968d;

    /* renamed from: e */
    private final s f13969e;

    /* renamed from: f */
    private final a f13970f;

    public b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, s logEnvironment, a androidAppInfo) {
        kotlin.jvm.internal.n.e(appId, "appId");
        kotlin.jvm.internal.n.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.n.e(sessionSdkVersion, "sessionSdkVersion");
        kotlin.jvm.internal.n.e(osVersion, "osVersion");
        kotlin.jvm.internal.n.e(logEnvironment, "logEnvironment");
        kotlin.jvm.internal.n.e(androidAppInfo, "androidAppInfo");
        this.f13965a = appId;
        this.f13966b = deviceModel;
        this.f13967c = sessionSdkVersion;
        this.f13968d = osVersion;
        this.f13969e = logEnvironment;
        this.f13970f = androidAppInfo;
    }

    public final a a() {
        return this.f13970f;
    }

    public final String b() {
        return this.f13965a;
    }

    public final String c() {
        return this.f13966b;
    }

    public final s d() {
        return this.f13969e;
    }

    public final String e() {
        return this.f13968d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.n.a(this.f13965a, bVar.f13965a) && kotlin.jvm.internal.n.a(this.f13966b, bVar.f13966b) && kotlin.jvm.internal.n.a(this.f13967c, bVar.f13967c) && kotlin.jvm.internal.n.a(this.f13968d, bVar.f13968d) && this.f13969e == bVar.f13969e && kotlin.jvm.internal.n.a(this.f13970f, bVar.f13970f);
    }

    public final String f() {
        return this.f13967c;
    }

    public int hashCode() {
        return (((((((((this.f13965a.hashCode() * 31) + this.f13966b.hashCode()) * 31) + this.f13967c.hashCode()) * 31) + this.f13968d.hashCode()) * 31) + this.f13969e.hashCode()) * 31) + this.f13970f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f13965a + ", deviceModel=" + this.f13966b + ", sessionSdkVersion=" + this.f13967c + ", osVersion=" + this.f13968d + ", logEnvironment=" + this.f13969e + ", androidAppInfo=" + this.f13970f + ')';
    }
}
