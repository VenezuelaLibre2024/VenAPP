package p088ek;

import dk.AbstractC7001c;
import dk.AbstractC7005e;
import dk.C7011h;
import dk.C7019l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import pk.InterfaceC10201a;

/* renamed from: ek.b */
/* loaded from: classes3.dex */
public final class C7199b<E> extends AbstractC7005e<E> implements RandomAccess, Serializable {

    /* renamed from: r */
    private static final a f16138r = new a(null);

    /* renamed from: s */
    private static final C7199b f16139s;

    /* renamed from: a */
    private E[] f16140a;

    /* renamed from: b */
    private int f16141b;

    /* renamed from: c */
    private int f16142c;

    /* renamed from: d */
    private boolean f16143d;

    /* renamed from: e */
    private final C7199b<E> f16144e;

    /* renamed from: f */
    private final C7199b<E> f16145f;

    /* renamed from: ek.b$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: ek.b$b */
    /* loaded from: classes3.dex */
    private static final class b<E> implements ListIterator<E>, InterfaceC10201a {

        /* renamed from: a */
        private final C7199b<E> f16146a;

        /* renamed from: b */
        private int f16147b;

        /* renamed from: c */
        private int f16148c;

        public b(C7199b<E> list, int i10) {
            C9322n.m27781e(list, "list");
            this.f16146a = list;
            this.f16147b = i10;
            this.f16148c = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            C7199b<E> c7199b = this.f16146a;
            int i10 = this.f16147b;
            this.f16147b = i10 + 1;
            c7199b.add(i10, e10);
            this.f16148c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f16147b < ((C7199b) this.f16146a).f16142c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f16147b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f16147b >= ((C7199b) this.f16146a).f16142c) {
                throw new NoSuchElementException();
            }
            int i10 = this.f16147b;
            this.f16147b = i10 + 1;
            this.f16148c = i10;
            return (E) ((C7199b) this.f16146a).f16140a[((C7199b) this.f16146a).f16141b + this.f16148c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f16147b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i10 = this.f16147b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f16147b = i11;
            this.f16148c = i11;
            return (E) ((C7199b) this.f16146a).f16140a[((C7199b) this.f16146a).f16141b + this.f16148c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f16147b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f16148c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f16146a.remove(i10);
            this.f16147b = this.f16148c;
            this.f16148c = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            int i10 = this.f16148c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f16146a.set(i10, e10);
        }
    }

    static {
        C7199b c7199b = new C7199b(0);
        c7199b.f16143d = true;
        f16139s = c7199b;
    }

    public C7199b() {
        this(10);
    }

    public C7199b(int i10) {
        this(C7200c.m21476d(i10), 0, 0, false, null, null);
    }

    private C7199b(E[] eArr, int i10, int i11, boolean z10, C7199b<E> c7199b, C7199b<E> c7199b2) {
        this.f16140a = eArr;
        this.f16141b = i10;
        this.f16142c = i11;
        this.f16143d = z10;
        this.f16144e = c7199b;
        this.f16145f = c7199b2;
    }

    /* renamed from: m */
    private final void m21461m(int i10, Collection<? extends E> collection, int i11) {
        C7199b<E> c7199b = this.f16144e;
        if (c7199b != null) {
            c7199b.m21461m(i10, collection, i11);
            this.f16140a = this.f16144e.f16140a;
            this.f16142c += i11;
        } else {
            m21467t(i10, i11);
            Iterator<? extends E> it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f16140a[i10 + i12] = it.next();
            }
        }
    }

    /* renamed from: n */
    private final void m21462n(int i10, E e10) {
        C7199b<E> c7199b = this.f16144e;
        if (c7199b == null) {
            m21467t(i10, 1);
            this.f16140a[i10] = e10;
        } else {
            c7199b.m21462n(i10, e10);
            this.f16140a = this.f16144e.f16140a;
            this.f16142c++;
        }
    }

