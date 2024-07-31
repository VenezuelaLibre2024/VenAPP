package se;

import com.facebook.ads.AdError;
import com.google.firebase.perf.application.AbstractC6274b;
import com.google.firebase.perf.application.C6273a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.C6341o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p383ue.C11551d;
import p422we.C12178k;
import p444xe.C12475h;
import p444xe.C12478k;
import re.C10696a;
import ve.C11882a;
import ve.InterfaceC11883b;

/* renamed from: se.h */
/* loaded from: classes.dex */
public final class C10909h extends AbstractC6274b implements InterfaceC11883b {

    /* renamed from: t */
    private static final C10696a f27730t = C10696a.m32565e();

    /* renamed from: a */
    private final List<C11882a> f27731a;

    /* renamed from: b */
    private final GaugeManager f27732b;

    /* renamed from: c */
    private final C12178k f27733c;

    /* renamed from: d */
    private final C12475h.b f27734d;

    /* renamed from: e */
    private final WeakReference<InterfaceC11883b> f27735e;

    /* renamed from: f */
    private String f27736f;

    /* renamed from: r */
    private boolean f27737r;

    /* renamed from: s */
    private boolean f27738s;

    private C10909h(C12178k c12178k) {
        this(c12178k, C6273a.m17226b(), GaugeManager.getInstance());
    }

    public C10909h(C12178k c12178k, C6273a c6273a, GaugeManager gaugeManager) {
        super(c6273a);
        this.f27734d = C12475h.m40585P0();
        this.f27735e = new WeakReference<>(this);
        this.f27733c = c12178k;
        this.f27732b = gaugeManager;
        this.f27731a = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    /* renamed from: c */
    public static C10909h m33290c(C12178k c12178k) {
        return new C10909h(c12178k);
    }

    /* renamed from: h */
    private boolean m33291h() {
        return this.f27734d.m40641N();
    }

    /* renamed from: i */
    private boolean m33292i() {
        return this.f27734d.m40643P();
    }

    /* renamed from: j */
    private static boolean m33293j(String str) {
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

    @Override // ve.InterfaceC11883b
    /* renamed from: a */
    public void mo17386a(C11882a c11882a) {
        if (c11882a == null) {
            f27730t.m32574j("Unable to add new SessionId to the Network Trace. Continuing without it.");
        } else {
            if (!m33291h() || m33292i()) {
                return;
            }
            this.f27731a.add(c11882a);
        }
    }

    /* renamed from: b */
    public C12475h m33294b() {
        SessionManager.getInstance().unregisterForSessionUpdates(this.f27735e);
        unregisterForAppState();
        C12478k[] m38000b = C11882a.m38000b(m33295d());
        if (m38000b != null) {
            this.f27734d.m40636I(Arrays.asList(m38000b));
        }
        C12475h build = this.f27734d.build();
        if (!C11551d.m36205c(this.f27736f)) {
            f27730t.m32566a("Dropping network request from a 'User-Agent' that is not allowed");
            return build;
        }
        if (this.f27737r) {
            if (this.f27738s) {
                f27730t.m32566a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
            }
            return build;
        }
        this.f27733c.m39093B(build, getAppState());
        this.f27737r = true;
        return build;
    }

    /* renamed from: d */
    List<C11882a> m33295d() {
        List<C11882a> unmodifiableList;
        synchronized (this.f27731a) {
            ArrayList arrayList = new ArrayList();
            for (C11882a c11882a : this.f27731a) {
                if (c11882a != null) {
                    arrayList.add(c11882a);
                }
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return unmodifiableList;
    }

    /* renamed from: e */
    public long m33296e() {
        return this.f27734d.m40639L();
    }

    /* renamed from: f */
    public String m33297f() {
        return this.f27734d.m40640M();
    }

    /* renamed from: g */
    public boolean m33298g() {
        return this.f27734d.m40642O();
    }

    /* renamed from: k */
    public C10909h m33299k(Map<String, String> map) {
        this.f27734d.m40637J().m40644R(map);
        return this;
    }

    /* renamed from: l */
    public C10909h m33300l(String str) {
        C12475h.d dVar;
        if (str != null) {
            C12475h.d dVar2 = C12475h.d.HTTP_METHOD_UNKNOWN;
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
                    dVar = C12475h.d.OPTIONS;
                    break;
                case 1:
                    dVar = C12475h.d.GET;
                    break;
                case 2:
                    dVar = C12475h.d.PUT;
                    break;
                case 3:
                    dVar = C12475h.d.HEAD;
                    break;
                case 4:
                    dVar = C12475h.d.POST;
                    break;
                case 5:
                    dVar = C12475h.d.PATCH;
                    break;
                case 6:
                    dVar = C12475h.d.TRACE;
                    break;
                case 7:
                    dVar = C12475h.d.CONNECT;
                    break;
                case '\b':
                    dVar = C12475h.d.DELETE;
                    break;
                default:
                    dVar = C12475h.d.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f27734d.m40646T(dVar);
        }
        return this;
    }

    /* renamed from: m */
    public C10909h m33301m(int i10) {
        this.f27734d.m40647U(i10);
        return this;
    }

    /* renamed from: n */
    public void m33302n() {
        this.f27738s = true;
    }

    /* renamed from: o */
    public C10909h m33303o() {
        this.f27734d.m40648V(C12475h.e.GENERIC_CLIENT_ERROR);
        return this;
    }

    /* renamed from: p */
    public C10909h m33304p(long j10) {
        this.f27734d.m40649W(j10);
        return this;
    }

    /* renamed from: r */
    public C10909h m33305r(long j10) {
        C11882a perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f27735e);
        this.f27734d.m40645S(j10);
        mo17386a(perfSession);
        if (perfSession.m38005e()) {
            this.f27732b.collectGaugeMetricOnce(perfSession.m38004d());
        }
        return this;
    }

    /* renamed from: s */
    public C10909h m33306s(String str) {
        if (str == null) {
            this.f27734d.m40638K();
            return this;
        }
        if (m33293j(str)) {
            this.f27734d.m40650X(str);
        } else {
            f27730t.m32574j("The content type of the response is not a valid content-type:" + str);
        }
        return this;
    }

    /* renamed from: t */
    public C10909h m33307t(long j10) {
        this.f27734d.m40651Y(j10);
        return this;
    }

    /* renamed from: u */
    public C10909h m33308u(long j10) {
        this.f27734d.m40652Z(j10);
        return this;
    }

    /* renamed from: v */
    public C10909h m33309v(long j10) {
        this.f27734d.m40653b0(j10);
        if (SessionManager.getInstance().perfSession().m38005e()) {
            this.f27732b.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().m38004d());
        }
        return this;
    }

    /* renamed from: w */
    public C10909h m33310w(long j10) {
        this.f27734d.m40654d0(j10);
        return this;
    }

    /* renamed from: x */
    public C10909h m33311x(String str) {
        if (str != null) {
            this.f27734d.m40655e0(C6341o.m17544e(C6341o.m17543d(str), AdError.SERVER_ERROR_CODE));
        }
        return this;
    }

    /* renamed from: y */
    public C10909h m33312y(String str) {
        this.f27736f = str;
        return this;
    }
}
