package androidx.camera.core.impl.utils;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* renamed from: androidx.camera.core.impl.utils.g */
/* loaded from: classes.dex */
public final class C0678g {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.camera.core.impl.utils.g$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static Context m3266a(Context context, String str) {
            Context createAttributionContext;
            createAttributionContext = context.createAttributionContext(str);
            return createAttributionContext;
        }

        /* renamed from: b */
        static String m3267b(Context context) {
            String attributionTag;
            attributionTag = context.getAttributionTag();
            return attributionTag;
        }
    }

    /* renamed from: a */
    public static Context m3263a(Context context) {
        String m3267b;
        Context applicationContext = context.getApplicationContext();
        return (Build.VERSION.SDK_INT < 30 || (m3267b = a.m3267b(context)) == null) ? applicationContext : a.m3266a(applicationContext, m3267b);
    }

    /* renamed from: b */
    public static Application m3264b(Context context) {
        for (Context m3263a = m3263a(context); m3263a instanceof ContextWrapper; m3263a = m3265c((ContextWrapper) m3263a)) {
            if (m3263a instanceof Application) {
                return (Application) m3263a;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Context m3265c(ContextWrapper contextWrapper) {
        String m3267b;
        Context baseContext = contextWrapper.getBaseContext();
        return (Build.VERSION.SDK_INT < 30 || (m3267b = a.m3267b(contextWrapper)) == null) ? baseContext : a.m3266a(baseContext, m3267b);
    }
}
