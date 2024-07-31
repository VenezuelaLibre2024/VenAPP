package p140he;

import p140he.C7714a;
import p140he.C7716c;

/* renamed from: he.d */
/* loaded from: classes.dex */
public abstract class AbstractC7717d {

    /* renamed from: a */
    public static AbstractC7717d f18383a = m23526a().mo23505a();

    /* renamed from: he.d$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC7717d mo23505a();

        /* renamed from: b */
        public abstract a mo23506b(String str);

        /* renamed from: c */
        public abstract a mo23507c(long j10);

        /* renamed from: d */
        public abstract a mo23508d(String str);

        /* renamed from: e */
        public abstract a mo23509e(String str);

        /* renamed from: f */
        public abstract a mo23510f(String str);

        /* renamed from: g */
        public abstract a mo23511g(C7716c.a aVar);

        /* renamed from: h */
        public abstract a mo23512h(long j10);
    }

    /* renamed from: a */
    public static a m23526a() {
        return new C7714a.b().mo23512h(0L).mo23511g(C7716c.a.ATTEMPT_MIGRATION).mo23507c(0L);
    }

    /* renamed from: b */
    public abstract String mo23497b();

    /* renamed from: c */
    public abstract long mo23498c();

    /* renamed from: d */
    public abstract String mo23499d();

    /* renamed from: e */
    public abstract String mo23500e();

    /* renamed from: f */
    public abstract String mo23501f();

    /* renamed from: g */
    public abstract C7716c.a mo23502g();

    /* renamed from: h */
    public abstract long mo23503h();

    /* renamed from: i */
    public boolean m23527i() {
        return mo23502g() == C7716c.a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m23528j() {
        return mo23502g() == C7716c.a.NOT_GENERATED || mo23502g() == C7716c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m23529k() {
        return mo23502g() == C7716c.a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m23530l() {
        return mo23502g() == C7716c.a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m23531m() {
        return mo23502g() == C7716c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract a mo23504n();

    /* renamed from: o */
    public AbstractC7717d m23532o(String str, long j10, long j11) {
        return mo23504n().mo23506b(str).mo23507c(j10).mo23512h(j11).mo23505a();
    }

    /* renamed from: p */
    public AbstractC7717d m23533p() {
        return mo23504n().mo23506b(null).mo23505a();
    }

    /* renamed from: q */
    public AbstractC7717d m23534q(String str) {
        return mo23504n().mo23509e(str).mo23511g(C7716c.a.REGISTER_ERROR).mo23505a();
    }

    /* renamed from: r */
    public AbstractC7717d m23535r() {
        return mo23504n().mo23511g(C7716c.a.NOT_GENERATED).mo23505a();
    }

    /* renamed from: s */
    public AbstractC7717d m23536s(String str, String str2, long j10, String str3, long j11) {
        return mo23504n().mo23508d(str).mo23511g(C7716c.a.REGISTERED).mo23506b(str3).mo23510f(str2).mo23507c(j11).mo23512h(j10).mo23505a();
    }

    /* renamed from: t */
    public AbstractC7717d m23537t(String str) {
        return mo23504n().mo23508d(str).mo23511g(C7716c.a.UNREGISTERED).mo23505a();
    }
}
