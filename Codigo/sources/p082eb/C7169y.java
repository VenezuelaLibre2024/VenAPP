package p082eb;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: eb.y */
/* loaded from: classes2.dex */
public final class C7169y {

    /* renamed from: a */
    private static final Object f16059a;

    /* renamed from: b */
    private static final Method f16060b;

    /* renamed from: c */
    private static final Method f16061c;

    static {
        Object m21358b = m21358b();
        f16059a = m21358b;
        f16060b = m21358b == null ? null : m21357a();
        f16061c = m21358b != null ? m21360d(m21358b) : null;
    }

    /* renamed from: a */
    private static Method m21357a() {
        return m21359c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    private static Object m21358b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m21359c(String str, Class<?>... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e10) {
            throw e10;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m21360d(Object obj) {
        try {
            Method m21359c = m21359c("getStackTraceDepth", Throwable.class);
            if (m21359c == null) {
                return null;
            }
            m21359c.invoke(obj, new Throwable());
            return m21359c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m21361e(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static void m21362f(Throwable th2) {
        C7159o.m21312o(th2);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
    }
}
