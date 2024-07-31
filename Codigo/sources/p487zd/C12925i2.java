package p487zd;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.installations.AbstractC6200g;
import de.AbstractC6896i;
import de.AbstractC6900m;
import de.C6898k;
import de.C6902o;
import dj.AbstractC6977b;
import dj.AbstractC6981f;
import dj.AbstractC6985j;
import dj.AbstractC6994s;
import dj.InterfaceC6979d;
import dj.InterfaceC6986k;
import dj.InterfaceC6988m;
import dj.InterfaceC6989n;
import im.InterfaceC8014a;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import p043ce.InterfaceC1956a;
import p063dc.InterfaceC6880b;
import p106fe.InterfaceC7337f;
import p165ij.AbstractC8003a;
import p186jj.InterfaceC9073a;
import p186jj.InterfaceC9074b;
import p186jj.InterfaceC9076d;
import p186jj.InterfaceC9077e;
import p186jj.InterfaceC9079g;
import p275of.C9938c;
import p311qd.C10440d0;
import p311qd.C10447h;
import pf.C10164b;
import pf.C10167e;

/* renamed from: zd.i2 */
/* loaded from: classes.dex */
public class C12925i2 {

    /* renamed from: a */
    private final AbstractC8003a<String> f35166a;

    /* renamed from: b */
    private final AbstractC8003a<String> f35167b;

    /* renamed from: c */
    private final C12932k f35168c;

    /* renamed from: d */
    private final InterfaceC1956a f35169d;

    /* renamed from: e */
    private final C12897d f35170e;

    /* renamed from: f */
    private final C12956o3 f35171f;

    /* renamed from: g */
    private final C12989w0 f35172g;

    /* renamed from: h */
    private final C12946m3 f35173h;

    /* renamed from: i */
    private final AbstractC6900m f35174i;

    /* renamed from: j */
    private final C12892c f35175j;

    /* renamed from: k */
    private final C12971r3 f35176k;

    /* renamed from: l */
    private final C12887b f35177l;

    /* renamed from: m */
    private final InterfaceC7337f f35178m;

    /* renamed from: n */
    private final C12947n f35179n;

    /* renamed from: o */
    @InterfaceC6880b
    private final Executor f35180o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zd.i2$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35181a;

