package p107ff;

import kotlin.jvm.internal.C9322n;

/* renamed from: ff.e */
/* loaded from: classes2.dex */
public final class C7344e {

    /* renamed from: a */
    private final Boolean f16568a;

    /* renamed from: b */
    private final Double f16569b;

    /* renamed from: c */
    private final Integer f16570c;

    /* renamed from: d */
    private final Integer f16571d;

    /* renamed from: e */
    private final Long f16572e;

    public C7344e(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f16568a = bool;
        this.f16569b = d10;
        this.f16570c = num;
        this.f16571d = num2;
        this.f16572e = l10;
    }

    /* renamed from: a */
    public final Integer m22047a() {
        return this.f16571d;
    }

    /* renamed from: b */
    public final Long m22048b() {
        return this.f16572e;
    }

    /* renamed from: c */
    public final Boolean m22049c() {
        return this.f16568a;
    }

    /* renamed from: d */
    public final Integer m22050d() {
        return this.f16570c;
    }

    /* renamed from: e */
    public final Double m22051e() {
        return this.f16569b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7344e)) {
            return false;
        }
        C7344e c7344e = (C7344e) obj;
        return C9322n.m27777a(this.f16568a, c7344e.f16568a) && C9322n.m27777a(this.f16569b, c7344e.f16569b) && C9322n.m27777a(this.f16570c, c7344e.f16570c) && C9322n.m27777a(this.f16571d, c7344e.f16571d) && C9322n.m27777a(this.f16572e, c7344e.f16572e);
    }

    public int hashCode() {
        Boolean bool = this.f16568a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f16569b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f16570c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f16571d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f16572e;
        return hashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f16568a + ", sessionSamplingRate=" + this.f16569b + ", sessionRestartTimeout=" + this.f16570c + ", cacheDuration=" + this.f16571d + ", cacheUpdatedTime=" + this.f16572e + ')';
    }
}
