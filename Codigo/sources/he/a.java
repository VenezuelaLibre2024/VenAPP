package he;

import he.c;
import he.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b */
    private final String f16714b;

    /* renamed from: c */
    private final c.a f16715c;

    /* renamed from: d */
    private final String f16716d;

    /* renamed from: e */
    private final String f16717e;

    /* renamed from: f */
    private final long f16718f;

    /* renamed from: g */
    private final long f16719g;

    /* renamed from: h */
    private final String f16720h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends d.a {

        /* renamed from: a */
        private String f16721a;

        /* renamed from: b */
        private c.a f16722b;

        /* renamed from: c */
        private String f16723c;

        /* renamed from: d */
        private String f16724d;

        /* renamed from: e */
        private Long f16725e;

        /* renamed from: f */
        private Long f16726f;

        /* renamed from: g */
        private String f16727g;

        public b() {
        }

        private b(d dVar) {
            this.f16721a = dVar.d();
            this.f16722b = dVar.g();
            this.f16723c = dVar.b();
            this.f16724d = dVar.f();
            this.f16725e = Long.valueOf(dVar.c());
            this.f16726f = Long.valueOf(dVar.h());
            this.f16727g = dVar.e();
        }

        /* synthetic */ b(d dVar, C0277a c0277a) {
            this(dVar);
        }

        @Override // he.d.a
        public d a() {
            String str = "";
            if (this.f16722b == null) {
                str = " registrationStatus";
            }
            if (this.f16725e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f16726f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f16721a, this.f16722b, this.f16723c, this.f16724d, this.f16725e.longValue(), this.f16726f.longValue(), this.f16727g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // he.d.a
        public d.a b(String str) {
            this.f16723c = str;
            return this;
        }

        @Override // he.d.a
        public d.a c(long j10) {
            this.f16725e = Long.valueOf(j10);
            return this;
        }

        @Override // he.d.a
        public d.a d(String str) {
            this.f16721a = str;
            return this;
        }

        @Override // he.d.a
        public d.a e(String str) {
            this.f16727g = str;
            return this;
        }

        @Override // he.d.a
        public d.a f(String str) {
            this.f16724d = str;
            return this;
        }

        @Override // he.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f16722b = aVar;
            return this;
        }

        @Override // he.d.a
        public d.a h(long j10) {
            this.f16726f = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f16714b = str;
        this.f16715c = aVar;
        this.f16716d = str2;
        this.f16717e = str3;
        this.f16718f = j10;
        this.f16719g = j11;
        this.f16720h = str4;
    }

    /* synthetic */ a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4, C0277a c0277a) {
        this(str, aVar, str2, str3, j10, j11, str4);
    }

    @Override // he.d
    public String b() {
        return this.f16716d;
    }

    @Override // he.d
    public long c() {
        return this.f16718f;
    }

    @Override // he.d
    public String d() {
        return this.f16714b;
    }

    @Override // he.d
    public String e() {
        return this.f16720h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f16714b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f16715c.equals(dVar.g()) && ((str = this.f16716d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f16717e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f16718f == dVar.c() && this.f16719g == dVar.h()) {
                String str4 = this.f16720h;
                String e10 = dVar.e();
                if (str4 == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (str4.equals(e10)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // he.d
    public String f() {
        return this.f16717e;
    }

    @Override // he.d
    public c.a g() {
        return this.f16715c;
    }

    @Override // he.d
    public long h() {
        return this.f16719g;
    }

    public int hashCode() {
        String str = this.f16714b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f16715c.hashCode()) * 1000003;
        String str2 = this.f16716d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f16717e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f16718f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f16719g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f16720h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // he.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f16714b + ", registrationStatus=" + this.f16715c + ", authToken=" + this.f16716d + ", refreshToken=" + this.f16717e + ", expiresInSecs=" + this.f16718f + ", tokenCreationEpochInSecs=" + this.f16719g + ", fisError=" + this.f16720h + "}";
    }
}
