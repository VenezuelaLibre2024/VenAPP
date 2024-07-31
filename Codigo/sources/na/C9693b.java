package na;

import android.content.Context;
import la.C9471p;

/* renamed from: na.b */
/* loaded from: classes.dex */
public class C9693b {

    /* renamed from: a */
    private static Context f23854a;

    /* renamed from: b */
    private static Boolean f23855b;

    /* renamed from: a */
    public static synchronized boolean m29070a(Context context) {
        Boolean bool;
        boolean isInstantApp;
        Boolean bool2;
        synchronized (C9693b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f23854a;
            if (context2 != null && (bool2 = f23855b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f23855b = null;
            if (!C9471p.m28172i()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f23855b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f23854a = applicationContext;
                return f23855b.booleanValue();
            }
            isInstantApp = applicationContext.getPackageManager().isInstantApp();
            bool = Boolean.valueOf(isInstantApp);
            f23855b = bool;
            f23854a = applicationContext;
            return f23855b.booleanValue();
        }
    }
}
