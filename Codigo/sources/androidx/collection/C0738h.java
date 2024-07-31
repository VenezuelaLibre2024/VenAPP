package androidx.collection;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: androidx.collection.h */
/* loaded from: classes.dex */
public class C0738h<K, V> {

    /* renamed from: d */
    static Object[] f3215d;

    /* renamed from: e */
    static int f3216e;

    /* renamed from: f */
    static Object[] f3217f;

    /* renamed from: r */
    static int f3218r;

    /* renamed from: a */
    int[] f3219a;

    /* renamed from: b */
    Object[] f3220b;

    /* renamed from: c */
    int f3221c;

    public C0738h() {
        this.f3219a = C0734d.f3192a;
        this.f3220b = C0734d.f3194c;
        this.f3221c = 0;
    }

    public C0738h(int i10) {
        if (i10 == 0) {
            this.f3219a = C0734d.f3192a;
            this.f3220b = C0734d.f3194c;
        } else {
            m3703a(i10);
        }
        this.f3221c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0738h(C0738h<K, V> c0738h) {
        this();
        if (c0738h != 0) {
            mo3712k(c0738h);
        }
    }

    /* renamed from: a */
    private void m3703a(int i10) {
        if (i10 == 8) {
            synchronized (C0738h.class) {
                Object[] objArr = f3217f;
                if (objArr != null) {
                    this.f3220b = objArr;
                    f3217f = (Object[]) objArr[0];
                    this.f3219a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3218r--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C0738h.class) {
                Object[] objArr2 = f3215d;
                if (objArr2 != null) {
                    this.f3220b = objArr2;
                    f3215d = (Object[]) objArr2[0];
                    this.f3219a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3216e--;
                    return;
                }
            }
        }
        this.f3219a = new int[i10];
        this.f3220b = new Object[i10 << 1];
    }

    /* renamed from: b */
    private static int m3704b(int[] iArr, int i10, int i11) {
        try {
            return C0734d.m3674a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m3705d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C0738h.class) {
                if (f3218r < 10) {
                    objArr[0] = f3217f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f3217f = objArr;
                    f3218r++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0738h.class) {
                if (f3216e < 10) {
                    objArr[0] = f3215d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f3215d = objArr;
                    f3216e++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m3706c(int i10) {
        int i11 = this.f3221c;
        int[] iArr = this.f3219a;
        if (iArr.length < i10) {
            Object[] objArr = this.f3220b;
            m3703a(i10);
            if (this.f3221c > 0) {
                System.arraycopy(iArr, 0, this.f3219a, 0, i11);
                System.arraycopy(objArr, 0, this.f3220b, 0, i11 << 1);
            }
            m3705d(iArr, objArr, i11);
        }
        if (this.f3221c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f3221c;
        if (i10 > 0) {
            int[] iArr = this.f3219a;
            Object[] objArr = this.f3220b;
            this.f3219a = C0734d.f3192a;
            this.f3220b = C0734d.f3194c;
            this.f3221c = 0;
            m3705d(iArr, objArr, i10);
        }
        if (this.f3221c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m3708f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m3710i(obj) >= 0;
    }

    /* renamed from: e */
    int m3707e(Object obj, int i10) {
        int i11 = this.f3221c;
        if (i11 == 0) {
            return -1;
        }
        int m3704b = m3704b(this.f3219a, i11, i10);
        if (m3704b < 0 || obj.equals(this.f3220b[m3704b << 1])) {
            return m3704b;
        }
        int i12 = m3704b + 1;
        while (i12 < i11 && this.f3219a[i12] == i10) {
            if (obj.equals(this.f3220b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m3704b - 1; i13 >= 0 && this.f3219a[i13] == i10; i13--) {
            if (obj.equals(this.f3220b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0738h) {
            C0738h c0738h = (C0738h) obj;
            if (size() != c0738h.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f3221c; i10++) {
                try {
                    K m3711j = m3711j(i10);
                    V m3715n = m3715n(i10);
                    Object obj2 = c0738h.get(m3711j);
                    if (m3715n == null) {
                        if (obj2 != null || !c0738h.containsKey(m3711j)) {
                            return false;
                        }
                    } else if (!m3715n.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f3221c; i11++) {
                try {
                    K m3711j2 = m3711j(i11);
                    V m3715n2 = m3715n(i11);
                    Object obj3 = map.get(m3711j2);
                    if (m3715n2 == null) {
                        if (obj3 != null || !map.containsKey(m3711j2)) {
                            return false;
                        }
                    } else if (!m3715n2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m3708f(Object obj) {
        return obj == null ? m3709g() : m3707e(obj, obj.hashCode());
    }

    /* renamed from: g */
    int m3709g() {
        int i10 = this.f3221c;
        if (i10 == 0) {
            return -1;
        }
        int m3704b = m3704b(this.f3219a, i10, 0);
        if (m3704b < 0 || this.f3220b[m3704b << 1] == null) {
            return m3704b;
        }
        int i11 = m3704b + 1;
        while (i11 < i10 && this.f3219a[i11] == 0) {
            if (this.f3220b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m3704b - 1; i12 >= 0 && this.f3219a[i12] == 0; i12--) {
            if (this.f3220b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int m3708f = m3708f(obj);
        return m3708f >= 0 ? (V) this.f3220b[(m3708f << 1) + 1] : v10;
    }

    public int hashCode() {
        int[] iArr = this.f3219a;
        Object[] objArr = this.f3220b;
        int i10 = this.f3221c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m3710i(Object obj) {
        int i10 = this.f3221c * 2;
        Object[] objArr = this.f3220b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f3221c <= 0;
    }

    /* renamed from: j */
    public K m3711j(int i10) {
        return (K) this.f3220b[i10 << 1];
    }

    /* renamed from: k */
    public void mo3712k(C0738h<? extends K, ? extends V> c0738h) {
        int i10 = c0738h.f3221c;
        m3706c(this.f3221c + i10);
        if (this.f3221c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(c0738h.m3711j(i11), c0738h.m3715n(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(c0738h.f3219a, 0, this.f3219a, 0, i10);
            System.arraycopy(c0738h.f3220b, 0, this.f3220b, 0, i10 << 1);
            this.f3221c = i10;
        }
    }

    /* renamed from: l */
    public V mo3713l(int i10) {
        Object[] objArr = this.f3220b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f3221c;
        int i13 = 0;
        if (i12 <= 1) {
            m3705d(this.f3219a, objArr, i12);
            this.f3219a = C0734d.f3192a;
            this.f3220b = C0734d.f3194c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f3219a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f3220b;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f3220b;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                m3703a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f3221c) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f3219a, 0, i10);
                    System.arraycopy(objArr, 0, this.f3220b, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f3219a, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f3220b, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f3221c) {
            throw new ConcurrentModificationException();
        }
        this.f3221c = i13;
        return v10;
    }

    /* renamed from: m */
    public V mo3714m(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f3220b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    /* renamed from: n */
    public V m3715n(int i10) {
        return (V) this.f3220b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int m3707e;
        int i11 = this.f3221c;
        if (k10 == null) {
            m3707e = m3709g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            m3707e = m3707e(k10, hashCode);
        }
        if (m3707e >= 0) {
            int i12 = (m3707e << 1) + 1;
            Object[] objArr = this.f3220b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~m3707e;
        int[] iArr = this.f3219a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f3220b;
            m3703a(i14);
            if (i11 != this.f3221c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3219a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f3220b, 0, objArr2.length);
            }
            m3705d(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f3219a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f3220b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f3221c - i13) << 1);
        }
        int i16 = this.f3221c;
        if (i11 == i16) {
            int[] iArr4 = this.f3219a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f3220b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f3221c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int m3708f = m3708f(obj);
        if (m3708f >= 0) {
            return mo3713l(m3708f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m3708f = m3708f(obj);
        if (m3708f < 0) {
            return false;
        }
        V m3715n = m3715n(m3708f);
        if (obj2 != m3715n && (obj2 == null || !obj2.equals(m3715n))) {
            return false;
        }
        mo3713l(m3708f);
        return true;
    }

    public V replace(K k10, V v10) {
        int m3708f = m3708f(k10);
        if (m3708f >= 0) {
            return mo3714m(m3708f, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int m3708f = m3708f(k10);
        if (m3708f < 0) {
            return false;
        }
        V m3715n = m3715n(m3708f);
        if (m3715n != v10 && (v10 == null || !v10.equals(m3715n))) {
            return false;
        }
        mo3714m(m3708f, v11);
        return true;
    }

    public int size() {
        return this.f3221c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3221c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f3221c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K m3711j = m3711j(i10);
            if (m3711j != this) {
                sb2.append(m3711j);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m3715n = m3715n(i10);
            if (m3715n != this) {
                sb2.append(m3715n);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
