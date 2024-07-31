package te;

import android.content.Context;
import com.google.firebase.perf.util.m;
import java.net.URI;
import xe.h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    private static final re.a f26879c = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final h f26880a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f26881b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(h hVar, Context context) {
        this.f26881b = context;
        this.f26880a = hVar;
    }

    private URI g(String str) {
        if (str == null) {
            return null;
        }
        try {
            return URI.create(str);
        } catch (IllegalArgumentException | IllegalStateException e10) {
            f26879c.k("getResultUrl throws exception %s", e10.getMessage());
            return null;
        }
    }

    private boolean h(URI uri, Context context) {
        if (uri == null) {
            return false;
        }
        return m.a(uri, context);
    }

    private boolean i(String str) {
        if (str == null) {
            return true;
        }
        return str.trim().isEmpty();
    }

    private boolean j(String str) {
        return i(str);
    }

    private boolean k(String str) {
        return (str == null || i(str) || str.length() > 255) ? false : true;
    }

    private boolean m(int i10) {
        return i10 > 0;
    }

    private boolean n(long j10) {
        return j10 >= 0;
    }

    private boolean o(int i10) {
        return i10 == -1 || i10 > 0;
    }

    private boolean p(String str) {
        if (str == null) {
            return false;
        }
        return "http".equalsIgnoreCase(str) || "https".equalsIgnoreCase(str);
    }

    private boolean q(long j10) {
        return j10 >= 0;
    }

    private boolean r(String str) {
        return str == null;
    }

    @Override // te.e
    public boolean c() {
        if (j(this.f26880a.F0())) {
            f26879c.j("URL is missing:" + this.f26880a.F0());
            return false;
        }
        URI g10 = g(this.f26880a.F0());
        if (g10 == null) {
            f26879c.j("URL cannot be parsed");
            return false;
        }
        if (!h(g10, this.f26881b)) {
            f26879c.j("URL fails allowlist rule: " + g10);
            return false;
        }
        if (!k(g10.getHost())) {
            f26879c.j("URL host is null or invalid");
            return false;
        }
        if (!p(g10.getScheme())) {
            f26879c.j("URL scheme is null or invalid");
            return false;
        }
        if (!r(g10.getUserInfo())) {
            f26879c.j("URL user info is null");
            return false;
        }
        if (!o(g10.getPort())) {
            f26879c.j("URL port is less than or equal to 0");
            return false;
        }
        if (!l(this.f26880a.H0() ? this.f26880a.v0() : null)) {
            f26879c.j("HTTP Method is null or invalid: " + this.f26880a.v0());
            return false;
        }
        if (this.f26880a.I0() && !m(this.f26880a.w0())) {
            f26879c.j("HTTP ResponseCode is a negative value:" + this.f26880a.w0());
            return false;
        }
        if (this.f26880a.J0() && !n(this.f26880a.z0())) {
            f26879c.j("Request Payload is a negative value:" + this.f26880a.z0());
            return false;
        }
        if (this.f26880a.K0() && !n(this.f26880a.B0())) {
            f26879c.j("Response Payload is a negative value:" + this.f26880a.B0());
            return false;
        }
        if (!this.f26880a.G0() || this.f26880a.t0() <= 0) {
            f26879c.j("Start time of the request is null, or zero, or a negative value:" + this.f26880a.t0());
            return false;
        }
        if (this.f26880a.L0() && !q(this.f26880a.C0())) {
            f26879c.j("Time to complete the request is a negative value:" + this.f26880a.C0());
            return false;
        }
        if (this.f26880a.N0() && !q(this.f26880a.E0())) {
            f26879c.j("Time from the start of the request to the start of the response is null or a negative value:" + this.f26880a.E0());
            return false;
        }
        if (this.f26880a.M0() && this.f26880a.D0() > 0) {
            if (this.f26880a.I0()) {
                return true;
            }
            f26879c.j("Did not receive a HTTP Response Code");
            return false;
        }
        f26879c.j("Time from the start of the request to the end of the response is null, negative or zero:" + this.f26880a.D0());
        return false;
    }

    boolean l(h.d dVar) {
        return (dVar == null || dVar == h.d.HTTP_METHOD_UNKNOWN) ? false : true;
    }
}
