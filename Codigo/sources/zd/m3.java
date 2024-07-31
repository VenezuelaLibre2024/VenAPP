package zd;

/* loaded from: classes.dex */
public class m3 {

    /* renamed from: d, reason: collision with root package name */
    private static final c3 f32674d = c3.d0();

    /* renamed from: a, reason: collision with root package name */
    private final u2 f32675a;

    /* renamed from: b, reason: collision with root package name */
    private final ce.a f32676b;

    /* renamed from: c, reason: collision with root package name */
    private dj.j<c3> f32677c = dj.j.g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m3(u2 u2Var, ce.a aVar) {
        this.f32675a = u2Var;
        this.f32676b = aVar;
    }

    private void j() {
        this.f32677c = dj.j.g();
    }

    private dj.j<c3> k() {
        return this.f32677c.x(this.f32675a.e(c3.j0()).f(new jj.d() { // from class: zd.e3
            @Override // jj.d
            public final void accept(Object obj) {
                m3.this.t((c3) obj);
            }
        })).e(new jj.d() { // from class: zd.f3
            @Override // jj.d
            public final void accept(Object obj) {
                m3.this.q((Throwable) obj);
            }
        });
    }

    private static b3 m(b3 b3Var) {
        return b3.k0(b3Var).I().K(b3Var.i0() + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void t(c3 c3Var) {
        this.f32677c = dj.j.n(c3Var);
    }

    private boolean o(b3 b3Var, de.m mVar) {
        return this.f32676b.a() - b3Var.h0() > mVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(Throwable th2) {
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean r(de.m mVar, b3 b3Var) {
        return !o(b3Var, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c3 s(c3 c3Var, de.m mVar, b3 b3Var) {
        return c3.i0(c3Var).I(mVar.c(), m(b3Var)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dj.d u(final c3 c3Var) {
        return this.f32675a.f(c3Var).g(new jj.a() { // from class: zd.l3
            @Override // jj.a
            public final void run() {
                m3.this.t(c3Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dj.d v(final de.m mVar, final c3 c3Var) {
        return dj.o.q(c3Var.e0(mVar.c(), y())).i(new jj.g() { // from class: zd.i3
            @Override // jj.g
            public final boolean test(Object obj) {
                boolean r10;
                r10 = m3.this.r(mVar, (b3) obj);
                return r10;
            }
        }).t(dj.o.q(y())).r(new jj.e() { // from class: zd.j3
            @Override // jj.e
            public final Object apply(Object obj) {
                c3 s10;
                s10 = m3.s(c3.this, mVar, (b3) obj);
                return s10;
            }
        }).n(new jj.e() { // from class: zd.k3
            @Override // jj.e
            public final Object apply(Object obj) {
                dj.d u10;
                u10 = m3.this.u((c3) obj);
                return u10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ b3 w(de.m mVar, c3 c3Var) {
        return c3Var.e0(mVar.c(), y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean x(de.m mVar, b3 b3Var) {
        return o(b3Var, mVar) || b3Var.i0() < mVar.b();
    }

    private b3 y() {
        return b3.j0().K(0L).J(this.f32676b.a()).build();
    }

    public dj.b l(final de.m mVar) {
        return k().c(f32674d).j(new jj.e() { // from class: zd.d3
            @Override // jj.e
            public final Object apply(Object obj) {
                dj.d v10;
                v10 = m3.this.v(mVar, (c3) obj);
                return v10;
            }
        });
    }

    public dj.s<Boolean> p(final de.m mVar) {
        return k().x(dj.j.n(c3.d0())).o(new jj.e() { // from class: zd.g3
            @Override // jj.e
            public final Object apply(Object obj) {
                b3 w10;
                w10 = m3.this.w(mVar, (c3) obj);
                return w10;
            }
        }).h(new jj.g() { // from class: zd.h3
            @Override // jj.g
            public final boolean test(Object obj) {
                boolean x10;
                x10 = m3.this.x(mVar, (b3) obj);
                return x10;
            }
        }).m();
    }
}
