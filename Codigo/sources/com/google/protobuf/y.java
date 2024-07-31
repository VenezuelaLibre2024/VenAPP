package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y extends c<Integer> implements z.g, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final y f13393d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f13394b;

    /* renamed from: c, reason: collision with root package name */
    private int f13395c;

    static {
        y yVar = new y(new int[0], 0);
        f13393d = yVar;
        yVar.b();
    }

    y() {
        this(new int[10], 0);
    }

    private y(int[] iArr, int i10) {
        this.f13394b = iArr;
        this.f13395c = i10;
    }

    private void h(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f13395c)) {
            throw new IndexOutOfBoundsException(n(i10));
        }
        int[] iArr = this.f13394b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f13394b, i10, iArr2, i10 + 1, this.f13395c - i10);
            this.f13394b = iArr2;
        }
        this.f13394b[i10] = i11;
        this.f13395c++;
        ((AbstractList) this).modCount++;
    }

    public static y k() {
        return f13393d;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f13395c) {
            throw new IndexOutOfBoundsException(n(i10));
        }
    }

    private String n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f13395c;
    }

    @Override // com.google.protobuf.z.g
    public void F0(int i10) {
        c();
        int i11 = this.f13395c;
        int[] iArr = this.f13394b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f13394b = iArr2;
        }
        int[] iArr3 = this.f13394b;
        int i12 = this.f13395c;
        this.f13395c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public z.i<Integer> a2(int i10) {
        if (i10 >= this.f13395c) {
            return new y(Arrays.copyOf(this.f13394b, i10), this.f13395c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        z.a(collection);
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int i10 = yVar.f13395c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f13395c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f13394b;
        if (i12 > iArr.length) {
            this.f13394b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(yVar.f13394b, 0, this.f13394b, this.f13395c, yVar.f13395c);
        this.f13395c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        h(i10, num.intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f13395c != yVar.f13395c) {
            return false;
        }
        int[] iArr = yVar.f13394b;
        for (int i10 = 0; i10 < this.f13395c; i10++) {
            if (this.f13394b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        F0(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.z.g
    public int getInt(int i10) {
        l(i10);
        return this.f13394b[i10];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f13395c; i11++) {
            i10 = (i10 * 31) + this.f13394b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f13394b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        c();
        l(i10);
        int[] iArr = this.f13394b;
        int i11 = iArr[i10];
        if (i10 < this.f13395c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f13395c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(q(i10, num.intValue()));
    }

    public int q(int i10, int i11) {
        c();
        l(i10);
        int[] iArr = this.f13394b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f13394b;
        System.arraycopy(iArr, i11, iArr, i10, this.f13395c - i11);
        this.f13395c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13395c;
    }
}
