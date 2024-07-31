package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.u;
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

/* loaded from: classes2.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f11428a;

    /* renamed from: b */
    private List<j1<K, V>.e> f11429b;

    /* renamed from: c */
    private Map<K, V> f11430c;

    /* renamed from: d */
    private boolean f11431d;

    /* renamed from: e */
    private volatile j1<K, V>.g f11432e;

    /* renamed from: f */
    private Map<K, V> f11433f;

    /* renamed from: r */
    private volatile j1<K, V>.c f11434r;

    /* loaded from: classes2.dex */
    public class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.j1
        public void q() {
            if (!p()) {
                for (int i10 = 0; i10 < l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> k10 = k(i10);
                    if (((u.b) k10.getKey()).c()) {
                        k10.setValue(Collections.unmodifiableList((List) k10.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : n()) {
                    if (((u.b) entry.getKey()).c()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    /* loaded from: classes2.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f11435a;

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> f11436b;

        private b() {
            this.f11435a = j1.this.f11429b.size();
        }

        /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f11436b == null) {
                this.f11436b = j1.this.f11433f.entrySet().iterator();
            }
            return this.f11436b;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (a().hasNext()) {
                entry = a().next();
            } else {
                List list = j1.this.f11429b;
                int i10 = this.f11435a - 1;
                this.f11435a = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f11435a;
            return (i10 > 0 && i10 <= j1.this.f11429b.size()) || a().hasNext();
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

        @Override // com.google.crypto.tink.shaded.protobuf.j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, null);
        }
    }

    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        private static final Iterator<Object> f11439a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f11440b = new b();

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
                return d.f11439a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f11440b;
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Map.Entry<K, V>, Comparable<j1<K, V>.e> {

        /* renamed from: a */
        private final K f11441a;

        /* renamed from: b */
        private V f11442b;

        e(K k10, V v10) {
            this.f11441a = k10;
            this.f11442b = v10;
        }

        e(j1 j1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
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
            return h(this.f11441a, entry.getKey()) && h(this.f11442b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f11442b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f11441a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f11442b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: i */
        public K getKey() {
            return this.f11441a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            j1.this.g();
            V v11 = this.f11442b;
            this.f11442b = v10;
            return v11;
        }

        public String toString() {
            return this.f11441a + "=" + this.f11442b;
        }
    }

    /* loaded from: classes2.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f11444a;

        /* renamed from: b */
        private boolean f11445b;

        /* renamed from: c */
        private Iterator<Map.Entry<K, V>> f11446c;

        private f() {
            this.f11444a = -1;
        }

        /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f11446c == null) {
                this.f11446c = j1.this.f11430c.entrySet().iterator();
            }
            return this.f11446c;
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f11445b = true;
            int i10 = this.f11444a + 1;
            this.f11444a = i10;
            return i10 < j1.this.f11429b.size() ? (Map.Entry<K, V>) j1.this.f11429b.get(this.f11444a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f11444a + 1 >= j1.this.f11429b.size()) {
                return !j1.this.f11430c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f11445b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f11445b = false;
            j1.this.g();
            if (this.f11444a >= j1.this.f11429b.size()) {
                a().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i10 = this.f11444a;
            this.f11444a = i10 - 1;
            j1Var.t(i10);
        }
    }

    /* loaded from: classes2.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(j1 j1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c */
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
        this.f11428a = i10;
        this.f11429b = Collections.emptyList();
        this.f11430c = Collections.emptyMap();
        this.f11433f = Collections.emptyMap();
    }

    /* synthetic */ j1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f11429b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f11429b.get(size).getKey());
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
            int compareTo2 = k10.compareTo(this.f11429b.get(i11).getKey());
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

    public void g() {
        if (this.f11431d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        g();
        if (!this.f11429b.isEmpty() || (this.f11429b instanceof ArrayList)) {
            return;
        }
        this.f11429b = new ArrayList(this.f11428a);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f11430c.isEmpty() && !(this.f11430c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11430c = treeMap;
            this.f11433f = treeMap.descendingMap();
        }
        return (SortedMap) this.f11430c;
    }

    public static <FieldDescriptorType extends u.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> r(int i10) {
        return new a(i10);
    }

    public V t(int i10) {
        g();
        V value = this.f11429b.remove(i10).getValue();
        if (!this.f11430c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f11429b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f11429b.isEmpty()) {
            this.f11429b.clear();
        }
        if (this.f11430c.isEmpty()) {
            return;
        }
        this.f11430c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f11430c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f11432e == null) {
            this.f11432e = new g(this, null);
        }
        return this.f11432e;
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
            return this.f11430c.equals(j1Var.f11430c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f11429b.get(f10).getValue() : this.f11430c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += this.f11429b.get(i11).hashCode();
        }
        return m() > 0 ? i10 + this.f11430c.hashCode() : i10;
    }

    public Set<Map.Entry<K, V>> i() {
        if (this.f11434r == null) {
            this.f11434r = new c(this, null);
        }
        return this.f11434r;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f11429b.get(i10);
    }

    public int l() {
        return this.f11429b.size();
    }

    public int m() {
        return this.f11430c.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f11430c.isEmpty() ? d.b() : this.f11430c.entrySet();
    }

    public boolean p() {
        return this.f11431d;
    }

    public void q() {
        if (this.f11431d) {
            return;
        }
        this.f11430c = this.f11430c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11430c);
        this.f11433f = this.f11433f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f11433f);
        this.f11431d = true;
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
        if (this.f11430c.isEmpty()) {
            return null;
        }
        return this.f11430c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f11429b.get(f10).setValue(v10);
        }
        j();
        int i10 = -(f10 + 1);
        if (i10 >= this.f11428a) {
            return o().put(k10, v10);
        }
        int size = this.f11429b.size();
        int i11 = this.f11428a;
        if (size == i11) {
            j1<K, V>.e remove = this.f11429b.remove(i11 - 1);
            o().put(remove.getKey(), remove.getValue());
        }
        this.f11429b.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f11429b.size() + this.f11430c.size();
    }
}
