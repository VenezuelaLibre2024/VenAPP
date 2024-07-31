package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p082eb.C7159o;
import p082eb.InterfaceC7160p;

/* renamed from: com.google.common.collect.j */
/* loaded from: classes2.dex */
public final class C5881j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.j$a */
    /* loaded from: classes2.dex */
    public static class a<E> extends AbstractCollection<E> {

        /* renamed from: a */
        final Collection<E> f12316a;

        /* renamed from: b */
        final InterfaceC7160p<? super E> f12317b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Collection<E> collection, InterfaceC7160p<? super E> interfaceC7160p) {
            this.f12316a = collection;
            this.f12317b = interfaceC7160p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e10) {
            C7159o.m21301d(this.f12317b.apply(e10));
            return this.f12316a.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                C7159o.m21301d(this.f12317b.apply(it.next()));
            }
            return this.f12316a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C5867e0.m14841g(this.f12316a, this.f12317b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C5881j.m14887c(this.f12316a, obj)) {
                return this.f12317b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C5881j.m14885a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !C5867e0.m14835a(this.f12316a, this.f12317b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return C5870f0.m14858i(this.f12316a.iterator(), this.f12317b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f12316a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f12316a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f12317b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f12316a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f12317b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f12316a.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f12317b.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return C5876h0.m14880i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C5876h0.m14880i(iterator()).toArray(tArr);
        }
    }

    /* renamed from: a */
    static boolean m14885a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static StringBuilder m14886b(int i10) {
        C5878i.m14883b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m14887c(Collection<?> collection, Object obj) {
        C7159o.m21312o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
