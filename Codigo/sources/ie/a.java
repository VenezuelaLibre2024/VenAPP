package ie;

import ie.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: a */
    private final String f17669a;

    /* renamed from: b */
    private final String f17670b;

    /* renamed from: c */
    private final String f17671c;

    /* renamed from: d */
    private final f f17672d;

    /* renamed from: e */
    private final d.b f17673e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends d.a {

        /* renamed from: a */
        private String f17674a;

        /* renamed from: b */
        private String f17675b;

        /* renamed from: c */
        private String f17676c;

        /* renamed from: d */
        private f f17677d;

        /* renamed from: e */
        private d.b f17678e;

        @Override // ie.d.a
        public d a() {
            return new a(this.f17674a, this.f17675b, this.f17676c, this.f17677d, this.f17678e);
        }

        @Override // ie.d.a
        public d.a b(f fVar) {
            this.f17677d = fVar;
            return this;
        }

        @Override // ie.d.a
        public d.a c(String str) {
            this.f17675b = str;
            return this;
        }

        @Override // ie.d.a
        public d.a d(String str) {
            this.f17676c = str;
            return this;
        }

        @Override // ie.d.a
        public d.a e(d.b bVar) {
            this.f17678e = bVar;
            return this;
        }

        @Override // ie.d.a
        public d.a f(String str) {
            this.f17674a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f17669a = str;
        this.f17670b = str2;
        this.f17671c = str3;
        this.f17672d = fVar;
        this.f17673e = bVar;
    }

    /* synthetic */ a(String str, String str2, String str3, f fVar, d.b bVar, C0287a c0287a) {
        this(str, str2, str3, fVar, bVar);
    }

    @Override // ie.d
    public f b() {
        return this.f17672d;
    }

    @Override // ie.d
    public String c() {
        return this.f17670b;
    }

    @Override // ie.d
    public String d() {
        return this.f17671c;
    }

    @Override // ie.d
    public d.b e() {
        return this.f17673e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f17669a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f17670b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f17671c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f17672d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f17673e;
                        d.b e10 = dVar.e();
                        if (bVar == null) {
                            if (e10 == null) {
                                return true;
                            }
                        } else if (bVar.equals(e10)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // ie.d
    public String f() {
        return this.f17669a;
    }

    public int hashCode() {
        String str = this.f17669a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f17670b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f17671c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f17672d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f17673e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f17669a + ", fid=" + this.f17670b + ", refreshToken=" + this.f17671c + ", authToken=" + this.f17672d + ", responseCode=" + this.f17673e + "}";
    }
}
