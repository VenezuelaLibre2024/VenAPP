package df;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final String f14119a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14120b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14121c;

    /* renamed from: d, reason: collision with root package name */
    private final long f14122d;

    public y(String sessionId, String firstSessionId, int i10, long j10) {
        kotlin.jvm.internal.n.e(sessionId, "sessionId");
        kotlin.jvm.internal.n.e(firstSessionId, "firstSessionId");
        this.f14119a = sessionId;
        this.f14120b = firstSessionId;
        this.f14121c = i10;
        this.f14122d = j10;
    }

    public final String a() {
        return this.f14120b;
    }

    public final String b() {
        return this.f14119a;
    }

    public final int c() {
        return this.f14121c;
    }

    public final long d() {
        return this.f14122d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.n.a(this.f14119a, yVar.f14119a) && kotlin.jvm.internal.n.a(this.f14120b, yVar.f14120b) && this.f14121c == yVar.f14121c && this.f14122d == yVar.f14122d;
    }

    public int hashCode() {
        return (((((this.f14119a.hashCode() * 31) + this.f14120b.hashCode()) * 31) + Integer.hashCode(this.f14121c)) * 31) + Long.hashCode(this.f14122d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f14119a + ", firstSessionId=" + this.f14120b + ", sessionIndex=" + this.f14121c + ", sessionStartTimestampUs=" + this.f14122d + ')';
    }
}
