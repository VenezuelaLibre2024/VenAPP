package ie;

import ie.AbstractC7964d;

/* renamed from: ie.a */
/* loaded from: classes.dex */
final class C7961a extends AbstractC7964d {

    /* renamed from: a */
    private final String f19330a;

    /* renamed from: b */
    private final String f19331b;

    /* renamed from: c */
    private final String f19332c;

    /* renamed from: d */
    private final AbstractC7966f f19333d;

    /* renamed from: e */
    private final AbstractC7964d.b f19334e;

    /* renamed from: ie.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7964d.a {

        /* renamed from: a */
        private String f19335a;

        /* renamed from: b */
        private String f19336b;

        /* renamed from: c */
        private String f19337c;

        /* renamed from: d */
        private AbstractC7966f f19338d;

        /* renamed from: e */
        private AbstractC7964d.b f19339e;

        @Override // ie.AbstractC7964d.a
        /* renamed from: a */
        public AbstractC7964d mo24460a() {
            return new C7961a(this.f19335a, this.f19336b, this.f19337c, this.f19338d, this.f19339e);
        }

        @Override // ie.AbstractC7964d.a
        /* renamed from: b */
        public AbstractC7964d.a mo24461b(AbstractC7966f abstractC7966f) {
            this.f19338d = abstractC7966f;
            return this;
        }

        @Override // ie.AbstractC7964d.a
        /* renamed from: c */
        public AbstractC7964d.a mo24462c(String str) {
            this.f19336b = str;
            return this;
        }

        @Override // ie.AbstractC7964d.a
        /* renamed from: d */
        public AbstractC7964d.a mo24463d(String str) {
            this.f19337c = str;
            return this;
        }

        @Override // ie.AbstractC7964d.a
        /* renamed from: e */
        public AbstractC7964d.a mo24464e(AbstractC7964d.b bVar) {
            this.f19339e = bVar;
            return this;
        }

        @Override // ie.AbstractC7964d.a
        /* renamed from: f */
        public AbstractC7964d.a mo24465f(String str) {
            this.f19335a = str;
            return this;
        }
    }

    private C7961a(String str, String str2, String str3, AbstractC7966f abstractC7966f, AbstractC7964d.b bVar) {
        this.f19330a = str;
        this.f19331b = str2;
        this.f19332c = str3;
        this.f19333d = abstractC7966f;
        this.f19334e = bVar;
    }

    @Override // ie.AbstractC7964d
    /* renamed from: b */
    public AbstractC7966f mo24455b() {
        return this.f19333d;
    }

    @Override // ie.AbstractC7964d
    /* renamed from: c */
    public String mo24456c() {
        return this.f19331b;
    }

    @Override // ie.AbstractC7964d
    /* renamed from: d */
    public String mo24457d() {
        return this.f19332c;
    }

    @Override // ie.AbstractC7964d
    /* renamed from: e */
    public AbstractC7964d.b mo24458e() {
        return this.f19334e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7964d)) {
            return false;
        }
        AbstractC7964d abstractC7964d = (AbstractC7964d) obj;
        String str = this.f19330a;
        if (str != null ? str.equals(abstractC7964d.mo24459f()) : abstractC7964d.mo24459f() == null) {
            String str2 = this.f19331b;
            if (str2 != null ? str2.equals(abstractC7964d.mo24456c()) : abstractC7964d.mo24456c() == null) {
                String str3 = this.f19332c;
                if (str3 != null ? str3.equals(abstractC7964d.mo24457d()) : abstractC7964d.mo24457d() == null) {
                    AbstractC7966f abstractC7966f = this.f19333d;
                    if (abstractC7966f != null ? abstractC7966f.equals(abstractC7964d.mo24455b()) : abstractC7964d.mo24455b() == null) {
                        AbstractC7964d.b bVar = this.f19334e;
                        AbstractC7964d.b mo24458e = abstractC7964d.mo24458e();
                        if (bVar == null) {
                            if (mo24458e == null) {
                                return true;
                            }
                        } else if (bVar.equals(mo24458e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ie.AbstractC7964d
    /* renamed from: f */
    public String mo24459f() {
        return this.f19330a;
    }

    public int hashCode() {
        String str = this.f19330a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f19331b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f19332c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC7966f abstractC7966f = this.f19333d;
        int hashCode4 = (hashCode3 ^ (abstractC7966f == null ? 0 : abstractC7966f.hashCode())) * 1000003;
        AbstractC7964d.b bVar = this.f19334e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f19330a + ", fid=" + this.f19331b + ", refreshToken=" + this.f19332c + ", authToken=" + this.f19333d + ", responseCode=" + this.f19334e + "}";
    }
}
