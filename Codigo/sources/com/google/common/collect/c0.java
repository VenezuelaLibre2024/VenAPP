package com.google.common.collect;

import com.google.common.collect.a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* loaded from: classes2.dex */
public abstract class c0<E> extends d0<E> implements NavigableSet<E>, e1<E> {

    /* renamed from: c */
    final transient Comparator<? super E> f11043c;

    /* renamed from: d */
    transient c0<E> f11044d;

    /* loaded from: classes2.dex */
    public static final class a<E> extends a0.a<E> {

        /* renamed from: f */
        private final Comparator<? super E> f11045f;

        public a(Comparator<? super E> comparator) {
            this.f11045f = (Comparator) eb.o.o(comparator);
        }

        @Override // com.google.common.collect.a0.a
        /* renamed from: l */
        public a<E> a(E e10) {
            super.a(e10);
            return this;
        }

        public a<E> m(E... eArr) {
            super.i(eArr);
            return this;
        }

        @Override // com.google.common.collect.a0.a
        /* renamed from: n */
        public c0<E> k() {
            c0<E> D = c0.D(this.f11045f, this.f11158b, this.f11157a);
            this.f11158b = D.size();
            this.f11159c = true;
            return D;
        }
    }

    /* loaded from: classes2.dex */
    private static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super E> f11046a;

        /* renamed from: b */
        final Object[] f11047b;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.f11046a = comparator;
            this.f11047b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new a(this.f11046a).m(this.f11047b).k();
        }
    }

    public c0(Comparator<? super E> comparator) {
        this.f11043c = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <E> c0<E> D(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return J(comparator);
        }
        q0.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            defpackage.a aVar = (Object) eArr[i12];
            if (comparator.compare(aVar, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = aVar;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new w0(w.o(eArr, i11), comparator);
    }

    public static <E> c0<E> E(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        eb.o.o(comparator);
        if (f1.b(comparator, iterable) && (iterable instanceof c0)) {
            c0<E> c0Var = (c0) iterable;
            if (!c0Var.l()) {
                return c0Var;
            }
        }
        Object[] j10 = e0.j(iterable);
        return D(comparator, j10.length, j10);
    }

    public static <E> c0<E> F(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return E(comparator, collection);
    }

    public static <E> w0<E> J(Comparator<? super E> comparator) {
        return r0.c().equals(comparator) ? (w0<E>) w0.f11190f : new w0<>(w.v(), comparator);
    }

    static int U(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract c0<E> G();

    @Override // java.util.NavigableSet
    /* renamed from: H */
    public abstract h1<E> descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: I */
    public c0<E> descendingSet() {
        c0<E> c0Var = this.f11044d;
        if (c0Var != null) {
            return c0Var;
        }
        c0<E> G = G();
        this.f11044d = G;
        G.f11044d = this;
        return G;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: K */
    public c0<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: L */
    public c0<E> headSet(E e10, boolean z10) {
        return M(eb.o.o(e10), z10);
    }

    public abstract c0<E> M(E e10, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: N */
    public c0<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: O */
    public c0<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        eb.o.o(e10);
        eb.o.o(e11);
        eb.o.d(this.f11043c.compare(e10, e11) <= 0);
        return P(e10, z10, e11, z11);
    }

    abstract c0<E> P(E e10, boolean z10, E e11, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: Q */
    public c0<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: R */
    public c0<E> tailSet(E e10, boolean z10) {
        return S(eb.o.o(e10), z10);
    }

    abstract c0<E> S(E e10, boolean z10);

    public int T(Object obj, Object obj2) {
        return U(this.f11043c, obj, obj2);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        return (E) e0.c(tailSet(e10, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.e1
    public Comparator<? super E> comparator() {
        return this.f11043c;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return (E) f0.m(headSet(e10, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        return (E) e0.c(tailSet(e10, false), null);
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        return (E) f0.m(headSet(e10, false).descendingIterator(), null);
    }

    @Override // com.google.common.collect.a0, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public abstract h1<E> iterator();

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.a0, com.google.common.collect.u
    Object writeReplace() {
        return new b(this.f11043c, toArray());
    }
}
