package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.i */
/* loaded from: classes.dex */
final class C12430i extends AbstractC12426f0.e.a {

    /* renamed from: a */
    private final String f33549a;

    /* renamed from: b */
    private final String f33550b;

    /* renamed from: c */
    private final String f33551c;

    /* renamed from: d */
    private final AbstractC12426f0.e.a.b f33552d;

    /* renamed from: e */
    private final String f33553e;

    /* renamed from: f */
    private final String f33554f;

    /* renamed from: g */
    private final String f33555g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.a.AbstractC13273a {

        /* renamed from: a */
        private String f33556a;

        /* renamed from: b */
        private String f33557b;

        /* renamed from: c */
        private String f33558c;

        /* renamed from: d */
        private AbstractC12426f0.e.a.b f33559d;

        /* renamed from: e */
        private String f33560e;

        /* renamed from: f */
        private String f33561f;

        /* renamed from: g */
        private String f33562g;

        @Override // p442xc.AbstractC12426f0.e.a.AbstractC13273a
        /* renamed from: a */
        public AbstractC12426f0.e.a mo40226a() {
            String str = "";
            if (this.f33556a == null) {
                str = " identifier";
            }
            if (this.f33557b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C12430i(this.f33556a, this.f33557b, this.f33558c, this.f33559d, this.f33560e, this.f33561f, this.f33562g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.a.AbstractC13273a
        /* renamed from: b */
        public AbstractC12426f0.e.a.AbstractC13273a mo40227b(String str) {
            this.f33561f = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.a.AbstractC13273a
        /* renamed from: c */
        public AbstractC12426f0.e.a.AbstractC13273a mo40228c(String str) {
            this.f33562g = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.a.AbstractC13273a
        /* renamed from: d */
        public AbstractC12426f0.e.a.AbstractC13273a mo40229d(String str) {
            this.f33558c = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.a.AbstractC13273a
        /* renamed from: e */
        public AbstractC12426f0.e.a.AbstractC13273a mo40230e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f33556a = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.a.AbstractC13273a
        /* renamed from: f */
        public AbstractC12426f0.e.a.AbstractC13273a mo40231f(String str) {
            this.f33560e = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.a.AbstractC13273a
        /* renamed from: g */
        public AbstractC12426f0.e.a.AbstractC13273a mo40232g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f33557b = str;
            return this;
        }
    }

    private C12430i(String str, String str2, String str3, AbstractC12426f0.e.a.b bVar, String str4, String str5, String str6) {
        this.f33549a = str;
        this.f33550b = str2;
        this.f33551c = str3;
        this.f33552d = bVar;
        this.f33553e = str4;
        this.f33554f = str5;
        this.f33555g = str6;
    }

    @Override // p442xc.AbstractC12426f0.e.a
    /* renamed from: b */
    public String mo40219b() {
        return this.f33554f;
    }

    @Override // p442xc.AbstractC12426f0.e.a
    /* renamed from: c */
    public String mo40220c() {
        return this.f33555g;
    }

    @Override // p442xc.AbstractC12426f0.e.a
    /* renamed from: d */
    public String mo40221d() {
        return this.f33551c;
    }

    @Override // p442xc.AbstractC12426f0.e.a
    /* renamed from: e */
    public String mo40222e() {
        return this.f33549a;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC12426f0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.a)) {
            return false;
        }
        AbstractC12426f0.e.a aVar = (AbstractC12426f0.e.a) obj;
        if (this.f33549a.equals(aVar.mo40222e()) && this.f33550b.equals(aVar.mo40225h()) && ((str = this.f33551c) != null ? str.equals(aVar.mo40221d()) : aVar.mo40221d() == null) && ((bVar = this.f33552d) != null ? bVar.equals(aVar.mo40224g()) : aVar.mo40224g() == null) && ((str2 = this.f33553e) != null ? str2.equals(aVar.mo40223f()) : aVar.mo40223f() == null) && ((str3 = this.f33554f) != null ? str3.equals(aVar.mo40219b()) : aVar.mo40219b() == null)) {
            String str4 = this.f33555g;
            String mo40220c = aVar.mo40220c();
            if (str4 == null) {
                if (mo40220c == null) {
                    return true;
                }
            } else if (str4.equals(mo40220c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p442xc.AbstractC12426f0.e.a
    /* renamed from: f */
    public String mo40223f() {
        return this.f33553e;
    }

    @Override // p442xc.AbstractC12426f0.e.a
    /* renamed from: g */
    public AbstractC12426f0.e.a.b mo40224g() {
        return this.f33552d;
    }

    @Override // p442xc.AbstractC12426f0.e.a
    /* renamed from: h */
    public String mo40225h() {
        return this.f33550b;
    }

    public int hashCode() {
        int hashCode = (((this.f33549a.hashCode() ^ 1000003) * 1000003) ^ this.f33550b.hashCode()) * 1000003;
        String str = this.f33551c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC12426f0.e.a.b bVar = this.f33552d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f33553e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f33554f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f33555g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f33549a + ", version=" + this.f33550b + ", displayVersion=" + this.f33551c + ", organization=" + this.f33552d + ", installationUuid=" + this.f33553e + ", developmentPlatform=" + this.f33554f + ", developmentPlatformVersion=" + this.f33555g + "}";
    }
}
