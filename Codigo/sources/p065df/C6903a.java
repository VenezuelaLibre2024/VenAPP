package p065df;

import java.util.List;
import kotlin.jvm.internal.C9322n;

/* renamed from: df.a */
/* loaded from: classes2.dex */
public final class C6903a {

    /* renamed from: a */
    private final String f15311a;

    /* renamed from: b */
    private final String f15312b;

    /* renamed from: c */
    private final String f15313c;

    /* renamed from: d */
    private final String f15314d;

    /* renamed from: e */
    private final C6933t f15315e;

    /* renamed from: f */
    private final List<C6933t> f15316f;

    public C6903a(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, C6933t currentProcessDetails, List<C6933t> appProcessDetails) {
        C9322n.m27781e(packageName, "packageName");
        C9322n.m27781e(versionName, "versionName");
        C9322n.m27781e(appBuildVersion, "appBuildVersion");
        C9322n.m27781e(deviceManufacturer, "deviceManufacturer");
        C9322n.m27781e(currentProcessDetails, "currentProcessDetails");
        C9322n.m27781e(appProcessDetails, "appProcessDetails");
        this.f15311a = packageName;
        this.f15312b = versionName;
        this.f15313c = appBuildVersion;
        this.f15314d = deviceManufacturer;
        this.f15315e = currentProcessDetails;
        this.f15316f = appProcessDetails;
    }

    /* renamed from: a */
    public final String m19963a() {
        return this.f15313c;
    }

    /* renamed from: b */
    public final List<C6933t> m19964b() {
        return this.f15316f;
    }

    /* renamed from: c */
    public final C6933t m19965c() {
        return this.f15315e;
    }

    /* renamed from: d */
    public final String m19966d() {
        return this.f15314d;
    }

    /* renamed from: e */
    public final String m19967e() {
        return this.f15311a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6903a)) {
            return false;
        }
        C6903a c6903a = (C6903a) obj;
        return C9322n.m27777a(this.f15311a, c6903a.f15311a) && C9322n.m27777a(this.f15312b, c6903a.f15312b) && C9322n.m27777a(this.f15313c, c6903a.f15313c) && C9322n.m27777a(this.f15314d, c6903a.f15314d) && C9322n.m27777a(this.f15315e, c6903a.f15315e) && C9322n.m27777a(this.f15316f, c6903a.f15316f);
    }

    /* renamed from: f */
    public final String m19968f() {
        return this.f15312b;
    }

    public int hashCode() {
        return (((((((((this.f15311a.hashCode() * 31) + this.f15312b.hashCode()) * 31) + this.f15313c.hashCode()) * 31) + this.f15314d.hashCode()) * 31) + this.f15315e.hashCode()) * 31) + this.f15316f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f15311a + ", versionName=" + this.f15312b + ", appBuildVersion=" + this.f15313c + ", deviceManufacturer=" + this.f15314d + ", currentProcessDetails=" + this.f15315e + ", appProcessDetails=" + this.f15316f + ')';
    }
}
