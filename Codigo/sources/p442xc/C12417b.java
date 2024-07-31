package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.b */
/* loaded from: classes.dex */
final class C12417b extends AbstractC12426f0 {

    /* renamed from: b */
    private final String f33445b;

    /* renamed from: c */
    private final String f33446c;

    /* renamed from: d */
    private final int f33447d;

    /* renamed from: e */
    private final String f33448e;

    /* renamed from: f */
    private final String f33449f;

    /* renamed from: g */
    private final String f33450g;

    /* renamed from: h */
    private final String f33451h;

    /* renamed from: i */
    private final String f33452i;

    /* renamed from: j */
    private final AbstractC12426f0.e f33453j;

    /* renamed from: k */
    private final AbstractC12426f0.d f33454k;

    /* renamed from: l */
    private final AbstractC12426f0.a f33455l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.b {

        /* renamed from: a */
        private String f33456a;

        /* renamed from: b */
        private String f33457b;

        /* renamed from: c */
        private Integer f33458c;

        /* renamed from: d */
        private String f33459d;

        /* renamed from: e */
        private String f33460e;

        /* renamed from: f */
        private String f33461f;

        /* renamed from: g */
        private String f33462g;

        /* renamed from: h */
        private String f33463h;

        /* renamed from: i */
        private AbstractC12426f0.e f33464i;

        /* renamed from: j */
        private AbstractC12426f0.d f33465j;

        /* renamed from: k */
        private AbstractC12426f0.a f33466k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC12426f0 abstractC12426f0) {
            this.f33456a = abstractC12426f0.mo40110l();
            this.f33457b = abstractC12426f0.mo40106h();
            this.f33458c = Integer.valueOf(abstractC12426f0.mo40109k());
            this.f33459d = abstractC12426f0.mo40107i();
            this.f33460e = abstractC12426f0.mo40105g();
            this.f33461f = abstractC12426f0.mo40102d();
            this.f33462g = abstractC12426f0.mo40103e();
            this.f33463h = abstractC12426f0.mo40104f();
            this.f33464i = abstractC12426f0.mo40111m();
            this.f33465j = abstractC12426f0.mo40108j();
            this.f33466k = abstractC12426f0.mo40101c();
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: a */
        public AbstractC12426f0 mo40113a() {
            String str = "";
            if (this.f33456a == null) {
                str = " sdkVersion";
            }
            if (this.f33457b == null) {
                str = str + " gmpAppId";
            }
            if (this.f33458c == null) {
                str = str + " platform";
            }
            if (this.f33459d == null) {
                str = str + " installationUuid";
            }
            if (this.f33462g == null) {
                str = str + " buildVersion";
            }
            if (this.f33463h == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C12417b(this.f33456a, this.f33457b, this.f33458c.intValue(), this.f33459d, this.f33460e, this.f33461f, this.f33462g, this.f33463h, this.f33464i, this.f33465j, this.f33466k);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: b */
        public AbstractC12426f0.b mo40114b(AbstractC12426f0.a aVar) {
            this.f33466k = aVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: c */
        public AbstractC12426f0.b mo40115c(String str) {
            this.f33461f = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: d */
        public AbstractC12426f0.b mo40116d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f33462g = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: e */
        public AbstractC12426f0.b mo40117e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f33463h = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: f */
        public AbstractC12426f0.b mo40118f(String str) {
            this.f33460e = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: g */
        public AbstractC12426f0.b mo40119g(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f33457b = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: h */
        public AbstractC12426f0.b mo40120h(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f33459d = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: i */
        public AbstractC12426f0.b mo40121i(AbstractC12426f0.d dVar) {
            this.f33465j = dVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: j */
        public AbstractC12426f0.b mo40122j(int i10) {
            this.f33458c = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: k */
        public AbstractC12426f0.b mo40123k(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f33456a = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.b
        /* renamed from: l */
        public AbstractC12426f0.b mo40124l(AbstractC12426f0.e eVar) {
            this.f33464i = eVar;
            return this;
        }
    }

    private C12417b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, AbstractC12426f0.e eVar, AbstractC12426f0.d dVar, AbstractC12426f0.a aVar) {
        this.f33445b = str;
        this.f33446c = str2;
        this.f33447d = i10;
        this.f33448e = str3;
        this.f33449f = str4;
        this.f33450g = str5;
        this.f33451h = str6;
        this.f33452i = str7;
        this.f33453j = eVar;
        this.f33454k = dVar;
        this.f33455l = aVar;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: c */
    public AbstractC12426f0.a mo40101c() {
        return this.f33455l;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: d */
    public String mo40102d() {
        return this.f33450g;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: e */
    public String mo40103e() {
        return this.f33451h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        AbstractC12426f0.e eVar;
        AbstractC12426f0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0)) {
            return false;
        }
        AbstractC12426f0 abstractC12426f0 = (AbstractC12426f0) obj;
        if (this.f33445b.equals(abstractC12426f0.mo40110l()) && this.f33446c.equals(abstractC12426f0.mo40106h()) && this.f33447d == abstractC12426f0.mo40109k() && this.f33448e.equals(abstractC12426f0.mo40107i()) && ((str = this.f33449f) != null ? str.equals(abstractC12426f0.mo40105g()) : abstractC12426f0.mo40105g() == null) && ((str2 = this.f33450g) != null ? str2.equals(abstractC12426f0.mo40102d()) : abstractC12426f0.mo40102d() == null) && this.f33451h.equals(abstractC12426f0.mo40103e()) && this.f33452i.equals(abstractC12426f0.mo40104f()) && ((eVar = this.f33453j) != null ? eVar.equals(abstractC12426f0.mo40111m()) : abstractC12426f0.mo40111m() == null) && ((dVar = this.f33454k) != null ? dVar.equals(abstractC12426f0.mo40108j()) : abstractC12426f0.mo40108j() == null)) {
            AbstractC12426f0.a aVar = this.f33455l;
            AbstractC12426f0.a mo40101c = abstractC12426f0.mo40101c();
            if (aVar == null) {
                if (mo40101c == null) {
                    return true;
                }
            } else if (aVar.equals(mo40101c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: f */
    public String mo40104f() {
        return this.f33452i;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: g */
    public String mo40105g() {
        return this.f33449f;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: h */
    public String mo40106h() {
        return this.f33446c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f33445b.hashCode() ^ 1000003) * 1000003) ^ this.f33446c.hashCode()) * 1000003) ^ this.f33447d) * 1000003) ^ this.f33448e.hashCode()) * 1000003;
        String str = this.f33449f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f33450g;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f33451h.hashCode()) * 1000003) ^ this.f33452i.hashCode()) * 1000003;
        AbstractC12426f0.e eVar = this.f33453j;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC12426f0.d dVar = this.f33454k;
        int hashCode5 = (hashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC12426f0.a aVar = this.f33455l;
        return hashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: i */
    public String mo40107i() {
        return this.f33448e;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: j */
    public AbstractC12426f0.d mo40108j() {
        return this.f33454k;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: k */
    public int mo40109k() {
        return this.f33447d;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: l */
    public String mo40110l() {
        return this.f33445b;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: m */
    public AbstractC12426f0.e mo40111m() {
        return this.f33453j;
    }

    @Override // p442xc.AbstractC12426f0
    /* renamed from: n */
    protected AbstractC12426f0.b mo40112n() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f33445b + ", gmpAppId=" + this.f33446c + ", platform=" + this.f33447d + ", installationUuid=" + this.f33448e + ", firebaseInstallationId=" + this.f33449f + ", appQualitySessionId=" + this.f33450g + ", buildVersion=" + this.f33451h + ", displayVersion=" + this.f33452i + ", session=" + this.f33453j + ", ndkPayload=" + this.f33454k + ", appExitInfo=" + this.f33455l + "}";
    }
}
