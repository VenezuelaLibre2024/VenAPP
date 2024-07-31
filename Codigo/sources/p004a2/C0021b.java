package p004a2;

import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a2.b */
/* loaded from: classes.dex */
public final class C0021b {

    /* renamed from: a */
    private static long f54a;

    /* renamed from: b */
    private static Method f55b;

    /* renamed from: c */
    private static Method f56c;

    /* renamed from: d */
    private static Method f57d;

    /* renamed from: a */
    public static void m76a(String str, int i10) {
        try {
            if (f56c == null) {
                C0025f.m89a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m77b(str, i10);
    }

    /* renamed from: b */
    private static void m77b(String str, int i10) {
        try {
            if (f56c == null) {
                f56c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f56c.invoke(null, Long.valueOf(f54a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            m82g("asyncTraceBegin", e10);
        }
    }

    /* renamed from: c */
    public static void m78c(String str) {
        C0022c.m85a(str);
    }

    /* renamed from: d */
    public static void m79d(String str, int i10) {
        try {
            if (f57d == null) {
                C0025f.m90b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        m80e(str, i10);
    }

    /* renamed from: e */
    private static void m80e(String str, int i10) {
        try {
            if (f57d == null) {
                f57d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f57d.invoke(null, Long.valueOf(f54a), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            m82g("asyncTraceEnd", e10);
        }
    }

    /* renamed from: f */
    public static void m81f() {
        C0022c.m86b();
    }

    /* renamed from: g */
    private static void m82g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: h */
    public static boolean m83h() {
        boolean isEnabled;
        try {
            if (f55b == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return m84i();
    }

    /* renamed from: i */
    private static boolean m84i() {
        try {
            if (f55b == null) {
                f54a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f55b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f55b.invoke(null, Long.valueOf(f54a))).booleanValue();
        } catch (Exception e10) {
            m82g("isTagEnabled", e10);
            return false;
        }
    }
}
