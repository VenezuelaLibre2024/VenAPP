package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p082eb.C7159o;
import p082eb.InterfaceC7166v;

/* renamed from: com.google.common.collect.m0 */
/* loaded from: classes2.dex */
public final class C5888m0 {

    /* renamed from: com.google.common.collect.m0$a */
    /* loaded from: classes2.dex */
    private static class a<K, V> extends AbstractC5860c<K, V> {
        private static final long serialVersionUID = 0;

        /* renamed from: r */
        transient InterfaceC7166v<? extends List<V>> f12359r;

        a(Map<K, Collection<V>> map, InterfaceC7166v<? extends List<V>> interfaceC7166v) {
            super(map);
            this.f12359r = (InterfaceC7166v) C7159o.m21312o(interfaceC7166v);
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.f12359r = (InterfaceC7166v) objectInputStream.readObject();
            m14801y((Map) objectInputStream.readObject());
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f12359r);
            objectOutputStream.writeObject(m14796r());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC5863d
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public List<V> mo14797s() {
            return this.f12359r.get();
        }

        @Override // com.google.common.collect.AbstractC5869f
        /* renamed from: e */
        Map<K, Collection<V>> mo14847e() {
            return m14799u();
        }

        @Override // com.google.common.collect.AbstractC5869f
        /* renamed from: g */
        Set<K> mo14848g() {
            return m14800v();
        }
    }

    /* renamed from: com.google.common.collect.m0$b */
    /* loaded from: classes2.dex */
    static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        /* renamed from: c */
        abstract InterfaceC5884k0<K, V> mo14849c();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            mo14849c().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo14849c().mo14845c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return mo14849c().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return mo14849c().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m15011a(InterfaceC5884k0<?, ?> interfaceC5884k0, Object obj) {
        if (obj == interfaceC5884k0) {
            return true;
        }
        if (obj instanceof InterfaceC5884k0) {
            return interfaceC5884k0.mo14748b().equals(((InterfaceC5884k0) obj).mo14748b());
        }
        return false;
    }

    /* renamed from: b */
    public static <K, V> InterfaceC5873g0<K, V> m15012b(Map<K, Collection<V>> map, InterfaceC7166v<? extends List<V>> interfaceC7166v) {
        return new a(map, interfaceC7166v);
    }
}
