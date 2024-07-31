package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1206u;
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
/* renamed from: androidx.datastore.preferences.protobuf.j1 */
/* loaded from: classes.dex */
public class C1175j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f4883a;

    /* renamed from: b */
    private List<C1175j1<K, V>.e> f4884b;

    /* renamed from: c */
    private Map<K, V> f4885c;

    /* renamed from: d */
    private boolean f4886d;

    /* renamed from: e */
    private volatile C1175j1<K, V>.g f4887e;

    /* renamed from: f */
    private Map<K, V> f4888f;

    /* renamed from: r */
    private volatile C1175j1<K, V>.c f4889r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* renamed from: androidx.datastore.preferences.protobuf.j1$a */
    /* loaded from: classes.dex */
    public static class a<FieldDescriptorType> extends C1175j1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // androidx.datastore.preferences.protobuf.C1175j1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((C1206u.b) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.C1175j1
        /* renamed from: q */
        public void mo6006q() {
            if (!m6005p()) {
                for (int i10 = 0; i10 < m6002l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> m6001k = m6001k(i10);
                    if (((C1206u.b) m6001k.getKey()).mo6459c()) {
                        m6001k.setValue(Collections.unmodifiableList((List) m6001k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m6004n()) {
                    if (((C1206u.b) entry.getKey()).mo6459c()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo6006q();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j1$b */
    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f4890a;

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> f4891b;

        private b() {
            this.f4890a = C1175j1.this.f4884b.size();
        }

        /* synthetic */ b(C1175j1 c1175j1, a aVar) {
            this();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m6008a() {
            if (this.f4891b == null) {
                this.f4891b = C1175j1.this.f4888f.entrySet().iterator();
            }
            return this.f4891b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (m6008a().hasNext()) {
                entry = m6008a().next();
            } else {
                List list = C1175j1.this.f4884b;
                int i10 = this.f4890a - 1;
                this.f4890a = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f4890a;
            return (i10 > 0 && i10 <= C1175j1.this.f4884b.size()) || m6008a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.j1$c */
    /* loaded from: classes.dex */
    public class c extends C1175j1<K, V>.g {
        private c() {
            super(C1175j1.this, null);
        }

        /* synthetic */ c(C1175j1 c1175j1, a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.C1175j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C1175j1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.j1$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        private static final Iterator<Object> f4894a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f4895b = new b();

        /* renamed from: androidx.datastore.preferences.protobuf.j1$d$a */
        /* loaded from: classes.dex */
        static class a implements Iterator<Object> {
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

        /* renamed from: androidx.datastore.preferences.protobuf.j1$d$b */
        /* loaded from: classes.dex */
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f4894a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m6011b() {
            return (Iterable<T>) f4895b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.j1$e */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<C1175j1<K, V>.e> {

        /* renamed from: a */
        private final K f4896a;

        /* renamed from: b */
        private V f4897b;

        e(K k10, V v10) {
            this.f4896a = k10;
            this.f4897b = v10;
        }

        e(C1175j1 c1175j1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        private boolean m6012h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(C1175j1<K, V>.e eVar) {
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
            return m6012h(this.f4896a, entry.getKey()) && m6012h(this.f4897b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4897b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f4896a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f4897b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f4896a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            C1175j1.this.m5995g();
            V v11 = this.f4897b;
            this.f4897b = v10;
            return v11;
        }

        public String toString() {
            return this.f4896a + "=" + this.f4897b;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j1$f */
    /* loaded from: classes.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f4899a;

        /* renamed from: b */
        private boolean f4900b;

        /* renamed from: c */
        private Iterator<Map.Entry<K, V>> f4901c;

        private f() {
            this.f4899a = -1;
        }

        /* synthetic */ f(C1175j1 c1175j1, a aVar) {
            this();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m6015a() {
            if (this.f4901c == null) {
                this.f4901c = C1175j1.this.f4885c.entrySet().iterator();
            }
            return this.f4901c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f4900b = true;
            int i10 = this.f4899a + 1;
            this.f4899a = i10;
            return i10 < C1175j1.this.f4884b.size() ? (Map.Entry<K, V>) C1175j1.this.f4884b.get(this.f4899a) : m6015a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4899a + 1 >= C1175j1.this.f4884b.size()) {
                return !C1175j1.this.f4885c.isEmpty() && m6015a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4900b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f4900b = false;
            C1175j1.this.m5995g();
            if (this.f4899a >= C1175j1.this.f4884b.size()) {
                m6015a().remove();
                return;
            }
            C1175j1 c1175j1 = C1175j1.this;
            int i10 = this.f4899a;
            this.f4899a = i10 - 1;
            c1175j1.m5999t(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.datastore.preferences.protobuf.j1$g */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(C1175j1 c1175j1, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C1175j1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1175j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C1175j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(C1175j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C1175j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1175j1.this.size();
        }
    }

    private C1175j1(int i10) {
        this.f4883a = i10;
        this.f4884b = Collections.emptyList();
        this.f4885c = Collections.emptyMap();
        this.f4888f = Collections.emptyMap();
    }

    /* synthetic */ C1175j1(int i10, a aVar) {
        this(i10);
    }

    /* renamed from: f */
    private int m5994f(K k10) {
        int size = this.f4884b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f4884b.get(size).getKey());
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
            int compareTo2 = k10.compareTo(this.f4884b.get(i11).getKey());
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
    public void m5995g() {
        if (this.f4886d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private void m5996j() {
        m5995g();
        if (!this.f4884b.isEmpty() || (this.f4884b instanceof ArrayList)) {
            return;
        }
        this.f4884b = new ArrayList(this.f4883a);
    }

    /* renamed from: o */
    private SortedMap<K, V> m5997o() {
        m5995g();
        if (this.f4885c.isEmpty() && !(this.f4885c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4885c = treeMap;
            this.f4888f = treeMap.descendingMap();
        }
        return (SortedMap) this.f4885c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <FieldDescriptorType extends C1206u.b<FieldDescriptorType>> C1175j1<FieldDescriptorType, Object> m5998r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public V m5999t(int i10) {
        m5995g();
        V value = this.f4884b.remove(i10).getValue();
        if (!this.f4885c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m5997o().entrySet().iterator();
            this.f4884b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m5995g();
        if (!this.f4884b.isEmpty()) {
            this.f4884b.clear();
        }
        if (this.f4885c.isEmpty()) {
            return;
        }
        this.f4885c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m5994f(comparable) >= 0 || this.f4885c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f4887e == null) {
            this.f4887e = new g(this, null);
        }
        return this.f4887e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175j1)) {
            return super.equals(obj);
        }
        C1175j1 c1175j1 = (C1175j1) obj;
        int size = size();
        if (size != c1175j1.size()) {
            return false;
        }
        int m6002l = m6002l();
        if (m6002l != c1175j1.m6002l()) {
            return entrySet().equals(c1175j1.entrySet());
        }
        for (int i10 = 0; i10 < m6002l; i10++) {
            if (!m6001k(i10).equals(c1175j1.m6001k(i10))) {
                return false;
            }
        }
        if (m6002l != size) {
            return this.f4885c.equals(c1175j1.f4885c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m5994f = m5994f(comparable);
        return m5994f >= 0 ? this.f4884b.get(m5994f).getValue() : this.f4885c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m6002l = m6002l();
        int i10 = 0;
        for (int i11 = 0; i11 < m6002l; i11++) {
            i10 += this.f4884b.get(i11).hashCode();
        }
        return m6003m() > 0 ? i10 + this.f4885c.hashCode() : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<Map.Entry<K, V>> m6000i() {
        if (this.f4889r == null) {
            this.f4889r = new c(this, null);
        }
        return this.f4889r;
    }

    /* renamed from: k */
    public Map.Entry<K, V> m6001k(int i10) {
        return this.f4884b.get(i10);
    }

    /* renamed from: l */
    public int m6002l() {
        return this.f4884b.size();
    }

    /* renamed from: m */
    public int m6003m() {
        return this.f4885c.size();
    }

    /* renamed from: n */
    public Iterable<Map.Entry<K, V>> m6004n() {
        return this.f4885c.isEmpty() ? d.m6011b() : this.f4885c.entrySet();
    }

    /* renamed from: p */
    public boolean m6005p() {
        return this.f4886d;
    }

    /* renamed from: q */
    public void mo6006q() {
        if (this.f4886d) {
            return;
        }
        this.f4885c = this.f4885c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4885c);
        this.f4888f = this.f4888f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4888f);
        this.f4886d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m5995g();
        Comparable comparable = (Comparable) obj;
        int m5994f = m5994f(comparable);
        if (m5994f >= 0) {
            return (V) m5999t(m5994f);
        }
        if (this.f4885c.isEmpty()) {
            return null;
        }
        return this.f4885c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        m5995g();
        int m5994f = m5994f(k10);
        if (m5994f >= 0) {
            return this.f4884b.get(m5994f).setValue(v10);
        }
        m5996j();
        int i10 = -(m5994f + 1);
        if (i10 >= this.f4883a) {
            return m5997o().put(k10, v10);
        }
        int size = this.f4884b.size();
        int i11 = this.f4883a;
        if (size == i11) {
            C1175j1<K, V>.e remove = this.f4884b.remove(i11 - 1);
            m5997o().put(remove.getKey(), remove.getValue());
        }
        this.f4884b.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4884b.size() + this.f4885c.size();
    }
}
