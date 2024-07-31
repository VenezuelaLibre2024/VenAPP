package p407w;

import android.os.Build;
import android.util.Log;

/* renamed from: w.o0 */
/* loaded from: classes.dex */
public final class C12029o0 {

    /* renamed from: a */
    private static int f31980a = 3;

    /* renamed from: a */
    public static void m38638a(String str, String str2) {
        String m38647j = m38647j(str);
        if (m38644g(m38647j, 3)) {
            Log.d(m38647j, str2);
        }
    }

    /* renamed from: b */
    public static void m38639b(String str, String str2, Throwable th2) {
        String m38647j = m38647j(str);
        if (m38644g(m38647j, 3)) {
            Log.d(m38647j, str2, th2);
        }
    }

    /* renamed from: c */
    public static void m38640c(String str, String str2) {
        String m38647j = m38647j(str);
        if (m38644g(m38647j, 6)) {
            Log.e(m38647j, str2);
        }
    }

    /* renamed from: d */
    public static void m38641d(String str, String str2, Throwable th2) {
        String m38647j = m38647j(str);
        if (m38644g(m38647j, 6)) {
            Log.e(m38647j, str2, th2);
        }
    }

    /* renamed from: e */
    public static void m38642e(String str, String str2) {
        String m38647j = m38647j(str);
        if (m38644g(m38647j, 4)) {
            Log.i(m38647j, str2);
        }
    }

    /* renamed from: f */
    public static boolean m38643f(String str) {
        return m38644g(m38647j(str), 3);
    }

    /* renamed from: g */
    private static boolean m38644g(String str, int i10) {
        return f31980a <= i10 || Log.isLoggable(str, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static void m38645h() {
        f31980a = 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m38646i(int i10) {
        f31980a = i10;
    }

    /* renamed from: j */
    private static String m38647j(String str) {
        return (Build.VERSION.SDK_INT > 25 || 23 >= str.length()) ? str : str.substring(0, 23);
    }

    /* renamed from: k */
    public static void m38648k(String str, String str2) {
        String m38647j = m38647j(str);
        if (m38644g(m38647j, 5)) {
            Log.w(m38647j, str2);
        }
    }

    /* renamed from: l */
    public static void m38649l(String str, String str2, Throwable th2) {
        String m38647j = m38647j(str);
        if (m38644g(m38647j, 5)) {
            Log.w(m38647j, str2, th2);
        }
    }
}
