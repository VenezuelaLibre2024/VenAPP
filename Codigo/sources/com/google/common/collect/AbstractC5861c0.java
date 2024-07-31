package com.google.common.collect;

import com.google.common.collect.AbstractC5855a0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import p000.C0000a;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.c0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5861c0<E> extends AbstractC5864d0<E> implements NavigableSet<E>, InterfaceC5868e1<E> {

    /* renamed from: c */
    final transient Comparator<? super E> f12258c;

    /* renamed from: d */
    transient AbstractC5861c0<E> f12259d;

    /* renamed from: com.google.common.collect.c0$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends AbstractC5855a0.a<E> {

        /* renamed from: f */
        private final Comparator<? super E> f12260f;

        public a(Comparator<? super E> comparator) {
            this.f12260f = (Comparator) C7159o.m21312o(comparator);
        }

        @Override // com.google.common.collect.AbstractC5855a0.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a<E> mo14724a(E e10) {
            super.mo14724a(e10);
            return this;
        }

        /* renamed from: m */
        public a<E> m14769m(E... eArr) {
            super.m14726i(eArr);
            return this;
        }

        @Override // com.google.common.collect.AbstractC5855a0.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC5861c0<E> mo14727k() {
            AbstractC5861c0<E> m14750D = AbstractC5861c0.m14750D(this.f12260f, this.f12373b, this.f12372a);
            this.f12373b = m14750D.size();
            this.f12374c = true;
            return m14750D;
        }
    }

    /* renamed from: com.google.common.collect.c0$b */
    /* loaded from: classes2.dex */
    private static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Comparator<? super E> f12261a;

        /* renamed from: b */
        final Object[] f12262b;

        public b(Comparator<? super E> comparator, Object[] objArr) {
            this.f12261a = comparator;
            this.f12262b = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new a(this.f12261a).m14769m(this.f12262b).mo14727k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5861c0(Comparator<? super E> comparator) {
        this.f12258c = comparator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    static <E> AbstractC5861c0<E> m14750D(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return m14753J(comparator);
        }
        C5896q0.m15033c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            C0000a c0000a = (Object) eArr[i12];
            if (comparator.compare(c0000a, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = c0000a;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new C5908w0(AbstractC5907w.m15076o(eArr, i11), comparator);
    }

    /* renamed from: E */
    public static <E> AbstractC5861c0<E> m14751E(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C7159o.m21312o(comparator);
        if (C5871f1.m14870b(comparator, iterable) && (iterable instanceof AbstractC5861c0)) {
            AbstractC5861c0<E> abstractC5861c0 = (AbstractC5861c0) iterable;
            if (!abstractC5861c0.mo14745l()) {
                return abstractC5861c0;
            }
        }
        Object[] m14844j = C5867e0.m14844j(iterable);
        return m14750D(comparator, m14844j.length, m14844j);
    }

    /* renamed from: F */
    public static <E> AbstractC5861c0<E> m14752F(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return m14751E(comparator, collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static <E> C5908w0<E> m14753J(Comparator<? super E> comparator) {
        return AbstractC5898r0.m15040c().equals(comparator) ? (C5908w0<E>) C5908w0.f12405f : new C5908w0<>(AbstractC5907w.m15081v(), comparator);
    }

    /* renamed from: U */
    static int m14754U(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: G */
    abstract AbstractC5861c0<E> mo14755G();

    @Override // java.util.NavigableSet
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5877h1<E> descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public AbstractC5861c0<E> descendingSet() {
        AbstractC5861c0<E> abstractC5861c0 = this.f12259d;
        if (abstractC5861c0 != null) {
            return abstractC5861c0;
        }
        AbstractC5861c0<E> mo14755G = mo14755G();
        this.f12259d = mo14755G;
        mo14755G.f12259d = this;
        return mo14755G;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public AbstractC5861c0<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC5861c0<E> headSet(E e10, boolean z10) {
        return mo14760M(C7159o.m21312o(e10), z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public abstract AbstractC5861c0<E> mo14760M(E e10, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC5861c0<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC5861c0<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        C7159o.m21312o(e10);
        C7159o.m21312o(e11);
        C7159o.m21301d(this.f12258c.compare(e10, e11) <= 0);
        return mo14763P(e10, z10, e11, z11);
    }

    /* renamed from: P */
    abstract AbstractC5861c0<E> mo14763P(E e10, boolean z10, E e11, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC5861c0<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public AbstractC5861c0<E> tailSet(E e10, boolean z10) {
        return mo14766S(C7159o.m21312o(e10), z10);
    }

    /* renamed from: S */
    abstract AbstractC5861c0<E> mo14766S(E e10, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public int m14767T(Object obj, Object obj2) {
        return m14754U(this.f12258c, obj, obj2);
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        return (E) C5867e0.m14837c(tailSet(e10, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.InterfaceC5868e1
    public Comparator<? super E> comparator() {
        return this.f12258c;
    }

    @Override // java.util.SortedSet
    public E first() {
        return iterator().next();
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        return (E) C5870f0.m14862m(headSet(e10, true).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        return (E) C5867e0.m14837c(tailSet(e10, false), null);
    }

    @Override // java.util.SortedSet
    public E last() {
        return descendingIterator().next();
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        return (E) C5870f0.m14862m(headSet(e10, false).descendingIterator(), null);
    }

    @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public abstract AbstractC5877h1<E> iterator();

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

    @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u
    Object writeReplace() {
        return new b(this.f12258c, toArray());
    }
}
