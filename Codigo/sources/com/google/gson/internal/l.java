package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* loaded from: classes2.dex */
public abstract class l {

    /* loaded from: classes2.dex */
    class a extends l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f12989a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f12990b;

        a(Method method, Object obj) {
            this.f12989a = method;
            this.f12990b = obj;
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) {
            l.a(cls);
            return (T) this.f12989a.invoke(this.f12990b, cls);
        }
    }

    /* loaded from: classes2.dex */
    class b extends l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f12991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f12992b;

        b(Method method, int i10) {
            this.f12991a = method;
            this.f12992b = i10;
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) {
            l.a(cls);
            return (T) this.f12991a.invoke(null, cls, Integer.valueOf(this.f12992b));
        }
    }

    /* loaded from: classes2.dex */
    class c extends l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Method f12993a;

        c(Method method) {
            this.f12993a = method;
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) {
            l.a(cls);
            return (T) this.f12993a.invoke(null, cls, Object.class);
        }
    }

    /* loaded from: classes2.dex */
    class d extends l {
        d() {
        }

        @Override // com.google.gson.internal.l
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static l b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new b(declaredMethod2, intValue);
                } catch (Exception unused2) {
                    return new d();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new c(declaredMethod3);
            }
        }
    }

    public abstract <T> T c(Class<T> cls);
}
