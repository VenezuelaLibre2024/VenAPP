package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z extends c<Integer> implements a0.g, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final z f11573d;

    /* renamed from: b, reason: collision with root package name */
    private int[] f11574b;

    /* renamed from: c, reason: collision with root package name */
    private int f11575c;

    static {
        z zVar = new z(new int[0], 0);
        f11573d = zVar;
        zVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z() {
        this(new int[10], 0);
    }

    private z(int[] iArr, int i10) {
        this.f11574b = iArr;
        this.f11575c = i10;
    }

    private void h(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f11575c)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int[] iArr = this.f11574b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f11574b, i10, iArr2, i10 + 1, this.f11575c - i10);
            this.f11574b = iArr2;
        }
        this.f11574b[i10] = i11;
        this.f11575c++;
        ((AbstractList) this).modCount++;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f11575c) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f11575c;
    }

    public void F0(int i10) {
        c();
        int i11 = this.f11575c;
        int[] iArr = this.f11574b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f11574b = iArr2;
        }
        int[] iArr3 = this.f11574b;
        int i12 = this.f11575c;
        this.f11575c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i10 = zVar.f11575c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11575c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f11574b;
        if (i12 > iArr.length) {
            this.f11574b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(zVar.f11574b, 0, this.f11574b, this.f11575c, zVar.f11575c);
        this.f11575c = i12;
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

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f11575c != zVar.f11575c) {
            return false;
        }
        int[] iArr = zVar.f11574b;
        for (int i10 = 0; i10 < this.f11575c; i10++) {
            if (this.f11574b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        F0(num.intValue());
        return true;
    }

    public int getInt(int i10) {
        k(i10);
        return this.f11574b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11575c; i11++) {
            i10 = (i10 * 31) + this.f11574b[i11];
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
            if (this.f11574b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a0.g a(int i10) {
        if (i10 >= this.f11575c) {
            return new z(Arrays.copyOf(this.f11574b, i10), this.f11575c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        c();
        k(i10);
        int[] iArr = this.f11574b;
        int i11 = iArr[i10];
        if (i10 < this.f11575c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f11575c--;
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
        k(i10);
        int[] iArr = this.f11574b;
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
        int[] iArr = this.f11574b;
        System.arraycopy(iArr, i11, iArr, i10, this.f11575c - i11);
        this.f11575c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11575c;
    }
}
