package p264o4;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.C9322n;
import p007a5.C0033a;

/* renamed from: o4.m */
/* loaded from: classes.dex */
public final class C9791m {

    /* renamed from: a */
    public static final C9791m f24173a = new C9791m();

    private C9791m() {
    }

    /* renamed from: a */
    public static final Class<?> m29419a(String className) {
        if (C0033a.m107d(C9791m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(className, "className");
            try {
                return Class.forName(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9791m.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final Class<?> m29420b(Context context, String className) {
        if (C0033a.m107d(C9791m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(context, "context");
            C9322n.m27781e(className, "className");
            try {
                return context.getClassLoader().loadClass(className);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9791m.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final Method m29421c(Class<?> clazz, String methodName, Class<?>... args) {
        if (C0033a.m107d(C9791m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(clazz, "clazz");
            C9322n.m27781e(methodName, "methodName");
            C9322n.m27781e(args, "args");
            try {
                return clazz.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9791m.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final Method m29422d(Class<?> clazz, String methodName, Class<?>... args) {
        if (C0033a.m107d(C9791m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(clazz, "clazz");
            C9322n.m27781e(methodName, "methodName");
            C9322n.m27781e(args, "args");
            try {
                return clazz.getMethod(methodName, (Class[]) Arrays.copyOf(args, args.length));
            } catch (NoSuchMethodException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9791m.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final Object m29423e(Class<?> clazz, Method method, Object obj, Object... args) {
        if (C0033a.m107d(C9791m.class)) {
            return null;
        }
        try {
            C9322n.m27781e(clazz, "clazz");
            C9322n.m27781e(method, "method");
            C9322n.m27781e(args, "args");
            if (obj != null) {
                obj = clazz.cast(obj);
            }
            try {
                return method.invoke(obj, Arrays.copyOf(args, args.length));
            } catch (IllegalAccessException | InvocationTargetException unused) {
                return null;
            }
        } catch (Throwable th2) {
            C0033a.m105b(th2, C9791m.class);
            return null;
        }
    }
}
