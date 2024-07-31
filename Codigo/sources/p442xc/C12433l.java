package p442xc;

import p442xc.AbstractC12426f0;

/* renamed from: xc.l */
/* loaded from: classes.dex */
final class C12433l extends AbstractC12426f0.e.d {

    /* renamed from: a */
    private final long f33582a;

    /* renamed from: b */
    private final String f33583b;

    /* renamed from: c */
    private final AbstractC12426f0.e.d.a f33584c;

    /* renamed from: d */
    private final AbstractC12426f0.e.d.c f33585d;

    /* renamed from: e */
    private final AbstractC12426f0.e.d.AbstractC13286d f33586e;

    /* renamed from: f */
    private final AbstractC12426f0.e.d.f f33587f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.l$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.b {

        /* renamed from: a */
        private Long f33588a;

        /* renamed from: b */
        private String f33589b;

        /* renamed from: c */
        private AbstractC12426f0.e.d.a f33590c;

        /* renamed from: d */
        private AbstractC12426f0.e.d.c f33591d;

        /* renamed from: e */
        private AbstractC12426f0.e.d.AbstractC13286d f33592e;

        /* renamed from: f */
        private AbstractC12426f0.e.d.f f33593f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC12426f0.e.d dVar) {
            this.f33588a = Long.valueOf(dVar.mo40273f());
            this.f33589b = dVar.mo40274g();
            this.f33590c = dVar.mo40269b();
            this.f33591d = dVar.mo40270c();
            this.f33592e = dVar.mo40271d();
            this.f33593f = dVar.mo40272e();
        }

        @Override // p442xc.AbstractC12426f0.e.d.b
        /* renamed from: a */
        public AbstractC12426f0.e.d mo40367a() {
            String str = "";
            if (this.f33588a == null) {
                str = " timestamp";
            }
            if (this.f33589b == null) {
                str = str + " type";
            }
            if (this.f33590c == null) {
                str = str + " app";
            }
            if (this.f33591d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C12433l(this.f33588a.longValue(), this.f33589b, this.f33590c, this.f33591d, this.f33592e, this.f33593f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.b
        /* renamed from: b */
        public AbstractC12426f0.e.d.b mo40368b(AbstractC12426f0.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f33590c = aVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.b
        /* renamed from: c */
        public AbstractC12426f0.e.d.b mo40369c(AbstractC12426f0.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f33591d = cVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.b
        /* renamed from: d */
        public AbstractC12426f0.e.d.b mo40370d(AbstractC12426f0.e.d.AbstractC13286d abstractC13286d) {
            this.f33592e = abstractC13286d;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.b
        /* renamed from: e */
        public AbstractC12426f0.e.d.b mo40371e(AbstractC12426f0.e.d.f fVar) {
            this.f33593f = fVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.b
        /* renamed from: f */
        public AbstractC12426f0.e.d.b mo40372f(long j10) {
            this.f33588a = Long.valueOf(j10);
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.b
        /* renamed from: g */
        public AbstractC12426f0.e.d.b mo40373g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f33589b = str;
            return this;
        }
    }

    private C12433l(long j10, String str, AbstractC12426f0.e.d.a aVar, AbstractC12426f0.e.d.c cVar, AbstractC12426f0.e.d.AbstractC13286d abstractC13286d, AbstractC12426f0.e.d.f fVar) {
        this.f33582a = j10;
        this.f33583b = str;
        this.f33584c = aVar;
        this.f33585d = cVar;
        this.f33586e = abstractC13286d;
        this.f33587f = fVar;
    }

    @Override // p442xc.AbstractC12426f0.e.d
    /* renamed from: b */
    public AbstractC12426f0.e.d.a mo40269b() {
        return this.f33584c;
    }

    @Override // p442xc.AbstractC12426f0.e.d
    /* renamed from: c */
    public AbstractC12426f0.e.d.c mo40270c() {
        return this.f33585d;
    }

    @Override // p442xc.AbstractC12426f0.e.d
    /* renamed from: d */
    public AbstractC12426f0.e.d.AbstractC13286d mo40271d() {
        return this.f33586e;
    }

    @Override // p442xc.AbstractC12426f0.e.d
    /* renamed from: e */
    public AbstractC12426f0.e.d.f mo40272e() {
        return this.f33587f;
    }

    public boolean equals(Object obj) {
        AbstractC12426f0.e.d.AbstractC13286d abstractC13286d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d)) {
            return false;
        }
        AbstractC12426f0.e.d dVar = (AbstractC12426f0.e.d) obj;
        if (this.f33582a == dVar.mo40273f() && this.f33583b.equals(dVar.mo40274g()) && this.f33584c.equals(dVar.mo40269b()) && this.f33585d.equals(dVar.mo40270c()) && ((abstractC13286d = this.f33586e) != null ? abstractC13286d.equals(dVar.mo40271d()) : dVar.mo40271d() == null)) {
            AbstractC12426f0.e.d.f fVar = this.f33587f;
            AbstractC12426f0.e.d.f mo40272e = dVar.mo40272e();
            if (fVar == null) {
                if (mo40272e == null) {
                    return true;
                }
            } else if (fVar.equals(mo40272e)) {
                return true;
            }
        }
        return false;
    }

    @Override // p442xc.AbstractC12426f0.e.d
    /* renamed from: f */
    public long mo40273f() {
        return this.f33582a;
    }

    @Override // p442xc.AbstractC12426f0.e.d
    /* renamed from: g */
    public String mo40274g() {
        return this.f33583b;
    }

    @Override // p442xc.AbstractC12426f0.e.d
    /* renamed from: h */
    public AbstractC12426f0.e.d.b mo40275h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f33582a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f33583b.hashCode()) * 1000003) ^ this.f33584c.hashCode()) * 1000003) ^ this.f33585d.hashCode()) * 1000003;
        AbstractC12426f0.e.d.AbstractC13286d abstractC13286d = this.f33586e;
        int hashCode2 = (hashCode ^ (abstractC13286d == null ? 0 : abstractC13286d.hashCode())) * 1000003;
        AbstractC12426f0.e.d.f fVar = this.f33587f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f33582a + ", type=" + this.f33583b + ", app=" + this.f33584c + ", device=" + this.f33585d + ", log=" + this.f33586e + ", rollouts=" + this.f33587f + "}";
    }
}
