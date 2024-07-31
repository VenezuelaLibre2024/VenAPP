package p487zd;

import de.AbstractC6900m;
import dj.AbstractC6977b;
import dj.AbstractC6985j;
import dj.AbstractC6990o;
import dj.AbstractC6994s;
import dj.InterfaceC6979d;
import p043ce.InterfaceC1956a;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9079g;

/* renamed from: zd.m3 */
/* loaded from: classes.dex */
public class C12946m3 {

    /* renamed from: d */
    private static final C12896c3 f35225d = C12896c3.m42693d0();

    /* renamed from: a */
    private final C12983u2 f35226a;

    /* renamed from: b */
    private final InterfaceC1956a f35227b;

    /* renamed from: c */
    private AbstractC6985j<C12896c3> f35228c = AbstractC6985j.m20253g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12946m3(C12983u2 c12983u2, InterfaceC1956a interfaceC1956a) {
        this.f35226a = c12983u2;
        this.f35227b = interfaceC1956a;
    }

    /* renamed from: j */
    private void m42856j() {
        this.f35228c = AbstractC6985j.m20253g();
    }

    /* renamed from: k */
    private AbstractC6985j<C12896c3> m42857k() {
        return this.f35228c.m20274x(this.f35226a.m42950e(C12896c3.m42698j0()).m20259f(new InterfaceC9076d() { // from class: zd.e3
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12946m3.this.m42864t((C12896c3) obj);
            }
        })).m20258e(new InterfaceC9076d() { // from class: zd.f3
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12946m3.this.m42861q((Throwable) obj);
            }
        });
    }

    /* renamed from: m */
    private static C12891b3 m42858m(C12891b3 c12891b3) {
        return C12891b3.m42678k0(c12891b3).m42683I().m42685K(c12891b3.m42682i0() + 1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m42864t(C12896c3 c12896c3) {
        this.f35228c = AbstractC6985j.m20255n(c12896c3);
    }

    /* renamed from: o */
    private boolean m42860o(C12891b3 c12891b3, AbstractC6900m abstractC6900m) {
        return this.f35227b.mo10198a() - c12891b3.m42681h0() > abstractC6900m.mo19878d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m42861q(Throwable th2) {
        m42856j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ boolean m42862r(AbstractC6900m abstractC6900m, C12891b3 c12891b3) {
        return !m42860o(c12891b3, abstractC6900m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ C12896c3 m42863s(C12896c3 c12896c3, AbstractC6900m abstractC6900m, C12891b3 c12891b3) {
        return C12896c3.m42697i0(c12896c3).m42700I(abstractC6900m.mo19877c(), m42858m(c12891b3)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ InterfaceC6979d m42865u(final C12896c3 c12896c3) {
        return this.f35226a.m42951f(c12896c3).m20202g(new InterfaceC9073a() { // from class: zd.l3
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12946m3.this.m42864t(c12896c3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ InterfaceC6979d m42866v(final AbstractC6900m abstractC6900m, final C12896c3 c12896c3) {
        return AbstractC6990o.m20284q(c12896c3.m42699e0(abstractC6900m.mo19877c(), m42869y())).m20288i(new InterfaceC9079g() { // from class: zd.i3
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42862r;
                m42862r = C12946m3.this.m42862r(abstractC6900m, (C12891b3) obj);
                return m42862r;
            }
        }).m20296t(AbstractC6990o.m20284q(m42869y())).m20295r(new InterfaceC9077e() { // from class: zd.j3
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                C12896c3 m42863s;
                m42863s = C12946m3.m42863s(C12896c3.this, abstractC6900m, (C12891b3) obj);
                return m42863s;
            }
        }).m20293n(new InterfaceC9077e() { // from class: zd.k3
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                InterfaceC6979d m42865u;
                m42865u = C12946m3.this.m42865u((C12896c3) obj);
                return m42865u;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ C12891b3 m42867w(AbstractC6900m abstractC6900m, C12896c3 c12896c3) {
        return c12896c3.m42699e0(abstractC6900m.mo19877c(), m42869y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ boolean m42868x(AbstractC6900m abstractC6900m, C12891b3 c12891b3) {
        return m42860o(c12891b3, abstractC6900m) || c12891b3.m42682i0() < abstractC6900m.mo19876b();
    }

    /* renamed from: y */
    private C12891b3 m42869y() {
        return C12891b3.m42677j0().m42685K(0L).m42684J(this.f35227b.mo10198a()).build();
    }

    /* renamed from: l */
    public AbstractC6977b m42870l(final AbstractC6900m abstractC6900m) {
        return m42857k().m20257c(f35225d).m20262j(new InterfaceC9077e() { // from class: zd.d3
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                InterfaceC6979d m42866v;
                m42866v = C12946m3.this.m42866v(abstractC6900m, (C12896c3) obj);
                return m42866v;
            }
        });
    }

    /* renamed from: p */
    public AbstractC6994s<Boolean> m42871p(final AbstractC6900m abstractC6900m) {
        return m42857k().m20274x(AbstractC6985j.m20255n(C12896c3.m42693d0())).m20265o(new InterfaceC9077e() { // from class: zd.g3
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                C12891b3 m42867w;
                m42867w = C12946m3.this.m42867w(abstractC6900m, (C12896c3) obj);
                return m42867w;
            }
        }).m20260h(new InterfaceC9079g() { // from class: zd.h3
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42868x;
                m42868x = C12946m3.this.m42868x(abstractC6900m, (C12891b3) obj);
                return m42868x;
            }
        }).m20264m();
    }
}
