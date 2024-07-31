package ff;

import kotlin.jvm.internal.n;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f15145a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f15146b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f15147c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f15148d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f15149e;

    public e(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f15145a = bool;
        this.f15146b = d10;
        this.f15147c = num;
        this.f15148d = num2;
        this.f15149e = l10;
    }

    public final Integer a() {
        return this.f15148d;
    }

    public final Long b() {
        return this.f15149e;
    }

    public final Boolean c() {
        return this.f15145a;
    }

    public final Integer d() {
        return this.f15147c;
    }

    public final Double e() {
        return this.f15146b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return n.a(this.f15145a, eVar.f15145a) && n.a(this.f15146b, eVar.f15146b) && n.a(this.f15147c, eVar.f15147c) && n.a(this.f15148d, eVar.f15148d) && n.a(this.f15149e, eVar.f15149e);
    }

    public int hashCode() {
        Boolean bool = this.f15145a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f15146b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f15147c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15148d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f15149e;
        return hashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f15145a + ", sessionSamplingRate=" + this.f15146b + ", sessionRestartTimeout=" + this.f15147c + ", cacheDuration=" + this.f15148d + ", cacheUpdatedTime=" + this.f15149e + ')';
    }
}
