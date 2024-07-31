package p367te;

import android.content.Context;
import com.google.firebase.perf.util.C6339m;
import java.net.URI;
import p444xe.C12475h;
import re.C10696a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: te.c */
/* loaded from: classes.dex */
public final class C11249c extends AbstractC11251e {

    /* renamed from: c */
    private static final C10696a f29175c = C10696a.m32565e();

    /* renamed from: a */
    private final C12475h f29176a;

    /* renamed from: b */
    private final Context f29177b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11249c(C12475h c12475h, Context context) {
        this.f29177b = context;
        this.f29176a = c12475h;
    }

    /* renamed from: g */
    private URI m35135g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f29175c.m32575k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    private boolean m35136h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return C6339m.m17538a(uri, context);
    }

    /* renamed from: i */
    private boolean m35137i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    /* renamed from: j */
    private boolean m35138j(String str) {
        return m35137i(str);
    }

    /* renamed from: k */
    private boolean m35139k(String str) {
        return (str == null || m35137i(str) || str.length() > 255) ? false : true;
    }

    /* renamed from: m */
    private boolean m35140m(int i10) {
        return i10 > 0;
    }

    /* renamed from: n */
    private boolean m35141n(long j10) {
        return j10 >= 0;
    }

    /* renamed from: o */
    private boolean m35142o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    /* renamed from: p */
    private boolean m35143p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    /* renamed from: q */
    private boolean m35144q(long j10) {
        return j10 >= 0;
    }

    /* renamed from: r */
    private boolean m35145r(String str) {
        return str == null;
    }

    @Override // p367te.AbstractC11251e
    /* renamed from: c */
    public boolean mo35134c() {
        if (m35138j(this.f29176a.m40622F0())) {
            f29175c.m32574j("URL is missing:" + this.f29176a.m40622F0());
            return false;
        }
        URI m35135g = m35135g(this.f29176a.m40622F0());
        if (m35135g == null) {
            f29175c.m32574j("URL cannot be parsed");
            return false;
        }
        if (!m35136h(m35135g, this.f29177b)) {
            f29175c.m32574j("URL fails allowlist rule: " + m35135g);
            return false;
        }
        if (!m35139k(m35135g.getHost())) {
            f29175c.m32574j("URL host is null or invalid");
            return false;
        }
        if (!m35143p(m35135g.getScheme())) {
            f29175c.m32574j("URL scheme is null or invalid");
            return false;
        }
        if (!m35145r(m35135g.getUserInfo())) {
            f29175c.m32574j("URL user info is null");
            return false;
        }
        if (!m35142o(m35135g.getPort())) {
            f29175c.m32574j("URL port is less than or equal to 0");
            return false;
        }
        if (!m35146l(this.f29176a.m40624H0() ? this.f29176a.m40632v0() : null)) {
            f29175c.m32574j("HTTP Method is null or invalid: " + this.f29176a.m40632v0());
            return false;
        }
        if (this.f29176a.m40625I0() && !m35140m(this.f29176a.m40633w0())) {
            f29175c.m32574j("HTTP ResponseCode is a negative value:" + this.f29176a.m40633w0());
            return false;
        }
        if (this.f29176a.m40626J0() && !m35141n(this.f29176a.m40635z0())) {
            f29175c.m32574j("Request Payload is a negative value:" + this.f29176a.m40635z0());
            return false;
        }
        if (this.f29176a.m40627K0() && !m35141n(this.f29176a.m40618B0())) {
            f29175c.m32574j("Response Payload is a negative value:" + this.f29176a.m40618B0());
            return false;
        }
        if (!this.f29176a.m40623G0() || this.f29176a.m40631t0() <= 0) {
            f29175c.m32574j("Start time of the request is null, or zero, or a negative value:" + this.f29176a.m40631t0());
            return false;
        }
        if (this.f29176a.m40628L0() && !m35144q(this.f29176a.m40619C0())) {
            f29175c.m32574j("Time to complete the request is a negative value:" + this.f29176a.m40619C0());
            return false;
        }
        if (this.f29176a.m40630N0() && !m35144q(this.f29176a.m40621E0())) {
            f29175c.m32574j("Time from the start of the request to the start of the response is null or a negative value:" + this.f29176a.m40621E0());
            return false;
        }
        if (this.f29176a.m40629M0() && this.f29176a.m40620D0() > 0) {
            if (this.f29176a.m40625I0()) {
                return true;
            }
            f29175c.m32574j("Did not receive a HTTP Response Code");
            return false;
        }
        f29175c.m32574j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f29176a.m40620D0());
        return false;
    }

    /* renamed from: l */
    boolean m35146l(C12475h.d dVar) {
        return (dVar == null || dVar == C12475h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
