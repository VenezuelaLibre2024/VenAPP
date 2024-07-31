package com.google.common.collect;

import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class z0 {

    /* loaded from: classes2.dex */
    static final class b<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Field f11224a;

        private b(Field field) {
            this.f11224a = field;
            field.setAccessible(true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(T t10, int i10) {
            try {
                this.f11224a.set(t10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(T t10, Object obj) {
            try {
                this.f11224a.set(t10, obj);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> b<T> a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void b(k0<K, V> k0Var, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(k0Var.b().size());
        for (Map.Entry<K, Collection<V>> entry : k0Var.b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
