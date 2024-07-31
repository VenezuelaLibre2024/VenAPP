package com.google.firebase.perf.metrics;

import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.f;
import androidx.lifecycle.j;
import androidx.lifecycle.t;
import androidx.lifecycle.w;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.e;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.util.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import we.k;
import xe.d;
import xe.m;
import zb.g;
import zb.r;

/* loaded from: classes.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, j {
    private static final l J = new com.google.firebase.perf.util.a().a();
    private static final long K = TimeUnit.MINUTES.toMicros(1);
    private static volatile AppStartTrace L;
    private static ExecutorService M;
    private ve.a E;

    /* renamed from: b, reason: collision with root package name */
    private final k f12281b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.util.a f12282c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.perf.config.a f12283d;

    /* renamed from: e, reason: collision with root package name */
    private final m.b f12284e;

    /* renamed from: f, reason: collision with root package name */
    private Context f12285f;

    /* renamed from: r, reason: collision with root package name */
    private WeakReference<Activity> f12286r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference<Activity> f12287s;

    /* renamed from: u, reason: collision with root package name */
    private final l f12289u;

    /* renamed from: v, reason: collision with root package name */
    private final l f12290v;

    /* renamed from: a, reason: collision with root package name */
    private boolean f12280a = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f12288t = false;

    /* renamed from: w, reason: collision with root package name */
    private l f12291w = null;

    /* renamed from: x, reason: collision with root package name */
    private l f12292x = null;

    /* renamed from: y, reason: collision with root package name */
    private l f12293y = null;

    /* renamed from: z, reason: collision with root package name */
    private l f12294z = null;
    private l A = null;
    private l B = null;
    private l C = null;
    private l D = null;
    private boolean F = false;
    private int G = 0;
    private final b H = new b();
    private boolean I = false;

    /* loaded from: classes.dex */
    private final class b implements ViewTreeObserver.OnDrawListener {
        private b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.h(AppStartTrace.this);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final AppStartTrace f12296a;

        public c(AppStartTrace appStartTrace) {
            this.f12296a = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12296a.f12291w == null) {
                this.f12296a.F = true;
            }
        }
    }

    AppStartTrace(k kVar, com.google.firebase.perf.util.a aVar, com.google.firebase.perf.config.a aVar2, ExecutorService executorService) {
        this.f12281b = kVar;
        this.f12282c = aVar;
        this.f12283d = aVar2;
        M = executorService;
        this.f12284e = m.H0().T("_experiment_app_start_ttid");
        this.f12289u = l.f(Process.getStartElapsedRealtime());
        r rVar = (r) g.o().k(r.class);
        this.f12290v = rVar != null ? l.f(rVar.b()) : null;
    }

    static /* synthetic */ int h(AppStartTrace appStartTrace) {
        int i10 = appStartTrace.G;
        appStartTrace.G = i10 + 1;
        return i10;
    }

    private l i() {
        l lVar = this.f12290v;
        return lVar != null ? lVar : J;
    }

    public static AppStartTrace j() {
        return L != null ? L : k(k.k(), new com.google.firebase.perf.util.a());
    }

    static AppStartTrace k(k kVar, com.google.firebase.perf.util.a aVar) {
        if (L == null) {
            synchronized (AppStartTrace.class) {
                if (L == null) {
                    L = new AppStartTrace(kVar, aVar, com.google.firebase.perf.config.a.g(), new ThreadPoolExecutor(0, 1, K + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return L;
    }

    private l l() {
        l lVar = this.f12289u;
        return lVar != null ? lVar : i();
    }

    public static boolean m(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        String packageName = context.getPackageName();
        String str = packageName + ":";
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(m.b bVar) {
        this.f12281b.C(bVar.build(), d.FOREGROUND_BACKGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        m.b S = m.H0().T(com.google.firebase.perf.util.c.APP_START_TRACE_NAME.toString()).R(i().e()).S(i().d(this.f12293y));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(m.H0().T(com.google.firebase.perf.util.c.ON_CREATE_TRACE_NAME.toString()).R(i().e()).S(i().d(this.f12291w)).build());
        if (this.f12292x != null) {
            m.b H0 = m.H0();
            H0.T(com.google.firebase.perf.util.c.ON_START_TRACE_NAME.toString()).R(this.f12291w.e()).S(this.f12291w.d(this.f12292x));
            arrayList.add(H0.build());
            m.b H02 = m.H0();
            H02.T(com.google.firebase.perf.util.c.ON_RESUME_TRACE_NAME.toString()).R(this.f12292x.e()).S(this.f12292x.d(this.f12293y));
            arrayList.add(H02.build());
        }
        S.J(arrayList).K(this.E.a());
        this.f12281b.C((m) S.build(), d.FOREGROUND_BACKGROUND);
    }

    private void p(final m.b bVar) {
        if (this.B == null || this.C == null || this.D == null) {
            return;
        }
        M.execute(new Runnable() { // from class: se.e
            @Override // java.lang.Runnable
            public final void run() {
                AppStartTrace.this.n(bVar);
            }
        });
        u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.D != null) {
            return;
        }
        this.D = this.f12282c.a();
        this.f12284e.L(m.H0().T("_experiment_onDrawFoQ").R(l().e()).S(l().d(this.D)).build());
        if (this.f12289u != null) {
            this.f12284e.L(m.H0().T("_experiment_procStart_to_classLoad").R(l().e()).S(l().d(i())).build());
        }
        this.f12284e.P("systemDeterminedForeground", this.I ? "true" : "false");
        this.f12284e.O("onDrawCount", this.G);
        this.f12284e.K(this.E.a());
        p(this.f12284e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.B != null) {
            return;
        }
        this.B = this.f12282c.a();
        this.f12284e.R(l().e()).S(l().d(this.B));
        p(this.f12284e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.C != null) {
            return;
        }
        this.C = this.f12282c.a();
        this.f12284e.L(m.H0().T("_experiment_preDrawFoQ").R(l().e()).S(l().d(this.C)).build());
        p(this.f12284e);
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:14:0x001b, B:16:0x003c), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void onActivityCreated(android.app.Activity r4, android.os.Bundle r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r5 = r3.F     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L40
            com.google.firebase.perf.util.l r5 = r3.f12291w     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La
            goto L40
        La:
            boolean r5 = r3.I     // Catch: java.lang.Throwable -> L42
            r0 = 1
            if (r5 != 0) goto L1a
            android.content.Context r5 = r3.f12285f     // Catch: java.lang.Throwable -> L42
            boolean r5 = m(r5)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L18
            goto L1a
        L18:
            r5 = 0
            goto L1b
        L1a:
            r5 = r0
        L1b:
            r3.I = r5     // Catch: java.lang.Throwable -> L42
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L42
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L42
            r3.f12286r = r5     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.a r4 = r3.f12282c     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.l r4 = r4.a()     // Catch: java.lang.Throwable -> L42
            r3.f12291w = r4     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.l r4 = r3.l()     // Catch: java.lang.Throwable -> L42
            com.google.firebase.perf.util.l r5 = r3.f12291w     // Catch: java.lang.Throwable -> L42
            long r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L42
            long r1 = com.google.firebase.perf.metrics.AppStartTrace.K     // Catch: java.lang.Throwable -> L42
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3e
            r3.f12288t = r0     // Catch: java.lang.Throwable -> L42
        L3e:
            monitor-exit(r3)
            return
        L40:
            monitor-exit(r3)
            return
        L42:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.metrics.AppStartTrace.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.F || this.f12288t || !this.f12283d.h()) {
            return;
        }
        activity.findViewById(R.id.content).getViewTreeObserver().removeOnDrawListener(this.H);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.F && !this.f12288t) {
            boolean h10 = this.f12283d.h();
            if (h10) {
                View findViewById = activity.findViewById(R.id.content);
                findViewById.getViewTreeObserver().addOnDrawListener(this.H);
                e.e(findViewById, new Runnable() { // from class: se.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.q();
                    }
                });
                h.a(findViewById, new Runnable() { // from class: se.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.r();
                    }
                }, new Runnable() { // from class: se.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.s();
                    }
                });
            }
            if (this.f12293y != null) {
                return;
            }
            this.f12287s = new WeakReference<>(activity);
            this.f12293y = this.f12282c.a();
            this.E = SessionManager.getInstance().perfSession();
            re.a.e().a("onResume(): " + activity.getClass().getName() + ": " + i().d(this.f12293y) + " microseconds");
            M.execute(new Runnable() { // from class: se.d
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.o();
                }
            });
            if (!h10) {
                u();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.F && this.f12292x == null && !this.f12288t) {
            this.f12292x = this.f12282c.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @t(f.a.ON_STOP)
    public void onAppEnteredBackground() {
        if (this.F || this.f12288t || this.A != null) {
            return;
        }
        this.A = this.f12282c.a();
        this.f12284e.L(m.H0().T("_experiment_firstBackgrounding").R(l().e()).S(l().d(this.A)).build());
    }

    @Keep
    @t(f.a.ON_START)
    public void onAppEnteredForeground() {
        if (this.F || this.f12288t || this.f12294z != null) {
            return;
        }
        this.f12294z = this.f12282c.a();
        this.f12284e.L(m.H0().T("_experiment_firstForegrounding").R(l().e()).S(l().d(this.f12294z)).build());
    }

    public synchronized void t(Context context) {
        boolean z10;
        if (this.f12280a) {
            return;
        }
        w.l().getLifecycle().a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.I && !m(applicationContext)) {
                z10 = false;
                this.I = z10;
                this.f12280a = true;
                this.f12285f = applicationContext;
            }
            z10 = true;
            this.I = z10;
            this.f12280a = true;
            this.f12285f = applicationContext;
        }
    }

    public synchronized void u() {
        if (this.f12280a) {
            w.l().getLifecycle().c(this);
            ((Application) this.f12285f).unregisterActivityLifecycleCallbacks(this);
            this.f12280a = false;
        }
    }
}
