package k2;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f20189a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f20190b;

    public d(String key, Long l10) {
        kotlin.jvm.internal.n.e(key, "key");
        this.f20189a = key;
        this.f20190b = l10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String key, boolean z10) {
        this(key, Long.valueOf(z10 ? 1L : 0L));
        kotlin.jvm.internal.n.e(key, "key");
    }

    public final String a() {
        return this.f20189a;
    }

    public final Long b() {
        return this.f20190b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.n.a(this.f20189a, dVar.f20189a) && kotlin.jvm.internal.n.a(this.f20190b, dVar.f20190b);
    }

    public int hashCode() {
        int hashCode = this.f20189a.hashCode() * 31;
        Long l10 = this.f20190b;
        return hashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f20189a + ", value=" + this.f20190b + ')';
    }
}
