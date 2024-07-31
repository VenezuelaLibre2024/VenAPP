package cf;

import cf.AbstractC1961d;

/* renamed from: cf.b */
/* loaded from: classes2.dex */
final class C1959b extends AbstractC1961d {

    /* renamed from: b */
    private final String f8038b;

    /* renamed from: c */
    private final String f8039c;

    /* renamed from: d */
    private final String f8040d;

    /* renamed from: e */
    private final String f8041e;

    /* renamed from: f */
    private final long f8042f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cf.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC1961d.a {

        /* renamed from: a */
        private String f8043a;

        /* renamed from: b */
        private String f8044b;

        /* renamed from: c */
        private String f8045c;

        /* renamed from: d */
        private String f8046d;

        /* renamed from: e */
        private long f8047e;

        /* renamed from: f */
        private byte f8048f;

        @Override // cf.AbstractC1961d.a
        /* renamed from: a */
        public AbstractC1961d mo10205a() {
            if (this.f8048f == 1 && this.f8043a != null && this.f8044b != null && this.f8045c != null && this.f8046d != null) {
                return new C1959b(this.f8043a, this.f8044b, this.f8045c, this.f8046d, this.f8047e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f8043a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f8044b == null) {
                sb2.append(" variantId");
            }
            if (this.f8045c == null) {
                sb2.append(" parameterKey");
            }
            if (this.f8046d == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f8048f) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // cf.AbstractC1961d.a
        /* renamed from: b */
        public AbstractC1961d.a mo10206b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f8045c = str;
            return this;
        }

        @Override // cf.AbstractC1961d.a
        /* renamed from: c */
        public AbstractC1961d.a mo10207c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f8046d = str;
            return this;
        }

        @Override // cf.AbstractC1961d.a
        /* renamed from: d */
        public AbstractC1961d.a mo10208d(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f8043a = str;
            return this;
        }

        @Override // cf.AbstractC1961d.a
        /* renamed from: e */
        public AbstractC1961d.a mo10209e(long j10) {
            this.f8047e = j10;
            this.f8048f = (byte) (this.f8048f | 1);
            return this;
        }

        @Override // cf.AbstractC1961d.a
        /* renamed from: f */
        public AbstractC1961d.a mo10210f(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f8044b = str;
            return this;
        }
    }

    private C1959b(String str, String str2, String str3, String str4, long j10) {
        this.f8038b = str;
        this.f8039c = str2;
        this.f8040d = str3;
        this.f8041e = str4;
        this.f8042f = j10;
    }

    @Override // cf.AbstractC1961d
    /* renamed from: b */
    public String mo10200b() {
        return this.f8040d;
    }

    @Override // cf.AbstractC1961d
    /* renamed from: c */
    public String mo10201c() {
        return this.f8041e;
    }

    @Override // cf.AbstractC1961d
    /* renamed from: d */
    public String mo10202d() {
        return this.f8038b;
    }

    @Override // cf.AbstractC1961d
    /* renamed from: e */
    public long mo10203e() {
        return this.f8042f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1961d)) {
            return false;
        }
        AbstractC1961d abstractC1961d = (AbstractC1961d) obj;
        return this.f8038b.equals(abstractC1961d.mo10202d()) && this.f8039c.equals(abstractC1961d.mo10204f()) && this.f8040d.equals(abstractC1961d.mo10200b()) && this.f8041e.equals(abstractC1961d.mo10201c()) && this.f8042f == abstractC1961d.mo10203e();
    }

    @Override // cf.AbstractC1961d
    /* renamed from: f */
    public String mo10204f() {
        return this.f8039c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f8038b.hashCode() ^ 1000003) * 1000003) ^ this.f8039c.hashCode()) * 1000003) ^ this.f8040d.hashCode()) * 1000003) ^ this.f8041e.hashCode()) * 1000003;
        long j10 = this.f8042f;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f8038b + ", variantId=" + this.f8039c + ", parameterKey=" + this.f8040d + ", parameterValue=" + this.f8041e + ", templateVersion=" + this.f8042f + "}";
    }
}
