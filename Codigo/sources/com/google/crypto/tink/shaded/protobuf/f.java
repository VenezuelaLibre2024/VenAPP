package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class f extends c<Boolean> implements a0.a, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final f f11370d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f11371b;

    /* renamed from: c, reason: collision with root package name */
    private int f11372c;

    static {
        f fVar = new f(new boolean[0], 0);
        f11370d = fVar;
        fVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        this(new boolean[10], 0);
    }

    private f(boolean[] zArr, int i10) {
        this.f11371b = zArr;
        this.f11372c = i10;
    }

    private void h(int i10, boolean z10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f11372c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        boolean[] zArr = this.f11371b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f11371b, i10, zArr2, i10 + 1, this.f11372c - i10);
            this.f11371b = zArr2;
        }
        this.f11371b[i10] = z10;
        this.f11372c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f11372c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f11372c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f11372c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11372c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f11371b;
        if (i12 > zArr.length) {
            this.f11371b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(fVar.f11371b, 0, this.f11371b, this.f11372c, fVar.f11372c);
        this.f11372c = i12;
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
        h(i10, bool.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f11372c != fVar.f11372c) {
            return false;
        }
        boolean[] zArr = fVar.f11371b;
        for (int i10 = 0; i10 < this.f11372c; i10++) {
            if (this.f11371b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11372c; i11++) {
            i10 = (i10 * 31) + a0.c(this.f11371b[i11]);
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
            if (this.f11371b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public void k(boolean z10) {
        c();
        int i10 = this.f11372c;
        boolean[] zArr = this.f11371b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f11371b = zArr2;
        }
        boolean[] zArr3 = this.f11371b;
        int i11 = this.f11372c;
        this.f11372c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(n(i10));
    }

    public boolean n(int i10) {
        l(i10);
        return this.f11371b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0.a a(int i10) {
        if (i10 >= this.f11372c) {
            return new f(Arrays.copyOf(this.f11371b, i10), this.f11372c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        c();
        l(i10);
        boolean[] zArr = this.f11371b;
        boolean z10 = zArr[i10];
        if (i10 < this.f11372c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f11372c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(s(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f11371b;
        System.arraycopy(zArr, i11, zArr, i10, this.f11372c - i11);
        this.f11372c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public boolean s(int i10, boolean z10) {
        c();
        l(i10);
        boolean[] zArr = this.f11371b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11372c;
    }
}
