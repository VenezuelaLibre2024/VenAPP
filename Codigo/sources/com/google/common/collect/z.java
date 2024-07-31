package com.google.common.collect;

import com.google.common.collect.z0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class z<K, V> extends g<K, V> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    final transient y<K, ? extends u<V>> f11208e;

    /* renamed from: f */
    final transient int f11209f;

    /* loaded from: classes2.dex */
    public class a extends h1<Map.Entry<K, V>> {

        /* renamed from: a */
        final Iterator<? extends Map.Entry<K, ? extends u<V>>> f11210a;

        /* renamed from: b */
        K f11211b = null;

        /* renamed from: c */
        Iterator<V> f11212c = f0.f();

        a() {
            this.f11210a = z.this.f11208e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (!this.f11212c.hasNext()) {
                Map.Entry<K, ? extends u<V>> next = this.f11210a.next();
                this.f11211b = next.getKey();
                this.f11212c = next.getValue().iterator();
            }
            K k10 = this.f11211b;
            Objects.requireNonNull(k10);
            return j0.d(k10, this.f11212c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11212c.hasNext() || this.f11210a.hasNext();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends h1<V> {

        /* renamed from: a */
        Iterator<? extends u<V>> f11214a;

        /* renamed from: b */
        Iterator<V> f11215b = f0.f();

        b() {
            this.f11214a = z.this.f11208e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11215b.hasNext() || this.f11214a.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f11215b.hasNext()) {
                this.f11215b = this.f11214a.next().iterator();
            }
            return this.f11215b.next();
        }
    }

    /* loaded from: classes2.dex */
    public static class c<K, V> {

        /* renamed from: a */
        final Map<K, Collection<V>> f11217a = s0.e();

        /* renamed from: b */
        Comparator<? super K> f11218b;

        /* renamed from: c */
        Comparator<? super V> f11219c;

        public z<K, V> a() {
            Collection entrySet = this.f11217a.entrySet();
            Comparator<? super K> comparator = this.f11218b;
            if (comparator != null) {
                entrySet = r0.a(comparator).d().b(entrySet);
            }
            return x.t(entrySet, this.f11219c);
        }

        Collection<V> b() {
            return new ArrayList();
        }

        public c<K, V> c(K k10, V v10) {
            i.a(k10, v10);
            Collection<V> collection = this.f11217a.get(k10);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f11217a;
                Collection<V> b10 = b();
                map.put(k10, b10);
                collection = b10;
            }
            collection.add(v10);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static class d<K, V> extends u<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        final z<K, V> f11220b;

        d(z<K, V> zVar) {
            this.f11220b = zVar;
        }

        @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f11220b.c(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public h1<Map.Entry<K, V>> iterator() {
            return this.f11220b.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f11220b.size();
        }
    }

    /* loaded from: classes2.dex */
    static class e {

        /* renamed from: a */
        static final z0.b<z> f11221a = z0.a(z.class, "map");

        /* renamed from: b */
        static final z0.b<z> f11222b = z0.a(z.class, "size");
    }

    /* loaded from: classes2.dex */
    public static final class f<K, V> extends u<V> {
        private static final long serialVersionUID = 0;

        /* renamed from: b */
        private final transient z<K, V> f11223b;

        f(z<K, V> zVar) {
            this.f11223b = zVar;
        }

        @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11223b.d(obj);
        }

        @Override // com.google.common.collect.u
        public int d(Object[] objArr, int i10) {
            h1<? extends u<V>> it = this.f11223b.f11208e.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().d(objArr, i10);
            }
            return i10;
        }

        @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public h1<V> iterator() {
            return this.f11223b.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f11223b.size();
        }
    }

    public z(y<K, ? extends u<V>> yVar, int i10) {
        this.f11208e = yVar;
        this.f11209f = i10;
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // com.google.common.collect.k0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f
    public boolean d(Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // com.google.common.collect.f
    Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.f
    Set<K> g() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    /* renamed from: k */
    public y<K, Collection<V>> b() {
        return this.f11208e;
    }

    @Override // com.google.common.collect.f
    /* renamed from: l */
    public u<Map.Entry<K, V>> f() {
        return new d(this);
    }

    @Override // com.google.common.collect.f
    /* renamed from: m */
    public u<V> h() {
        return new f(this);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    /* renamed from: n */
    public u<Map.Entry<K, V>> a() {
        return (u) super.a();
    }

    @Override // com.google.common.collect.f
    /* renamed from: o */
    public h1<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // com.google.common.collect.k0
    public abstract u<V> p(K k10);

    @Override // com.google.common.collect.k0
    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    /* renamed from: q */
    public a0<K> keySet() {
        return this.f11208e.keySet();
    }

    @Override // com.google.common.collect.f
    /* renamed from: r */
    public h1<V> j() {
        return new b();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    /* renamed from: s */
    public u<V> values() {
        return (u) super.values();
    }

    @Override // com.google.common.collect.k0
    public int size() {
        return this.f11209f;
    }

    @Override // com.google.common.collect.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
