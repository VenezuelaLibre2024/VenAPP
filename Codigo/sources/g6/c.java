package g6;

import g6.a;

/* loaded from: classes.dex */
final class c extends g6.a {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f15809a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15810b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15811c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15812d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15813e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15814f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15815g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15816h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15817i;

    /* renamed from: j, reason: collision with root package name */
    private final String f15818j;

    /* renamed from: k, reason: collision with root package name */
    private final String f15819k;

    /* renamed from: l, reason: collision with root package name */
    private final String f15820l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a.AbstractC0258a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f15821a;

        /* renamed from: b, reason: collision with root package name */
        private String f15822b;

        /* renamed from: c, reason: collision with root package name */
        private String f15823c;

        /* renamed from: d, reason: collision with root package name */
        private String f15824d;

        /* renamed from: e, reason: collision with root package name */
        private String f15825e;

        /* renamed from: f, reason: collision with root package name */
        private String f15826f;

        /* renamed from: g, reason: collision with root package name */
        private String f15827g;

        /* renamed from: h, reason: collision with root package name */
        private String f15828h;

        /* renamed from: i, reason: collision with root package name */
        private String f15829i;

        /* renamed from: j, reason: collision with root package name */
        private String f15830j;

        /* renamed from: k, reason: collision with root package name */
        private String f15831k;

        /* renamed from: l, reason: collision with root package name */
        private String f15832l;

        @Override // g6.a.AbstractC0258a
        public g6.a a() {
            return new c(this.f15821a, this.f15822b, this.f15823c, this.f15824d, this.f15825e, this.f15826f, this.f15827g, this.f15828h, this.f15829i, this.f15830j, this.f15831k, this.f15832l);
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a b(String str) {
            this.f15832l = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a c(String str) {
            this.f15830j = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a d(String str) {
            this.f15824d = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a e(String str) {
            this.f15828h = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a f(String str) {
            this.f15823c = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a g(String str) {
            this.f15829i = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a h(String str) {
            this.f15827g = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a i(String str) {
            this.f15831k = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a j(String str) {
            this.f15822b = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a k(String str) {
            this.f15826f = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a l(String str) {
            this.f15825e = str;
            return this;
        }

        @Override // g6.a.AbstractC0258a
        public a.AbstractC0258a m(Integer num) {
            this.f15821a = num;
            return this;
        }
    }

    private c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f15809a = num;
        this.f15810b = str;
        this.f15811c = str2;
        this.f15812d = str3;
        this.f15813e = str4;
        this.f15814f = str5;
        this.f15815g = str6;
        this.f15816h = str7;
        this.f15817i = str8;
        this.f15818j = str9;
        this.f15819k = str10;
        this.f15820l = str11;
    }

    @Override // g6.a
    public String b() {
        return this.f15820l;
    }

    @Override // g6.a
    public String c() {
        return this.f15818j;
    }

    @Override // g6.a
    public String d() {
        return this.f15812d;
    }

    @Override // g6.a
    public String e() {
        return this.f15816h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g6.a)) {
            return false;
        }
        g6.a aVar = (g6.a) obj;
        Integer num = this.f15809a;
        if (num != null ? num.equals(aVar.m()) : aVar.m() == null) {
            String str = this.f15810b;
            if (str != null ? str.equals(aVar.j()) : aVar.j() == null) {
                String str2 = this.f15811c;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f15812d;
                    if (str3 != null ? str3.equals(aVar.d()) : aVar.d() == null) {
                        String str4 = this.f15813e;
                        if (str4 != null ? str4.equals(aVar.l()) : aVar.l() == null) {
                            String str5 = this.f15814f;
                            if (str5 != null ? str5.equals(aVar.k()) : aVar.k() == null) {
                                String str6 = this.f15815g;
                                if (str6 != null ? str6.equals(aVar.h()) : aVar.h() == null) {
                                    String str7 = this.f15816h;
                                    if (str7 != null ? str7.equals(aVar.e()) : aVar.e() == null) {
                                        String str8 = this.f15817i;
                                        if (str8 != null ? str8.equals(aVar.g()) : aVar.g() == null) {
                                            String str9 = this.f15818j;
                                            if (str9 != null ? str9.equals(aVar.c()) : aVar.c() == null) {
                                                String str10 = this.f15819k;
                                                if (str10 != null ? str10.equals(aVar.i()) : aVar.i() == null) {
                                                    String str11 = this.f15820l;
                                                    String b10 = aVar.b();
                                                    if (str11 == null) {
                                                        if (b10 == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(b10)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // g6.a
    public String f() {
        return this.f15811c;
    }

    @Override // g6.a
    public String g() {
        return this.f15817i;
    }

    @Override // g6.a
    public String h() {
        return this.f15815g;
    }

    public int hashCode() {
        Integer num = this.f15809a;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f15810b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f15811c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f15812d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f15813e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f15814f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f15815g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f15816h;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.f15817i;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.f15818j;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.f15819k;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.f15820l;
        return hashCode11 ^ (str11 != null ? str11.hashCode() : 0);
    }

    @Override // g6.a
    public String i() {
        return this.f15819k;
    }

    @Override // g6.a
    public String j() {
        return this.f15810b;
    }

    @Override // g6.a
    public String k() {
        return this.f15814f;
    }

    @Override // g6.a
    public String l() {
        return this.f15813e;
    }

    @Override // g6.a
    public Integer m() {
        return this.f15809a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f15809a + ", model=" + this.f15810b + ", hardware=" + this.f15811c + ", device=" + this.f15812d + ", product=" + this.f15813e + ", osBuild=" + this.f15814f + ", manufacturer=" + this.f15815g + ", fingerprint=" + this.f15816h + ", locale=" + this.f15817i + ", country=" + this.f15818j + ", mccMnc=" + this.f15819k + ", applicationBuild=" + this.f15820l + "}";
    }
}
