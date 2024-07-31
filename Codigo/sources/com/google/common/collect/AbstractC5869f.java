package com.google.common.collect;

import com.google.common.collect.C5888m0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.collect.f */
/* loaded from: classes2.dex */
abstract class AbstractC5869f<K, V> implements InterfaceC5884k0<K, V> {

    /* renamed from: a */
    private transient Collection<Map.Entry<K, V>> f12300a;

    /* renamed from: b */
    private transient Set<K> f12301b;

    /* renamed from: c */
    private transient Collection<V> f12302c;

    /* renamed from: d */
    private transient Map<K, Collection<V>> f12303d;

    /* renamed from: com.google.common.collect.f$a */
    /* loaded from: classes2.dex */
    class a extends C5888m0.b<K, V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // com.google.common.collect.C5888m0.b
        /* renamed from: c */
        InterfaceC5884k0<K, V> mo14849c() {
            return AbstractC5869f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC5869f.this.mo14794i();
        }
    }

    /* renamed from: com.google.common.collect.f$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5869f<K, V>.a implements Set<Map.Entry<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(AbstractC5869f abstractC5869f) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return C5862c1.m14771a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C5862c1.m14774d(this);
        }
    }

    /* renamed from: com.google.common.collect.f$c */
    /* loaded from: classes2.dex */
    class c extends AbstractCollection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC5869f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC5869f.this.mo14846d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC5869f.this.mo14795j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC5869f.this.size();
        }
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo14737a() {
        Collection<Map.Entry<K, V>> collection = this.f12300a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> mo14792f = mo14792f();
        this.f12300a = mo14792f;
        return mo14792f;
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    /* renamed from: b */
    public Map<K, Collection<V>> mo14748b() {
        Map<K, Collection<V>> map = this.f12303d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mo14847e = mo14847e();
        this.f12303d = mo14847e;
        return mo14847e;
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    /* renamed from: c */
    public boolean mo14845c(Object obj, Object obj2) {
        Collection<V> collection = mo14748b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: d */
    public boolean mo14846d(Object obj) {
        Iterator<Collection<V>> it = mo14748b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    abstract Map<K, Collection<V>> mo14847e();

    public boolean equals(Object obj) {
        return C5888m0.m15011a(this, obj);
    }

    /* renamed from: f */
    abstract Collection<Map.Entry<K, V>> mo14792f();

    /* renamed from: g */
    abstract Set<K> mo14848g();

    /* renamed from: h */
    abstract Collection<V> mo14793h();

    public int hashCode() {
        return mo14748b().hashCode();
    }

    /* renamed from: i */
    abstract Iterator<Map.Entry<K, V>> mo14794i();

    /* renamed from: j */
    abstract Iterator<V> mo14795j();

    @Override // com.google.common.collect.InterfaceC5884k0
    public Set<K> keySet() {
        Set<K> set = this.f12301b;
        if (set != null) {
            return set;
        }
        Set<K> mo14848g = mo14848g();
        this.f12301b = mo14848g;
        return mo14848g;
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = mo14748b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo14748b().toString();
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    public Collection<V> values() {
        Collection<V> collection = this.f12302c;
        if (collection != null) {
            return collection;
        }
        Collection<V> mo14793h = mo14793h();
        this.f12302c = mo14793h;
        return mo14793h;
    }
}
