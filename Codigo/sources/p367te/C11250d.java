package p367te;

import com.google.firebase.perf.util.EnumC6328b;
import java.util.Iterator;
import java.util.Map;
import p444xe.C12480m;
import re.C10696a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: te.d */
/* loaded from: classes.dex */
public final class C11250d extends AbstractC11251e {

    /* renamed from: b */
    private static final C10696a f29178b = C10696a.m32565e();

    /* renamed from: a */
    private final C12480m f29179a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11250d(C12480m c12480m) {
        this.f29179a = c12480m;
    }

    /* renamed from: g */
    private boolean m35147g(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                AbstractC11251e.m35160d(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e10) {
                f29178b.m32574j(e10.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private boolean m35148h(C12480m c12480m) {
        return m35149i(c12480m, 0);
    }

    /* renamed from: i */
    private boolean m35149i(C12480m c12480m, int i10) {
        C10696a c10696a;
        StringBuilder sb2;
        String sb3;
        if (c12480m == null) {
            return false;
        }
        if (i10 <= 1) {
            for (Map.Entry<String, Long> entry : c12480m.m40730t0().entrySet()) {
                if (!m35152l(entry.getKey())) {
                    c10696a = f29178b;
                    sb2 = new StringBuilder();
                    sb2.append("invalid CounterId:");
                    sb2.append(entry.getKey());
                } else if (!m35153m(entry.getValue())) {
                    c10696a = f29178b;
                    sb2 = new StringBuilder();
                    sb2.append("invalid CounterValue:");
                    sb2.append(entry.getValue());
                }
                sb3 = sb2.toString();
            }
            Iterator<C12480m> it = c12480m.m40726B0().iterator();
            while (it.hasNext()) {
                if (!m35149i(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return true;
        }
        c10696a = f29178b;
        sb3 = "Exceed MAX_SUBTRACE_DEEP:1";
        c10696a.m32574j(sb3);
        return false;
    }

    /* renamed from: j */
    private boolean m35150j(C12480m c12480m) {
        if (c12480m.m40729s0() > 0) {
            return true;
        }
        Iterator<C12480m> it = c12480m.m40726B0().iterator();
        while (it.hasNext()) {
            if (it.next().m40729s0() > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m35151k(C12480m c12480m) {
        return c12480m.m40733z0().startsWith("_st_");
    }

    /* renamed from: l */
    private boolean m35152l(String str) {
        C10696a c10696a;
        String str2;
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            c10696a = f29178b;
            str2 = "counterId is empty";
        } else {
            if (trim.length() <= 100) {
                return true;
            }
            c10696a = f29178b;
            str2 = "counterId exceeded max length 100";
        }
        c10696a.m32574j(str2);
        return false;
    }

    /* renamed from: m */
    private boolean m35153m(Long l10) {
        return l10 != null;
    }

    /* renamed from: n */
    private boolean m35154n(C12480m c12480m) {
        Long l10 = c12480m.m40730t0().get(EnumC6328b.FRAMES_TOTAL.toString());
        return l10 != null && l10.compareTo((Long) 0L) > 0;
    }

    /* renamed from: o */
    private boolean m35155o(C12480m c12480m, int i10) {
        if (c12480m == null) {
            f29178b.m32574j("TraceMetric is null");
            return false;
        }
        if (i10 > 1) {
            f29178b.m32574j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!m35157q(c12480m.m40733z0())) {
            f29178b.m32574j("invalid TraceId:" + c12480m.m40733z0());
            return false;
        }
        if (!m35156p(c12480m)) {
            f29178b.m32574j("invalid TraceDuration:" + c12480m.m40732w0());
            return false;
        }
        if (!c12480m.m40727C0()) {
            f29178b.m32574j("clientStartTimeUs is null.");
            return false;
        }
        if (!m35151k(c12480m) || m35154n(c12480m)) {
            Iterator<C12480m> it = c12480m.m40726B0().iterator();
            while (it.hasNext()) {
                if (!m35155o(it.next(), i10 + 1)) {
                    return false;
                }
            }
            return m35147g(c12480m.m40731u0());
        }
        f29178b.m32574j("non-positive totalFrames in screen trace " + c12480m.m40733z0());
        return false;
    }

    /* renamed from: p */
    private boolean m35156p(C12480m c12480m) {
        return c12480m != null && c12480m.m40732w0() > 0;
    }

    /* renamed from: q */
    private boolean m35157q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        return !trim.isEmpty() && trim.length() <= 100;
    }

    @Override // p367te.AbstractC11251e
    /* renamed from: c */
    public boolean mo35134c() {
        C10696a c10696a;
        StringBuilder sb2;
        String str;
        if (!m35155o(this.f29179a, 0)) {
            c10696a = f29178b;
            sb2 = new StringBuilder();
            str = "Invalid Trace:";
        } else {
            if (!m35150j(this.f29179a) || m35148h(this.f29179a)) {
                return true;
            }
            c10696a = f29178b;
            sb2 = new StringBuilder();
            str = "Invalid Counters for Trace:";
        }
        sb2.append(str);
        sb2.append(this.f29179a.m40733z0());
        c10696a.m32574j(sb2.toString());
        return false;
    }
}
