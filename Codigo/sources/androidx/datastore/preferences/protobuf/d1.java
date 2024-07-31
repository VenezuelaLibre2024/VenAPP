package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1<E> extends c<E> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final d1<Object> f4094d;

    /* renamed from: b, reason: collision with root package name */
    private E[] f4095b;

    /* renamed from: c, reason: collision with root package name */
    private int f4096c;

    static {
        d1<Object> d1Var = new d1<>(new Object[0], 0);
        f4094d = d1Var;
        d1Var.b();
    }

    private d1(E[] eArr, int i10) {
        this.f4095b = eArr;
        this.f4096c = i10;
    }

    private static <E> E[] d(int i10) {
        return (E[]) new Object[i10];
    }

    public static <E> d1<E> f() {
        return (d1<E>) f4094d;
    }

    private void h(int i10) {
        if (i10 < 0 || i10 >= this.f4096c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private String k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f4096c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f4096c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        E[] eArr = this.f4095b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) d(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f4095b, 0, eArr2, 0, i10);
            System.arraycopy(this.f4095b, i10, eArr2, i10 + 1, this.f4096c - i10);
            this.f4095b = eArr2;
        }
        this.f4095b[i10] = e10;
        this.f4096c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        c();
        int i10 = this.f4096c;
        E[] eArr = this.f4095b;
        if (i10 == eArr.length) {
            this.f4095b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4095b;
        int i11 = this.f4096c;
        this.f4096c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        h(i10);
        return this.f4095b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.a0.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d1<E> a(int i10) {
        if (i10 >= this.f4096c) {
            return new d1<>(Arrays.copyOf(this.f4095b, i10), this.f4096c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        c();
        h(i10);
        E[] eArr = this.f4095b;
        E e10 = eArr[i10];
        if (i10 < this.f4096c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f4096c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        c();
        h(i10);
        E[] eArr = this.f4095b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4096c;
    }
}
