package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C6009u;
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
/* renamed from: com.google.crypto.tink.shaded.protobuf.j1 */
/* loaded from: classes2.dex */
public class C5978j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    private final int f12643a;

    /* renamed from: b */
    private List<C5978j1<K, V>.e> f12644b;

    /* renamed from: c */
    private Map<K, V> f12645c;

    /* renamed from: d */
    private boolean f12646d;

    /* renamed from: e */
    private volatile C5978j1<K, V>.g f12647e;

    /* renamed from: f */
    private Map<K, V> f12648f;

    /* renamed from: r */
    private volatile C5978j1<K, V>.c f12649r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$a */
    /* loaded from: classes2.dex */
    public class a<FieldDescriptorType> extends C5978j1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, null);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C5978j1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((Comparable) obj, obj2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C5978j1
        /* renamed from: q */
        public void mo15690q() {
            if (!m15689p()) {
                for (int i10 = 0; i10 < m15686l(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> m15685k = m15685k(i10);
                    if (((C6009u.b) m15685k.getKey()).mo16122c()) {
                        m15685k.setValue(Collections.unmodifiableList((List) m15685k.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m15688n()) {
                    if (((C6009u.b) entry.getKey()).mo16122c()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo15690q();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$b */
    /* loaded from: classes2.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f12650a;

        /* renamed from: b */
        private Iterator<Map.Entry<K, V>> f12651b;

        private b() {
            this.f12650a = C5978j1.this.f12644b.size();
        }

        /* synthetic */ b(C5978j1 c5978j1, a aVar) {
            this();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m15692a() {
            if (this.f12651b == null) {
                this.f12651b = C5978j1.this.f12648f.entrySet().iterator();
            }
            return this.f12651b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (m15692a().hasNext()) {
                entry = m15692a().next();
            } else {
                List list = C5978j1.this.f12644b;
                int i10 = this.f12650a - 1;
                this.f12650a = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f12650a;
            return (i10 > 0 && i10 <= C5978j1.this.f12644b.size()) || m15692a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$c */
    /* loaded from: classes2.dex */
    private class c extends C5978j1<K, V>.g {
        private c() {
            super(C5978j1.this, null);
        }

        /* synthetic */ c(C5978j1 c5978j1, a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C5978j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C5978j1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$d */
    /* loaded from: classes2.dex */
    public static class d {

        /* renamed from: a */
        private static final Iterator<Object> f12654a = new a();

        /* renamed from: b */
        private static final Iterable<Object> f12655b = new b();

        /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$d$a */
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

        /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$d$b */
        /* loaded from: classes2.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f12654a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m15695b() {
            return (Iterable<T>) f12655b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$e */
    /* loaded from: classes2.dex */
    public class e implements Map.Entry<K, V>, Comparable<C5978j1<K, V>.e> {

        /* renamed from: a */
        private final K f12656a;

        /* renamed from: b */
        private V f12657b;

        e(K k10, V v10) {
            this.f12656a = k10;
            this.f12657b = v10;
        }

        e(C5978j1 c5978j1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        private boolean m15696h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(C5978j1<K, V>.e eVar) {
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
            return m15696h(this.f12656a, entry.getKey()) && m15696h(this.f12657b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f12657b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f12656a;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f12657b;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f12656a;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            C5978j1.this.m15679g();
            V v11 = this.f12657b;
            this.f12657b = v10;
            return v11;
        }

        public String toString() {
            return this.f12656a + "=" + this.f12657b;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$f */
    /* loaded from: classes2.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a */
        private int f12659a;

        /* renamed from: b */
        private boolean f12660b;

        /* renamed from: c */
        private Iterator<Map.Entry<K, V>> f12661c;

        private f() {
            this.f12659a = -1;
        }

        /* synthetic */ f(C5978j1 c5978j1, a aVar) {
            this();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m15699a() {
            if (this.f12661c == null) {
                this.f12661c = C5978j1.this.f12645c.entrySet().iterator();
            }
            return this.f12661c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f12660b = true;
            int i10 = this.f12659a + 1;
            this.f12659a = i10;
            return i10 < C5978j1.this.f12644b.size() ? (Map.Entry<K, V>) C5978j1.this.f12644b.get(this.f12659a) : m15699a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12659a + 1 >= C5978j1.this.f12644b.size()) {
                return !C5978j1.this.f12645c.isEmpty() && m15699a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f12660b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f12660b = false;
            C5978j1.this.m15679g();
            if (this.f12659a >= C5978j1.this.f12644b.size()) {
                m15699a().remove();
                return;
            }
            C5978j1 c5978j1 = C5978j1.this;
            int i10 = this.f12659a;
            this.f12659a = i10 - 1;
            c5978j1.m15683t(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.j1$g */
    /* loaded from: classes2.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(C5978j1 c5978j1, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C5978j1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5978j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C5978j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(C5978j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C5978j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5978j1.this.size();
        }
    }

    private C5978j1(int i10) {
        this.f12643a = i10;
        this.f12644b = Collections.emptyList();
        this.f12645c = Collections.emptyMap();
        this.f12648f = Collections.emptyMap();
    }

    /* synthetic */ C5978j1(int i10, a aVar) {
        this(i10);
    }

    /* renamed from: f */
    private int m15678f(K k10) {
        int size = this.f12644b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f12644b.get(size).getKey());
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
            int compareTo2 = k10.compareTo(this.f12644b.get(i11).getKey());
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
    public void m15679g() {
        if (this.f12646d) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: j */
    private void m15680j() {
        m15679g();
        if (!this.f12644b.isEmpty() || (this.f12644b instanceof ArrayList)) {
            return;
        }
        this.f12644b = new ArrayList(this.f12643a);
    }

    /* renamed from: o */
    private SortedMap<K, V> m15681o() {
        m15679g();
        if (this.f12645c.isEmpty() && !(this.f12645c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12645c = treeMap;
            this.f12648f = treeMap.descendingMap();
        }
        return (SortedMap) this.f12645c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static <FieldDescriptorType extends C6009u.b<FieldDescriptorType>> C5978j1<FieldDescriptorType, Object> m15682r(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public V m15683t(int i10) {
        m15679g();
        V value = this.f12644b.remove(i10).getValue();
        if (!this.f12645c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m15681o().entrySet().iterator();
            this.f12644b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m15679g();
        if (!this.f12644b.isEmpty()) {
            this.f12644b.clear();
        }
        if (this.f12645c.isEmpty()) {
            return;
        }
        this.f12645c.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m15678f(comparable) >= 0 || this.f12645c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f12647e == null) {
            this.f12647e = new g(this, null);
        }
        return this.f12647e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5978j1)) {
            return super.equals(obj);
        }
        C5978j1 c5978j1 = (C5978j1) obj;
        int size = size();
        if (size != c5978j1.size()) {
            return false;
        }
        int m15686l = m15686l();
        if (m15686l != c5978j1.m15686l()) {
            return entrySet().equals(c5978j1.entrySet());
        }
        for (int i10 = 0; i10 < m15686l; i10++) {
            if (!m15685k(i10).equals(c5978j1.m15685k(i10))) {
                return false;
            }
        }
        if (m15686l != size) {
            return this.f12645c.equals(c5978j1.f12645c);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m15678f = m15678f(comparable);
        return m15678f >= 0 ? this.f12644b.get(m15678f).getValue() : this.f12645c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m15686l = m15686l();
        int i10 = 0;
        for (int i11 = 0; i11 < m15686l; i11++) {
            i10 += this.f12644b.get(i11).hashCode();
        }
        return m15687m() > 0 ? i10 + this.f12645c.hashCode() : i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Set<Map.Entry<K, V>> m15684i() {
        if (this.f12649r == null) {
            this.f12649r = new c(this, null);
        }
        return this.f12649r;
    }

    /* renamed from: k */
    public Map.Entry<K, V> m15685k(int i10) {
        return this.f12644b.get(i10);
    }

    /* renamed from: l */
    public int m15686l() {
        return this.f12644b.size();
    }

    /* renamed from: m */
    public int m15687m() {
        return this.f12645c.size();
    }

    /* renamed from: n */
    public Iterable<Map.Entry<K, V>> m15688n() {
        return this.f12645c.isEmpty() ? d.m15695b() : this.f12645c.entrySet();
    }

    /* renamed from: p */
    public boolean m15689p() {
        return this.f12646d;
    }

    /* renamed from: q */
    public void mo15690q() {
        if (this.f12646d) {
            return;
        }
        this.f12645c = this.f12645c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f12645c);
        this.f12648f = this.f12648f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f12648f);
        this.f12646d = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m15679g();
        Comparable comparable = (Comparable) obj;
        int m15678f = m15678f(comparable);
        if (m15678f >= 0) {
            return (V) m15683t(m15678f);
        }
        if (this.f12645c.isEmpty()) {
            return null;
        }
        return this.f12645c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        m15679g();
        int m15678f = m15678f(k10);
        if (m15678f >= 0) {
            return this.f12644b.get(m15678f).setValue(v10);
        }
        m15680j();
        int i10 = -(m15678f + 1);
        if (i10 >= this.f12643a) {
            return m15681o().put(k10, v10);
        }
        int size = this.f12644b.size();
        int i11 = this.f12643a;
        if (size == i11) {
            C5978j1<K, V>.e remove = this.f12644b.remove(i11 - 1);
            m15681o().put(remove.getKey(), remove.getValue());
        }
        this.f12644b.add(i10, new e(k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f12644b.size() + this.f12645c.size();
    }
}
