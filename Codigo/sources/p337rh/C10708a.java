package p337rh;

import android.util.Log;

/* renamed from: rh.a */
/* loaded from: classes3.dex */
public final class C10708a {

    /* renamed from: a */
    public static int f27070a = 5;

    /* renamed from: a */
    public static void m32586a(Exception exc) {
        if (m32589d()) {
            exc.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m32587b(Object obj) {
        if (m32589d()) {
            Log.e("RootBeer", m32588c() + String.valueOf(obj));
            Log.e("QLog", m32588c() + String.valueOf(obj));
        }
    }

    /* renamed from: c */
    private static String m32588c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    /* renamed from: d */
    public static boolean m32589d() {
        return f27070a > 0;
    }

    /* renamed from: e */
    public static boolean m32590e() {
        return f27070a > 4;
    }

    /* renamed from: f */
    public static void m32591f(Object obj) {
        if (m32590e()) {
            Log.v("RootBeer", m32588c() + String.valueOf(obj));
        }
    }
}
