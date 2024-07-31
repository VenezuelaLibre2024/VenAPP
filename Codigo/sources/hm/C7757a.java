package hm;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: hm.a */
/* loaded from: classes3.dex */
public class C7757a {

    /* renamed from: hm.a$a */
    /* loaded from: classes3.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a */
        private final Object f18493a;

        public a(Object obj) {
            this.f18493a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return C7757a.m23677d(method, this.f18493a.getClass().getClassLoader()).invoke(this.f18493a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getTargetException();
            } catch (ReflectiveOperationException e11) {
                throw new RuntimeException("Reflection failed for method " + method, e11);
            }
        }
    }

    /* renamed from: a */
    public static <T> T m23674a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C7757a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m23675b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m23678e()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static InvocationHandler m23676c(Object obj) {
        if (obj == null) {
            return null;
        }
        return new a(obj);
    }

    /* renamed from: d */
    public static Method m23677d(Method method, ClassLoader classLoader) {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    /* renamed from: e */
    private static boolean m23678e() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
