package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.d1 */
/* loaded from: classes2.dex */
public final class C5960d1<E> extends AbstractC5955c<E> implements RandomAccess {

    /* renamed from: d */
    private static final C5960d1<Object> f12568d;

    /* renamed from: b */
    private E[] f12569b;

    /* renamed from: c */
    private int f12570c;

    static {
        C5960d1<Object> c5960d1 = new C5960d1<>(new Object[0], 0);
        f12568d = c5960d1;
        c5960d1.mo15316b();
    }

    private C5960d1(E[] eArr, int i10) {
        this.f12569b = eArr;
        this.f12570c = i10;
    }

    /* renamed from: d */
    private static <E> E[] m15348d(int i10) {
        return (E[]) new Object[i10];
    }

    /* renamed from: f */
    public static <E> C5960d1<E> m15349f() {
        return (C5960d1<E>) f12568d;
    }

    /* renamed from: h */
    private void m15350h(int i10) {
        if (i10 < 0 || i10 >= this.f12570c) {
            throw new IndexOutOfBoundsException(m15351k(i10));
        }
    }

    /* renamed from: k */
    private String m15351k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12570c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        m15336c();
        if (i10 < 0 || i10 > (i11 = this.f12570c)) {
            throw new IndexOutOfBoundsException(m15351k(i10));
        }
        E[] eArr = this.f12569b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) m15348d(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f12569b, 0, eArr2, 0, i10);
            System.arraycopy(this.f12569b, i10, eArr2, i10 + 1, this.f12570c - i10);
            this.f12569b = eArr2;
        }
        this.f12569b[i10] = e10;
        this.f12570c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m15336c();
        int i10 = this.f12570c;
        E[] eArr = this.f12569b;
        if (i10 == eArr.length) {
            this.f12569b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f12569b;
        int i11 = this.f12570c;
        this.f12570c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        m15350h(i10);
        return this.f12569b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C5960d1<E> mo15315a(int i10) {
        if (i10 >= this.f12570c) {
            return new C5960d1<>(Arrays.copyOf(this.f12569b, i10), this.f12570c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    public E remove(int i10) {
        m15336c();
        m15350h(i10);
        E[] eArr = this.f12569b;
        E e10 = eArr[i10];
        if (i10 < this.f12570c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f12570c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m15336c();
        m15350h(i10);
        E[] eArr = this.f12569b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12570c;
    }
}
