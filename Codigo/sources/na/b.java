package na;

import android.content.Context;
import la.p;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f21921a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f21922b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        boolean isInstantApp;
        Boolean bool2;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f21921a;
            if (context2 != null && (bool2 = f21922b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f21922b = null;
            if (!p.i()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f21922b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f21921a = applicationContext;
                return f21922b.booleanValue();
            }
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            bool = Boolean.valueOf(isInstantApp);
            f21922b = bool;
            f21921a = applicationContext;
            return f21922b.booleanValue();
        }
    }
}
