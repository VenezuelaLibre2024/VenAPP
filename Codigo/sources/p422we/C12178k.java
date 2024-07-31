package p422we;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.application.C6273a;
import com.google.firebase.perf.config.C6277a;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.C6335i;
import com.google.firebase.perf.util.EnumC6328b;
import ee.InterfaceC7183b;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p098f6.InterfaceC7303g;
import p106fe.InterfaceC7337f;
import p274oe.C9929a;
import p274oe.C9933e;
import p367te.AbstractC11251e;
import p444xe.C12468a;
import p444xe.C12470c;
import p444xe.C12474g;
import p444xe.C12475h;
import p444xe.C12476i;
import p444xe.C12480m;
import p444xe.EnumC12471d;
import p444xe.InterfaceC12477j;
import p485zb.C12867g;
import re.C10696a;
import re.C10697b;

/* renamed from: we.k */
/* loaded from: classes.dex */
public class C12178k implements C6273a.b {

    /* renamed from: C */
    private static final C10696a f32435C = C10696a.m32565e();

    /* renamed from: D */
    private static final C12178k f32436D = new C12178k();

    /* renamed from: A */
    private String f32437A;

    /* renamed from: a */
    private final Map<String, Integer> f32439a;

    /* renamed from: d */
    private C12867g f32442d;

    /* renamed from: e */
    private C9933e f32443e;

    /* renamed from: f */
    private InterfaceC7337f f32444f;

    /* renamed from: r */
    private InterfaceC7183b<InterfaceC7303g> f32445r;

    /* renamed from: s */
    private C12169b f32446s;

    /* renamed from: u */
    private Context f32448u;

    /* renamed from: v */
    private C6277a f32449v;

    /* renamed from: w */
    private C12171d f32450w;

    /* renamed from: x */
    private C6273a f32451x;

    /* renamed from: y */
    private C12470c.b f32452y;

    /* renamed from: z */
    private String f32453z;

    /* renamed from: b */
    private final ConcurrentLinkedQueue<C12170c> f32440b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private final AtomicBoolean f32441c = new AtomicBoolean(false);

    /* renamed from: B */
    private boolean f32438B = false;

