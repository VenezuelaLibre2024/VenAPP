package androidx.privacysandbox.ads.adservices.topics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final long f5025a;

    /* renamed from: b, reason: collision with root package name */
    private final long f5026b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5027c;

    public c(long j10, long j11, int i10) {
        this.f5025a = j10;
        this.f5026b = j11;
        this.f5027c = i10;
    }

    public final long a() {
        return this.f5026b;
    }

    public final long b() {
        return this.f5025a;
    }

    public final int c() {
        return this.f5027c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f5025a == cVar.f5025a && this.f5026b == cVar.f5026b && this.f5027c == cVar.f5027c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f5025a) * 31) + Long.hashCode(this.f5026b)) * 31) + Integer.hashCode(this.f5027c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f5025a + ", ModelVersion=" + this.f5026b + ", TopicCode=" + this.f5027c + " }");
    }
}
