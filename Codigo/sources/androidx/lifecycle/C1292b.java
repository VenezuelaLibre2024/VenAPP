package androidx.lifecycle;

import androidx.lifecycle.AbstractC1300f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
final class C1292b {

    /* renamed from: c */
    static C1292b f5655c = new C1292b();

    /* renamed from: a */
    private final Map<Class<?>, a> f5656a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f5657b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        final Map<AbstractC1300f.a, List<b>> f5658a = new HashMap();

        /* renamed from: b */
        final Map<b, AbstractC1300f.a> f5659b;

        a(Map<b, AbstractC1300f.a> map) {
            this.f5659b = map;
            for (Map.Entry<b, AbstractC1300f.a> entry : map.entrySet()) {
                AbstractC1300f.a value = entry.getValue();
                List<b> list = this.f5658a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f5658a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m7298b(List<b> list, InterfaceC1310k interfaceC1310k, AbstractC1300f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m7300a(interfaceC1310k, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m7299a(InterfaceC1310k interfaceC1310k, AbstractC1300f.a aVar, Object obj) {
            m7298b(this.f5658a.get(aVar), interfaceC1310k, aVar, obj);
            m7298b(this.f5658a.get(AbstractC1300f.a.ON_ANY), interfaceC1310k, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        final int f5660a;

        /* renamed from: b */
        final Method f5661b;

        b(int i10, Method method) {
            this.f5660a = i10;
            this.f5661b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m7300a(InterfaceC1310k interfaceC1310k, AbstractC1300f.a aVar, Object obj) {
            try {
                int i10 = this.f5660a;
                if (i10 == 0) {
                    this.f5661b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f5661b.invoke(obj, interfaceC1310k);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f5661b.invoke(obj, interfaceC1310k, aVar);
                }
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to call observer method", e11.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5660a == bVar.f5660a && this.f5661b.getName().equals(bVar.f5661b.getName());
        }

        public int hashCode() {
            return (this.f5660a * 31) + this.f5661b.getName().hashCode();
        }
    }

    C1292b() {
    }

    /* renamed from: a */
    private a m7293a(Class<?> cls, Method[] methodArr) {
        int i10;
        a m7296c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m7296c = m7296c(superclass)) != null) {
            hashMap.putAll(m7296c.f5659b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, AbstractC1300f.a> entry : m7296c(cls2).f5659b.entrySet()) {
                m7295e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m7294b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            InterfaceC1322t interfaceC1322t = (InterfaceC1322t) method.getAnnotation(InterfaceC1322t.class);
            if (interfaceC1322t != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!InterfaceC1310k.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                AbstractC1300f.a value = interfaceC1322t.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC1300f.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != AbstractC1300f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m7295e(hashMap, new b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f5656a.put(cls, aVar);
        this.f5657b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    /* renamed from: b */
    private Method[] m7294b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    /* renamed from: e */
    private void m7295e(Map<b, AbstractC1300f.a> map, b bVar, AbstractC1300f.a aVar, Class<?> cls) {
        AbstractC1300f.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f5661b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public a m7296c(Class<?> cls) {
        a aVar = this.f5656a.get(cls);
        return aVar != null ? aVar : m7293a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m7297d(Class<?> cls) {
        Boolean bool = this.f5657b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m7294b = m7294b(cls);
        for (Method method : m7294b) {
            if (((InterfaceC1322t) method.getAnnotation(InterfaceC1322t.class)) != null) {
                m7293a(cls, m7294b);
                return true;
            }
        }
        this.f5657b.put(cls, Boolean.FALSE);
        return false;
    }
}
