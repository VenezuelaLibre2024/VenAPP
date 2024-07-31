package com.google.common.collect;

import com.google.common.collect.u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes2.dex */
public abstract class a0<E> extends u<E> implements Set<E> {

    /* renamed from: b */
    private transient w<E> f11032b;

    /* loaded from: classes2.dex */
    public static class a<E> extends u.a<E> {

        /* renamed from: d */
        Object[] f11033d;

        /* renamed from: e */
        private int f11034e;

        public a() {
            super(4);
        }

        private void j(E e10) {
            Objects.requireNonNull(this.f11033d);
            int length = this.f11033d.length - 1;
            int hashCode = e10.hashCode();
            int b10 = t.b(hashCode);
            while (true) {
                int i10 = b10 & length;
                Object[] objArr = this.f11033d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f11034e += hashCode;
                    super.d(e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    b10 = i10 + 1;
                }
            }
        }

        @Override // com.google.common.collect.u.b
        /* renamed from: h */
        public a<E> a(E e10) {
            eb.o.o(e10);
            if (this.f11033d != null && a0.p(this.f11158b) <= this.f11033d.length) {
                j(e10);
                return this;
            }
            this.f11033d = null;
            super.d(e10);
            return this;
        }

        public a<E> i(E... eArr) {
            if (this.f11033d != null) {
                for (E e10 : eArr) {
                    a(e10);
                }
            } else {
                super.e(eArr);
            }
            return this;
        }

        public a0<E> k() {
            a0<E> q10;
            int i10 = this.f11158b;
            if (i10 == 0) {
                return a0.v();
            }
            if (i10 == 1) {
                Object obj = this.f11157a[0];
                Objects.requireNonNull(obj);
                return a0.w(obj);
            }
            if (this.f11033d == null || a0.p(i10) != this.f11033d.length) {
                q10 = a0.q(this.f11158b, this.f11157a);
                this.f11158b = q10.size();
            } else {
                Object[] copyOf = a0.C(this.f11158b, this.f11157a.length) ? Arrays.copyOf(this.f11157a, this.f11158b) : this.f11157a;
                q10 = new v0<>(copyOf, this.f11034e, this.f11033d, r5.length - 1, this.f11158b);
            }
            this.f11159c = true;
            this.f11033d = null;
            return q10;
        }
    }

    /* loaded from: classes2.dex */
    private static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f11035a;

        b(Object[] objArr) {
            this.f11035a = objArr;
        }

        Object readResolve() {
            return a0.s(this.f11035a);
        }
    }

    @SafeVarargs
    public static <E> a0<E> A(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        eb.o.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return q(length, objArr);
    }

    public static boolean C(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static int p(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            eb.o.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static <E> a0<E> q(int i10, Object... objArr) {
        if (i10 == 0) {
            return v();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return w(obj);
        }
        int p10 = p(i10);
        Object[] objArr2 = new Object[p10];
        int i11 = p10 - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object a10 = q0.a(objArr[i14], i14);
            int hashCode = a10.hashCode();
            int b10 = t.b(hashCode);
            while (true) {
                int i15 = b10 & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = a10;
                    objArr2[i15] = a10;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(a10)) {
                    break;
                }
                b10++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new d1(obj3);
        }
        if (p(i13) < p10 / 2) {
            return q(i13, objArr);
        }
        if (C(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new v0(objArr, i12, objArr2, i11, i13);
    }

    public static <E> a0<E> r(Collection<? extends E> collection) {
        if ((collection instanceof a0) && !(collection instanceof SortedSet)) {
            a0<E> a0Var = (a0) collection;
            if (!a0Var.l()) {
                return a0Var;
            }
        }
        Object[] array = collection.toArray();
        return q(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E> a0<E> s(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? q(eArr.length, (Object[]) eArr.clone()) : w(eArr[0]) : v();
    }

    public static <E> a0<E> v() {
        return v0.f11177t;
    }

    public static <E> a0<E> w(E e10) {
        return new d1(e10);
    }

    public static <E> a0<E> x(E e10, E e11) {
        return q(2, e10, e11);
    }

    public static <E> a0<E> y(E e10, E e11, E e12) {
        return q(3, e10, e11, e12);
    }

    public static <E> a0<E> z(E e10, E e11, E e12, E e13, E e14) {
        return q(5, e10, e11, e12, e13, e14);
    }

    @Override // com.google.common.collect.u
    public w<E> c() {
        w<E> wVar = this.f11032b;
        if (wVar != null) {
            return wVar;
        }
        w<E> t10 = t();
        this.f11032b = t10;
        return t10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a0) && u() && ((a0) obj).u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return c1.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c1.d(this);
    }

    @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public abstract h1<E> iterator();

    w<E> t() {
        return w.n(toArray());
    }

    boolean u() {
        return false;
    }

    @Override // com.google.common.collect.u
    Object writeReplace() {
        return new b(toArray());
    }
}
