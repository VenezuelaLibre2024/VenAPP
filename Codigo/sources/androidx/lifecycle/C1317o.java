package androidx.lifecycle;

import dk.C7029q;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p450xk.C12524p;

/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public final class C1317o {

    /* renamed from: a */
    public static final C1317o f5716a = new C1317o();

    /* renamed from: b */
    private static final Map<Class<?>, Integer> f5717b = new HashMap();

    /* renamed from: c */
    private static final Map<Class<?>, List<Constructor<? extends InterfaceC1296d>>> f5718c = new HashMap();

    private C1317o() {
    }

    /* renamed from: a */
    private final InterfaceC1296d m7368a(Constructor<? extends InterfaceC1296d> constructor, Object obj) {
        try {
            InterfaceC1296d newInstance = constructor.newInstance(obj);
            C9322n.m27780d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* renamed from: b */
    private final Constructor<? extends InterfaceC1296d> m7369b(Class<?> cls) {
        try {
            Package r02 = cls.getPackage();
            String name = cls.getCanonicalName();
            String fullPackage = r02 != null ? r02.getName() : "";
            C9322n.m27780d(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                C9322n.m27780d(name, "name");
                name = name.substring(fullPackage.length() + 1);
                C9322n.m27780d(name, "this as java.lang.String).substring(startIndex)");
            }
            C9322n.m27780d(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String m7370c = m7370c(name);
            if (!(fullPackage.length() == 0)) {
                m7370c = fullPackage + '.' + m7370c;
            }
            Class<?> cls2 = Class.forName(m7370c);
            C9322n.m27779c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
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

    /* renamed from: c */
    public static final String m7370c(String className) {
        String m41027A;
        C9322n.m27781e(className, "className");
        StringBuilder sb2 = new StringBuilder();
        m41027A = C12524p.m41027A(className, ".", "_", false, 4, null);
        sb2.append(m41027A);
        sb2.append("_LifecycleAdapter");
        return sb2.toString();
    }

    /* renamed from: d */
    private final int m7371d(Class<?> cls) {
        Map<Class<?>, Integer> map = f5717b;
        Integer num = map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m7374g = m7374g(cls);
        map.put(cls, Integer.valueOf(m7374g));
        return m7374g;
    }

    /* renamed from: e */
    private final boolean m7372e(Class<?> cls) {
        return cls != null && InterfaceC1308j.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    public static final InterfaceC1306i m7373f(Object object) {
        C9322n.m27781e(object, "object");
        boolean z10 = object instanceof InterfaceC1306i;
        boolean z11 = object instanceof DefaultLifecycleObserver;
        if (z10 && z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, (InterfaceC1306i) object);
        }
        if (z11) {
            return new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) object, null);
        }
        if (z10) {
            return (InterfaceC1306i) object;
        }
        Class<?> cls = object.getClass();
        C1317o c1317o = f5716a;
        if (c1317o.m7371d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(object);
        }
        List<Constructor<? extends InterfaceC1296d>> list = f5718c.get(cls);
        C9322n.m27778b(list);
        List<Constructor<? extends InterfaceC1296d>> list2 = list;
        if (list2.size() == 1) {
            return new SingleGeneratedAdapterObserver(c1317o.m7368a(list2.get(0), object));
        }
        int size = list2.size();
        InterfaceC1296d[] interfaceC1296dArr = new InterfaceC1296d[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC1296dArr[i10] = f5716a.m7368a(list2.get(i10), object);
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC1296dArr);
    }

    /* renamed from: g */
    private final int m7374g(Class<?> cls) {
        ArrayList arrayList;
        List<Constructor<? extends InterfaceC1296d>> m20572e;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC1296d> m7369b = m7369b(cls);
        if (m7369b != null) {
            Map<Class<?>, List<Constructor<? extends InterfaceC1296d>>> map = f5718c;
            m20572e = C7029q.m20572e(m7369b);
            map.put(cls, m20572e);
            return 2;
        }
        if (C1292b.f5655c.m7297d(cls)) {
            return 1;
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (m7372e(superclass)) {
            C9322n.m27780d(superclass, "superclass");
            if (m7371d(superclass) == 1) {
                return 1;
            }
            List<Constructor<? extends InterfaceC1296d>> list = f5718c.get(superclass);
            C9322n.m27778b(list);
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        C9322n.m27780d(interfaces, "klass.interfaces");
        for (Class<?> intrface : interfaces) {
            if (m7372e(intrface)) {
                C9322n.m27780d(intrface, "intrface");
                if (m7371d(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                List<Constructor<? extends InterfaceC1296d>> list2 = f5718c.get(intrface);
                C9322n.m27778b(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f5718c.put(cls, arrayList);
        return 2;
    }
}
