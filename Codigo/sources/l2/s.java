package l2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20864a;

    static {
        String i10 = f2.j.i("ProcessUtils");
        kotlin.jvm.internal.n.d(i10, "tagWithPrefix(\"ProcessUtils\")");
        f20864a = i10;
    }

    private static final String a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return b.f20806a.a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, f2.t.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            kotlin.jvm.internal.n.b(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            f2.j.e().b(f20864a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.n.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator<T> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    public static final boolean b(Context context, androidx.work.a configuration) {
        kotlin.jvm.internal.n.e(context, "context");
        kotlin.jvm.internal.n.e(configuration, "configuration");
        String a10 = a(context);
        String c10 = configuration.c();
        return kotlin.jvm.internal.n.a(a10, !(c10 == null || c10.length() == 0) ? configuration.c() : context.getApplicationInfo().processName);
    }
}
