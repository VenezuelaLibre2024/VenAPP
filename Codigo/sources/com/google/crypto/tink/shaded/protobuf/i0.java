package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class i0 extends c<Long> implements a0.h, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final i0 f11414d;

    /* renamed from: b, reason: collision with root package name */
    private long[] f11415b;

    /* renamed from: c, reason: collision with root package name */
    private int f11416c;

    static {
        i0 i0Var = new i0(new long[0], 0);
        f11414d = i0Var;
        i0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0() {
        this(new long[10], 0);
    }

    private i0(long[] jArr, int i10) {
        this.f11415b = jArr;
        this.f11416c = i10;
    }

    private void h(int i10, long j10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f11416c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        long[] jArr = this.f11415b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f11415b, i10, jArr2, i10 + 1, this.f11416c - i10);
            this.f11415b = jArr2;
        }
        this.f11415b[i10] = j10;
        this.f11416c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f11416c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f11416c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof i0)) {
            return super.addAll(collection);
        }
        i0 i0Var = (i0) collection;
        int i10 = i0Var.f11416c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11416c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f11415b;
        if (i12 > jArr.length) {
            this.f11415b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(i0Var.f11415b, 0, this.f11415b, this.f11416c, i0Var.f11416c);
        this.f11416c = i12;
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

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        if (this.f11416c != i0Var.f11416c) {
            return false;
        }
        long[] jArr = i0Var.f11415b;
        for (int i10 = 0; i10 < this.f11416c; i10++) {
            if (this.f11415b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        k(l10.longValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11416c; i11++) {
            i10 = (i10 * 31) + a0.f(this.f11415b[i11]);
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
            if (this.f11415b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public void k(long j10) {
        c();
        int i10 = this.f11416c;
        long[] jArr = this.f11415b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f11415b = jArr2;
        }
        long[] jArr3 = this.f11415b;
        int i11 = this.f11416c;
        this.f11416c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(n(i10));
    }

    public long n(int i10) {
        l(i10);
        return this.f11415b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0.h a(int i10) {
        if (i10 >= this.f11416c) {
            return new i0(Arrays.copyOf(this.f11415b, i10), this.f11416c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        c();
        l(i10);
        long[] jArr = this.f11415b;
        long j10 = jArr[i10];
        if (i10 < this.f11416c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f11416c--;
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
        long[] jArr = this.f11415b;
        System.arraycopy(jArr, i11, jArr, i10, this.f11416c - i11);
        this.f11416c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public long s(int i10, long j10) {
        c();
        l(i10);
        long[] jArr = this.f11415b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11416c;
    }
}
