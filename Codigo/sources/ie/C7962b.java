package ie;

import ie.AbstractC7966f;

/* renamed from: ie.b */
/* loaded from: classes.dex */
final class C7962b extends AbstractC7966f {

    /* renamed from: a */
    private final String f19340a;

    /* renamed from: b */
    private final long f19341b;

    /* renamed from: c */
    private final AbstractC7966f.b f19342c;

    /* renamed from: ie.b$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7966f.a {

        /* renamed from: a */
        private String f19343a;

        /* renamed from: b */
        private Long f19344b;

        /* renamed from: c */
        private AbstractC7966f.b f19345c;

        @Override // ie.AbstractC7966f.a
        /* renamed from: a */
        public AbstractC7966f mo24469a() {
            String str = "";
            if (this.f19344b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C7962b(this.f19343a, this.f19344b.longValue(), this.f19345c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ie.AbstractC7966f.a
        /* renamed from: b */
        public AbstractC7966f.a mo24470b(AbstractC7966f.b bVar) {
            this.f19345c = bVar;
            return this;
        }

        @Override // ie.AbstractC7966f.a
        /* renamed from: c */
        public AbstractC7966f.a mo24471c(String str) {
            this.f19343a = str;
            return this;
        }

        @Override // ie.AbstractC7966f.a
        /* renamed from: d */
        public AbstractC7966f.a mo24472d(long j10) {
            this.f19344b = Long.valueOf(j10);
            return this;
        }
    }

    private C7962b(String str, long j10, AbstractC7966f.b bVar) {
        this.f19340a = str;
        this.f19341b = j10;
        this.f19342c = bVar;
    }

    @Override // ie.AbstractC7966f
    /* renamed from: b */
    public AbstractC7966f.b mo24466b() {
        return this.f19342c;
    }

    @Override // ie.AbstractC7966f
    /* renamed from: c */
    public String mo24467c() {
        return this.f19340a;
    }

    @Override // ie.AbstractC7966f
    /* renamed from: d */
    public long mo24468d() {
        return this.f19341b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7966f)) {
            return false;
        }
        AbstractC7966f abstractC7966f = (AbstractC7966f) obj;
        String str = this.f19340a;
        if (str != null ? str.equals(abstractC7966f.mo24467c()) : abstractC7966f.mo24467c() == null) {
            if (this.f19341b == abstractC7966f.mo24468d()) {
                AbstractC7966f.b bVar = this.f19342c;
                AbstractC7966f.b mo24466b = abstractC7966f.mo24466b();
                if (bVar == null) {
                    if (mo24466b == null) {
                        return true;
                    }
                } else if (bVar.equals(mo24466b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f19340a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f19341b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        AbstractC7966f.b bVar = this.f19342c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f19340a + ", tokenExpirationTimestamp=" + this.f19341b + ", responseCode=" + this.f19342c + "}";
    }
}
