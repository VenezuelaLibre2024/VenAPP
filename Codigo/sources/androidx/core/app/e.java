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
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class<?> f3481a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f3482b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f3483c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f3484d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f3485e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f3486f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f3487g = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d f3488a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3489b;

        a(d dVar, Object obj) {
            this.f3488a = dVar;
            this.f3489b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3488a.f3494a = this.f3489b;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f3490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f3491b;

        b(Application application, d dVar) {
            this.f3490a = application;
            this.f3491b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3490a.unregisterActivityLifecycleCallbacks(this.f3491b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3492a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3493b;

        c(Object obj, Object obj2) {
            this.f3492a = obj;
            this.f3493b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = e.f3484d;
                if (method != null) {
                    method.invoke(this.f3492a, this.f3493b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    e.f3485e.invoke(this.f3492a, this.f3493b, Boolean.FALSE);
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

    /* loaded from: classes.dex */
    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f3494a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f3495b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3496c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3497d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3498e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3499f = false;

        d(Activity activity) {
            this.f3495b = activity;
            this.f3496c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3495b == activity) {
                this.f3495b = null;
                this.f3498e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3498e || this.f3499f || this.f3497d || !e.h(this.f3494a, this.f3496c, activity)) {
                return;
            }
            this.f3499f = true;
            this.f3494a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3495b == activity) {
                this.f3497d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f3481a = a10;
        f3482b = b();
        f3483c = f();
        f3484d = d(a10);
        f3485e = c(a10);
        f3486f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
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

    private static Method d(Class<?> cls) {
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

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
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

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f3483c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f3487g.postAtFrontOfQueue(new c(f3482b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f3486f == null) {
            return false;
        }
        if (f3485e == null && f3484d == null) {
            return false;
        }
        try {
            Object obj2 = f3483c.get(activity);
            if (obj2 == null || (obj = f3482b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f3487g;
            handler.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f3486f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th2) {
                f3487g.post(new b(application, dVar));
                throw th2;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
