package com.google.common.collect;

import com.google.common.collect.AbstractC5903u;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5855a0<E> extends AbstractC5903u<E> implements Set<E> {

    /* renamed from: b */
    private transient AbstractC5907w<E> f12247b;

    /* renamed from: com.google.common.collect.a0$a */
    /* loaded from: classes2.dex */
    public static class a<E> extends AbstractC5903u.a<E> {

        /* renamed from: d */
        Object[] f12248d;

        /* renamed from: e */
        private int f12249e;

        public a() {
            super(4);
        }

        /* renamed from: j */
        private void m14723j(E e10) {
            Objects.requireNonNull(this.f12248d);
            int length = this.f12248d.length - 1;
            int hashCode = e10.hashCode();
            int m15050b = C5901t.m15050b(hashCode);
            while (true) {
                int i10 = m15050b & length;
                Object[] objArr = this.f12248d;
                Object obj = objArr[i10];
                if (obj == null) {
                    objArr[i10] = e10;
                    this.f12249e += hashCode;
                    super.m15057d(e10);
                    return;
                } else if (obj.equals(e10)) {
                    return;
                } else {
                    m15050b = i10 + 1;
                }
            }
        }

        @Override // com.google.common.collect.AbstractC5903u.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> mo14724a(E e10) {
            C7159o.m21312o(e10);
            if (this.f12248d != null && AbstractC5855a0.m14710p(this.f12373b) <= this.f12248d.length) {
                m14723j(e10);
                return this;
            }
            this.f12248d = null;
            super.m15057d(e10);
            return this;
        }

        /* renamed from: i */
        public a<E> m14726i(E... eArr) {
            if (this.f12248d != null) {
                for (E e10 : eArr) {
                    mo14724a(e10);
                }
            } else {
                super.m15058e(eArr);
            }
            return this;
        }

        /* renamed from: k */
        public AbstractC5855a0<E> mo14727k() {
            AbstractC5855a0<E> m14711q;
            int i10 = this.f12373b;
            if (i10 == 0) {
                return AbstractC5855a0.m14714v();
            }
            if (i10 == 1) {
                Object obj = this.f12372a[0];
                Objects.requireNonNull(obj);
                return AbstractC5855a0.m14715w(obj);
            }
            if (this.f12248d == null || AbstractC5855a0.m14710p(i10) != this.f12248d.length) {
                m14711q = AbstractC5855a0.m14711q(this.f12373b, this.f12372a);
                this.f12373b = m14711q.size();
            } else {
                Object[] copyOf = AbstractC5855a0.m14707C(this.f12373b, this.f12372a.length) ? Arrays.copyOf(this.f12372a, this.f12373b) : this.f12372a;
                m14711q = new C5906v0<>(copyOf, this.f12249e, this.f12248d, r5.length - 1, this.f12373b);
            }
            this.f12374c = true;
            this.f12248d = null;
            return m14711q;
        }
    }

    /* renamed from: com.google.common.collect.a0$b */
    /* loaded from: classes2.dex */
    private static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f12250a;

        b(Object[] objArr) {
            this.f12250a = objArr;
        }

        Object readResolve() {
            return AbstractC5855a0.m14713s(this.f12250a);
        }
    }

    @SafeVarargs
    /* renamed from: A */
    public static <E> AbstractC5855a0<E> m14706A(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        C7159o.m21302e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m14711q(length, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static boolean m14707C(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m14710p(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            C7159o.m21302e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static <E> AbstractC5855a0<E> m14711q(int i10, Object... objArr) {
        if (i10 == 0) {
            return m14714v();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m14715w(obj);
        }
        int m14710p = m14710p(i10);
        Object[] objArr2 = new Object[m14710p];
        int i11 = m14710p - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object m15031a = C5896q0.m15031a(objArr[i14], i14);
            int hashCode = m15031a.hashCode();
            int m15050b = C5901t.m15050b(hashCode);
            while (true) {
                int i15 = m15050b & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = m15031a;
                    objArr2[i15] = m15031a;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(m15031a)) {
                    break;
                }
                m15050b++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C5865d1(obj3);
        }
        if (m14710p(i13) < m14710p / 2) {
            return m14711q(i13, objArr);
        }
        if (m14707C(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C5906v0(objArr, i12, objArr2, i11, i13);
    }

    /* renamed from: r */
    public static <E> AbstractC5855a0<E> m14712r(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC5855a0) && !(collection instanceof SortedSet)) {
            AbstractC5855a0<E> abstractC5855a0 = (AbstractC5855a0) collection;
            if (!abstractC5855a0.mo14745l()) {
                return abstractC5855a0;
            }
        }
        Object[] array = collection.toArray();
        return m14711q(array.length, array);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    public static <E> AbstractC5855a0<E> m14713s(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? m14711q(eArr.length, (Object[]) eArr.clone()) : m14715w(eArr[0]) : m14714v();
    }

    /* renamed from: v */
    public static <E> AbstractC5855a0<E> m14714v() {
        return C5906v0.f12392t;
    }

    /* renamed from: w */
    public static <E> AbstractC5855a0<E> m14715w(E e10) {
        return new C5865d1(e10);
    }

    /* renamed from: x */
    public static <E> AbstractC5855a0<E> m14716x(E e10, E e11) {
        return m14711q(2, e10, e11);
    }

    /* renamed from: y */
    public static <E> AbstractC5855a0<E> m14717y(E e10, E e11, E e12) {
        return m14711q(3, e10, e11, e12);
    }

    /* renamed from: z */
    public static <E> AbstractC5855a0<E> m14718z(E e10, E e11, E e12, E e13, E e14) {
        return m14711q(5, e10, e11, e12, e13, e14);
    }

    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: c */
    public AbstractC5907w<E> mo14719c() {
        AbstractC5907w<E> abstractC5907w = this.f12247b;
        if (abstractC5907w != null) {
            return abstractC5907w;
        }
        AbstractC5907w<E> mo14721t = mo14721t();
        this.f12247b = mo14721t;
        return mo14721t;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC5855a0) && mo14722u() && ((AbstractC5855a0) obj).mo14722u() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C5862c1.m14771a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C5862c1.m14774d(this);
    }

    @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC5877h1<E> iterator();

    /* renamed from: t */
    AbstractC5907w<E> mo14721t() {
        return AbstractC5907w.m15075n(toArray());
    }

    /* renamed from: u */
    boolean mo14722u() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC5903u
    Object writeReplace() {
        return new b(toArray());
    }
}
