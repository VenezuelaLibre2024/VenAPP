package com.google.protobuf;

import com.google.protobuf.t;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f13251a;

    /* renamed from: b, reason: collision with root package name */
    private List<j1<K, V>.e> f13252b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f13253c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13254d;

    /* renamed from: e, reason: collision with root package name */
    private volatile j1<K, V>.g f13255e;

    /* renamed from: f, reason: collision with root package name */
    private Map<K, V> f13256f;

    /* renamed from: r, reason: collision with root package name */
    private volatile j1<K, V>.c f13257r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: classes2.dex */
    public class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.j1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.j1
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> k10 = k(i10);
                    if (((t.b) k10.getKey()).c()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((t.b) entry.getKey()).c()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    /* loaded from: classes2.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f13258a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f13259b;

        private b() {
            this.f13258a = j1.this.f13252b.size();
        }

        /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f13259b == null) {
                this.f13259b = j1.this.f13256f.entrySet().iterator();
            }
            return this.f13259b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (a().hasNext()) {
                entry = a().next();
            } else {
                List list = j1.this.f13252b;
                int i10 = this.f13258a - 1;
                this.f13258a = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f13258a;
            return (i10 > 0 && i10 <= j1.this.f13252b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class c extends j1<K, V>.g {
        private c() {
            super(j1.this, null);
        }

        /* synthetic */ c(j1 j1Var, a aVar) {
            this();
        }

        @Override // com.google.protobuf.j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f13262a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f13263b = new b();

        /* loaded from: classes2.dex */
        class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes2.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f13262a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f13263b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class e implements Map.Entry<K, V>, Comparable<j1<K, V>.e> {

        /* renamed from: a, reason: collision with root package name */
        private final K f13264a;

        /* renamed from: b, reason: collision with root package name */
        private V f13265b;

        e(K k10, V v10) {
            this.f13264a = k10;
            this.f13265b = v10;
        }

        e(j1 j1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(j1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return h(this.f13264a, entry.getKey()) && h(this.f13265b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f13265b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f13264a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f13265b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f13264a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            j1.this.g();
            V v11 = this.f13265b;
            this.f13265b = v10;
            return v11;
        }

        public String toString() {
            return this.f13264a + "=" + this.f13265b;
        }
    }

    /* loaded from: classes2.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f13267a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f13268b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f13269c;

        private f() {
            this.f13267a = -1;
        }

        /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f13269c == null) {
                this.f13269c = j1.this.f13253c.entrySet().iterator();
            }
            return this.f13269c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f13268b = true;
            int i10 = this.f13267a + 1;
            this.f13267a = i10;
            return i10 < j1.this.f13252b.size() ? (Map.Entry<K, V>) j1.this.f13252b.get(this.f13267a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13267a + 1 >= j1.this.f13252b.size()) {
                return !j1.this.f13253c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f13268b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f13268b = false;
            j1.this.g();
            if (this.f13267a >= j1.this.f13252b.size()) {
                a().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i10 = this.f13267a;
            this.f13267a = i10 - 1;
            j1Var.t(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(j1 j1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            j1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return j1.this.size();
        }
    }

    private j1(int i10) {
        this.f13251a = i10;
        this.f13252b = Collections.emptyList();
        this.f13253c = Collections.emptyMap();
        this.f13256f = Collections.emptyMap();
    }

    /* synthetic */ j1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f13252b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f13252b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f13252b.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f13254d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        g();
        if (!this.f13252b.isEmpty() || (this.f13252b instanceof ArrayList)) {
            return;
        }
        this.f13252b = new ArrayList(this.f13251a);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f13253c.isEmpty() && !(this.f13253c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13253c = treeMap;
            this.f13256f = treeMap.descendingMap();
        }
        return (SortedMap) this.f13253c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends t.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i10) {
        g();
        V value = this.f13252b.remove(i10).getValue();
        if (!this.f13253c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f13252b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f13252b.isEmpty()) {
            this.f13252b.clear();
        }
        if (this.f13253c.isEmpty()) {
            return;
        }
        this.f13253c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f13253c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f13255e == null) {
            this.f13255e = new g(this, null);
        }
        return this.f13255e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int l10 = l();
        if (l10 != j1Var.l()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i10 = 0; i10 < l10; i10++) {
            if (!k(i10).equals(j1Var.k(i10))) {
                return false;
            }
        }
        if (l10 != size) {
            return this.f13253c.equals(j1Var.f13253c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f13252b.get(f10).getValue() : this.f13253c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += this.f13252b.get(i11).hashCode();
        }
        return m() > 0 ? i10 + this.f13253c.hashCode() : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> i() {
        if (this.f13257r == null) {
            this.f13257r = new c(this, null);
        }
        return this.f13257r;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f13252b.get(i10);
    }

    public int l() {
        return this.f13252b.size();
    }

    public int m() {
        return this.f13253c.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f13253c.isEmpty() ? d.b() : this.f13253c.entrySet();
    }

    public boolean p() {
        return this.f13254d;
    }

    public void q() {
        if (this.f13254d) {
            return;
        }
        this.f13253c = this.f13253c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13253c);
        this.f13256f = this.f13256f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13256f);
        this.f13254d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return (V) t(f10);
        }
        if (this.f13253c.isEmpty()) {
            return null;
        }
        return this.f13253c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f13252b.get(f10).setValue(v10);
        }
        j();
        int i10 = -(f10 + 1);
        if (i10 >= this.f13251a) {
            return o().put(k10, v10);
        }
        int size = this.f13252b.size();
        int i11 = this.f13251a;
        if (size == i11) {
            j1<K, V>.e remove = this.f13252b.remove(i11 - 1);
            o().put(remove.getKey(), remove.getValue());
        }
        this.f13252b.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f13252b.size() + this.f13253c.size();
    }
}