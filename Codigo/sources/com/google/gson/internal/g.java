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

/* loaded from: classes2.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    private static final Comparator<Comparable> f12962s = new a();

    /* renamed from: a, reason: collision with root package name */
    Comparator<? super K> f12963a;

    /* renamed from: b, reason: collision with root package name */
    e<K, V> f12964b;

    /* renamed from: c, reason: collision with root package name */
    int f12965c;

    /* renamed from: d, reason: collision with root package name */
    int f12966d;

    /* renamed from: e, reason: collision with root package name */
    final e<K, V> f12967e;

    /* renamed from: f, reason: collision with root package name */
    private g<K, V>.b f12968f;

    /* renamed from: r, reason: collision with root package name */
    private g<K, V>.c f12969r;

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

    /* loaded from: classes2.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes2.dex */
        class a extends g<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c10;
            if (!(obj instanceof Map.Entry) || (c10 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.f(c10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f12965c;
        }
    }

    /* loaded from: classes2.dex */
    final class c extends AbstractSet<K> {

        /* loaded from: classes2.dex */
        class a extends g<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f12983f;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return g.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return g.this.f12965c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f12974a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f12975b = null;

        /* renamed from: c, reason: collision with root package name */
        int f12976c;

        d() {
            this.f12974a = g.this.f12967e.f12981d;
            this.f12976c = g.this.f12966d;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f12974a;
            g gVar = g.this;
            if (eVar == gVar.f12967e) {
                throw new NoSuchElementException();
            }
            if (gVar.f12966d != this.f12976c) {
                throw new ConcurrentModificationException();
            }
            this.f12974a = eVar.f12981d;
            this.f12975b = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f12974a != g.this.f12967e;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f12975b;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            g.this.f(eVar, true);
            this.f12975b = null;
            this.f12976c = g.this.f12966d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        e<K, V> f12978a;

        /* renamed from: b, reason: collision with root package name */
        e<K, V> f12979b;

        /* renamed from: c, reason: collision with root package name */
        e<K, V> f12980c;

        /* renamed from: d, reason: collision with root package name */
        e<K, V> f12981d;

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f12982e;

        /* renamed from: f, reason: collision with root package name */
        final K f12983f;

        /* renamed from: r, reason: collision with root package name */
        V f12984r;

        /* renamed from: s, reason: collision with root package name */
        int f12985s;

        e() {
            this.f12983f = null;
            this.f12982e = this;
            this.f12981d = this;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f12978a = eVar;
            this.f12983f = k10;
            this.f12985s = 1;
            this.f12981d = eVar2;
            this.f12982e = eVar3;
            eVar3.f12981d = this;
            eVar2.f12982e = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f12979b; eVar2 != null; eVar2 = eVar2.f12979b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f12980c; eVar2 != null; eVar2 = eVar2.f12980c) {
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
            K k10 = this.f12983f;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f12984r;
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
            return this.f12983f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12984r;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f12983f;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f12984r;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f12984r;
            this.f12984r = v10;
            return v11;
        }

        public String toString() {
            return this.f12983f + "=" + this.f12984r;
        }
    }

    public g() {
        this(f12962s);
    }

    public g(Comparator<? super K> comparator) {
        this.f12965c = 0;
        this.f12966d = 0;
        this.f12967e = new e<>();
        this.f12963a = comparator == null ? f12962s : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f12979b;
            e<K, V> eVar3 = eVar.f12980c;
            int i10 = eVar2 != null ? eVar2.f12985s : 0;
            int i11 = eVar3 != null ? eVar3.f12985s : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f12979b;
                e<K, V> eVar5 = eVar3.f12980c;
                int i13 = (eVar4 != null ? eVar4.f12985s : 0) - (eVar5 != null ? eVar5.f12985s : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    k(eVar3);
                }
                j(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f12979b;
                e<K, V> eVar7 = eVar2.f12980c;
                int i14 = (eVar6 != null ? eVar6.f12985s : 0) - (eVar7 != null ? eVar7.f12985s : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    j(eVar2);
                }
                k(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f12985s = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f12985s = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f12978a;
        }
    }

    private void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f12978a;
        eVar.f12978a = null;
        if (eVar2 != null) {
            eVar2.f12978a = eVar3;
        }
        if (eVar3 == null) {
            this.f12964b = eVar2;
        } else if (eVar3.f12979b == eVar) {
            eVar3.f12979b = eVar2;
        } else {
            eVar3.f12980c = eVar2;
        }
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f12979b;
        e<K, V> eVar3 = eVar.f12980c;
        e<K, V> eVar4 = eVar3.f12979b;
        e<K, V> eVar5 = eVar3.f12980c;
        eVar.f12980c = eVar4;
        if (eVar4 != null) {
            eVar4.f12978a = eVar;
        }
        i(eVar, eVar3);
        eVar3.f12979b = eVar;
        eVar.f12978a = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f12985s : 0, eVar4 != null ? eVar4.f12985s : 0) + 1;
        eVar.f12985s = max;
        eVar3.f12985s = Math.max(max, eVar5 != null ? eVar5.f12985s : 0) + 1;
    }

    private void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f12979b;
        e<K, V> eVar3 = eVar.f12980c;
        e<K, V> eVar4 = eVar2.f12979b;
        e<K, V> eVar5 = eVar2.f12980c;
        eVar.f12979b = eVar5;
        if (eVar5 != null) {
            eVar5.f12978a = eVar;
        }
        i(eVar, eVar2);
        eVar2.f12980c = eVar;
        eVar.f12978a = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f12985s : 0, eVar5 != null ? eVar5.f12985s : 0) + 1;
        eVar.f12985s = max;
        eVar2.f12985s = Math.max(max, eVar4 != null ? eVar4.f12985s : 0) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    e<K, V> b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f12963a;
        e<K, V> eVar2 = this.f12964b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f12962s ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f12983f;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f12979b : eVar2.f12980c;
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
        e<K, V> eVar4 = this.f12967e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f12982e);
            if (i10 < 0) {
                eVar2.f12979b = eVar;
            } else {
                eVar2.f12980c = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == f12962s && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f12982e);
            this.f12964b = eVar;
        }
        this.f12965c++;
        this.f12966d++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d10 = d(entry.getKey());
        if (d10 != null && a(d10.f12984r, entry.getValue())) {
            return d10;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f12964b = null;
        this.f12965c = 0;
        this.f12966d++;
        e<K, V> eVar = this.f12967e;
        eVar.f12982e = eVar;
        eVar.f12981d = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.b bVar = this.f12968f;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f12968f = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f12982e;
            eVar2.f12981d = eVar.f12981d;
            eVar.f12981d.f12982e = eVar2;
        }
        e<K, V> eVar3 = eVar.f12979b;
        e<K, V> eVar4 = eVar.f12980c;
        e<K, V> eVar5 = eVar.f12978a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                i(eVar, eVar3);
                eVar.f12979b = null;
            } else if (eVar4 != null) {
                i(eVar, eVar4);
                eVar.f12980c = null;
            } else {
                i(eVar, null);
            }
            e(eVar5, false);
            this.f12965c--;
            this.f12966d++;
            return;
        }
        e<K, V> b10 = eVar3.f12985s > eVar4.f12985s ? eVar3.b() : eVar4.a();
        f(b10, false);
        e<K, V> eVar6 = eVar.f12979b;
        if (eVar6 != null) {
            i10 = eVar6.f12985s;
            b10.f12979b = eVar6;
            eVar6.f12978a = b10;
            eVar.f12979b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f12980c;
        if (eVar7 != null) {
            i11 = eVar7.f12985s;
            b10.f12980c = eVar7;
            eVar7.f12978a = b10;
            eVar.f12980c = null;
        }
        b10.f12985s = Math.max(i10, i11) + 1;
        i(eVar, b10);
    }

    e<K, V> g(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            return d10.f12984r;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        g<K, V>.c cVar = this.f12969r;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.c cVar2 = new c();
        this.f12969r = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> b10 = b(k10, true);
        V v11 = b10.f12984r;
        b10.f12984r = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g10 = g(obj);
        if (g10 != null) {
            return g10.f12984r;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12965c;
    }
}
