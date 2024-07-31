package xc;

import java.util.List;
import xc.f0;

/* loaded from: classes.dex */
final class h extends f0.e {

    /* renamed from: a, reason: collision with root package name */
    private final String f31005a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31006b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31007c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31008d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f31009e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31010f;

    /* renamed from: g, reason: collision with root package name */
    private final f0.e.a f31011g;

    /* renamed from: h, reason: collision with root package name */
    private final f0.e.f f31012h;

    /* renamed from: i, reason: collision with root package name */
    private final f0.e.AbstractC0520e f31013i;

    /* renamed from: j, reason: collision with root package name */
    private final f0.e.c f31014j;

    /* renamed from: k, reason: collision with root package name */
    private final List<f0.e.d> f31015k;

    /* renamed from: l, reason: collision with root package name */
    private final int f31016l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.b {

        /* renamed from: a, reason: collision with root package name */
        private String f31017a;

        /* renamed from: b, reason: collision with root package name */
        private String f31018b;

        /* renamed from: c, reason: collision with root package name */
        private String f31019c;

        /* renamed from: d, reason: collision with root package name */
        private Long f31020d;

        /* renamed from: e, reason: collision with root package name */
        private Long f31021e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f31022f;

        /* renamed from: g, reason: collision with root package name */
        private f0.e.a f31023g;

        /* renamed from: h, reason: collision with root package name */
        private f0.e.f f31024h;

        /* renamed from: i, reason: collision with root package name */
        private f0.e.AbstractC0520e f31025i;

        /* renamed from: j, reason: collision with root package name */
        private f0.e.c f31026j;

        /* renamed from: k, reason: collision with root package name */
        private List<f0.e.d> f31027k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f31028l;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(f0.e eVar) {
            this.f31017a = eVar.g();
            this.f31018b = eVar.i();
            this.f31019c = eVar.c();
            this.f31020d = Long.valueOf(eVar.l());
            this.f31021e = eVar.e();
            this.f31022f = Boolean.valueOf(eVar.n());
            this.f31023g = eVar.b();
            this.f31024h = eVar.m();
            this.f31025i = eVar.k();
            this.f31026j = eVar.d();
            this.f31027k = eVar.f();
            this.f31028l = Integer.valueOf(eVar.h());
        }

        @Override // xc.f0.e.b
        public f0.e a() {
            String str = "";
            if (this.f31017a == null) {
                str = " generator";
            }
            if (this.f31018b == null) {
                str = str + " identifier";
            }
            if (this.f31020d == null) {
                str = str + " startedAt";
            }
            if (this.f31022f == null) {
                str = str + " crashed";
            }
            if (this.f31023g == null) {
                str = str + " app";
            }
            if (this.f31028l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new h(this.f31017a, this.f31018b, this.f31019c, this.f31020d.longValue(), this.f31021e, this.f31022f.booleanValue(), this.f31023g, this.f31024h, this.f31025i, this.f31026j, this.f31027k, this.f31028l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.b
        public f0.e.b b(f0.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f31023g = aVar;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b c(String str) {
            this.f31019c = str;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b d(boolean z10) {
            this.f31022f = Boolean.valueOf(z10);
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b e(f0.e.c cVar) {
            this.f31026j = cVar;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b f(Long l10) {
            this.f31021e = l10;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b g(List<f0.e.d> list) {
            this.f31027k = list;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f31017a = str;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b i(int i10) {
            this.f31028l = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f31018b = str;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b l(f0.e.AbstractC0520e abstractC0520e) {
            this.f31025i = abstractC0520e;
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b m(long j10) {
            this.f31020d = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.b
        public f0.e.b n(f0.e.f fVar) {
            this.f31024h = fVar;
            return this;
        }
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z10, f0.e.a aVar, f0.e.f fVar, f0.e.AbstractC0520e abstractC0520e, f0.e.c cVar, List<f0.e.d> list, int i10) {
        this.f31005a = str;
        this.f31006b = str2;
        this.f31007c = str3;
        this.f31008d = j10;
        this.f31009e = l10;
        this.f31010f = z10;
        this.f31011g = aVar;
        this.f31012h = fVar;
        this.f31013i = abstractC0520e;
        this.f31014j = cVar;
        this.f31015k = list;
        this.f31016l = i10;
    }

    @Override // xc.f0.e
    public f0.e.a b() {
        return this.f31011g;
    }

    @Override // xc.f0.e
    public String c() {
        return this.f31007c;
    }

    @Override // xc.f0.e
    public f0.e.c d() {
        return this.f31014j;
    }

    @Override // xc.f0.e
    public Long e() {
        return this.f31009e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        f0.e.f fVar;
        f0.e.AbstractC0520e abstractC0520e;
        f0.e.c cVar;
        List<f0.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e)) {
            return false;
        }
        f0.e eVar = (f0.e) obj;
        return this.f31005a.equals(eVar.g()) && this.f31006b.equals(eVar.i()) && ((str = this.f31007c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f31008d == eVar.l() && ((l10 = this.f31009e) != null ? l10.equals(eVar.e()) : eVar.e() == null) && this.f31010f == eVar.n() && this.f31011g.equals(eVar.b()) && ((fVar = this.f31012h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0520e = this.f31013i) != null ? abstractC0520e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f31014j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f31015k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f31016l == eVar.h();
    }

    @Override // xc.f0.e
    public List<f0.e.d> f() {
        return this.f31015k;
    }

    @Override // xc.f0.e
    public String g() {
        return this.f31005a;
    }

    @Override // xc.f0.e
    public int h() {
        return this.f31016l;
    }

    public int hashCode() {
        int hashCode = (((this.f31005a.hashCode() ^ 1000003) * 1000003) ^ this.f31006b.hashCode()) * 1000003;
        String str = this.f31007c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f31008d;
        int i10 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f31009e;
        int hashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f31010f ? 1231 : 1237)) * 1000003) ^ this.f31011g.hashCode()) * 1000003;
        f0.e.f fVar = this.f31012h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        f0.e.AbstractC0520e abstractC0520e = this.f31013i;
        int hashCode5 = (hashCode4 ^ (abstractC0520e == null ? 0 : abstractC0520e.hashCode())) * 1000003;
        f0.e.c cVar = this.f31014j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d> list = this.f31015k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f31016l;
    }

    @Override // xc.f0.e
    public String i() {
        return this.f31006b;
    }

    @Override // xc.f0.e
    public f0.e.AbstractC0520e k() {
        return this.f31013i;
    }

    @Override // xc.f0.e
    public long l() {
        return this.f31008d;
    }

    @Override // xc.f0.e
    public f0.e.f m() {
        return this.f31012h;
    }

    @Override // xc.f0.e
    public boolean n() {
        return this.f31010f;
    }

    @Override // xc.f0.e
    public f0.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f31005a + ", identifier=" + this.f31006b + ", appQualitySessionId=" + this.f31007c + ", startedAt=" + this.f31008d + ", endedAt=" + this.f31009e + ", crashed=" + this.f31010f + ", app=" + this.f31011g + ", user=" + this.f31012h + ", os=" + this.f31013i + ", device=" + this.f31014j + ", events=" + this.f31015k + ", generatorType=" + this.f31016l + "}";
    }
}
