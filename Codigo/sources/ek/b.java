package ek;

import dk.l;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b<E> extends dk.e<E> implements RandomAccess, Serializable {

    /* renamed from: r, reason: collision with root package name */
    private static final a f14715r = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private static final b f14716s;

    /* renamed from: a, reason: collision with root package name */
    private E[] f14717a;

    /* renamed from: b, reason: collision with root package name */
    private int f14718b;

    /* renamed from: c, reason: collision with root package name */
    private int f14719c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14720d;

    /* renamed from: e, reason: collision with root package name */
    private final b<E> f14721e;

    /* renamed from: f, reason: collision with root package name */
    private final b<E> f14722f;

    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* renamed from: ek.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0230b<E> implements ListIterator<E>, pk.a {

        /* renamed from: a, reason: collision with root package name */
        private final b<E> f14723a;

        /* renamed from: b, reason: collision with root package name */
        private int f14724b;

        /* renamed from: c, reason: collision with root package name */
        private int f14725c;

        public C0230b(b<E> list, int i10) {
            n.e(list, "list");
            this.f14723a = list;
            this.f14724b = i10;
            this.f14725c = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            b<E> bVar = this.f14723a;
            int i10 = this.f14724b;
            this.f14724b = i10 + 1;
            bVar.add(i10, e10);
            this.f14725c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f14724b < ((b) this.f14723a).f14719c;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f14724b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f14724b >= ((b) this.f14723a).f14719c) {
                throw new NoSuchElementException();
            }
            int i10 = this.f14724b;
            this.f14724b = i10 + 1;
            this.f14725c = i10;
            return (E) ((b) this.f14723a).f14717a[((b) this.f14723a).f14718b + this.f14725c];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f14724b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i10 = this.f14724b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f14724b = i11;
            this.f14725c = i11;
            return (E) ((b) this.f14723a).f14717a[((b) this.f14723a).f14718b + this.f14725c];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f14724b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f14725c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
            }
            this.f14723a.remove(i10);
            this.f14724b = this.f14725c;
            this.f14725c = -1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            int i10 = this.f14725c;
            if (!(i10 != -1)) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
            }
            this.f14723a.set(i10, e10);
        }
    }

    static {
        b bVar = new b(0);
        bVar.f14720d = true;
        f14716s = bVar;
    }

    public b() {
        this(10);
    }

    public b(int i10) {
        this(c.d(i10), 0, 0, false, null, null);
    }

    private b(E[] eArr, int i10, int i11, boolean z10, b<E> bVar, b<E> bVar2) {
        this.f14717a = eArr;
        this.f14718b = i10;
        this.f14719c = i11;
        this.f14720d = z10;
        this.f14721e = bVar;
        this.f14722f = bVar2;
    }

    private final void m(int i10, Collection<? extends E> collection, int i11) {
        b<E> bVar = this.f14721e;
        if (bVar != null) {
            bVar.m(i10, collection, i11);
            this.f14717a = this.f14721e.f14717a;
            this.f14719c += i11;
        } else {
            t(i10, i11);
            Iterator<? extends E> it = collection.iterator();
            for (int i12 = 0; i12 < i11; i12++) {
                this.f14717a[i10 + i12] = it.next();
            }
        }
    }

    private final void n(int i10, E e10) {
        b<E> bVar = this.f14721e;
        if (bVar == null) {
            t(i10, 1);
            this.f14717a[i10] = e10;
        } else {
            bVar.n(i10, e10);
            this.f14717a = this.f14721e.f14717a;
            this.f14719c++;
        }
    }

    private final void p() {
        if (u()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean q(List<?> list) {
        boolean h10;
        h10 = c.h(this.f14717a, this.f14718b, this.f14719c, list);
        return h10;
    }

    private final void r(int i10) {
        if (this.f14721e != null) {
            throw new IllegalStateException();
        }
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f14717a;
        if (i10 > eArr.length) {
            this.f14717a = (E[]) c.e(this.f14717a, dk.h.f14222d.a(eArr.length, i10));
        }
    }

    private final void s(int i10) {
        r(this.f14719c + i10);
    }

    private final void t(int i10, int i11) {
        s(i11);
        E[] eArr = this.f14717a;
        l.e(eArr, eArr, i10 + i11, i10, this.f14718b + this.f14719c);
        this.f14719c += i11;
    }

    private final boolean u() {
        b<E> bVar;
        return this.f14720d || ((bVar = this.f14722f) != null && bVar.f14720d);
    }

    private final E v(int i10) {
        b<E> bVar = this.f14721e;
        if (bVar != null) {
            this.f14719c--;
            return bVar.v(i10);
        }
        E[] eArr = this.f14717a;
        E e10 = eArr[i10];
        l.e(eArr, eArr, i10, i10 + 1, this.f14718b + this.f14719c);
        c.f(this.f14717a, (this.f14718b + this.f14719c) - 1);
        this.f14719c--;
        return e10;
    }

    private final void w(int i10, int i11) {
        b<E> bVar = this.f14721e;
        if (bVar != null) {
            bVar.w(i10, i11);
        } else {
            E[] eArr = this.f14717a;
            l.e(eArr, eArr, i10, i10 + i11, this.f14719c);
            E[] eArr2 = this.f14717a;
            int i12 = this.f14719c;
            c.g(eArr2, i12 - i11, i12);
        }
        this.f14719c -= i11;
    }

    private final Object writeReplace() {
        if (u()) {
            return new h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    private final int x(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        b<E> bVar = this.f14721e;
        if (bVar != null) {
            int x10 = bVar.x(i10, i11, collection, z10);
            this.f14719c -= x10;
            return x10;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f14717a[i14]) == z10) {
                E[] eArr = this.f14717a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f14717a;
        l.e(eArr2, eArr2, i10 + i13, i11 + i10, this.f14719c);
        E[] eArr3 = this.f14717a;
        int i16 = this.f14719c;
        c.g(eArr3, i16 - i15, i16);
        this.f14719c -= i15;
        return i15;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        p();
        dk.c.f14211a.c(i10, this.f14719c);
        n(this.f14718b + i10, e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        p();
        n(this.f14718b + this.f14719c, e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> elements) {
        n.e(elements, "elements");
        p();
        dk.c.f14211a.c(i10, this.f14719c);
        int size = elements.size();
        m(this.f14718b + i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        n.e(elements, "elements");
        p();
        int size = elements.size();
        m(this.f14718b + this.f14719c, elements, size);
        return size > 0;
    }

    @Override // dk.e
    public int c() {
        return this.f14719c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        p();
        w(this.f14718b, this.f14719c);
    }

    @Override // dk.e
    public E d(int i10) {
        p();
        dk.c.f14211a.b(i10, this.f14719c);
        return v(this.f14718b + i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof List) && q((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        dk.c.f14211a.b(i10, this.f14719c);
        return this.f14717a[this.f14718b + i10];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10;
        i10 = c.i(this.f14717a, this.f14718b, this.f14719c);
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f14719c; i10++) {
            if (n.a(this.f14717a[this.f14718b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f14719c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new C0230b(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f14719c - 1; i10 >= 0; i10--) {
            if (n.a(this.f14717a[this.f14718b + i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return new C0230b(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int i10) {
        dk.c.f14211a.c(i10, this.f14719c);
        return new C0230b(this, i10);
    }

    public final List<E> o() {
        if (this.f14721e != null) {
            throw new IllegalStateException();
        }
        p();
        this.f14720d = true;
        return this.f14719c > 0 ? this : f14716s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        p();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        return indexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        p();
        return x(this.f14718b, this.f14719c, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> elements) {
        n.e(elements, "elements");
        p();
        return x(this.f14718b, this.f14719c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        p();
        dk.c.f14211a.b(i10, this.f14719c);
        E[] eArr = this.f14717a;
        int i11 = this.f14718b;
        E e11 = eArr[i11 + i10];
        eArr[i11 + i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    public List<E> subList(int i10, int i11) {
        dk.c.f14211a.d(i10, i11, this.f14719c);
        E[] eArr = this.f14717a;
        int i12 = this.f14718b + i10;
        int i13 = i11 - i10;
        boolean z10 = this.f14720d;
        b<E> bVar = this.f14722f;
        return new b(eArr, i12, i13, z10, this, bVar == null ? this : bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] i10;
        E[] eArr = this.f14717a;
        int i11 = this.f14718b;
        i10 = l.i(eArr, i11, this.f14719c + i11);
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] destination) {
        n.e(destination, "destination");
        int length = destination.length;
        int i10 = this.f14719c;
        if (length < i10) {
            E[] eArr = this.f14717a;
            int i11 = this.f14718b;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, destination.getClass());
            n.d(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.f14717a;
        int i12 = this.f14718b;
        l.e(eArr2, destination, 0, i12, i10 + i12);
        int length2 = destination.length;
        int i13 = this.f14719c;
        if (length2 > i13) {
            destination[i13] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String j10;
        j10 = c.j(this.f14717a, this.f14718b, this.f14719c);
        return j10;
    }
}
