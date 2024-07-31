package p140he;

import p140he.AbstractC7717d;
import p140he.C7716c;

/* renamed from: he.a */
/* loaded from: classes.dex */
final class C7714a extends AbstractC7717d {

    /* renamed from: b */
    private final String f18364b;

    /* renamed from: c */
    private final C7716c.a f18365c;

    /* renamed from: d */
    private final String f18366d;

    /* renamed from: e */
    private final String f18367e;

    /* renamed from: f */
    private final long f18368f;

    /* renamed from: g */
    private final long f18369g;

    /* renamed from: h */
    private final String f18370h;

    /* renamed from: he.a$b */
    /* loaded from: classes.dex */
    static final class b extends AbstractC7717d.a {

        /* renamed from: a */
        private String f18371a;

        /* renamed from: b */
        private C7716c.a f18372b;

        /* renamed from: c */
        private String f18373c;

        /* renamed from: d */
        private String f18374d;

        /* renamed from: e */
        private Long f18375e;

        /* renamed from: f */
        private Long f18376f;

        /* renamed from: g */
        private String f18377g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC7717d abstractC7717d) {
            this.f18371a = abstractC7717d.mo23499d();
            this.f18372b = abstractC7717d.mo23502g();
            this.f18373c = abstractC7717d.mo23497b();
            this.f18374d = abstractC7717d.mo23501f();
            this.f18375e = Long.valueOf(abstractC7717d.mo23498c());
            this.f18376f = Long.valueOf(abstractC7717d.mo23503h());
            this.f18377g = abstractC7717d.mo23500e();
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: a */
        public AbstractC7717d mo23505a() {
            String str = "";
            if (this.f18372b == null) {
                str = " registrationStatus";
            }
            if (this.f18375e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f18376f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C7714a(this.f18371a, this.f18372b, this.f18373c, this.f18374d, this.f18375e.longValue(), this.f18376f.longValue(), this.f18377g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: b */
        public AbstractC7717d.a mo23506b(String str) {
            this.f18373c = str;
            return this;
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: c */
        public AbstractC7717d.a mo23507c(long j10) {
            this.f18375e = Long.valueOf(j10);
            return this;
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: d */
        public AbstractC7717d.a mo23508d(String str) {
            this.f18371a = str;
            return this;
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: e */
        public AbstractC7717d.a mo23509e(String str) {
            this.f18377g = str;
            return this;
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: f */
        public AbstractC7717d.a mo23510f(String str) {
            this.f18374d = str;
            return this;
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: g */
        public AbstractC7717d.a mo23511g(C7716c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f18372b = aVar;
            return this;
        }

        @Override // p140he.AbstractC7717d.a
        /* renamed from: h */
        public AbstractC7717d.a mo23512h(long j10) {
            this.f18376f = Long.valueOf(j10);
            return this;
        }
    }

    private C7714a(String str, C7716c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f18364b = str;
        this.f18365c = aVar;
        this.f18366d = str2;
        this.f18367e = str3;
        this.f18368f = j10;
        this.f18369g = j11;
        this.f18370h = str4;
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: b */
    public String mo23497b() {
        return this.f18366d;
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: c */
    public long mo23498c() {
        return this.f18368f;
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: d */
    public String mo23499d() {
        return this.f18364b;
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: e */
    public String mo23500e() {
        return this.f18370h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7717d)) {
            return false;
        }
        AbstractC7717d abstractC7717d = (AbstractC7717d) obj;
        String str3 = this.f18364b;
        if (str3 != null ? str3.equals(abstractC7717d.mo23499d()) : abstractC7717d.mo23499d() == null) {
            if (this.f18365c.equals(abstractC7717d.mo23502g()) && ((str = this.f18366d) != null ? str.equals(abstractC7717d.mo23497b()) : abstractC7717d.mo23497b() == null) && ((str2 = this.f18367e) != null ? str2.equals(abstractC7717d.mo23501f()) : abstractC7717d.mo23501f() == null) && this.f18368f == abstractC7717d.mo23498c() && this.f18369g == abstractC7717d.mo23503h()) {
                String str4 = this.f18370h;
                String mo23500e = abstractC7717d.mo23500e();
                if (str4 == null) {
                    if (mo23500e == null) {
                        return true;
                    }
                } else if (str4.equals(mo23500e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: f */
    public String mo23501f() {
        return this.f18367e;
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: g */
    public C7716c.a mo23502g() {
        return this.f18365c;
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: h */
    public long mo23503h() {
        return this.f18369g;
    }

    public int hashCode() {
        String str = this.f18364b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f18365c.hashCode()) * 1000003;
        String str2 = this.f18366d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f18367e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f18368f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f18369g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f18370h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p140he.AbstractC7717d
    /* renamed from: n */
    public AbstractC7717d.a mo23504n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f18364b + ", registrationStatus=" + this.f18365c + ", authToken=" + this.f18366d + ", refreshToken=" + this.f18367e + ", expiresInSecs=" + this.f18368f + ", tokenCreationEpochInSecs=" + this.f18369g + ", fisError=" + this.f18370h + "}";
    }
}
