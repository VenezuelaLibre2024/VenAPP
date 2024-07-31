package p442xc;

import java.util.List;
import p442xc.AbstractC12426f0;

/* renamed from: xc.m */
/* loaded from: classes.dex */
final class C12434m extends AbstractC12426f0.e.d.a {

    /* renamed from: a */
    private final AbstractC12426f0.e.d.a.b f33594a;

    /* renamed from: b */
    private final List<AbstractC12426f0.c> f33595b;

    /* renamed from: c */
    private final List<AbstractC12426f0.c> f33596c;

    /* renamed from: d */
    private final Boolean f33597d;

    /* renamed from: e */
    private final AbstractC12426f0.e.d.a.c f33598e;

    /* renamed from: f */
    private final List<AbstractC12426f0.e.d.a.c> f33599f;

    /* renamed from: g */
    private final int f33600g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: xc.m$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC12426f0.e.d.a.AbstractC13274a {

        /* renamed from: a */
        private AbstractC12426f0.e.d.a.b f33601a;

        /* renamed from: b */
        private List<AbstractC12426f0.c> f33602b;

        /* renamed from: c */
        private List<AbstractC12426f0.c> f33603c;

        /* renamed from: d */
        private Boolean f33604d;

        /* renamed from: e */
        private AbstractC12426f0.e.d.a.c f33605e;

        /* renamed from: f */
        private List<AbstractC12426f0.e.d.a.c> f33606f;

        /* renamed from: g */
        private Integer f33607g;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(AbstractC12426f0.e.d.a aVar) {
            this.f33601a = aVar.mo40281f();
            this.f33602b = aVar.mo40280e();
            this.f33603c = aVar.mo40282g();
            this.f33604d = aVar.mo40278c();
            this.f33605e = aVar.mo40279d();
            this.f33606f = aVar.mo40277b();
            this.f33607g = Integer.valueOf(aVar.mo40283h());
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: a */
        public AbstractC12426f0.e.d.a mo40285a() {
            String str = "";
            if (this.f33601a == null) {
                str = " execution";
            }
            if (this.f33607g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new C12434m(this.f33601a, this.f33602b, this.f33603c, this.f33604d, this.f33605e, this.f33606f, this.f33607g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: b */
        public AbstractC12426f0.e.d.a.AbstractC13274a mo40286b(List<AbstractC12426f0.e.d.a.c> list) {
            this.f33606f = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: c */
        public AbstractC12426f0.e.d.a.AbstractC13274a mo40287c(Boolean bool) {
            this.f33604d = bool;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: d */
        public AbstractC12426f0.e.d.a.AbstractC13274a mo40288d(AbstractC12426f0.e.d.a.c cVar) {
            this.f33605e = cVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: e */
        public AbstractC12426f0.e.d.a.AbstractC13274a mo40289e(List<AbstractC12426f0.c> list) {
            this.f33602b = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: f */
        public AbstractC12426f0.e.d.a.AbstractC13274a mo40290f(AbstractC12426f0.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f33601a = bVar;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: g */
        public AbstractC12426f0.e.d.a.AbstractC13274a mo40291g(List<AbstractC12426f0.c> list) {
            this.f33603c = list;
            return this;
        }

        @Override // p442xc.AbstractC12426f0.e.d.a.AbstractC13274a
        /* renamed from: h */
        public AbstractC12426f0.e.d.a.AbstractC13274a mo40292h(int i10) {
            this.f33607g = Integer.valueOf(i10);
            return this;
        }
    }

    private C12434m(AbstractC12426f0.e.d.a.b bVar, List<AbstractC12426f0.c> list, List<AbstractC12426f0.c> list2, Boolean bool, AbstractC12426f0.e.d.a.c cVar, List<AbstractC12426f0.e.d.a.c> list3, int i10) {
        this.f33594a = bVar;
        this.f33595b = list;
        this.f33596c = list2;
        this.f33597d = bool;
        this.f33598e = cVar;
        this.f33599f = list3;
        this.f33600g = i10;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: b */
    public List<AbstractC12426f0.e.d.a.c> mo40277b() {
        return this.f33599f;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: c */
    public Boolean mo40278c() {
        return this.f33597d;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: d */
    public AbstractC12426f0.e.d.a.c mo40279d() {
        return this.f33598e;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: e */
    public List<AbstractC12426f0.c> mo40280e() {
        return this.f33595b;
    }

    public boolean equals(Object obj) {
        List<AbstractC12426f0.c> list;
        List<AbstractC12426f0.c> list2;
        Boolean bool;
        AbstractC12426f0.e.d.a.c cVar;
        List<AbstractC12426f0.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12426f0.e.d.a)) {
            return false;
        }
        AbstractC12426f0.e.d.a aVar = (AbstractC12426f0.e.d.a) obj;
        return this.f33594a.equals(aVar.mo40281f()) && ((list = this.f33595b) != null ? list.equals(aVar.mo40280e()) : aVar.mo40280e() == null) && ((list2 = this.f33596c) != null ? list2.equals(aVar.mo40282g()) : aVar.mo40282g() == null) && ((bool = this.f33597d) != null ? bool.equals(aVar.mo40278c()) : aVar.mo40278c() == null) && ((cVar = this.f33598e) != null ? cVar.equals(aVar.mo40279d()) : aVar.mo40279d() == null) && ((list3 = this.f33599f) != null ? list3.equals(aVar.mo40277b()) : aVar.mo40277b() == null) && this.f33600g == aVar.mo40283h();
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: f */
    public AbstractC12426f0.e.d.a.b mo40281f() {
        return this.f33594a;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: g */
    public List<AbstractC12426f0.c> mo40282g() {
        return this.f33596c;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: h */
    public int mo40283h() {
        return this.f33600g;
    }

    public int hashCode() {
        int hashCode = (this.f33594a.hashCode() ^ 1000003) * 1000003;
        List<AbstractC12426f0.c> list = this.f33595b;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<AbstractC12426f0.c> list2 = this.f33596c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f33597d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC12426f0.e.d.a.c cVar = this.f33598e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC12426f0.e.d.a.c> list3 = this.f33599f;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f33600g;
    }

    @Override // p442xc.AbstractC12426f0.e.d.a
    /* renamed from: i */
    public AbstractC12426f0.e.d.a.AbstractC13274a mo40284i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f33594a + ", customAttributes=" + this.f33595b + ", internalKeys=" + this.f33596c + ", background=" + this.f33597d + ", currentProcessDetails=" + this.f33598e + ", appProcessDetails=" + this.f33599f + ", uiOrientation=" + this.f33600g + "}";
    }
}
