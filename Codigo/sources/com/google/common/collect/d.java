package com.google.common.collect;

import com.google.common.collect.f;
import com.google.common.collect.j0;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class d<K, V> extends com.google.common.collect.f<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: e, reason: collision with root package name */
    private transient Map<K, Collection<V>> f11052e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f11053f;

    /* loaded from: classes2.dex */
    class a extends d<K, V>.AbstractC0162d<V> {
        a(d dVar) {
            super();
        }

        @Override // com.google.common.collect.d.AbstractC0162d
        V a(K k10, V v10) {
            return v10;
        }
    }

    /* loaded from: classes2.dex */
    class b extends d<K, V>.AbstractC0162d<Map.Entry<K, V>> {
        b(d dVar) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.AbstractC0162d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k10, V v10) {
            return j0.d(k10, v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends j0.f<K, Collection<V>> {

        /* renamed from: c, reason: collision with root package name */
        final transient Map<K, Collection<V>> f11054c;

        /* loaded from: classes2.dex */
        class a extends j0.c<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.j0.c
            Map<K, Collection<V>> c() {
                return c.this;
            }

            @Override // com.google.common.collect.j0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return com.google.common.collect.j.c(c.this.f11054c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                d.this.x(entry.getKey());
                return true;
            }
        }

        /* loaded from: classes2.dex */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<Map.Entry<K, Collection<V>>> f11057a;

            /* renamed from: b, reason: collision with root package name */
            Collection<V> f11058b;

            b() {
                this.f11057a = c.this.f11054c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f11057a.next();
                this.f11058b = next.getValue();
                return c.this.e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11057a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                eb.o.v(this.f11058b != null, "no calls to next() since the last call to remove()");
                this.f11057a.remove();
                d.p(d.this, this.f11058b.size());
                this.f11058b.clear();
                this.f11058b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f11054c = map;
        }

        @Override // com.google.common.collect.j0.f
        protected Set<Map.Entry<K, Collection<V>>> a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) j0.h(this.f11054c, obj);
            if (collection == null) {
                return null;
            }
            return d.this.A(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f11054c == d.this.f11052e) {
                d.this.clear();
            } else {
                f0.c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return j0.g(this.f11054c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f11054c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> s10 = d.this.s();
            s10.addAll(remove);
            d.p(d.this, remove.size());
            remove.clear();
            return s10;
        }

        Map.Entry<K, Collection<V>> e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return j0.d(key, d.this.A(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f11054c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f11054c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> g() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f11054c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f11054c.toString();
        }
    }

    /* renamed from: com.google.common.collect.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    private abstract class AbstractC0162d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        final Iterator<Map.Entry<K, Collection<V>>> f11060a;

        /* renamed from: b, reason: collision with root package name */
        K f11061b = null;

        /* renamed from: c, reason: collision with root package name */
        Collection<V> f11062c = null;

        /* renamed from: d, reason: collision with root package name */
        Iterator<V> f11063d = f0.h();

        AbstractC0162d() {
            this.f11060a = d.this.f11052e.entrySet().iterator();
        }

        abstract T a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11060a.hasNext() || this.f11063d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f11063d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f11060a.next();
                this.f11061b = next.getKey();
                Collection<V> value = next.getValue();
                this.f11062c = value;
                this.f11063d = value.iterator();
            }
            return a(p0.a(this.f11061b), this.f11063d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f11063d.remove();
            Collection<V> collection = this.f11062c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f11060a.remove();
            }
            d.n(d.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e extends j0.d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Iterator<K> {

            /* renamed from: a, reason: collision with root package name */
            Map.Entry<K, Collection<V>> f11066a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f11067b;

            a(Iterator it) {
                this.f11067b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f11067b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f11067b.next();
                this.f11066a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                eb.o.v(this.f11066a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f11066a.getValue();
                this.f11067b.remove();
                d.p(d.this, value.size());
                value.clear();
                this.f11066a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f0.c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return c().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = c().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                d.p(d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = i().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return i().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = i().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return i().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(i().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = i().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return i().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> f() {
            return new g(i());
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // com.google.common.collect.d.i, com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return (NavigableSet) super.g();
        }

        Map.Entry<K, Collection<V>> l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> s10 = d.this.s();
            s10.addAll(next.getValue());
            it.remove();
            return j0.d(next.getKey(), d.this.z(s10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = i().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return i().lowerKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return g();
        }

        @Override // com.google.common.collect.d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(i().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class g extends d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return d().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(d().descendingMap());
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return d().floorKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d.j
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(d().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return d().higherKey(k10);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return d().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) f0.o(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) f0.o(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(d().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(d().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class h extends d<K, V>.l implements RandomAccess {
        h(d dVar, K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        SortedSet<K> f11071e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        SortedSet<K> f() {
            return new j(i());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return i().firstKey();
        }

        @Override // com.google.common.collect.d.c, java.util.AbstractMap, java.util.Map
        public SortedSet<K> g() {
            SortedSet<K> sortedSet = this.f11071e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> f10 = f();
            this.f11071e = f10;
            return f10;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(i().headMap(k10));
        }

        SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f11054c;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(i().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class j extends d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        SortedMap<K, Collection<V>> d() {
            return (SortedMap) super.c();
        }

        @Override // java.util.SortedSet
        public K first() {
            return d().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(d().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return d().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(d().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(d().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class k extends AbstractCollection<V> {

        /* renamed from: a, reason: collision with root package name */
        final K f11074a;

        /* renamed from: b, reason: collision with root package name */
        Collection<V> f11075b;

        /* renamed from: c, reason: collision with root package name */
        final d<K, V>.k f11076c;

        /* renamed from: d, reason: collision with root package name */
        final Collection<V> f11077d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes2.dex */
        public class a implements Iterator<V> {

            /* renamed from: a, reason: collision with root package name */
            final Iterator<V> f11079a;

            /* renamed from: b, reason: collision with root package name */
            final Collection<V> f11080b;

            a() {
                Collection<V> collection = k.this.f11075b;
                this.f11080b = collection;
                this.f11079a = d.w(collection);
            }

            a(Iterator<V> it) {
                this.f11080b = k.this.f11075b;
                this.f11079a = it;
            }

            Iterator<V> a() {
                c();
                return this.f11079a;
            }

            void c() {
                k.this.k();
                if (k.this.f11075b != this.f11080b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                c();
                return this.f11079a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                c();
                return this.f11079a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f11079a.remove();
                d.n(d.this);
                k.this.l();
            }
        }

        k(K k10, Collection<V> collection, d<K, V>.k kVar) {
            this.f11074a = k10;
            this.f11075b = collection;
            this.f11076c = kVar;
            this.f11077d = kVar == null ? null : kVar.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            k();
            boolean isEmpty = this.f11075b.isEmpty();
            boolean add = this.f11075b.add(v10);
            if (add) {
                d.m(d.this);
                if (isEmpty) {
                    c();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f11075b.addAll(collection);
            if (addAll) {
                d.o(d.this, this.f11075b.size() - size);
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        void c() {
            d<K, V>.k kVar = this.f11076c;
            if (kVar != null) {
                kVar.c();
            } else {
                d.this.f11052e.put(this.f11074a, this.f11075b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f11075b.clear();
            d.p(d.this, size);
            l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            k();
            return this.f11075b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            k();
            return this.f11075b.containsAll(collection);
        }

        d<K, V>.k d() {
            return this.f11076c;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            k();
            return this.f11075b.equals(obj);
        }

        Collection<V> f() {
            return this.f11075b;
        }

        K h() {
            return this.f11074a;
        }

        @Override // java.util.Collection
        public int hashCode() {
            k();
            return this.f11075b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            k();
            return new a();
        }

        void k() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f11076c;
            if (kVar != null) {
                kVar.k();
                if (this.f11076c.f() != this.f11077d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f11075b.isEmpty() || (collection = (Collection) d.this.f11052e.get(this.f11074a)) == null) {
                    return;
                }
                this.f11075b = collection;
            }
        }

        void l() {
            d<K, V>.k kVar = this.f11076c;
            if (kVar != null) {
                kVar.l();
            } else if (this.f11075b.isEmpty()) {
                d.this.f11052e.remove(this.f11074a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            k();
            boolean remove = this.f11075b.remove(obj);
            if (remove) {
                d.n(d.this);
                l();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f11075b.removeAll(collection);
            if (removeAll) {
                d.o(d.this, this.f11075b.size() - size);
                l();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            eb.o.o(collection);
            int size = size();
            boolean retainAll = this.f11075b.retainAll(collection);
            if (retainAll) {
                d.o(d.this, this.f11075b.size() - size);
                l();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            k();
            return this.f11075b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            k();
            return this.f11075b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class l extends d<K, V>.k implements List<V> {

        /* loaded from: classes2.dex */
        private class a extends d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i10) {
                super(l.this.m().listIterator(i10));
            }

            private ListIterator<V> d() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = l.this.isEmpty();
                d().add(v10);
                d.m(d.this);
                if (isEmpty) {
                    l.this.c();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                d().set(v10);
            }
        }

        l(K k10, List<V> list, d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            k();
            boolean isEmpty = f().isEmpty();
            m().add(i10, v10);
            d.m(d.this);
            if (isEmpty) {
                c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m().addAll(i10, collection);
            if (addAll) {
                d.o(d.this, f().size() - size);
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            k();
            return m().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            k();
            return m().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            k();
            return m().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            k();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            k();
            return new a(i10);
        }

        List<V> m() {
            return (List) f();
        }

        @Override // java.util.List
        public V remove(int i10) {
            k();
            V remove = m().remove(i10);
            d.n(d.this);
            l();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            k();
            return m().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            k();
            return d.this.B(h(), m().subList(i10, i11), d() == null ? this : d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Map<K, Collection<V>> map) {
        eb.o.d(map.isEmpty());
        this.f11052e = map;
    }

    static /* synthetic */ int m(d dVar) {
        int i10 = dVar.f11053f;
        dVar.f11053f = i10 + 1;
        return i10;
    }

    static /* synthetic */ int n(d dVar) {
        int i10 = dVar.f11053f;
        dVar.f11053f = i10 - 1;
        return i10;
    }

    static /* synthetic */ int o(d dVar, int i10) {
        int i11 = dVar.f11053f + i10;
        dVar.f11053f = i11;
        return i11;
    }

    static /* synthetic */ int p(d dVar, int i10) {
        int i11 = dVar.f11053f - i10;
        dVar.f11053f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Iterator<E> w(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj) {
        Collection collection = (Collection) j0.i(this.f11052e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f11053f -= size;
        }
    }

    abstract Collection<V> A(K k10, Collection<V> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<V> B(K k10, List<V> list, d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // com.google.common.collect.k0
    public void clear() {
        Iterator<Collection<V>> it = this.f11052e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f11052e.clear();
        this.f11053f = 0;
    }

    @Override // com.google.common.collect.f
    Collection<Map.Entry<K, V>> f() {
        return this instanceof a1 ? new f.b(this) : new f.a();
    }

    @Override // com.google.common.collect.k0
    /* renamed from: get */
    public Collection<V> p(K k10) {
        Collection<V> collection = this.f11052e.get(k10);
        if (collection == null) {
            collection = t(k10);
        }
        return A(k10, collection);
    }

    @Override // com.google.common.collect.f
    Collection<V> h() {
        return new f.c();
    }

    @Override // com.google.common.collect.f
    Iterator<Map.Entry<K, V>> i() {
        return new b(this);
    }

    @Override // com.google.common.collect.f
    Iterator<V> j() {
        return new a(this);
    }

    @Override // com.google.common.collect.k0
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f11052e.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f11053f++;
            return true;
        }
        Collection<V> t10 = t(k10);
        if (!t10.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f11053f++;
        this.f11052e.put(k10, t10);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<K, Collection<V>> r() {
        return this.f11052e;
    }

    abstract Collection<V> s();

    @Override // com.google.common.collect.k0
    public int size() {
        return this.f11053f;
    }

    Collection<V> t(K k10) {
        return s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, Collection<V>> u() {
        Map<K, Collection<V>> map = this.f11052e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f11052e) : map instanceof SortedMap ? new i((SortedMap) this.f11052e) : new c(this.f11052e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<K> v() {
        Map<K, Collection<V>> map = this.f11052e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f11052e) : map instanceof SortedMap ? new j((SortedMap) this.f11052e) : new e(this.f11052e);
    }

    @Override // com.google.common.collect.f, com.google.common.collect.k0
    public Collection<V> values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y(Map<K, Collection<V>> map) {
        this.f11052e = map;
        this.f11053f = 0;
        for (Collection<V> collection : map.values()) {
            eb.o.d(!collection.isEmpty());
            this.f11053f += collection.size();
        }
    }

    abstract <E> Collection<E> z(Collection<E> collection);
}
