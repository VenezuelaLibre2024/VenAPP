package p088ek;

import dk.AbstractC7006e0;
import dk.C7019l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import pk.InterfaceC10201a;
import pk.InterfaceC10203c;
import uk.C11579f;
import uk.C11585l;

/* renamed from: ek.d */
/* loaded from: classes3.dex */
public final class C7201d<K, V> implements Map<K, V>, Serializable, InterfaceC10203c {

    /* renamed from: x */
    public static final a f16149x = new a(null);

    /* renamed from: y */
    private static final C7201d f16150y;

    /* renamed from: a */
    private K[] f16151a;

    /* renamed from: b */
    private V[] f16152b;

    /* renamed from: c */
    private int[] f16153c;

    /* renamed from: d */
    private int[] f16154d;

    /* renamed from: e */
    private int f16155e;

    /* renamed from: f */
    private int f16156f;

    /* renamed from: r */
    private int f16157r;

    /* renamed from: s */
    private int f16158s;

    /* renamed from: t */
    private C7203f<K> f16159t;

    /* renamed from: u */
    private C7204g<V> f16160u;

    /* renamed from: v */
    private C7202e<K, V> f16161v;

    /* renamed from: w */
    private boolean f16162w;

    /* renamed from: ek.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public final int m21525c(int i10) {
            int m36293b;
            m36293b = C11585l.m36293b(i10, 1);
            return Integer.highestOneBit(m36293b * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public final int m21526d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        /* renamed from: e */
        public final C7201d m21527e() {
            return C7201d.f16150y;
        }
    }

    /* renamed from: ek.d$b */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC10201a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7201d<K, V> map) {
            super(map);
            C9322n.m27781e(map, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            if (m21531a() >= ((C7201d) m21533d()).f16156f) {
                throw new NoSuchElementException();
            }
            int m21531a = m21531a();
            m21535f(m21531a + 1);
            m21536g(m21531a);
            c<K, V> cVar = new c<>(m21533d(), m21532c());
            m21534e();
            return cVar;
        }

        /* renamed from: j */
        public final void m21529j(StringBuilder sb2) {
            C9322n.m27781e(sb2, "sb");
            if (m21531a() >= ((C7201d) m21533d()).f16156f) {
                throw new NoSuchElementException();
            }
            int m21531a = m21531a();
            m21535f(m21531a + 1);
            m21536g(m21531a);
            Object obj = ((C7201d) m21533d()).f16151a[m21532c()];
            if (C9322n.m27777a(obj, m21533d())) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = ((C7201d) m21533d()).f16152b;
            C9322n.m27778b(objArr);
            Object obj2 = objArr[m21532c()];
            if (C9322n.m27777a(obj2, m21533d())) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            m21534e();
        }

        /* renamed from: k */
        public final int m21530k() {
            if (m21531a() >= ((C7201d) m21533d()).f16156f) {
                throw new NoSuchElementException();
            }
            int m21531a = m21531a();
            m21535f(m21531a + 1);
            m21536g(m21531a);
            Object obj = ((C7201d) m21533d()).f16151a[m21532c()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = ((C7201d) m21533d()).f16152b;
            C9322n.m27778b(objArr);
            Object obj2 = objArr[m21532c()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m21534e();
            return hashCode2;
        }
    }

    /* renamed from: ek.d$c */
    /* loaded from: classes3.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, InterfaceC10201a {

        /* renamed from: a */
        private final C7201d<K, V> f16163a;

        /* renamed from: b */
        private final int f16164b;

        public c(C7201d<K, V> map, int i10) {
            C9322n.m27781e(map, "map");
            this.f16163a = map;
            this.f16164b = i10;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C9322n.m27777a(entry.getKey(), getKey()) && C9322n.m27777a(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((C7201d) this.f16163a).f16151a[this.f16164b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((C7201d) this.f16163a).f16152b;
            C9322n.m27778b(objArr);
            return (V) objArr[this.f16164b];
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
            this.f16163a.m21515l();
            Object[] m21498j = this.f16163a.m21498j();
            int i10 = this.f16164b;
            V v11 = (V) m21498j[i10];
            m21498j[i10] = v10;
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

    /* renamed from: ek.d$d */
    /* loaded from: classes3.dex */
    public static class d<K, V> {

        /* renamed from: a */
        private final C7201d<K, V> f16165a;

        /* renamed from: b */
        private int f16166b;

        /* renamed from: c */
        private int f16167c;

        public d(C7201d<K, V> map) {
            C9322n.m27781e(map, "map");
            this.f16165a = map;
            this.f16167c = -1;
            m21534e();
        }

        /* renamed from: a */
        public final int m21531a() {
            return this.f16166b;
        }

        /* renamed from: c */
        public final int m21532c() {
            return this.f16167c;
        }

        /* renamed from: d */
        public final C7201d<K, V> m21533d() {
            return this.f16165a;
        }

        /* renamed from: e */
        public final void m21534e() {
            while (this.f16166b < ((C7201d) this.f16165a).f16156f) {
                int[] iArr = ((C7201d) this.f16165a).f16153c;
                int i10 = this.f16166b;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f16166b = i10 + 1;
                }
            }
        }

        /* renamed from: f */
        public final void m21535f(int i10) {
            this.f16166b = i10;
        }

        /* renamed from: g */
        public final void m21536g(int i10) {
            this.f16167c = i10;
        }

        public final boolean hasNext() {
            return this.f16166b < ((C7201d) this.f16165a).f16156f;
        }

        public final void remove() {
            if (!(this.f16167c != -1)) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f16165a.m21515l();
            this.f16165a.m21489L(this.f16167c);
            this.f16167c = -1;
        }
    }

    /* renamed from: ek.d$e */
    /* loaded from: classes3.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, InterfaceC10201a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C7201d<K, V> map) {
            super(map);
            C9322n.m27781e(map, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (m21531a() >= ((C7201d) m21533d()).f16156f) {
                throw new NoSuchElementException();
            }
            int m21531a = m21531a();
            m21535f(m21531a + 1);
            m21536g(m21531a);
            K k10 = (K) ((C7201d) m21533d()).f16151a[m21532c()];
            m21534e();
            return k10;
        }
    }

    /* renamed from: ek.d$f */
    /* loaded from: classes3.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, InterfaceC10201a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C7201d<K, V> map) {
            super(map);
            C9322n.m27781e(map, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (m21531a() >= ((C7201d) m21533d()).f16156f) {
                throw new NoSuchElementException();
            }
            int m21531a = m21531a();
            m21535f(m21531a + 1);
            m21536g(m21531a);
            Object[] objArr = ((C7201d) m21533d()).f16152b;
            C9322n.m27778b(objArr);
            V v10 = (V) objArr[m21532c()];
            m21534e();
            return v10;
        }
    }

    static {
        C7201d c7201d = new C7201d(0);
        c7201d.f16162w = true;
        f16150y = c7201d;
    }

    public C7201d() {
        this(8);
    }

    public C7201d(int i10) {
        this(C7200c.m21476d(i10), null, new int[i10], new int[f16149x.m21525c(i10)], 2, 0);
    }

    private C7201d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f16151a = kArr;
        this.f16152b = vArr;
        this.f16153c = iArr;
        this.f16154d = iArr2;
        this.f16155e = i10;
        this.f16156f = i11;
        this.f16157r = f16149x.m21526d(m21505x());
    }

    /* renamed from: B */
    private final int m21483B(K k10) {
        return ((k10 != null ? k10.hashCode() : 0) * (-1640531527)) >>> this.f16157r;
    }

    /* renamed from: E */
    private final boolean m21484E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        m21502r(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (m21485F(it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: F */
    private final boolean m21485F(Map.Entry<? extends K, ? extends V> entry) {
        int m21513i = m21513i(entry.getKey());
        V[] m21498j = m21498j();
        if (m21513i >= 0) {
            m21498j[m21513i] = entry.getValue();
            return true;
        }
        int i10 = (-m21513i) - 1;
        if (C9322n.m27777a(entry.getValue(), m21498j[i10])) {
            return false;
        }
        m21498j[i10] = entry.getValue();
        return true;
    }

    /* renamed from: G */
    private final boolean m21486G(int i10) {
        int m21483B = m21483B(this.f16151a[i10]);
        int i11 = this.f16155e;
        while (true) {
            int[] iArr = this.f16154d;
            if (iArr[m21483B] == 0) {
                iArr[m21483B] = i10 + 1;
                this.f16153c[i10] = m21483B;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            m21483B = m21483B == 0 ? m21505x() - 1 : m21483B - 1;
        }
    }

    /* renamed from: H */
    private final void m21487H(int i10) {
        if (this.f16156f > size()) {
            m21499m();
        }
        int i11 = 0;
        if (i10 != m21505x()) {
            this.f16154d = new int[i10];
            this.f16157r = f16149x.m21526d(i10);
        } else {
            C7019l.m20442j(this.f16154d, 0, 0, m21505x());
        }
        while (i11 < this.f16156f) {
            int i12 = i11 + 1;
            if (!m21486G(i11)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i11 = i12;
        }
    }

    /* renamed from: J */
    private final void m21488J(int i10) {
        int m36295d;
        m36295d = C11585l.m36295d(this.f16155e * 2, m21505x() / 2);
        int i11 = m36295d;
        int i12 = 0;
        int i13 = i10;
        do {
            i10 = i10 == 0 ? m21505x() - 1 : i10 - 1;
            i12++;
            if (i12 > this.f16155e) {
                this.f16154d[i13] = 0;
                return;
            }
            int[] iArr = this.f16154d;
            int i14 = iArr[i10];
            if (i14 == 0) {
                iArr[i13] = 0;
                return;
            }
            if (i14 < 0) {
                iArr[i13] = -1;
            } else {
                int i15 = i14 - 1;
                if (((m21483B(this.f16151a[i15]) - i10) & (m21505x() - 1)) >= i12) {
                    this.f16154d[i13] = i14;
                    this.f16153c[i15] = i13;
                }
                i11--;
            }
            i13 = i10;
            i12 = 0;
            i11--;
        } while (i11 >= 0);
        this.f16154d[i13] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public final void m21489L(int i10) {
        C7200c.m21478f(this.f16151a, i10);
        m21488J(this.f16153c[i10]);
        this.f16153c[i10] = -1;
        this.f16158s = size() - 1;
    }

    /* renamed from: N */
    private final boolean m21490N(int i10) {
        int m21519v = m21519v();
        int i11 = this.f16156f;
        int i12 = m21519v - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= m21519v() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final V[] m21498j() {
        V[] vArr = this.f16152b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C7200c.m21476d(m21519v());
        this.f16152b = vArr2;
        return vArr2;
    }

    /* renamed from: m */
    private final void m21499m() {
        int i10;
        V[] vArr = this.f16152b;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f16156f;
            if (i11 >= i10) {
                break;
            }
            if (this.f16153c[i11] >= 0) {
                K[] kArr = this.f16151a;
                kArr[i12] = kArr[i11];
                if (vArr != null) {
                    vArr[i12] = vArr[i11];
                }
                i12++;
            }
            i11++;
        }
        C7200c.m21479g(this.f16151a, i12, i10);
        if (vArr != null) {
            C7200c.m21479g(vArr, i12, this.f16156f);
        }
        this.f16156f = i12;
    }

    /* renamed from: p */
    private final boolean m21500p(Map<?, ?> map) {
        return size() == map.size() && m21516n(map.entrySet());
    }

    /* renamed from: q */
    private final void m21501q(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > m21519v()) {
            int m21519v = (m21519v() * 3) / 2;
            if (i10 <= m21519v) {
                i10 = m21519v;
            }
            this.f16151a = (K[]) C7200c.m21477e(this.f16151a, i10);
            V[] vArr = this.f16152b;
            this.f16152b = vArr != null ? (V[]) C7200c.m21477e(vArr, i10) : null;
            int[] copyOf = Arrays.copyOf(this.f16153c, i10);
            C9322n.m27780d(copyOf, "copyOf(this, newSize)");
            this.f16153c = copyOf;
            int m21525c = f16149x.m21525c(i10);
            if (m21525c > m21505x()) {
                m21487H(m21525c);
            }
        }
    }

    /* renamed from: r */
    private final void m21502r(int i10) {
        if (m21490N(i10)) {
            m21487H(m21505x());
        } else {
            m21501q(this.f16156f + i10);
        }
    }

    /* renamed from: t */
    private final int m21503t(K k10) {
        int m21483B = m21483B(k10);
        int i10 = this.f16155e;
        while (true) {
            int i11 = this.f16154d[m21483B];
            if (i11 == 0) {
                return -1;
            }
            if (i11 > 0) {
                int i12 = i11 - 1;
                if (C9322n.m27777a(this.f16151a[i12], k10)) {
                    return i12;
                }
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            m21483B = m21483B == 0 ? m21505x() - 1 : m21483B - 1;
        }
    }

    /* renamed from: u */
    private final int m21504u(V v10) {
        int i10 = this.f16156f;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f16153c[i10] >= 0) {
                V[] vArr = this.f16152b;
                C9322n.m27778b(vArr);
                if (C9322n.m27777a(vArr[i10], v10)) {
                    return i10;
                }
            }
        }
    }

    private final Object writeReplace() {
        if (this.f16162w) {
            return new C7206i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: x */
    private final int m21505x() {
        return this.f16154d.length;
    }

    /* renamed from: A */
    public Collection<V> m21506A() {
        C7204g<V> c7204g = this.f16160u;
        if (c7204g != null) {
            return c7204g;
        }
        C7204g<V> c7204g2 = new C7204g<>(this);
        this.f16160u = c7204g2;
        return c7204g2;
    }

    /* renamed from: C */
    public final boolean m21507C() {
        return this.f16162w;
    }

    /* renamed from: D */
    public final e<K, V> m21508D() {
        return new e<>(this);
    }

    /* renamed from: I */
    public final boolean m21509I(Map.Entry<? extends K, ? extends V> entry) {
        C9322n.m27781e(entry, "entry");
        m21515l();
        int m21503t = m21503t(entry.getKey());
        if (m21503t < 0) {
            return false;
        }
        V[] vArr = this.f16152b;
        C9322n.m27778b(vArr);
        if (!C9322n.m27777a(vArr[m21503t], entry.getValue())) {
            return false;
        }
        m21489L(m21503t);
        return true;
    }

    /* renamed from: K */
    public final int m21510K(K k10) {
        m21515l();
        int m21503t = m21503t(k10);
        if (m21503t < 0) {
            return -1;
        }
        m21489L(m21503t);
        return m21503t;
    }

    /* renamed from: M */
    public final boolean m21511M(V v10) {
        m21515l();
        int m21504u = m21504u(v10);
        if (m21504u < 0) {
            return false;
        }
        m21489L(m21504u);
        return true;
    }

    /* renamed from: O */
    public final f<K, V> m21512O() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        m21515l();
        AbstractC7006e0 it = new C11579f(0, this.f16156f - 1).iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            int[] iArr = this.f16153c;
            int i10 = iArr[nextInt];
            if (i10 >= 0) {
                this.f16154d[i10] = 0;
                iArr[nextInt] = -1;
            }
        }
        C7200c.m21479g(this.f16151a, 0, this.f16156f);
        V[] vArr = this.f16152b;
        if (vArr != null) {
            C7200c.m21479g(vArr, 0, this.f16156f);
        }
        this.f16158s = 0;
        this.f16156f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m21503t(obj) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m21504u(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m21520w();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && m21500p((Map) obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int m21503t = m21503t(obj);
        if (m21503t < 0) {
            return null;
        }
        V[] vArr = this.f16152b;
        C9322n.m27778b(vArr);
        return vArr[m21503t];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> m21518s = m21518s();
        int i10 = 0;
        while (m21518s.hasNext()) {
            i10 += m21518s.m21530k();
        }
        return i10;
    }

    /* renamed from: i */
    public final int m21513i(K k10) {
        int m36295d;
        m21515l();
        while (true) {
            int m21483B = m21483B(k10);
            m36295d = C11585l.m36295d(this.f16155e * 2, m21505x() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f16154d[m21483B];
                if (i11 <= 0) {
                    if (this.f16156f < m21519v()) {
                        int i12 = this.f16156f;
                        int i13 = i12 + 1;
                        this.f16156f = i13;
                        this.f16151a[i12] = k10;
                        this.f16153c[i12] = m21483B;
                        this.f16154d[m21483B] = i13;
                        this.f16158s = size() + 1;
                        if (i10 > this.f16155e) {
                            this.f16155e = i10;
                        }
                        return i12;
                    }
                    m21502r(1);
                } else {
                    if (C9322n.m27777a(this.f16151a[i11 - 1], k10)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > m36295d) {
                        m21487H(m21505x() * 2);
                        break;
                    }
                    m21483B = m21483B == 0 ? m21505x() - 1 : m21483B - 1;
                }
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public final Map<K, V> m21514k() {
        m21515l();
        this.f16162w = true;
        if (size() > 0) {
            return this;
        }
        C7201d c7201d = f16150y;
        C9322n.m27779c(c7201d, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c7201d;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m21521y();
    }

    /* renamed from: l */
    public final void m21515l() {
        if (this.f16162w) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: n */
    public final boolean m21516n(Collection<?> m10) {
        C9322n.m27781e(m10, "m");
        for (Object obj : m10) {
            if (obj != null) {
                try {
                    if (!m21517o((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m21517o(Map.Entry<? extends K, ? extends V> entry) {
        C9322n.m27781e(entry, "entry");
        int m21503t = m21503t(entry.getKey());
        if (m21503t < 0) {
            return false;
        }
        V[] vArr = this.f16152b;
        C9322n.m27778b(vArr);
        return C9322n.m27777a(vArr[m21503t], entry.getValue());
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        m21515l();
        int m21513i = m21513i(k10);
        V[] m21498j = m21498j();
        if (m21513i >= 0) {
            m21498j[m21513i] = v10;
            return null;
        }
        int i10 = (-m21513i) - 1;
        V v11 = m21498j[i10];
        m21498j[i10] = v10;
        return v11;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        C9322n.m27781e(from, "from");
        m21515l();
        m21484E(from.entrySet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int m21510K = m21510K(obj);
        if (m21510K < 0) {
            return null;
        }
        V[] vArr = this.f16152b;
        C9322n.m27778b(vArr);
        V v10 = vArr[m21510K];
        C7200c.m21478f(vArr, m21510K);
        return v10;
    }

    /* renamed from: s */
    public final b<K, V> m21518s() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m21522z();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b<K, V> m21518s = m21518s();
        int i10 = 0;
        while (m21518s.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            m21518s.m21529j(sb2);
            i10++;
        }
        sb2.append("}");
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "sb.toString()");
        return sb3;
    }

    /* renamed from: v */
    public final int m21519v() {
        return this.f16151a.length;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m21506A();
    }

    /* renamed from: w */
    public Set<Map.Entry<K, V>> m21520w() {
        C7202e<K, V> c7202e = this.f16161v;
        if (c7202e != null) {
            return c7202e;
        }
        C7202e<K, V> c7202e2 = new C7202e<>(this);
        this.f16161v = c7202e2;
        return c7202e2;
    }

    /* renamed from: y */
    public Set<K> m21521y() {
        C7203f<K> c7203f = this.f16159t;
        if (c7203f != null) {
            return c7203f;
        }
        C7203f<K> c7203f2 = new C7203f<>(this);
        this.f16159t = c7203f2;
        return c7203f2;
    }

    /* renamed from: z */
    public int m21522z() {
        return this.f16158s;
    }
}
