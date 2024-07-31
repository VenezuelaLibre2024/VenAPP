package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.collection.b */
/* loaded from: classes.dex */
public final class C0732b<E> implements Collection<E>, Set<E> {

    /* renamed from: e */
    private static final int[] f3177e = new int[0];

    /* renamed from: f */
    private static final Object[] f3178f = new Object[0];

    /* renamed from: r */
    private static Object[] f3179r;

    /* renamed from: s */
    private static int f3180s;

    /* renamed from: t */
    private static Object[] f3181t;

    /* renamed from: u */
    private static int f3182u;

    /* renamed from: a */
    private int[] f3183a;

    /* renamed from: b */
    Object[] f3184b;

    /* renamed from: c */
    int f3185c;

    /* renamed from: d */
    private AbstractC0737g<E, E> f3186d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.collection.b$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC0737g<E, E> {
        a() {
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: a */
        protected void mo3652a() {
            C0732b.this.clear();
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: b */
        protected Object mo3653b(int i10, int i11) {
            return C0732b.this.f3184b[i10];
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: c */
        protected Map<E, E> mo3654c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: d */
        protected int mo3655d() {
            return C0732b.this.f3185c;
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: e */
        protected int mo3656e(Object obj) {
            return C0732b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: f */
        protected int mo3657f(Object obj) {
            return C0732b.this.indexOf(obj);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: g */
        protected void mo3658g(E e10, E e11) {
            C0732b.this.add(e10);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: h */
        protected void mo3659h(int i10) {
            C0732b.this.m3667m(i10);
        }

        @Override // androidx.collection.AbstractC0737g
        /* renamed from: i */
        protected E mo3660i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C0732b() {
        this(0);
    }

    public C0732b(int i10) {
        if (i10 == 0) {
            this.f3183a = f3177e;
            this.f3184b = f3178f;
        } else {
            m3661c(i10);
        }
        this.f3185c = 0;
    }

    /* renamed from: c */
    private void m3661c(int i10) {
        if (i10 == 8) {
            synchronized (C0732b.class) {
                Object[] objArr = f3181t;
                if (objArr != null) {
                    this.f3184b = objArr;
                    f3181t = (Object[]) objArr[0];
                    this.f3183a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3182u--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C0732b.class) {
                Object[] objArr2 = f3179r;
                if (objArr2 != null) {
                    this.f3184b = objArr2;
                    f3179r = (Object[]) objArr2[0];
                    this.f3183a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3180s--;
                    return;
                }
            }
        }
        this.f3183a = new int[i10];
        this.f3184b = new Object[i10];
    }

    /* renamed from: f */
    private static void m3662f(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C0732b.class) {
                if (f3182u < 10) {
                    objArr[0] = f3181t;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f3181t = objArr;
                    f3182u++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0732b.class) {
                if (f3180s < 10) {
                    objArr[0] = f3179r;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f3179r = objArr;
                    f3180s++;
                }
            }
        }
    }

    /* renamed from: h */
    private AbstractC0737g<E, E> m3663h() {
        if (this.f3186d == null) {
            this.f3186d = new a();
        }
        return this.f3186d;
    }

    /* renamed from: k */
    private int m3664k(Object obj, int i10) {
        int i11 = this.f3185c;
        if (i11 == 0) {
            return -1;
        }
        int m3674a = C0734d.m3674a(this.f3183a, i11, i10);
        if (m3674a < 0 || obj.equals(this.f3184b[m3674a])) {
            return m3674a;
        }
        int i12 = m3674a + 1;
        while (i12 < i11 && this.f3183a[i12] == i10) {
            if (obj.equals(this.f3184b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m3674a - 1; i13 >= 0 && this.f3183a[i13] == i10; i13--) {
            if (obj.equals(this.f3184b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    /* renamed from: l */
    private int m3665l() {
        int i10 = this.f3185c;
        if (i10 == 0) {
            return -1;
        }
        int m3674a = C0734d.m3674a(this.f3183a, i10, 0);
        if (m3674a < 0 || this.f3184b[m3674a] == null) {
            return m3674a;
        }
        int i11 = m3674a + 1;
        while (i11 < i10 && this.f3183a[i11] == 0) {
            if (this.f3184b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m3674a - 1; i12 >= 0 && this.f3183a[i12] == 0; i12--) {
            if (this.f3184b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int m3664k;
        if (e10 == null) {
            m3664k = m3665l();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            m3664k = m3664k(e10, hashCode);
        }
        if (m3664k >= 0) {
            return false;
        }
        int i11 = ~m3664k;
        int i12 = this.f3185c;
        int[] iArr = this.f3183a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f3184b;
            m3661c(i13);
            int[] iArr2 = this.f3183a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3184b, 0, objArr.length);
            }
            m3662f(iArr, objArr, this.f3185c);
        }
        int i14 = this.f3185c;
        if (i11 < i14) {
            int[] iArr3 = this.f3183a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f3184b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f3185c - i11);
        }
        this.f3183a[i11] = i10;
        this.f3184b[i11] = e10;
        this.f3185c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m3666d(this.f3185c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f3185c;
        if (i10 != 0) {
            m3662f(this.f3183a, this.f3184b, i10);
            this.f3183a = f3177e;
            this.f3184b = f3178f;
            this.f3185c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void m3666d(int i10) {
        int[] iArr = this.f3183a;
        if (iArr.length < i10) {
            Object[] objArr = this.f3184b;
            m3661c(i10);
            int i11 = this.f3185c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f3183a, 0, i11);
                System.arraycopy(objArr, 0, this.f3184b, 0, this.f3185c);
            }
            m3662f(iArr, objArr, this.f3185c);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f3185c; i10++) {
                try {
                    if (!set.contains(m3668n(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f3183a;
        int i10 = this.f3185c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? m3665l() : m3664k(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f3185c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m3663h().m3697m().iterator();
    }

    /* renamed from: m */
    public E m3667m(int i10) {
        Object[] objArr = this.f3184b;
        E e10 = (E) objArr[i10];
        int i11 = this.f3185c;
        if (i11 <= 1) {
            m3662f(this.f3183a, objArr, i11);
            this.f3183a = f3177e;
            this.f3184b = f3178f;
            this.f3185c = 0;
        } else {
            int[] iArr = this.f3183a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f3185c = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f3184b;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f3185c - i10);
                }
                this.f3184b[this.f3185c] = null;
            } else {
                m3661c(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f3185c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f3183a, 0, i10);
                    System.arraycopy(objArr, 0, this.f3184b, 0, i10);
                }
                int i14 = this.f3185c;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f3183a, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f3184b, i10, this.f3185c - i10);
                }
            }
        }
        return e10;
    }

    /* renamed from: n */
    public E m3668n(int i10) {
        return (E) this.f3184b[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m3667m(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f3185c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f3184b[i10])) {
                m3667m(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f3185c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f3185c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f3184b, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3185c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3185c));
        }
        System.arraycopy(this.f3184b, 0, tArr, 0, this.f3185c);
        int length = tArr.length;
        int i10 = this.f3185c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f3185c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f3185c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E m3668n = m3668n(i10);
            if (m3668n != this) {
                sb2.append(m3668n);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
