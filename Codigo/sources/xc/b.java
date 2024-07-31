package xc;

import xc.f0;

/* loaded from: classes.dex */
final class b extends f0 {

    /* renamed from: b, reason: collision with root package name */
    private final String f30925b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30926c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30927d;

    /* renamed from: e, reason: collision with root package name */
    private final String f30928e;

    /* renamed from: f, reason: collision with root package name */
    private final String f30929f;

    /* renamed from: g, reason: collision with root package name */
    private final String f30930g;

    /* renamed from: h, reason: collision with root package name */
    private final String f30931h;

    /* renamed from: i, reason: collision with root package name */
    private final String f30932i;

    /* renamed from: j, reason: collision with root package name */
    private final f0.e f30933j;

    /* renamed from: k, reason: collision with root package name */
    private final f0.d f30934k;

    /* renamed from: l, reason: collision with root package name */
    private final f0.a f30935l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0502b extends f0.b {

        /* renamed from: a, reason: collision with root package name */
        private String f30936a;

        /* renamed from: b, reason: collision with root package name */
        private String f30937b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f30938c;

        /* renamed from: d, reason: collision with root package name */
        private String f30939d;

        /* renamed from: e, reason: collision with root package name */
        private String f30940e;

        /* renamed from: f, reason: collision with root package name */
        private String f30941f;

        /* renamed from: g, reason: collision with root package name */
        private String f30942g;

        /* renamed from: h, reason: collision with root package name */
        private String f30943h;

        /* renamed from: i, reason: collision with root package name */
        private f0.e f30944i;

        /* renamed from: j, reason: collision with root package name */
        private f0.d f30945j;

        /* renamed from: k, reason: collision with root package name */
        private f0.a f30946k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0502b() {
        }

        private C0502b(f0 f0Var) {
            this.f30936a = f0Var.l();
            this.f30937b = f0Var.h();
            this.f30938c = Integer.valueOf(f0Var.k());
            this.f30939d = f0Var.i();
            this.f30940e = f0Var.g();
            this.f30941f = f0Var.d();
            this.f30942g = f0Var.e();
            this.f30943h = f0Var.f();
            this.f30944i = f0Var.m();
            this.f30945j = f0Var.j();
            this.f30946k = f0Var.c();
        }

        @Override // xc.f0.b
        public f0 a() {
            String str = "";
            if (this.f30936a == null) {
                str = " sdkVersion";
            }
            if (this.f30937b == null) {
                str = str + " gmpAppId";
            }
            if (this.f30938c == null) {
                str = str + " platform";
            }
            if (this.f30939d == null) {
                str = str + " installationUuid";
            }
            if (this.f30942g == null) {
                str = str + " buildVersion";
            }
            if (this.f30943h == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f30936a, this.f30937b, this.f30938c.intValue(), this.f30939d, this.f30940e, this.f30941f, this.f30942g, this.f30943h, this.f30944i, this.f30945j, this.f30946k);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.b
        public f0.b b(f0.a aVar) {
            this.f30946k = aVar;
            return this;
        }

        @Override // xc.f0.b
        public f0.b c(String str) {
            this.f30941f = str;
            return this;
        }

        @Override // xc.f0.b
        public f0.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f30942g = str;
            return this;
        }

        @Override // xc.f0.b
        public f0.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f30943h = str;
            return this;
        }

        @Override // xc.f0.b
        public f0.b f(String str) {
            this.f30940e = str;
            return this;
        }

        @Override // xc.f0.b
        public f0.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f30937b = str;
            return this;
        }

        @Override // xc.f0.b
        public f0.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f30939d = str;
            return this;
        }

        @Override // xc.f0.b
        public f0.b i(f0.d dVar) {
            this.f30945j = dVar;
            return this;
        }

        @Override // xc.f0.b
        public f0.b j(int i10) {
            this.f30938c = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.b
        public f0.b k(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f30936a = str;
            return this;
        }

        @Override // xc.f0.b
        public f0.b l(f0.e eVar) {
            this.f30944i = eVar;
            return this;
        }
    }

    private b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, f0.e eVar, f0.d dVar, f0.a aVar) {
        this.f30925b = str;
        this.f30926c = str2;
        this.f30927d = i10;
        this.f30928e = str3;
        this.f30929f = str4;
        this.f30930g = str5;
        this.f30931h = str6;
        this.f30932i = str7;
        this.f30933j = eVar;
        this.f30934k = dVar;
        this.f30935l = aVar;
    }

    @Override // xc.f0
    public f0.a c() {
        return this.f30935l;
    }

    @Override // xc.f0
    public String d() {
        return this.f30930g;
    }

    @Override // xc.f0
    public String e() {
        return this.f30931h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        f0.e eVar;
        f0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f30925b.equals(f0Var.l()) && this.f30926c.equals(f0Var.h()) && this.f30927d == f0Var.k() && this.f30928e.equals(f0Var.i()) && ((str = this.f30929f) != null ? str.equals(f0Var.g()) : f0Var.g() == null) && ((str2 = this.f30930g) != null ? str2.equals(f0Var.d()) : f0Var.d() == null) && this.f30931h.equals(f0Var.e()) && this.f30932i.equals(f0Var.f()) && ((eVar = this.f30933j) != null ? eVar.equals(f0Var.m()) : f0Var.m() == null) && ((dVar = this.f30934k) != null ? dVar.equals(f0Var.j()) : f0Var.j() == null)) {
            f0.a aVar = this.f30935l;
            f0.a c10 = f0Var.c();
            if (aVar == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (aVar.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    @Override // xc.f0
    public String f() {
        return this.f30932i;
    }

    @Override // xc.f0
    public String g() {
        return this.f30929f;
    }

    @Override // xc.f0
    public String h() {
        return this.f30926c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f30925b.hashCode() ^ 1000003) * 1000003) ^ this.f30926c.hashCode()) * 1000003) ^ this.f30927d) * 1000003) ^ this.f30928e.hashCode()) * 1000003;
        String str = this.f30929f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f30930g;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f30931h.hashCode()) * 1000003) ^ this.f30932i.hashCode()) * 1000003;
        f0.e eVar = this.f30933j;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.d dVar = this.f30934k;
        int hashCode5 = (hashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f0.a aVar = this.f30935l;
        return hashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // xc.f0
    public String i() {
        return this.f30928e;
    }

    @Override // xc.f0
    public f0.d j() {
        return this.f30934k;
    }

    @Override // xc.f0
    public int k() {
        return this.f30927d;
    }

    @Override // xc.f0
    public String l() {
        return this.f30925b;
    }

    @Override // xc.f0
    public f0.e m() {
        return this.f30933j;
    }

    @Override // xc.f0
    protected f0.b n() {
        return new C0502b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f30925b + ", gmpAppId=" + this.f30926c + ", platform=" + this.f30927d + ", installationUuid=" + this.f30928e + ", firebaseInstallationId=" + this.f30929f + ", appQualitySessionId=" + this.f30930g + ", buildVersion=" + this.f30931h + ", displayVersion=" + this.f30932i + ", session=" + this.f30933j + ", ndkPayload=" + this.f30934k + ", appExitInfo=" + this.f30935l + "}";
    }
}
