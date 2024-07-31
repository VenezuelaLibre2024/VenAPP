package com.google.common.collect;

import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.common.collect.z0 */
/* loaded from: classes2.dex */
final class C5914z0 {

    /* renamed from: com.google.common.collect.z0$b */
    /* loaded from: classes2.dex */
    static final class b<T> {

        /* renamed from: a */
        private final Field f12439a;

        private b(Field field) {
            this.f12439a = field;
            field.setAccessible(true);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public void m15139a(T t10, int i10) {
            try {
                this.f12439a.set(t10, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m15140b(T t10, Object obj) {
            try {
                this.f12439a.set(t10, obj);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> b<T> m15137a(Class<T> cls, String str) {
        try {
            return new b<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <K, V> void m15138b(InterfaceC5884k0<K, V> interfaceC5884k0, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(interfaceC5884k0.mo14748b().size());
        for (Map.Entry<K, Collection<V>> entry : interfaceC5884k0.mo14748b().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().size());
            Iterator<V> it = entry.getValue().iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }
}
