package p487zd;

import dj.AbstractC6977b;
import dj.AbstractC6985j;
import dj.AbstractC6990o;
import dj.AbstractC6994s;
import dj.InterfaceC6979d;
import java.util.HashSet;
import java.util.List;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p275of.C9938c;
import pf.C10163a;
import pf.C10164b;
import pf.C10167e;

/* renamed from: zd.w0 */
/* loaded from: classes.dex */
public class C12989w0 {

    /* renamed from: c */
    private static final C10164b f35319c = C10164b.m30389g0();

    /* renamed from: a */
    private final C12983u2 f35320a;

    /* renamed from: b */
    private AbstractC6985j<C10164b> f35321b = AbstractC6985j.m20253g();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12989w0(C12983u2 c12983u2) {
        this.f35320a = c12983u2;
    }

    /* renamed from: g */
    private static C10164b m42959g(C10164b c10164b, C10163a c10163a) {
        return C10164b.m30391i0(c10164b).m30394I(c10163a).build();
    }

    /* renamed from: i */
    private void m42960i() {
        this.f35321b = AbstractC6985j.m20253g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m42965p(C10164b c10164b) {
        this.f35321b = AbstractC6985j.m20255n(c10164b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ InterfaceC6979d m42963n(HashSet hashSet, C10164b c10164b) {
        C12940l2.m42840a("Existing impressions: " + c10164b.toString());
        C10164b.b m30390h0 = C10164b.m30390h0();
        for (C10163a c10163a : c10164b.m30393f0()) {
            if (!hashSet.contains(c10163a.m30382e0())) {
                m30390h0.m30394I(c10163a);
            }
        }
        final C10164b build = m30390h0.build();
        C12940l2.m42840a("New cleared impression list: " + build.toString());
        return this.f35320a.m42951f(build).m20202g(new InterfaceC9073a() { // from class: zd.v0
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12989w0.this.m42962m(build);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m42964o(Throwable th2) {
        m42960i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ InterfaceC6979d m42966q(C10163a c10163a, C10164b c10164b) {
        final C10164b m42959g = m42959g(c10164b, c10163a);
        return this.f35320a.m42951f(m42959g).m20202g(new InterfaceC9073a() { // from class: zd.q0
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12989w0.this.m42965p(m42959g);
            }
        });
    }

    /* renamed from: h */
    public AbstractC6977b m42967h(C10167e c10167e) {
        final HashSet hashSet = new HashSet();
        for (C9938c c9938c : c10167e.m30429f0()) {
            hashSet.add(c9938c.m29684g0().equals(C9938c.c.VANILLA_PAYLOAD) ? c9938c.m29687j0().m29692d0() : c9938c.m29682e0().m29674d0());
        }
        C12940l2.m42840a("Potential impressions to clear: " + hashSet.toString());
        return m42968j().m20257c(f35319c).m20262j(new InterfaceC9077e() { // from class: zd.u0
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                InterfaceC6979d m42963n;
                m42963n = C12989w0.this.m42963n(hashSet, (C10164b) obj);
                return m42963n;
            }
        });
    }

    /* renamed from: j */
    public AbstractC6985j<C10164b> m42968j() {
        return this.f35321b.m20274x(this.f35320a.m42950e(C10164b.m30392j0()).m20259f(new InterfaceC9076d() { // from class: zd.n0
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12989w0.this.m42965p((C10164b) obj);
            }
        })).m20258e(new InterfaceC9076d() { // from class: zd.o0
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12989w0.this.m42964o((Throwable) obj);
            }
        });
    }

    /* renamed from: l */
    public AbstractC6994s<Boolean> m42969l(C9938c c9938c) {
        return m42968j().m20265o(new InterfaceC9077e() { // from class: zd.r0
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                return ((C10164b) obj).m30393f0();
            }
        }).m20263k(new InterfaceC9077e() { // from class: zd.s0
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                return AbstractC6990o.m20283p((List) obj);
            }
        }).m20295r(new InterfaceC9077e() { // from class: zd.t0
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                return ((C10163a) obj).m30382e0();
            }
        }).m20287g(c9938c.m29684g0().equals(C9938c.c.VANILLA_PAYLOAD) ? c9938c.m29687j0().m29692d0() : c9938c.m29682e0().m29674d0());
    }

    /* renamed from: r */
    public AbstractC6977b m42970r(final C10163a c10163a) {
        return m42968j().m20257c(f35319c).m20262j(new InterfaceC9077e() { // from class: zd.p0
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                InterfaceC6979d m42966q;
                m42966q = C12989w0.this.m42966q(c10163a, (C10164b) obj);
                return m42966q;
            }
        });
    }
}