    /* renamed from: t */
    private ExecutorService f32447t = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private C12178k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f32439a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: D */
    private C12476i m39063D(C12476i.b bVar, EnumC12471d enumC12471d) {
        m39066G();
        C12470c.b m40533M = this.f32452y.m40533M(enumC12471d);
        if (bVar.mo40677m() || bVar.mo40675j()) {
            m40533M = m40533M.clone().m40530J(m39077j());
        }
        return bVar.m40680I(m40533M).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public void m39064E() {
        Context m42630m = this.f32442d.m42630m();
        this.f32448u = m42630m;
        this.f32453z = m42630m.getPackageName();
        this.f32449v = C6277a.m17265g();
        this.f32450w = new C12171d(this.f32448u, new C6335i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f32451x = C6273a.m17226b();
        this.f32446s = new C12169b(this.f32445r, this.f32449v.m17286a());
        m39075h();
    }

    /* renamed from: F */
    private void m39065F(C12476i.b bVar, EnumC12471d enumC12471d) {
        if (!m39096u()) {
            if (m39085s(bVar)) {
                f32435C.m32567b("Transport is not initialized yet, %s will be queued for to be dispatched later", m39081n(bVar));
                this.f32440b.add(new C12170c(bVar, enumC12471d));
                return;
            }
            return;
        }
        C12476i m39063D = m39063D(bVar, enumC12471d);
        if (m39086t(m39063D)) {
            m39074g(m39063D);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m39066G() {
        /*
            r6 = this;
            com.google.firebase.perf.config.a r0 = r6.f32449v
            boolean r0 = r0.m17282K()
            if (r0 == 0) goto L6f
            xe.c$b r0 = r6.f32452y
            boolean r0 = r0.m40529I()
            if (r0 == 0) goto L15
            boolean r0 = r6.f32438B
            if (r0 != 0) goto L15
            return
        L15:
            r0 = 0
            r1 = 1
            fe.f r2 = r6.f32444f     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2, r4, r3)     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            goto L5c
        L29:
            r2 = move-exception
            re.a r3 = p422we.C12178k.f32435C
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.m32569d(r0, r1)
            goto L5b
        L3a:
            r2 = move-exception
            re.a r3 = p422we.C12178k.f32435C
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.m32569d(r0, r1)
            goto L5b
        L4b:
            r2 = move-exception
            re.a r3 = p422we.C12178k.f32435C
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.m32569d(r0, r1)
        L5b:
            r2 = 0
        L5c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L68
            xe.c$b r0 = r6.f32452y
            r0.m40532L(r2)
            goto L6f
        L68:
            re.a r0 = p422we.C12178k.f32435C
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.m32574j(r1)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p422we.C12178k.m39066G():void");
    }

    /* renamed from: H */
    private void m39067H() {
        if (this.f32443e == null && m39096u()) {
            this.f32443e = C9933e.m29662c();
        }
    }

    /* renamed from: g */
    private void m39074g(C12476i c12476i) {
        if (c12476i.mo40677m()) {
            f32435C.m32571g("Logging %s. In a minute, visit the Firebase console to view your data: %s", m39081n(c12476i), m39076i(c12476i.mo40678p()));
        } else {
            f32435C.m32571g("Logging %s", m39081n(c12476i));
        }
        this.f32446s.m39045b(c12476i);
    }

    /* renamed from: h */
    private void m39075h() {
        this.f32451x.m17241k(new WeakReference<>(f32436D));
        C12470c.b m40519p0 = C12470c.m40519p0();
        this.f32452y = m40519p0;
        m40519p0.m40534N(this.f32442d.m42632r().m42644c()).m40531K(C12468a.m40493i0().m40499I(this.f32453z).m40500J(C9929a.f24452b).m40501K(m39083p(this.f32448u)));
        this.f32441c.set(true);
        while (!this.f32440b.isEmpty()) {
            final C12170c poll = this.f32440b.poll();
            if (poll != null) {
                this.f32447t.execute(new Runnable() { // from class: we.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12178k.this.m39087v(poll);
                    }
                });
            }
        }
    }

    /* renamed from: i */
    private String m39076i(C12480m c12480m) {
        String m40733z0 = c12480m.m40733z0();
        return m40733z0.startsWith("_st_") ? C10697b.m32578c(this.f32437A, this.f32453z, m40733z0) : C10697b.m32576a(this.f32437A, this.f32453z, m40733z0);
    }

    /* renamed from: j */
    private Map<String, String> m39077j() {
        m39067H();
        C9933e c9933e = this.f32443e;
        return c9933e != null ? c9933e.m29663b() : Collections.emptyMap();
    }

    /* renamed from: k */
    public static C12178k m39078k() {
        return f32436D;
    }

    /* renamed from: l */
    private static String m39079l(C12474g c12474g) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(c12474g.m40578o0()), Integer.valueOf(c12474g.m40576l0()), Integer.valueOf(c12474g.m40575k0()));
    }

    /* renamed from: m */
    private static String m39080m(C12475h c12475h) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", c12475h.m40622F0(), c12475h.m40625I0() ? String.valueOf(c12475h.m40633w0()) : "UNKNOWN", new DecimalFormat("#.####").format((c12475h.m40629M0() ? c12475h.m40620D0() : 0L) / 1000.0d));
    }

    /* renamed from: n */
    private static String m39081n(InterfaceC12477j interfaceC12477j) {
        return interfaceC12477j.mo40677m() ? m39082o(interfaceC12477j.mo40678p()) : interfaceC12477j.mo40675j() ? m39080m(interfaceC12477j.mo40676k()) : interfaceC12477j.mo40674i() ? m39079l(interfaceC12477j.mo40679q()) : "log";
    }

    /* renamed from: o */
    private static String m39082o(C12480m c12480m) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", c12480m.m40733z0(), new DecimalFormat("#.####").format(c12480m.m40732w0() / 1000.0d));
    }

    /* renamed from: p */
    private static String m39083p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: q */
    private void m39084q(C12476i c12476i) {
        C6273a c6273a;
        EnumC6328b enumC6328b;
        if (c12476i.mo40677m()) {
            c6273a = this.f32451x;
            enumC6328b = EnumC6328b.TRACE_EVENT_RATE_LIMITED;
        } else {
            if (!c12476i.mo40675j()) {
                return;
            }
            c6273a = this.f32451x;
            enumC6328b = EnumC6328b.NETWORK_TRACE_EVENT_RATE_LIMITED;
        }
        c6273a.m17235d(enumC6328b.toString(), 1L);
    }

