package com.google.common.collect;

import com.google.common.collect.y;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u0<K, V> extends y<K, V> {

    /* renamed from: s, reason: collision with root package name */
    static final y<Object, Object> f11160s = new u0(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f11161e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f11162f;

    /* renamed from: r, reason: collision with root package name */
    private final transient int f11163r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a<K, V> extends a0<Map.Entry<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        private final transient y<K, V> f11164c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f11165d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f11166e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f11167f;

        /* renamed from: com.google.common.collect.u0$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class C0164a extends w<Map.Entry<K, V>> {
            C0164a() {
            }

            @Override // java.util.List
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                eb.o.m(i10, a.this.f11167f);
                int i11 = i10 * 2;
                Object obj = a.this.f11165d[a.this.f11166e + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f11165d[i11 + (a.this.f11166e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.u
            public boolean l() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f11167f;
            }
        }

        a(y<K, V> yVar, Object[] objArr, int i10, int i11) {
            this.f11164c = yVar;
            this.f11165d = objArr;
            this.f11166e = i10;
            this.f11167f = i11;
        }

        @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f11164c.get(key));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u
        public int d(Object[] objArr, int i10) {
            return c().d(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u
        public boolean l() {
            return true;
        }

        @Override // com.google.common.collect.a0, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public h1<Map.Entry<K, V>> iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11167f;
        }

        @Override // com.google.common.collect.a0
        w<Map.Entry<K, V>> t() {
            return new C0164a();
        }
    }

    /* loaded from: classes2.dex */
    static final class b<K> extends a0<K> {

        /* renamed from: c, reason: collision with root package name */
        private final transient y<K, ?> f11169c;

        /* renamed from: d, reason: collision with root package name */
        private final transient w<K> f11170d;

        b(y<K, ?> yVar, w<K> wVar) {
            this.f11169c = yVar;
            this.f11170d = wVar;
        }

        @Override // com.google.common.collect.a0, com.google.common.collect.u
        public w<K> c() {
            return this.f11170d;
        }

        @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11169c.get(obj) != null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u
        public int d(Object[] objArr, int i10) {
            return c().d(objArr, i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u
        public boolean l() {
            return true;
        }

        @Override // com.google.common.collect.a0, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: m */
        public h1<K> iterator() {
            return c().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f11169c.size();
        }
    }

    /* loaded from: classes2.dex */
    static final class c extends w<Object> {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f11171c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f11172d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f11173e;

        c(Object[] objArr, int i10, int i11) {
            this.f11171c = objArr;
            this.f11172d = i10;
            this.f11173e = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            eb.o.m(i10, this.f11173e);
            Object obj = this.f11171c[(i10 * 2) + this.f11172d];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.u
        public boolean l() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11173e;
        }
    }

    private u0(Object obj, Object[] objArr, int i10) {
        this.f11161e = obj;
        this.f11162f = objArr;
        this.f11163r = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> u0<K, V> n(int i10, Object[] objArr) {
        return o(i10, objArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> u0<K, V> o(int i10, Object[] objArr, y.a<K, V> aVar) {
        if (i10 == 0) {
            return (u0) f11160s;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            i.a(obj, obj2);
            return new u0<>(null, objArr, 1);
        }
        eb.o.r(i10, objArr.length >> 1);
        Object p10 = p(objArr, i10, a0.p(i10), 0);
        if (p10 instanceof Object[]) {
            Object[] objArr2 = (Object[]) p10;
            y.a.C0165a c0165a = (y.a.C0165a) objArr2[2];
            if (aVar == null) {
                throw c0165a.a();
            }
            aVar.f11201e = c0165a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            p10 = obj3;
            i10 = intValue;
        }
        return new u0<>(p10, objArr, i10);
    }

    private static Object p(Object[] objArr, int i10, int i11, int i12) {
        y.a.C0165a c0165a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            i.a(obj, obj2);
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
                i.a(obj3, obj4);
                int b10 = t.b(obj3.hashCode());
                while (true) {
                    int i19 = b10 & i13;
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
                            c0165a = new y.a.C0165a(obj3, obj4, obj5);
                            objArr[i21] = obj4;
                            break;
                        }
                        b10 = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c0165a};
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
                i.a(obj6, obj7);
                int b11 = t.b(obj6.hashCode());
                while (true) {
                    int i26 = b11 & i13;
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
                            c0165a = new y.a.C0165a(obj6, obj7, obj8);
                            objArr[i28] = obj7;
                            break;
                        }
                        b11 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c0165a};
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
            i.a(obj9, obj10);
            int b12 = t.b(obj9.hashCode());
            while (true) {
                int i33 = b12 & i13;
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
                        c0165a = new y.a.C0165a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    }
                    b12 = i33 + 1;
                    i14 = -1;
                }
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c0165a};
    }

    static Object q(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
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
            int b10 = t.b(obj2.hashCode());
            while (true) {
                int i12 = b10 & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                b10 = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b11 = t.b(obj2.hashCode());
            while (true) {
                int i14 = b11 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                b11 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b12 = t.b(obj2.hashCode());
            while (true) {
                int i16 = b12 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                b12 = i16 + 1;
            }
        }
    }

    @Override // com.google.common.collect.y
    a0<Map.Entry<K, V>> d() {
        return new a(this, this.f11162f, 0, this.f11163r);
    }

    @Override // com.google.common.collect.y
    a0<K> e() {
        return new b(this, new c(this.f11162f, 0, this.f11163r));
    }

    @Override // com.google.common.collect.y
    u<V> f() {
        return new c(this.f11162f, 1, this.f11163r);
    }

    @Override // com.google.common.collect.y, java.util.Map
    public V get(Object obj) {
        V v10 = (V) q(this.f11161e, this.f11162f, this.f11163r, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // com.google.common.collect.y
    boolean i() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f11163r;
    }
}
