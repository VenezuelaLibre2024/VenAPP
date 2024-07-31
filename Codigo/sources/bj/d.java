package bj;

import eb.i;
import eb.o;
import vi.g1;
import vi.p;
import vi.p0;

/* loaded from: classes3.dex */
public final class d extends bj.a {

    /* renamed from: l, reason: collision with root package name */
    static final p0.i f6621l = new c();

    /* renamed from: c, reason: collision with root package name */
    private final p0 f6622c;

    /* renamed from: d, reason: collision with root package name */
    private final p0.d f6623d;

    /* renamed from: e, reason: collision with root package name */
    private p0.c f6624e;

    /* renamed from: f, reason: collision with root package name */
    private p0 f6625f;

    /* renamed from: g, reason: collision with root package name */
    private p0.c f6626g;

    /* renamed from: h, reason: collision with root package name */
    private p0 f6627h;

    /* renamed from: i, reason: collision with root package name */
    private p f6628i;

    /* renamed from: j, reason: collision with root package name */
    private p0.i f6629j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6630k;

    /* loaded from: classes3.dex */
    class a extends p0 {

        /* renamed from: bj.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0108a extends p0.i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ g1 f6632a;

            C0108a(g1 g1Var) {
                this.f6632a = g1Var;
            }

            @Override // vi.p0.i
            public p0.e a(p0.f fVar) {
                return p0.e.f(this.f6632a);
            }

            public String toString() {
                return i.b(C0108a.class).d("error", this.f6632a).toString();
            }
        }

        a() {
        }

        @Override // vi.p0
        public void c(g1 g1Var) {
            d.this.f6623d.f(p.TRANSIENT_FAILURE, new C0108a(g1Var));
        }

        @Override // vi.p0
        public void d(p0.g gVar) {
            throw new IllegalStateException("GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses");
        }

        @Override // vi.p0
        public void e() {
        }
    }

    /* loaded from: classes3.dex */
    class b extends bj.b {

        /* renamed from: a, reason: collision with root package name */
        p0 f6634a;

        b() {
        }

        @Override // vi.p0.d
        public void f(p pVar, p0.i iVar) {
            if (this.f6634a == d.this.f6627h) {
                o.v(d.this.f6630k, "there's pending lb while current lb has been out of READY");
                d.this.f6628i = pVar;
                d.this.f6629j = iVar;
                if (pVar != p.READY) {
                    return;
                }
            } else {
                if (this.f6634a != d.this.f6625f) {
                    return;
                }
                d.this.f6630k = pVar == p.READY;
                if (d.this.f6630k || d.this.f6627h == d.this.f6622c) {
                    d.this.f6623d.f(pVar, iVar);
                    return;
                }
            }
            d.this.p();
        }

        @Override // bj.b
        protected p0.d g() {
            return d.this.f6623d;
        }
    }

    /* loaded from: classes3.dex */
    class c extends p0.i {
        c() {
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            return p0.e.g();
        }

        public String toString() {
            return "BUFFER_PICKER";
        }
    }

    public d(p0.d dVar) {
        a aVar = new a();
        this.f6622c = aVar;
        this.f6625f = aVar;
        this.f6627h = aVar;
        this.f6623d = (p0.d) o.p(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        this.f6623d.f(this.f6628i, this.f6629j);
        this.f6625f.e();
        this.f6625f = this.f6627h;
        this.f6624e = this.f6626g;
        this.f6627h = this.f6622c;
        this.f6626g = null;
    }

    @Override // vi.p0
    public void e() {
        this.f6627h.e();
        this.f6625f.e();
    }

    @Override // bj.a
    protected p0 f() {
        p0 p0Var = this.f6627h;
        return p0Var == this.f6622c ? this.f6625f : p0Var;
    }

    public void q(p0.c cVar) {
        o.p(cVar, "newBalancerFactory");
        if (cVar.equals(this.f6626g)) {
            return;
        }
        this.f6627h.e();
        this.f6627h = this.f6622c;
        this.f6626g = null;
        this.f6628i = p.CONNECTING;
        this.f6629j = f6621l;
        if (cVar.equals(this.f6624e)) {
            return;
        }
        b bVar = new b();
        p0 a10 = cVar.a(bVar);
        bVar.f6634a = a10;
        this.f6627h = a10;
        this.f6626g = cVar;
        if (this.f6630k) {
            return;
        }
        p();
    }
}
