package p065df;

import kotlin.jvm.internal.C9322n;

/* renamed from: df.b */
/* loaded from: classes2.dex */
public final class C6905b {

    /* renamed from: a */
    private final String f15319a;

    /* renamed from: b */
    private final String f15320b;

    /* renamed from: c */
    private final String f15321c;

    /* renamed from: d */
    private final String f15322d;

    /* renamed from: e */
    private final EnumC6932s f15323e;

    /* renamed from: f */
    private final C6903a f15324f;

    public C6905b(String appId, String deviceModel, String sessionSdkVersion, String osVersion, EnumC6932s logEnvironment, C6903a androidAppInfo) {
        C9322n.m27781e(appId, "appId");
        C9322n.m27781e(deviceModel, "deviceModel");
        C9322n.m27781e(sessionSdkVersion, "sessionSdkVersion");
        C9322n.m27781e(osVersion, "osVersion");
        C9322n.m27781e(logEnvironment, "logEnvironment");
        C9322n.m27781e(androidAppInfo, "androidAppInfo");
        this.f15319a = appId;
        this.f15320b = deviceModel;
        this.f15321c = sessionSdkVersion;
        this.f15322d = osVersion;
        this.f15323e = logEnvironment;
        this.f15324f = androidAppInfo;
    }

    /* renamed from: a */
    public final C6903a m19973a() {
        return this.f15324f;
    }

    /* renamed from: b */
    public final String m19974b() {
        return this.f15319a;
    }

    /* renamed from: c */
    public final String m19975c() {
        return this.f15320b;
    }

    /* renamed from: d */
    public final EnumC6932s m19976d() {
        return this.f15323e;
    }

    /* renamed from: e */
    public final String m19977e() {
        return this.f15322d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6905b)) {
            return false;
        }
        C6905b c6905b = (C6905b) obj;
        return C9322n.m27777a(this.f15319a, c6905b.f15319a) && C9322n.m27777a(this.f15320b, c6905b.f15320b) && C9322n.m27777a(this.f15321c, c6905b.f15321c) && C9322n.m27777a(this.f15322d, c6905b.f15322d) && this.f15323e == c6905b.f15323e && C9322n.m27777a(this.f15324f, c6905b.f15324f);
    }

    /* renamed from: f */
    public final String m19978f() {
        return this.f15321c;
    }

    public int hashCode() {
        return (((((((((this.f15319a.hashCode() * 31) + this.f15320b.hashCode()) * 31) + this.f15321c.hashCode()) * 31) + this.f15322d.hashCode()) * 31) + this.f15323e.hashCode()) * 31) + this.f15324f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f15319a + ", deviceModel=" + this.f15320b + ", sessionSdkVersion=" + this.f15321c + ", osVersion=" + this.f15322d + ", logEnvironment=" + this.f15323e + ", androidAppInfo=" + this.f15324f + ')';
    }
}
