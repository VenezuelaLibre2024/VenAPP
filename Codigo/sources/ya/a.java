package ya;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import ca.g;
import ca.h;
import ca.k;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a */
    private static final g f31817a = g.f();

    /* renamed from: b */
    private static final Object f31818b = new Object();

    /* renamed from: c */
    private static Method f31819c = null;

    /* renamed from: d */
    private static Method f31820d = null;

    public static void a(Context context) {
        Context context2;
        s.k(context, "Context must not be null");
        f31817a.k(context, 11925000);
        synchronized (f31818b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.e(context, DynamiteModule.f9722f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e10) {
                Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e10.getMessage())));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context d10 = k.d(context);
            if (d10 != null) {
                try {
                    if (f31820d == null) {
                        Class cls = Long.TYPE;
                        f31820d = b(d10, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f31820d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e11) {
                    Log.w("ProviderInstaller", "Failed to report request stats: ".concat(String.valueOf(e11.getMessage())));
                }
            }
            if (d10 != null) {
                c(d10, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new h(8);
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) {
        try {
            if (f31819c == null) {
                f31819c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f31819c.invoke(null, context);
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(cause == null ? e10.getMessage() : cause.getMessage())));
            }
            throw new h(8);
        }
    }
}
