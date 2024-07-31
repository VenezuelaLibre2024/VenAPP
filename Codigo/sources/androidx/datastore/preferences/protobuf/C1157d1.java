package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.datastore.preferences.protobuf.d1 */
/* loaded from: classes.dex */
public final class C1157d1<E> extends AbstractC1152c<E> implements RandomAccess {

    /* renamed from: d */
    private static final C1157d1<Object> f4805d;

    /* renamed from: b */
    private E[] f4806b;

    /* renamed from: c */
    private int f4807c;

    static {
        C1157d1<Object> c1157d1 = new C1157d1<>(new Object[0], 0);
        f4805d = c1157d1;
        c1157d1.mo5657b();
    }

    private C1157d1(E[] eArr, int i10) {
        this.f4806b = eArr;
        this.f4807c = i10;
    }

    /* renamed from: d */
    private static <E> E[] m5688d(int i10) {
        return (E[]) new Object[i10];
    }

    /* renamed from: f */
    public static <E> C1157d1<E> m5689f() {
        return (C1157d1<E>) f4805d;
    }

    /* renamed from: h */
    private void m5690h(int i10) {
        if (i10 < 0 || i10 >= this.f4807c) {
            throw new IndexOutOfBoundsException(m5691k(i10));
        }
    }

    /* renamed from: k */
    private String m5691k(int i10) {
        return "Index:" + i10 + ", Size:" + this.f4807c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        m5675c();
        if (i10 < 0 || i10 > (i11 = this.f4807c)) {
            throw new IndexOutOfBoundsException(m5691k(i10));
        }
        E[] eArr = this.f4806b;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) m5688d(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f4806b, 0, eArr2, 0, i10);
            System.arraycopy(this.f4806b, i10, eArr2, i10 + 1, this.f4807c - i10);
            this.f4806b = eArr2;
        }
        this.f4806b[i10] = e10;
        this.f4807c++;
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m5675c();
        int i10 = this.f4807c;
        E[] eArr = this.f4806b;
        if (i10 == eArr.length) {
            this.f4806b = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4806b;
        int i11 = this.f4807c;
        this.f4807c = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        m5690h(i10);
        return this.f4806b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C1147a0.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C1157d1<E> mo5656a(int i10) {
        if (i10 >= this.f4807c) {
            return new C1157d1<>(Arrays.copyOf(this.f4806b, i10), this.f4807c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        m5675c();
        m5690h(i10);
        E[] eArr = this.f4806b;
        E e10 = eArr[i10];
        if (i10 < this.f4807c - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f4807c--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m5675c();
        m5690h(i10);
        E[] eArr = this.f4806b;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4807c;
    }
}
