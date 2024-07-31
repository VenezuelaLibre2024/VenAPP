package p303q4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ck.C2037v;
import com.facebook.ads.AdError;
import com.facebook.appevents.C4589o;
import com.facebook.internal.C4612c0;
import com.facebook.internal.C4633n;
import com.facebook.internal.C4634n0;
import com.facebook.internal.C4641r;
import com.facebook.internal.C4648v;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C9322n;
import p152i4.C7799e0;
import p152i4.EnumC7823q0;
import p172j4.C8981b;
import p213l4.C9389e;
import p264o4.C9789k;
import p374u4.C11320e;

/* renamed from: q4.f */
/* loaded from: classes.dex */
public final class C10266f {

    /* renamed from: a */
    public static final C10266f f25477a = new C10266f();

    /* renamed from: b */
    private static final String f25478b;

    /* renamed from: c */
    private static final ScheduledExecutorService f25479c;

    /* renamed from: d */
    private static volatile ScheduledFuture<?> f25480d;

    /* renamed from: e */
    private static final Object f25481e;

    /* renamed from: f */
    private static final AtomicInteger f25482f;

    /* renamed from: g */
    private static volatile C10273m f25483g;

    /* renamed from: h */
    private static final AtomicBoolean f25484h;

    /* renamed from: i */
    private static String f25485i;

    /* renamed from: j */
    private static long f25486j;

    /* renamed from: k */
    private static int f25487k;

    /* renamed from: l */
    private static WeakReference<Activity> f25488l;

