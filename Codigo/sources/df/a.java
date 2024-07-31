package df;

import java.util.List;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f13957a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13958b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13959c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13960d;

    /* renamed from: e, reason: collision with root package name */
    private final t f13961e;

    /* renamed from: f, reason: collision with root package name */
    private final List<t> f13962f;

    public a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, t currentProcessDetails, List<t> appProcessDetails) {
        kotlin.jvm.internal.n.e(packageName, "packageName");
        kotlin.jvm.internal.n.e(versionName, "versionName");
        kotlin.jvm.internal.n.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.n.e(deviceManufacturer, "deviceManufacturer");
        kotlin.jvm.internal.n.e(currentProcessDetails, "currentProcessDetails");
        kotlin.jvm.internal.n.e(appProcessDetails, "appProcessDetails");
        this.f13957a = packageName;
        this.f13958b = versionName;
        this.f13959c = appBuildVersion;
        this.f13960d = deviceManufacturer;
        this.f13961e = currentProcessDetails;
        this.f13962f = appProcessDetails;
    }

    public final String a() {
        return this.f13959c;
    }

    public final List<t> b() {
        return this.f13962f;
    }

    public final t c() {
        return this.f13961e;
    }

    public final String d() {
        return this.f13960d;
    }

    public final String e() {
        return this.f13957a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.n.a(this.f13957a, aVar.f13957a) && kotlin.jvm.internal.n.a(this.f13958b, aVar.f13958b) && kotlin.jvm.internal.n.a(this.f13959c, aVar.f13959c) && kotlin.jvm.internal.n.a(this.f13960d, aVar.f13960d) && kotlin.jvm.internal.n.a(this.f13961e, aVar.f13961e) && kotlin.jvm.internal.n.a(this.f13962f, aVar.f13962f);
    }

    public final String f() {
        return this.f13958b;
    }

    public int hashCode() {
        return (((((((((this.f13957a.hashCode() * 31) + this.f13958b.hashCode()) * 31) + this.f13959c.hashCode()) * 31) + this.f13960d.hashCode()) * 31) + this.f13961e.hashCode()) * 31) + this.f13962f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13957a + ", versionName=" + this.f13958b + ", appBuildVersion=" + this.f13959c + ", deviceManufacturer=" + this.f13960d + ", currentProcessDetails=" + this.f13961e + ", appProcessDetails=" + this.f13962f + ')';
    }
}
