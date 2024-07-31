package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.e */
/* loaded from: classes.dex */
public final class C0788e {

    /* renamed from: a */
    protected static final Class<?> f4132a;

    /* renamed from: b */
    protected static final Field f4133b;

    /* renamed from: c */
    protected static final Field f4134c;

    /* renamed from: d */
    protected static final Method f4135d;

    /* renamed from: e */
    protected static final Method f4136e;

    /* renamed from: f */
    protected static final Method f4137f;

    /* renamed from: g */
    private static final Handler f4138g = new Handler(Looper.getMainLooper());

    /* renamed from: androidx.core.app.e$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ d f4139a;

        /* renamed from: b */
        final /* synthetic */ Object f4140b;

        a(d dVar, Object obj) {
            this.f4139a = dVar;
            this.f4140b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4139a.f4145a = this.f4140b;
        }
    }

    /* renamed from: androidx.core.app.e$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Application f4141a;

        /* renamed from: b */
        final /* synthetic */ d f4142b;

        b(Application application, d dVar) {
            this.f4141a = application;
            this.f4142b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4141a.unregisterActivityLifecycleCallbacks(this.f4142b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.e$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f4143a;

        /* renamed from: b */
        final /* synthetic */ Object f4144b;

        c(Object obj, Object obj2) {
            this.f4143a = obj;
            this.f4144b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0788e.f4135d;
                if (method != null) {
                    method.invoke(this.f4143a, this.f4144b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0788e.f4136e.invoke(this.f4143a, this.f4144b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* renamed from: androidx.core.app.e$d */
    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a */
        Object f4145a;

        /* renamed from: b */
        private Activity f4146b;

        /* renamed from: c */
        private final int f4147c;

        /* renamed from: d */
        private boolean f4148d = false;

        /* renamed from: e */
        private boolean f4149e = false;

        /* renamed from: f */
        private boolean f4150f = false;

        d(Activity activity) {
            this.f4146b = activity;
            this.f4147c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f4146b == activity) {
                this.f4146b = null;
                this.f4149e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f4149e || this.f4150f || this.f4148d || !C0788e.m3962h(this.f4145a, this.f4147c, activity)) {
                return;
            }
            this.f4150f = true;
            this.f4145a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f4146b == activity) {
                this.f4148d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m3955a = m3955a();
        f4132a = m3955a;
        f4133b = m3956b();
        f4134c = m3960f();
        f4135d = m3958d(m3955a);
        f4136e = m3957c(m3955a);
        f4137f = m3959e(m3955a);
    }

    /* renamed from: a */
    private static Class<?> m3955a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m3956b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m3957c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m3958d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m3959e(Class<?> cls) {
        if (m3961g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m3960f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m3961g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    /* renamed from: h */
    protected static boolean m3962h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f4134c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f4138g.postAtFrontOfQueue(new c(f4133b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m3963i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m3961g() && f4137f == null) {
            return false;
        }
        if (f4136e == null && f4135d == null) {
            return false;
        }
        try {
            Object obj2 = f4134c.get(activity);
            if (obj2 == null || (obj = f4133b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f4138g;
            handler.post(new a(dVar, obj2));
            try {
                if (m3961g()) {
                    Method method = f4137f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th2) {
                f4138g.post(new b(application, dVar));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
