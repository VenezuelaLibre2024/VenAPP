package com.google.common.collect;

import com.google.android.gms.common.api.a;
import com.google.common.collect.w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class u<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f11156a = new Object[0];

    /* loaded from: classes2.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a */
        Object[] f11157a;

        /* renamed from: b */
        int f11158b;

        /* renamed from: c */
        boolean f11159c;

        public a(int i10) {
            i.b(i10, "initialCapacity");
            this.f11157a = new Object[i10];
            this.f11158b = 0;
        }

        private void g(int i10) {
            Object[] objArr = this.f11157a;
            if (objArr.length < i10) {
                this.f11157a = Arrays.copyOf(objArr, b.c(objArr.length, i10));
            } else if (!this.f11159c) {
                return;
            } else {
                this.f11157a = (Object[]) objArr.clone();
            }
            this.f11159c = false;
        }

        @Override // com.google.common.collect.u.b
        public b<E> b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                g(this.f11158b + collection.size());
                if (collection instanceof u) {
                    this.f11158b = ((u) collection).d(this.f11157a, this.f11158b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a<E> d(E e10) {
            eb.o.o(e10);
            g(this.f11158b + 1);
            Object[] objArr = this.f11157a;
            int i10 = this.f11158b;
            this.f11158b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        public b<E> e(E... eArr) {
            f(eArr, eArr.length);
            return this;
        }

        final void f(Object[] objArr, int i10) {
            q0.c(objArr, i10);
            g(this.f11158b + i10);
            System.arraycopy(objArr, 0, this.f11157a, this.f11158b, i10);
            this.f11158b += i10;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b<E> {
        b() {
        }

        public static int c(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
        }

        public abstract b<E> a(E e10);

        public b<E> b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public w<E> c() {
        return isEmpty() ? w.v() : w.n(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d(Object[] objArr, int i10) {
        h1<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    public Object[] f() {
        return null;
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean l();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public abstract h1<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f11156a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        eb.o.o(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] f10 = f();
            if (f10 != null) {
                return (T[]) s0.a(f10, k(), h(), tArr);
            }
            tArr = (T[]) q0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        d(tArr, 0);
        return tArr;
    }

    Object writeReplace() {
        return new w.d(toArray());
    }
}
