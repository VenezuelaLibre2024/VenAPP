package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Type, com.google.gson.f<?>> f12929a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12930b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class a<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f12931a;

        a(Type type) {
            this.f12931a = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            Type type = this.f12931a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.k("Invalid EnumMap type: " + this.f12931a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) new EnumMap((Class) type2);
            }
            throw new com.google.gson.k("Invalid EnumMap type: " + this.f12931a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class b<T> implements com.google.gson.internal.h<T> {
        b() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$c, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0183c<T> implements com.google.gson.internal.h<T> {
        C0183c() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class d<T> implements com.google.gson.internal.h<T> {
        d() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class e<T> implements com.google.gson.internal.h<T> {
        e() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class f<T> implements com.google.gson.internal.h<T> {
        f() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new com.google.gson.internal.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class g<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.gson.internal.l f12938a = com.google.gson.internal.l.b();

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f12939b;

        g(Class cls) {
            this.f12939b = cls;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            try {
                return (T) this.f12938a.c(this.f12939b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f12939b + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class h<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12941a;

        h(String str) {
            this.f12941a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new com.google.gson.k(this.f12941a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class i<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f12943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f12944b;

        i(com.google.gson.f fVar, Type type) {
            this.f12943a = fVar;
            this.f12944b = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) this.f12943a.a(this.f12944b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    class j<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.gson.f f12946a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Type f12947b;

        j(com.google.gson.f fVar, Type type) {
            this.f12946a = fVar;
            this.f12947b = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) this.f12946a.a(this.f12947b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class k<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12949a;

        k(String str) {
            this.f12949a = str;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            throw new com.google.gson.k(this.f12949a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class l<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f12951a;

        l(Constructor constructor) {
            this.f12951a = constructor;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            try {
                return (T) this.f12951a.newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f12951a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f12951a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class m<T> implements com.google.gson.internal.h<T> {
        m() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class n<T> implements com.google.gson.internal.h<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f12954a;

        n(Type type) {
            this.f12954a = type;
        }

        @Override // com.google.gson.internal.h
        public T a() {
            Type type = this.f12954a;
            if (!(type instanceof ParameterizedType)) {
                throw new com.google.gson.k("Invalid EnumSet type: " + this.f12954a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new com.google.gson.k("Invalid EnumSet type: " + this.f12954a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class o<T> implements com.google.gson.internal.h<T> {
        o() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class p<T> implements com.google.gson.internal.h<T> {
        p() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public class q<T> implements com.google.gson.internal.h<T> {
        q() {
        }

        @Override // com.google.gson.internal.h
        public T a() {
            return (T) new ArrayList();
        }
    }

    public c(Map<Type, com.google.gson.f<?>> map, boolean z10) {
        this.f12929a = map;
        this.f12930b = z10;
    }

    private <T> com.google.gson.internal.h<T> b(Class<? super T> cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            String c10 = mf.a.c(declaredConstructor);
            return c10 != null ? new k(c10) : new l(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> com.google.gson.internal.h<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new m() : EnumSet.class.isAssignableFrom(cls) ? new n(type) : Set.class.isAssignableFrom(cls) ? new o() : Queue.class.isAssignableFrom(cls) ? new p() : new q();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return cls == EnumMap.class ? new a(type) : ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new b() : ConcurrentMap.class.isAssignableFrom(cls) ? new C0183c() : SortedMap.class.isAssignableFrom(cls) ? new d() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(com.google.gson.reflect.a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new f() : new e();
        }
        return null;
    }

    private <T> com.google.gson.internal.h<T> d(Class<? super T> cls) {
        if (this.f12930b) {
            return new g(cls);
        }
        return new h("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public <T> com.google.gson.internal.h<T> a(com.google.gson.reflect.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        com.google.gson.f<?> fVar = this.f12929a.get(type);
        if (fVar != null) {
            return new i(fVar, type);
        }
        com.google.gson.f<?> fVar2 = this.f12929a.get(rawType);
        if (fVar2 != null) {
            return new j(fVar2, type);
        }
        com.google.gson.internal.h<T> b10 = b(rawType);
        if (b10 != null) {
            return b10;
        }
        com.google.gson.internal.h<T> c10 = c(type, rawType);
        return c10 != null ? c10 : d(rawType);
    }

    public String toString() {
        return this.f12929a.toString();
    }
}
