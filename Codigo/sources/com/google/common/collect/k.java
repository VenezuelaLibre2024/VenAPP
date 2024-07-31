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

/* loaded from: classes2.dex */
public class k<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: u */
    private static final Object f11107u = new Object();

    /* renamed from: a */
    private transient Object f11108a;

    /* renamed from: b */
    transient int[] f11109b;

    /* renamed from: c */
    transient Object[] f11110c;

    /* renamed from: d */
    transient Object[] f11111d;

    /* renamed from: e */
    private transient int f11112e;

    /* renamed from: f */
    private transient int f11113f;

    /* renamed from: r */
    private transient Set<K> f11114r;

    /* renamed from: s */
    private transient Set<Map.Entry<K, V>> f11115s;

    /* renamed from: t */
    private transient Collection<V> f11116t;

    /* loaded from: classes2.dex */
    public class a extends k<K, V>.e<K> {
        a() {
            super(k.this, null);
        }

        @Override // com.google.common.collect.k.e
        K c(int i10) {
            return (K) k.this.I(i10);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends k<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(k.this, null);
        }

        @Override // com.google.common.collect.k.e
        /* renamed from: e */
        public Map.Entry<K, V> c(int i10) {
            return new g(i10);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends k<K, V>.e<V> {
        c() {
            super(k.this, null);
        }

        @Override // com.google.common.collect.k.e
        V c(int i10) {
            return (V) k.this.Y(i10);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> y10 = k.this.y();
            if (y10 != null) {
                return y10.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int F = k.this.F(entry.getKey());
            return F != -1 && eb.k.a(k.this.Y(F), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return k.this.A();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> y10 = k.this.y();
            if (y10 != null) {
                return y10.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (k.this.L()) {
                return false;
            }
            int D = k.this.D();
            int f10 = m.f(entry.getKey(), entry.getValue(), D, k.this.P(), k.this.N(), k.this.O(), k.this.Q());
            if (f10 == -1) {
                return false;
            }
            k.this.K(f10, D);
            k.e(k.this);
            k.this.E();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: a */
        int f11121a;

        /* renamed from: b */
        int f11122b;

        /* renamed from: c */
        int f11123c;

        private e() {
            this.f11121a = k.this.f11112e;
            this.f11122b = k.this.B();
            this.f11123c = -1;
        }

        /* synthetic */ e(k kVar, a aVar) {
            this();
        }

        private void a() {
            if (k.this.f11112e != this.f11121a) {
                throw new ConcurrentModificationException();
            }
        }

        abstract T c(int i10);

        void d() {
            this.f11121a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f11122b >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f11122b;
            this.f11123c = i10;
            T c10 = c(i10);
            this.f11122b = k.this.C(this.f11122b);
            return c10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            i.c(this.f11123c >= 0);
            d();
            k kVar = k.this;
            kVar.remove(kVar.I(this.f11123c));
            this.f11122b = k.this.p(this.f11122b, this.f11123c);
            this.f11123c = -1;
        }
    }

    /* loaded from: classes2.dex */
    public class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return k.this.J();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> y10 = k.this.y();
            return y10 != null ? y10.keySet().remove(obj) : k.this.M(obj) != k.f11107u;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k.this.size();
        }
    }

    /* loaded from: classes2.dex */
    public final class g extends com.google.common.collect.e<K, V> {

        /* renamed from: a */
        private final K f11126a;

        /* renamed from: b */
        private int f11127b;

        g(int i10) {
            this.f11126a = (K) k.this.I(i10);
            this.f11127b = i10;
        }

        private void a() {
            int i10 = this.f11127b;
            if (i10 == -1 || i10 >= k.this.size() || !eb.k.a(this.f11126a, k.this.I(this.f11127b))) {
                this.f11127b = k.this.F(this.f11126a);
            }
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public K getKey() {
            return this.f11126a;
        }

        @Override // com.google.common.collect.e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> y10 = k.this.y();
            if (y10 != null) {
                return (V) p0.a(y10.get(this.f11126a));
            }
            a();
            int i10 = this.f11127b;
            return i10 == -1 ? (V) p0.b() : (V) k.this.Y(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> y10 = k.this.y();
            if (y10 != null) {
                return (V) p0.a(y10.put(this.f11126a, v10));
            }
            a();
            int i10 = this.f11127b;
            if (i10 == -1) {
                k.this.put(this.f11126a, v10);
                return (V) p0.b();
            }
            V v11 = (V) k.this.Y(i10);
            k.this.X(this.f11127b, v10);
            return v11;
        }
    }

    /* loaded from: classes2.dex */
    public class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return k.this.Z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return k.this.size();
        }
    }

    k() {
        G(3);
    }

    k(int i10) {
        G(i10);
    }

    public int D() {
        return (1 << (this.f11112e & 31)) - 1;
    }

    public int F(Object obj) {
        if (L()) {
            return -1;
        }
        int c10 = t.c(obj);
        int D = D();
        int h10 = m.h(P(), c10 & D);
        if (h10 == 0) {
            return -1;
        }
        int b10 = m.b(c10, D);
        do {
            int i10 = h10 - 1;
            int z10 = z(i10);
            if (m.b(z10, D) == b10 && eb.k.a(obj, I(i10))) {
                return i10;
            }
            h10 = m.c(z10, D);
        } while (h10 != 0);
        return -1;
    }

    public K I(int i10) {
        return (K) O()[i10];
    }

    public Object M(Object obj) {
        if (L()) {
            return f11107u;
        }
        int D = D();
        int f10 = m.f(obj, null, D, P(), N(), O(), null);
        if (f10 == -1) {
            return f11107u;
        }
        V Y = Y(f10);
        K(f10, D);
        this.f11113f--;
        E();
        return Y;
    }

    public int[] N() {
        int[] iArr = this.f11109b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public Object[] O() {
        Object[] objArr = this.f11110c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public Object P() {
        Object obj = this.f11108a;
        Objects.requireNonNull(obj);
        return obj;
    }

    public Object[] Q() {
        Object[] objArr = this.f11111d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void S(int i10) {
        int min;
        int length = N().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        R(min);
    }

    private int T(int i10, int i11, int i12, int i13) {
        Object a10 = m.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            m.i(a10, i12 & i14, i13 + 1);
        }
        Object P = P();
        int[] N = N();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = m.h(P, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = N[i16];
                int b10 = m.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = m.h(a10, i18);
                m.i(a10, i18, h10);
                N[i16] = m.d(b10, h11, i14);
                h10 = m.c(i17, i10);
            }
        }
        this.f11108a = a10;
        V(i14);
        return i14;
    }

    private void U(int i10, int i11) {
        N()[i10] = i11;
    }

    private void V(int i10) {
        this.f11112e = m.d(this.f11112e, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void W(int i10, K k10) {
        O()[i10] = k10;
    }

    public void X(int i10, V v10) {
        Q()[i10] = v10;
    }

    public V Y(int i10) {
        return (V) Q()[i10];
    }

    static /* synthetic */ int e(k kVar) {
        int i10 = kVar.f11113f;
        kVar.f11113f = i10 - 1;
        return i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Invalid size: " + readInt);
        }
        G(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    public static <K, V> k<K, V> s() {
        return new k<>();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> A = A();
        while (A.hasNext()) {
            Map.Entry<K, V> next = A.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public static <K, V> k<K, V> x(int i10) {
        return new k<>(i10);
    }

    private int z(int i10) {
        return N()[i10];
    }

    Iterator<Map.Entry<K, V>> A() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.entrySet().iterator() : new b();
    }

    int B() {
        return isEmpty() ? -1 : 0;
    }

    int C(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f11113f) {
            return i11;
        }
        return -1;
    }

    void E() {
        this.f11112e += 32;
    }

    void G(int i10) {
        eb.o.e(i10 >= 0, "Expected size must be >= 0");
        this.f11112e = hb.e.f(i10, 1, 1073741823);
    }

    void H(int i10, K k10, V v10, int i11, int i12) {
        U(i10, m.d(i11, 0, i12));
        W(i10, k10);
        X(i10, v10);
    }

    Iterator<K> J() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.keySet().iterator() : new a();
    }

    void K(int i10, int i11) {
        Object P = P();
        int[] N = N();
        Object[] O = O();
        Object[] Q = Q();
        int size = size() - 1;
        if (i10 >= size) {
            O[i10] = null;
            Q[i10] = null;
            N[i10] = 0;
            return;
        }
        Object obj = O[size];
        O[i10] = obj;
        Q[i10] = Q[size];
        O[size] = null;
        Q[size] = null;
        N[i10] = N[size];
        N[size] = 0;
        int c10 = t.c(obj) & i11;
        int h10 = m.h(P, c10);
        int i12 = size + 1;
        if (h10 == i12) {
            m.i(P, c10, i10 + 1);
            return;
        }
        while (true) {
            int i13 = h10 - 1;
            int i14 = N[i13];
            int c11 = m.c(i14, i11);
            if (c11 == i12) {
                N[i13] = m.d(i14, i10 + 1, i11);
                return;
            }
            h10 = c11;
        }
    }

    boolean L() {
        return this.f11108a == null;
    }

    void R(int i10) {
        this.f11109b = Arrays.copyOf(N(), i10);
        this.f11110c = Arrays.copyOf(O(), i10);
        this.f11111d = Arrays.copyOf(Q(), i10);
    }

    Iterator<V> Z() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (L()) {
            return;
        }
        E();
        Map<K, V> y10 = y();
        if (y10 != null) {
            this.f11112e = hb.e.f(size(), 3, 1073741823);
            y10.clear();
            this.f11108a = null;
        } else {
            Arrays.fill(O(), 0, this.f11113f, (Object) null);
            Arrays.fill(Q(), 0, this.f11113f, (Object) null);
            m.g(P());
            Arrays.fill(N(), 0, this.f11113f, 0);
        }
        this.f11113f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> y10 = y();
        return y10 != null ? y10.containsKey(obj) : F(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f11113f; i10++) {
            if (eb.k.a(obj, Y(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f11115s;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> t10 = t();
        this.f11115s = t10;
        return t10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.get(obj);
        }
        int F = F(obj);
        if (F == -1) {
            return null;
        }
        o(F);
        return Y(F);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f11114r;
        if (set != null) {
            return set;
        }
        Set<K> v10 = v();
        this.f11114r = v10;
        return v10;
    }

    void o(int i10) {
    }

    int p(int i10, int i11) {
        return i10 - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int i10;
        if (L()) {
            q();
        }
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.put(k10, v10);
        }
        int[] N = N();
        Object[] O = O();
        Object[] Q = Q();
        int i11 = this.f11113f;
        int i12 = i11 + 1;
        int c10 = t.c(k10);
        int D = D();
        int i13 = c10 & D;
        int h10 = m.h(P(), i13);
        if (h10 == 0) {
            if (i12 <= D) {
                m.i(P(), i13, i12);
                i10 = D;
            }
            i10 = T(D, m.e(D), c10, i11);
        } else {
            int b10 = m.b(c10, D);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = N[i15];
                if (m.b(i16, D) == b10 && eb.k.a(k10, O[i15])) {
                    V v11 = (V) Q[i15];
                    Q[i15] = v10;
                    o(i15);
                    return v11;
                }
                int c11 = m.c(i16, D);
                i14++;
                if (c11 != 0) {
                    h10 = c11;
                } else {
                    if (i14 >= 9) {
                        return r().put(k10, v10);
                    }
                    if (i12 <= D) {
                        N[i15] = m.d(i16, i12, D);
                    }
                }
            }
        }
        S(i12);
        H(i11, k10, v10, c10, i10);
        this.f11113f = i12;
        E();
        return null;
    }

    int q() {
        eb.o.v(L(), "Arrays already allocated");
        int i10 = this.f11112e;
        int j10 = m.j(i10);
        this.f11108a = m.a(j10);
        V(j10 - 1);
        this.f11109b = new int[i10];
        this.f11110c = new Object[i10];
        this.f11111d = new Object[i10];
        return i10;
    }

    Map<K, V> r() {
        Map<K, V> u10 = u(D() + 1);
        int B = B();
        while (B >= 0) {
            u10.put(I(B), Y(B));
            B = C(B);
        }
        this.f11108a = u10;
        this.f11109b = null;
        this.f11110c = null;
        this.f11111d = null;
        E();
        return u10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> y10 = y();
        if (y10 != null) {
            return y10.remove(obj);
        }
        V v10 = (V) M(obj);
        if (v10 == f11107u) {
            return null;
        }
        return v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> y10 = y();
        return y10 != null ? y10.size() : this.f11113f;
    }

    Set<Map.Entry<K, V>> t() {
        return new d();
    }

    Map<K, V> u(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    Set<K> v() {
        return new f();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f11116t;
        if (collection != null) {
            return collection;
        }
        Collection<V> w10 = w();
        this.f11116t = w10;
        return w10;
    }

    Collection<V> w() {
        return new h();
    }

    Map<K, V> y() {
        Object obj = this.f11108a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }
}
