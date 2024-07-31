package p463ya;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import ca.C1904g;
import ca.C1906h;
import ca.C1912k;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* renamed from: ya.a */
/* loaded from: classes2.dex */
public class C12658a {

    /* renamed from: a */
    private static final C1904g f34353a = C1904g.m10086f();

    /* renamed from: b */
    private static final Object f34354b = new Object();

    /* renamed from: c */
    private static Method f34355c = null;

    /* renamed from: d */
    private static Method f34356d = null;

    /* renamed from: a */
    public static void m41638a(Context context) {
        Context context2;
        C5276s.m13325k(context, "Context must not be null");
        f34353a.m10090k(context, 11925000);
        synchronized (f34354b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.m13418e(context, DynamiteModule.f10837f, "com.google.android.gms.providerinstaller.dynamite").m13426b();
            } catch (DynamiteModule.C5324a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                m41640c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context m10098d = C1912k.m10098d(context);
            if (m10098d != null) {
                try {
                    if (f34356d == null) {
                        Class cls = Long.TYPE;
                        f34356d = m41639b(m10098d, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f34356d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e11) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                }
            }
            if (m10098d != null) {
                m41640c(m10098d, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new C1906h(8);
            }
        }
    }

    /* renamed from: b */
    private static Method m41639b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    /* renamed from: c */
    private static void m41640c(Context context, Context context2, String str) {
        try {
            if (f34355c == null) {
                f34355c = m41639b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f34355c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage())));
            }
            throw new C1906h(8);
        }
    }
}
