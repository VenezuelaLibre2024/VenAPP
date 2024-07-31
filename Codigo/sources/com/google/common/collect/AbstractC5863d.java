package com.google.common.collect;

import com.google.common.collect.AbstractC5869f;
import com.google.common.collect.C5882j0;
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
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.d */
/* loaded from: classes2.dex */
public abstract class AbstractC5863d<K, V> extends AbstractC5869f<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* renamed from: e */
    private transient Map<K, Collection<V>> f12267e;

    /* renamed from: f */
    private transient int f12268f;

    /* renamed from: com.google.common.collect.d$a */
    /* loaded from: classes2.dex */
    class a extends AbstractC5863d<K, V>.d<V> {
        a(AbstractC5863d abstractC5863d) {
            super();
        }

        @Override // com.google.common.collect.AbstractC5863d.d
        /* renamed from: a */
        V mo14802a(K k10, V v10) {
            return v10;
        }
    }

    /* renamed from: com.google.common.collect.d$b */
    /* loaded from: classes2.dex */
    class b extends AbstractC5863d<K, V>.d<Map.Entry<K, V>> {
        b(AbstractC5863d abstractC5863d) {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5863d.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo14802a(K k10, V v10) {
            return C5882j0.m14891d(k10, v10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.d$c */
    /* loaded from: classes2.dex */
    public class c extends C5882j0.f<K, Collection<V>> {

        /* renamed from: c */
        final transient Map<K, Collection<V>> f12269c;

        /* renamed from: com.google.common.collect.d$c$a */
        /* loaded from: classes2.dex */
        class a extends C5882j0.c<K, Collection<V>> {
            a() {
            }

            @Override // com.google.common.collect.C5882j0.c
            /* renamed from: c */
            Map<K, Collection<V>> mo14808c() {
                return c.this;
            }

            @Override // com.google.common.collect.C5882j0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C5881j.m14887c(c.this.f12269c.entrySet(), obj);
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
                AbstractC5863d.this.m14790x(entry.getKey());
                return true;
            }
        }

        /* renamed from: com.google.common.collect.d$c$b */
        /* loaded from: classes2.dex */
        class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a */
            final Iterator<Map.Entry<K, Collection<V>>> f12272a;

            /* renamed from: b */
            Collection<V> f12273b;

            b() {
                this.f12272a = c.this.f12269c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f12272a.next();
                this.f12273b = next.getValue();
                return c.this.m14807e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f12272a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                C7159o.m21319v(this.f12273b != null, "no calls to next() since the last call to remove()");
                this.f12272a.remove();
                AbstractC5863d.m14787p(AbstractC5863d.this, this.f12273b.size());
                this.f12273b.clear();
                this.f12273b = null;
            }
        }

        c(Map<K, Collection<V>> map) {
            this.f12269c = map;
        }

        @Override // com.google.common.collect.C5882j0.f
        /* renamed from: a */
        protected Set<Map.Entry<K, Collection<V>>> mo14804a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) C5882j0.m14895h(this.f12269c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC5863d.this.mo14746A(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f12269c == AbstractC5863d.this.f12267e) {
                AbstractC5863d.this.clear();
            } else {
                C5870f0.m14852c(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C5882j0.m14894g(this.f12269c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f12269c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> mo14797s = AbstractC5863d.this.mo14797s();
            mo14797s.addAll(remove);
            AbstractC5863d.m14787p(AbstractC5863d.this, remove.size());
            remove.clear();
            return mo14797s;
        }

        /* renamed from: e */
        Map.Entry<K, Collection<V>> m14807e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C5882j0.m14891d(key, AbstractC5863d.this.mo14746A(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f12269c.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f12269c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: keySet */
        public Set<K> mo14811g() {
            return AbstractC5863d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f12269c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f12269c.toString();
        }
    }

    /* renamed from: com.google.common.collect.d$d */
    /* loaded from: classes2.dex */
    private abstract class d<T> implements Iterator<T> {

        /* renamed from: a */
        final Iterator<Map.Entry<K, Collection<V>>> f12275a;

        /* renamed from: b */
        K f12276b = null;

        /* renamed from: c */
        Collection<V> f12277c = null;

        /* renamed from: d */
        Iterator<V> f12278d = C5870f0.m14857h();

        d() {
            this.f12275a = AbstractC5863d.this.f12267e.entrySet().iterator();
        }

        /* renamed from: a */
        abstract T mo14802a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12275a.hasNext() || this.f12278d.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f12278d.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f12275a.next();
                this.f12276b = next.getKey();
                Collection<V> value = next.getValue();
                this.f12277c = value;
                this.f12278d = value.iterator();
            }
            return mo14802a(C5894p0.m15029a(this.f12276b), this.f12278d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f12278d.remove();
            Collection<V> collection = this.f12277c;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f12275a.remove();
            }
            AbstractC5863d.m14785n(AbstractC5863d.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.d$e */
    /* loaded from: classes2.dex */
    public class e extends C5882j0.d<K, Collection<V>> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.d$e$a */
        /* loaded from: classes2.dex */
        public class a implements Iterator<K> {

            /* renamed from: a */
            Map.Entry<K, Collection<V>> f12281a;

            /* renamed from: b */
            final /* synthetic */ Iterator f12282b;

            a(Iterator it) {
                this.f12282b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f12282b.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f12282b.next();
                this.f12281a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                C7159o.m21319v(this.f12281a != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f12281a.getValue();
                this.f12282b.remove();
                AbstractC5863d.m14787p(AbstractC5863d.this, value.size());
                value.clear();
                this.f12281a = null;
            }
        }

        e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5870f0.m14852c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m14904c().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || m14904c().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m14904c().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(m14904c().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = m14904c().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                AbstractC5863d.m14787p(AbstractC5863d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.d$f */
    /* loaded from: classes2.dex */
    public class f extends AbstractC5863d<K, V>.i implements NavigableMap<K, Collection<V>> {
        f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo14812i().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return m14807e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return mo14812i().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(mo14812i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo14812i().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m14807e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = mo14812i().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return m14807e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return mo14812i().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new f(mo14812i().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = mo14812i().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return m14807e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return mo14812i().higherKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5863d.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo14810f() {
            return new g(mo14812i());
        }

        @Override // com.google.common.collect.AbstractC5863d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // com.google.common.collect.AbstractC5863d.i, com.google.common.collect.AbstractC5863d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: keySet, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo14811g() {
            return (NavigableSet) super.mo14811g();
        }

        /* renamed from: l */
        Map.Entry<K, Collection<V>> m14815l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> mo14797s = AbstractC5863d.this.mo14797s();
            mo14797s.addAll(next.getValue());
            it.remove();
            return C5882j0.m14891d(next.getKey(), AbstractC5863d.this.mo14749z(mo14797s));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo14812i().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m14807e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = mo14812i().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return m14807e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return mo14812i().lowerKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5863d.i
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo14812i() {
            return (NavigableMap) super.mo14812i();
        }

        @Override // com.google.common.collect.AbstractC5863d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo14811g();
        }

        @Override // com.google.common.collect.AbstractC5863d.i, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m14815l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m14815l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new f(mo14812i().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new f(mo14812i().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.d$g */
    /* loaded from: classes2.dex */
    public class g extends AbstractC5863d<K, V>.j implements NavigableSet<K> {
        g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return mo14819d().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(mo14819d().descendingMap());
        }

        @Override // com.google.common.collect.AbstractC5863d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return mo14819d().floorKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5863d.j
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo14819d() {
            return (NavigableMap) super.mo14819d();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new g(mo14819d().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return mo14819d().higherKey(k10);
        }

        @Override // com.google.common.collect.AbstractC5863d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractC5863d.j, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return mo14819d().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) C5870f0.m14864o(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) C5870f0.m14864o(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new g(mo14819d().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new g(mo14819d().tailMap(k10, z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.d$h */
    /* loaded from: classes2.dex */
    public class h extends AbstractC5863d<K, V>.l implements RandomAccess {
        h(AbstractC5863d abstractC5863d, K k10, List<V> list, AbstractC5863d<K, V>.k kVar) {
            super(k10, list, kVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.d$i */
    /* loaded from: classes2.dex */
    public class i extends AbstractC5863d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* renamed from: e */
        SortedSet<K> f12286e;

        i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo14812i().comparator();
        }

        /* renamed from: f */
        SortedSet<K> mo14810f() {
            return new j(mo14812i());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo14812i().firstKey();
        }

        @Override // com.google.common.collect.AbstractC5863d.c, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> mo14811g() {
            SortedSet<K> sortedSet = this.f12286e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> mo14810f = mo14810f();
            this.f12286e = mo14810f;
            return mo14810f;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new i(mo14812i().headMap(k10));
        }

        /* renamed from: i */
        SortedMap<K, Collection<V>> mo14812i() {
            return (SortedMap) this.f12269c;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo14812i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new i(mo14812i().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new i(mo14812i().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.d$j */
    /* loaded from: classes2.dex */
    public class j extends AbstractC5863d<K, V>.e implements SortedSet<K> {
        j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo14819d().comparator();
        }

        /* renamed from: d */
        SortedMap<K, Collection<V>> mo14819d() {
            return (SortedMap) super.m14904c();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo14819d().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new j(mo14819d().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo14819d().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new j(mo14819d().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new j(mo14819d().tailMap(k10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.d$k */
    /* loaded from: classes2.dex */
    public class k extends AbstractCollection<V> {

        /* renamed from: a */
        final K f12289a;

        /* renamed from: b */
        Collection<V> f12290b;

        /* renamed from: c */
        final AbstractC5863d<K, V>.k f12291c;

        /* renamed from: d */
        final Collection<V> f12292d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.d$k$a */
        /* loaded from: classes2.dex */
        public class a implements Iterator<V> {

            /* renamed from: a */
            final Iterator<V> f12294a;

            /* renamed from: b */
            final Collection<V> f12295b;

            a() {
                Collection<V> collection = k.this.f12290b;
                this.f12295b = collection;
                this.f12294a = AbstractC5863d.m14789w(collection);
            }

            a(Iterator<V> it) {
                this.f12295b = k.this.f12290b;
                this.f12294a = it;
            }

            /* renamed from: a */
            Iterator<V> m14830a() {
                m14831c();
                return this.f12294a;
            }

            /* renamed from: c */
            void m14831c() {
                k.this.m14828k();
                if (k.this.f12290b != this.f12295b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m14831c();
                return this.f12294a.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m14831c();
                return this.f12294a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f12294a.remove();
                AbstractC5863d.m14785n(AbstractC5863d.this);
                k.this.m14829l();
            }
        }

        k(K k10, Collection<V> collection, AbstractC5863d<K, V>.k kVar) {
            this.f12289a = k10;
            this.f12290b = collection;
            this.f12291c = kVar;
            this.f12292d = kVar == null ? null : kVar.m14826f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            m14828k();
            boolean isEmpty = this.f12290b.isEmpty();
            boolean add = this.f12290b.add(v10);
            if (add) {
                AbstractC5863d.m14784m(AbstractC5863d.this);
                if (isEmpty) {
                    m14824c();
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
            boolean addAll = this.f12290b.addAll(collection);
            if (addAll) {
                AbstractC5863d.m14786o(AbstractC5863d.this, this.f12290b.size() - size);
                if (size == 0) {
                    m14824c();
                }
            }
            return addAll;
        }

        /* renamed from: c */
        void m14824c() {
            AbstractC5863d<K, V>.k kVar = this.f12291c;
            if (kVar != null) {
                kVar.m14824c();
            } else {
                AbstractC5863d.this.f12267e.put(this.f12289a, this.f12290b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f12290b.clear();
            AbstractC5863d.m14787p(AbstractC5863d.this, size);
            m14829l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m14828k();
            return this.f12290b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m14828k();
            return this.f12290b.containsAll(collection);
        }

        /* renamed from: d */
        AbstractC5863d<K, V>.k m14825d() {
            return this.f12291c;
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m14828k();
            return this.f12290b.equals(obj);
        }

        /* renamed from: f */
        Collection<V> m14826f() {
            return this.f12290b;
        }

        /* renamed from: h */
        K m14827h() {
            return this.f12289a;
        }

        @Override // java.util.Collection
        public int hashCode() {
            m14828k();
            return this.f12290b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m14828k();
            return new a();
        }

        /* renamed from: k */
        void m14828k() {
            Collection<V> collection;
            AbstractC5863d<K, V>.k kVar = this.f12291c;
            if (kVar != null) {
                kVar.m14828k();
                if (this.f12291c.m14826f() != this.f12292d) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f12290b.isEmpty() || (collection = (Collection) AbstractC5863d.this.f12267e.get(this.f12289a)) == null) {
                    return;
                }
                this.f12290b = collection;
            }
        }

        /* renamed from: l */
        void m14829l() {
            AbstractC5863d<K, V>.k kVar = this.f12291c;
            if (kVar != null) {
                kVar.m14829l();
            } else if (this.f12290b.isEmpty()) {
                AbstractC5863d.this.f12267e.remove(this.f12289a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m14828k();
            boolean remove = this.f12290b.remove(obj);
            if (remove) {
                AbstractC5863d.m14785n(AbstractC5863d.this);
                m14829l();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f12290b.removeAll(collection);
            if (removeAll) {
                AbstractC5863d.m14786o(AbstractC5863d.this, this.f12290b.size() - size);
                m14829l();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            C7159o.m21312o(collection);
            int size = size();
            boolean retainAll = this.f12290b.retainAll(collection);
            if (retainAll) {
                AbstractC5863d.m14786o(AbstractC5863d.this, this.f12290b.size() - size);
                m14829l();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m14828k();
            return this.f12290b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m14828k();
            return this.f12290b.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.d$l */
    /* loaded from: classes2.dex */
    public class l extends AbstractC5863d<K, V>.k implements List<V> {

        /* renamed from: com.google.common.collect.d$l$a */
        /* loaded from: classes2.dex */
        private class a extends AbstractC5863d<K, V>.k.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i10) {
                super(l.this.m14832m().listIterator(i10));
            }

            /* renamed from: d */
            private ListIterator<V> m14833d() {
                return (ListIterator) m14830a();
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = l.this.isEmpty();
                m14833d().add(v10);
                AbstractC5863d.m14784m(AbstractC5863d.this);
                if (isEmpty) {
                    l.this.m14824c();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m14833d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m14833d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m14833d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m14833d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                m14833d().set(v10);
            }
        }

        l(K k10, List<V> list, AbstractC5863d<K, V>.k kVar) {
            super(k10, list, kVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            m14828k();
            boolean isEmpty = m14826f().isEmpty();
            m14832m().add(i10, v10);
            AbstractC5863d.m14784m(AbstractC5863d.this);
            if (isEmpty) {
                m14824c();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m14832m().addAll(i10, collection);
            if (addAll) {
                AbstractC5863d.m14786o(AbstractC5863d.this, m14826f().size() - size);
                if (size == 0) {
                    m14824c();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            m14828k();
            return m14832m().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m14828k();
            return m14832m().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m14828k();
            return m14832m().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m14828k();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            m14828k();
            return new a(i10);
        }

        /* renamed from: m */
        List<V> m14832m() {
            return (List) m14826f();
        }

        @Override // java.util.List
        public V remove(int i10) {
            m14828k();
            V remove = m14832m().remove(i10);
            AbstractC5863d.m14785n(AbstractC5863d.this);
            m14829l();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            m14828k();
            return m14832m().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            m14828k();
            return AbstractC5863d.this.m14791B(m14827h(), m14832m().subList(i10, i11), m14825d() == null ? this : m14825d());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5863d(Map<K, Collection<V>> map) {
        C7159o.m21301d(map.isEmpty());
        this.f12267e = map;
    }

    /* renamed from: m */
    static /* synthetic */ int m14784m(AbstractC5863d abstractC5863d) {
        int i10 = abstractC5863d.f12268f;
        abstractC5863d.f12268f = i10 + 1;
        return i10;
    }

    /* renamed from: n */
    static /* synthetic */ int m14785n(AbstractC5863d abstractC5863d) {
        int i10 = abstractC5863d.f12268f;
        abstractC5863d.f12268f = i10 - 1;
        return i10;
    }

    /* renamed from: o */
    static /* synthetic */ int m14786o(AbstractC5863d abstractC5863d, int i10) {
        int i11 = abstractC5863d.f12268f + i10;
        abstractC5863d.f12268f = i11;
        return i11;
    }

    /* renamed from: p */
    static /* synthetic */ int m14787p(AbstractC5863d abstractC5863d, int i10) {
        int i11 = abstractC5863d.f12268f - i10;
        abstractC5863d.f12268f = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public static <E> Iterator<E> m14789w(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m14790x(Object obj) {
        Collection collection = (Collection) C5882j0.m14896i(this.f12267e, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f12268f -= size;
        }
    }

    /* renamed from: A */
    abstract Collection<V> mo14746A(K k10, Collection<V> collection);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public final List<V> m14791B(K k10, List<V> list, AbstractC5863d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(this, k10, list, kVar) : new l(k10, list, kVar);
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    /* renamed from: a */
    public Collection<Map.Entry<K, V>> mo14737a() {
        return super.mo14737a();
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    public void clear() {
        Iterator<Collection<V>> it = this.f12267e.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f12267e.clear();
        this.f12268f = 0;
    }

    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: f */
    Collection<Map.Entry<K, V>> mo14792f() {
        return this instanceof InterfaceC5856a1 ? new AbstractC5869f.b(this) : new AbstractC5869f.a();
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    /* renamed from: get */
    public Collection<V> mo14739p(K k10) {
        Collection<V> collection = this.f12267e.get(k10);
        if (collection == null) {
            collection = m14798t(k10);
        }
        return mo14746A(k10, collection);
    }

    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: h */
    Collection<V> mo14793h() {
        return new AbstractC5869f.c();
    }

    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: i */
    Iterator<Map.Entry<K, V>> mo14794i() {
        return new b(this);
    }

    @Override // com.google.common.collect.AbstractC5869f
    /* renamed from: j */
    Iterator<V> mo14795j() {
        return new a(this);
    }

    @Override // com.google.common.collect.InterfaceC5884k0
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f12267e.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f12268f++;
            return true;
        }
        Collection<V> m14798t = m14798t(k10);
        if (!m14798t.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f12268f++;
        this.f12267e.put(k10, m14798t);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Map<K, Collection<V>> m14796r() {
        return this.f12267e;
    }

    /* renamed from: s */
    abstract Collection<V> mo14797s();

    @Override // com.google.common.collect.InterfaceC5884k0
    public int size() {
        return this.f12268f;
    }

    /* renamed from: t */
    Collection<V> m14798t(K k10) {
        return mo14797s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public final Map<K, Collection<V>> m14799u() {
        Map<K, Collection<V>> map = this.f12267e;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f12267e) : map instanceof SortedMap ? new i((SortedMap) this.f12267e) : new c(this.f12267e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public final Set<K> m14800v() {
        Map<K, Collection<V>> map = this.f12267e;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f12267e) : map instanceof SortedMap ? new j((SortedMap) this.f12267e) : new e(this.f12267e);
    }

    @Override // com.google.common.collect.AbstractC5869f, com.google.common.collect.InterfaceC5884k0
    public Collection<V> values() {
        return super.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final void m14801y(Map<K, Collection<V>> map) {
        this.f12267e = map;
        this.f12268f = 0;
        for (Collection<V> collection : map.values()) {
            C7159o.m21301d(!collection.isEmpty());
            this.f12268f += collection.size();
        }
    }

    /* renamed from: z */
    abstract <E> Collection<E> mo14749z(Collection<E> collection);
}
