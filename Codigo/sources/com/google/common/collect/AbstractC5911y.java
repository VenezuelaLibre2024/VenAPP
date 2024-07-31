package com.google.common.collect;

import com.google.common.collect.AbstractC5903u;
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

/* renamed from: com.google.common.collect.y */
/* loaded from: classes2.dex */
public abstract class AbstractC5911y<K, V> implements Map<K, V>, Serializable {

    /* renamed from: d */
    static final Map.Entry<?, ?>[] f12408d = new Map.Entry[0];

    /* renamed from: a */
    private transient AbstractC5855a0<Map.Entry<K, V>> f12409a;

    /* renamed from: b */
    private transient AbstractC5855a0<K> f12410b;

    /* renamed from: c */
    private transient AbstractC5903u<V> f12411c;

    /* renamed from: com.google.common.collect.y$a */
    /* loaded from: classes2.dex */
    public static class a<K, V> {

        /* renamed from: a */
        Comparator<? super V> f12412a;

        /* renamed from: b */
        Object[] f12413b;

        /* renamed from: c */
        int f12414c;

        /* renamed from: d */
        boolean f12415d;

        /* renamed from: e */
        C13194a f12416e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C13194a {

            /* renamed from: a */
            private final Object f12417a;

            /* renamed from: b */
            private final Object f12418b;

            /* renamed from: c */
            private final Object f12419c;

            /* JADX INFO: Access modifiers changed from: package-private */
            public C13194a(Object obj, Object obj2, Object obj3) {
                this.f12417a = obj;
                this.f12418b = obj2;
                this.f12419c = obj3;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: a */
            public IllegalArgumentException m15125a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f12417a + "=" + this.f12418b + " and " + this.f12417a + "=" + this.f12419c);
            }
        }

        public a() {
            this(4);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10) {
            this.f12413b = new Object[i10 * 2];
            this.f12414c = 0;
            this.f12415d = false;
        }

        /* renamed from: b */
        private AbstractC5911y<K, V> m15116b(boolean z10) {
            Object[] objArr;
            C13194a c13194a;
            C13194a c13194a2;
            if (z10 && (c13194a2 = this.f12416e) != null) {
                throw c13194a2.m15125a();
            }
            int i10 = this.f12414c;
            if (this.f12412a == null) {
                objArr = this.f12413b;
            } else {
                if (this.f12415d) {
                    this.f12413b = Arrays.copyOf(this.f12413b, i10 * 2);
                }
                objArr = this.f12413b;
                if (!z10) {
                    objArr = m15118e(objArr, this.f12414c);
                    if (objArr.length < this.f12413b.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                m15119i(objArr, i10, this.f12412a);
            }
            this.f12415d = true;
            C5904u0 m15062o = C5904u0.m15062o(i10, objArr, this);
            if (!z10 || (c13194a = this.f12416e) == null) {
                return m15062o;
            }
            throw c13194a.m15125a();
        }

        /* renamed from: d */
        private void m15117d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f12413b;
            if (i11 > objArr.length) {
                this.f12413b = Arrays.copyOf(objArr, AbstractC5903u.b.m15060c(objArr.length, i11));
                this.f12415d = false;
            }
        }

        /* renamed from: e */
        private Object[] m15118e(Object[] objArr, int i10) {
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

        /* renamed from: i */
        static <V> void m15119i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, AbstractC5898r0.m15039a(comparator).m15043e(C5882j0.m14898k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        /* renamed from: a */
        public AbstractC5911y<K, V> m15120a() {
            return m15121c();
        }

        /* renamed from: c */
        public AbstractC5911y<K, V> m15121c() {
            return m15116b(true);
        }

        /* renamed from: f */
        public a<K, V> m15122f(K k10, V v10) {
            m15117d(this.f12414c + 1);
            C5878i.m14882a(k10, v10);
            Object[] objArr = this.f12413b;
            int i10 = this.f12414c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f12414c = i10 + 1;
            return this;
        }

        /* renamed from: g */
        public a<K, V> m15123g(Map.Entry<? extends K, ? extends V> entry) {
            return m15122f(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        public a<K, V> m15124h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m15117d(this.f12414c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                m15123g(it.next());
            }
            return this;
        }
    }

    /* renamed from: com.google.common.collect.y$b */
    /* loaded from: classes2.dex */
    static class b<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final Object f12420a;

        /* renamed from: b */
        private final Object f12421b;

        b(AbstractC5911y<K, V> abstractC5911y) {
            Object[] objArr = new Object[abstractC5911y.size()];
            Object[] objArr2 = new Object[abstractC5911y.size()];
            AbstractC5877h1<Map.Entry<K, V>> it = abstractC5911y.entrySet().iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i10] = next.getKey();
                objArr2[i10] = next.getValue();
                i10++;
            }
            this.f12420a = objArr;
            this.f12421b = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        final Object m15126a() {
            Object[] objArr = (Object[]) this.f12420a;
            Object[] objArr2 = (Object[]) this.f12421b;
            a<K, V> m15127b = m15127b(objArr.length);
            for (int i10 = 0; i10 < objArr.length; i10++) {
                m15127b.m15122f(objArr[i10], objArr2[i10]);
            }
            return m15127b.m15121c();
        }

        /* renamed from: b */
        a<K, V> m15127b(int i10) {
            return new a<>(i10);
        }

        final Object readResolve() {
            Object obj = this.f12420a;
            if (!(obj instanceof AbstractC5855a0)) {
                return m15126a();
            }
            AbstractC5855a0 abstractC5855a0 = (AbstractC5855a0) obj;
            AbstractC5903u abstractC5903u = (AbstractC5903u) this.f12421b;
            a aVar = (a<K, V>) m15127b(abstractC5855a0.size());
            AbstractC5877h1 it = abstractC5855a0.iterator();
            AbstractC5877h1 it2 = abstractC5903u.iterator();
            while (it.hasNext()) {
                aVar.m15122f(it.next(), it2.next());
            }
            return aVar.m15121c();
        }
    }

    /* renamed from: a */
    public static <K, V> a<K, V> m15108a() {
        return new a<>();
    }

    /* renamed from: b */
    public static <K, V> AbstractC5911y<K, V> m15109b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.m15124h(iterable);
        return aVar.m15120a();
    }

