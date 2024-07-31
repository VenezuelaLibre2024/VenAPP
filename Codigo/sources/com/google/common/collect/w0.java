package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes2.dex */
public final class w0<E> extends c0<E> {

    /* renamed from: f */
    static final w0<Comparable> f11190f = new w0<>(w.v(), r0.c());

    /* renamed from: e */
    final transient w<E> f11191e;

    public w0(w<E> wVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f11191e = wVar;
    }

    private int Y(Object obj) {
        return Collections.binarySearch(this.f11191e, obj, Z());
    }

    @Override // com.google.common.collect.c0
    c0<E> G() {
        Comparator reverseOrder = Collections.reverseOrder(this.f11043c);
        return isEmpty() ? c0.J(reverseOrder) : new w0(this.f11191e.C(), reverseOrder);
    }

    @Override // com.google.common.collect.c0, java.util.NavigableSet
    /* renamed from: H */
    public h1<E> descendingIterator() {
        return this.f11191e.C().iterator();
    }

    @Override // com.google.common.collect.c0
    public c0<E> M(E e10, boolean z10) {
        return V(0, W(e10, z10));
    }

    @Override // com.google.common.collect.c0
    c0<E> P(E e10, boolean z10, E e11, boolean z11) {
        return S(e10, z10).M(e11, z11);
    }

    @Override // com.google.common.collect.c0
    c0<E> S(E e10, boolean z10) {
        return V(X(e10, z10), size());
    }

    w0<E> V(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new w0<>(this.f11191e.subList(i10, i11), this.f11043c) : c0.J(this.f11043c);
    }

    int W(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f11191e, eb.o.o(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    int X(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f11191e, eb.o.o(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    Comparator<Object> Z() {
        return this.f11043c;
    }

    @Override // com.google.common.collect.a0, com.google.common.collect.u
    public w<E> c() {
        return this.f11191e;
    }

    @Override // com.google.common.collect.c0, java.util.NavigableSet
    public E ceiling(E e10) {
        int X = X(e10, true);
        if (X == size()) {
            return null;
        }
        return this.f11191e.get(X);
    }

    @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Y(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof n0) {
            collection = ((n0) collection).z0();
        }
        if (!f1.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        h1<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int T = T(next2, next);
                if (T < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (T == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (T > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.u
    public int d(Object[] objArr, int i10) {
        return this.f11191e.d(objArr, i10);
    }

    @Override // com.google.common.collect.a0, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!f1.b(this.f11043c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            h1<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || T(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.u
    public Object[] f() {
        return this.f11191e.f();
    }

    @Override // com.google.common.collect.c0, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f11191e.get(0);
    }

    @Override // com.google.common.collect.c0, java.util.NavigableSet
    public E floor(E e10) {
        int W = W(e10, true) - 1;
        if (W == -1) {
            return null;
        }
        return this.f11191e.get(W);
    }

    @Override // com.google.common.collect.u
    public int h() {
        return this.f11191e.h();
    }

    @Override // com.google.common.collect.c0, java.util.NavigableSet
    public E higher(E e10) {
        int X = X(e10, false);
        if (X == size()) {
            return null;
        }
        return this.f11191e.get(X);
    }

    @Override // com.google.common.collect.u
    public int k() {
        return this.f11191e.k();
    }

    @Override // com.google.common.collect.u
    public boolean l() {
        return this.f11191e.l();
    }

    @Override // com.google.common.collect.c0, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f11191e.get(size() - 1);
    }

    @Override // com.google.common.collect.c0, java.util.NavigableSet
    public E lower(E e10) {
        int W = W(e10, false) - 1;
        if (W == -1) {
            return null;
        }
        return this.f11191e.get(W);
    }

    @Override // com.google.common.collect.c0, com.google.common.collect.a0, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public h1<E> iterator() {
        return this.f11191e.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f11191e.size();
    }
}
