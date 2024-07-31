package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.protobuf.C6633z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.e */
/* loaded from: classes2.dex */
final class C6574e extends AbstractC6568c<Boolean> implements C6633z.a, RandomAccess, InterfaceC6564a1 {

    /* renamed from: d */
    private static final C6574e f14444d;

    /* renamed from: b */
    private boolean[] f14445b;

    /* renamed from: c */
    private int f14446c;

    static {
        C6574e c6574e = new C6574e(new boolean[0], 0);
        f14444d = c6574e;
        c6574e.mo18411b();
    }

    C6574e() {
        this(new boolean[10], 0);
    }

    private C6574e(boolean[] zArr, int i10) {
        this.f14445b = zArr;
        this.f14446c = i10;
    }

    /* renamed from: h */
    private void m18432h(int i10, boolean z10) {
        int i11;
        m18412c();
        if (i10 < 0 || i10 > (i11 = this.f14446c)) {
            throw new IndexOutOfBoundsException(m18434o(i10));
        }
        boolean[] zArr = this.f14445b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f14445b, i10, zArr2, i10 + 1, this.f14446c - i10);
            this.f14445b = zArr2;
        }
        this.f14445b[i10] = z10;
        this.f14446c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m18433l(int i10) {
        if (i10 < 0 || i10 >= this.f14446c) {
            throw new IndexOutOfBoundsException(m18434o(i10));
        }
    }

    /* renamed from: o */
    private String m18434o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f14446c;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m18412c();
        C6633z.m19347a(collection);
        if (!(collection instanceof C6574e)) {
            return super.addAll(collection);
        }
        C6574e c6574e = (C6574e) collection;
        int i10 = c6574e.f14446c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14446c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f14445b;
        if (i12 > zArr.length) {
            this.f14445b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c6574e.f14445b, 0, this.f14445b, this.f14446c, c6574e.f14446c);
        this.f14446c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        m18432h(i10, bool.booleanValue());
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6574e)) {
            return super.equals(obj);
        }
        C6574e c6574e = (C6574e) obj;
        if (this.f14446c != c6574e.f14446c) {
            return false;
        }
        boolean[] zArr = c6574e.f14445b;
        for (int i10 = 0; i10 < this.f14446c; i10++) {
            if (this.f14445b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m18437k(bool.booleanValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14446c; i11++) {
            i10 = (i10 * 31) + C6633z.m19349c(this.f14445b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f14445b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void m18437k(boolean z10) {
        m18412c();
        int i10 = this.f14446c;
        boolean[] zArr = this.f14445b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f14445b = zArr2;
        }
        boolean[] zArr3 = this.f14445b;
        int i11 = this.f14446c;
        this.f14446c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(m18439n(i10));
    }

    /* renamed from: n */
    public boolean m18439n(int i10) {
        m18433l(i10);
        return this.f14445b[i10];
    }

    @Override // com.google.protobuf.C6633z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C6633z.a mo18430a(int i10) {
        if (i10 >= this.f14446c) {
            return new C6574e(Arrays.copyOf(this.f14445b, i10), this.f14446c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        m18412c();
        m18433l(i10);
        boolean[] zArr = this.f14445b;
        boolean z10 = zArr[i10];
        if (i10 < this.f14446c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f14446c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(m18443s(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m18412c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f14445b;
        System.arraycopy(zArr, i11, zArr, i10, this.f14446c - i11);
        this.f14446c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public boolean m18443s(int i10, boolean z10) {
        m18412c();
        m18433l(i10);
        boolean[] zArr = this.f14445b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14446c;
    }
}
