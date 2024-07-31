package ek;

import dk.e0;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.n;
import uk.l;

/* loaded from: classes3.dex */
public final class d<K, V> implements Map<K, V>, Serializable, pk.c {

    /* renamed from: x, reason: collision with root package name */
    public static final a f14726x = new a(null);

    /* renamed from: y, reason: collision with root package name */
    private static final d f14727y;

    /* renamed from: a, reason: collision with root package name */
    private K[] f14728a;

    /* renamed from: b, reason: collision with root package name */
    private V[] f14729b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f14730c;

    /* renamed from: d, reason: collision with root package name */
    private int[] f14731d;

    /* renamed from: e, reason: collision with root package name */
    private int f14732e;

    /* renamed from: f, reason: collision with root package name */
    private int f14733f;

    /* renamed from: r, reason: collision with root package name */
    private int f14734r;

    /* renamed from: s, reason: collision with root package name */
    private int f14735s;

    /* renamed from: t, reason: collision with root package name */
    private ek.f<K> f14736t;

    /* renamed from: u, reason: collision with root package name */
    private g<V> f14737u;

    /* renamed from: v, reason: collision with root package name */
    private ek.e<K, V> f14738v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14739w;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i10) {
            int b10;
            b10 = l.b(i10, 1);
            return Integer.highestOneBit(b10 * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        public final d e() {
            return d.f14727y;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b<K, V> extends C0231d<K, V> implements Iterator<Map.Entry<K, V>>, pk.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d<K, V> map) {
            super(map);
            n.e(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (a() >= ((d) d()).f14733f) {
                throw new NoSuchElementException();
            }
            int a10 = a();
            f(a10 + 1);
            g(a10);
            c<K, V> cVar = new c<>(d(), c());
            e();
            return cVar;
        }

        public final void j(StringBuilder sb2) {
            n.e(sb2, "sb");
            if (a() >= ((d) d()).f14733f) {
                throw new NoSuchElementException();
            }
            int a10 = a();
            f(a10 + 1);
            g(a10);
            Object obj = ((d) d()).f14728a[c()];
            if (n.a(obj, d())) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((d) d()).f14729b;
            n.b(objArr);
            Object obj2 = objArr[c()];
            if (n.a(obj2, d())) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            e();
        }

        public final int k() {
            if (a() >= ((d) d()).f14733f) {
                throw new NoSuchElementException();
            }
            int a10 = a();
            f(a10 + 1);
            g(a10);
            Object obj = ((d) d()).f14728a[c()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((d) d()).f14729b;
            n.b(objArr);
            Object obj2 = objArr[c()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            e();
            return hashCode2;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, pk.a {

        /* renamed from: a, reason: collision with root package name */
        private final d<K, V> f14740a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14741b;

        public c(d<K, V> map, int i10) {
            n.e(map, "map");
            this.f14740a = map;
            this.f14741b = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (n.a(entry.getKey(), getKey()) && n.a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((d) this.f14740a).f14728a[this.f14741b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((d) this.f14740a).f14729b;
            n.b(objArr);
            return (V) objArr[this.f14741b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            this.f14740a.l();
            Object[] j10 = this.f14740a.j();
            int i10 = this.f14741b;
            V v11 = (V) j10[i10];
            j10[i10] = v10;
            return v11;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* renamed from: ek.d$d, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0231d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        private final d<K, V> f14742a;

        /* renamed from: b, reason: collision with root package name */
        private int f14743b;

        /* renamed from: c, reason: collision with root package name */
        private int f14744c;

        public C0231d(d<K, V> map) {
            n.e(map, "map");
            this.f14742a = map;
            this.f14744c = -1;
            e();
        }

        public final int a() {
            return this.f14743b;
        }

        public final int c() {
            return this.f14744c;
        }

        public final d<K, V> d() {
            return this.f14742a;
        }

        public final void e() {
            while (this.f14743b < ((d) this.f14742a).f14733f) {
                int[] iArr = ((d) this.f14742a).f14730c;
                int i10 = this.f14743b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f14743b = i10 + 1;
                }
            }
        }

        public final void f(int i10) {
            this.f14743b = i10;
        }

        public final void g(int i10) {
            this.f14744c = i10;
        }

        public final boolean hasNext() {
            return this.f14743b < ((d) this.f14742a).f14733f;
        }

        public final void remove() {
            if (!(this.f14744c != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f14742a.l();
            this.f14742a.L(this.f14744c);
            this.f14744c = -1;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e<K, V> extends C0231d<K, V> implements Iterator<K>, pk.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d<K, V> map) {
            super(map);
            n.e(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (a() >= ((d) d()).f14733f) {
                throw new NoSuchElementException();
            }
            int a10 = a();
            f(a10 + 1);
            g(a10);
            K k10 = (K) ((d) d()).f14728a[c()];
            e();
            return k10;
        }
    }

    /* loaded from: classes3.dex */
    public static final class f<K, V> extends C0231d<K, V> implements Iterator<V>, pk.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d<K, V> map) {
            super(map);
            n.e(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (a() >= ((d) d()).f14733f) {
                throw new NoSuchElementException();
            }
            int a10 = a();
            f(a10 + 1);
            g(a10);
            Object[] objArr = ((d) d()).f14729b;
            n.b(objArr);
            V v10 = (V) objArr[c()];
            e();
            return v10;
        }
    }

    static {
        d dVar = new d(0);
        dVar.f14739w = true;
        f14727y = dVar;
    }

    public d() {
        this(8);
    }

    public d(int i10) {
        this(ek.c.d(i10), null, new int[i10], new int[f14726x.c(i10)], 2, 0);
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f14728a = kArr;
        this.f14729b = vArr;
        this.f14730c = iArr;
        this.f14731d = iArr2;
        this.f14732e = i10;
        this.f14733f = i11;
        this.f14734r = f14726x.d(x());
    }

    private final int B(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f14734r;
    }

    private final boolean E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        r(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (F(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    private final boolean F(Map.Entry<? extends K, ? extends V> entry) {
        int i10 = i(entry.getKey());
        V[] j10 = j();
        if (i10 >= 0) {
            j10[i10] = entry.getValue();
            return true;
        }
        int i11 = (-i10) - 1;
        if (n.a(entry.getValue(), j10[i11])) {
            return false;
        }
        j10[i11] = entry.getValue();
        return true;
    }

    private final boolean G(int i10) {
        int B = B(this.f14728a[i10]);
        int i11 = this.f14732e;
        while (true) {
            int[] iArr = this.f14731d;
            if (iArr[B] == 0) {
                iArr[B] = i10 + 1;
                this.f14730c[i10] = B;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            B = B == 0 ? x() - 1 : B - 1;
        }
    }

    private final void H(int i10) {
        if (this.f14733f > size()) {
            m();
        }
        int i11 = 0;
        if (i10 != x()) {
            this.f14731d = new int[i10];
            this.f14734r = f14726x.d(i10);
        } else {
            dk.l.j(this.f14731d, 0, 0, x());
        }
        while (i11 < this.f14733f) {
            int i12 = i11 + 1;
            if (!G(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    private final void J(int i10) {
        int d10;
        d10 = l.d(this.f14732e * 2, x() / 2);
        int i11 = d10;
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? x() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f14732e) {
                this.f14731d[i13] = 0;
                return;
            }
            int[] iArr = this.f14731d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((B(this.f14728a[i15]) - i10) & (x() - 1)) >= i12) {
                    this.f14731d[i13] = i14;
                    this.f14730c[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f14731d[i13] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(int i10) {
        ek.c.f(this.f14728a, i10);
        J(this.f14730c[i10]);
        this.f14730c[i10] = -1;
        this.f14735s = size() - 1;
    }

    private final boolean N(int i10) {
        int v10 = v();
        int i11 = this.f14733f;
        int i12 = v10 - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= v() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] j() {
        V[] vArr = this.f14729b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) ek.c.d(v());
        this.f14729b = vArr2;
        return vArr2;
    }

    private final void m() {
        int i10;
        V[] vArr = this.f14729b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f14733f;
            if (i11 >= i10) {
                break;
            }
            if (this.f14730c[i11] >= 0) {
                K[] kArr = this.f14728a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        ek.c.g(this.f14728a, i12, i10);
        if (vArr != null) {
            ek.c.g(vArr, i12, this.f14733f);
        }
        this.f14733f = i12;
    }

    private final boolean p(Map<?, ?> map) {
        return size() == map.size() && n(map.entrySet());
    }

    private final void q(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > v()) {
            int v10 = (v() * 3) / 2;
            if (i10 <= v10) {
                i10 = v10;
            }
            this.f14728a = (K[]) ek.c.e(this.f14728a, i10);
            V[] vArr = this.f14729b;
            this.f14729b = vArr != null ? (V[]) ek.c.e(vArr, i10) : null;
            int[] copyOf = Arrays.copyOf(this.f14730c, i10);
            n.d(copyOf, "copyOf(this, newSize)");
            this.f14730c = copyOf;
            int c10 = f14726x.c(i10);
            if (c10 > x()) {
                H(c10);
            }
        }
    }

    private final void r(int i10) {
        if (N(i10)) {
            H(x());
        } else {
            q(this.f14733f + i10);
        }
    }

    private final int t(K k10) {
        int B = B(k10);
        int i10 = this.f14732e;
        while (true) {
            int i11 = this.f14731d[B];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (n.a(this.f14728a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            B = B == 0 ? x() - 1 : B - 1;
        }
    }

    private final int u(V v10) {
        int i10 = this.f14733f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f14730c[i10] >= 0) {
                V[] vArr = this.f14729b;
                n.b(vArr);
                if (n.a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final Object writeReplace() {
        if (this.f14739w) {
            return new i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int x() {
        return this.f14731d.length;
    }

    public Collection<V> A() {
        g<V> gVar = this.f14737u;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.f14737u = gVar2;
        return gVar2;
    }

    public final boolean C() {
        return this.f14739w;
    }

    public final e<K, V> D() {
        return new e<>(this);
    }

    public final boolean I(Map.Entry<? extends K, ? extends V> entry) {
        n.e(entry, "entry");
        l();
        int t10 = t(entry.getKey());
        if (t10 < 0) {
            return false;
        }
        V[] vArr = this.f14729b;
        n.b(vArr);
        if (!n.a(vArr[t10], entry.getValue())) {
            return false;
        }
        L(t10);
        return true;
    }

    public final int K(K k10) {
        l();
        int t10 = t(k10);
        if (t10 < 0) {
            return -1;
        }
        L(t10);
        return t10;
    }

    public final boolean M(V v10) {
        l();
        int u10 = u(v10);
        if (u10 < 0) {
            return false;
        }
        L(u10);
        return true;
    }

    public final f<K, V> O() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        l();
        e0 it = new uk.f(0, this.f14733f - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f14730c;
            int i10 = iArr[nextInt];
            if (i10 >= 0) {
                this.f14731d[i10] = 0;
                iArr[nextInt] = -1;
            }
        }
        ek.c.g(this.f14728a, 0, this.f14733f);
        V[] vArr = this.f14729b;
        if (vArr != null) {
            ek.c.g(vArr, 0, this.f14733f);
        }
        this.f14735s = 0;
        this.f14733f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return t(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return u(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return w();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && p((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int t10 = t(obj);
        if (t10 < 0) {
            return null;
        }
        V[] vArr = this.f14729b;
        n.b(vArr);
        return vArr[t10];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> s10 = s();
        int i10 = 0;
        while (s10.hasNext()) {
            i10 += s10.k();
        }
        return i10;
    }

    public final int i(K k10) {
        int d10;
        l();
        while (true) {
            int B = B(k10);
            d10 = l.d(this.f14732e * 2, x() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f14731d[B];
                if (i11 <= 0) {
                    if (this.f14733f < v()) {
                        int i12 = this.f14733f;
                        int i13 = i12 + 1;
                        this.f14733f = i13;
                        this.f14728a[i12] = k10;
                        this.f14730c[i12] = B;
                        this.f14731d[B] = i13;
                        this.f14735s = size() + 1;
                        if (i10 > this.f14732e) {
                            this.f14732e = i10;
                        }
                        return i12;
                    }
                    r(1);
                } else {
                    if (n.a(this.f14728a[i11 - 1], k10)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > d10) {
                        H(x() * 2);
                        break;
                    }
                    B = B == 0 ? x() - 1 : B - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final Map<K, V> k() {
        l();
        this.f14739w = true;
        if (size() > 0) {
            return this;
        }
        d dVar = f14727y;
        n.c(dVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return dVar;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return y();
    }

    public final void l() {
        if (this.f14739w) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean n(Collection<?> m10) {
        n.e(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean o(Map.Entry<? extends K, ? extends V> entry) {
        n.e(entry, "entry");
        int t10 = t(entry.getKey());
        if (t10 < 0) {
            return false;
        }
        V[] vArr = this.f14729b;
        n.b(vArr);
        return n.a(vArr[t10], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        l();
        int i10 = i(k10);
        V[] j10 = j();
        if (i10 >= 0) {
            j10[i10] = v10;
            return null;
        }
        int i11 = (-i10) - 1;
        V v11 = j10[i11];
        j10[i11] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        n.e(from, "from");
        l();
        E(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int K = K(obj);
        if (K < 0) {
            return null;
        }
        V[] vArr = this.f14729b;
        n.b(vArr);
        V v10 = vArr[K];
        ek.c.f(vArr, K);
        return v10;
    }

    public final b<K, V> s() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return z();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> s10 = s();
        int i10 = 0;
        while (s10.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            s10.j(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        n.d(sb3, "sb.toString()");
        return sb3;
    }

    public final int v() {
        return this.f14728a.length;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return A();
    }

    public Set<Map.Entry<K, V>> w() {
        ek.e<K, V> eVar = this.f14738v;
        if (eVar != null) {
            return eVar;
        }
        ek.e<K, V> eVar2 = new ek.e<>(this);
        this.f14738v = eVar2;
        return eVar2;
    }

    public Set<K> y() {
        ek.f<K> fVar = this.f14736t;
        if (fVar != null) {
            return fVar;
        }
        ek.f<K> fVar2 = new ek.f<>(this);
        this.f14736t = fVar2;
        return fVar2;
    }

    public int z() {
        return this.f14735s;
    }
}
