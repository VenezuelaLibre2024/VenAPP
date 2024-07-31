package dk;

import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class h<E> extends e<E> {

    /* renamed from: d */
    public static final a f14222d = new a(null);

    /* renamed from: e */
    private static final Object[] f14223e = new Object[0];

    /* renamed from: a */
    private int f14224a;

    /* renamed from: b */
    private Object[] f14225b = f14223e;

    /* renamed from: c */
    private int f14226c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }
    }

    private final void f(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f14225b.length;
        while (i10 < length && it.hasNext()) {
            this.f14225b[i10] = it.next();
            i10++;
        }
        int i11 = this.f14224a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f14225b[i12] = it.next();
        }
        this.f14226c = size() + collection.size();
    }

    private final void k(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f14225b;
        l.e(objArr2, objArr, 0, this.f14224a, objArr2.length);
        Object[] objArr3 = this.f14225b;
        int length = objArr3.length;
        int i11 = this.f14224a;
        l.e(objArr3, objArr, length - i11, 0, i11);
        this.f14224a = 0;
        this.f14225b = objArr;
    }

    private final int l(int i10) {
        int y10;
        if (i10 != 0) {
            return i10 - 1;
        }
        y10 = m.y(this.f14225b);
        return y10;
    }

    private final void m(int i10) {
        int b10;
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f14225b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr != f14223e) {
            k(f14222d.a(objArr.length, i10));
        } else {
            b10 = uk.l.b(i10, 10);
            this.f14225b = new Object[b10];
        }
    }

    private final int n(int i10) {
        int y10;
        y10 = m.y(this.f14225b);
        if (i10 == y10) {
            return 0;
        }
        return i10 + 1;
    }

    private final int o(int i10) {
        return i10 < 0 ? i10 + this.f14225b.length : i10;
    }

    private final int p(int i10) {
        Object[] objArr = this.f14225b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        c.f14211a.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        m(size() + 1);
        int p10 = p(this.f14224a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int l10 = l(p10);
            int l11 = l(this.f14224a);
            int i11 = this.f14224a;
            if (l10 >= i11) {
                Object[] objArr = this.f14225b;
                objArr[l11] = objArr[i11];
                l.e(objArr, objArr, i11, i11 + 1, l10 + 1);
            } else {
                Object[] objArr2 = this.f14225b;
                l.e(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f14225b;
                objArr3[objArr3.length - 1] = objArr3[0];
                l.e(objArr3, objArr3, 0, 1, l10 + 1);
            }
            this.f14225b[l10] = e10;
            this.f14224a = l11;
        } else {
            int p11 = p(this.f14224a + size());
            Object[] objArr4 = this.f14225b;
            if (p10 < p11) {
                l.e(objArr4, objArr4, p10 + 1, p10, p11);
            } else {
                l.e(objArr4, objArr4, 1, 0, p11);
                Object[] objArr5 = this.f14225b;
                objArr5[0] = objArr5[objArr5.length - 1];
                l.e(objArr5, objArr5, p10 + 1, p10, objArr5.length - 1);
            }
            this.f14225b[p10] = e10;
        }
        this.f14226c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        kotlin.jvm.internal.n.e(elements, "elements");
        c.f14211a.c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        m(size() + elements.size());
        int p10 = p(this.f14224a + size());
        int p11 = p(this.f14224a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f14224a;
            int i12 = i11 - size;
            if (p11 < i11) {
                Object[] objArr = this.f14225b;
                l.e(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.f14225b;
                if (size >= p11) {
                    l.e(objArr2, objArr2, objArr2.length - size, 0, p11);
                } else {
                    l.e(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f14225b;
                    l.e(objArr3, objArr3, 0, size, p11);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.f14225b;
                l.e(objArr4, objArr4, i12, i11, p11);
            } else {
                Object[] objArr5 = this.f14225b;
                i12 += objArr5.length;
                int i13 = p11 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    l.e(objArr5, objArr5, i12, i11, p11);
                } else {
                    l.e(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.f14225b;
                    l.e(objArr6, objArr6, 0, this.f14224a + length, p11);
                }
            }
            this.f14224a = i12;
            f(o(p11 - size), elements);
        } else {
            int i14 = p11 + size;
            if (p11 < p10) {
                int i15 = size + p10;
                Object[] objArr7 = this.f14225b;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = p10 - (i15 - objArr7.length);
                        l.e(objArr7, objArr7, 0, length2, p10);
                        Object[] objArr8 = this.f14225b;
                        l.e(objArr8, objArr8, i14, p11, length2);
                    }
                }
                l.e(objArr7, objArr7, i14, p11, p10);
            } else {
                Object[] objArr9 = this.f14225b;
                l.e(objArr9, objArr9, size, 0, p10);
                Object[] objArr10 = this.f14225b;
                if (i14 >= objArr10.length) {
                    l.e(objArr10, objArr10, i14 - objArr10.length, p11, objArr10.length);
                } else {
                    l.e(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f14225b;
                    l.e(objArr11, objArr11, i14, p11, objArr11.length - size);
                }
            }
            f(p11, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.n.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m(size() + elements.size());
        f(p(this.f14224a + size()), elements);
        return true;
    }

    public final void addFirst(E e10) {
        m(size() + 1);
        int l10 = l(this.f14224a);
        this.f14224a = l10;
        this.f14225b[l10] = e10;
        this.f14226c = size() + 1;
    }

    public final void addLast(E e10) {
        m(size() + 1);
        this.f14225b[p(this.f14224a + size())] = e10;
        this.f14226c = size() + 1;
    }

    @Override // dk.e
    public int c() {
        return this.f14226c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int p10 = p(this.f14224a + size());
        int i10 = this.f14224a;
        if (i10 < p10) {
            l.k(this.f14225b, null, i10, p10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14225b;
            l.k(objArr, null, this.f14224a, objArr.length);
            l.k(this.f14225b, null, 0, p10);
        }
        this.f14224a = 0;
        this.f14226c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // dk.e
    public E d(int i10) {
        int k10;
        int k11;
        c.f14211a.b(i10, size());
        k10 = r.k(this);
        if (i10 == k10) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int p10 = p(this.f14224a + i10);
        E e10 = (E) this.f14225b[p10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f14224a;
            if (p10 >= i11) {
                Object[] objArr = this.f14225b;
                l.e(objArr, objArr, i11 + 1, i11, p10);
            } else {
                Object[] objArr2 = this.f14225b;
                l.e(objArr2, objArr2, 1, 0, p10);
                Object[] objArr3 = this.f14225b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f14224a;
                l.e(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f14225b;
            int i13 = this.f14224a;
            objArr4[i13] = null;
            this.f14224a = n(i13);
        } else {
            int i14 = this.f14224a;
            k11 = r.k(this);
            int p11 = p(i14 + k11);
            Object[] objArr5 = this.f14225b;
            if (p10 <= p11) {
                l.e(objArr5, objArr5, p10, p10 + 1, p11 + 1);
            } else {
                l.e(objArr5, objArr5, p10, p10 + 1, objArr5.length);
                Object[] objArr6 = this.f14225b;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.e(objArr6, objArr6, 0, 1, p11 + 1);
            }
            this.f14225b[p11] = null;
        }
        this.f14226c = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        c.f14211a.b(i10, size());
        return (E) this.f14225b[p(this.f14224a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int p10 = p(this.f14224a + size());
        int i10 = this.f14224a;
        if (i10 < p10) {
            while (i10 < p10) {
                if (!kotlin.jvm.internal.n.a(obj, this.f14225b[i10])) {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < p10) {
            return -1;
        }
        int length = this.f14225b.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < p10; i11++) {
                    if (kotlin.jvm.internal.n.a(obj, this.f14225b[i11])) {
                        i10 = i11 + this.f14225b.length;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.n.a(obj, this.f14225b[i10])) {
                break;
            }
            i10++;
        }
        return i10 - this.f14224a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int y10;
        int p10 = p(this.f14224a + size());
        int i10 = this.f14224a;
        if (i10 < p10) {
            y10 = p10 - 1;
            if (i10 <= y10) {
                while (!kotlin.jvm.internal.n.a(obj, this.f14225b[y10])) {
                    if (y10 != i10) {
                        y10--;
                    }
                }
                return y10 - this.f14224a;
            }
            return -1;
        }
        if (i10 > p10) {
            int i11 = p10 - 1;
            while (true) {
                if (-1 >= i11) {
                    y10 = m.y(this.f14225b);
                    int i12 = this.f14224a;
                    if (i12 <= y10) {
                        while (!kotlin.jvm.internal.n.a(obj, this.f14225b[y10])) {
                            if (y10 != i12) {
                                y10--;
                            }
                        }
                    }
                } else {
                    if (kotlin.jvm.internal.n.a(obj, this.f14225b[i11])) {
                        y10 = i11 + this.f14225b.length;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    public final E q() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        int p10;
        kotlin.jvm.internal.n.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f14225b.length == 0) == false) {
                int p11 = p(this.f14224a + size());
                int i10 = this.f14224a;
                if (i10 < p11) {
                    p10 = i10;
                    while (i10 < p11) {
                        Object obj = this.f14225b[i10];
                        if (!elements.contains(obj)) {
                            this.f14225b[p10] = obj;
                            p10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    l.k(this.f14225b, null, p10, p11);
                } else {
                    int length = this.f14225b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f14225b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f14225b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    p10 = p(i11);
                    for (int i12 = 0; i12 < p11; i12++) {
                        Object[] objArr2 = this.f14225b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f14225b[p10] = obj3;
                            p10 = n(p10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f14226c = o(p10 - this.f14224a);
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f14225b;
        int i10 = this.f14224a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f14224a = n(i10);
        this.f14226c = size() - 1;
        return e10;
    }

    public final E removeLast() {
        int k10;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int i10 = this.f14224a;
        k10 = r.k(this);
        int p10 = p(i10 + k10);
        Object[] objArr = this.f14225b;
        E e10 = (E) objArr[p10];
        objArr[p10] = null;
        this.f14226c = size() - 1;
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int p10;
        kotlin.jvm.internal.n.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f14225b.length == 0) == false) {
                int p11 = p(this.f14224a + size());
                int i10 = this.f14224a;
                if (i10 < p11) {
                    p10 = i10;
                    while (i10 < p11) {
                        Object obj = this.f14225b[i10];
                        if (elements.contains(obj)) {
                            this.f14225b[p10] = obj;
                            p10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    l.k(this.f14225b, null, p10, p11);
                } else {
                    int length = this.f14225b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f14225b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f14225b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    p10 = p(i11);
                    for (int i12 = 0; i12 < p11; i12++) {
                        Object[] objArr2 = this.f14225b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f14225b[p10] = obj3;
                            p10 = n(p10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f14226c = o(p10 - this.f14224a);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c.f14211a.b(i10, size());
        int p10 = p(this.f14224a + i10);
        Object[] objArr = this.f14225b;
        E e11 = (E) objArr[p10];
        objArr[p10] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.n.e(array, "array");
        if (array.length < size()) {
            array = (T[]) j.a(array, size());
        }
        int p10 = p(this.f14224a + size());
        int i10 = this.f14224a;
        if (i10 < p10) {
            l.g(this.f14225b, array, 0, i10, p10, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14225b;
            l.e(objArr, array, 0, this.f14224a, objArr.length);
            Object[] objArr2 = this.f14225b;
            l.e(objArr2, array, objArr2.length - this.f14224a, 0, p10);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
