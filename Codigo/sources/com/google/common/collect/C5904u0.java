package com.google.common.collect;

import com.google.common.collect.AbstractC5911y;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.u0 */
/* loaded from: classes2.dex */
public final class C5904u0<K, V> extends AbstractC5911y<K, V> {

    /* renamed from: s */
    static final AbstractC5911y<Object, Object> f12375s = new C5904u0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: e */
    private final transient Object f12376e;

    /* renamed from: f */
    final transient Object[] f12377f;

    /* renamed from: r */
    private final transient int f12378r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.u0$a */
    /* loaded from: classes2.dex */
    public static class a<K, V> extends AbstractC5855a0<Map.Entry<K, V>> {

        /* renamed from: c */
        private final transient AbstractC5911y<K, V> f12379c;

        /* renamed from: d */
        private final transient Object[] f12380d;

        /* renamed from: e */
        private final transient int f12381e;

        /* renamed from: f */
        private final transient int f12382f;

        /* renamed from: com.google.common.collect.u0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C13193a extends AbstractC5907w<Map.Entry<K, V>> {
            C13193a() {
            }

            @Override // java.util.List
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                C7159o.m21310m(i10, a.this.f12382f);
                int i11 = i10 * 2;
                Object obj = a.this.f12380d[a.this.f12381e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f12380d[i11 + (a.this.f12381e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.AbstractC5903u
            /* renamed from: l */
            public boolean mo14745l() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f12382f;
            }
        }

        a(AbstractC5911y<K, V> abstractC5911y, Object[] objArr, int i10, int i11) {
            this.f12379c = abstractC5911y;
            this.f12380d = objArr;
            this.f12381e = i10;
            this.f12382f = i11;
        }

        @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f12379c.get(key));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: d */
        public int mo14834d(Object[] objArr, int i10) {
            return mo14719c().mo14834d(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: l */
        public boolean mo14745l() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public AbstractC5877h1<Map.Entry<K, V>> iterator() {
            return mo14719c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f12382f;
        }

        @Override // com.google.common.collect.AbstractC5855a0
        /* renamed from: t */
        AbstractC5907w<Map.Entry<K, V>> mo14721t() {
            return new C13193a();
        }
    }

    /* renamed from: com.google.common.collect.u0$b */
    /* loaded from: classes2.dex */
    static final class b<K> extends AbstractC5855a0<K> {

        /* renamed from: c */
        private final transient AbstractC5911y<K, ?> f12384c;

        /* renamed from: d */
        private final transient AbstractC5907w<K> f12385d;

        b(AbstractC5911y<K, ?> abstractC5911y, AbstractC5907w<K> abstractC5907w) {
            this.f12384c = abstractC5911y;
            this.f12385d = abstractC5907w;
        }

        @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u
        /* renamed from: c */
        public AbstractC5907w<K> mo14719c() {
            return this.f12385d;
        }

        @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f12384c.get(obj) != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: d */
        public int mo14834d(Object[] objArr, int i10) {
            return mo14719c().mo14834d(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: l */
        public boolean mo14745l() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public AbstractC5877h1<K> iterator() {
            return mo14719c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f12384c.size();
        }
    }

    /* renamed from: com.google.common.collect.u0$c */
    /* loaded from: classes2.dex */
    static final class c extends AbstractC5907w<Object> {

        /* renamed from: c */
        private final transient Object[] f12386c;

        /* renamed from: d */
        private final transient int f12387d;

        /* renamed from: e */
        private final transient int f12388e;

        c(Object[] objArr, int i10, int i11) {
            this.f12386c = objArr;
            this.f12387d = i10;
            this.f12388e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            C7159o.m21310m(i10, this.f12388e);
            Object obj = this.f12386c[(i10 * 2) + this.f12387d];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: l */
        public boolean mo14745l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12388e;
        }
    }

    private C5904u0(Object obj, Object[] objArr, int i10) {
        this.f12376e = obj;
        this.f12377f = objArr;
        this.f12378r = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static <K, V> C5904u0<K, V> m15061n(int i10, Object[] objArr) {
        return m15062o(i10, objArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <K, V> C5904u0<K, V> m15062o(int i10, Object[] objArr, AbstractC5911y.a<K, V> aVar) {
        if (i10 == 0) {
            return (C5904u0) f12375s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C5878i.m14882a(obj, obj2);
            return new C5904u0<>(null, objArr, 1);
        }
        C7159o.m21315r(i10, objArr.length >> 1);
        Object m15063p = m15063p(objArr, i10, AbstractC5855a0.m14710p(i10), 0);
        if (m15063p instanceof Object[]) {
            Object[] objArr2 = (Object[]) m15063p;
            AbstractC5911y.a.C13194a c13194a = (AbstractC5911y.a.C13194a) objArr2[2];
            if (aVar == null) {
                throw c13194a.m15125a();
            }
            aVar.f12416e = c13194a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            m15063p = obj3;
            i10 = intValue;
        }
        return new C5904u0<>(m15063p, objArr, i10);
    }

    /* renamed from: p */
    private static Object m15063p(Object[] objArr, int i10, int i11, int i12) {
        AbstractC5911y.a.C13194a c13194a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            C5878i.m14882a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                C5878i.m14882a(obj3, obj4);
                int m15050b = C5901t.m15050b(obj3.hashCode());
                while (true) {
                    int i19 = m15050b & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else {
                        if (obj3.equals(objArr[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj5 = objArr[i21];
                            Objects.requireNonNull(obj5);
                            c13194a = new AbstractC5911y.a.C13194a(obj3, obj4, obj5);
                            objArr[i21] = obj4;
                            break;
                        }
                        m15050b = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c13194a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                C5878i.m14882a(obj6, obj7);
                int m15050b2 = C5901t.m15050b(obj6.hashCode());
                while (true) {
                    int i26 = m15050b2 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else {
                        if (obj6.equals(objArr[i27])) {
                            int i28 = i27 ^ 1;
                            Object obj8 = objArr[i28];
                            Objects.requireNonNull(obj8);
                            c13194a = new AbstractC5911y.a.C13194a(obj6, obj7, obj8);
                            objArr[i28] = obj7;
                            break;
                        }
                        m15050b2 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c13194a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ 1];
            Objects.requireNonNull(obj10);
            C5878i.m14882a(obj9, obj10);
            int m15050b3 = C5901t.m15050b(obj9.hashCode());
            while (true) {
                int i33 = m15050b3 & i13;
                int i34 = iArr[i33];
                if (i34 == i14) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                } else {
                    if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c13194a = new AbstractC5911y.a.C13194a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    }
                    m15050b3 = i33 + 1;
                    i14 = -1;
                }
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c13194a};
    }

    /* renamed from: q */
    static Object m15064q(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int m15050b = C5901t.m15050b(obj2.hashCode());
            while (true) {
                int i12 = m15050b & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                m15050b = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int m15050b2 = C5901t.m15050b(obj2.hashCode());
            while (true) {
                int i14 = m15050b2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                m15050b2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int m15050b3 = C5901t.m15050b(obj2.hashCode());
            while (true) {
                int i16 = m15050b3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                m15050b3 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.AbstractC5911y
    /* renamed from: d */
    AbstractC5855a0<Map.Entry<K, V>> mo15065d() {
        return new a(this, this.f12377f, 0, this.f12378r);
    }

    @Override // com.google.common.collect.AbstractC5911y
    /* renamed from: e */
    AbstractC5855a0<K> mo15066e() {
        return new b(this, new c(this.f12377f, 0, this.f12378r));
    }

    @Override // com.google.common.collect.AbstractC5911y
    /* renamed from: f */
    AbstractC5903u<V> mo15067f() {
        return new c(this.f12377f, 1, this.f12378r);
    }

    @Override // com.google.common.collect.AbstractC5911y, java.util.Map
    public V get(Object obj) {
        V v10 = (V) m15064q(this.f12376e, this.f12377f, this.f12378r, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.AbstractC5911y
    /* renamed from: i */
    boolean mo15068i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f12378r;
    }
}