    /* renamed from: c */
    public static <K, V> AbstractC5911y<K, V> m15110c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC5911y) && !(map instanceof SortedMap)) {
            AbstractC5911y<K, V> abstractC5911y = (AbstractC5911y) map;
            if (!abstractC5911y.mo15068i()) {
                return abstractC5911y;
            }
        }
        return m15109b(map.entrySet());
    }

    /* renamed from: k */
    public static <K, V> AbstractC5911y<K, V> m15111k() {
        return (AbstractC5911y<K, V>) C5904u0.f12375s;
    }

    /* renamed from: l */
    public static <K, V> AbstractC5911y<K, V> m15112l(K k10, V v10) {
        C5878i.m14882a(k10, v10);
        return C5904u0.m15061n(1, new Object[]{k10, v10});
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

    /* renamed from: d */
    abstract AbstractC5855a0<Map.Entry<K, V>> mo15065d();

    /* renamed from: e */
    abstract AbstractC5855a0<K> mo15066e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return C5882j0.m14890c(this, obj);
    }

    /* renamed from: f */
    abstract AbstractC5903u<V> mo15067f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC5855a0<Map.Entry<K, V>> entrySet() {
        AbstractC5855a0<Map.Entry<K, V>> abstractC5855a0 = this.f12409a;
        if (abstractC5855a0 != null) {
            return abstractC5855a0;
        }
        AbstractC5855a0<Map.Entry<K, V>> mo15065d = mo15065d();
        this.f12409a = mo15065d;
        return mo15065d;
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
        return C5862c1.m14774d(entrySet());
    }

    /* renamed from: i */
    abstract boolean mo15068i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC5855a0<K> keySet() {
        AbstractC5855a0<K> abstractC5855a0 = this.f12410b;
        if (abstractC5855a0 != null) {
            return abstractC5855a0;
        }
        AbstractC5855a0<K> mo15066e = mo15066e();
        this.f12410b = mo15066e;
        return mo15066e;
    }

    @Override // java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC5903u<V> values() {
        AbstractC5903u<V> abstractC5903u = this.f12411c;
        if (abstractC5903u != null) {
            return abstractC5903u;
        }
        AbstractC5903u<V> mo15067f = mo15067f();
        this.f12411c = mo15067f;
        return mo15067f;
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
        return C5882j0.m14897j(this);
    }

    Object writeReplace() {
        return new b(this);
    }
}
