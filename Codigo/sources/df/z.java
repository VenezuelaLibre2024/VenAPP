package df;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private final i f14123a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f14124b;

    /* renamed from: c, reason: collision with root package name */
    private final b f14125c;

    public z(i eventType, e0 sessionData, b applicationInfo) {
        kotlin.jvm.internal.n.e(eventType, "eventType");
        kotlin.jvm.internal.n.e(sessionData, "sessionData");
        kotlin.jvm.internal.n.e(applicationInfo, "applicationInfo");
        this.f14123a = eventType;
        this.f14124b = sessionData;
        this.f14125c = applicationInfo;
    }

    public final b a() {
        return this.f14125c;
    }

    public final i b() {
        return this.f14123a;
    }

    public final e0 c() {
        return this.f14124b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f14123a == zVar.f14123a && kotlin.jvm.internal.n.a(this.f14124b, zVar.f14124b) && kotlin.jvm.internal.n.a(this.f14125c, zVar.f14125c);
    }

    public int hashCode() {
        return (((this.f14123a.hashCode() * 31) + this.f14124b.hashCode()) * 31) + this.f14125c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f14123a + ", sessionData=" + this.f14124b + ", applicationInfo=" + this.f14125c + ')';
    }
}
