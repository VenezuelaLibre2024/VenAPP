package p065df;

import kotlin.jvm.internal.C9322n;

/* renamed from: df.z */
/* loaded from: classes2.dex */
public final class C6939z {

    /* renamed from: a */
    private final EnumC6919i f15477a;

    /* renamed from: b */
    private final C6912e0 f15478b;

    /* renamed from: c */
    private final C6905b f15479c;

    public C6939z(EnumC6919i eventType, C6912e0 sessionData, C6905b applicationInfo) {
        C9322n.m27781e(eventType, "eventType");
        C9322n.m27781e(sessionData, "sessionData");
        C9322n.m27781e(applicationInfo, "applicationInfo");
        this.f15477a = eventType;
        this.f15478b = sessionData;
        this.f15479c = applicationInfo;
    }

    /* renamed from: a */
    public final C6905b m20075a() {
        return this.f15479c;
    }

    /* renamed from: b */
    public final EnumC6919i m20076b() {
        return this.f15477a;
    }

    /* renamed from: c */
    public final C6912e0 m20077c() {
        return this.f15478b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6939z)) {
            return false;
        }
        C6939z c6939z = (C6939z) obj;
        return this.f15477a == c6939z.f15477a && C9322n.m27777a(this.f15478b, c6939z.f15478b) && C9322n.m27777a(this.f15479c, c6939z.f15479c);
    }

    public int hashCode() {
        return (((this.f15477a.hashCode() * 31) + this.f15478b.hashCode()) * 31) + this.f15479c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f15477a + ", sessionData=" + this.f15478b + ", applicationInfo=" + this.f15479c + ')';
    }
}
