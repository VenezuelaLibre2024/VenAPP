package xc;

import xc.f0;

/* loaded from: classes.dex */
final class i extends f0.e.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f31029a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31030b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31031c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.e.a.b f31032d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31033e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31034f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31035g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.a.AbstractC0505a {

        /* renamed from: a, reason: collision with root package name */
        private String f31036a;

        /* renamed from: b, reason: collision with root package name */
        private String f31037b;

        /* renamed from: c, reason: collision with root package name */
        private String f31038c;

        /* renamed from: d, reason: collision with root package name */
        private f0.e.a.b f31039d;

        /* renamed from: e, reason: collision with root package name */
        private String f31040e;

        /* renamed from: f, reason: collision with root package name */
        private String f31041f;

        /* renamed from: g, reason: collision with root package name */
        private String f31042g;

        @Override // xc.f0.e.a.AbstractC0505a
        public f0.e.a a() {
            String str = "";
            if (this.f31036a == null) {
                str = " identifier";
            }
            if (this.f31037b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new i(this.f31036a, this.f31037b, this.f31038c, this.f31039d, this.f31040e, this.f31041f, this.f31042g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.a.AbstractC0505a
        public f0.e.a.AbstractC0505a b(String str) {
            this.f31041f = str;
            return this;
        }

        @Override // xc.f0.e.a.AbstractC0505a
        public f0.e.a.AbstractC0505a c(String str) {
            this.f31042g = str;
            return this;
        }

        @Override // xc.f0.e.a.AbstractC0505a
        public f0.e.a.AbstractC0505a d(String str) {
            this.f31038c = str;
            return this;
        }

        @Override // xc.f0.e.a.AbstractC0505a
        public f0.e.a.AbstractC0505a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f31036a = str;
            return this;
        }

        @Override // xc.f0.e.a.AbstractC0505a
        public f0.e.a.AbstractC0505a f(String str) {
            this.f31040e = str;
            return this;
        }

        @Override // xc.f0.e.a.AbstractC0505a
        public f0.e.a.AbstractC0505a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f31037b = str;
            return this;
        }
    }

    private i(String str, String str2, String str3, f0.e.a.b bVar, String str4, String str5, String str6) {
        this.f31029a = str;
        this.f31030b = str2;
        this.f31031c = str3;
        this.f31032d = bVar;
        this.f31033e = str4;
        this.f31034f = str5;
        this.f31035g = str6;
    }

    @Override // xc.f0.e.a
    public String b() {
        return this.f31034f;
    }

    @Override // xc.f0.e.a
    public String c() {
        return this.f31035g;
    }

    @Override // xc.f0.e.a
    public String d() {
        return this.f31031c;
    }

    @Override // xc.f0.e.a
    public String e() {
        return this.f31029a;
    }

    public boolean equals(Object obj) {
        String str;
        f0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.a)) {
            return false;
        }
        f0.e.a aVar = (f0.e.a) obj;
        if (this.f31029a.equals(aVar.e()) && this.f31030b.equals(aVar.h()) && ((str = this.f31031c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f31032d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f31033e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f31034f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f31035g;
            String c10 = aVar.c();
            if (str4 == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (str4.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    @Override // xc.f0.e.a
    public String f() {
        return this.f31033e;
    }

    @Override // xc.f0.e.a
    public f0.e.a.b g() {
        return this.f31032d;
    }

    @Override // xc.f0.e.a
    public String h() {
        return this.f31030b;
    }

    public int hashCode() {
        int hashCode = (((this.f31029a.hashCode() ^ 1000003) * 1000003) ^ this.f31030b.hashCode()) * 1000003;
        String str = this.f31031c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        f0.e.a.b bVar = this.f31032d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f31033e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f31034f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f31035g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f31029a + ", version=" + this.f31030b + ", displayVersion=" + this.f31031c + ", organization=" + this.f31032d + ", installationUuid=" + this.f31033e + ", developmentPlatform=" + this.f31034f + ", developmentPlatformVersion=" + this.f31035g + "}";
    }
}