        static {
            int[] iArr = new int[C10440d0.b.values().length];
            f35181a = iArr;
            try {
                iArr[C10440d0.b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35181a[C10440d0.b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35181a[C10440d0.b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35181a[C10440d0.b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C12925i2(AbstractC8003a<String> abstractC8003a, AbstractC8003a<String> abstractC8003a2, C12932k c12932k, InterfaceC1956a interfaceC1956a, C12897d c12897d, C12892c c12892c, C12956o3 c12956o3, C12989w0 c12989w0, C12946m3 c12946m3, AbstractC6900m abstractC6900m, C12971r3 c12971r3, InterfaceC7337f interfaceC7337f, C12947n c12947n, C12887b c12887b, @InterfaceC6880b Executor executor) {
        this.f35166a = abstractC8003a;
        this.f35167b = abstractC8003a2;
        this.f35168c = c12932k;
        this.f35169d = interfaceC1956a;
        this.f35170e = c12897d;
        this.f35175j = c12892c;
        this.f35171f = c12956o3;
        this.f35172g = c12989w0;
        this.f35173h = c12946m3;
        this.f35174i = abstractC6900m;
        this.f35176k = c12971r3;
        this.f35179n = c12947n;
        this.f35178m = interfaceC7337f;
        this.f35177l = c12887b;
        this.f35180o = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public static boolean m42739A0(AbstractC12935k2 abstractC12935k2) {
        return (TextUtils.isEmpty(abstractC12935k2.mo42706b()) || TextUtils.isEmpty(abstractC12935k2.mo42707c().mo16814b())) ? false : true;
    }

    /* renamed from: H */
    static C10167e m42746H() {
        return C10167e.m30425g0().m30430I(1L).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public static int m42747I(C9938c c9938c, C9938c c9938c2) {
        if (c9938c.m29683f0() && !c9938c2.m29683f0()) {
            return -1;
        }
        if (!c9938c2.m29683f0() || c9938c.m29683f0()) {
            return Integer.compare(c9938c.m29685h0().m31320d0(), c9938c2.m29685h0().m31320d0());
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static boolean m42748J(String str, C9938c c9938c) {
        if (m42754Q(str) && c9938c.m29683f0()) {
            return true;
        }
        for (C10447h c10447h : c9938c.m29686i0()) {
            if (m42752O(c10447h, str) || m42751N(c10447h, str)) {
                C12940l2.m42840a(String.format("The event %s is contained in the list of triggers", str));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC6985j<C9938c> m42759V(String str, final C9938c c9938c) {
        return (c9938c.m29683f0() || !m42754Q(str)) ? AbstractC6985j.m20255n(c9938c) : this.f35173h.m42871p(this.f35174i).m20307f(new InterfaceC9076d() { // from class: zd.g1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42791n0((Boolean) obj);
            }
        }).m20309i(AbstractC6994s.m20304h(Boolean.FALSE)).m20308g(new InterfaceC9079g() { // from class: zd.h1
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42793o0;
                m42793o0 = C12925i2.m42793o0((Boolean) obj);
                return m42793o0;
            }
        }).m20265o(new InterfaceC9077e() { // from class: zd.i1
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                C9938c m42795p0;
                m42795p0 = C12925i2.m42795p0(C9938c.this, (Boolean) obj);
                return m42795p0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public AbstractC6985j<C6902o> m42761X(final String str, InterfaceC9077e<C9938c, AbstractC6985j<C9938c>> interfaceC9077e, InterfaceC9077e<C9938c, AbstractC6985j<C9938c>> interfaceC9077e2, InterfaceC9077e<C9938c, AbstractC6985j<C9938c>> interfaceC9077e3, C10167e c10167e) {
        return AbstractC6981f.m20218s(c10167e.m30429f0()).m20236j(new InterfaceC9079g() { // from class: zd.b1
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42797q0;
                m42797q0 = C12925i2.this.m42797q0((C9938c) obj);
                return m42797q0;
            }
        }).m20236j(new InterfaceC9079g() { // from class: zd.c1
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42748J;
                m42748J = C12925i2.m42748J(str, (C9938c) obj);
                return m42748J;
            }
        }).m20242p(interfaceC9077e).m20242p(interfaceC9077e2).m20242p(interfaceC9077e3).m20225E(new Comparator() { // from class: zd.d1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m42747I;
                m42747I = C12925i2.m42747I((C9938c) obj, (C9938c) obj2);
                return m42747I;
            }
        }).m20237k().m20261i(new InterfaceC9077e() { // from class: zd.e1
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                InterfaceC6989n m42801s0;
                m42801s0 = C12925i2.this.m42801s0(str, (C9938c) obj);
                return m42801s0;
            }
        });
    }

    /* renamed from: N */
    private static boolean m42751N(C10447h c10447h, String str) {
        return c10447h.m31345b0().m31309d0().equals(str);
    }

    /* renamed from: O */
    private static boolean m42752O(C10447h c10447h, String str) {
        return c10447h.m31346d0().toString().equals(str);
    }

    /* renamed from: P */
    private static boolean m42753P(InterfaceC1956a interfaceC1956a, C9938c c9938c) {
        long m29676f0;
        long m29673b0;
        if (c9938c.m29684g0().equals(C9938c.c.VANILLA_PAYLOAD)) {
            m29676f0 = c9938c.m29687j0().m29694f0();
            m29673b0 = c9938c.m29687j0().m29691b0();
        } else {
            if (!c9938c.m29684g0().equals(C9938c.c.EXPERIMENTAL_PAYLOAD)) {
                return false;
            }
            m29676f0 = c9938c.m29682e0().m29676f0();
            m29673b0 = c9938c.m29682e0().m29673b0();
        }
        long mo10198a = interfaceC1956a.mo10198a();
        return mo10198a > m29676f0 && mo10198a < m29673b0;
    }

    /* renamed from: Q */
    public static boolean m42754Q(String str) {
        return str.equals("ON_FOREGROUND");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static /* synthetic */ void m42755R(String str) {
        C12940l2.m42840a("Event Triggered: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static /* synthetic */ C9938c m42757T(C9938c c9938c, Boolean bool) {
        return c9938c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ AbstractC6985j m42758U(final C9938c c9938c) {
        return c9938c.m29683f0() ? AbstractC6985j.m20255n(c9938c) : this.f35172g.m42969l(c9938c).m20306e(new InterfaceC9076d() { // from class: zd.v1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42785k0((Throwable) obj);
            }
        }).m20309i(AbstractC6994s.m20304h(Boolean.FALSE)).m20307f(new InterfaceC9076d() { // from class: zd.w1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42809w0(C9938c.this, (Boolean) obj);
            }
        }).m20308g(new InterfaceC9079g() { // from class: zd.x1
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42789m0;
                m42789m0 = C12925i2.m42789m0((Boolean) obj);
                return m42789m0;
            }
        }).m20265o(new InterfaceC9077e() { // from class: zd.y1
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                C9938c m42757T;
                m42757T = C12925i2.m42757T(C9938c.this, (Boolean) obj);
                return m42757T;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static /* synthetic */ AbstractC6985j m42760W(C9938c c9938c) {
        int i10 = a.f35181a[c9938c.m29680b0().m31315g0().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return AbstractC6985j.m20255n(c9938c);
        }
        C12940l2.m42840a("Filtering non-displayable message");
        return AbstractC6985j.m20253g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static /* synthetic */ void m42762Y(Throwable th2) {
        C12940l2.m42843d("Impressions store read fail: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ C10167e m42763Z(C10164b c10164b, AbstractC12935k2 abstractC12935k2) {
        return this.f35170e.m42705c(abstractC12935k2, c10164b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static /* synthetic */ void m42765a0(C10167e c10167e) {
        C12940l2.m42842c(String.format(Locale.US, "Successfully fetched %d messages from backend", Integer.valueOf(c10167e.m30429f0().size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m42767b0(C10167e c10167e) {
        this.f35172g.m42967h(c10167e).m20207o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public static /* synthetic */ void m42769c0(Throwable th2) {
        C12940l2.m42843d("Service fetch error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0 */
    public static /* synthetic */ void m42771d0(Throwable th2) {
        C12940l2.m42843d("Cache read error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ AbstractC6985j m42773e0(AbstractC6985j abstractC6985j, final C10164b c10164b) {
        if (!this.f35179n.m42876b()) {
            C12940l2.m42842c("Automatic data collection is disabled, not attempting campaign fetch from service.");
            return AbstractC6985j.m20255n(m42746H());
        }
        AbstractC6985j m20259f = abstractC6985j.m20260h(new InterfaceC9079g() { // from class: zd.n1
            @Override // p186jj.InterfaceC9079g
            public final boolean test(Object obj) {
                boolean m42739A0;
                m42739A0 = C12925i2.m42739A0((AbstractC12935k2) obj);
                return m42739A0;
            }
        }).m20265o(new InterfaceC9077e() { // from class: zd.o1
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                C10167e m42763Z;
                m42763Z = C12925i2.this.m42763Z(c10164b, (AbstractC12935k2) obj);
                return m42763Z;
            }
        }).m20274x(AbstractC6985j.m20255n(m42746H())).m20259f(new InterfaceC9076d() { // from class: zd.p1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42765a0((C10167e) obj);
            }
        }).m20259f(new InterfaceC9076d() { // from class: zd.q1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.this.m42767b0((C10167e) obj);
            }
        });
        final C12892c c12892c = this.f35175j;
        Objects.requireNonNull(c12892c);
        AbstractC6985j m20259f2 = m20259f.m20259f(new InterfaceC9076d() { // from class: zd.r1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12892c.this.m42690e((C10167e) obj);
            }
        });
        final C12971r3 c12971r3 = this.f35176k;
        Objects.requireNonNull(c12971r3);
        return m20259f2.m20259f(new InterfaceC9076d() { // from class: zd.s1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12971r3.this.m42923c((C10167e) obj);
            }
        }).m20258e(new InterfaceC9076d() { // from class: zd.t1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42769c0((Throwable) obj);
            }
        }).m20267q(AbstractC6985j.m20253g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ InterfaceC8014a m42775f0(final String str) {
        AbstractC6985j<C10167e> m20274x;
        AbstractC6985j<C10167e> m20267q = this.f35168c.m42830f().m20259f(new InterfaceC9076d() { // from class: zd.u1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12940l2.m42840a("Fetched from cache");
            }
        }).m20258e(new InterfaceC9076d() { // from class: zd.b2
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42771d0((Throwable) obj);
            }
        }).m20267q(AbstractC6985j.m20253g());
        InterfaceC9076d interfaceC9076d = new InterfaceC9076d() { // from class: zd.c2
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.this.m42783j0((C10167e) obj);
            }
        };
        final InterfaceC9077e interfaceC9077e = new InterfaceC9077e() { // from class: zd.d2
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                AbstractC6985j m42758U;
                m42758U = C12925i2.this.m42758U((C9938c) obj);
                return m42758U;
            }
        };
        final InterfaceC9077e interfaceC9077e2 = new InterfaceC9077e() { // from class: zd.e2
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                AbstractC6985j m42759V;
                m42759V = C12925i2.this.m42759V(str, (C9938c) obj);
                return m42759V;
            }
        };
        final InterfaceC9077e interfaceC9077e3 = new InterfaceC9077e() { // from class: zd.f2
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                AbstractC6985j m42760W;
                m42760W = C12925i2.m42760W((C9938c) obj);
                return m42760W;
            }
        };
        InterfaceC9077e<? super C10167e, ? extends InterfaceC6989n<? extends R>> interfaceC9077e4 = new InterfaceC9077e() { // from class: zd.g2
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                AbstractC6985j m42761X;
                m42761X = C12925i2.this.m42761X(str, interfaceC9077e, interfaceC9077e2, interfaceC9077e3, (C10167e) obj);
                return m42761X;
            }
        };
        AbstractC6985j<C10164b> m20267q2 = this.f35172g.m42968j().m20258e(new InterfaceC9076d() { // from class: zd.h2
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42762Y((Throwable) obj);
            }
        }).m20257c(C10164b.m30389g0()).m20267q(AbstractC6985j.m20255n(C10164b.m30389g0()));
        final AbstractC6985j m20266p = AbstractC6985j.m20250A(m42813y0(this.f35178m.getId(), this.f35180o), m42813y0(this.f35178m.mo16854a(false), this.f35180o), new InterfaceC9074b() { // from class: zd.z0
            @Override // p186jj.InterfaceC9074b
            public final Object apply(Object obj, Object obj2) {
                return AbstractC12935k2.m42835a((String) obj, (AbstractC6200g) obj2);
            }
        }).m20266p(this.f35171f.m42881a());
        InterfaceC9077e<? super C10164b, ? extends InterfaceC6989n<? extends R>> interfaceC9077e5 = new InterfaceC9077e() { // from class: zd.a1
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                AbstractC6985j m42773e0;
                m42773e0 = C12925i2.this.m42773e0(m20266p, (C10164b) obj);
                return m42773e0;
            }
        };
        if (m42811x0(str)) {
            C12940l2.m42842c(String.format("Forcing fetch from service rather than cache. Test Device: %s | App Fresh Install: %s", Boolean.valueOf(this.f35176k.m42922b()), Boolean.valueOf(this.f35176k.m42921a())));
            m20274x = m20267q2.m20261i(interfaceC9077e5);
        } else {
            C12940l2.m42840a("Attempting to fetch campaigns using cache");
            m20274x = m20267q.m20274x(m20267q2.m20261i(interfaceC9077e5).m20259f(interfaceC9076d));
        }
        return m20274x.m20261i(interfaceC9077e4).m20275y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0 */
    public static /* synthetic */ void m42779h0(Throwable th2) {
        C12940l2.m42843d("Cache write error: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static /* synthetic */ InterfaceC6979d m42781i0(Throwable th2) {
        return AbstractC6977b.m20192d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public /* synthetic */ void m42783j0(C10167e c10167e) {
        this.f35168c.m42831l(c10167e).m20202g(new InterfaceC9073a() { // from class: zd.k1
            @Override // p186jj.InterfaceC9073a
            public final void run() {
                C12940l2.m42840a("Wrote to cache");
            }
        }).m20203h(new InterfaceC9076d() { // from class: zd.l1
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42779h0((Throwable) obj);
            }
        }).m20206n(new InterfaceC9077e() { // from class: zd.m1
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                return C12925i2.m42781i0((Throwable) obj);
            }
        }).m20207o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static /* synthetic */ void m42785k0(Throwable th2) {
        C12940l2.m42843d("Impression store read fail: " + th2.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static /* synthetic */ boolean m42789m0(Boolean bool) {
        return !bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static /* synthetic */ void m42791n0(Boolean bool) {
        C12940l2.m42842c("App foreground rate limited ? : " + bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public static /* synthetic */ boolean m42793o0(Boolean bool) {
        return !bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p0 */
    public static /* synthetic */ C9938c m42795p0(C9938c c9938c, Boolean bool) {
        return c9938c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public /* synthetic */ boolean m42797q0(C9938c c9938c) {
        return this.f35176k.m42922b() || m42753P(this.f35169d, c9938c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public static /* synthetic */ void m42803t0(InterfaceC6986k interfaceC6986k, Object obj) {
        interfaceC6986k.onSuccess(obj);
        interfaceC6986k.mo20277a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public static /* synthetic */ void m42805u0(InterfaceC6986k interfaceC6986k, Exception exc) {
        interfaceC6986k.onError(exc);
        interfaceC6986k.mo20277a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public static /* synthetic */ void m42807v0(Task task, Executor executor, final InterfaceC6986k interfaceC6986k) {
        task.addOnSuccessListener(executor, new OnSuccessListener() { // from class: zd.z1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                C12925i2.m42803t0(InterfaceC6986k.this, obj);
            }
        });
        task.addOnFailureListener(executor, new OnFailureListener() { // from class: zd.a2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                C12925i2.m42805u0(InterfaceC6986k.this, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static void m42809w0(C9938c c9938c, Boolean bool) {
        String format;
        if (c9938c.m29684g0().equals(C9938c.c.VANILLA_PAYLOAD)) {
            format = String.format("Already impressed campaign %s ? : %s", c9938c.m29687j0().m29693e0(), bool);
        } else if (!c9938c.m29684g0().equals(C9938c.c.EXPERIMENTAL_PAYLOAD)) {
            return;
        } else {
            format = String.format("Already impressed experiment %s ? : %s", c9938c.m29682e0().m29675e0(), bool);
        }
        C12940l2.m42842c(format);
    }

    /* renamed from: x0 */
    private boolean m42811x0(String str) {
        return this.f35176k.m42921a() ? m42754Q(str) : this.f35176k.m42922b();
    }

    /* renamed from: y0 */
    private static <T> AbstractC6985j<T> m42813y0(final Task<T> task, @InterfaceC6880b final Executor executor) {
        return AbstractC6985j.m20252b(new InterfaceC6988m() { // from class: zd.f1
            @Override // dj.InterfaceC6988m
            /* renamed from: a */
            public final void mo20280a(InterfaceC6986k interfaceC6986k) {
                C12925i2.m42807v0(Task.this, executor, interfaceC6986k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public AbstractC6985j<C6902o> m42801s0(C9938c c9938c, String str) {
        String m29674d0;
        String m29675e0;
        if (c9938c.m29684g0().equals(C9938c.c.VANILLA_PAYLOAD)) {
            m29674d0 = c9938c.m29687j0().m29692d0();
            m29675e0 = c9938c.m29687j0().m29693e0();
        } else {
            if (!c9938c.m29684g0().equals(C9938c.c.EXPERIMENTAL_PAYLOAD)) {
                return AbstractC6985j.m20253g();
            }
            m29674d0 = c9938c.m29682e0().m29674d0();
            m29675e0 = c9938c.m29682e0().m29675e0();
            if (!c9938c.m29683f0()) {
                this.f35177l.m42670c(c9938c.m29682e0().m29677h0());
            }
        }
        AbstractC6896i m19944c = C6898k.m19944c(c9938c.m29680b0(), m29674d0, m29675e0, c9938c.m29683f0(), c9938c.m29681d0());
        return m19944c.m19930c().equals(MessageType.UNSUPPORTED) ? AbstractC6985j.m20253g() : AbstractC6985j.m20255n(new C6902o(m19944c, str));
    }

    /* renamed from: K */
    public AbstractC6981f<C6902o> m42816K() {
        return AbstractC6981f.m20220v(this.f35166a, this.f35175j.m42689d(), this.f35167b).m20234g(new InterfaceC9076d() { // from class: zd.y0
            @Override // p186jj.InterfaceC9076d
            public final void accept(Object obj) {
                C12925i2.m42755R((String) obj);
            }
        }).m20245w(this.f35171f.m42881a()).m20232c(new InterfaceC9077e() { // from class: zd.j1
            @Override // p186jj.InterfaceC9077e
            public final Object apply(Object obj) {
                InterfaceC8014a m42775f0;
                m42775f0 = C12925i2.this.m42775f0((String) obj);
                return m42775f0;
            }
        }).m20245w(this.f35171f.m42882b());
    }
}
