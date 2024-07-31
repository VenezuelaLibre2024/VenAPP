package p211l2;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.work.C1521a;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p094f2.AbstractC7277j;
import p094f2.AbstractC7287t;

/* renamed from: l2.s */
/* loaded from: classes.dex */
public final class C9367s {

    /* renamed from: a */
    private static final String f22686a;

    static {
        String m21769i = AbstractC7277j.m21769i("ProcessUtils");
        C9322n.m27780d(m21769i, "tagWithPrefix(\"ProcessUtils\")");
        f22686a = m21769i;
    }

    /* renamed from: a */
    private static final String m27884a(Context context) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            return C9346b.f22628a.m27836a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, AbstractC7287t.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            C9322n.m27778b(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th2) {
            AbstractC7277j.m21767e().mo21771b(f22686a, "Unable to check ActivityThread for processName", th2);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService("activity");
        C9322n.m27779c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
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

    /* renamed from: b */
    public static final boolean m27885b(Context context, C1521a configuration) {
        C9322n.m27781e(context, "context");
        C9322n.m27781e(configuration, "configuration");
        String m27884a = m27884a(context);
        String m8508c = configuration.m8508c();
        return C9322n.m27777a(m27884a, !(m8508c == null || m8508c.length() == 0) ? configuration.m8508c() : context.getApplicationInfo().processName);
    }
}
