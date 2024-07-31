package cf;

import cf.d;

/* loaded from: classes2.dex */
final class b extends d {

    /* renamed from: b */
    private final String f7086b;

    /* renamed from: c */
    private final String f7087c;

    /* renamed from: d */
    private final String f7088d;

    /* renamed from: e */
    private final String f7089e;

    /* renamed from: f */
    private final long f7090f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cf.b$b */
    /* loaded from: classes2.dex */
    public static final class C0122b extends d.a {

        /* renamed from: a */
        private String f7091a;

        /* renamed from: b */
        private String f7092b;

        /* renamed from: c */
        private String f7093c;

        /* renamed from: d */
        private String f7094d;

        /* renamed from: e */
        private long f7095e;

        /* renamed from: f */
        private byte f7096f;

        @Override // cf.d.a
        public d a() {
            if (this.f7096f == 1 && this.f7091a != null && this.f7092b != null && this.f7093c != null && this.f7094d != null) {
                return new b(this.f7091a, this.f7092b, this.f7093c, this.f7094d, this.f7095e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f7091a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f7092b == null) {
                sb2.append(" variantId");
            }
            if (this.f7093c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f7094d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f7096f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // cf.d.a
        public d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f7093c = str;
            return this;
        }

        @Override // cf.d.a
        public d.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f7094d = str;
            return this;
        }

        @Override // cf.d.a
        public d.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f7091a = str;
            return this;
        }

        @Override // cf.d.a
        public d.a e(long j10) {
            this.f7095e = j10;
            this.f7096f = (byte) (this.f7096f | 1);
            return this;
        }

        @Override // cf.d.a
        public d.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f7092b = str;
            return this;
        }
    }

    private b(String str, String str2, String str3, String str4, long j10) {
        this.f7086b = str;
        this.f7087c = str2;
        this.f7088d = str3;
        this.f7089e = str4;
        this.f7090f = j10;
    }

    /* synthetic */ b(String str, String str2, String str3, String str4, long j10, a aVar) {
        this(str, str2, str3, str4, j10);
    }

    @Override // cf.d
    public String b() {
        return this.f7088d;
    }

    @Override // cf.d
    public String c() {
        return this.f7089e;
    }

    @Override // cf.d
    public String d() {
        return this.f7086b;
    }

    @Override // cf.d
    public long e() {
        return this.f7090f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7086b.equals(dVar.d()) && this.f7087c.equals(dVar.f()) && this.f7088d.equals(dVar.b()) && this.f7089e.equals(dVar.c()) && this.f7090f == dVar.e();
    }

    @Override // cf.d
    public String f() {
        return this.f7087c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f7086b.hashCode() ^ 1000003) * 1000003) ^ this.f7087c.hashCode()) * 1000003) ^ this.f7088d.hashCode()) * 1000003) ^ this.f7089e.hashCode()) * 1000003;
        long j10 = this.f7090f;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f7086b + ", variantId=" + this.f7087c + ", parameterKey=" + this.f7088d + ", parameterValue=" + this.f7089e + ", templateVersion=" + this.f7090f + "}";
    }
}
