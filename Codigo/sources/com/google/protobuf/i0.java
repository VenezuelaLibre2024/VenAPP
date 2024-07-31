package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class i0 extends c<Long> implements z.h, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final i0 f13228d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f13229b;

    /* renamed from: c, reason: collision with root package name */
    private int f13230c;

    static {
        i0 i0Var = new i0(new long[0], 0);
        f13228d = i0Var;
        i0Var.b();
    }

    i0() {
        this(new long[10], 0);
    }

    private i0(long[] jArr, int i10) {
        this.f13229b = jArr;
        this.f13230c = i10;
    }

    private void h(int i10, long j10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f13230c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        long[] jArr = this.f13229b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f13229b, i10, jArr2, i10 + 1, this.f13230c - i10);
            this.f13229b = jArr2;
        }
        this.f13229b[i10] = j10;
        this.f13230c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f13230c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f13230c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        c();
        z.a(collection);
        if (!(collection instanceof i0)) {
            return super.addAll(collection);
        }
        i0 i0Var = (i0) collection;
        int i10 = i0Var.f13230c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f13230c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f13229b;
        if (i12 > jArr.length) {
            this.f13229b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(i0Var.f13229b, 0, this.f13229b, this.f13230c, i0Var.f13230c);
        this.f13230c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        h(i10, l10.longValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        if (this.f13230c != i0Var.f13230c) {
            return false;
        }
        long[] jArr = i0Var.f13229b;
        for (int i10 = 0; i10 < this.f13230c; i10++) {
            if (this.f13229b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        k(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f13230c; i11++) {
            i10 = (i10 * 31) + z.f(this.f13229b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f13229b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public void k(long j10) {
        c();
        int i10 = this.f13230c;
        long[] jArr = this.f13229b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f13229b = jArr2;
        }
        long[] jArr3 = this.f13229b;
        int i11 = this.f13230c;
        this.f13230c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(n(i10));
    }

    public long n(int i10) {
        l(i10);
        return this.f13229b[i10];
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public z.h a(int i10) {
        if (i10 >= this.f13230c) {
            return new i0(Arrays.copyOf(this.f13229b, i10), this.f13230c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        c();
        l(i10);
        long[] jArr = this.f13229b;
        long j10 = jArr[i10];
        if (i10 < this.f13230c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f13230c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(s(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f13229b;
        System.arraycopy(jArr, i11, jArr, i10, this.f13230c - i11);
        this.f13230c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public long s(int i10, long j10) {
        c();
        l(i10);
        long[] jArr = this.f13229b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13230c;
    }
}
