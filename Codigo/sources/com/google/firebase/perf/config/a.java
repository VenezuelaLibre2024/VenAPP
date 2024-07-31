package com.google.firebase.perf.config;

import android.content.Context;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d */
    private static final re.a f12246d = re.a.e();

    /* renamed from: e */
    private static volatile a f12247e;

    /* renamed from: a */
    private final RemoteConfigManager f12248a;

    /* renamed from: b */
    private com.google.firebase.perf.util.f f12249b;

    /* renamed from: c */
    private x f12250c;

    public a(RemoteConfigManager remoteConfigManager, com.google.firebase.perf.util.f fVar, x xVar) {
        this.f12248a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f12249b = fVar == null ? new com.google.firebase.perf.util.f() : fVar;
        this.f12250c = xVar == null ? x.f() : xVar;
    }

    private boolean H(long j10) {
        return j10 >= 0;
    }

    private boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(oe.a.f22519b)) {
                return true;
            }
        }
        return false;
    }

    private boolean J(long j10) {
        return j10 >= 0;
    }

    private boolean L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private boolean M(long j10) {
        return j10 > 0;
    }

    private boolean N(long j10) {
        return j10 > 0;
    }

    private com.google.firebase.perf.util.g<Boolean> b(v<Boolean> vVar) {
        return this.f12250c.c(vVar.a());
    }

    private com.google.firebase.perf.util.g<Double> c(v<Double> vVar) {
        return this.f12250c.d(vVar.a());
    }

    private com.google.firebase.perf.util.g<Long> d(v<Long> vVar) {
        return this.f12250c.g(vVar.a());
    }

    private com.google.firebase.perf.util.g<String> e(v<String> vVar) {
        return this.f12250c.h(vVar.a());
    }

    public static synchronized a g() {
        a aVar;
        synchronized (a.class) {
            if (f12247e == null) {
                f12247e = new a(null, null, null);
            }
            aVar = f12247e;
        }
        return aVar;
    }

    private boolean k() {
        Boolean d10;
        l e10 = l.e();
        com.google.firebase.perf.util.g<Boolean> u10 = u(e10);
        if (!u10.d()) {
            u10 = b(e10);
            if (!u10.d()) {
                d10 = e10.d();
                return d10.booleanValue();
            }
        } else {
            if (this.f12248a.isLastFetchFailed()) {
                return false;
            }
            this.f12250c.n(e10.a(), u10.c().booleanValue());
        }
        d10 = u10.c();
        return d10.booleanValue();
    }

    private boolean l() {
        String d10;
        k e10 = k.e();
        com.google.firebase.perf.util.g<String> x10 = x(e10);
        if (x10.d()) {
            this.f12250c.m(e10.a(), x10.c());
        } else {
            x10 = e(e10);
            if (!x10.d()) {
                d10 = e10.d();
                return I(d10);
            }
        }
        d10 = x10.c();
        return I(d10);
    }

    private com.google.firebase.perf.util.g<Boolean> n(v<Boolean> vVar) {
        return this.f12249b.b(vVar.b());
    }

    private com.google.firebase.perf.util.g<Double> o(v<Double> vVar) {
        return this.f12249b.c(vVar.b());
    }

    private com.google.firebase.perf.util.g<Long> p(v<Long> vVar) {
        return this.f12249b.e(vVar.b());
    }

    private com.google.firebase.perf.util.g<Boolean> u(v<Boolean> vVar) {
        return this.f12248a.getBoolean(vVar.c());
    }

    private com.google.firebase.perf.util.g<Double> v(v<Double> vVar) {
        return this.f12248a.getDouble(vVar.c());
    }

    private com.google.firebase.perf.util.g<Long> w(v<Long> vVar) {
        return this.f12248a.getLong(vVar.c());
    }

    private com.google.firebase.perf.util.g<String> x(v<String> vVar) {
        return this.f12248a.getString(vVar.c());
    }

    public long A() {
        Long d10;
        o e10 = o.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (!p10.d() || !M(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && M(p10.c().longValue())) {
                this.f12250c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !M(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }

    public long B() {
        Long d10;
        p e10 = p.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f12250c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }

    public long C() {
        Long e10;
        q f10 = q.f();
        com.google.firebase.perf.util.g<Long> p10 = p(f10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(f10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f12250c.l(f10.a(), p10.c().longValue());
            } else {
                p10 = d(f10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    e10 = this.f12248a.isLastFetchFailed() ? f10.e() : f10.d();
                    return e10.longValue();
                }
            }
        }
        e10 = p10.c();
        return e10.longValue();
    }

    public double D() {
        Double e10;
        r f10 = r.f();
        com.google.firebase.perf.util.g<Double> o10 = o(f10);
        if (o10.d()) {
            double doubleValue = o10.c().doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        com.google.firebase.perf.util.g<Double> v10 = v(f10);
        if (v10.d() && L(v10.c().doubleValue())) {
            this.f12250c.k(f10.a(), v10.c().doubleValue());
        } else {
            v10 = c(f10);
            if (!v10.d() || !L(v10.c().doubleValue())) {
                e10 = this.f12248a.isLastFetchFailed() ? f10.e() : f10.d();
                return e10.doubleValue();
            }
        }
        e10 = v10.c();
        return e10.doubleValue();
    }

    public long E() {
        Long d10;
        s e10 = s.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f12250c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public long F() {
        Long d10;
        t e10 = t.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f12250c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public double G() {
        Double e10;
        u f10 = u.f();
        com.google.firebase.perf.util.g<Double> v10 = v(f10);
        if (v10.d() && L(v10.c().doubleValue())) {
            this.f12250c.k(f10.a(), v10.c().doubleValue());
        } else {
            v10 = c(f10);
            if (!v10.d() || !L(v10.c().doubleValue())) {
                e10 = this.f12248a.isLastFetchFailed() ? f10.e() : f10.d();
                return e10.doubleValue();
            }
        }
        e10 = v10.c();
        return e10.doubleValue();
    }

    public boolean K() {
        Boolean j10 = j();
        return (j10 == null || j10.booleanValue()) && m();
    }

    public void O(Context context) {
        f12246d.i(com.google.firebase.perf.util.o.b(context));
        this.f12250c.j(context);
    }

    public void P(Boolean bool) {
        String a10;
        if (i().booleanValue() || (a10 = c.d().a()) == null) {
            return;
        }
        if (bool != null) {
            this.f12250c.n(a10, Boolean.TRUE.equals(bool));
        } else {
            this.f12250c.b(a10);
        }
    }

    public void Q(com.google.firebase.perf.util.f fVar) {
        this.f12249b = fVar;
    }

    public String a() {
        String f10;
        f e10 = f.e();
        if (oe.a.f22518a.booleanValue()) {
            return e10.d();
        }
        String c10 = e10.c();
        long longValue = c10 != null ? ((Long) this.f12248a.getRemoteConfigValueOrDefault(c10, -1L)).longValue() : -1L;
        String a10 = e10.a();
        if (!f.g(longValue) || (f10 = f.f(longValue)) == null) {
            com.google.firebase.perf.util.g<String> e11 = e(e10);
            return e11.d() ? e11.c() : e10.d();
        }
        this.f12250c.m(a10, f10);
        return f10;
    }

    public double f() {
        Double d10;
        e e10 = e.e();
        com.google.firebase.perf.util.g<Double> o10 = o(e10);
        if (o10.d()) {
            double doubleValue = o10.c().doubleValue() / 100.0d;
            if (L(doubleValue)) {
                return doubleValue;
            }
        }
        com.google.firebase.perf.util.g<Double> v10 = v(e10);
        if (v10.d() && L(v10.c().doubleValue())) {
            this.f12250c.k(e10.a(), v10.c().doubleValue());
        } else {
            v10 = c(e10);
            if (!v10.d() || !L(v10.c().doubleValue())) {
                d10 = e10.d();
                return d10.doubleValue();
            }
        }
        d10 = v10.c();
        return d10.doubleValue();
    }

    public boolean h() {
        Boolean d10;
        d e10 = d.e();
        com.google.firebase.perf.util.g<Boolean> n10 = n(e10);
        if (!n10.d()) {
            n10 = u(e10);
            if (n10.d()) {
                this.f12250c.n(e10.a(), n10.c().booleanValue());
            } else {
                n10 = b(e10);
                if (!n10.d()) {
                    d10 = e10.d();
                    return d10.booleanValue();
                }
            }
        }
        d10 = n10.c();
        return d10.booleanValue();
    }

    public Boolean i() {
        b e10 = b.e();
        com.google.firebase.perf.util.g<Boolean> n10 = n(e10);
        return n10.d() ? n10.c() : e10.d();
    }

    public Boolean j() {
        Boolean c10;
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c d10 = c.d();
        com.google.firebase.perf.util.g<Boolean> b10 = b(d10);
        if (b10.d()) {
            c10 = b10.c();
        } else {
            com.google.firebase.perf.util.g<Boolean> n10 = n(d10);
            if (!n10.d()) {
                return null;
            }
            c10 = n10.c();
        }
        return c10;
    }

    public boolean m() {
        return k() && !l();
    }

    public long q() {
        Long d10;
        g e10 = g.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f12250c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public long r() {
        Long d10;
        h e10 = h.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && H(w10.c().longValue())) {
            this.f12250c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !H(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public double s() {
        Double e10;
        i f10 = i.f();
        com.google.firebase.perf.util.g<Double> v10 = v(f10);
        if (v10.d() && L(v10.c().doubleValue())) {
            this.f12250c.k(f10.a(), v10.c().doubleValue());
        } else {
            v10 = c(f10);
            if (!v10.d() || !L(v10.c().doubleValue())) {
                e10 = this.f12248a.isLastFetchFailed() ? f10.e() : f10.d();
                return e10.doubleValue();
            }
        }
        e10 = v10.c();
        return e10.doubleValue();
    }

    public long t() {
        Long d10;
        j e10 = j.e();
        com.google.firebase.perf.util.g<Long> w10 = w(e10);
        if (w10.d() && N(w10.c().longValue())) {
            this.f12250c.l(e10.a(), w10.c().longValue());
        } else {
            w10 = d(e10);
            if (!w10.d() || !N(w10.c().longValue())) {
                d10 = e10.d();
                return d10.longValue();
            }
        }
        d10 = w10.c();
        return d10.longValue();
    }

    public long y() {
        Long d10;
        m e10 = m.e();
        com.google.firebase.perf.util.g<Long> p10 = p(e10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(e10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f12250c.l(e10.a(), p10.c().longValue());
            } else {
                p10 = d(e10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    d10 = e10.d();
                    return d10.longValue();
                }
            }
        }
        d10 = p10.c();
        return d10.longValue();
    }

    public long z() {
        Long e10;
        n f10 = n.f();
        com.google.firebase.perf.util.g<Long> p10 = p(f10);
        if (!p10.d() || !J(p10.c().longValue())) {
            p10 = w(f10);
            if (p10.d() && J(p10.c().longValue())) {
                this.f12250c.l(f10.a(), p10.c().longValue());
            } else {
                p10 = d(f10);
                if (!p10.d() || !J(p10.c().longValue())) {
                    e10 = this.f12248a.isLastFetchFailed() ? f10.e() : f10.d();
                    return e10.longValue();
                }
            }
        }
        e10 = p10.c();
        return e10.longValue();
    }
}
