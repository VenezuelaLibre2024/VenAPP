package xc;

import xc.f0;

/* loaded from: classes.dex */
final class q extends f0.e.d.a.b.AbstractC0511d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31116a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31117b;

    /* renamed from: c, reason: collision with root package name */
    private final long f31118c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.b.AbstractC0511d.AbstractC0512a {

        /* renamed from: a, reason: collision with root package name */
        private String f31119a;

        /* renamed from: b, reason: collision with root package name */
        private String f31120b;

        /* renamed from: c, reason: collision with root package name */
        private Long f31121c;

        @Override // xc.f0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public f0.e.d.a.b.AbstractC0511d a() {
            String str = "";
            if (this.f31119a == null) {
                str = " name";
            }
            if (this.f31120b == null) {
                str = str + " code";
            }
            if (this.f31121c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new q(this.f31119a, this.f31120b, this.f31121c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public f0.e.d.a.b.AbstractC0511d.AbstractC0512a b(long j10) {
            this.f31121c = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public f0.e.d.a.b.AbstractC0511d.AbstractC0512a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f31120b = str;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0511d.AbstractC0512a
        public f0.e.d.a.b.AbstractC0511d.AbstractC0512a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f31119a = str;
            return this;
        }
    }

    private q(String str, String str2, long j10) {
        this.f31116a = str;
        this.f31117b = str2;
        this.f31118c = j10;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0511d
    public long b() {
        return this.f31118c;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0511d
    public String c() {
        return this.f31117b;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0511d
    public String d() {
        return this.f31116a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0511d)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0511d abstractC0511d = (f0.e.d.a.b.AbstractC0511d) obj;
        return this.f31116a.equals(abstractC0511d.d()) && this.f31117b.equals(abstractC0511d.c()) && this.f31118c == abstractC0511d.b();
    }

    public int hashCode() {
        int hashCode = (((this.f31116a.hashCode() ^ 1000003) * 1000003) ^ this.f31117b.hashCode()) * 1000003;
        long j10 = this.f31118c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f31116a + ", code=" + this.f31117b + ", address=" + this.f31118c + "}";
    }
}
