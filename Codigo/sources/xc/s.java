package xc;

import xc.f0;

/* loaded from: classes.dex */
final class s extends f0.e.d.a.b.AbstractC0513e.AbstractC0515b {

    /* renamed from: a, reason: collision with root package name */
    private final long f31128a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31129b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31130c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31131d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31132e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a {

        /* renamed from: a, reason: collision with root package name */
        private Long f31133a;

        /* renamed from: b, reason: collision with root package name */
        private String f31134b;

        /* renamed from: c, reason: collision with root package name */
        private String f31135c;

        /* renamed from: d, reason: collision with root package name */
        private Long f31136d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f31137e;

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0515b a() {
            String str = "";
            if (this.f31133a == null) {
                str = " pc";
            }
            if (this.f31134b == null) {
                str = str + " symbol";
            }
            if (this.f31136d == null) {
                str = str + " offset";
            }
            if (this.f31137e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new s(this.f31133a.longValue(), this.f31134b, this.f31135c, this.f31136d.longValue(), this.f31137e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a b(String str) {
            this.f31135c = str;
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a c(int i10) {
            this.f31137e = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a d(long j10) {
            this.f31136d = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a e(long j10) {
            this.f31133a = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a
        public f0.e.d.a.b.AbstractC0513e.AbstractC0515b.AbstractC0516a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f31134b = str;
            return this;
        }
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f31128a = j10;
        this.f31129b = str;
        this.f31130c = str2;
        this.f31131d = j11;
        this.f31132e = i10;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public String b() {
        return this.f31130c;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public int c() {
        return this.f31132e;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public long d() {
        return this.f31131d;
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public long e() {
        return this.f31128a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.AbstractC0513e.AbstractC0515b)) {
            return false;
        }
        f0.e.d.a.b.AbstractC0513e.AbstractC0515b abstractC0515b = (f0.e.d.a.b.AbstractC0513e.AbstractC0515b) obj;
        return this.f31128a == abstractC0515b.e() && this.f31129b.equals(abstractC0515b.f()) && ((str = this.f31130c) != null ? str.equals(abstractC0515b.b()) : abstractC0515b.b() == null) && this.f31131d == abstractC0515b.d() && this.f31132e == abstractC0515b.c();
    }

    @Override // xc.f0.e.d.a.b.AbstractC0513e.AbstractC0515b
    public String f() {
        return this.f31129b;
    }

    public int hashCode() {
        long j10 = this.f31128a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f31129b.hashCode()) * 1000003;
        String str = this.f31130c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f31131d;
        return ((hashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f31132e;
    }

    public String toString() {
        return "Frame{pc=" + this.f31128a + ", symbol=" + this.f31129b + ", file=" + this.f31130c + ", offset=" + this.f31131d + ", importance=" + this.f31132e + "}";
    }
}
