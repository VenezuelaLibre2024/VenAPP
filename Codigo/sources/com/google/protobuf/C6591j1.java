package com.google.protobuf;

import com.google.protobuf.C6619t;
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
/* renamed from: com.google.protobuf.j1 */
/* loaded from: classes2.dex */
public class C6591j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f14525a;

    /* renamed from: b */
    private List<C6591j1<K, V>.e> f14526b;

    /* renamed from: c */
    private Map<K, V> f14527c;

    /* renamed from: d */
    private boolean f14528d;

    /* renamed from: e */
    private volatile C6591j1<K, V>.g f14529e;

    /* renamed from: f */
    private Map<K, V> f14530f;

    /* renamed from: r */
    private volatile C6591j1<K, V>.c f14531r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* renamed from: com.google.protobuf.j1$a */
    /* loaded from: classes2.dex */
    public class a<FieldDescriptorType> extends C6591j1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.protobuf.C6591j1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.protobuf.C6591j1
        /* renamed from: q */
        public void mo18845q() {
            if (!m18844p()) {
                for (int i10 = 0; i10 < m18841l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> m18840k = m18840k(i10);
                    if (((C6619t.b) m18840k.getKey()).mo19177c()) {
                        m18840k.setValue(Collections.unmodifiableList((List) m18840k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m18843n()) {
                    if (((C6619t.b) entry.getKey()).mo19177c()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo18845q();
        }
    }

    /* renamed from: com.google.protobuf.j1$b */
    /* loaded from: classes2.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f14532a;

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> f14533b;

        private b() {
            this.f14532a = C6591j1.this.f14526b.size();
        }

        /* synthetic */ b(C6591j1 c6591j1, a aVar) {
            this();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m18847a() {
            if (this.f14533b == null) {
                this.f14533b = C6591j1.this.f14530f.entrySet().iterator();
            }
            return this.f14533b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (m18847a().hasNext()) {
                entry = m18847a().next();
            } else {
                List list = C6591j1.this.f14526b;
                int i10 = this.f14532a - 1;
                this.f14532a = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f14532a;
            return (i10 > 0 && i10 <= C6591j1.this.f14526b.size()) || m18847a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.j1$c */
    /* loaded from: classes2.dex */
    public class c extends C6591j1<K, V>.g {
        private c() {
            super(C6591j1.this, null);
        }

        /* synthetic */ c(C6591j1 c6591j1, a aVar) {
            this();
        }

        @Override // com.google.protobuf.C6591j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C6591j1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.j1$d */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        private static final Iterator<Object> f14536a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f14537b = new b();

        /* renamed from: com.google.protobuf.j1$d$a */
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

        /* renamed from: com.google.protobuf.j1$d$b */
        /* loaded from: classes2.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f14536a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m18850b() {
            return (Iterable<T>) f14537b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.j1$e */
    /* loaded from: classes2.dex */
    public class e implements Map.Entry<K, V>, Comparable<C6591j1<K, V>.e> {

        /* renamed from: a */
        private final K f14538a;

        /* renamed from: b */
        private V f14539b;

        e(K k10, V v10) {
            this.f14538a = k10;
            this.f14539b = v10;
        }

        e(C6591j1 c6591j1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        private boolean m18851h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(C6591j1<K, V>.e eVar) {
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
            return m18851h(this.f14538a, entry.getKey()) && m18851h(this.f14539b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f14539b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f14538a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f14539b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f14538a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            C6591j1.this.m18834g();
            V v11 = this.f14539b;
            this.f14539b = v10;
            return v11;
        }

        public String toString() {
            return this.f14538a + "=" + this.f14539b;
        }
    }

    /* renamed from: com.google.protobuf.j1$f */
    /* loaded from: classes2.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f14541a;

        /* renamed from: b */
        private boolean f14542b;

        /* renamed from: c */
        private Iterator<Map.Entry<K, V>> f14543c;

        private f() {
            this.f14541a = -1;
        }

        /* synthetic */ f(C6591j1 c6591j1, a aVar) {
            this();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m18854a() {
            if (this.f14543c == null) {
                this.f14543c = C6591j1.this.f14527c.entrySet().iterator();
            }
            return this.f14543c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f14542b = true;
            int i10 = this.f14541a + 1;
            this.f14541a = i10;
            return i10 < C6591j1.this.f14526b.size() ? (Map.Entry<K, V>) C6591j1.this.f14526b.get(this.f14541a) : m18854a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f14541a + 1 >= C6591j1.this.f14526b.size()) {
                return !C6591j1.this.f14527c.isEmpty() && m18854a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f14542b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f14542b = false;
            C6591j1.this.m18834g();
            if (this.f14541a >= C6591j1.this.f14526b.size()) {
                m18854a().remove();
                return;
            }
            C6591j1 c6591j1 = C6591j1.this;
            int i10 = this.f14541a;
            this.f14541a = i10 - 1;
            c6591j1.m18838t(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.protobuf.j1$g */
    /* loaded from: classes2.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(C6591j1 c6591j1, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C6591j1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C6591j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C6591j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(C6591j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C6591j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C6591j1.this.size();
        }
    }

    private C6591j1(int i10) {
        this.f14525a = i10;
        this.f14526b = Collections.emptyList();
        this.f14527c = Collections.emptyMap();
        this.f14530f = Collections.emptyMap();
    }

    /* synthetic */ C6591j1(int i10, a aVar) {
        this(i10);
    }

    /* renamed from: f */
    private int m18833f(K k10) {
        int size = this.f14526b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f14526b.get(size).getKey());
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
            int compareTo2 = k10.compareTo(this.f14526b.get(i11).getKey());
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
    /* renamed from: g */
    public void m18834g() {
        if (this.f14528d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private void m18835j() {
        m18834g();
        if (!this.f14526b.isEmpty() || (this.f14526b instanceof ArrayList)) {
            return;
        }
        this.f14526b = new ArrayList(this.f14525a);
    }

    /* renamed from: o */
    private SortedMap<K, V> m18836o() {
        m18834g();
        if (this.f14527c.isEmpty() && !(this.f14527c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14527c = treeMap;
            this.f14530f = treeMap.descendingMap();
        }
        return (SortedMap) this.f14527c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <FieldDescriptorType extends C6619t.b<FieldDescriptorType>> C6591j1<FieldDescriptorType, Object> m18837r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public V m18838t(int i10) {
        m18834g();
        V value = this.f14526b.remove(i10).getValue();
        if (!this.f14527c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m18836o().entrySet().iterator();
            this.f14526b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m18834g();
        if (!this.f14526b.isEmpty()) {
            this.f14526b.clear();
        }
        if (this.f14527c.isEmpty()) {
            return;
        }
        this.f14527c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m18833f(comparable) >= 0 || this.f14527c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f14529e == null) {
            this.f14529e = new g(this, null);
        }
        return this.f14529e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6591j1)) {
            return super.equals(obj);
        }
        C6591j1 c6591j1 = (C6591j1) obj;
        int size = size();
        if (size != c6591j1.size()) {
            return false;
        }
        int m18841l = m18841l();
        if (m18841l != c6591j1.m18841l()) {
            return entrySet().equals(c6591j1.entrySet());
        }
        for (int i10 = 0; i10 < m18841l; i10++) {
            if (!m18840k(i10).equals(c6591j1.m18840k(i10))) {
                return false;
            }
        }
        if (m18841l != size) {
            return this.f14527c.equals(c6591j1.f14527c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m18833f = m18833f(comparable);
        return m18833f >= 0 ? this.f14526b.get(m18833f).getValue() : this.f14527c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m18841l = m18841l();
        int i10 = 0;
        for (int i11 = 0; i11 < m18841l; i11++) {
            i10 += this.f14526b.get(i11).hashCode();
        }
        return m18842m() > 0 ? i10 + this.f14527c.hashCode() : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<Map.Entry<K, V>> m18839i() {
        if (this.f14531r == null) {
            this.f14531r = new c(this, null);
        }
        return this.f14531r;
    }

    /* renamed from: k */
    public Map.Entry<K, V> m18840k(int i10) {
        return this.f14526b.get(i10);
    }

    /* renamed from: l */
    public int m18841l() {
        return this.f14526b.size();
    }

    /* renamed from: m */
    public int m18842m() {
        return this.f14527c.size();
    }

    /* renamed from: n */
    public Iterable<Map.Entry<K, V>> m18843n() {
        return this.f14527c.isEmpty() ? d.m18850b() : this.f14527c.entrySet();
    }

    /* renamed from: p */
    public boolean m18844p() {
        return this.f14528d;
    }

    /* renamed from: q */
    public void mo18845q() {
        if (this.f14528d) {
            return;
        }
        this.f14527c = this.f14527c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14527c);
        this.f14530f = this.f14530f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14530f);
        this.f14528d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m18834g();
        Comparable comparable = (Comparable) obj;
        int m18833f = m18833f(comparable);
        if (m18833f >= 0) {
            return (V) m18838t(m18833f);
        }
        if (this.f14527c.isEmpty()) {
            return null;
        }
        return this.f14527c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        m18834g();
        int m18833f = m18833f(k10);
        if (m18833f >= 0) {
            return this.f14526b.get(m18833f).setValue(v10);
        }
        m18835j();
        int i10 = -(m18833f + 1);
        if (i10 >= this.f14525a) {
            return m18836o().put(k10, v10);
        }
        int size = this.f14526b.size();
        int i11 = this.f14525a;
        if (size == i11) {
            C6591j1<K, V>.e remove = this.f14526b.remove(i11 - 1);
            m18836o().put(remove.getKey(), remove.getValue());
        }
        this.f14526b.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f14526b.size() + this.f14527c.size();
    }
}
