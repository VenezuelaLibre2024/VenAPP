package com.google.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.google.gson.internal.l */
/* loaded from: classes2.dex */
public abstract class AbstractC6489l {

    /* renamed from: com.google.gson.internal.l$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC6489l {

        /* renamed from: a */
        final /* synthetic */ Method f14263a;

        /* renamed from: b */
        final /* synthetic */ Object f14264b;

        a(Method method, Object obj) {
            this.f14263a = method;
            this.f14264b = obj;
        }

        @Override // com.google.gson.internal.AbstractC6489l
        /* renamed from: c */
        public <T> T mo18267c(Class<T> cls) {
            AbstractC6489l.m18265a(cls);
            return (T) this.f14263a.invoke(this.f14264b, cls);
        }
    }

    /* renamed from: com.google.gson.internal.l$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC6489l {

        /* renamed from: a */
        final /* synthetic */ Method f14265a;

        /* renamed from: b */
        final /* synthetic */ int f14266b;

        b(Method method, int i10) {
            this.f14265a = method;
            this.f14266b = i10;
        }

        @Override // com.google.gson.internal.AbstractC6489l
        /* renamed from: c */
        public <T> T mo18267c(Class<T> cls) {
            AbstractC6489l.m18265a(cls);
            return (T) this.f14265a.invoke(null, cls, Integer.valueOf(this.f14266b));
        }
    }

    /* renamed from: com.google.gson.internal.l$c */
    /* loaded from: classes2.dex */
    class c extends AbstractC6489l {

        /* renamed from: a */
        final /* synthetic */ Method f14267a;

        c(Method method) {
            this.f14267a = method;
        }

        @Override // com.google.gson.internal.AbstractC6489l
        /* renamed from: c */
        public <T> T mo18267c(Class<T> cls) {
            AbstractC6489l.m18265a(cls);
            return (T) this.f14267a.invoke(null, cls, Object.class);
        }
    }

    /* renamed from: com.google.gson.internal.l$d */
    /* loaded from: classes2.dex */
    class d extends AbstractC6489l {
        d() {
        }

        @Override // com.google.gson.internal.AbstractC6489l
        /* renamed from: c */
        public <T> T mo18267c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    /* renamed from: a */
    static void m18265a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    /* renamed from: b */
    public static AbstractC6489l m18266b() {
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

    /* renamed from: c */
    public abstract <T> T mo18267c(Class<T> cls);
}
