package we;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
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
import xe.c;
import xe.i;
import xe.m;

/* loaded from: classes.dex */
public class k implements a.b {
    private static final re.a C = re.a.e();
    private static final k D = new k();
    private String A;

    /* renamed from: a */
    private final Map<String, Integer> f29970a;

    /* renamed from: d */
    private zb.g f29973d;

    /* renamed from: e */
    private oe.e f29974e;

    /* renamed from: f */
    private fe.f f29975f;

    /* renamed from: r */
    private ee.b<f6.g> f29976r;

    /* renamed from: s */
    private b f29977s;

    /* renamed from: u */
    private Context f29979u;

    /* renamed from: v */
    private com.google.firebase.perf.config.a f29980v;

    /* renamed from: w */
    private d f29981w;

    /* renamed from: x */
    private com.google.firebase.perf.application.a f29982x;

    /* renamed from: y */
    private c.b f29983y;

    /* renamed from: z */
    private String f29984z;

    /* renamed from: b */
    private final ConcurrentLinkedQueue<c> f29971b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private final AtomicBoolean f29972c = new AtomicBoolean(false);
    private boolean B = false;

    /* renamed from: t */
    private ExecutorService f29978t = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f29970a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private xe.i D(i.b bVar, xe.d dVar) {
        G();
        c.b M = this.f29983y.M(dVar);
        if (bVar.m() || bVar.j()) {
            M = M.clone().J(j());
        }
        return bVar.I(M).build();
    }

