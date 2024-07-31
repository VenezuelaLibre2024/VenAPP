package androidx.privacysandbox.ads.adservices.topics;

/* renamed from: androidx.privacysandbox.ads.adservices.topics.c */
/* loaded from: classes.dex */
public final class C1335c {

    /* renamed from: a */
    private final long f5779a;

    /* renamed from: b */
    private final long f5780b;

    /* renamed from: c */
    private final int f5781c;

    public C1335c(long j10, long j11, int i10) {
        this.f5779a = j10;
        this.f5780b = j11;
        this.f5781c = i10;
    }

    /* renamed from: a */
    public final long m7454a() {
        return this.f5780b;
    }

    /* renamed from: b */
    public final long m7455b() {
        return this.f5779a;
    }

    /* renamed from: c */
    public final int m7456c() {
        return this.f5781c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1335c)) {
            return false;
        }
        C1335c c1335c = (C1335c) obj;
        return this.f5779a == c1335c.f5779a && this.f5780b == c1335c.f5780b && this.f5781c == c1335c.f5781c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f5779a) * 31) + Long.hashCode(this.f5780b)) * 31) + Integer.hashCode(this.f5781c);
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f5779a + ", ModelVersion=" + this.f5780b + ", TopicCode=" + this.f5781c + " }");
    }
}
