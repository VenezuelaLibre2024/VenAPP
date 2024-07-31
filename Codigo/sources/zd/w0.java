package zd;

import java.util.HashSet;
import java.util.List;
import of.c;
import pf.b;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: c, reason: collision with root package name */
    private static final pf.b f32768c = pf.b.g0();

    /* renamed from: a, reason: collision with root package name */
    private final u2 f32769a;

    /* renamed from: b, reason: collision with root package name */
    private dj.j<pf.b> f32770b = dj.j.g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(u2 u2Var) {
        this.f32769a = u2Var;
    }

    private static pf.b g(pf.b bVar, pf.a aVar) {
        return pf.b.i0(bVar).I(aVar).build();
    }

    private void i() {
        this.f32770b = dj.j.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void p(pf.b bVar) {
        this.f32770b = dj.j.n(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dj.d n(HashSet hashSet, pf.b bVar) {
        l2.a("Existing impressions: " + bVar.toString());
        b.C0381b h02 = pf.b.h0();
        for (pf.a aVar : bVar.f0()) {
            if (!hashSet.contains(aVar.e0())) {
                h02.I(aVar);
            }
        }
        final pf.b build = h02.build();
        l2.a("New cleared impression list: " + build.toString());
        return this.f32769a.f(build).g(new jj.a() { // from class: zd.v0
            @Override // jj.a
            public final void run() {
                w0.this.m(build);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(Throwable th2) {
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ dj.d q(pf.a aVar, pf.b bVar) {
        final pf.b g10 = g(bVar, aVar);
        return this.f32769a.f(g10).g(new jj.a() { // from class: zd.q0
            @Override // jj.a
            public final void run() {
                w0.this.p(g10);
            }
        });
    }

    public dj.b h(pf.e eVar) {
        final HashSet hashSet = new HashSet();
        for (of.c cVar : eVar.f0()) {
            hashSet.add(cVar.g0().equals(c.EnumC0372c.VANILLA_PAYLOAD) ? cVar.j0().d0() : cVar.e0().d0());
        }
        l2.a("Potential impressions to clear: " + hashSet.toString());
        return j().c(f32768c).j(new jj.e() { // from class: zd.u0
            @Override // jj.e
            public final Object apply(Object obj) {
                dj.d n10;
                n10 = w0.this.n(hashSet, (pf.b) obj);
                return n10;
            }
        });
    }

    public dj.j<pf.b> j() {
        return this.f32770b.x(this.f32769a.e(pf.b.j0()).f(new jj.d() { // from class: zd.n0
            @Override // jj.d
            public final void accept(Object obj) {
                w0.this.p((pf.b) obj);
            }
        })).e(new jj.d() { // from class: zd.o0
            @Override // jj.d
            public final void accept(Object obj) {
                w0.this.o((Throwable) obj);
            }
        });
    }

    public dj.s<Boolean> l(of.c cVar) {
        return j().o(new jj.e() { // from class: zd.r0
            @Override // jj.e
            public final Object apply(Object obj) {
                return ((pf.b) obj).f0();
            }
        }).k(new jj.e() { // from class: zd.s0
            @Override // jj.e
            public final Object apply(Object obj) {
                return dj.o.p((List) obj);
            }
        }).r(new jj.e() { // from class: zd.t0
            @Override // jj.e
            public final Object apply(Object obj) {
                return ((pf.a) obj).e0();
            }
        }).g(cVar.g0().equals(c.EnumC0372c.VANILLA_PAYLOAD) ? cVar.j0().d0() : cVar.e0().d0());
    }

    public dj.b r(final pf.a aVar) {
        return j().c(f32768c).j(new jj.e() { // from class: zd.p0
            @Override // jj.e
            public final Object apply(Object obj) {
                dj.d q10;
                q10 = w0.this.q(aVar, (pf.b) obj);
                return q10;
            }
        });
    }
}
