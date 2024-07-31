package dk;

import com.google.android.gms.common.api.C5101a;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import uk.C11585l;

/* renamed from: dk.h */
/* loaded from: classes3.dex */
public final class C7011h<E> extends AbstractC7005e<E> {

    /* renamed from: d */
    public static final a f15580d = new a(null);

    /* renamed from: e */
    private static final Object[] f15581e = new Object[0];

    /* renamed from: a */
    private int f15582a;

    /* renamed from: b */
    private Object[] f15583b = f15581e;

    /* renamed from: c */
    private int f15584c;

    /* renamed from: dk.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final int m20358a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return C5101a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }
    }

    /* renamed from: f */
    private final void m20350f(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f15583b.length;
        while (i10 < length && it.hasNext()) {
            this.f15583b[i10] = it.next();
            i10++;
        }
        int i11 = this.f15582a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f15583b[i12] = it.next();
        }
        this.f15584c = size() + collection.size();
    }

    /* renamed from: k */
    private final void m20351k(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f15583b;
        C7019l.m20437e(objArr2, objArr, 0, this.f15582a, objArr2.length);
        Object[] objArr3 = this.f15583b;
        int length = objArr3.length;
        int i11 = this.f15582a;
        C7019l.m20437e(objArr3, objArr, length - i11, 0, i11);
        this.f15582a = 0;
        this.f15583b = objArr;
    }

    /* renamed from: l */
    private final int m20352l(int i10) {
        int m20497y;
        if (i10 != 0) {
            return i10 - 1;
        }
        m20497y = C7021m.m20497y(this.f15583b);
        return m20497y;
    }

    /* renamed from: m */
    private final void m20353m(int i10) {
        int m36293b;
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f15583b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr != f15581e) {
            m20351k(f15580d.m20358a(objArr.length, i10));
        } else {
            m36293b = C11585l.m36293b(i10, 10);
            this.f15583b = new Object[m36293b];
        }
    }

    /* renamed from: n */
    private final int m20354n(int i10) {
        int m20497y;
        m20497y = C7021m.m20497y(this.f15583b);
        if (i10 == m20497y) {
            return 0;
        }
        return i10 + 1;
    }

    /* renamed from: o */
    private final int m20355o(int i10) {
        return i10 < 0 ? i10 + this.f15583b.length : i10;
    }

    /* renamed from: p */
    private final int m20356p(int i10) {
        Object[] objArr = this.f15583b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        AbstractC7001c.f15569a.m20329c(i10, size());
        if (i10 == size()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        m20353m(size() + 1);
        int m20356p = m20356p(this.f15582a + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int m20352l = m20352l(m20356p);
            int m20352l2 = m20352l(this.f15582a);
            int i11 = this.f15582a;
            if (m20352l >= i11) {
                Object[] objArr = this.f15583b;
                objArr[m20352l2] = objArr[i11];
                C7019l.m20437e(objArr, objArr, i11, i11 + 1, m20352l + 1);
            } else {
                Object[] objArr2 = this.f15583b;
                C7019l.m20437e(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f15583b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C7019l.m20437e(objArr3, objArr3, 0, 1, m20352l + 1);
            }
            this.f15583b[m20352l] = e10;
            this.f15582a = m20352l2;
        } else {
            int m20356p2 = m20356p(this.f15582a + size());
            Object[] objArr4 = this.f15583b;
            if (m20356p < m20356p2) {
                C7019l.m20437e(objArr4, objArr4, m20356p + 1, m20356p, m20356p2);
            } else {
                C7019l.m20437e(objArr4, objArr4, 1, 0, m20356p2);
                Object[] objArr5 = this.f15583b;
                objArr5[0] = objArr5[objArr5.length - 1];
                C7019l.m20437e(objArr5, objArr5, m20356p + 1, m20356p, objArr5.length - 1);
            }
            this.f15583b[m20356p] = e10;
        }
        this.f15584c = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        C9322n.m27781e(elements, "elements");
        AbstractC7001c.f15569a.m20329c(i10, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(elements);
        }
        m20353m(size() + elements.size());
        int m20356p = m20356p(this.f15582a + size());
        int m20356p2 = m20356p(this.f15582a + i10);
        int size = elements.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f15582a;
            int i12 = i11 - size;
            if (m20356p2 < i11) {
                Object[] objArr = this.f15583b;
                C7019l.m20437e(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.f15583b;
                if (size >= m20356p2) {
                    C7019l.m20437e(objArr2, objArr2, objArr2.length - size, 0, m20356p2);
                } else {
                    C7019l.m20437e(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f15583b;
                    C7019l.m20437e(objArr3, objArr3, 0, size, m20356p2);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.f15583b;
                C7019l.m20437e(objArr4, objArr4, i12, i11, m20356p2);
            } else {
                Object[] objArr5 = this.f15583b;
                i12 += objArr5.length;
                int i13 = m20356p2 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    C7019l.m20437e(objArr5, objArr5, i12, i11, m20356p2);
                } else {
                    C7019l.m20437e(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.f15583b;
                    C7019l.m20437e(objArr6, objArr6, 0, this.f15582a + length, m20356p2);
                }
            }
            this.f15582a = i12;
            m20350f(m20355o(m20356p2 - size), elements);
        } else {
            int i14 = m20356p2 + size;
            if (m20356p2 < m20356p) {
                int i15 = size + m20356p;
                Object[] objArr7 = this.f15583b;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = m20356p - (i15 - objArr7.length);
                        C7019l.m20437e(objArr7, objArr7, 0, length2, m20356p);
                        Object[] objArr8 = this.f15583b;
                        C7019l.m20437e(objArr8, objArr8, i14, m20356p2, length2);
                    }
                }
                C7019l.m20437e(objArr7, objArr7, i14, m20356p2, m20356p);
            } else {
                Object[] objArr9 = this.f15583b;
                C7019l.m20437e(objArr9, objArr9, size, 0, m20356p);
                Object[] objArr10 = this.f15583b;
                if (i14 >= objArr10.length) {
                    C7019l.m20437e(objArr10, objArr10, i14 - objArr10.length, m20356p2, objArr10.length);
                } else {
                    C7019l.m20437e(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f15583b;
                    C7019l.m20437e(objArr11, objArr11, i14, m20356p2, objArr11.length - size);
                }
            }
            m20350f(m20356p2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C9322n.m27781e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m20353m(size() + elements.size());
        m20350f(m20356p(this.f15582a + size()), elements);
        return true;
    }

    public final void addFirst(E e10) {
        m20353m(size() + 1);
        int m20352l = m20352l(this.f15582a);
        this.f15582a = m20352l;
        this.f15583b[m20352l] = e10;
        this.f15584c = size() + 1;
    }

    public final void addLast(E e10) {
        m20353m(size() + 1);
        this.f15583b[m20356p(this.f15582a + size())] = e10;
        this.f15584c = size() + 1;
    }

    @Override // dk.AbstractC7005e
    /* renamed from: c */
    public int mo20345c() {
        return this.f15584c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m20356p = m20356p(this.f15582a + size());
        int i10 = this.f15582a;
        if (i10 < m20356p) {
            C7019l.m20443k(this.f15583b, null, i10, m20356p);
        } else if (!isEmpty()) {
            Object[] objArr = this.f15583b;
            C7019l.m20443k(objArr, null, this.f15582a, objArr.length);
            C7019l.m20443k(this.f15583b, null, 0, m20356p);
        }
        this.f15582a = 0;
        this.f15584c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // dk.AbstractC7005e
    /* renamed from: d */
    public E mo20346d(int i10) {
        int m20583k;
        int m20583k2;
        AbstractC7001c.f15569a.m20328b(i10, size());
        m20583k = C7031r.m20583k(this);
        if (i10 == m20583k) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int m20356p = m20356p(this.f15582a + i10);
        E e10 = (E) this.f15583b[m20356p];
        if (i10 < (size() >> 1)) {
            int i11 = this.f15582a;
            if (m20356p >= i11) {
                Object[] objArr = this.f15583b;
                C7019l.m20437e(objArr, objArr, i11 + 1, i11, m20356p);
            } else {
                Object[] objArr2 = this.f15583b;
                C7019l.m20437e(objArr2, objArr2, 1, 0, m20356p);
                Object[] objArr3 = this.f15583b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f15582a;
                C7019l.m20437e(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f15583b;
            int i13 = this.f15582a;
            objArr4[i13] = null;
            this.f15582a = m20354n(i13);
        } else {
            int i14 = this.f15582a;
            m20583k2 = C7031r.m20583k(this);
            int m20356p2 = m20356p(i14 + m20583k2);
            Object[] objArr5 = this.f15583b;
            if (m20356p <= m20356p2) {
                C7019l.m20437e(objArr5, objArr5, m20356p, m20356p + 1, m20356p2 + 1);
            } else {
                C7019l.m20437e(objArr5, objArr5, m20356p, m20356p + 1, objArr5.length);
                Object[] objArr6 = this.f15583b;
                objArr6[objArr6.length - 1] = objArr6[0];
                C7019l.m20437e(objArr6, objArr6, 0, 1, m20356p2 + 1);
            }
            this.f15583b[m20356p2] = null;
        }
        this.f15584c = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractC7001c.f15569a.m20328b(i10, size());
        return (E) this.f15583b[m20356p(this.f15582a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int m20356p = m20356p(this.f15582a + size());
        int i10 = this.f15582a;
        if (i10 < m20356p) {
            while (i10 < m20356p) {
                if (!C9322n.m27777a(obj, this.f15583b[i10])) {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < m20356p) {
            return -1;
        }
        int length = this.f15583b.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < m20356p; i11++) {
                    if (C9322n.m27777a(obj, this.f15583b[i11])) {
                        i10 = i11 + this.f15583b.length;
                    }
                }
                return -1;
            }
            if (C9322n.m27777a(obj, this.f15583b[i10])) {
                break;
            }
            i10++;
        }
        return i10 - this.f15582a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m20497y;
        int m20356p = m20356p(this.f15582a + size());
        int i10 = this.f15582a;
        if (i10 < m20356p) {
            m20497y = m20356p - 1;
            if (i10 <= m20497y) {
                while (!C9322n.m27777a(obj, this.f15583b[m20497y])) {
                    if (m20497y != i10) {
                        m20497y--;
                    }
                }
                return m20497y - this.f15582a;
            }
            return -1;
        }
        if (i10 > m20356p) {
            int i11 = m20356p - 1;
            while (true) {
                if (-1 >= i11) {
                    m20497y = C7021m.m20497y(this.f15583b);
                    int i12 = this.f15582a;
                    if (i12 <= m20497y) {
                        while (!C9322n.m27777a(obj, this.f15583b[m20497y])) {
                            if (m20497y != i12) {
                                m20497y--;
                            }
                        }
                    }
                } else {
                    if (C9322n.m27777a(obj, this.f15583b[i11])) {
                        m20497y = i11 + this.f15583b.length;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    /* renamed from: q */
    public final E m20357q() {
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
        int m20356p;
        C9322n.m27781e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f15583b.length == 0) == false) {
                int m20356p2 = m20356p(this.f15582a + size());
                int i10 = this.f15582a;
                if (i10 < m20356p2) {
                    m20356p = i10;
                    while (i10 < m20356p2) {
                        Object obj = this.f15583b[i10];
                        if (!elements.contains(obj)) {
                            this.f15583b[m20356p] = obj;
                            m20356p++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    C7019l.m20443k(this.f15583b, null, m20356p, m20356p2);
                } else {
                    int length = this.f15583b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f15583b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f15583b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    m20356p = m20356p(i11);
                    for (int i12 = 0; i12 < m20356p2; i12++) {
                        Object[] objArr2 = this.f15583b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f15583b[m20356p] = obj3;
                            m20356p = m20354n(m20356p);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f15584c = m20355o(m20356p - this.f15582a);
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f15583b;
        int i10 = this.f15582a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f15582a = m20354n(i10);
        this.f15584c = size() - 1;
        return e10;
    }

    public final E removeLast() {
        int m20583k;
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int i10 = this.f15582a;
        m20583k = C7031r.m20583k(this);
        int m20356p = m20356p(i10 + m20583k);
        Object[] objArr = this.f15583b;
        E e10 = (E) objArr[m20356p];
        objArr[m20356p] = null;
        this.f15584c = size() - 1;
        return e10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        int m20356p;
        C9322n.m27781e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f15583b.length == 0) == false) {
                int m20356p2 = m20356p(this.f15582a + size());
                int i10 = this.f15582a;
                if (i10 < m20356p2) {
                    m20356p = i10;
                    while (i10 < m20356p2) {
                        Object obj = this.f15583b[i10];
                        if (elements.contains(obj)) {
                            this.f15583b[m20356p] = obj;
                            m20356p++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    C7019l.m20443k(this.f15583b, null, m20356p, m20356p2);
                } else {
                    int length = this.f15583b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f15583b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f15583b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    m20356p = m20356p(i11);
                    for (int i12 = 0; i12 < m20356p2; i12++) {
                        Object[] objArr2 = this.f15583b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f15583b[m20356p] = obj3;
                            m20356p = m20354n(m20356p);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f15584c = m20355o(m20356p - this.f15582a);
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        AbstractC7001c.f15569a.m20328b(i10, size());
        int m20356p = m20356p(this.f15582a + i10);
        Object[] objArr = this.f15583b;
        E e11 = (E) objArr[m20356p];
        objArr[m20356p] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] array) {
        C9322n.m27781e(array, "array");
        if (array.length < size()) {
            array = (T[]) C7015j.m20413a(array, size());
        }
        int m20356p = m20356p(this.f15582a + size());
        int i10 = this.f15582a;
        if (i10 < m20356p) {
            C7019l.m20439g(this.f15583b, array, 0, i10, m20356p, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f15583b;
            C7019l.m20437e(objArr, array, 0, this.f15582a, objArr.length);
            Object[] objArr2 = this.f15583b;
            C7019l.m20437e(objArr2, array, objArr2.length - this.f15582a, 0, m20356p);
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
