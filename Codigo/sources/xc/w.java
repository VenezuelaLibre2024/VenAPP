package xc;

import xc.f0;

/* loaded from: classes.dex */
final class w extends f0.e.d.AbstractC0519e {

    /* renamed from: a, reason: collision with root package name */
    private final f0.e.d.AbstractC0519e.b f31160a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31161b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31162c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31163d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.AbstractC0519e.a {

        /* renamed from: a, reason: collision with root package name */
        private f0.e.d.AbstractC0519e.b f31164a;

        /* renamed from: b, reason: collision with root package name */
        private String f31165b;

        /* renamed from: c, reason: collision with root package name */
        private String f31166c;

        /* renamed from: d, reason: collision with root package name */
        private Long f31167d;

        @Override // xc.f0.e.d.AbstractC0519e.a
        public f0.e.d.AbstractC0519e a() {
            String str = "";
            if (this.f31164a == null) {
                str = " rolloutVariant";
            }
            if (this.f31165b == null) {
                str = str + " parameterKey";
            }
            if (this.f31166c == null) {
                str = str + " parameterValue";
            }
            if (this.f31167d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new w(this.f31164a, this.f31165b, this.f31166c, this.f31167d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.AbstractC0519e.a
        public f0.e.d.AbstractC0519e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f31165b = str;
            return this;
        }

        @Override // xc.f0.e.d.AbstractC0519e.a
        public f0.e.d.AbstractC0519e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f31166c = str;
            return this;
        }

        @Override // xc.f0.e.d.AbstractC0519e.a
        public f0.e.d.AbstractC0519e.a d(f0.e.d.AbstractC0519e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f31164a = bVar;
            return this;
        }

        @Override // xc.f0.e.d.AbstractC0519e.a
        public f0.e.d.AbstractC0519e.a e(long j10) {
            this.f31167d = Long.valueOf(j10);
            return this;
        }
    }

    private w(f0.e.d.AbstractC0519e.b bVar, String str, String str2, long j10) {
        this.f31160a = bVar;
        this.f31161b = str;
        this.f31162c = str2;
        this.f31163d = j10;
    }

    @Override // xc.f0.e.d.AbstractC0519e
    public String b() {
        return this.f31161b;
    }

    @Override // xc.f0.e.d.AbstractC0519e
    public String c() {
        return this.f31162c;
    }

    @Override // xc.f0.e.d.AbstractC0519e
    public f0.e.d.AbstractC0519e.b d() {
        return this.f31160a;
    }

    @Override // xc.f0.e.d.AbstractC0519e
    public long e() {
        return this.f31163d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0519e)) {
            return false;
        }
        f0.e.d.AbstractC0519e abstractC0519e = (f0.e.d.AbstractC0519e) obj;
        return this.f31160a.equals(abstractC0519e.d()) && this.f31161b.equals(abstractC0519e.b()) && this.f31162c.equals(abstractC0519e.c()) && this.f31163d == abstractC0519e.e();
    }

    public int hashCode() {
        int hashCode = (((((this.f31160a.hashCode() ^ 1000003) * 1000003) ^ this.f31161b.hashCode()) * 1000003) ^ this.f31162c.hashCode()) * 1000003;
        long j10 = this.f31163d;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f31160a + ", parameterKey=" + this.f31161b + ", parameterValue=" + this.f31162c + ", templateVersion=" + this.f31163d + "}";
    }
}
