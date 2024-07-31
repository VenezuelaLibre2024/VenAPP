package df;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f14040a;

    /* renamed from: b, reason: collision with root package name */
    private final d f14041b;

    /* renamed from: c, reason: collision with root package name */
    private final double f14042c;

    public e() {
        this(null, null, 0.0d, 7, null);
    }

    public e(d performance, d crashlytics, double d10) {
        kotlin.jvm.internal.n.e(performance, "performance");
        kotlin.jvm.internal.n.e(crashlytics, "crashlytics");
        this.f14040a = performance;
        this.f14041b = crashlytics;
        this.f14042c = d10;
    }

    public /* synthetic */ e(d dVar, d dVar2, double d10, int i10, kotlin.jvm.internal.g gVar) {
        this((i10 & 1) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar, (i10 & 2) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar2, (i10 & 4) != 0 ? 1.0d : d10);
    }

    public final d a() {
        return this.f14041b;
    }

    public final d b() {
        return this.f14040a;
    }

    public final double c() {
        return this.f14042c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14040a == eVar.f14040a && this.f14041b == eVar.f14041b && kotlin.jvm.internal.n.a(Double.valueOf(this.f14042c), Double.valueOf(eVar.f14042c));
    }

    public int hashCode() {
        return (((this.f14040a.hashCode() * 31) + this.f14041b.hashCode()) * 31) + Double.hashCode(this.f14042c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f14040a + ", crashlytics=" + this.f14041b + ", sessionSamplingRate=" + this.f14042c + ')';
    }
}
