package p215l6;

import android.os.Build;
import android.util.Log;

/* renamed from: l6.a */
/* loaded from: classes.dex */
public final class C9399a {
    /* renamed from: a */
    private static String m27988a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m27989b(String str, String str2, Object obj) {
        String m27992e = m27992e(str);
        if (Log.isLoggable(m27992e, 3)) {
            Log.d(m27992e, String.format(str2, obj));
        }
    }

    /* renamed from: c */
    public static void m27990c(String str, String str2, Object... objArr) {
        String m27992e = m27992e(str);
        if (Log.isLoggable(m27992e, 3)) {
            Log.d(m27992e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m27991d(String str, String str2, Throwable th2) {
        String m27992e = m27992e(str);
        if (Log.isLoggable(m27992e, 6)) {
            Log.e(m27992e, str2, th2);
        }
    }

    /* renamed from: e */
    private static String m27992e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m27988a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m27993f(String str, String str2, Object obj) {
        String m27992e = m27992e(str);
        if (Log.isLoggable(m27992e, 4)) {
            Log.i(m27992e, String.format(str2, obj));
        }
    }

    /* renamed from: g */
    public static void m27994g(String str, String str2, Object obj) {
        String m27992e = m27992e(str);
        if (Log.isLoggable(m27992e, 5)) {
            Log.w(m27992e, String.format(str2, obj));
        }
    }
}
