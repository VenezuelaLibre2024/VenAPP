package com.google.common.collect;

import com.google.common.collect.m0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
abstract class f<K, V> implements k0<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private transient Collection<Map.Entry<K, V>> f11085a;

    /* renamed from: b, reason: collision with root package name */
    private transient Set<K> f11086b;

    /* renamed from: c, reason: collision with root package name */
    private transient Collection<V> f11087c;

    /* renamed from: d, reason: collision with root package name */
    private transient Map<K, Collection<V>> f11088d;

    /* loaded from: classes2.dex */
    class a extends m0.b<K, V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a() {
        }

        @Override // com.google.common.collect.m0.b
        k0<K, V> c() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.i();
        }
    }

    /* loaded from: classes2.dex */
    class b extends f<K, V>.a implements Set<Map.Entry<K, V>> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(f fVar) {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return c1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return c1.d(this);
        }
    }

    /* loaded from: classes2.dex */
    class c extends AbstractCollection<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    @Override // com.google.common.collect.k0
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f11085a;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> f10 = f();
        this.f11085a = f10;
        return f10;
    }

    @Override // com.google.common.collect.k0
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f11088d;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> e10 = e();
        this.f11088d = e10;
        return e10;
    }

    @Override // com.google.common.collect.k0
    public boolean c(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map<K, Collection<V>> e();

    public boolean equals(Object obj) {
        return m0.a(this, obj);
    }

    abstract Collection<Map.Entry<K, V>> f();

    abstract Set<K> g();

    abstract Collection<V> h();

    public int hashCode() {
        return b().hashCode();
    }

    abstract Iterator<Map.Entry<K, V>> i();

    abstract Iterator<V> j();

    @Override // com.google.common.collect.k0
    public Set<K> keySet() {
        Set<K> set = this.f11086b;
        if (set != null) {
            return set;
        }
        Set<K> g10 = g();
        this.f11086b = g10;
        return g10;
    }

    @Override // com.google.common.collect.k0
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // com.google.common.collect.k0
    public Collection<V> values() {
        Collection<V> collection = this.f11087c;
        if (collection != null) {
            return collection;
        }
        Collection<V> h10 = h();
        this.f11087c = h10;
        return h10;
    }
}
