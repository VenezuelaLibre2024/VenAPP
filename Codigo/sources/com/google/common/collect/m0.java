package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a<K, V> extends c<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: r */
        transient eb.v<? extends List<V>> f11144r;

        a(Map<K, Collection<V>> map, eb.v<? extends List<V>> vVar) {
            super(map);
            this.f11144r = (eb.v) eb.o.o(vVar);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f11144r = (eb.v) objectInputStream.readObject();
            y((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f11144r);
            objectOutputStream.writeObject(r());
        }

        @Override // com.google.common.collect.d
        /* renamed from: D */
        public List<V> s() {
            return this.f11144r.get();
        }

        @Override // com.google.common.collect.f
        Map<K, Collection<V>> e() {
            return u();
        }

        @Override // com.google.common.collect.f
        Set<K> g() {
            return v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        abstract k0<K, V> c();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return c().size();
        }
    }

    public static boolean a(k0<?, ?> k0Var, Object obj) {
        if (obj == k0Var) {
            return true;
        }
        if (obj instanceof k0) {
            return k0Var.b().equals(((k0) obj).b());
        }
        return false;
    }

    public static <K, V> g0<K, V> b(Map<K, Collection<V>> map, eb.v<? extends List<V>> vVar) {
        return new a(map, vVar);
    }
}
