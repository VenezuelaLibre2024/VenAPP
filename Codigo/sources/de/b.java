package de;

import de.m;

/* loaded from: classes.dex */
final class b extends m {

    /* renamed from: a */
    private final String f13890a;

    /* renamed from: b */
    private final long f13891b;

    /* renamed from: c */
    private final long f13892c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: de.b$b */
    /* loaded from: classes.dex */
    public static final class C0208b extends m.a {

        /* renamed from: a */
        private String f13893a;

        /* renamed from: b */
        private Long f13894b;

        /* renamed from: c */
        private Long f13895c;

        @Override // de.m.a
        public m a() {
            String str = "";
            if (this.f13893a == null) {
                str = " limiterKey";
            }
            if (this.f13894b == null) {
                str = str + " limit";
            }
            if (this.f13895c == null) {
                str = str + " timeToLiveMillis";
            }
            if (str.isEmpty()) {
                return new b(this.f13893a, this.f13894b.longValue(), this.f13895c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // de.m.a
        public m.a b(long j10) {
            this.f13894b = Long.valueOf(j10);
            return this;
        }

        @Override // de.m.a
        public m.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null limiterKey");
            }
            this.f13893a = str;
            return this;
        }

        @Override // de.m.a
        public m.a d(long j10) {
            this.f13895c = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, long j10, long j11) {
        this.f13890a = str;
        this.f13891b = j10;
        this.f13892c = j11;
    }

    /* synthetic */ b(String str, long j10, long j11, a aVar) {
        this(str, j10, j11);
    }

    @Override // de.m
    public long b() {
        return this.f13891b;
    }

    @Override // de.m
    public String c() {
        return this.f13890a;
    }

    @Override // de.m
    public long d() {
        return this.f13892c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13890a.equals(mVar.c()) && this.f13891b == mVar.b() && this.f13892c == mVar.d();
    }

    public int hashCode() {
        int hashCode = (this.f13890a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f13891b;
        long j11 = this.f13892c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "RateLimit{limiterKey=" + this.f13890a + ", limit=" + this.f13891b + ", timeToLiveMillis=" + this.f13892c + "}";
    }
}
