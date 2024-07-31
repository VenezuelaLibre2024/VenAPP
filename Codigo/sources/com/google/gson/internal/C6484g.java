package com.google.gson.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: com.google.gson.internal.g */
/* loaded from: classes2.dex */
public final class C6484g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: s */
    private static final Comparator<Comparable> f14236s = new a();

    /* renamed from: a */
    Comparator<? super K> f14237a;

    /* renamed from: b */
    e<K, V> f14238b;

    /* renamed from: c */
    int f14239c;

    /* renamed from: d */
    int f14240d;

    /* renamed from: e */
    final e<K, V> f14241e;

    /* renamed from: f */
    private C6484g<K, V>.b f14242f;

    /* renamed from: r */
    private C6484g<K, V>.c f14243r;

    /* renamed from: com.google.gson.internal.g$a */
    /* loaded from: classes2.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.g$b */
    /* loaded from: classes2.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.g$b$a */
        /* loaded from: classes2.dex */
        class a extends C6484g<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m18254a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6484g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C6484g.this.m18248c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> m18248c;
            if (!(obj instanceof Map.Entry) || (m18248c = C6484g.this.m18248c((Map.Entry) obj)) == null) {
                return false;
            }
            C6484g.this.m18250f(m18248c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6484g.this.f14239c;
        }
    }

    /* renamed from: com.google.gson.internal.g$c */
    /* loaded from: classes2.dex */
    final class c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.g$c$a */
        /* loaded from: classes2.dex */
        class a extends C6484g<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m18254a().f14257f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6484g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C6484g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C6484g.this.m18251g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6484g.this.f14239c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.gson.internal.g$d */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a */
        e<K, V> f14248a;

        /* renamed from: b */
        e<K, V> f14249b = null;

        /* renamed from: c */
        int f14250c;

        d() {
            this.f14248a = C6484g.this.f14241e.f14255d;
            this.f14250c = C6484g.this.f14240d;
        }

        /* renamed from: a */
        final e<K, V> m18254a() {
            e<K, V> eVar = this.f14248a;
            C6484g c6484g = C6484g.this;
            if (eVar == c6484g.f14241e) {
                throw new NoSuchElementException();
            }
            if (c6484g.f14240d != this.f14250c) {
                throw new ConcurrentModificationException();
            }
            this.f14248a = eVar.f14255d;
            this.f14249b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f14248a != C6484g.this.f14241e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f14249b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            C6484g.this.m18250f(eVar, true);
            this.f14249b = null;
            this.f14250c = C6484g.this.f14240d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.g$e */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a */
        e<K, V> f14252a;

        /* renamed from: b */
        e<K, V> f14253b;

        /* renamed from: c */
        e<K, V> f14254c;

        /* renamed from: d */
        e<K, V> f14255d;

        /* renamed from: e */
        e<K, V> f14256e;

        /* renamed from: f */
        final K f14257f;

        /* renamed from: r */
        V f14258r;

        /* renamed from: s */
        int f14259s;

        e() {
            this.f14257f = null;
            this.f14256e = this;
            this.f14255d = this;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f14252a = eVar;
            this.f14257f = k10;
            this.f14259s = 1;
            this.f14255d = eVar2;
            this.f14256e = eVar3;
            eVar3.f14255d = this;
            eVar2.f14256e = this;
        }

        /* renamed from: a */
        public e<K, V> m18255a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f14253b; eVar2 != null; eVar2 = eVar2.f14253b) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public e<K, V> m18256b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f14254c; eVar2 != null; eVar2 = eVar2.f14254c) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f14257f;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f14258r;
            Object value = entry.getValue();
            if (v10 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v10.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f14257f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f14258r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f14257f;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f14258r;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f14258r;
            this.f14258r = v10;
            return v11;
        }

        public String toString() {
            return this.f14257f + "=" + this.f14258r;
        }
    }

    public C6484g() {
        this(f14236s);
    }

    public C6484g(Comparator<? super K> comparator) {
        this.f14239c = 0;
        this.f14240d = 0;
        this.f14241e = new e<>();
        this.f14237a = comparator == null ? f14236s : comparator;
    }

    /* renamed from: a */
    private boolean m18242a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: e */
    private void m18243e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f14253b;
            e<K, V> eVar3 = eVar.f14254c;
            int i10 = eVar2 != null ? eVar2.f14259s : 0;
            int i11 = eVar3 != null ? eVar3.f14259s : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f14253b;
                e<K, V> eVar5 = eVar3.f14254c;
                int i13 = (eVar4 != null ? eVar4.f14259s : 0) - (eVar5 != null ? eVar5.f14259s : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    m18246k(eVar3);
                }
                m18245j(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f14253b;
                e<K, V> eVar7 = eVar2.f14254c;
                int i14 = (eVar6 != null ? eVar6.f14259s : 0) - (eVar7 != null ? eVar7.f14259s : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    m18245j(eVar2);
                }
                m18246k(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f14259s = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f14259s = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f14252a;
        }
    }

    /* renamed from: i */
    private void m18244i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f14252a;
        eVar.f14252a = null;
        if (eVar2 != null) {
            eVar2.f14252a = eVar3;
        }
        if (eVar3 == null) {
            this.f14238b = eVar2;
        } else if (eVar3.f14253b == eVar) {
            eVar3.f14253b = eVar2;
        } else {
            eVar3.f14254c = eVar2;
        }
    }

    /* renamed from: j */
    private void m18245j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f14253b;
        e<K, V> eVar3 = eVar.f14254c;
        e<K, V> eVar4 = eVar3.f14253b;
        e<K, V> eVar5 = eVar3.f14254c;
        eVar.f14254c = eVar4;
        if (eVar4 != null) {
            eVar4.f14252a = eVar;
        }
        m18244i(eVar, eVar3);
        eVar3.f14253b = eVar;
        eVar.f14252a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f14259s : 0, eVar4 != null ? eVar4.f14259s : 0) + 1;
        eVar.f14259s = max;
        eVar3.f14259s = Math.max(max, eVar5 != null ? eVar5.f14259s : 0) + 1;
    }

    /* renamed from: k */
    private void m18246k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f14253b;
        e<K, V> eVar3 = eVar.f14254c;
        e<K, V> eVar4 = eVar2.f14253b;
        e<K, V> eVar5 = eVar2.f14254c;
        eVar.f14253b = eVar5;
        if (eVar5 != null) {
            eVar5.f14252a = eVar;
        }
        m18244i(eVar, eVar2);
        eVar2.f14254c = eVar;
        eVar.f14252a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f14259s : 0, eVar5 != null ? eVar5.f14259s : 0) + 1;
        eVar.f14259s = max;
        eVar2.f14259s = Math.max(max, eVar4 != null ? eVar4.f14259s : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* renamed from: b */
    e<K, V> m18247b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f14237a;
        e<K, V> eVar2 = this.f14238b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f14236s ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f14257f;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f14253b : eVar2.f14254c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f14241e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f14256e);
            if (i10 < 0) {
                eVar2.f14253b = eVar;
            } else {
                eVar2.f14254c = eVar;
            }
            m18243e(eVar2, true);
        } else {
            if (comparator == f14236s && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f14256e);
            this.f14238b = eVar;
        }
        this.f14239c++;
        this.f14240d++;
        return eVar;
    }

    /* renamed from: c */
    e<K, V> m18248c(Map.Entry<?, ?> entry) {
        e<K, V> m18249d = m18249d(entry.getKey());
        if (m18249d != null && m18242a(m18249d.f14258r, entry.getValue())) {
            return m18249d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f14238b = null;
        this.f14239c = 0;
        this.f14240d++;
        e<K, V> eVar = this.f14241e;
        eVar.f14256e = eVar;
        eVar.f14255d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m18249d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    e<K, V> m18249d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m18247b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C6484g<K, V>.b bVar = this.f14242f;
        if (bVar != null) {
            return bVar;
        }
        C6484g<K, V>.b bVar2 = new b();
        this.f14242f = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    void m18250f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f14256e;
            eVar2.f14255d = eVar.f14255d;
            eVar.f14255d.f14256e = eVar2;
        }
        e<K, V> eVar3 = eVar.f14253b;
        e<K, V> eVar4 = eVar.f14254c;
        e<K, V> eVar5 = eVar.f14252a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m18244i(eVar, eVar3);
                eVar.f14253b = null;
            } else if (eVar4 != null) {
                m18244i(eVar, eVar4);
                eVar.f14254c = null;
            } else {
                m18244i(eVar, null);
            }
            m18243e(eVar5, false);
            this.f14239c--;
            this.f14240d++;
            return;
        }
        e<K, V> m18256b = eVar3.f14259s > eVar4.f14259s ? eVar3.m18256b() : eVar4.m18255a();
        m18250f(m18256b, false);
        e<K, V> eVar6 = eVar.f14253b;
        if (eVar6 != null) {
            i10 = eVar6.f14259s;
            m18256b.f14253b = eVar6;
            eVar6.f14252a = m18256b;
            eVar.f14253b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f14254c;
        if (eVar7 != null) {
            i11 = eVar7.f14259s;
            m18256b.f14254c = eVar7;
            eVar7.f14252a = m18256b;
            eVar.f14254c = null;
        }
        m18256b.f14259s = Math.max(i10, i11) + 1;
        m18244i(eVar, m18256b);
    }

    /* renamed from: g */
    e<K, V> m18251g(Object obj) {
        e<K, V> m18249d = m18249d(obj);
        if (m18249d != null) {
            m18250f(m18249d, true);
        }
        return m18249d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> m18249d = m18249d(obj);
        if (m18249d != null) {
            return m18249d.f14258r;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C6484g<K, V>.c cVar = this.f14243r;
        if (cVar != null) {
            return cVar;
        }
        C6484g<K, V>.c cVar2 = new c();
        this.f14243r = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> m18247b = m18247b(k10, true);
        V v11 = m18247b.f14258r;
        m18247b.f14258r = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> m18251g = m18251g(obj);
        if (m18251g != null) {
            return m18251g.f14258r;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f14239c;
    }
}
