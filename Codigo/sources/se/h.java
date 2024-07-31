package se;

import com.facebook.ads.AdError;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import we.k;
import xe.h;

/* loaded from: classes.dex */
public final class h extends com.google.firebase.perf.application.b implements ve.b {

    /* renamed from: t */
    private static final re.a f25586t = re.a.e();

    /* renamed from: a */
    private final List<ve.a> f25587a;

    /* renamed from: b */
    private final GaugeManager f25588b;

    /* renamed from: c */
    private final k f25589c;

    /* renamed from: d */
    private final h.b f25590d;

    /* renamed from: e */
    private final WeakReference<ve.b> f25591e;

    /* renamed from: f */
    private String f25592f;

    /* renamed from: r */
    private boolean f25593r;

    /* renamed from: s */
    private boolean f25594s;

    private h(k kVar) {
        this(kVar, com.google.firebase.perf.application.a.b(), GaugeManager.getInstance());
    }

    public h(k kVar, com.google.firebase.perf.application.a aVar, GaugeManager gaugeManager) {
        super(aVar);
        this.f25590d = xe.h.P0();
        this.f25591e = new WeakReference<>(this);
        this.f25589c = kVar;
        this.f25588b = gaugeManager;
        this.f25587a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static h c(k kVar) {
        return new h(kVar);
    }

    private boolean h() {
        return this.f25590d.N();
    }

    private boolean i() {
        return this.f25590d.P();
    }

    private static boolean j(String str) {
        if (str.length() > 128) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt <= 31 || charAt > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // ve.b
    public void a(ve.a aVar) {
        if (aVar == null) {
            f25586t.j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!h() || i()) {
                return;
            }
            this.f25587a.add(aVar);
        }
    }

    public xe.h b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f25591e);
        unregisterForAppState();
        xe.k[] b10 = ve.a.b(d());
        if (b10 != null) {
            this.f25590d.I(Arrays.asList(b10));
        }
        xe.h build = this.f25590d.build();
        if (!ue.d.c(this.f25592f)) {
            f25586t.a("Dropping network request from a 'User-Agent' that is not allowed");
            return build;
        }
        if (this.f25593r) {
            if (this.f25594s) {
                f25586t.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return build;
        }
        this.f25589c.B(build, getAppState());
        this.f25593r = true;
        return build;
    }

    List<ve.a> d() {
        List<ve.a> unmodifiableList;
        synchronized (this.f25587a) {
            ArrayList arrayList = new ArrayList();
            for (ve.a aVar : this.f25587a) {
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    public long e() {
        return this.f25590d.L();
    }

    public String f() {
        return this.f25590d.M();
    }

    public boolean g() {
        return this.f25590d.O();
    }

    public h k(Map<String, String> map) {
        this.f25590d.J().R(map);
        return this;
    }

    public h l(String str) {
        h.d dVar;
        if (str != null) {
            h.d dVar2 = h.d.HTTP_METHOD_UNKNOWN;
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    dVar = h.d.OPTIONS;
                    break;
                case 1:
                    dVar = h.d.GET;
                    break;
                case 2:
                    dVar = h.d.PUT;
                    break;
                case 3:
                    dVar = h.d.HEAD;
                    break;
                case 4:
                    dVar = h.d.POST;
                    break;
                case 5:
                    dVar = h.d.PATCH;
                    break;
                case 6:
                    dVar = h.d.TRACE;
                    break;
                case 7:
                    dVar = h.d.CONNECT;
                    break;
                case '\b':
                    dVar = h.d.DELETE;
                    break;
                default:
                    dVar = h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f25590d.T(dVar);
        }
        return this;
    }

    public h m(int i10) {
        this.f25590d.U(i10);
        return this;
    }

    public void n() {
        this.f25594s = true;
    }

    public h o() {
        this.f25590d.V(h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    public h p(long j10) {
        this.f25590d.W(j10);
        return this;
    }

    public h r(long j10) {
        ve.a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f25591e);
        this.f25590d.S(j10);
        a(perfSession);
        if (perfSession.e()) {
            this.f25588b.collectGaugeMetricOnce(perfSession.d());
        }
        return this;
    }

    public h s(String str) {
        if (str == null) {
            this.f25590d.K();
            return this;
        }
        if (j(str)) {
            this.f25590d.X(str);
        } else {
            f25586t.j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    public h t(long j10) {
        this.f25590d.Y(j10);
        return this;
    }

    public h u(long j10) {
        this.f25590d.Z(j10);
        return this;
    }

    public h v(long j10) {
        this.f25590d.b0(j10);
        if (SessionManager.getInstance().perfSession().e()) {
            this.f25588b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().d());
        }
        return this;
    }

    public h w(long j10) {
        this.f25590d.d0(j10);
        return this;
    }

    public h x(String str) {
        if (str != null) {
            this.f25590d.e0(o.e(o.d(str), AdError.SERVER_ERROR_CODE));
        }
        return this;
    }

    public h y(String str) {
        this.f25592f = str;
        return this;
    }
}
