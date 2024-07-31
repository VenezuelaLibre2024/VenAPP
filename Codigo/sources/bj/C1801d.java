package bj;

import p082eb.C7153i;
import p082eb.C7159o;
import vi.AbstractC11939p0;
import vi.C11915g1;
import vi.EnumC11938p;

/* renamed from: bj.d */
/* loaded from: classes3.dex */
public final class C1801d extends AbstractC1798a {

    /* renamed from: l */
    static final AbstractC11939p0.i f7570l = new c();

    /* renamed from: c */
    private final AbstractC11939p0 f7571c;

    /* renamed from: d */
    private final AbstractC11939p0.d f7572d;

    /* renamed from: e */
    private AbstractC11939p0.c f7573e;

    /* renamed from: f */
    private AbstractC11939p0 f7574f;

    /* renamed from: g */
    private AbstractC11939p0.c f7575g;

    /* renamed from: h */
    private AbstractC11939p0 f7576h;

    /* renamed from: i */
    private EnumC11938p f7577i;

    /* renamed from: j */
    private AbstractC11939p0.i f7578j;

    /* renamed from: k */
    private boolean f7579k;

    /* renamed from: bj.d$a */
    /* loaded from: classes3.dex */
    class a extends AbstractC11939p0 {

        /* renamed from: bj.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C13175a extends AbstractC11939p0.i {

            /* renamed from: a */
            final /* synthetic */ C11915g1 f7581a;

            C13175a(C11915g1 c11915g1) {
                this.f7581a = c11915g1;
            }

            @Override // vi.AbstractC11939p0.i
            /* renamed from: a */
            public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
                return AbstractC11939p0.e.m38219f(this.f7581a);
            }

            public String toString() {
                return C7153i.m21273b(C13175a.class).m21284d("error", this.f7581a).toString();
            }
        }

        a() {
        }

        @Override // vi.AbstractC11939p0
        /* renamed from: c */
        public void mo9549c(C11915g1 c11915g1) {
            C1801d.this.f7572d.mo9577f(EnumC11938p.TRANSIENT_FAILURE, new C13175a(c11915g1));
        }

        @Override // vi.AbstractC11939p0
        /* renamed from: d */
        public void mo9550d(AbstractC11939p0.g gVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // vi.AbstractC11939p0
        /* renamed from: e */
        public void mo9574e() {
        }
    }

    /* renamed from: bj.d$b */
    /* loaded from: classes3.dex */
    class b extends AbstractC1799b {

        /* renamed from: a */
        AbstractC11939p0 f7583a;

        b() {
        }

        @Override // vi.AbstractC11939p0.d
        /* renamed from: f */
        public void mo9577f(EnumC11938p enumC11938p, AbstractC11939p0.i iVar) {
            if (this.f7583a == C1801d.this.f7576h) {
                C7159o.m21319v(C1801d.this.f7579k, "there's pending lb while current lb has been out of READY");
                C1801d.this.f7577i = enumC11938p;
                C1801d.this.f7578j = iVar;
                if (enumC11938p != EnumC11938p.READY) {
                    return;
                }
            } else {
                if (this.f7583a != C1801d.this.f7574f) {
                    return;
                }
                C1801d.this.f7579k = enumC11938p == EnumC11938p.READY;
                if (C1801d.this.f7579k || C1801d.this.f7576h == C1801d.this.f7571c) {
                    C1801d.this.f7572d.mo9577f(enumC11938p, iVar);
                    return;
                }
            }
            C1801d.this.m9573p();
        }

        @Override // bj.AbstractC1799b
        /* renamed from: g */
        protected AbstractC11939p0.d mo9557g() {
            return C1801d.this.f7572d;
        }
    }

    /* renamed from: bj.d$c */
    /* loaded from: classes3.dex */
    class c extends AbstractC11939p0.i {
        c() {
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            return AbstractC11939p0.e.m38220g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public C1801d(AbstractC11939p0.d dVar) {
        a aVar = new a();
        this.f7571c = aVar;
        this.f7574f = aVar;
        this.f7576h = aVar;
        this.f7572d = (AbstractC11939p0.d) C7159o.m21313p(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m9573p() {
        this.f7572d.mo9577f(this.f7577i, this.f7578j);
        this.f7574f.mo9574e();
        this.f7574f = this.f7576h;
        this.f7573e = this.f7575g;
        this.f7576h = this.f7571c;
        this.f7575g = null;
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: e */
    public void mo9574e() {
        this.f7576h.mo9574e();
        this.f7574f.mo9574e();
    }

    @Override // bj.AbstractC1798a
    /* renamed from: f */
    protected AbstractC11939p0 mo9551f() {
        AbstractC11939p0 abstractC11939p0 = this.f7576h;
        return abstractC11939p0 == this.f7571c ? this.f7574f : abstractC11939p0;
    }

    /* renamed from: q */
    public void m9575q(AbstractC11939p0.c cVar) {
        C7159o.m21313p(cVar, "newBalancerFactory");
        if (cVar.equals(this.f7575g)) {
            return;
        }
        this.f7576h.mo9574e();
        this.f7576h = this.f7571c;
        this.f7575g = null;
        this.f7577i = EnumC11938p.CONNECTING;
        this.f7578j = f7570l;
        if (cVar.equals(this.f7573e)) {
            return;
        }
        b bVar = new b();
        AbstractC11939p0 mo9648a = cVar.mo9648a(bVar);
        bVar.f7583a = mo9648a;
        this.f7576h = mo9648a;
        this.f7575g = cVar;
        if (this.f7579k) {
            return;
        }
        m9573p();
    }
}
