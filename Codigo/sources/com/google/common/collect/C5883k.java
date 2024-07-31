package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p082eb.C7155k;
import p082eb.C7159o;
import p137hb.C7690e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.k */
/* loaded from: classes2.dex */
public class C5883k<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: u */
    private static final Object f12322u = new Object();

    /* renamed from: a */
    private transient Object f12323a;

    /* renamed from: b */
    transient int[] f12324b;

    /* renamed from: c */
    transient Object[] f12325c;

    /* renamed from: d */
    transient Object[] f12326d;

    /* renamed from: e */
    private transient int f12327e;

    /* renamed from: f */
    private transient int f12328f;

    /* renamed from: r */
    private transient Set<K> f12329r;

    /* renamed from: s */
    private transient Set<Map.Entry<K, V>> f12330s;

    /* renamed from: t */
    private transient Collection<V> f12331t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.k$a */
    /* loaded from: classes2.dex */
    public class a extends C5883k<K, V>.e<K> {
        a() {
            super(C5883k.this, null);
        }

        @Override // com.google.common.collect.C5883k.e
        /* renamed from: c */
        K mo14958c(int i10) {
            return (K) C5883k.this.m14909I(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.k$b */
    /* loaded from: classes2.dex */
    public class b extends C5883k<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(C5883k.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.C5883k.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> mo14958c(int i10) {
            return new g(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.k$c */
    /* loaded from: classes2.dex */
    public class c extends C5883k<K, V>.e<V> {
        c() {
            super(C5883k.this, null);
        }

        @Override // com.google.common.collect.C5883k.e
        /* renamed from: c */
        V mo14958c(int i10) {
            return (V) C5883k.this.m14921Y(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.k$d */
    /* loaded from: classes2.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5883k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> m14957y = C5883k.this.m14957y();
            if (m14957y != null) {
                return m14957y.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m14908F = C5883k.this.m14908F(entry.getKey());
            return m14908F != -1 && C7155k.m21289a(C5883k.this.m14921Y(m14908F), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C5883k.this.m14938A();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m14957y = C5883k.this.m14957y();
            if (m14957y != null) {
                return m14957y.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C5883k.this.m14946L()) {
                return false;
            }
            int m14907D = C5883k.this.m14907D();
            int m15006f = C5887m.m15006f(entry.getKey(), entry.getValue(), m14907D, C5883k.this.m14913P(), C5883k.this.m14911N(), C5883k.this.m14912O(), C5883k.this.m14914Q());
            if (m15006f == -1) {
                return false;
            }
            C5883k.this.m14945K(m15006f, m14907D);
            C5883k.m14926e(C5883k.this);
            C5883k.this.m14941E();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5883k.this.size();
        }
    }

    /* renamed from: com.google.common.collect.k$e */
    /* loaded from: classes2.dex */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: a */
        int f12336a;

        /* renamed from: b */
        int f12337b;

        /* renamed from: c */
        int f12338c;

        private e() {
            this.f12336a = C5883k.this.f12327e;
            this.f12337b = C5883k.this.m14939B();
            this.f12338c = -1;
        }

        /* synthetic */ e(C5883k c5883k, a aVar) {
            this();
        }

        /* renamed from: a */
        private void m14960a() {
            if (C5883k.this.f12327e != this.f12336a) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c */
        abstract T mo14958c(int i10);

        /* renamed from: d */
        void m14961d() {
            this.f12336a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12337b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            m14960a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f12337b;
            this.f12338c = i10;
            T mo14958c = mo14958c(i10);
            this.f12337b = C5883k.this.m14940C(this.f12337b);
            return mo14958c;
        }

        @Override // java.util.Iterator
        public void remove() {
            m14960a();
            C5878i.m14884c(this.f12338c >= 0);
            m14961d();
            C5883k c5883k = C5883k.this;
            c5883k.remove(c5883k.m14909I(this.f12338c));
            this.f12337b = C5883k.this.m14950p(this.f12337b, this.f12338c);
            this.f12338c = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.k$f */
    /* loaded from: classes2.dex */
    public class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5883k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C5883k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C5883k.this.m14944J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m14957y = C5883k.this.m14957y();
            return m14957y != null ? m14957y.keySet().remove(obj) : C5883k.this.m14910M(obj) != C5883k.f12322u;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5883k.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.k$g */
    /* loaded from: classes2.dex */
    public final class g extends AbstractC5866e<K, V> {

        /* renamed from: a */
        private final K f12341a;

        /* renamed from: b */
        private int f12342b;

        g(int i10) {
            this.f12341a = (K) C5883k.this.m14909I(i10);
            this.f12342b = i10;
        }

        /* renamed from: a */
        private void m14962a() {
            int i10 = this.f12342b;
            if (i10 == -1 || i10 >= C5883k.this.size() || !C7155k.m21289a(this.f12341a, C5883k.this.m14909I(this.f12342b))) {
                this.f12342b = C5883k.this.m14908F(this.f12341a);
            }
        }

        @Override // com.google.common.collect.AbstractC5866e, java.util.Map.Entry
        public K getKey() {
            return this.f12341a;
        }

        @Override // com.google.common.collect.AbstractC5866e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> m14957y = C5883k.this.m14957y();
            if (m14957y != null) {
                return (V) C5894p0.m15029a(m14957y.get(this.f12341a));
            }
            m14962a();
            int i10 = this.f12342b;
            return i10 == -1 ? (V) C5894p0.m15030b() : (V) C5883k.this.m14921Y(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> m14957y = C5883k.this.m14957y();
            if (m14957y != null) {
                return (V) C5894p0.m15029a(m14957y.put(this.f12341a, v10));
            }
            m14962a();
            int i10 = this.f12342b;
            if (i10 == -1) {
                C5883k.this.put(this.f12341a, v10);
                return (V) C5894p0.m15030b();
            }
            V v11 = (V) C5883k.this.m14921Y(i10);
            C5883k.this.m14920X(this.f12342b, v10);
            return v11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.k$h */
    /* loaded from: classes2.dex */
    public class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C5883k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C5883k.this.m14948Z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C5883k.this.size();
        }
    }

    C5883k() {
        m14942G(3);
    }

    C5883k(int i10) {
        m14942G(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public int m14907D() {
        return (1 << (this.f12327e & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public int m14908F(Object obj) {
        if (m14946L()) {
            return -1;
        }
        int m15051c = C5901t.m15051c(obj);
        int m14907D = m14907D();
        int m15008h = C5887m.m15008h(m14913P(), m15051c & m14907D);
        if (m15008h == 0) {
            return -1;
        }
        int m15002b = C5887m.m15002b(m15051c, m14907D);
        do {
            int i10 = m15008h - 1;
            int m14937z = m14937z(i10);
            if (C5887m.m15002b(m14937z, m14907D) == m15002b && C7155k.m21289a(obj, m14909I(i10))) {
                return i10;
            }
            m15008h = C5887m.m15003c(m14937z, m14907D);
        } while (m15008h != 0);
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public K m14909I(int i10) {
        return (K) m14912O()[i10];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public Object m14910M(Object obj) {
        if (m14946L()) {
            return f12322u;
        }
        int m14907D = m14907D();
        int m15006f = C5887m.m15006f(obj, null, m14907D, m14913P(), m14911N(), m14912O(), null);
        if (m15006f == -1) {
            return f12322u;
        }
        V m14921Y = m14921Y(m15006f);
        m14945K(m15006f, m14907D);
        this.f12328f--;
        m14941E();
        return m14921Y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public int[] m14911N() {
        int[] iArr = this.f12324b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public Object[] m14912O() {
        Object[] objArr = this.f12325c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public Object m14913P() {
        Object obj = this.f12323a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public Object[] m14914Q() {
        Object[] objArr = this.f12326d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: S */
    private void m14915S(int i10) {
        int min;
        int length = m14911N().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        m14947R(min);
    }

    /* renamed from: T */
    private int m14916T(int i10, int i11, int i12, int i13) {
        Object m15001a = C5887m.m15001a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C5887m.m15009i(m15001a, i12 & i14, i13 + 1);
        }
        Object m14913P = m14913P();
        int[] m14911N = m14911N();
        for (int i15 = 0; i15 <= i10; i15++) {
            int m15008h = C5887m.m15008h(m14913P, i15);
            while (m15008h != 0) {
                int i16 = m15008h - 1;
                int i17 = m14911N[i16];
                int m15002b = C5887m.m15002b(i17, i10) | i15;
                int i18 = m15002b & i14;
                int m15008h2 = C5887m.m15008h(m15001a, i18);
                C5887m.m15009i(m15001a, i18, m15008h);
                m14911N[i16] = C5887m.m15004d(m15002b, m15008h2, i14);
                m15008h = C5887m.m15003c(i17, i10);
            }
        }
        this.f12323a = m15001a;
        m14918V(i14);
        return i14;
    }

    /* renamed from: U */
    private void m14917U(int i10, int i11) {
        m14911N()[i10] = i11;
    }

    /* renamed from: V */
    private void m14918V(int i10) {
        this.f12327e = C5887m.m15004d(this.f12327e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    /* renamed from: W */
    private void m14919W(int i10, K k10) {
        m14912O()[i10] = k10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m14920X(int i10, V v10) {
        m14914Q()[i10] = v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public V m14921Y(int i10) {
        return (V) m14914Q()[i10];
    }

    /* renamed from: e */
    static /* synthetic */ int m14926e(C5883k c5883k) {
        int i10 = c5883k.f12328f;
        c5883k.f12328f = i10 - 1;
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        m14942G(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* renamed from: s */
    public static <K, V> C5883k<K, V> m14935s() {
        return new C5883k<>();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> m14938A = m14938A();
        while (m14938A.hasNext()) {
            Map.Entry<K, V> next = m14938A.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    /* renamed from: x */
    public static <K, V> C5883k<K, V> m14936x(int i10) {
        return new C5883k<>(i10);
    }

    /* renamed from: z */
    private int m14937z(int i10) {
        return m14911N()[i10];
    }

    /* renamed from: A */
    Iterator<Map.Entry<K, V>> m14938A() {
        Map<K, V> m14957y = m14957y();
        return m14957y != null ? m14957y.entrySet().iterator() : new b();
    }

    /* renamed from: B */
    int m14939B() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: C */
    int m14940C(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f12328f) {
            return i11;
        }
        return -1;
    }

    /* renamed from: E */
    void m14941E() {
        this.f12327e += 32;
    }

    /* renamed from: G */
    void m14942G(int i10) {
        C7159o.m21302e(i10 >= 0, "Expected size must be >= 0");
        this.f12327e = C7690e.m23415f(i10, 1, 1073741823);
    }

    /* renamed from: H */
    void m14943H(int i10, K k10, V v10, int i11, int i12) {
        m14917U(i10, C5887m.m15004d(i11, 0, i12));
        m14919W(i10, k10);
        m14920X(i10, v10);
    }

    /* renamed from: J */
    Iterator<K> m14944J() {
        Map<K, V> m14957y = m14957y();
        return m14957y != null ? m14957y.keySet().iterator() : new a();
    }

    /* renamed from: K */
    void m14945K(int i10, int i11) {
        Object m14913P = m14913P();
        int[] m14911N = m14911N();
        Object[] m14912O = m14912O();
        Object[] m14914Q = m14914Q();
        int size = size() - 1;
        if (i10 >= size) {
            m14912O[i10] = null;
            m14914Q[i10] = null;
            m14911N[i10] = 0;
            return;
        }
        Object obj = m14912O[size];
        m14912O[i10] = obj;
        m14914Q[i10] = m14914Q[size];
        m14912O[size] = null;
        m14914Q[size] = null;
        m14911N[i10] = m14911N[size];
        m14911N[size] = 0;
        int m15051c = C5901t.m15051c(obj) & i11;
        int m15008h = C5887m.m15008h(m14913P, m15051c);
        int i12 = size + 1;
        if (m15008h == i12) {
            C5887m.m15009i(m14913P, m15051c, i10 + 1);
            return;
        }
        while (true) {
            int i13 = m15008h - 1;
            int i14 = m14911N[i13];
            int m15003c = C5887m.m15003c(i14, i11);
            if (m15003c == i12) {
                m14911N[i13] = C5887m.m15004d(i14, i10 + 1, i11);
                return;
            }
            m15008h = m15003c;
        }
    }

    /* renamed from: L */
    boolean m14946L() {
        return this.f12323a == null;
    }

    /* renamed from: R */
    void m14947R(int i10) {
        this.f12324b = Arrays.copyOf(m14911N(), i10);
        this.f12325c = Arrays.copyOf(m14912O(), i10);
        this.f12326d = Arrays.copyOf(m14914Q(), i10);
    }

    /* renamed from: Z */
    Iterator<V> m14948Z() {
        Map<K, V> m14957y = m14957y();
        return m14957y != null ? m14957y.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m14946L()) {
            return;
        }
        m14941E();
        Map<K, V> m14957y = m14957y();
        if (m14957y != null) {
            this.f12327e = C7690e.m23415f(size(), 3, 1073741823);
            m14957y.clear();
            this.f12323a = null;
        } else {
            Arrays.fill(m14912O(), 0, this.f12328f, (Object) null);
            Arrays.fill(m14914Q(), 0, this.f12328f, (Object) null);
            C5887m.m15007g(m14913P());
            Arrays.fill(m14911N(), 0, this.f12328f, 0);
        }
        this.f12328f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> m14957y = m14957y();
        return m14957y != null ? m14957y.containsKey(obj) : m14908F(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> m14957y = m14957y();
        if (m14957y != null) {
            return m14957y.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f12328f; i10++) {
            if (C7155k.m21289a(obj, m14921Y(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f12330s;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> m14953t = m14953t();
        this.f12330s = m14953t;
        return m14953t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> m14957y = m14957y();
        if (m14957y != null) {
            return m14957y.get(obj);
        }
        int m14908F = m14908F(obj);
        if (m14908F == -1) {
            return null;
        }
        m14949o(m14908F);
        return m14921Y(m14908F);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f12329r;
        if (set != null) {
            return set;
        }
        Set<K> m14955v = m14955v();
        this.f12329r = m14955v;
        return m14955v;
    }

    /* renamed from: o */
    void m14949o(int i10) {
    }

    /* renamed from: p */
    int m14950p(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int i10;
        if (m14946L()) {
            m14951q();
        }
        Map<K, V> m14957y = m14957y();
        if (m14957y != null) {
            return m14957y.put(k10, v10);
        }
        int[] m14911N = m14911N();
        Object[] m14912O = m14912O();
        Object[] m14914Q = m14914Q();
        int i11 = this.f12328f;
        int i12 = i11 + 1;
        int m15051c = C5901t.m15051c(k10);
        int m14907D = m14907D();
        int i13 = m15051c & m14907D;
        int m15008h = C5887m.m15008h(m14913P(), i13);
        if (m15008h == 0) {
            if (i12 <= m14907D) {
                C5887m.m15009i(m14913P(), i13, i12);
                i10 = m14907D;
            }
            i10 = m14916T(m14907D, C5887m.m15005e(m14907D), m15051c, i11);
        } else {
            int m15002b = C5887m.m15002b(m15051c, m14907D);
            int i14 = 0;
            while (true) {
                int i15 = m15008h - 1;
                int i16 = m14911N[i15];
                if (C5887m.m15002b(i16, m14907D) == m15002b && C7155k.m21289a(k10, m14912O[i15])) {
                    V v11 = (V) m14914Q[i15];
                    m14914Q[i15] = v10;
                    m14949o(i15);
                    return v11;
                }
                int m15003c = C5887m.m15003c(i16, m14907D);
                i14++;
                if (m15003c != 0) {
                    m15008h = m15003c;
                } else {
                    if (i14 >= 9) {
                        return m14952r().put(k10, v10);
                    }
                    if (i12 <= m14907D) {
                        m14911N[i15] = C5887m.m15004d(i16, i12, m14907D);
                    }
                }
            }
        }
        m14915S(i12);
        m14943H(i11, k10, v10, m15051c, i10);
        this.f12328f = i12;
        m14941E();
        return null;
    }

    /* renamed from: q */
    int m14951q() {
        C7159o.m21319v(m14946L(), "Arrays already allocated");
        int i10 = this.f12327e;
        int m15010j = C5887m.m15010j(i10);
        this.f12323a = C5887m.m15001a(m15010j);
        m14918V(m15010j - 1);
        this.f12324b = new int[i10];
        this.f12325c = new Object[i10];
        this.f12326d = new Object[i10];
        return i10;
    }

    /* renamed from: r */
    Map<K, V> m14952r() {
        Map<K, V> m14954u = m14954u(m14907D() + 1);
        int m14939B = m14939B();
        while (m14939B >= 0) {
            m14954u.put(m14909I(m14939B), m14921Y(m14939B));
            m14939B = m14940C(m14939B);
        }
        this.f12323a = m14954u;
        this.f12324b = null;
        this.f12325c = null;
        this.f12326d = null;
        m14941E();
        return m14954u;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> m14957y = m14957y();
        if (m14957y != null) {
            return m14957y.remove(obj);
        }
        V v10 = (V) m14910M(obj);
        if (v10 == f12322u) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> m14957y = m14957y();
        return m14957y != null ? m14957y.size() : this.f12328f;
    }

    /* renamed from: t */
    Set<Map.Entry<K, V>> m14953t() {
        return new d();
    }

    /* renamed from: u */
    Map<K, V> m14954u(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* renamed from: v */
    Set<K> m14955v() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f12331t;
        if (collection != null) {
            return collection;
        }
        Collection<V> m14956w = m14956w();
        this.f12331t = m14956w;
        return m14956w;
    }

    /* renamed from: w */
    Collection<V> m14956w() {
        return new h();
    }

    /* renamed from: y */
    Map<K, V> m14957y() {
        Object obj = this.f12323a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }
}
