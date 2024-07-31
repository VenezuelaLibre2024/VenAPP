package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
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
/* loaded from: classes.dex */
public class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f4172a;

    /* renamed from: b, reason: collision with root package name */
    private List<j1<K, V>.e> f4173b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f4174c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4175d;

    /* renamed from: e, reason: collision with root package name */
    private volatile j1<K, V>.g f4176e;

    /* renamed from: f, reason: collision with root package name */
    private Map<K, V> f4177f;

    /* renamed from: r, reason: collision with root package name */
    private volatile j1<K, V>.c f4178r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* loaded from: classes.dex */
    public static class a<FieldDescriptorType> extends j1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // androidx.datastore.preferences.protobuf.j1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((u.b) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.j1
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

    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f4179a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f4180b;

        private b() {
            this.f4179a = j1.this.f4173b.size();
        }

        /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f4180b == null) {
                this.f4180b = j1.this.f4177f.entrySet().iterator();
            }
            return this.f4180b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (a().hasNext()) {
                entry = a().next();
            } else {
                List list = j1.this.f4173b;
                int i10 = this.f4179a - 1;
                this.f4179a = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f4179a;
            return (i10 > 0 && i10 <= j1.this.f4173b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends j1<K, V>.g {
        private c() {
            super(j1.this, null);
        }

        /* synthetic */ c(j1 j1Var, a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f4183a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f4184b = new b();

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

        /* loaded from: classes.dex */
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f4183a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f4184b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<j1<K, V>.e> {

        /* renamed from: a, reason: collision with root package name */
        private final K f4185a;

        /* renamed from: b, reason: collision with root package name */
        private V f4186b;

        e(K k10, V v10) {
            this.f4185a = k10;
            this.f4186b = v10;
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
            return h(this.f4185a, entry.getKey()) && h(this.f4186b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4186b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f4185a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f4186b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f4185a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            j1.this.g();
            V v11 = this.f4186b;
            this.f4186b = v10;
            return v11;
        }

        public String toString() {
            return this.f4185a + "=" + this.f4186b;
        }
    }

    /* loaded from: classes.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        private int f4188a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4189b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f4190c;

        private f() {
            this.f4188a = -1;
        }

        /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f4190c == null) {
                this.f4190c = j1.this.f4174c.entrySet().iterator();
            }
            return this.f4190c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f4189b = true;
            int i10 = this.f4188a + 1;
            this.f4188a = i10;
            return i10 < j1.this.f4173b.size() ? (Map.Entry<K, V>) j1.this.f4173b.get(this.f4188a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4188a + 1 >= j1.this.f4173b.size()) {
                return !j1.this.f4174c.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4189b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f4189b = false;
            j1.this.g();
            if (this.f4188a >= j1.this.f4173b.size()) {
                a().remove();
                return;
            }
            j1 j1Var = j1.this;
            int i10 = this.f4188a;
            this.f4188a = i10 - 1;
            j1Var.t(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
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
        this.f4172a = i10;
        this.f4173b = Collections.emptyList();
        this.f4174c = Collections.emptyMap();
        this.f4177f = Collections.emptyMap();
    }

    /* synthetic */ j1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f4173b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f4173b.get(size).getKey());
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
            int compareTo2 = k10.compareTo(this.f4173b.get(i11).getKey());
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
        if (this.f4175d) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        g();
        if (!this.f4173b.isEmpty() || (this.f4173b instanceof ArrayList)) {
            return;
        }
        this.f4173b = new ArrayList(this.f4172a);
    }

    private SortedMap<K, V> o() {
        g();
        if (this.f4174c.isEmpty() && !(this.f4174c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4174c = treeMap;
            this.f4177f = treeMap.descendingMap();
        }
        return (SortedMap) this.f4174c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends u.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i10) {
        g();
        V value = this.f4173b.remove(i10).getValue();
        if (!this.f4174c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            this.f4173b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f4173b.isEmpty()) {
            this.f4173b.clear();
        }
        if (this.f4174c.isEmpty()) {
            return;
        }
        this.f4174c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f4174c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f4176e == null) {
            this.f4176e = new g(this, null);
        }
        return this.f4176e;
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
            return this.f4174c.equals(j1Var.f4174c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f4173b.get(f10).getValue() : this.f4174c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int l10 = l();
        int i10 = 0;
        for (int i11 = 0; i11 < l10; i11++) {
            i10 += this.f4173b.get(i11).hashCode();
        }
        return m() > 0 ? i10 + this.f4174c.hashCode() : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> i() {
        if (this.f4178r == null) {
            this.f4178r = new c(this, null);
        }
        return this.f4178r;
    }

    public Map.Entry<K, V> k(int i10) {
        return this.f4173b.get(i10);
    }

    public int l() {
        return this.f4173b.size();
    }

    public int m() {
        return this.f4174c.size();
    }

    public Iterable<Map.Entry<K, V>> n() {
        return this.f4174c.isEmpty() ? d.b() : this.f4174c.entrySet();
    }

    public boolean p() {
        return this.f4175d;
    }

    public void q() {
        if (this.f4175d) {
            return;
        }
        this.f4174c = this.f4174c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4174c);
        this.f4177f = this.f4177f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4177f);
        this.f4175d = true;
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
        if (this.f4174c.isEmpty()) {
            return null;
        }
        return this.f4174c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f4173b.get(f10).setValue(v10);
        }
        j();
        int i10 = -(f10 + 1);
        if (i10 >= this.f4172a) {
            return o().put(k10, v10);
        }
        int size = this.f4173b.size();
        int i11 = this.f4172a;
        if (size == i11) {
            j1<K, V>.e remove = this.f4173b.remove(i11 - 1);
            o().put(remove.getKey(), remove.getValue());
        }
        this.f4173b.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4173b.size() + this.f4174c.size();
    }
}
