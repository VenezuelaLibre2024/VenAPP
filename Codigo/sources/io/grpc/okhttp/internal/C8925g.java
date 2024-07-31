package io.grpc.okhttp.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: io.grpc.okhttp.internal.g */
/* loaded from: classes3.dex */
public class C8925g<T> {

    /* renamed from: a */
    private final Class<?> f21192a;

    /* renamed from: b */
    private final String f21193b;

    /* renamed from: c */
    private final Class[] f21194c;

    public C8925g(Class<?> cls, String str, Class... clsArr) {
        this.f21192a = cls;
        this.f21193b = str;
        this.f21194c = clsArr;
    }

    /* renamed from: a */
    private Method m26077a(Class<?> cls) {
        Class<?> cls2;
        String str = this.f21193b;
        if (str == null) {
            return null;
        }
        Method m26078b = m26078b(cls, str, this.f21194c);
        if (m26078b == null || (cls2 = this.f21192a) == null || cls2.isAssignableFrom(m26078b.getReturnType())) {
            return m26078b;
        }
        return null;
    }

    /* renamed from: b */
    private static Method m26078b(Class<?> cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m26078b(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public Object m26079c(T t10, Object... objArr) {
        Method m26077a = m26077a(t10.getClass());
        if (m26077a == null) {
            throw new AssertionError("Method " + this.f21193b + " not supported for object " + t10);
        }
        try {
            return m26077a.invoke(t10, objArr);
        } catch (IllegalAccessException e10) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + m26077a);
            assertionError.initCause(e10);
            throw assertionError;
        }
    }

    /* renamed from: d */
    public Object m26080d(T t10, Object... objArr) {
        Method m26077a = m26077a(t10.getClass());
        if (m26077a == null) {
            return null;
        }
        try {
            return m26077a.invoke(t10, objArr);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public Object m26081e(T t10, Object... objArr) {
        try {
            return m26080d(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: f */
    public Object m26082f(T t10, Object... objArr) {
        try {
            return m26079c(t10, objArr);
        } catch (InvocationTargetException e10) {
            Throwable targetException = e10.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    /* renamed from: g */
    public boolean m26083g(T t10) {
        return m26077a(t10.getClass()) != null;
    }
}
