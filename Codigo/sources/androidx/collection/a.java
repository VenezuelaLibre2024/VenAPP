package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: s, reason: collision with root package name */
    g<K, V> f2830s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0029a extends g<K, V> {
        C0029a() {
        }

        @Override // androidx.collection.g
        protected void a() {
            a.this.clear();
        }

        @Override // androidx.collection.g
        protected Object b(int i10, int i11) {
            return a.this.f2875b[(i10 << 1) + i11];
        }

        @Override // androidx.collection.g
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // androidx.collection.g
        protected int d() {
            return a.this.f2876c;
        }

        @Override // androidx.collection.g
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // androidx.collection.g
        protected int f(Object obj) {
            return a.this.i(obj);
        }

        @Override // androidx.collection.g
        protected void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // androidx.collection.g
        protected void h(int i10) {
            a.this.l(i10);
        }

        @Override // androidx.collection.g
        protected V i(int i10, V v10) {
            return a.this.m(i10, v10);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(h hVar) {
        super(hVar);
    }

    private g<K, V> o() {
        if (this.f2830s == null) {
            this.f2830s = new C0029a();
        }
        return this.f2830s;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o().m();
    }

    public boolean p(Collection<?> collection) {
        return g.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f2876c + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o().n();
    }
}
