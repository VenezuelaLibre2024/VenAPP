package xc;

import xc.f0;

/* loaded from: classes.dex */
final class o extends f0.e.d.a.b.AbstractC0507a {

    /* renamed from: a, reason: collision with root package name */
    private final long f31098a;

    /* renamed from: b, reason: collision with root package name */
    private final long f31099b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31100c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31101d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.b.AbstractC0507a.AbstractC0508a {

        /* renamed from: a, reason: collision with root package name */
        private Long f31102a;

        /* renamed from: b, reason: collision with root package name */
        private Long f31103b;

        /* renamed from: c, reason: collision with root package name */
        private String f31104c;

        /* renamed from: d, reason: collision with root package name */
        private String f31105d;

        @Override // xc.f0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public f0.e.d.a.b.AbstractC0507a a() {
            String str = "";
            if (this.f31102a == null) {
                str = " baseAddress";
            }
            if (this.f31103b == null) {
                str = str + " size";
            }
            if (this.f31104c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new o(this.f31102a.longValue(), this.f31103b.longValue(), this.f31104c, this.f31105d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public f0.e.d.a.b.AbstractC0507a.AbstractC0508a b(long j10) {
            this.f31102a = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public f0.e.d.a.b.AbstractC0507a.AbstractC0508a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f31104c = str;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public f0.e.d.a.b.AbstractC0507a.AbstractC0508a d(long j10) {
            this.f31103b = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0507a.AbstractC0508a
        public f0.e.d.a.b.AbstractC0507a.AbstractC0508a e(String str) {
            this.f31105d = str;
            return this;
        }
    }

    private o(long j10, long j11, String str, String str2) {
        this.f31098a = j10;
        this.f31099b = j11;
        this.f31100c = str;
        this.f31101d = str2;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0507a
    public long b() {
        return this.f31098a;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0507a
    public String c() {
        return this.f31100c;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0507a
    public long d() {
        return this.f31099b;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0507a
    public String e() {
        return this.f31101d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0507a)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0507a abstractC0507a = (f0.e.d.a.b.AbstractC0507a) obj;
        if (this.f31098a == abstractC0507a.b() && this.f31099b == abstractC0507a.d() && this.f31100c.equals(abstractC0507a.c())) {
            String str = this.f31101d;
            String e10 = abstractC0507a.e();
            if (str == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (str.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f31098a;
        long j11 = this.f31099b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f31100c.hashCode()) * 1000003;
        String str = this.f31101d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f31098a + ", size=" + this.f31099b + ", name=" + this.f31100c + ", uuid=" + this.f31101d + "}";
    }
}