    /* renamed from: p */
    private final void m21463p() {
        if (m21468u()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: q */
    private final boolean m21464q(List<?> list) {
        boolean m21480h;
        m21480h = C7200c.m21480h(this.f16140a, this.f16141b, this.f16142c, list);
        return m21480h;
    }

    /* renamed from: r */
    private final void m21465r(int i10) {
        if (this.f16144e != null) {
            throw new IllegalStateException();
        }
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f16140a;
        if (i10 > eArr.length) {
            this.f16140a = (E[]) C7200c.m21477e(this.f16140a, C7011h.f15580d.m20358a(eArr.length, i10));
        }
    }

    /* renamed from: s */
    private final void m21466s(int i10) {
        m21465r(this.f16142c + i10);
    }

    /* renamed from: t */
    private final void m21467t(int i10, int i11) {
        m21466s(i11);
        E[] eArr = this.f16140a;
        C7019l.m20437e(eArr, eArr, i10 + i11, i10, this.f16141b + this.f16142c);
        this.f16142c += i11;
    }

    /* renamed from: u */
    private final boolean m21468u() {
        C7199b<E> c7199b;
        return this.f16143d || ((c7199b = this.f16145f) != null && c7199b.f16143d);
    }

    /* renamed from: v */
    private final E m21469v(int i10) {
        C7199b<E> c7199b = this.f16144e;
        if (c7199b != null) {
            this.f16142c--;
            return c7199b.m21469v(i10);
        }
        E[] eArr = this.f16140a;
        E e10 = eArr[i10];
        C7019l.m20437e(eArr, eArr, i10, i10 + 1, this.f16141b + this.f16142c);
        C7200c.m21478f(this.f16140a, (this.f16141b + this.f16142c) - 1);
        this.f16142c--;
        return e10;
    }

    /* renamed from: w */
    private final void m21470w(int i10, int i11) {
        C7199b<E> c7199b = this.f16144e;
        if (c7199b != null) {
            c7199b.m21470w(i10, i11);
        } else {
            E[] eArr = this.f16140a;
            C7019l.m20437e(eArr, eArr, i10, i10 + i11, this.f16142c);
            E[] eArr2 = this.f16140a;
            int i12 = this.f16142c;
            C7200c.m21479g(eArr2, i12 - i11, i12);
        }
        this.f16142c -= i11;
    }

    private final Object writeReplace() {
        if (m21468u()) {
            return new C7205h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* renamed from: x */
    private final int m21471x(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        C7199b<E> c7199b = this.f16144e;
        if (c7199b != null) {
            int m21471x = c7199b.m21471x(i10, i11, collection, z10);
            this.f16142c -= m21471x;
            return m21471x;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f16140a[i14]) == z10) {
                E[] eArr = this.f16140a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f16140a;
        C7019l.m20437e(eArr2, eArr2, i10 + i13, i11 + i10, this.f16142c);
        E[] eArr3 = this.f16140a;
        int i16 = this.f16142c;
        C7200c.m21479g(eArr3, i16 - i15, i16);
        this.f16142c -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        m21463p();
        AbstractC7001c.f15569a.m20329c(i10, this.f16142c);
        m21462n(this.f16141b + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m21463p();
        m21462n(this.f16141b + this.f16142c, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        C9322n.m27781e(elements, "elements");
        m21463p();
        AbstractC7001c.f15569a.m20329c(i10, this.f16142c);
        int size = elements.size();
        m21461m(this.f16141b + i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        C9322n.m27781e(elements, "elements");
        m21463p();
        int size = elements.size();
        m21461m(this.f16141b + this.f16142c, elements, size);
        return size > 0;
    }

    @Override // dk.AbstractC7005e
    /* renamed from: c */
    public int mo20345c() {
        return this.f16142c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m21463p();
        m21470w(this.f16141b, this.f16142c);
    }

    @Override // dk.AbstractC7005e
    /* renamed from: d */
    public E mo20346d(int i10) {
        m21463p();
        AbstractC7001c.f15569a.m20328b(i10, this.f16142c);
        return m21469v(this.f16141b + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && m21464q((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractC7001c.f15569a.m20328b(i10, this.f16142c);
        return this.f16140a[this.f16141b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int m21481i;
        m21481i = C7200c.m21481i(this.f16140a, this.f16141b, this.f16142c);
        return m21481i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f16142c; i10++) {
            if (C9322n.m27777a(this.f16140a[this.f16141b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f16142c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f16142c - 1; i10 >= 0; i10--) {
            if (C9322n.m27777a(this.f16140a[this.f16141b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new b(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        AbstractC7001c.f15569a.m20329c(i10, this.f16142c);
        return new b(this, i10);
    }

    /* renamed from: o */
    public final List<E> m21472o() {
        if (this.f16144e != null) {
            throw new IllegalStateException();
        }
        m21463p();
        this.f16143d = true;
        return this.f16142c > 0 ? this : f16139s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m21463p();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        m21463p();
        return m21471x(this.f16141b, this.f16142c, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        C9322n.m27781e(elements, "elements");
        m21463p();
        return m21471x(this.f16141b, this.f16142c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m21463p();
        AbstractC7001c.f15569a.m20328b(i10, this.f16142c);
        E[] eArr = this.f16140a;
        int i11 = this.f16141b;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        AbstractC7001c.f15569a.m20330d(i10, i11, this.f16142c);
        E[] eArr = this.f16140a;
        int i12 = this.f16141b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f16143d;
        C7199b<E> c7199b = this.f16145f;
        return new C7199b(eArr, i12, i13, z10, this, c7199b == null ? this : c7199b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] m20441i;
        E[] eArr = this.f16140a;
        int i10 = this.f16141b;
        m20441i = C7019l.m20441i(eArr, i10, this.f16142c + i10);
        return m20441i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        C9322n.m27781e(destination, "destination");
        int length = destination.length;
        int i10 = this.f16142c;
        if (length < i10) {
            E[] eArr = this.f16140a;
            int i11 = this.f16141b;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, destination.getClass());
            C9322n.m27780d(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f16140a;
        int i12 = this.f16141b;
        C7019l.m20437e(eArr2, destination, 0, i12, i10 + i12);
        int length2 = destination.length;
        int i13 = this.f16142c;
        if (length2 > i13) {
            destination[i13] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String m21482j;
        m21482j = C7200c.m21482j(this.f16140a, this.f16141b, this.f16142c);
        return m21482j;
    }
}
