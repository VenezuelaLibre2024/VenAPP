package a2;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static long f54a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f55b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f56c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f57d;

    public static void a(String str, int i10) {
        try {
            if (f56c == null) {
                f.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    private static void b(String str, int i10) {
        try {
            if (f56c == null) {
                f56c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f56c.invoke(null, Long.valueOf(f54a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        c.a(str);
    }

    public static void d(String str, int i10) {
        try {
            if (f57d == null) {
                f.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    private static void e(String str, int i10) {
        try {
            if (f57d == null) {
                f57d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f57d.invoke(null, Long.valueOf(f54a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        c.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        boolean isEnabled;
        try {
            if (f55b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f55b == null) {
                f54a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f55b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f55b.invoke(null, Long.valueOf(f54a))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }
}
