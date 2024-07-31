package zd;

import android.text.TextUtils;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import of.c;
import qd.d0;

/* loaded from: classes.dex */
public class i2 {

    /* renamed from: a */
    private final ij.a<String> f32615a;

    /* renamed from: b */
    private final ij.a<String> f32616b;

    /* renamed from: c */
    private final k f32617c;

    /* renamed from: d */
    private final ce.a f32618d;

    /* renamed from: e */
    private final d f32619e;

    /* renamed from: f */
    private final o3 f32620f;

    /* renamed from: g */
    private final w0 f32621g;

    /* renamed from: h */
    private final m3 f32622h;

    /* renamed from: i */
    private final de.m f32623i;

    /* renamed from: j */
    private final c f32624j;

    /* renamed from: k */
    private final r3 f32625k;

    /* renamed from: l */
    private final b f32626l;

    /* renamed from: m */
    private final fe.f f32627m;

    /* renamed from: n */
    private final n f32628n;

    /* renamed from: o */
    @dc.b
    private final Executor f32629o;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32630a;

        static {
            int[] iArr = new int[d0.b.values().length];
            f32630a = iArr;
            try {
                iArr[d0.b.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32630a[d0.b.IMAGE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32630a[d0.b.MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32630a[d0.b.CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i2(ij.a<String> aVar, ij.a<String> aVar2, k kVar, ce.a aVar3, d dVar, c cVar, o3 o3Var, w0 w0Var, m3 m3Var, de.m mVar, r3 r3Var, fe.f fVar, n nVar, b bVar, @dc.b Executor executor) {
        this.f32615a = aVar;
        this.f32616b = aVar2;
        this.f32617c = kVar;
        this.f32618d = aVar3;
        this.f32619e = dVar;
        this.f32624j = cVar;
        this.f32620f = o3Var;
        this.f32621g = w0Var;
        this.f32622h = m3Var;
        this.f32623i = mVar;
        this.f32625k = r3Var;
        this.f32628n = nVar;
        this.f32627m = fVar;
        this.f32626l = bVar;
        this.f32629o = executor;
    }

    public static boolean A0(k2 k2Var) {
        return (TextUtils.isEmpty(k2Var.b()) || TextUtils.isEmpty(k2Var.c().b())) ? false : true;
    }

    static pf.e H() {
        return pf.e.g0().I(1L).build();
    }

    public static int I(of.c cVar, of.c cVar2) {
        if (cVar.f0() && !cVar2.f0()) {
            return -1;
        }
        if (!cVar2.f0() || cVar.f0()) {
            return Integer.compare(cVar.h0().d0(), cVar2.h0().d0());
        }
        return 1;
    }

    public static boolean J(String str, of.c cVar) {
        if (Q(str) && cVar.f0()) {
            return true;
        }
        for (qd.h hVar : cVar.i0()) {
            if (O(hVar, str) || N(hVar, str)) {
                l2.a(String.format("The event %s is contained in the list of triggers", str));
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public dj.j<of.c> V(String str, of.c cVar) {
        return (cVar.f0() || !Q(str)) ? dj.j.n(cVar) : this.f32622h.p(this.f32623i).f(new jj.d() { // from class: zd.g1
            @Override // jj.d
            public final void accept(Object obj) {
                i2.n0((Boolean) obj);
            }
        }).i(dj.s.h(Boolean.FALSE)).g(new jj.g() { // from class: zd.h1
            @Override // jj.g
            public final boolean test(Object obj) {
                boolean o02;
                o02 = i2.o0((Boolean) obj);
                return o02;
            }
        }).o(new jj.e() { // from class: zd.i1
            public /* synthetic */ i1() {
            }

            @Override // jj.e
            public final Object apply(Object obj) {
                of.c p02;
                p02 = i2.p0(of.c.this, (Boolean) obj);
                return p02;
            }
        });
    }

    /* renamed from: M */
    public dj.j<de.o> X(String str, jj.e<of.c, dj.j<of.c>> eVar, jj.e<of.c, dj.j<of.c>> eVar2, jj.e<of.c, dj.j<of.c>> eVar3, pf.e eVar4) {
        return dj.f.s(eVar4.f0()).j(new jj.g() { // from class: zd.b1
            public /* synthetic */ b1() {
            }

            @Override // jj.g
            public final boolean test(Object obj) {
                boolean q02;
                q02 = i2.this.q0((of.c) obj);
                return q02;
            }
        }).j(new jj.g() { // from class: zd.c1

            /* renamed from: a */
            public final /* synthetic */ String f32567a;

            public /* synthetic */ c1(String str2) {
                r1 = str2;
            }

            @Override // jj.g
            public final boolean test(Object obj) {
                boolean J;
                J = i2.J(r1, (of.c) obj);
                return J;
            }
        }).p(eVar).p(eVar2).p(eVar3).E(new Comparator() { // from class: zd.d1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int I;
                I = i2.I((of.c) obj, (of.c) obj2);
                return I;
            }
        }).k().i(new jj.e() { // from class: zd.e1

            /* renamed from: b */
            public final /* synthetic */ String f32582b;

            public /* synthetic */ e1(String str2) {
                r2 = str2;
            }

            @Override // jj.e
            public final Object apply(Object obj) {
                dj.n s02;
                s02 = i2.this.s0(r2, (of.c) obj);
                return s02;
            }
        });
    }

    private static boolean N(qd.h hVar, String str) {
        return hVar.b0().d0().equals(str);
    }

    private static boolean O(qd.h hVar, String str) {
        return hVar.d0().toString().equals(str);
    }

    private static boolean P(ce.a aVar, of.c cVar) {
        long f02;
        long b02;
        if (cVar.g0().equals(c.EnumC0372c.VANILLA_PAYLOAD)) {
            f02 = cVar.j0().f0();
            b02 = cVar.j0().b0();
        } else {
            if (!cVar.g0().equals(c.EnumC0372c.EXPERIMENTAL_PAYLOAD)) {
                return false;
            }
            f02 = cVar.e0().f0();
            b02 = cVar.e0().b0();
        }
        long a10 = aVar.a();
        return a10 > f02 && a10 < b02;
    }

    public static boolean Q(String str) {
        return str.equals("ON_FOREGROUND");
    }

    public static /* synthetic */ void R(String str) {
        l2.a("Event Triggered: " + str);
    }

    public static /* synthetic */ of.c T(of.c cVar, Boolean bool) {
        return cVar;
    }

    public /* synthetic */ dj.j U(of.c cVar) {
        return cVar.f0() ? dj.j.n(cVar) : this.f32621g.l(cVar).e(new jj.d() { // from class: zd.v1
            @Override // jj.d
            public final void accept(Object obj) {
                i2.k0((Throwable) obj);
            }
        }).i(dj.s.h(Boolean.FALSE)).f(new jj.d() { // from class: zd.w1
            public /* synthetic */ w1() {
            }

            @Override // jj.d
            public final void accept(Object obj) {
                i2.w0(of.c.this, (Boolean) obj);
            }
        }).g(new jj.g() { // from class: zd.x1
            @Override // jj.g
            public final boolean test(Object obj) {
                boolean m02;
                m02 = i2.m0((Boolean) obj);
                return m02;
            }
        }).o(new jj.e() { // from class: zd.y1
            public /* synthetic */ y1() {
            }

            @Override // jj.e
            public final Object apply(Object obj) {
                of.c T;
                T = i2.T(of.c.this, (Boolean) obj);
                return T;
            }
        });
    }

    public static /* synthetic */ dj.j W(of.c cVar) {
        int i10 = a.f32630a[cVar.b0().g0().ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return dj.j.n(cVar);
        }
        l2.a("Filtering non-displayable message");
        return dj.j.g();
    }

    public static /* synthetic */ void Y(Throwable th2) {
        l2.d("Impressions store read fail: " + th2.getMessage());
    }

    public /* synthetic */ pf.e Z(pf.b bVar, k2 k2Var) {
        return this.f32619e.c(k2Var, bVar);
    }

    public static /* synthetic */ void a0(pf.e eVar) {
        l2.c(String.format(Locale.US, "Successfully fetched %d messages from backend", Integer.valueOf(eVar.f0().size())));
    }

    public /* synthetic */ void b0(pf.e eVar) {
        this.f32621g.h(eVar).o();
    }

    public static /* synthetic */ void c0(Throwable th2) {
        l2.d("Service fetch error: " + th2.getMessage());
    }

    public static /* synthetic */ void d0(Throwable th2) {
        l2.d("Cache read error: " + th2.getMessage());
    }

    public /* synthetic */ dj.j e0(dj.j jVar, pf.b bVar) {
        if (!this.f32628n.b()) {
            l2.c("Automatic data collection is disabled, not attempting campaign fetch from service.");
            return dj.j.n(H());
        }
        dj.j f10 = jVar.h(new jj.g() { // from class: zd.n1
            @Override // jj.g
            public final boolean test(Object obj) {
                boolean A0;
                A0 = i2.A0((k2) obj);
                return A0;
            }
        }).o(new jj.e() { // from class: zd.o1

            /* renamed from: b */
            public final /* synthetic */ pf.b f32690b;

            public /* synthetic */ o1(pf.b bVar2) {
                r2 = bVar2;
            }

            @Override // jj.e
            public final Object apply(Object obj) {
                pf.e Z;
                Z = i2.this.Z(r2, (k2) obj);
                return Z;
            }
        }).x(dj.j.n(H())).f(new jj.d() { // from class: zd.p1
            @Override // jj.d
            public final void accept(Object obj) {
                i2.a0((pf.e) obj);
            }
        }).f(new jj.d() { // from class: zd.q1
            public /* synthetic */ q1() {
            }

            @Override // jj.d
            public final void accept(Object obj) {
                i2.this.b0((pf.e) obj);
            }
        });
        c cVar = this.f32624j;
        Objects.requireNonNull(cVar);
        dj.j f11 = f10.f(new jj.d() { // from class: zd.r1
            public /* synthetic */ r1() {
            }

            @Override // jj.d
            public final void accept(Object obj) {
                c.this.e((pf.e) obj);
            }
        });
        r3 r3Var = this.f32625k;
        Objects.requireNonNull(r3Var);
        return f11.f(new jj.d() { // from class: zd.s1
            public /* synthetic */ s1() {
            }

            @Override // jj.d
            public final void accept(Object obj) {
                r3.this.c((pf.e) obj);
            }
        }).e(new jj.d() { // from class: zd.t1
            @Override // jj.d
            public final void accept(Object obj) {
                i2.c0((Throwable) obj);
            }
        }).q(dj.j.g());
    }

    public /* synthetic */ im.a f0(String str) {
        dj.j<pf.e> x10;
        dj.j<pf.e> q10 = this.f32617c.f().f(new jj.d() { // from class: zd.u1
            @Override // jj.d
            public final void accept(Object obj) {
                l2.a("Fetched from cache");
            }
        }).e(new jj.d() { // from class: zd.b2
            @Override // jj.d
            public final void accept(Object obj) {
                i2.d0((Throwable) obj);
            }
        }).q(dj.j.g());
        c2 c2Var = new jj.d() { // from class: zd.c2
            public /* synthetic */ c2() {
            }

            @Override // jj.d
            public final void accept(Object obj) {
                i2.this.j0((pf.e) obj);
            }
        };
        g2 g2Var = new jj.e() { // from class: zd.g2

            /* renamed from: b */
            public final /* synthetic */ String f32592b;

            /* renamed from: c */
            public final /* synthetic */ jj.e f32593c;

            /* renamed from: d */
            public final /* synthetic */ jj.e f32594d;

            /* renamed from: e */
            public final /* synthetic */ jj.e f32595e;

            public /* synthetic */ g2(String str2, jj.e eVar, jj.e eVar2, jj.e eVar3) {
                r2 = str2;
                r3 = eVar;
                r4 = eVar2;
                r5 = eVar3;
            }

            @Override // jj.e
            public final Object apply(Object obj) {
                dj.j X;
                X = i2.this.X(r2, r3, r4, r5, (pf.e) obj);
                return X;
            }
        };
        dj.j<pf.b> q11 = this.f32621g.j().e(new jj.d() { // from class: zd.h2
            @Override // jj.d
            public final void accept(Object obj) {
                i2.Y((Throwable) obj);
            }
        }).c(pf.b.g0()).q(dj.j.n(pf.b.g0()));
        a1 a1Var = new jj.e() { // from class: zd.a1

            /* renamed from: b */
            public final /* synthetic */ dj.j f32555b;

            public /* synthetic */ a1(dj.j jVar) {
                r2 = jVar;
            }

            @Override // jj.e
            public final Object apply(Object obj) {
                dj.j e02;
                e02 = i2.this.e0(r2, (pf.b) obj);
                return e02;
            }
        };
        if (x0(str2)) {
            l2.c(String.format("Forcing fetch from service rather than cache. Test Device: %s | App Fresh Install: %s", Boolean.valueOf(this.f32625k.b()), Boolean.valueOf(this.f32625k.a())));
            x10 = q11.i(a1Var);
        } else {
            l2.a("Attempting to fetch campaigns using cache");
            x10 = q10.x(q11.i(a1Var).f(c2Var));
        }
        return x10.i(g2Var).y();
    }

    public static /* synthetic */ void h0(Throwable th2) {
        l2.d("Cache write error: " + th2.getMessage());
    }

    public static /* synthetic */ dj.d i0(Throwable th2) {
        return dj.b.d();
    }

    public /* synthetic */ void j0(pf.e eVar) {
        this.f32617c.l(eVar).g(new jj.a() { // from class: zd.k1
            @Override // jj.a
            public final void run() {
                l2.a("Wrote to cache");
            }
        }).h(new jj.d() { // from class: zd.l1
            @Override // jj.d
            public final void accept(Object obj) {
                i2.h0((Throwable) obj);
            }
        }).n(new jj.e() { // from class: zd.m1
            @Override // jj.e
            public final Object apply(Object obj) {
                return i2.i0((Throwable) obj);
            }
        }).o();
    }

    public static /* synthetic */ void k0(Throwable th2) {
        l2.d("Impression store read fail: " + th2.getMessage());
    }

    public static /* synthetic */ boolean m0(Boolean bool) {
        return !bool.booleanValue();
    }

    public static /* synthetic */ void n0(Boolean bool) {
        l2.c("App foreground rate limited ? : " + bool);
    }

    public static /* synthetic */ boolean o0(Boolean bool) {
        return !bool.booleanValue();
    }

    public static /* synthetic */ of.c p0(of.c cVar, Boolean bool) {
        return cVar;
    }

    public /* synthetic */ boolean q0(of.c cVar) {
        return this.f32625k.b() || P(this.f32618d, cVar);
    }

    public static /* synthetic */ void t0(dj.k kVar, Object obj) {
        kVar.onSuccess(obj);
        kVar.a();
    }

    public static /* synthetic */ void u0(dj.k kVar, Exception exc) {
        kVar.onError(exc);
        kVar.a();
    }

    public static /* synthetic */ void v0(Task task, Executor executor, dj.k kVar) {
        task.addOnSuccessListener(executor, new OnSuccessListener() { // from class: zd.z1
            public /* synthetic */ z1() {
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                i2.t0(dj.k.this, obj);
            }
        });
        task.addOnFailureListener(executor, new OnFailureListener() { // from class: zd.a2
            public /* synthetic */ a2() {
            }

            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                i2.u0(dj.k.this, exc);
            }
        });
    }

    public static void w0(of.c cVar, Boolean bool) {
        String format;
        if (cVar.g0().equals(c.EnumC0372c.VANILLA_PAYLOAD)) {
            format = String.format("Already impressed campaign %s ? : %s", cVar.j0().e0(), bool);
        } else if (!cVar.g0().equals(c.EnumC0372c.EXPERIMENTAL_PAYLOAD)) {
            return;
        } else {
            format = String.format("Already impressed experiment %s ? : %s", cVar.e0().e0(), bool);
        }
        l2.c(format);
    }

    private boolean x0(String str) {
        return this.f32625k.a() ? Q(str) : this.f32625k.b();
    }

    private static <T> dj.j<T> y0(Task<T> task, @dc.b Executor executor) {
        return dj.j.b(new dj.m() { // from class: zd.f1

            /* renamed from: b */
            public final /* synthetic */ Executor f32588b;

            public /* synthetic */ f1(Executor executor2) {
                r2 = executor2;
            }

            @Override // dj.m
            public final void a(dj.k kVar) {
                i2.v0(Task.this, r2, kVar);
            }
        });
    }

    /* renamed from: z0 */
    public dj.j<de.o> s0(of.c cVar, String str) {
        String d02;
        String e02;
        if (cVar.g0().equals(c.EnumC0372c.VANILLA_PAYLOAD)) {
            d02 = cVar.j0().d0();
            e02 = cVar.j0().e0();
        } else {
            if (!cVar.g0().equals(c.EnumC0372c.EXPERIMENTAL_PAYLOAD)) {
                return dj.j.g();
            }
            d02 = cVar.e0().d0();
            e02 = cVar.e0().e0();
            if (!cVar.f0()) {
                this.f32626l.c(cVar.e0().h0());
            }
        }
        de.i c10 = de.k.c(cVar.b0(), d02, e02, cVar.f0(), cVar.d0());
        return c10.c().equals(MessageType.UNSUPPORTED) ? dj.j.g() : dj.j.n(new de.o(c10, str));
    }

    public dj.f<de.o> K() {
        return dj.f.v(this.f32615a, this.f32624j.d(), this.f32616b).g(new jj.d() { // from class: zd.y0
            @Override // jj.d
            public final void accept(Object obj) {
                i2.R((String) obj);
            }
        }).w(this.f32620f.a()).c(new jj.e() { // from class: zd.j1
            public /* synthetic */ j1() {
            }

            @Override // jj.e
            public final Object apply(Object obj) {
                im.a f02;
                f02 = i2.this.f0((String) obj);
                return f02;
            }
        }).w(this.f32620f.b());
    }
}
