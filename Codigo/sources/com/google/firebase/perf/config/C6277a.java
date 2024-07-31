package com.google.firebase.perf.config;

import android.content.Context;
import com.google.firebase.perf.util.C6332f;
import com.google.firebase.perf.util.C6333g;
import com.google.firebase.perf.util.C6341o;
import p274oe.C9929a;
import re.C10696a;

/* renamed from: com.google.firebase.perf.config.a */
/* loaded from: classes.dex */
public class C6277a {

    /* renamed from: d */
    private static final C10696a f13465d = C10696a.m32565e();

    /* renamed from: e */
    private static volatile C6277a f13466e;

    /* renamed from: a */
    private final RemoteConfigManager f13467a;

    /* renamed from: b */
    private C6332f f13468b;

    /* renamed from: c */
    private C6300x f13469c;

    public C6277a(RemoteConfigManager remoteConfigManager, C6332f c6332f, C6300x c6300x) {
        this.f13467a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f13468b = c6332f == null ? new C6332f() : c6332f;
        this.f13469c = c6300x == null ? C6300x.m17349f() : c6300x;
    }

    /* renamed from: H */
    private boolean m17255H(long j10) {
        return j10 >= 0;
    }

    /* renamed from: I */
    private boolean m17256I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(C9929a.f24452b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    private boolean m17257J(long j10) {
        return j10 >= 0;
    }

    /* renamed from: L */
    private boolean m17258L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    /* renamed from: M */
    private boolean m17259M(long j10) {
        return j10 > 0;
    }

    /* renamed from: N */
    private boolean m17260N(long j10) {
        return j10 > 0;
    }

    /* renamed from: b */
    private C6333g<Boolean> m17261b(AbstractC6298v<Boolean> abstractC6298v) {
        return this.f13469c.m17352c(abstractC6298v.mo17302a());
    }

    /* renamed from: c */
    private C6333g<Double> m17262c(AbstractC6298v<Double> abstractC6298v) {
        return this.f13469c.m17353d(abstractC6298v.mo17302a());
    }

    /* renamed from: d */
    private C6333g<Long> m17263d(AbstractC6298v<Long> abstractC6298v) {
        return this.f13469c.m17354g(abstractC6298v.mo17302a());
    }

    /* renamed from: e */
    private C6333g<String> m17264e(AbstractC6298v<String> abstractC6298v) {
        return this.f13469c.m17355h(abstractC6298v.mo17302a());
    }

    /* renamed from: g */
    public static synchronized C6277a m17265g() {
        C6277a c6277a;
        synchronized (C6277a.class) {
            if (f13466e == null) {
                f13466e = new C6277a(null, null, null);
            }
            c6277a = f13466e;
        }
        return c6277a;
    }

    /* renamed from: k */
    private boolean m17266k() {
        Boolean m17324d;
        C6288l m17323e = C6288l.m17323e();
        C6333g<Boolean> m17271u = m17271u(m17323e);
        if (!m17271u.m17523d()) {
            m17271u = m17261b(m17323e);
            if (!m17271u.m17523d()) {
                m17324d = m17323e.m17324d();
                return m17324d.booleanValue();
            }
        } else {
            if (this.f13467a.isLastFetchFailed()) {
                return false;
            }
            this.f13469c.m17360n(m17323e.mo17302a(), m17271u.m17522c().booleanValue());
        }
        m17324d = m17271u.m17522c();
        return m17324d.booleanValue();
    }

    /* renamed from: l */
    private boolean m17267l() {
        String m17322d;
        C6287k m17321e = C6287k.m17321e();
        C6333g<String> m17274x = m17274x(m17321e);
        if (m17274x.m17523d()) {
            this.f13469c.m17359m(m17321e.mo17302a(), m17274x.m17522c());
        } else {
            m17274x = m17264e(m17321e);
            if (!m17274x.m17523d()) {
                m17322d = m17321e.m17322d();
                return m17256I(m17322d);
            }
        }
        m17322d = m17274x.m17522c();
        return m17256I(m17322d);
    }

    /* renamed from: n */
    private C6333g<Boolean> m17268n(AbstractC6298v<Boolean> abstractC6298v) {
        return this.f13468b.m17516b(abstractC6298v.mo17299b());
    }

    /* renamed from: o */
    private C6333g<Double> m17269o(AbstractC6298v<Double> abstractC6298v) {
        return this.f13468b.m17517c(abstractC6298v.mo17299b());
    }

    /* renamed from: p */
    private C6333g<Long> m17270p(AbstractC6298v<Long> abstractC6298v) {
        return this.f13468b.m17518e(abstractC6298v.mo17299b());
    }

    /* renamed from: u */
    private C6333g<Boolean> m17271u(AbstractC6298v<Boolean> abstractC6298v) {
        return this.f13467a.getBoolean(abstractC6298v.mo17304c());
    }

    /* renamed from: v */
    private C6333g<Double> m17272v(AbstractC6298v<Double> abstractC6298v) {
        return this.f13467a.getDouble(abstractC6298v.mo17304c());
    }

    /* renamed from: w */
    private C6333g<Long> m17273w(AbstractC6298v<Long> abstractC6298v) {
        return this.f13467a.getLong(abstractC6298v.mo17304c());
    }

    /* renamed from: x */
    private C6333g<String> m17274x(AbstractC6298v<String> abstractC6298v) {
        return this.f13467a.getString(abstractC6298v.mo17304c());
    }

    /* renamed from: A */
    public long m17275A() {
        Long m17331d;
        C6291o m17330e = C6291o.m17330e();
        C6333g<Long> m17270p = m17270p(m17330e);
        if (!m17270p.m17523d() || !m17259M(m17270p.m17522c().longValue())) {
            m17270p = m17273w(m17330e);
            if (m17270p.m17523d() && m17259M(m17270p.m17522c().longValue())) {
                this.f13469c.m17358l(m17330e.mo17302a(), m17270p.m17522c().longValue());
            } else {
                m17270p = m17263d(m17330e);
                if (!m17270p.m17523d() || !m17259M(m17270p.m17522c().longValue())) {
                    m17331d = m17330e.m17331d();
                    return m17331d.longValue();
                }
            }
        }
        m17331d = m17270p.m17522c();
        return m17331d.longValue();
    }

    /* renamed from: B */
    public long m17276B() {
        Long m17333d;
        C6292p m17332e = C6292p.m17332e();
        C6333g<Long> m17270p = m17270p(m17332e);
        if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
            m17270p = m17273w(m17332e);
            if (m17270p.m17523d() && m17257J(m17270p.m17522c().longValue())) {
                this.f13469c.m17358l(m17332e.mo17302a(), m17270p.m17522c().longValue());
            } else {
                m17270p = m17263d(m17332e);
                if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
                    m17333d = m17332e.m17333d();
                    return m17333d.longValue();
                }
            }
        }
        m17333d = m17270p.m17522c();
        return m17333d.longValue();
    }

    /* renamed from: C */
    public long m17277C() {
        Long m17336e;
        C6293q m17334f = C6293q.m17334f();
        C6333g<Long> m17270p = m17270p(m17334f);
        if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
            m17270p = m17273w(m17334f);
            if (m17270p.m17523d() && m17257J(m17270p.m17522c().longValue())) {
                this.f13469c.m17358l(m17334f.mo17302a(), m17270p.m17522c().longValue());
            } else {
                m17270p = m17263d(m17334f);
                if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
                    m17336e = this.f13467a.isLastFetchFailed() ? m17334f.m17336e() : m17334f.m17335d();
                    return m17336e.longValue();
                }
            }
        }
        m17336e = m17270p.m17522c();
        return m17336e.longValue();
    }

    /* renamed from: D */
    public double m17278D() {
        Double m17339e;
        C6294r m17337f = C6294r.m17337f();
        C6333g<Double> m17269o = m17269o(m17337f);
        if (m17269o.m17523d()) {
            double doubleValue = m17269o.m17522c().doubleValue() / 100.0d;
            if (m17258L(doubleValue)) {
                return doubleValue;
            }
        }
        C6333g<Double> m17272v = m17272v(m17337f);
        if (m17272v.m17523d() && m17258L(m17272v.m17522c().doubleValue())) {
            this.f13469c.m17357k(m17337f.mo17302a(), m17272v.m17522c().doubleValue());
        } else {
            m17272v = m17262c(m17337f);
            if (!m17272v.m17523d() || !m17258L(m17272v.m17522c().doubleValue())) {
                m17339e = this.f13467a.isLastFetchFailed() ? m17337f.m17339e() : m17337f.m17338d();
                return m17339e.doubleValue();
            }
        }
        m17339e = m17272v.m17522c();
        return m17339e.doubleValue();
    }

    /* renamed from: E */
    public long m17279E() {
        Long m17341d;
        C6295s m17340e = C6295s.m17340e();
        C6333g<Long> m17273w = m17273w(m17340e);
        if (m17273w.m17523d() && m17255H(m17273w.m17522c().longValue())) {
            this.f13469c.m17358l(m17340e.mo17302a(), m17273w.m17522c().longValue());
        } else {
            m17273w = m17263d(m17340e);
            if (!m17273w.m17523d() || !m17255H(m17273w.m17522c().longValue())) {
                m17341d = m17340e.m17341d();
                return m17341d.longValue();
            }
        }
        m17341d = m17273w.m17522c();
        return m17341d.longValue();
    }

    /* renamed from: F */
    public long m17280F() {
        Long m17343d;
        C6296t m17342e = C6296t.m17342e();
        C6333g<Long> m17273w = m17273w(m17342e);
        if (m17273w.m17523d() && m17255H(m17273w.m17522c().longValue())) {
            this.f13469c.m17358l(m17342e.mo17302a(), m17273w.m17522c().longValue());
        } else {
            m17273w = m17263d(m17342e);
            if (!m17273w.m17523d() || !m17255H(m17273w.m17522c().longValue())) {
                m17343d = m17342e.m17343d();
                return m17343d.longValue();
            }
        }
        m17343d = m17273w.m17522c();
        return m17343d.longValue();
    }

    /* renamed from: G */
    public double m17281G() {
        Double m17346e;
        C6297u m17344f = C6297u.m17344f();
        C6333g<Double> m17272v = m17272v(m17344f);
        if (m17272v.m17523d() && m17258L(m17272v.m17522c().doubleValue())) {
            this.f13469c.m17357k(m17344f.mo17302a(), m17272v.m17522c().doubleValue());
        } else {
            m17272v = m17262c(m17344f);
            if (!m17272v.m17523d() || !m17258L(m17272v.m17522c().doubleValue())) {
                m17346e = this.f13467a.isLastFetchFailed() ? m17344f.m17346e() : m17344f.m17345d();
                return m17346e.doubleValue();
            }
        }
        m17346e = m17272v.m17522c();
        return m17346e.doubleValue();
    }

    /* renamed from: K */
    public boolean m17282K() {
        Boolean m17290j = m17290j();
        return (m17290j == null || m17290j.booleanValue()) && m17291m();
    }

    /* renamed from: O */
    public void m17283O(Context context) {
        f13465d.m32573i(C6341o.m17541b(context));
        this.f13469c.m17356j(context);
    }

    /* renamed from: P */
    public void m17284P(Boolean bool) {
        String mo17302a;
        if (m17289i().booleanValue() || (mo17302a = C6279c.m17301d().mo17302a()) == null) {
            return;
        }
        if (bool != null) {
            this.f13469c.m17360n(mo17302a, Boolean.TRUE.equals(bool));
        } else {
            this.f13469c.m17351b(mo17302a);
        }
    }

    /* renamed from: Q */
    public void m17285Q(C6332f c6332f) {
        this.f13468b = c6332f;
    }

    /* renamed from: a */
    public String m17286a() {
        String m17309f;
        C6282f m17308e = C6282f.m17308e();
        if (C9929a.f24451a.booleanValue()) {
            return m17308e.m17311d();
        }
        String mo17304c = m17308e.mo17304c();
        long longValue = mo17304c != null ? ((Long) this.f13467a.getRemoteConfigValueOrDefault(mo17304c, -1L)).longValue() : -1L;
        String mo17302a = m17308e.mo17302a();
        if (!C6282f.m17310g(longValue) || (m17309f = C6282f.m17309f(longValue)) == null) {
            C6333g<String> m17264e = m17264e(m17308e);
            return m17264e.m17523d() ? m17264e.m17522c() : m17308e.m17311d();
        }
        this.f13469c.m17359m(mo17302a, m17309f);
        return m17309f;
    }

    /* renamed from: f */
    public double m17287f() {
        Double m17307d;
        C6281e m17306e = C6281e.m17306e();
        C6333g<Double> m17269o = m17269o(m17306e);
        if (m17269o.m17523d()) {
            double doubleValue = m17269o.m17522c().doubleValue() / 100.0d;
            if (m17258L(doubleValue)) {
                return doubleValue;
            }
        }
        C6333g<Double> m17272v = m17272v(m17306e);
        if (m17272v.m17523d() && m17258L(m17272v.m17522c().doubleValue())) {
            this.f13469c.m17357k(m17306e.mo17302a(), m17272v.m17522c().doubleValue());
        } else {
            m17272v = m17262c(m17306e);
            if (!m17272v.m17523d() || !m17258L(m17272v.m17522c().doubleValue())) {
                m17307d = m17306e.m17307d();
                return m17307d.doubleValue();
            }
        }
        m17307d = m17272v.m17522c();
        return m17307d.doubleValue();
    }

    /* renamed from: h */
    public boolean m17288h() {
        Boolean m17305d;
        C6280d m17303e = C6280d.m17303e();
        C6333g<Boolean> m17268n = m17268n(m17303e);
        if (!m17268n.m17523d()) {
            m17268n = m17271u(m17303e);
            if (m17268n.m17523d()) {
                this.f13469c.m17360n(m17303e.mo17302a(), m17268n.m17522c().booleanValue());
            } else {
                m17268n = m17261b(m17303e);
                if (!m17268n.m17523d()) {
                    m17305d = m17303e.m17305d();
                    return m17305d.booleanValue();
                }
            }
        }
        m17305d = m17268n.m17522c();
        return m17305d.booleanValue();
    }

    /* renamed from: i */
    public Boolean m17289i() {
        C6278b m17298e = C6278b.m17298e();
        C6333g<Boolean> m17268n = m17268n(m17298e);
        return m17268n.m17523d() ? m17268n.m17522c() : m17298e.m17300d();
    }

    /* renamed from: j */
    public Boolean m17290j() {
        Boolean m17522c;
        if (m17289i().booleanValue()) {
            return Boolean.FALSE;
        }
        C6279c m17301d = C6279c.m17301d();
        C6333g<Boolean> m17261b = m17261b(m17301d);
        if (m17261b.m17523d()) {
            m17522c = m17261b.m17522c();
        } else {
            C6333g<Boolean> m17268n = m17268n(m17301d);
            if (!m17268n.m17523d()) {
                return null;
            }
            m17522c = m17268n.m17522c();
        }
        return m17522c;
    }

    /* renamed from: m */
    public boolean m17291m() {
        return m17266k() && !m17267l();
    }

    /* renamed from: q */
    public long m17292q() {
        Long m17313d;
        C6283g m17312e = C6283g.m17312e();
        C6333g<Long> m17273w = m17273w(m17312e);
        if (m17273w.m17523d() && m17255H(m17273w.m17522c().longValue())) {
            this.f13469c.m17358l(m17312e.mo17302a(), m17273w.m17522c().longValue());
        } else {
            m17273w = m17263d(m17312e);
            if (!m17273w.m17523d() || !m17255H(m17273w.m17522c().longValue())) {
                m17313d = m17312e.m17313d();
                return m17313d.longValue();
            }
        }
        m17313d = m17273w.m17522c();
        return m17313d.longValue();
    }

    /* renamed from: r */
    public long m17293r() {
        Long m17315d;
        C6284h m17314e = C6284h.m17314e();
        C6333g<Long> m17273w = m17273w(m17314e);
        if (m17273w.m17523d() && m17255H(m17273w.m17522c().longValue())) {
            this.f13469c.m17358l(m17314e.mo17302a(), m17273w.m17522c().longValue());
        } else {
            m17273w = m17263d(m17314e);
            if (!m17273w.m17523d() || !m17255H(m17273w.m17522c().longValue())) {
                m17315d = m17314e.m17315d();
                return m17315d.longValue();
            }
        }
        m17315d = m17273w.m17522c();
        return m17315d.longValue();
    }

    /* renamed from: s */
    public double m17294s() {
        Double m17318e;
        C6285i m17316f = C6285i.m17316f();
        C6333g<Double> m17272v = m17272v(m17316f);
        if (m17272v.m17523d() && m17258L(m17272v.m17522c().doubleValue())) {
            this.f13469c.m17357k(m17316f.mo17302a(), m17272v.m17522c().doubleValue());
        } else {
            m17272v = m17262c(m17316f);
            if (!m17272v.m17523d() || !m17258L(m17272v.m17522c().doubleValue())) {
                m17318e = this.f13467a.isLastFetchFailed() ? m17316f.m17318e() : m17316f.m17317d();
                return m17318e.doubleValue();
            }
        }
        m17318e = m17272v.m17522c();
        return m17318e.doubleValue();
    }

    /* renamed from: t */
    public long m17295t() {
        Long m17320d;
        C6286j m17319e = C6286j.m17319e();
        C6333g<Long> m17273w = m17273w(m17319e);
        if (m17273w.m17523d() && m17260N(m17273w.m17522c().longValue())) {
            this.f13469c.m17358l(m17319e.mo17302a(), m17273w.m17522c().longValue());
        } else {
            m17273w = m17263d(m17319e);
            if (!m17273w.m17523d() || !m17260N(m17273w.m17522c().longValue())) {
                m17320d = m17319e.m17320d();
                return m17320d.longValue();
            }
        }
        m17320d = m17273w.m17522c();
        return m17320d.longValue();
    }

    /* renamed from: y */
    public long m17296y() {
        Long m17326d;
        C6289m m17325e = C6289m.m17325e();
        C6333g<Long> m17270p = m17270p(m17325e);
        if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
            m17270p = m17273w(m17325e);
            if (m17270p.m17523d() && m17257J(m17270p.m17522c().longValue())) {
                this.f13469c.m17358l(m17325e.mo17302a(), m17270p.m17522c().longValue());
            } else {
                m17270p = m17263d(m17325e);
                if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
                    m17326d = m17325e.m17326d();
                    return m17326d.longValue();
                }
            }
        }
        m17326d = m17270p.m17522c();
        return m17326d.longValue();
    }

    /* renamed from: z */
    public long m17297z() {
        Long m17329e;
        C6290n m17327f = C6290n.m17327f();
        C6333g<Long> m17270p = m17270p(m17327f);
        if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
            m17270p = m17273w(m17327f);
            if (m17270p.m17523d() && m17257J(m17270p.m17522c().longValue())) {
                this.f13469c.m17358l(m17327f.mo17302a(), m17270p.m17522c().longValue());
            } else {
                m17270p = m17263d(m17327f);
                if (!m17270p.m17523d() || !m17257J(m17270p.m17522c().longValue())) {
                    m17329e = this.f13467a.isLastFetchFailed() ? m17327f.m17329e() : m17327f.m17328d();
                    return m17329e.longValue();
                }
            }
        }
        m17329e = m17270p.m17522c();
        return m17329e.longValue();
    }
}
