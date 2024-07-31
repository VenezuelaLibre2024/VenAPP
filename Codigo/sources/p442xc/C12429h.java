package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.h */
/* loaded from: classes.dex */
final class C12429h extends AbstractC12426f0.e {

    /* renamed from: a */
    private final String f33525a;

    /* renamed from: b */
    private final String f33526b;

    /* renamed from: c */
    private final String f33527c;

    /* renamed from: d */
    private final long f33528d;

    /* renamed from: e */
    private final Long f33529e;

    /* renamed from: f */
    private final boolean f33530f;

    /* renamed from: g */
    private final AbstractC12426f0.e.a f33531g;

    /* renamed from: h */
    private final AbstractC12426f0.e.f f33532h;

    /* renamed from: i */
    private final AbstractC12426f0.e.AbstractC13288e f33533i;

    /* renamed from: j */
    private final AbstractC12426f0.e.c f33534j;

    /* renamed from: k */
    private final List<AbstractC12426f0.e.d> f33535k;

    /* renamed from: l */
    private final int f33536l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.h$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.b {

        /* renamed from: a */
        private String f33537a;

        /* renamed from: b */
        private String f33538b;

        /* renamed from: c */
        private String f33539c;

        /* renamed from: d */
        private Long f33540d;

        /* renamed from: e */
        private Long f33541e;

        /* renamed from: f */
        private Boolean f33542f;

        /* renamed from: g */
        private AbstractC12426f0.e.a f33543g;

        /* renamed from: h */
        private AbstractC12426f0.e.f f33544h;

        /* renamed from: i */
        private AbstractC12426f0.e.AbstractC13288e f33545i;

        /* renamed from: j */
        private AbstractC12426f0.e.c f33546j;

        /* renamed from: k */
        private List<AbstractC12426f0.e.d> f33547k;

        /* renamed from: l */
        private Integer f33548l;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC12426f0.e eVar) {
            this.f33537a = eVar.mo40206g();
            this.f33538b = eVar.mo40208i();
            this.f33539c = eVar.mo40202c();
            this.f33540d = Long.valueOf(eVar.mo40211l());
            this.f33541e = eVar.mo40204e();
            this.f33542f = Boolean.valueOf(eVar.mo40213n());
            this.f33543g = eVar.mo40201b();
            this.f33544h = eVar.mo40212m();
            this.f33545i = eVar.mo40210k();
            this.f33546j = eVar.mo40203d();
            this.f33547k = eVar.mo40205f();
            this.f33548l = Integer.valueOf(eVar.mo40207h());
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: a */
        public AbstractC12426f0.e mo40234a() {
            String str = "";
            if (this.f33537a == null) {
                str = " generator";
            }
            if (this.f33538b == null) {
                str = str + " identifier";
            }
            if (this.f33540d == null) {
                str = str + " startedAt";
            }
            if (this.f33542f == null) {
                str = str + " crashed";
            }
            if (this.f33543g == null) {
                str = str + " app";
            }
            if (this.f33548l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C12429h(this.f33537a, this.f33538b, this.f33539c, this.f33540d.longValue(), this.f33541e, this.f33542f.booleanValue(), this.f33543g, this.f33544h, this.f33545i, this.f33546j, this.f33547k, this.f33548l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: b */
        public AbstractC12426f0.e.b mo40235b(AbstractC12426f0.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f33543g = aVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: c */
        public AbstractC12426f0.e.b mo40236c(String str) {
            this.f33539c = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: d */
        public AbstractC12426f0.e.b mo40237d(boolean z10) {
            this.f33542f = Boolean.valueOf(z10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: e */
        public AbstractC12426f0.e.b mo40238e(AbstractC12426f0.e.c cVar) {
            this.f33546j = cVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: f */
        public AbstractC12426f0.e.b mo40239f(Long l10) {
            this.f33541e = l10;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: g */
        public AbstractC12426f0.e.b mo40240g(List<AbstractC12426f0.e.d> list) {
            this.f33547k = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: h */
        public AbstractC12426f0.e.b mo40241h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f33537a = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: i */
        public AbstractC12426f0.e.b mo40242i(int i10) {
            this.f33548l = Integer.valueOf(i10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: j */
        public AbstractC12426f0.e.b mo40243j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f33538b = str;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: l */
        public AbstractC12426f0.e.b mo40245l(AbstractC12426f0.e.AbstractC13288e abstractC13288e) {
            this.f33545i = abstractC13288e;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: m */
        public AbstractC12426f0.e.b mo40246m(long j10) {
            this.f33540d = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.b
        /* renamed from: n */
        public AbstractC12426f0.e.b mo40247n(AbstractC12426f0.e.f fVar) {
            this.f33544h = fVar;
            return this;
        }
    }

    private C12429h(String str, String str2, String str3, long j10, Long l10, boolean z10, AbstractC12426f0.e.a aVar, AbstractC12426f0.e.f fVar, AbstractC12426f0.e.AbstractC13288e abstractC13288e, AbstractC12426f0.e.c cVar, List<AbstractC12426f0.e.d> list, int i10) {
        this.f33525a = str;
        this.f33526b = str2;
        this.f33527c = str3;
        this.f33528d = j10;
        this.f33529e = l10;
        this.f33530f = z10;
        this.f33531g = aVar;
        this.f33532h = fVar;
        this.f33533i = abstractC13288e;
        this.f33534j = cVar;
        this.f33535k = list;
        this.f33536l = i10;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: b */
    public AbstractC12426f0.e.a mo40201b() {
        return this.f33531g;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: c */
    public String mo40202c() {
        return this.f33527c;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: d */
    public AbstractC12426f0.e.c mo40203d() {
        return this.f33534j;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: e */
    public Long mo40204e() {
        return this.f33529e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        AbstractC12426f0.e.f fVar;
        AbstractC12426f0.e.AbstractC13288e abstractC13288e;
        AbstractC12426f0.e.c cVar;
        List<AbstractC12426f0.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e)) {
            return false;
        }
        AbstractC12426f0.e eVar = (AbstractC12426f0.e) obj;
        return this.f33525a.equals(eVar.mo40206g()) && this.f33526b.equals(eVar.mo40208i()) && ((str = this.f33527c) != null ? str.equals(eVar.mo40202c()) : eVar.mo40202c() == null) && this.f33528d == eVar.mo40211l() && ((l10 = this.f33529e) != null ? l10.equals(eVar.mo40204e()) : eVar.mo40204e() == null) && this.f33530f == eVar.mo40213n() && this.f33531g.equals(eVar.mo40201b()) && ((fVar = this.f33532h) != null ? fVar.equals(eVar.mo40212m()) : eVar.mo40212m() == null) && ((abstractC13288e = this.f33533i) != null ? abstractC13288e.equals(eVar.mo40210k()) : eVar.mo40210k() == null) && ((cVar = this.f33534j) != null ? cVar.equals(eVar.mo40203d()) : eVar.mo40203d() == null) && ((list = this.f33535k) != null ? list.equals(eVar.mo40205f()) : eVar.mo40205f() == null) && this.f33536l == eVar.mo40207h();
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: f */
    public List<AbstractC12426f0.e.d> mo40205f() {
        return this.f33535k;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: g */
    public String mo40206g() {
        return this.f33525a;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: h */
    public int mo40207h() {
        return this.f33536l;
    }

    public int hashCode() {
        int hashCode = (((this.f33525a.hashCode() ^ 1000003) * 1000003) ^ this.f33526b.hashCode()) * 1000003;
        String str = this.f33527c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f33528d;
        int i10 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f33529e;
        int hashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f33530f ? 1231 : 1237)) * 1000003) ^ this.f33531g.hashCode()) * 1000003;
        AbstractC12426f0.e.f fVar = this.f33532h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC12426f0.e.AbstractC13288e abstractC13288e = this.f33533i;
        int hashCode5 = (hashCode4 ^ (abstractC13288e == null ? 0 : abstractC13288e.hashCode())) * 1000003;
        AbstractC12426f0.e.c cVar = this.f33534j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC12426f0.e.d> list = this.f33535k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f33536l;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: i */
    public String mo40208i() {
        return this.f33526b;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: k */
    public AbstractC12426f0.e.AbstractC13288e mo40210k() {
        return this.f33533i;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: l */
    public long mo40211l() {
        return this.f33528d;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: m */
    public AbstractC12426f0.e.f mo40212m() {
        return this.f33532h;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: n */
    public boolean mo40213n() {
        return this.f33530f;
    }

    @Override // p442xc.AbstractC12426f0.e
    /* renamed from: o */
    public AbstractC12426f0.e.b mo40214o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f33525a + ", identifier=" + this.f33526b + ", appQualitySessionId=" + this.f33527c + ", startedAt=" + this.f33528d + ", endedAt=" + this.f33529e + ", crashed=" + this.f33530f + ", app=" + this.f33531g + ", user=" + this.f33532h + ", os=" + this.f33533i + ", device=" + this.f33534j + ", events=" + this.f33535k + ", generatorType=" + this.f33536l + "}";
    }
}
