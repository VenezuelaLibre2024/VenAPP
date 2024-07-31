package com.google.common.collect;

import com.google.common.collect.AbstractC5903u;
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
import p082eb.C7159o;

/* renamed from: com.google.common.collect.w */
/* loaded from: classes2.dex */
public abstract class AbstractC5907w<E> extends AbstractC5903u<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    private static final AbstractC5880i1<Object> f12398b = new b(C5902t0.f12368e, 0);

    /* renamed from: com.google.common.collect.w$a */
    /* loaded from: classes2.dex */
    public static final class a<E> extends AbstractC5903u.a<E> {
        public a() {
            this(4);
        }

        a(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.AbstractC5903u.b
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<E> mo14724a(E e10) {
            super.m15057d(e10);
            return this;
        }

        /* renamed from: i */
        public a<E> m15092i(E... eArr) {
            super.m15058e(eArr);
            return this;
        }

        /* renamed from: j */
        public a<E> m15093j(Iterable<? extends E> iterable) {
            super.mo15056b(iterable);
            return this;
        }

        /* renamed from: k */
        public AbstractC5907w<E> m15094k() {
            this.f12374c = true;
            return AbstractC5907w.m15076o(this.f12372a, this.f12373b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.w$b */
    /* loaded from: classes2.dex */
    public static class b<E> extends AbstractC5854a<E> {

        /* renamed from: c */
        private final AbstractC5907w<E> f12399c;

        b(AbstractC5907w<E> abstractC5907w, int i10) {
            super(abstractC5907w.size(), i10);
            this.f12399c = abstractC5907w;
        }

        @Override // com.google.common.collect.AbstractC5854a
        /* renamed from: a */
        protected E mo14705a(int i10) {
            return this.f12399c.get(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.collect.w$c */
    /* loaded from: classes2.dex */
    public static class c<E> extends AbstractC5907w<E> {

        /* renamed from: c */
        private final transient AbstractC5907w<E> f12400c;

        c(AbstractC5907w<E> abstractC5907w) {
            this.f12400c = abstractC5907w;
        }

        /* renamed from: G */
        private int m15095G(int i10) {
            return (size() - 1) - i10;
        }

        /* renamed from: H */
        private int m15096H(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.AbstractC5907w
        /* renamed from: C */
        public AbstractC5907w<E> mo15086C() {
            return this.f12400c;
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public AbstractC5907w<E> subList(int i10, int i11) {
            C7159o.m21317t(i10, i11, size());
            return this.f12400c.subList(m15096H(i11), m15096H(i10)).mo15086C();
        }

        @Override // com.google.common.collect.AbstractC5907w, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f12400c.contains(obj);
        }

        @Override // java.util.List
        public E get(int i10) {
            C7159o.m21310m(i10, size());
            return this.f12400c.get(m15095G(i10));
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f12400c.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m15095G(lastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC5907w, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: l */
        public boolean mo14745l() {
            return this.f12400c.mo14745l();
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f12400c.indexOf(obj);
            if (indexOf >= 0) {
                return m15095G(indexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12400c.size();
        }
    }

    /* renamed from: com.google.common.collect.w$d */
    /* loaded from: classes2.dex */
    static class d implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final Object[] f12401a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(Object[] objArr) {
            this.f12401a = objArr;
        }

        Object readResolve() {
            return AbstractC5907w.m15080s(this.f12401a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.common.collect.w$e */
    /* loaded from: classes2.dex */
    public class e extends AbstractC5907w<E> {

        /* renamed from: c */
        final transient int f12402c;

        /* renamed from: d */
        final transient int f12403d;

        e(int i10, int i11) {
            this.f12402c = i10;
            this.f12403d = i11;
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        /* renamed from: E */
        public AbstractC5907w<E> subList(int i10, int i11) {
            C7159o.m21317t(i10, i11, this.f12403d);
            AbstractC5907w abstractC5907w = AbstractC5907w.this;
            int i12 = this.f12402c;
            return abstractC5907w.subList(i10 + i12, i11 + i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: f */
        public Object[] mo15052f() {
            return AbstractC5907w.this.mo15052f();
        }

        @Override // java.util.List
        public E get(int i10) {
            C7159o.m21310m(i10, this.f12403d);
            return AbstractC5907w.this.get(i10 + this.f12402c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: h */
        public int mo15053h() {
            return AbstractC5907w.this.mo15054k() + this.f12402c + this.f12403d;
        }

        @Override // com.google.common.collect.AbstractC5907w, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: k */
        public int mo15054k() {
            return AbstractC5907w.this.mo15054k() + this.f12402c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractC5903u
        /* renamed from: l */
        public boolean mo14745l() {
            return true;
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.AbstractC5907w, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f12403d;
        }
    }

    /* renamed from: A */
    public static <E> AbstractC5907w<E> m15073A(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return m15078q(e10, e11, e12, e13, e14, e15, e16);
    }

    /* renamed from: D */
    public static <E> AbstractC5907w<E> m15074D(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C7159o.m21312o(comparator);
        Object[] m14844j = C5867e0.m14844j(iterable);
        C5896q0.m15032b(m14844j);
        Arrays.sort(m14844j, comparator);
        return m15075n(m14844j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public static <E> AbstractC5907w<E> m15075n(Object[] objArr) {
        return m15076o(objArr, objArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static <E> AbstractC5907w<E> m15076o(Object[] objArr, int i10) {
        return i10 == 0 ? m15081v() : new C5902t0(objArr, i10);
    }

    /* renamed from: p */
    public static <E> a<E> m15077p() {
        return new a<>();
    }

    /* renamed from: q */
    private static <E> AbstractC5907w<E> m15078q(Object... objArr) {
        return m15075n(C5896q0.m15032b(objArr));
    }

    /* renamed from: r */
    public static <E> AbstractC5907w<E> m15079r(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC5903u)) {
            return m15078q(collection.toArray());
        }
        AbstractC5907w<E> mo14719c = ((AbstractC5903u) collection).mo14719c();
        return mo14719c.mo14745l() ? m15075n(mo14719c.toArray()) : mo14719c;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: s */
    public static <E> AbstractC5907w<E> m15080s(E[] eArr) {
        return eArr.length == 0 ? m15081v() : m15078q((Object[]) eArr.clone());
    }

    /* renamed from: v */
    public static <E> AbstractC5907w<E> m15081v() {
        return (AbstractC5907w<E>) C5902t0.f12368e;
    }

    /* renamed from: w */
    public static <E> AbstractC5907w<E> m15082w(E e10) {
        return m15078q(e10);
    }

    /* renamed from: x */
    public static <E> AbstractC5907w<E> m15083x(E e10, E e11) {
        return m15078q(e10, e11);
    }

    /* renamed from: y */
    public static <E> AbstractC5907w<E> m15084y(E e10, E e11, E e12) {
        return m15078q(e10, e11, e12);
    }

    /* renamed from: z */
    public static <E> AbstractC5907w<E> m15085z(E e10, E e11, E e12, E e13, E e14) {
        return m15078q(e10, e11, e12, e13, e14);
    }

    /* renamed from: C */
    public AbstractC5907w<E> mo15086C() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: E */
    public AbstractC5907w<E> subList(int i10, int i11) {
        C7159o.m21317t(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? m15081v() : m15088F(i10, i11);
    }

    /* renamed from: F */
    AbstractC5907w<E> m15088F(int i10, int i11) {
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

    @Override // com.google.common.collect.AbstractC5903u
    @Deprecated
    /* renamed from: c */
    public final AbstractC5907w<E> mo14719c() {
        return this;
    }

    @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: d */
    public int mo14834d(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return C5876h0.m14874c(this, obj);
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
        return C5876h0.m14875d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C5876h0.m14877f(this, obj);
    }

    @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public AbstractC5877h1<E> iterator() {
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
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC5880i1<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public AbstractC5880i1<E> listIterator(int i10) {
        C7159o.m21315r(i10, size());
        return isEmpty() ? (AbstractC5880i1<E>) f12398b : new b(this, i10);
    }

    @Override // com.google.common.collect.AbstractC5903u
    Object writeReplace() {
        return new d(toArray());
    }
}
