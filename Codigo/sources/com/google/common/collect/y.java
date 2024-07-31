package com.google.common.collect;

import com.google.common.collect.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public abstract class y<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d */
    static final Map.Entry<?, ?>[] f11193d = new Map.Entry[0];

    /* renamed from: a */
    private transient a0<Map.Entry<K, V>> f11194a;

    /* renamed from: b */
    private transient a0<K> f11195b;

    /* renamed from: c */
    private transient u<V> f11196c;

    /* loaded from: classes2.dex */
    public static class a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f11197a;

        /* renamed from: b */
        Object[] f11198b;

        /* renamed from: c */
        int f11199c;

        /* renamed from: d */
        boolean f11200d;

        /* renamed from: e */
        C0165a f11201e;

        /* renamed from: com.google.common.collect.y$a$a */
        /* loaded from: classes2.dex */
        public static final class C0165a {

            /* renamed from: a */
            private final Object f11202a;

            /* renamed from: b */
            private final Object f11203b;

            /* renamed from: c */
            private final Object f11204c;

            public C0165a(Object obj, Object obj2, Object obj3) {
                this.f11202a = obj;
                this.f11203b = obj2;
                this.f11204c = obj3;
            }

            public IllegalArgumentException a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f11202a + "=" + this.f11203b + " and " + this.f11202a + "=" + this.f11204c);
            }
        }

        public a() {
            this(4);
        }

        public a(int i10) {
            this.f11198b = new Object[i10 * 2];
            this.f11199c = 0;
            this.f11200d = false;
        }

        private y<K, V> b(boolean z10) {
            Object[] objArr;
            C0165a c0165a;
            C0165a c0165a2;
            if (z10 && (c0165a2 = this.f11201e) != null) {
                throw c0165a2.a();
            }
            int i10 = this.f11199c;
            if (this.f11197a == null) {
                objArr = this.f11198b;
            } else {
                if (this.f11200d) {
                    this.f11198b = Arrays.copyOf(this.f11198b, i10 * 2);
                }
                objArr = this.f11198b;
                if (!z10) {
                    objArr = e(objArr, this.f11199c);
                    if (objArr.length < this.f11198b.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                i(objArr, i10, this.f11197a);
            }
            this.f11200d = true;
            u0 o10 = u0.o(i10, objArr, this);
            if (!z10 || (c0165a = this.f11201e) == null) {
                return o10;
            }
            throw c0165a.a();
        }

        private void d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f11198b;
            if (i11 > objArr.length) {
                this.f11198b = Arrays.copyOf(objArr, u.b.c(objArr.length, i11));
                this.f11200d = false;
            }
        }

        private Object[] e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, r0.a(comparator).e(j0.k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public y<K, V> a() {
            return c();
        }

        public y<K, V> c() {
            return b(true);
        }

        public a<K, V> f(K k10, V v10) {
            d(this.f11199c + 1);
            i.a(k10, v10);
            Object[] objArr = this.f11198b;
            int i10 = this.f11199c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f11199c = i10 + 1;
            return this;
        }

        public a<K, V> g(Map.Entry<? extends K, ? extends V> entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                d(this.f11199c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                g(it.next());
            }
            return this;
        }
    }

    /* loaded from: classes2.dex */
    static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object f11205a;

        /* renamed from: b */
        private final Object f11206b;

        b(y<K, V> yVar) {
            Object[] objArr = new Object[yVar.size()];
            Object[] objArr2 = new Object[yVar.size()];
            h1<Map.Entry<K, V>> it = yVar.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f11205a = objArr;
            this.f11206b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object a() {
            Object[] objArr = (Object[]) this.f11205a;
            Object[] objArr2 = (Object[]) this.f11206b;
            a<K, V> b10 = b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                b10.f(objArr[i10], objArr2[i10]);
            }
            return b10.c();
        }

        a<K, V> b(int i10) {
            return new a<>(i10);
        }

        final Object readResolve() {
            Object obj = this.f11205a;
            if (!(obj instanceof a0)) {
                return a();
            }
            a0 a0Var = (a0) obj;
            u uVar = (u) this.f11206b;
            a aVar = (a<K, V>) b(a0Var.size());
            h1 it = a0Var.iterator();
            h1 it2 = uVar.iterator();
            while (it.hasNext()) {
                aVar.f(it.next(), it2.next());
            }
            return aVar.c();
        }
    }

    public static <K, V> a<K, V> a() {
        return new a<>();
    }

    public static <K, V> y<K, V> b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static <K, V> y<K, V> c(Map<? extends K, ? extends V> map) {
        if ((map instanceof y) && !(map instanceof SortedMap)) {
            y<K, V> yVar = (y) map;
            if (!yVar.i()) {
                return yVar;
            }
        }
        return b(map.entrySet());
    }

    public static <K, V> y<K, V> k() {
        return (y<K, V>) u0.f11160s;
    }

    public static <K, V> y<K, V> l(K k10, V v10) {
        i.a(k10, v10);
        return u0.n(1, new Object[]{k10, v10});
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract a0<Map.Entry<K, V>> d();

    abstract a0<K> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return j0.c(this, obj);
    }

    abstract u<V> f();

    @Override // java.util.Map
    /* renamed from: g */
    public a0<Map.Entry<K, V>> entrySet() {
        a0<Map.Entry<K, V>> a0Var = this.f11194a;
        if (a0Var != null) {
            return a0Var;
        }
        a0<Map.Entry<K, V>> d10 = d();
        this.f11194a = d10;
        return d10;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public int hashCode() {
        return c1.d(entrySet());
    }

    abstract boolean i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j */
    public a0<K> keySet() {
        a0<K> a0Var = this.f11195b;
        if (a0Var != null) {
            return a0Var;
        }
        a0<K> e10 = e();
        this.f11195b = e10;
        return e10;
    }

    @Override // java.util.Map
    /* renamed from: m */
    public u<V> values() {
        u<V> uVar = this.f11196c;
        if (uVar != null) {
            return uVar;
        }
        u<V> f10 = f();
        this.f11196c = f10;
        return f10;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return j0.j(this);
    }

    Object writeReplace() {
        return new b(this);
    }
}
