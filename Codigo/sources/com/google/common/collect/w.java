package com.google.common.collect;

import com.google.common.collect.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class w<E> extends u<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private static final i1<Object> f11183b = new b(t0.f11153e, 0);

    /* loaded from: classes2.dex */
    public static final class a<E> extends u.a<E> {
        public a() {
            this(4);
        }

        a(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.u.b
        /* renamed from: h */
        public a<E> a(E e10) {
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            super.e(eArr);
            return this;
        }

        public a<E> j(Iterable<? extends E> iterable) {
            super.b(iterable);
            return this;
        }

        public w<E> k() {
            this.f11159c = true;
            return w.o(this.f11157a, this.f11158b);
        }
    }

    /* loaded from: classes2.dex */
    public static class b<E> extends com.google.common.collect.a<E> {

        /* renamed from: c */
        private final w<E> f11184c;

        b(w<E> wVar, int i10) {
            super(wVar.size(), i10);
            this.f11184c = wVar;
        }

        @Override // com.google.common.collect.a
        protected E a(int i10) {
            return this.f11184c.get(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class c<E> extends w<E> {

        /* renamed from: c */
        private final transient w<E> f11185c;

        c(w<E> wVar) {
            this.f11185c = wVar;
        }

        private int G(int i10) {
            return (size() - 1) - i10;
        }

        private int H(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.w
        public w<E> C() {
            return this.f11185c;
        }

        @Override // com.google.common.collect.w, java.util.List
        /* renamed from: E */
        public w<E> subList(int i10, int i11) {
            eb.o.t(i10, i11, size());
            return this.f11185c.subList(H(i11), H(i10)).C();
        }

        @Override // com.google.common.collect.w, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f11185c.contains(obj);
        }

        @Override // java.util.List
        public E get(int i10) {
            eb.o.m(i10, size());
            return this.f11185c.get(G(i10));
        }

        @Override // com.google.common.collect.w, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f11185c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return G(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.w, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.u
        public boolean l() {
            return this.f11185c.l();
        }

        @Override // com.google.common.collect.w, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f11185c.indexOf(obj);
            if (indexOf >= 0) {
                return G(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11185c.size();
        }
    }

    /* loaded from: classes2.dex */
    static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f11186a;

        public d(Object[] objArr) {
            this.f11186a = objArr;
        }

        Object readResolve() {
            return w.s(this.f11186a);
        }
    }

    /* loaded from: classes2.dex */
    public class e extends w<E> {

        /* renamed from: c */
        final transient int f11187c;

        /* renamed from: d */
        final transient int f11188d;

        e(int i10, int i11) {
            this.f11187c = i10;
            this.f11188d = i11;
        }

        @Override // com.google.common.collect.w, java.util.List
        /* renamed from: E */
        public w<E> subList(int i10, int i11) {
            eb.o.t(i10, i11, this.f11188d);
            w wVar = w.this;
            int i12 = this.f11187c;
            return wVar.subList(i10 + i12, i11 + i12);
        }

        @Override // com.google.common.collect.u
        public Object[] f() {
            return w.this.f();
        }

        @Override // java.util.List
        public E get(int i10) {
            eb.o.m(i10, this.f11188d);
            return w.this.get(i10 + this.f11187c);
        }

        @Override // com.google.common.collect.u
        public int h() {
            return w.this.k() + this.f11187c + this.f11188d;
        }

        @Override // com.google.common.collect.w, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.u
        public int k() {
            return w.this.k() + this.f11187c;
        }

        @Override // com.google.common.collect.u
        public boolean l() {
            return true;
        }

        @Override // com.google.common.collect.w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11188d;
        }
    }

    public static <E> w<E> A(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return q(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> w<E> D(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        eb.o.o(comparator);
        Object[] j10 = e0.j(iterable);
        q0.b(j10);
        Arrays.sort(j10, comparator);
        return n(j10);
    }

    public static <E> w<E> n(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    public static <E> w<E> o(Object[] objArr, int i10) {
        return i10 == 0 ? v() : new t0(objArr, i10);
    }

    public static <E> a<E> p() {
        return new a<>();
    }

    private static <E> w<E> q(Object... objArr) {
        return n(q0.b(objArr));
    }

    public static <E> w<E> r(Collection<? extends E> collection) {
        if (!(collection instanceof u)) {
            return q(collection.toArray());
        }
        w<E> c10 = ((u) collection).c();
        return c10.l() ? n(c10.toArray()) : c10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> w<E> s(E[] eArr) {
        return eArr.length == 0 ? v() : q((Object[]) eArr.clone());
    }

    public static <E> w<E> v() {
        return (w<E>) t0.f11153e;
    }

    public static <E> w<E> w(E e10) {
        return q(e10);
    }

    public static <E> w<E> x(E e10, E e11) {
        return q(e10, e11);
    }

    public static <E> w<E> y(E e10, E e11, E e12) {
        return q(e10, e11, e12);
    }

    public static <E> w<E> z(E e10, E e11, E e12, E e13, E e14) {
        return q(e10, e11, e12, e13, e14);
    }

    public w<E> C() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: E */
    public w<E> subList(int i10, int i11) {
        eb.o.t(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? v() : F(i10, i11);
    }

    w<E> F(int i10, int i11) {
        return new e(i10, i11 - i10);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.u
    @Deprecated
    public final w<E> c() {
        return this;
    }

    @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.common.collect.u
    public int d(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return h0.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return h0.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return h0.f(this, obj);
    }

    @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public h1<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t */
    public i1<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: u */
    public i1<E> listIterator(int i10) {
        eb.o.r(i10, size());
        return isEmpty() ? (i1<E>) f11183b : new b(this, i10);
    }

    @Override // com.google.common.collect.u
    Object writeReplace() {
        return new d(toArray());
    }
}
