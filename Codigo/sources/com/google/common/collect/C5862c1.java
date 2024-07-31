package com.google.common.collect;

import com.google.common.collect.C5881j;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p082eb.C7159o;
import p082eb.C7161q;
import p082eb.InterfaceC7160p;

/* renamed from: com.google.common.collect.c1 */
/* loaded from: classes2.dex */
public final class C5862c1 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* renamed from: com.google.common.collect.c1$a */
    /* loaded from: classes2.dex */
    class a<E> extends e<E> {

        /* renamed from: a */
        final /* synthetic */ Set f12263a;

        /* renamed from: b */
        final /* synthetic */ Set f12264b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.common.collect.c1$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public class C13191a extends AbstractC5857b<E> {

            /* renamed from: c */
            final Iterator<E> f12265c;

            C13191a() {
                this.f12265c = a.this.f12263a.iterator();
            }

            @Override // com.google.common.collect.AbstractC5857b
            /* renamed from: a */
            protected E mo14729a() {
                while (this.f12265c.hasNext()) {
                    E next = this.f12265c.next();
                    if (a.this.f12264b.contains(next)) {
                        return next;
                    }
                }
                return m14730c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Set set, Set set2) {
            super(null);
            this.f12263a = set;
            this.f12264b = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC5877h1<E> iterator() {
            return new C13191a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f12263a.contains(obj) && this.f12264b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f12263a.containsAll(collection) && this.f12264b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f12264b, this.f12263a);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f12263a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f12264b.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.c1$b */
    /* loaded from: classes2.dex */
    public static class b<E> extends C5881j.a<E> implements Set<E> {
        b(Set<E> set, InterfaceC7160p<? super E> interfaceC7160p) {
            super(set, interfaceC7160p);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return C5862c1.m14771a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C5862c1.m14774d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.c1$c */
    /* loaded from: classes2.dex */
    public static class c<E> extends b<E> implements SortedSet<E> {
        c(SortedSet<E> sortedSet, InterfaceC7160p<? super E> interfaceC7160p) {
            super(sortedSet, interfaceC7160p);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f12316a).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) C5870f0.m14859j(this.f12316a.iterator(), this.f12317b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f12316a).headSet(e10), this.f12317b);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f12316a;
            while (true) {
                E e10 = (Object) sortedSet.last();
                if (this.f12317b.apply(e10)) {
                    return e10;
                }
                sortedSet = sortedSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f12316a).subSet(e10, e11), this.f12317b);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f12316a).tailSet(e10), this.f12317b);
        }
    }

    /* renamed from: com.google.common.collect.c1$d */
    /* loaded from: classes2.dex */
    static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return C5862c1.m14779i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C7159o.m21312o(collection));
        }
    }

    /* renamed from: com.google.common.collect.c1$e */
    /* loaded from: classes2.dex */
    public static abstract class e<E> extends AbstractSet<E> {
        private e() {
        }

        /* synthetic */ e(C5859b1 c5859b1) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m14771a(Set<?> set, Object obj) {
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

    /* renamed from: b */
    public static <E> Set<E> m14772b(Set<E> set, InterfaceC7160p<? super E> interfaceC7160p) {
        if (set instanceof SortedSet) {
            return m14773c((SortedSet) set, interfaceC7160p);
        }
        if (!(set instanceof b)) {
            return new b((Set) C7159o.m21312o(set), (InterfaceC7160p) C7159o.m21312o(interfaceC7160p));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f12316a, C7161q.m21324b(bVar.f12317b, interfaceC7160p));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <E> SortedSet<E> m14773c(SortedSet<E> sortedSet, InterfaceC7160p<? super E> interfaceC7160p) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) C7159o.m21312o(sortedSet), (InterfaceC7160p) C7159o.m21312o(interfaceC7160p));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f12316a, C7161q.m21324b(bVar.f12317b, interfaceC7160p));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m14774d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* renamed from: e */
    public static <E> e<E> m14775e(Set<E> set, Set<?> set2) {
        C7159o.m21313p(set, "set1");
        C7159o.m21313p(set2, "set2");
        return new a(set, set2);
    }

    /* renamed from: f */
    public static <E> HashSet<E> m14776f() {
        return new HashSet<>();
    }

    /* renamed from: g */
    public static <E> HashSet<E> m14777g(int i10) {
        return new HashSet<>(C5882j0.m14888a(i10));
    }

    /* renamed from: h */
    public static <E> Set<E> m14778h() {
        return Collections.newSetFromMap(C5882j0.m14893f());
    }

    /* renamed from: i */
    static boolean m14779i(Set<?> set, Collection<?> collection) {
        C7159o.m21312o(collection);
        if (collection instanceof InterfaceC5890n0) {
            collection = ((InterfaceC5890n0) collection).m15014z0();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m14780j(set, collection.iterator()) : C5870f0.m14865p(set.iterator(), collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static boolean m14780j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
