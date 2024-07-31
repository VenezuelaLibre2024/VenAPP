package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a */
    public static final o f4962a = new o();

    /* renamed from: b */
    private static final Map<Class<?>, Integer> f4963b = new HashMap();

    /* renamed from: c */
    private static final Map<Class<?>, List<Constructor<? extends d>>> f4964c = new HashMap();

    private o() {
    }

    private final d a(Constructor<? extends d> constructor, Object obj) {
        try {
            d newInstance = constructor.newInstance(obj);
            kotlin.jvm.internal.n.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    private final Constructor<? extends d> b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            kotlin.jvm.internal.n.d(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                kotlin.jvm.internal.n.d(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.n.d(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.n.d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String c10 = c(name);
            if (!(fullPackage.length() == 0)) {
                c10 = fullPackage + '.' + c10;
            }
            Class<?> cls2 = Class.forName(c10);
            kotlin.jvm.internal.n.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final String c(String className) {
        String A;
        kotlin.jvm.internal.n.e(className, "className");
        StringBuilder sb2 = new StringBuilder();
        A = xk.p.A(className, ".", "_", false, 4, null);
        sb2.append(A);
        sb2.append("_LifecycleAdapter");
        return sb2.toString();
    }

    private final int d(Class<?> cls) {
        Map<Class<?>, Integer> map = f4963b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g10 = g(cls);
        map.put(cls, Integer.valueOf(g10));
        return g10;
    }

    private final boolean e(Class<?> cls) {
        return cls != null && j.class.isAssignableFrom(cls);
    }

    public static final i f(Object object) {
        kotlin.jvm.internal.n.e(object, "object");
        boolean z10 = object instanceof i;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (i) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (i) object;
        }
        Class<?> cls = object.getClass();
        o oVar = f4962a;
        if (oVar.d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends d>> list = f4964c.get(cls);
        kotlin.jvm.internal.n.b(list);
        List<Constructor<? extends d>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(oVar.a(list2.get(0), object));
        }
        int size = list2.size();
        d[] dVarArr = new d[size];
        for (int i10 = 0; i10 < size; i10++) {
            dVarArr[i10] = f4962a.a(list2.get(i10), object);
        }
        return new CompositeGeneratedAdaptersObserver(dVarArr);
    }

    private final int g(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends d>> e10;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends d> b10 = b(cls);
        if (b10 != null) {
            Map<Class<?>, List<Constructor<? extends d>>> map = f4964c;
            e10 = dk.q.e(b10);
            map.put(cls, e10);
            return 2;
        }
        if (b.f4901c.d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.n.d(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends d>> list = f4964c.get(superclass);
            kotlin.jvm.internal.n.b(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.n.d(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (e(intrface)) {
                kotlin.jvm.internal.n.d(intrface, "intrface");
                if (d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends d>> list2 = f4964c.get(intrface);
                kotlin.jvm.internal.n.b(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4964c.put(cls, arrayList);
        return 2;
    }
}
