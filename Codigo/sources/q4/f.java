package q4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ck.v;
import com.facebook.ads.AdError;
import com.facebook.internal.c0;
import com.facebook.internal.n;
import com.facebook.internal.n0;
import com.facebook.internal.r;
import i4.e0;
import i4.q0;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f23509a = new f();

    /* renamed from: b, reason: collision with root package name */
    private static final String f23510b;

    /* renamed from: c, reason: collision with root package name */
    private static final ScheduledExecutorService f23511c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile ScheduledFuture<?> f23512d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f23513e;

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicInteger f23514f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile m f23515g;

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicBoolean f23516h;

    /* renamed from: i, reason: collision with root package name */
    private static String f23517i;

    /* renamed from: j, reason: collision with root package name */
    private static long f23518j;

    /* renamed from: k, reason: collision with root package name */
    private static int f23519k;

    /* renamed from: l, reason: collision with root package name */
    private static WeakReference<Activity> f23520l;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.n.e(activity, "activity");
            c0.f7719e.b(q0.APP_EVENTS, f.f23510b, "onActivityCreated");
            g.a();
            f.p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            c0.f7719e.b(q0.APP_EVENTS, f.f23510b, "onActivityDestroyed");
            f.f23509a.r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            c0.f7719e.b(q0.APP_EVENTS, f.f23510b, "onActivityPaused");
            g.a();
            f.f23509a.s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            c0.f7719e.b(q0.APP_EVENTS, f.f23510b, "onActivityResumed");
            g.a();
            f.v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.n.e(activity, "activity");
            kotlin.jvm.internal.n.e(outState, "outState");
            c0.f7719e.b(q0.APP_EVENTS, f.f23510b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            f.f23519k++;
            c0.f7719e.b(q0.APP_EVENTS, f.f23510b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.n.e(activity, "activity");
            c0.f7719e.b(q0.APP_EVENTS, f.f23510b, "onActivityStopped");
            com.facebook.appevents.o.f7660b.g();
            f.f23519k--;
        }
    }

    static {
        String canonicalName = f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f23510b = canonicalName;
        f23511c = Executors.newSingleThreadScheduledExecutor();
        f23513e = new Object();
        f23514f = new AtomicInteger(0);
        f23516h = new AtomicBoolean(false);
    }

    private f() {
    }

    private final void k() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f23513e) {
            if (f23512d != null && (scheduledFuture = f23512d) != null) {
                scheduledFuture.cancel(false);
            }
            f23512d = null;
            v vVar = v.f7137a;
        }
    }

    public static final Activity l() {
        WeakReference<Activity> weakReference = f23520l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static final UUID m() {
        m mVar;
        if (f23515g == null || (mVar = f23515g) == null) {
            return null;
        }
        return mVar.d();
    }

    private final int n() {
        com.facebook.internal.v vVar = com.facebook.internal.v.f7874a;
        r f10 = com.facebook.internal.v.f(e0.m());
        return f10 == null ? j.a() : f10.n();
    }

    public static final boolean o() {
        return f23519k == 0;
    }

    public static final void p(Activity activity) {
        f23511c.execute(new Runnable() { // from class: q4.d
            @Override // java.lang.Runnable
            public final void run() {
                f.q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q() {
        if (f23515g == null) {
            f23515g = m.f23541g.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(Activity activity) {
        l4.e.j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(Activity activity) {
        AtomicInteger atomicInteger = f23514f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f23510b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        k();
        final long currentTimeMillis = System.currentTimeMillis();
        final String u10 = n0.u(activity);
        l4.e.k(activity);
        f23511c.execute(new Runnable() { // from class: q4.b
            @Override // java.lang.Runnable
            public final void run() {
                f.t(currentTimeMillis, u10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(final long j10, final String activityName) {
        kotlin.jvm.internal.n.e(activityName, "$activityName");
        if (f23515g == null) {
            f23515g = new m(Long.valueOf(j10), null, null, 4, null);
        }
        m mVar = f23515g;
        if (mVar != null) {
            mVar.k(Long.valueOf(j10));
        }
        if (f23514f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: q4.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.u(j10, activityName);
                }
            };
            synchronized (f23513e) {
                f23512d = f23511c.schedule(runnable, f23509a.n(), TimeUnit.SECONDS);
                v vVar = v.f7137a;
            }
        }
        long j11 = f23518j;
        i.e(activityName, j11 > 0 ? (j10 - j11) / AdError.NETWORK_ERROR_CODE : 0L);
        m mVar2 = f23515g;
        if (mVar2 == null) {
            return;
        }
        mVar2.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(long j10, String activityName) {
        kotlin.jvm.internal.n.e(activityName, "$activityName");
        if (f23515g == null) {
            f23515g = new m(Long.valueOf(j10), null, null, 4, null);
        }
        if (f23514f.get() <= 0) {
            n nVar = n.f23548a;
            n.e(activityName, f23515g, f23517i);
            m.f23541g.a();
            f23515g = null;
        }
        synchronized (f23513e) {
            f23512d = null;
            v vVar = v.f7137a;
        }
    }

    public static final void v(Activity activity) {
        kotlin.jvm.internal.n.e(activity, "activity");
        f23520l = new WeakReference<>(activity);
        f23514f.incrementAndGet();
        f23509a.k();
        final long currentTimeMillis = System.currentTimeMillis();
        f23518j = currentTimeMillis;
        final String u10 = n0.u(activity);
        l4.e.l(activity);
        j4.b.d(activity);
        u4.e.h(activity);
        o4.k.b();
        final Context applicationContext = activity.getApplicationContext();
        f23511c.execute(new Runnable() { // from class: q4.c
            @Override // java.lang.Runnable
            public final void run() {
                f.w(currentTimeMillis, u10, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(long j10, String activityName, Context appContext) {
        m mVar;
        kotlin.jvm.internal.n.e(activityName, "$activityName");
        m mVar2 = f23515g;
        Long e10 = mVar2 == null ? null : mVar2.e();
        if (f23515g == null) {
            f23515g = new m(Long.valueOf(j10), null, null, 4, null);
            n nVar = n.f23548a;
            String str = f23517i;
            kotlin.jvm.internal.n.d(appContext, "appContext");
            n.c(activityName, null, str, appContext);
        } else if (e10 != null) {
            long longValue = j10 - e10.longValue();
            if (longValue > f23509a.n() * AdError.NETWORK_ERROR_CODE) {
                n nVar2 = n.f23548a;
                n.e(activityName, f23515g, f23517i);
                String str2 = f23517i;
                kotlin.jvm.internal.n.d(appContext, "appContext");
                n.c(activityName, null, str2, appContext);
                f23515g = new m(Long.valueOf(j10), null, null, 4, null);
            } else if (longValue > 1000 && (mVar = f23515g) != null) {
                mVar.h();
            }
        }
        m mVar3 = f23515g;
        if (mVar3 != null) {
            mVar3.k(Long.valueOf(j10));
        }
        m mVar4 = f23515g;
        if (mVar4 == null) {
            return;
        }
        mVar4.m();
    }

    public static final void x(Application application, String str) {
        kotlin.jvm.internal.n.e(application, "application");
        if (f23516h.compareAndSet(false, true)) {
            com.facebook.internal.n nVar = com.facebook.internal.n.f7774a;
            com.facebook.internal.n.a(n.b.CodelessEvents, new n.a() { // from class: q4.a
                @Override // com.facebook.internal.n.a
                public final void a(boolean z10) {
                    f.y(z10);
                }
            });
            f23517i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(boolean z10) {
        if (z10) {
            l4.e.f();
        } else {
            l4.e.e();
        }
    }
}
