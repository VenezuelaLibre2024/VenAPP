package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* renamed from: androidx.core.app.g */
/* loaded from: classes.dex */
public final class C0794g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.g$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        static <T> T m4027a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        /* renamed from: b */
        static int m4028b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        /* renamed from: c */
        static int m4029c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        /* renamed from: d */
        static String m4030d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* renamed from: androidx.core.app.g$b */
    /* loaded from: classes.dex */
    static class b {
        /* renamed from: a */
        static int m4031a(AppOpsManager appOpsManager, String str, int i10, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i10, str2);
        }

        /* renamed from: b */
        static String m4032b(Context context) {
            String opPackageName;
            opPackageName = context.getOpPackageName();
            return opPackageName;
        }

        /* renamed from: c */
        static AppOpsManager m4033c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    /* renamed from: a */
    public static int m4024a(Context context, int i10, String str, String str2) {
        if (Build.VERSION.SDK_INT < 29) {
            return m4025b(context, str, str2);
        }
        AppOpsManager m4033c = b.m4033c(context);
        int m4031a = b.m4031a(m4033c, str, Binder.getCallingUid(), str2);
        return m4031a != 0 ? m4031a : b.m4031a(m4033c, str, i10, b.m4032b(context));
    }

    /* renamed from: b */
    public static int m4025b(Context context, String str, String str2) {
        return a.m4029c((AppOpsManager) a.m4027a(context, AppOpsManager.class), str, str2);
    }

    /* renamed from: c */
    public static String m4026c(String str) {
        return a.m4030d(str);
    }
}
