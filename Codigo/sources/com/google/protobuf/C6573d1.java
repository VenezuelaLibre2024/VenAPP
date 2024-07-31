package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.d1 */
/* loaded from: classes2.dex */
public final class C6573d1<E> extends AbstractC6568c<E> implements RandomAccess {

    /* renamed from: d */
    private static final C6573d1<Object> f14441d;

    /* renamed from: b */
    private E[] f14442b;

    /* renamed from: c */
    private int f14443c;

    static {
        C6573d1<Object> c6573d1 = new C6573d1<>(new Object[0], 0);
        f14441d = c6573d1;
        c6573d1.mo18411b();
    }

    private C6573d1(E[] eArr, int i10) {
        this.f14442b = eArr;
        this.f14443c = i10;
    }

    /* renamed from: d */
    private static <E> E[] m18426d(int i10) {
        return (E[]) new Object[i10];
    }

    /* renamed from: f */
    public static <E> C6573d1<E> m18427f() {
        return (C6573d1<E>) f14441d;
    }

    /* renamed from: h */
    private void m18428h(int i10) {
        if (i10 < 0 || i10 >= this.f14443c) {
            throw new IndexOutOfBoundsException(m18429k(i10));
        }
    }

    /* renamed from: k */
    private String m18429k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f14443c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        m18412c();
        if (i10 < 0 || i10 > (i11 = this.f14443c)) {
            throw new IndexOutOfBoundsException(m18429k(i10));
        }
        E[] eArr = this.f14442b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) m18426d(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f14442b, 0, eArr2, 0, i10);
            System.arraycopy(this.f14442b, i10, eArr2, i10 + 1, this.f14443c - i10);
            this.f14442b = eArr2;
        }
        this.f14442b[i10] = e10;
        this.f14443c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m18412c();
        int i10 = this.f14443c;
        E[] eArr = this.f14442b;
        if (i10 == eArr.length) {
            this.f14442b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f14442b;
        int i11 = this.f14443c;
        this.f14443c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        m18428h(i10);
        return this.f14442b[i10];
    }

    @Override // com.google.protobuf.C6633z.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C6573d1<E> mo18430a(int i10) {
        if (i10 >= this.f14443c) {
            return new C6573d1<>(Arrays.copyOf(this.f14442b, i10), this.f14443c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        m18412c();
        m18428h(i10);
        E[] eArr = this.f14442b;
        E e10 = eArr[i10];
        if (i10 < this.f14443c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f14443c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m18412c();
        m18428h(i10);
        E[] eArr = this.f14442b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14443c;
    }
}
