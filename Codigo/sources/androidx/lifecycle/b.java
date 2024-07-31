package androidx.lifecycle;

import androidx.lifecycle.f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    static b f4901c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, a> f4902a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f4903b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Map<f.a, List<C0068b>> f4904a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Map<C0068b, f.a> f4905b;

        a(Map<C0068b, f.a> map) {
            this.f4905b = map;
            for (Map.Entry<C0068b, f.a> entry : map.entrySet()) {
                f.a value = entry.getValue();
                List<C0068b> list = this.f4904a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4904a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        private static void b(List<C0068b> list, k kVar, f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(kVar, aVar, obj);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(k kVar, f.a aVar, Object obj) {
            b(this.f4904a.get(aVar), kVar, aVar, obj);
            b(this.f4904a.get(f.a.ON_ANY), kVar, aVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0068b {

        /* renamed from: a, reason: collision with root package name */
        final int f4906a;

        /* renamed from: b, reason: collision with root package name */
        final Method f4907b;

        C0068b(int i10, Method method) {
            this.f4906a = i10;
            this.f4907b = method;
            method.setAccessible(true);
        }

        void a(k kVar, f.a aVar, Object obj) {
            try {
                int i10 = this.f4906a;
                if (i10 == 0) {
                    this.f4907b.invoke(obj, new Object[0]);
                } else if (i10 == 1) {
                    this.f4907b.invoke(obj, kVar);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f4907b.invoke(obj, kVar, aVar);
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
            if (!(obj instanceof C0068b)) {
                return false;
            }
            C0068b c0068b = (C0068b) obj;
            return this.f4906a == c0068b.f4906a && this.f4907b.getName().equals(c0068b.f4907b.getName());
        }

        public int hashCode() {
            return (this.f4906a * 31) + this.f4907b.getName().hashCode();
        }
    }

    b() {
    }

    private a a(Class<?> cls, Method[] methodArr) {
        int i10;
        a c10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c10 = c(superclass)) != null) {
            hashMap.putAll(c10.f4905b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0068b, f.a> entry : c(cls2).f4905b.entrySet()) {
                e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            t tVar = (t) method.getAnnotation(t.class);
            if (tVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!k.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                f.a value = tVar.value();
                if (parameterTypes.length > 1) {
                    if (!f.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new C0068b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f4902a.put(cls, aVar);
        this.f4903b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e10) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
        }
    }

    private void e(Map<C0068b, f.a> map, C0068b c0068b, f.a aVar, Class<?> cls) {
        f.a aVar2 = map.get(c0068b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(c0068b, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0068b.f4907b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c(Class<?> cls) {
        a aVar = this.f4902a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d(Class<?> cls) {
        Boolean bool = this.f4903b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b10 = b(cls);
        for (Method method : b10) {
            if (((t) method.getAnnotation(t.class)) != null) {
                a(cls, b10);
                return true;
            }
        }
        this.f4903b.put(cls, Boolean.FALSE);
        return false;
    }
}
