package de;

import de.AbstractC6900m;

/* renamed from: de.b */
/* loaded from: classes.dex */
final class C6889b extends AbstractC6900m {

    /* renamed from: a */
    private final String f15244a;

    /* renamed from: b */
    private final long f15245b;

    /* renamed from: c */
    private final long f15246c;

    /* renamed from: de.b$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC6900m.a {

        /* renamed from: a */
        private String f15247a;

        /* renamed from: b */
        private Long f15248b;

        /* renamed from: c */
        private Long f15249c;

        @Override // de.AbstractC6900m.a
        /* renamed from: a */
        public AbstractC6900m mo19879a() {
            String str = "";
            if (this.f15247a == null) {
                str = " limiterKey";
            }
            if (this.f15248b == null) {
                str = str + " limit";
            }
            if (this.f15249c == null) {
                str = str + " timeToLiveMillis";
            }
            if (str.isEmpty()) {
                return new C6889b(this.f15247a, this.f15248b.longValue(), this.f15249c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // de.AbstractC6900m.a
        /* renamed from: b */
        public AbstractC6900m.a mo19880b(long j10) {
            this.f15248b = Long.valueOf(j10);
            return this;
        }

        @Override // de.AbstractC6900m.a
        /* renamed from: c */
        public AbstractC6900m.a mo19881c(String str) {
            if (str == null) {
                throw new NullPointerException("Null limiterKey");
            }
            this.f15247a = str;
            return this;
        }

        @Override // de.AbstractC6900m.a
        /* renamed from: d */
        public AbstractC6900m.a mo19882d(long j10) {
            this.f15249c = Long.valueOf(j10);
            return this;
        }
    }

    private C6889b(String str, long j10, long j11) {
        this.f15244a = str;
        this.f15245b = j10;
        this.f15246c = j11;
    }

    @Override // de.AbstractC6900m
    /* renamed from: b */
    public long mo19876b() {
        return this.f15245b;
    }

    @Override // de.AbstractC6900m
    /* renamed from: c */
    public String mo19877c() {
        return this.f15244a;
    }

    @Override // de.AbstractC6900m
    /* renamed from: d */
    public long mo19878d() {
        return this.f15246c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6900m)) {
            return false;
        }
        AbstractC6900m abstractC6900m = (AbstractC6900m) obj;
        return this.f15244a.equals(abstractC6900m.mo19877c()) && this.f15245b == abstractC6900m.mo19876b() && this.f15246c == abstractC6900m.mo19878d();
    }

    public int hashCode() {
        int hashCode = (this.f15244a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f15245b;
        long j11 = this.f15246c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "RateLimit{limiterKey=" + this.f15244a + ", limit=" + this.f15245b + ", timeToLiveMillis=" + this.f15246c + "}";
    }
}
