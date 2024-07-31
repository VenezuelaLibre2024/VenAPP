package df;

/* loaded from: classes2.dex */
public final class e0 {

    /* renamed from: a */
    private final String f14043a;

    /* renamed from: b */
    private final String f14044b;

    /* renamed from: c */
    private final int f14045c;

    /* renamed from: d */
    private final long f14046d;

    /* renamed from: e */
    private final e f14047e;

    /* renamed from: f */
    private final String f14048f;

    public e0(String sessionId, String firstSessionId, int i10, long j10, e dataCollectionStatus, String firebaseInstallationId) {
        kotlin.jvm.internal.n.e(sessionId, "sessionId");
        kotlin.jvm.internal.n.e(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.n.e(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.n.e(firebaseInstallationId, "firebaseInstallationId");
        this.f14043a = sessionId;
        this.f14044b = firstSessionId;
        this.f14045c = i10;
        this.f14046d = j10;
        this.f14047e = dataCollectionStatus;
        this.f14048f = firebaseInstallationId;
    }

    public final e a() {
        return this.f14047e;
    }

    public final long b() {
        return this.f14046d;
    }

    public final String c() {
        return this.f14048f;
    }

    public final String d() {
        return this.f14044b;
    }

    public final String e() {
        return this.f14043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return kotlin.jvm.internal.n.a(this.f14043a, e0Var.f14043a) && kotlin.jvm.internal.n.a(this.f14044b, e0Var.f14044b) && this.f14045c == e0Var.f14045c && this.f14046d == e0Var.f14046d && kotlin.jvm.internal.n.a(this.f14047e, e0Var.f14047e) && kotlin.jvm.internal.n.a(this.f14048f, e0Var.f14048f);
    }

    public final int f() {
        return this.f14045c;
    }

    public int hashCode() {
        return (((((((((this.f14043a.hashCode() * 31) + this.f14044b.hashCode()) * 31) + Integer.hashCode(this.f14045c)) * 31) + Long.hashCode(this.f14046d)) * 31) + this.f14047e.hashCode()) * 31) + this.f14048f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f14043a + ", firstSessionId=" + this.f14044b + ", sessionIndex=" + this.f14045c + ", eventTimestampUs=" + this.f14046d + ", dataCollectionStatus=" + this.f14047e + ", firebaseInstallationId=" + this.f14048f + ')';
    }
}
