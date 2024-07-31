package com.google.common.collect;

import com.google.android.gms.common.api.C5101a;
import com.google.common.collect.AbstractC5907w;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.u */
/* loaded from: classes2.dex */
public abstract class AbstractC5903u<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: a */
    private static final Object[] f12371a = new Object[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.u$a */
    /* loaded from: classes2.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a */
        Object[] f12372a;

        /* renamed from: b */
        int f12373b;

        /* renamed from: c */
        boolean f12374c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i10) {
            C5878i.m14883b(i10, "initialCapacity");
            this.f12372a = new Object[i10];
            this.f12373b = 0;
        }

        /* renamed from: g */
        private void m15055g(int i10) {
            Object[] objArr = this.f12372a;
            if (objArr.length < i10) {
                this.f12372a = Arrays.copyOf(objArr, b.m15060c(objArr.length, i10));
            } else if (!this.f12374c) {
                return;
            } else {
                this.f12372a = (Object[]) objArr.clone();
            }
            this.f12374c = false;
        }

        @Override // com.google.common.collect.AbstractC5903u.b
        /* renamed from: b */
        public b<E> mo15056b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m15055g(this.f12373b + collection.size());
                if (collection instanceof AbstractC5903u) {
                    this.f12373b = ((AbstractC5903u) collection).mo14834d(this.f12372a, this.f12373b);
                    return this;
                }
            }
            super.mo15056b(iterable);
            return this;
        }

        /* renamed from: d */
        public a<E> m15057d(E e10) {
            C7159o.m21312o(e10);
            m15055g(this.f12373b + 1);
            Object[] objArr = this.f12372a;
            int i10 = this.f12373b;
            this.f12373b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        /* renamed from: e */
        public b<E> m15058e(E... eArr) {
            m15059f(eArr, eArr.length);
            return this;
        }

        /* renamed from: f */
        final void m15059f(Object[] objArr, int i10) {
            C5896q0.m15033c(objArr, i10);
            m15055g(this.f12373b + i10);
            System.arraycopy(objArr, 0, this.f12372a, this.f12373b, i10);
            this.f12373b += i10;
        }
    }

    /* renamed from: com.google.common.collect.u$b */
    /* loaded from: classes2.dex */
    public static abstract class b<E> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public static int m15060c(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            return i12 < 0 ? C5101a.e.API_PRIORITY_OTHER : i12;
        }

        /* renamed from: a */
        public abstract b<E> mo14724a(E e10);

        /* renamed from: b */
        public b<E> mo15056b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                mo14724a(it.next());
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

    /* renamed from: c */
    public AbstractC5907w<E> mo14719c() {
        return isEmpty() ? AbstractC5907w.m15081v() : AbstractC5907w.m15075n(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int mo14834d(Object[] objArr, int i10) {
        AbstractC5877h1<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Object[] mo15052f() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo15053h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo15054k() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract boolean mo14745l();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public abstract AbstractC5877h1<E> iterator();

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
        return toArray(f12371a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C7159o.m21312o(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo15052f = mo15052f();
            if (mo15052f != null) {
                return (T[]) C5900s0.m15044a(mo15052f, mo15054k(), mo15053h(), tArr);
            }
            tArr = (T[]) C5896q0.m15034d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo14834d(tArr, 0);
        return tArr;
    }

    Object writeReplace() {
        return new AbstractC5907w.d(toArray());
    }
}
