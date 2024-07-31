package se;

import com.google.firebase.perf.util.l;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import we.k;

/* loaded from: classes.dex */
public class g {

    /* renamed from: f */
    private static final re.a f25580f = re.a.e();

    /* renamed from: a */
    private final h f25581a;

    /* renamed from: b */
    private final l f25582b;

    /* renamed from: e */
    private boolean f25585e;

    /* renamed from: d */
    private boolean f25584d = false;

    /* renamed from: c */
    private final Map<String, String> f25583c = new ConcurrentHashMap();

    public g(String str, String str2, k kVar, l lVar) {
        this.f25585e = false;
        this.f25582b = lVar;
        h l10 = h.c(kVar).x(str).l(str2);
        this.f25581a = l10;
        l10.n();
        if (com.google.firebase.perf.config.a.g().K()) {
            return;
        }
        f25580f.g("HttpMetric feature is disabled. URL %s", str);
        this.f25585e = true;
    }

    private void a(String str, String str2) {
        if (this.f25584d) {
            throw new IllegalArgumentException("HttpMetric has been logged already so unable to modify attributes");
        }
        if (!this.f25583c.containsKey(str) && this.f25583c.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        te.e.d(str, str2);
    }

    public void b(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            a(str, str2);
            f25580f.b("Setting attribute '%s' to %s on network request '%s'", str, str2, this.f25581a.f());
            z10 = true;
        } catch (Exception e10) {
            f25580f.d("Cannot set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f25583c.put(str, str2);
        }
    }

    public void c(int i10) {
        this.f25581a.m(i10);
    }

    public void d(long j10) {
        this.f25581a.p(j10);
    }

    public void e(String str) {
        this.f25581a.s(str);
    }

    public void f(long j10) {
        this.f25581a.t(j10);
    }

    public void g() {
        this.f25582b.g();
        this.f25581a.r(this.f25582b.e());
    }

    public void h() {
        if (this.f25585e) {
            return;
        }
        this.f25581a.v(this.f25582b.c()).k(this.f25583c).b();
        this.f25584d = true;
    }
}
