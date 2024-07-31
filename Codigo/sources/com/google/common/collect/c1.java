package com.google.common.collect;

import com.google.common.collect.j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public final class c1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a<E> extends e<E> {

        /* renamed from: a */
        final /* synthetic */ Set f11048a;

        /* renamed from: b */
        final /* synthetic */ Set f11049b;

        /* renamed from: com.google.common.collect.c1$a$a */
        /* loaded from: classes2.dex */
        public class C0161a extends com.google.common.collect.b<E> {

            /* renamed from: c */
            final Iterator<E> f11050c;

            C0161a() {
                this.f11050c = a.this.f11048a.iterator();
            }

            @Override // com.google.common.collect.b
            protected E a() {
                while (this.f11050c.hasNext()) {
                    E next = this.f11050c.next();
                    if (a.this.f11049b.contains(next)) {
                        return next;
                    }
                }
                return c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f11048a = set;
            this.f11049b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: c */
        public h1<E> iterator() {
            return new C0161a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11048a.contains(obj) && this.f11049b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f11048a.containsAll(collection) && this.f11049b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f11049b, this.f11048a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f11048a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f11049b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* loaded from: classes2.dex */
    public static class b<E> extends j.a<E> implements Set<E> {
        b(Set<E> set, eb.p<? super E> pVar) {
            super(set, pVar);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return c1.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return c1.d(this);
        }
    }

    /* loaded from: classes2.dex */
    public static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, eb.p<? super E> pVar) {
            super(sortedSet, pVar);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f11101a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) f0.j(this.f11101a.iterator(), this.f11102b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f11101a).headSet(e10), this.f11102b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f11101a;
            while (true) {
                E e10 = (Object) sortedSet.last();
                if (this.f11102b.apply(e10)) {
                    return e10;
                }
                sortedSet = sortedSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f11101a).subSet(e10, e11), this.f11102b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f11101a).tailSet(e10), this.f11102b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return c1.i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) eb.o.o(collection));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e<E> extends AbstractSet<E> {
        private e() {
        }

        /* synthetic */ e(b1 b1Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <E> Set<E> b(Set<E> set, eb.p<? super E> pVar) {
        if (set instanceof SortedSet) {
            return c((SortedSet) set, pVar);
        }
        if (!(set instanceof b)) {
            return new b((Set) eb.o.o(set), (eb.p) eb.o.o(pVar));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f11101a, eb.q.b(bVar.f11102b, pVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> c(SortedSet<E> sortedSet, eb.p<? super E> pVar) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) eb.o.o(sortedSet), (eb.p) eb.o.o(pVar));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f11101a, eb.q.b(bVar.f11102b, pVar));
    }

    public static int d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static <E> e<E> e(Set<E> set, Set<?> set2) {
        eb.o.p(set, "set1");
        eb.o.p(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> f() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> g(int i10) {
        return new HashSet<>(j0.a(i10));
    }

    public static <E> Set<E> h() {
        return Collections.newSetFromMap(j0.f());
    }

    static boolean i(Set<?> set, Collection<?> collection) {
        eb.o.o(collection);
        if (collection instanceof n0) {
            collection = ((n0) collection).z0();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? j(set, collection.iterator()) : f0.p(set.iterator(), collection);
    }

    public static boolean j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
