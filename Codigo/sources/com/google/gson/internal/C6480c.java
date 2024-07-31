package com.google.gson.internal;

import com.google.gson.C6495k;
import com.google.gson.InterfaceC6423f;
import com.google.gson.reflect.C6503a;
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
import p239mf.C9579a;

/* renamed from: com.google.gson.internal.c */
/* loaded from: classes2.dex */
public final class C6480c {

    /* renamed from: a */
    private final Map<Type, InterfaceC6423f<?>> f14203a;

    /* renamed from: b */
    private final boolean f14204b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$a */
    /* loaded from: classes2.dex */
    public class a<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        final /* synthetic */ Type f14205a;

        a(Type type) {
            this.f14205a = type;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            Type type = this.f14205a;
            if (!(type instanceof ParameterizedType)) {
                throw new C6495k("Invalid EnumMap type: " + this.f14205a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) new EnumMap((Class) type2);
            }
            throw new C6495k("Invalid EnumMap type: " + this.f14205a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$b */
    /* loaded from: classes2.dex */
    public class b<T> implements InterfaceC6485h<T> {
        b() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new ConcurrentSkipListMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$c */
    /* loaded from: classes2.dex */
    public class c<T> implements InterfaceC6485h<T> {
        c() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new ConcurrentHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$d */
    /* loaded from: classes2.dex */
    public class d<T> implements InterfaceC6485h<T> {
        d() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new TreeMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$e */
    /* loaded from: classes2.dex */
    public class e<T> implements InterfaceC6485h<T> {
        e() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new LinkedHashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$f */
    /* loaded from: classes2.dex */
    public class f<T> implements InterfaceC6485h<T> {
        f() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new C6484g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$g */
    /* loaded from: classes2.dex */
    public class g<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        private final AbstractC6489l f14212a = AbstractC6489l.m18266b();

        /* renamed from: b */
        final /* synthetic */ Class f14213b;

        g(Class cls) {
            this.f14213b = cls;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            try {
                return (T) this.f14212a.mo18267c(this.f14213b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to create instance of " + this.f14213b + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$h */
    /* loaded from: classes2.dex */
    public class h<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        final /* synthetic */ String f14215a;

        h(String str) {
            this.f14215a = str;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            throw new C6495k(this.f14215a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$i */
    /* loaded from: classes2.dex */
    class i<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6423f f14217a;

        /* renamed from: b */
        final /* synthetic */ Type f14218b;

        i(InterfaceC6423f interfaceC6423f, Type type) {
            this.f14217a = interfaceC6423f;
            this.f14218b = type;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) this.f14217a.m18057a(this.f14218b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$j */
    /* loaded from: classes2.dex */
    class j<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6423f f14220a;

        /* renamed from: b */
        final /* synthetic */ Type f14221b;

        j(InterfaceC6423f interfaceC6423f, Type type) {
            this.f14220a = interfaceC6423f;
            this.f14221b = type;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) this.f14220a.m18057a(this.f14221b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$k */
    /* loaded from: classes2.dex */
    public class k<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        final /* synthetic */ String f14223a;

        k(String str) {
            this.f14223a = str;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            throw new C6495k(this.f14223a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$l */
    /* loaded from: classes2.dex */
    public class l<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        final /* synthetic */ Constructor f14225a;

        l(Constructor constructor) {
            this.f14225a = constructor;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            try {
                return (T) this.f14225a.newInstance(new Object[0]);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Failed to invoke " + this.f14225a + " with no args", e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Failed to invoke " + this.f14225a + " with no args", e12.getTargetException());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$m */
    /* loaded from: classes2.dex */
    public class m<T> implements InterfaceC6485h<T> {
        m() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new TreeSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$n */
    /* loaded from: classes2.dex */
    public class n<T> implements InterfaceC6485h<T> {

        /* renamed from: a */
        final /* synthetic */ Type f14228a;

        n(Type type) {
            this.f14228a = type;
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            Type type = this.f14228a;
            if (!(type instanceof ParameterizedType)) {
                throw new C6495k("Invalid EnumSet type: " + this.f14228a.toString());
            }
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return (T) EnumSet.noneOf((Class) type2);
            }
            throw new C6495k("Invalid EnumSet type: " + this.f14228a.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$o */
    /* loaded from: classes2.dex */
    public class o<T> implements InterfaceC6485h<T> {
        o() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new LinkedHashSet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$p */
    /* loaded from: classes2.dex */
    public class p<T> implements InterfaceC6485h<T> {
        p() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new ArrayDeque();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.gson.internal.c$q */
    /* loaded from: classes2.dex */
    public class q<T> implements InterfaceC6485h<T> {
        q() {
        }

        @Override // com.google.gson.internal.InterfaceC6485h
        /* renamed from: a */
        public T mo18235a() {
            return (T) new ArrayList();
        }
    }

    public C6480c(Map<Type, InterfaceC6423f<?>> map, boolean z10) {
        this.f14203a = map;
        this.f14204b = z10;
    }

    /* renamed from: b */
    private <T> InterfaceC6485h<T> m18231b(Class<? super T> cls) {
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            String m28530c = C9579a.m28530c(declaredConstructor);
            return m28530c != null ? new k(m28530c) : new l(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private <T> InterfaceC6485h<T> m18232c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new m() : EnumSet.class.isAssignableFrom(cls) ? new n(type) : Set.class.isAssignableFrom(cls) ? new o() : Queue.class.isAssignableFrom(cls) ? new p() : new q();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return cls == EnumMap.class ? new a(type) : ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new b() : ConcurrentMap.class.isAssignableFrom(cls) ? new c() : SortedMap.class.isAssignableFrom(cls) ? new d() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(C6503a.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new f() : new e();
        }
        return null;
    }

    /* renamed from: d */
    private <T> InterfaceC6485h<T> m18233d(Class<? super T> cls) {
        if (this.f14204b) {
            return new g(cls);
        }
        return new h("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    /* renamed from: a */
    public <T> InterfaceC6485h<T> m18234a(C6503a<T> c6503a) {
        Type type = c6503a.getType();
        Class<? super T> rawType = c6503a.getRawType();
        InterfaceC6423f<?> interfaceC6423f = this.f14203a.get(type);
        if (interfaceC6423f != null) {
            return new i(interfaceC6423f, type);
        }
        InterfaceC6423f<?> interfaceC6423f2 = this.f14203a.get(rawType);
        if (interfaceC6423f2 != null) {
            return new j(interfaceC6423f2, type);
        }
        InterfaceC6485h<T> m18231b = m18231b(rawType);
        if (m18231b != null) {
            return m18231b;
        }
        InterfaceC6485h<T> m18232c = m18232c(type, rawType);
        return m18232c != null ? m18232c : m18233d(rawType);
    }

    public String toString() {
        return this.f14203a.toString();
    }
}
