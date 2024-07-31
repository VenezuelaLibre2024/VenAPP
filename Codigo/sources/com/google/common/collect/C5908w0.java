package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.w0 */
/* loaded from: classes2.dex */
public final class C5908w0<E> extends AbstractC5861c0<E> {

    /* renamed from: f */
    static final C5908w0<Comparable> f12405f = new C5908w0<>(AbstractC5907w.m15081v(), AbstractC5898r0.m15040c());

    /* renamed from: e */
    final transient AbstractC5907w<E> f12406e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5908w0(AbstractC5907w<E> abstractC5907w, Comparator<? super E> comparator) {
        super(comparator);
        this.f12406e = abstractC5907w;
    }

    /* renamed from: Y */
    private int m15097Y(Object obj) {
        return Collections.binarySearch(this.f12406e, obj, m15101Z());
    }

    @Override // com.google.common.collect.AbstractC5861c0
    /* renamed from: G */
    AbstractC5861c0<E> mo14755G() {
        Comparator reverseOrder = Collections.reverseOrder(this.f12258c);
        return isEmpty() ? AbstractC5861c0.m14753J(reverseOrder) : new C5908w0(this.f12406e.mo15086C(), reverseOrder);
    }

    @Override // com.google.common.collect.AbstractC5861c0, java.util.NavigableSet
    /* renamed from: H */
    public AbstractC5877h1<E> descendingIterator() {
        return this.f12406e.mo15086C().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5861c0
    /* renamed from: M */
    public AbstractC5861c0<E> mo14760M(E e10, boolean z10) {
        return m15098V(0, m15099W(e10, z10));
    }

    @Override // com.google.common.collect.AbstractC5861c0
    /* renamed from: P */
    AbstractC5861c0<E> mo14763P(E e10, boolean z10, E e11, boolean z11) {
        return mo14766S(e10, z10).mo14760M(e11, z11);
    }

    @Override // com.google.common.collect.AbstractC5861c0
    /* renamed from: S */
    AbstractC5861c0<E> mo14766S(E e10, boolean z10) {
        return m15098V(m15100X(e10, z10), size());
    }

    /* renamed from: V */
    C5908w0<E> m15098V(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new C5908w0<>(this.f12406e.subList(i10, i11), this.f12258c) : AbstractC5861c0.m14753J(this.f12258c);
    }

    /* renamed from: W */
    int m15099W(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f12406e, C7159o.m21312o(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    /* renamed from: X */
    int m15100X(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f12406e, C7159o.m21312o(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    /* renamed from: Z */
    Comparator<Object> m15101Z() {
        return this.f12258c;
    }

    @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u
    /* renamed from: c */
    public AbstractC5907w<E> mo14719c() {
        return this.f12406e;
    }

    @Override // com.google.common.collect.AbstractC5861c0, java.util.NavigableSet
    public E ceiling(E e10) {
        int m15100X = m15100X(e10, true);
        if (m15100X == size()) {
            return null;
        }
        return this.f12406e.get(m15100X);
    }

    @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m15097Y(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC5890n0) {
            collection = ((InterfaceC5890n0) collection).m15014z0();
        }
        if (!C5871f1.m14870b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC5877h1<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int m14767T = m14767T(next2, next);
                if (m14767T < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (m14767T == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (m14767T > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: d */
    public int mo14834d(Object[] objArr, int i10) {
        return this.f12406e.mo14834d(objArr, i10);
    }

    @Override // com.google.common.collect.AbstractC5855a0, java.util.Collection, java.util.Set
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
        if (!C5871f1.m14870b(this.f12258c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            AbstractC5877h1<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || m14767T(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: f */
    public Object[] mo15052f() {
        return this.f12406e.mo15052f();
    }

    @Override // com.google.common.collect.AbstractC5861c0, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f12406e.get(0);
    }

    @Override // com.google.common.collect.AbstractC5861c0, java.util.NavigableSet
    public E floor(E e10) {
        int m15099W = m15099W(e10, true) - 1;
        if (m15099W == -1) {
            return null;
        }
        return this.f12406e.get(m15099W);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: h */
    public int mo15053h() {
        return this.f12406e.mo15053h();
    }

    @Override // com.google.common.collect.AbstractC5861c0, java.util.NavigableSet
    public E higher(E e10) {
        int m15100X = m15100X(e10, false);
        if (m15100X == size()) {
            return null;
        }
        return this.f12406e.get(m15100X);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: k */
    public int mo15054k() {
        return this.f12406e.mo15054k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: l */
    public boolean mo14745l() {
        return this.f12406e.mo14745l();
    }

    @Override // com.google.common.collect.AbstractC5861c0, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f12406e.get(size() - 1);
    }

    @Override // com.google.common.collect.AbstractC5861c0, java.util.NavigableSet
    public E lower(E e10) {
        int m15099W = m15099W(e10, false) - 1;
        if (m15099W == -1) {
            return null;
        }
        return this.f12406e.get(m15099W);
    }

    @Override // com.google.common.collect.AbstractC5861c0, com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public AbstractC5877h1<E> iterator() {
        return this.f12406e.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f12406e.size();
    }
}
