package se;

import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.util.C6338l;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p367te.AbstractC11251e;
import p422we.C12178k;
import re.C10696a;

/* renamed from: se.g */
/* loaded from: classes.dex */
public class C10908g {

    /* renamed from: f */
    private static final C10696a f27724f = C10696a.m32565e();

    /* renamed from: a */
    private final C10909h f27725a;

    /* renamed from: b */
    private final C6338l f27726b;

    /* renamed from: e */
    private boolean f27729e;

    /* renamed from: d */
    private boolean f27728d = false;

    /* renamed from: c */
    private final Map<String, String> f27727c = new ConcurrentHashMap();

    public C10908g(String str, String str2, C12178k c12178k, C6338l c6338l) {
        this.f27729e = false;
        this.f27726b = c6338l;
        C10909h m33300l = C10909h.m33290c(c12178k).m33311x(str).m33300l(str2);
        this.f27725a = m33300l;
        m33300l.m33302n();
        if (C6277a.m17265g().m17282K()) {
            return;
        }
        f27724f.m32571g("HttpMetric feature is disabled. URL %s", str);
        this.f27729e = true;
    }

    /* renamed from: a */
    private void m33282a(String str, String str2) {
        if (this.f27728d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (!this.f27727c.containsKey(str) && this.f27727c.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        AbstractC11251e.m35160d(str, str2);
    }

    /* renamed from: b */
    public void m33283b(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            m33282a(str, str2);
            f27724f.m32567b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f27725a.m33297f());
            z10 = true;
        } catch (Exception e10) {
            f27724f.m32569d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f27727c.put(str, str2);
        }
    }

    /* renamed from: c */
    public void m33284c(int i10) {
        this.f27725a.m33301m(i10);
    }

    /* renamed from: d */
    public void m33285d(long j10) {
        this.f27725a.m33304p(j10);
    }

    /* renamed from: e */
    public void m33286e(String str) {
        this.f27725a.m33306s(str);
    }

    /* renamed from: f */
    public void m33287f(long j10) {
        this.f27725a.m33307t(j10);
    }

    /* renamed from: g */
    public void m33288g() {
        this.f27726b.m17535g();
        this.f27725a.m33305r(this.f27726b.m17534e());
    }

    /* renamed from: h */
    public void m33289h() {
        if (this.f27729e) {
            return;
        }
        this.f27725a.m33309v(this.f27726b.m17532c()).m33299k(this.f27727c).m33294b();
        this.f27728d = true;
    }
}