    /* renamed from: q4.f$a */
    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C9322n.m27781e(activity, "activity");
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C10266f.f25478b, "onActivityCreated");
            C10267g.m30744a();
            C10266f.m30734p(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C9322n.m27781e(activity, "activity");
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C10266f.f25478b, "onActivityDestroyed");
            C10266f.f25477a.m30736r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C9322n.m27781e(activity, "activity");
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C10266f.f25478b, "onActivityPaused");
            C10267g.m30744a();
            C10266f.f25477a.m30737s(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C9322n.m27781e(activity, "activity");
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C10266f.f25478b, "onActivityResumed");
            C10267g.m30744a();
            C10266f.m30740v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            C9322n.m27781e(activity, "activity");
            C9322n.m27781e(outState, "outState");
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C10266f.f25478b, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C9322n.m27781e(activity, "activity");
            C10266f.f25487k++;
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C10266f.f25478b, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C9322n.m27781e(activity, "activity");
            C4612c0.f8694e.m11138b(EnumC7823q0.APP_EVENTS, C10266f.f25478b, "onActivityStopped");
            C4589o.f8635b.m11056g();
            C10266f.f25487k--;
        }
    }

    static {
        String canonicalName = C10266f.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f25478b = canonicalName;
        f25479c = Executors.newSingleThreadScheduledExecutor();
        f25481e = new Object();
        f25482f = new AtomicInteger(0);
        f25484h = new AtomicBoolean(false);
    }

    private C10266f() {
    }

    /* renamed from: k */
    private final void m30729k() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f25481e) {
            if (f25480d != null && (scheduledFuture = f25480d) != null) {
                scheduledFuture.cancel(false);
            }
            f25480d = null;
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: l */
    public static final Activity m30730l() {
        WeakReference<Activity> weakReference = f25488l;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: m */
    public static final UUID m30731m() {
        C10273m c10273m;
        if (f25483g == null || (c10273m = f25483g) == null) {
            return null;
        }
        return c10273m.m30773d();
    }

    /* renamed from: n */
    private final int m30732n() {
        C4648v c4648v = C4648v.f8854a;
        C4641r m11447f = C4648v.m11447f(C7799e0.m23861m());
        return m11447f == null ? C10270j.m30762a() : m11447f.m11388n();
    }

    /* renamed from: o */
    public static final boolean m30733o() {
        return f25487k == 0;
    }

    /* renamed from: p */
    public static final void m30734p(Activity activity) {
        f25479c.execute(new Runnable() { // from class: q4.d
            @Override // java.lang.Runnable
            public final void run() {
                C10266f.m30735q();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m30735q() {
        if (f25483g == null) {
            f25483g = C10273m.f25509g.m30784b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m30736r(Activity activity) {
        C9389e.m27939j(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final void m30737s(Activity activity) {
        AtomicInteger atomicInteger = f25482f;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f25478b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m30729k();
        final long currentTimeMillis = System.currentTimeMillis();
        final String m11333u = C4634n0.m11333u(activity);
        C9389e.m27940k(activity);
        f25479c.execute(new Runnable() { // from class: q4.b
            @Override // java.lang.Runnable
            public final void run() {
                C10266f.m30738t(currentTimeMillis, m11333u);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final void m30738t(final long j10, final String activityName) {
        C9322n.m27781e(activityName, "$activityName");
        if (f25483g == null) {
            f25483g = new C10273m(Long.valueOf(j10), null, null, 4, null);
        }
        C10273m c10273m = f25483g;
        if (c10273m != null) {
            c10273m.m30780k(Long.valueOf(j10));
        }
        if (f25482f.get() <= 0) {
            Runnable runnable = new Runnable() { // from class: q4.e
                @Override // java.lang.Runnable
                public final void run() {
                    C10266f.m30739u(j10, activityName);
                }
            };
            synchronized (f25481e) {
                f25480d = f25479c.schedule(runnable, f25477a.m30732n(), TimeUnit.SECONDS);
                C2037v c2037v = C2037v.f8089a;
            }
        }
        long j11 = f25486j;
        C10269i.m30757e(activityName, j11 > 0 ? (j10 - j11) / AdError.NETWORK_ERROR_CODE : 0L);
        C10273m c10273m2 = f25483g;
        if (c10273m2 == null) {
            return;
        }
        c10273m2.m30782m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static final void m30739u(long j10, String activityName) {
        C9322n.m27781e(activityName, "$activityName");
        if (f25483g == null) {
            f25483g = new C10273m(Long.valueOf(j10), null, null, 4, null);
        }
        if (f25482f.get() <= 0) {
            C10274n c10274n = C10274n.f25516a;
            C10274n.m30789e(activityName, f25483g, f25485i);
            C10273m.f25509g.m30783a();
            f25483g = null;
        }
        synchronized (f25481e) {
            f25480d = null;
            C2037v c2037v = C2037v.f8089a;
        }
    }

    /* renamed from: v */
    public static final void m30740v(Activity activity) {
        C9322n.m27781e(activity, "activity");
        f25488l = new WeakReference<>(activity);
        f25482f.incrementAndGet();
        f25477a.m30729k();
        final long currentTimeMillis = System.currentTimeMillis();
        f25486j = currentTimeMillis;
        final String m11333u = C4634n0.m11333u(activity);
        C9389e.m27941l(activity);
        C8981b.m26347d(activity);
        C11320e.m35388h(activity);
        C9789k.m29410b();
        final Context applicationContext = activity.getApplicationContext();
        f25479c.execute(new Runnable() { // from class: q4.c
            @Override // java.lang.Runnable
            public final void run() {
                C10266f.m30741w(currentTimeMillis, m11333u, applicationContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static final void m30741w(long j10, String activityName, Context appContext) {
        C10273m c10273m;
        C9322n.m27781e(activityName, "$activityName");
        C10273m c10273m2 = f25483g;
        Long m30774e = c10273m2 == null ? null : c10273m2.m30774e();
        if (f25483g == null) {
            f25483g = new C10273m(Long.valueOf(j10), null, null, 4, null);
            C10274n c10274n = C10274n.f25516a;
            String str = f25485i;
            C9322n.m27780d(appContext, "appContext");
            C10274n.m30787c(activityName, null, str, appContext);
        } else if (m30774e != null) {
            long longValue = j10 - m30774e.longValue();
            if (longValue > f25477a.m30732n() * AdError.NETWORK_ERROR_CODE) {
                C10274n c10274n2 = C10274n.f25516a;
                C10274n.m30789e(activityName, f25483g, f25485i);
                String str2 = f25485i;
                C9322n.m27780d(appContext, "appContext");
                C10274n.m30787c(activityName, null, str2, appContext);
                f25483g = new C10273m(Long.valueOf(j10), null, null, 4, null);
            } else if (longValue > 1000 && (c10273m = f25483g) != null) {
                c10273m.m30777h();
            }
        }
        C10273m c10273m3 = f25483g;
        if (c10273m3 != null) {
            c10273m3.m30780k(Long.valueOf(j10));
        }
        C10273m c10273m4 = f25483g;
        if (c10273m4 == null) {
            return;
        }
        c10273m4.m30782m();
    }

    /* renamed from: x */
    public static final void m30742x(Application application, String str) {
        C9322n.m27781e(application, "application");
        if (f25484h.compareAndSet(false, true)) {
            C4633n c4633n = C4633n.f8754a;
            C4633n.m11248a(C4633n.b.CodelessEvents, new C4633n.a() { // from class: q4.a
                @Override // com.facebook.internal.C4633n.a
                /* renamed from: a */
                public final void mo10935a(boolean z10) {
                    C10266f.m30743y(z10);
                }
            });
            f25485i = str;
            application.registerActivityLifecycleCallbacks(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static final void m30743y(boolean z10) {
        if (z10) {
            C9389e.m27935f();
        } else {
            C9389e.m27934e();
        }
    }
}