    /* renamed from: s */
    private boolean m39085s(InterfaceC12477j interfaceC12477j) {
        int intValue = this.f32439a.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f32439a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f32439a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (interfaceC12477j.mo40677m() && intValue > 0) {
            this.f32439a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        }
        if (interfaceC12477j.mo40675j() && intValue2 > 0) {
            this.f32439a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        }
        if (!interfaceC12477j.mo40674i() || intValue3 <= 0) {
            f32435C.m32567b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m39081n(interfaceC12477j), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
        this.f32439a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
        return true;
    }

    /* renamed from: t */
    private boolean m39086t(C12476i c12476i) {
        if (!this.f32449v.m17282K()) {
            f32435C.m32571g("Performance collection is not enabled, dropping %s", m39081n(c12476i));
            return false;
        }
        if (!c12476i.m40672g0().m40526l0()) {
            f32435C.m32575k("App Instance ID is null or empty, dropping %s", m39081n(c12476i));
            return false;
        }
        if (!AbstractC11251e.m35159b(c12476i, this.f32448u)) {
            f32435C.m32575k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m39081n(c12476i));
            return false;
        }
        if (!this.f32450w.m39053h(c12476i)) {
            m39084q(c12476i);
            f32435C.m32571g("Event dropped due to device sampling - %s", m39081n(c12476i));
            return false;
        }
        if (!this.f32450w.m39052g(c12476i)) {
            return true;
        }
        m39084q(c12476i);
        f32435C.m32571g("Rate limited (per device) - %s", m39081n(c12476i));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m39087v(C12170c c12170c) {
        m39065F(c12170c.f32402a, c12170c.f32403b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m39088w(C12480m c12480m, EnumC12471d enumC12471d) {
        m39065F(C12476i.m40667i0().m40683L(c12480m), enumC12471d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m39089x(C12475h c12475h, EnumC12471d enumC12471d) {
        m39065F(C12476i.m40667i0().m40682K(c12475h), enumC12471d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m39090y(C12474g c12474g, EnumC12471d enumC12471d) {
        m39065F(C12476i.m40667i0().m40681J(c12474g), enumC12471d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m39091z() {
        this.f32450w.m39051a(this.f32438B);
    }

    /* renamed from: A */
    public void m39092A(final C12474g c12474g, final EnumC12471d enumC12471d) {
        this.f32447t.execute(new Runnable() { // from class: we.i
            @Override // java.lang.Runnable
            public final void run() {
                C12178k.this.m39090y(c12474g, enumC12471d);
            }
        });
    }

    /* renamed from: B */
    public void m39093B(final C12475h c12475h, final EnumC12471d enumC12471d) {
        this.f32447t.execute(new Runnable() { // from class: we.g
            @Override // java.lang.Runnable
            public final void run() {
                C12178k.this.m39089x(c12475h, enumC12471d);
            }
        });
    }

    /* renamed from: C */
    public void m39094C(final C12480m c12480m, final EnumC12471d enumC12471d) {
        this.f32447t.execute(new Runnable() { // from class: we.e
            @Override // java.lang.Runnable
            public final void run() {
                C12178k.this.m39088w(c12480m, enumC12471d);
            }
        });
    }

    @Override // com.google.firebase.perf.application.C6273a.b
    public void onUpdateAppState(EnumC12471d enumC12471d) {
        this.f32438B = enumC12471d == EnumC12471d.FOREGROUND;
        if (m39096u()) {
            this.f32447t.execute(new Runnable() { // from class: we.h
                @Override // java.lang.Runnable
                public final void run() {
                    C12178k.this.m39091z();
                }
            });
        }
    }

    /* renamed from: r */
    public void m39095r(C12867g c12867g, InterfaceC7337f interfaceC7337f, InterfaceC7183b<InterfaceC7303g> interfaceC7183b) {
        this.f32442d = c12867g;
        this.f32437A = c12867g.m42632r().m42648g();
        this.f32444f = interfaceC7337f;
        this.f32445r = interfaceC7183b;
        this.f32447t.execute(new Runnable() { // from class: we.f
            @Override // java.lang.Runnable
            public final void run() {
                C12178k.this.m39064E();
            }
        });
    }

    /* renamed from: u */
    public boolean m39096u() {
        return this.f32441c.get();
    }
}