    public void E() {
        Context m10 = this.f29973d.m();
        this.f29979u = m10;
        this.f29984z = m10.getPackageName();
        this.f29980v = com.google.firebase.perf.config.a.g();
        this.f29981w = new d(this.f29979u, new com.google.firebase.perf.util.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f29982x = com.google.firebase.perf.application.a.b();
        this.f29977s = new b(this.f29976r, this.f29980v.a());
        h();
    }

    private void F(i.b bVar, xe.d dVar) {
        if (!u()) {
            if (s(bVar)) {
                C.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f29971b.add(new c(bVar, dVar));
                return;
            }
            return;
        }
        xe.i D2 = D(bVar, dVar);
        if (t(D2)) {
            g(D2);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void G() {
        /*
            r6 = this;
            com.google.firebase.perf.config.a r0 = r6.f29980v
            boolean r0 = r0.K()
            if (r0 == 0) goto L6f
            xe.c$b r0 = r6.f29983y
            boolean r0 = r0.I()
            if (r0 == 0) goto L15
            boolean r0 = r6.B
            if (r0 != 0) goto L15
            return
        L15:
            r0 = 0
            r1 = 1
            fe.f r2 = r6.f29975f     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            com.google.android.gms.tasks.Task r2 = r2.getId()     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r2 = com.google.android.gms.tasks.Tasks.await(r2, r4, r3)     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.util.concurrent.TimeoutException -> L29 java.lang.InterruptedException -> L3a java.util.concurrent.ExecutionException -> L4b
            goto L5c
        L29:
            r2 = move-exception
            re.a r3 = we.k.C
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is timed out: %s"
            r3.d(r0, r1)
            goto L5b
        L3a:
            r2 = move-exception
            re.a r3 = we.k.C
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Task to retrieve Installation Id is interrupted: %s"
            r3.d(r0, r1)
            goto L5b
        L4b:
            r2 = move-exception
            re.a r3 = we.k.C
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.getMessage()
            r1[r0] = r2
            java.lang.String r0 = "Unable to retrieve Installation Id: %s"
            r3.d(r0, r1)
        L5b:
            r2 = 0
        L5c:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L68
            xe.c$b r0 = r6.f29983y
            r0.L(r2)
            goto L6f
        L68:
            re.a r0 = we.k.C
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we.k.G():void");
    }

    private void H() {
        if (this.f29974e == null && u()) {
            this.f29974e = oe.e.c();
        }
    }

    private void g(xe.i iVar) {
        if (iVar.m()) {
            C.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.p()));
        } else {
            C.g("Logging %s", n(iVar));
        }
        this.f29977s.b(iVar);
    }

    private void h() {
        this.f29982x.k(new WeakReference<>(D));
        c.b p02 = xe.c.p0();
        this.f29983y = p02;
        p02.N(this.f29973d.r().c()).K(xe.a.i0().I(this.f29984z).J(oe.a.f22519b).K(p(this.f29979u)));
        this.f29972c.set(true);
        while (!this.f29971b.isEmpty()) {
            c poll = this.f29971b.poll();
            if (poll != null) {
                this.f29978t.execute(new Runnable() { // from class: we.j

                    /* renamed from: b */
                    public final /* synthetic */ c f29969b;

                    public /* synthetic */ j(c poll2) {
                        r2 = poll2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        k.this.v(r2);
                    }
                });
            }
        }
    }

    private String i(m mVar) {
        String z02 = mVar.z0();
        return z02.startsWith("_st_") ? re.b.c(this.A, this.f29984z, z02) : re.b.a(this.A, this.f29984z, z02);
    }

    private Map<String, String> j() {
        H();
        oe.e eVar = this.f29974e;
        return eVar != null ? eVar.b() : Collections.emptyMap();
    }

    public static k k() {
        return D;
    }

    private static String l(xe.g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gVar.o0()), Integer.valueOf(gVar.l0()), Integer.valueOf(gVar.k0()));
    }

    private static String m(xe.h hVar) {
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", hVar.F0(), hVar.I0() ? String.valueOf(hVar.w0()) : "UNKNOWN", new DecimalFormat("#.####").format((hVar.M0() ? hVar.D0() : 0L) / 1000.0d));
    }

    private static String n(xe.j jVar) {
        return jVar.m() ? o(jVar.p()) : jVar.j() ? m(jVar.k()) : jVar.i() ? l(jVar.q()) : "log";
    }

    private static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", mVar.z0(), new DecimalFormat("#.####").format(mVar.w0() / 1000.0d));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private void q(xe.i iVar) {
        com.google.firebase.perf.application.a aVar;
        com.google.firebase.perf.util.b bVar;
        if (iVar.m()) {
            aVar = this.f29982x;
            bVar = com.google.firebase.perf.util.b.TRACE_EVENT_RATE_LIMITED;
        } else {
            if (!iVar.j()) {
                return;
            }
            aVar = this.f29982x;
            bVar = com.google.firebase.perf.util.b.NETWORK_TRACE_EVENT_RATE_LIMITED;
        }
        aVar.d(bVar.toString(), 1L);
    }

    private boolean s(xe.j jVar) {
        int intValue = this.f29970a.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f29970a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f29970a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (jVar.m() && intValue > 0) {
            this.f29970a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        }
        if (jVar.j() && intValue2 > 0) {
            this.f29970a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        }
        if (!jVar.i() || intValue3 <= 0) {
            C.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
        this.f29970a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
        return true;
    }

    private boolean t(xe.i iVar) {
        if (!this.f29980v.K()) {
            C.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        }
        if (!iVar.g0().l0()) {
            C.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        }
        if (!te.e.b(iVar, this.f29979u)) {
            C.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        }
        if (!this.f29981w.h(iVar)) {
            q(iVar);
            C.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        }
        if (!this.f29981w.g(iVar)) {
            return true;
        }
        q(iVar);
        C.g("Rate limited (per device) - %s", n(iVar));
        return false;
    }

    public /* synthetic */ void v(c cVar) {
        F(cVar.f29937a, cVar.f29938b);
    }

    public /* synthetic */ void w(m mVar, xe.d dVar) {
        F(xe.i.i0().L(mVar), dVar);
    }

    public /* synthetic */ void x(xe.h hVar, xe.d dVar) {
        F(xe.i.i0().K(hVar), dVar);
    }

    public /* synthetic */ void y(xe.g gVar, xe.d dVar) {
        F(xe.i.i0().J(gVar), dVar);
    }

    public /* synthetic */ void z() {
        this.f29981w.a(this.B);
    }

    public void A(xe.g gVar, xe.d dVar) {
        this.f29978t.execute(new Runnable() { // from class: we.i

            /* renamed from: b */
            public final /* synthetic */ xe.g f29966b;

            /* renamed from: c */
            public final /* synthetic */ xe.d f29967c;

            public /* synthetic */ i(xe.g gVar2, xe.d dVar2) {
                r2 = gVar2;
                r3 = dVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.y(r2, r3);
            }
        });
    }

    public void B(xe.h hVar, xe.d dVar) {
        this.f29978t.execute(new Runnable() { // from class: we.g

            /* renamed from: b */
            public final /* synthetic */ xe.h f29962b;

            /* renamed from: c */
            public final /* synthetic */ xe.d f29963c;

            public /* synthetic */ g(xe.h hVar2, xe.d dVar2) {
                r2 = hVar2;
                r3 = dVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.x(r2, r3);
            }
        });
    }

    public void C(m mVar, xe.d dVar) {
        this.f29978t.execute(new Runnable() { // from class: we.e

            /* renamed from: b */
            public final /* synthetic */ m f29958b;

            /* renamed from: c */
            public final /* synthetic */ xe.d f29959c;

            public /* synthetic */ e(m mVar2, xe.d dVar2) {
                r2 = mVar2;
                r3 = dVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.w(r2, r3);
            }
        });
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(xe.d dVar) {
        this.B = dVar == xe.d.FOREGROUND;
        if (u()) {
            this.f29978t.execute(new Runnable() { // from class: we.h
                public /* synthetic */ h() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    k.this.z();
                }
            });
        }
    }

    public void r(zb.g gVar, fe.f fVar, ee.b<f6.g> bVar) {
        this.f29973d = gVar;
        this.A = gVar.r().g();
        this.f29975f = fVar;
        this.f29976r = bVar;
        this.f29978t.execute(new Runnable() { // from class: we.f
            public /* synthetic */ f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                k.this.E();
            }
        });
    }

    public boolean u() {
        return this.f29972c.get();
    }
}
