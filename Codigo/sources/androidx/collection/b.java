package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f2832e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f2833f = new Object[0];

    /* renamed from: r, reason: collision with root package name */
    private static Object[] f2834r;

    /* renamed from: s, reason: collision with root package name */
    private static int f2835s;

    /* renamed from: t, reason: collision with root package name */
    private static Object[] f2836t;

    /* renamed from: u, reason: collision with root package name */
    private static int f2837u;

    /* renamed from: a, reason: collision with root package name */
    private int[] f2838a;

    /* renamed from: b, reason: collision with root package name */
    Object[] f2839b;

    /* renamed from: c, reason: collision with root package name */
    int f2840c;

    /* renamed from: d, reason: collision with root package name */
    private g<E, E> f2841d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g<E, E> {
        a() {
        }

        @Override // androidx.collection.g
        protected void a() {
            b.this.clear();
        }

        @Override // androidx.collection.g
        protected Object b(int i10, int i11) {
            return b.this.f2839b[i10];
        }

        @Override // androidx.collection.g
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // androidx.collection.g
        protected int d() {
            return b.this.f2840c;
        }

        @Override // androidx.collection.g
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.g
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // androidx.collection.g
        protected void g(E e10, E e11) {
            b.this.add(e10);
        }

        @Override // androidx.collection.g
        protected void h(int i10) {
            b.this.m(i10);
        }

        @Override // androidx.collection.g
        protected E i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int i10) {
        if (i10 == 0) {
            this.f2838a = f2832e;
            this.f2839b = f2833f;
        } else {
            c(i10);
        }
        this.f2840c = 0;
    }

    private void c(int i10) {
        if (i10 == 8) {
            synchronized (b.class) {
                Object[] objArr = f2836t;
                if (objArr != null) {
                    this.f2839b = objArr;
                    f2836t = (Object[]) objArr[0];
                    this.f2838a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2837u--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f2834r;
                if (objArr2 != null) {
                    this.f2839b = objArr2;
                    f2834r = (Object[]) objArr2[0];
                    this.f2838a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2835s--;
                    return;
                }
            }
        }
        this.f2838a = new int[i10];
        this.f2839b = new Object[i10];
    }

    private static void f(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f2837u < 10) {
                    objArr[0] = f2836t;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f2836t = objArr;
                    f2837u++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f2835s < 10) {
                    objArr[0] = f2834r;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f2834r = objArr;
                    f2835s++;
                }
            }
        }
    }

    private g<E, E> h() {
        if (this.f2841d == null) {
            this.f2841d = new a();
        }
        return this.f2841d;
    }

    private int k(Object obj, int i10) {
        int i11 = this.f2840c;
        if (i11 == 0) {
            return -1;
        }
        int a10 = d.a(this.f2838a, i11, i10);
        if (a10 < 0 || obj.equals(this.f2839b[a10])) {
            return a10;
        }
        int i12 = a10 + 1;
        while (i12 < i11 && this.f2838a[i12] == i10) {
            if (obj.equals(this.f2839b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a10 - 1; i13 >= 0 && this.f2838a[i13] == i10; i13--) {
            if (obj.equals(this.f2839b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    private int l() {
        int i10 = this.f2840c;
        if (i10 == 0) {
            return -1;
        }
        int a10 = d.a(this.f2838a, i10, 0);
        if (a10 < 0 || this.f2839b[a10] == null) {
            return a10;
        }
        int i11 = a10 + 1;
        while (i11 < i10 && this.f2838a[i11] == 0) {
            if (this.f2839b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a10 - 1; i12 >= 0 && this.f2838a[i12] == 0; i12--) {
            if (this.f2839b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int k10;
        if (e10 == null) {
            k10 = l();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            k10 = k(e10, hashCode);
        }
        if (k10 >= 0) {
            return false;
        }
        int i11 = ~k10;
        int i12 = this.f2840c;
        int[] iArr = this.f2838a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f2839b;
            c(i13);
            int[] iArr2 = this.f2838a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2839b, 0, objArr.length);
            }
            f(iArr, objArr, this.f2840c);
        }
        int i14 = this.f2840c;
        if (i11 < i14) {
            int[] iArr3 = this.f2838a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f2839b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f2840c - i11);
        }
        this.f2838a[i11] = i10;
        this.f2839b[i11] = e10;
        this.f2840c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        d(this.f2840c + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f2840c;
        if (i10 != 0) {
            f(this.f2838a, this.f2839b, i10);
            this.f2838a = f2832e;
            this.f2839b = f2833f;
            this.f2840c = 0;
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

    public void d(int i10) {
        int[] iArr = this.f2838a;
        if (iArr.length < i10) {
            Object[] objArr = this.f2839b;
            c(i10);
            int i11 = this.f2840c;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f2838a, 0, i11);
                System.arraycopy(objArr, 0, this.f2839b, 0, this.f2840c);
            }
            f(iArr, objArr, this.f2840c);
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
            for (int i10 = 0; i10 < this.f2840c; i10++) {
                try {
                    if (!set.contains(n(i10))) {
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
        int[] iArr = this.f2838a;
        int i10 = this.f2840c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? l() : k(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f2840c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return h().m().iterator();
    }

    public E m(int i10) {
        Object[] objArr = this.f2839b;
        E e10 = (E) objArr[i10];
        int i11 = this.f2840c;
        if (i11 <= 1) {
            f(this.f2838a, objArr, i11);
            this.f2838a = f2832e;
            this.f2839b = f2833f;
            this.f2840c = 0;
        } else {
            int[] iArr = this.f2838a;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f2840c = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f2839b;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f2840c - i10);
                }
                this.f2839b[this.f2840c] = null;
            } else {
                c(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f2840c--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f2838a, 0, i10);
                    System.arraycopy(objArr, 0, this.f2839b, 0, i10);
                }
                int i14 = this.f2840c;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f2838a, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f2839b, i10, this.f2840c - i10);
                }
            }
        }
        return e10;
    }

    public E n(int i10) {
        return (E) this.f2839b[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m(indexOf);
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
        for (int i10 = this.f2840c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f2839b[i10])) {
                m(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f2840c;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f2840c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f2839b, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2840c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2840c));
        }
        System.arraycopy(this.f2839b, 0, tArr, 0, this.f2840c);
        int length = tArr.length;
        int i10 = this.f2840c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2840c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f2840c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E n10 = n(i10);
            if (n10 != this) {
                sb2.append(n10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
