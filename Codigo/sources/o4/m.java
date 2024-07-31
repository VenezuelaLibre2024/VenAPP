package o4;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f22240a = new m();

    private m() {
    }

    public static final Class<?> a(String className) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            n.e(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }

    public static final Class<?> b(Context context, String className) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            n.e(context, "context");
            n.e(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }

    public static final Method c(Class<?> clazz, String methodName, Class<?>... args) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            n.e(clazz, "clazz");
            n.e(methodName, "methodName");
            n.e(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }

    public static final Method d(Class<?> clazz, String methodName, Class<?>... args) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            n.e(clazz, "clazz");
            n.e(methodName, "methodName");
            n.e(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }

    public static final Object e(Class<?> clazz, Method method, Object obj, Object... args) {
        if (a5.a.d(m.class)) {
            return null;
        }
        try {
            n.e(clazz, "clazz");
            n.e(method, "method");
            n.e(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            a5.a.b(th2, m.class);
            return null;
        }
    }
}
