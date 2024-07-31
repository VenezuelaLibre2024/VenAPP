package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.protobuf.C6633z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.i0 */
/* loaded from: classes2.dex */
final class C6587i0 extends AbstractC6568c<Long> implements C6633z.h, RandomAccess, InterfaceC6564a1 {

    /* renamed from: d */
    private static final C6587i0 f14502d;

    /* renamed from: b */
    private long[] f14503b;

    /* renamed from: c */
    private int f14504c;

    static {
        C6587i0 c6587i0 = new C6587i0(new long[0], 0);
        f14502d = c6587i0;
        c6587i0.mo18411b();
    }

    C6587i0() {
        this(new long[10], 0);
    }

    private C6587i0(long[] jArr, int i10) {
        this.f14503b = jArr;
        this.f14504c = i10;
    }

    /* renamed from: h */
    private void m18636h(int i10, long j10) {
        int i11;
        m18412c();
        if (i10 < 0 || i10 > (i11 = this.f14504c)) {
            throw new IndexOutOfBoundsException(m18638o(i10));
        }
        long[] jArr = this.f14503b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f14503b, i10, jArr2, i10 + 1, this.f14504c - i10);
            this.f14503b = jArr2;
        }
        this.f14503b[i10] = j10;
        this.f14504c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m18637l(int i10) {
        if (i10 < 0 || i10 >= this.f14504c) {
            throw new IndexOutOfBoundsException(m18638o(i10));
        }
    }

    /* renamed from: o */
    private String m18638o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f14504c;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m18412c();
        C6633z.m19347a(collection);
        if (!(collection instanceof C6587i0)) {
            return super.addAll(collection);
        }
        C6587i0 c6587i0 = (C6587i0) collection;
        int i10 = c6587i0.f14504c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14504c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f14503b;
        if (i12 > jArr.length) {
            this.f14503b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c6587i0.f14503b, 0, this.f14503b, this.f14504c, c6587i0.f14504c);
        this.f14504c = i12;
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
        m18636h(i10, l10.longValue());
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6587i0)) {
            return super.equals(obj);
        }
        C6587i0 c6587i0 = (C6587i0) obj;
        if (this.f14504c != c6587i0.f14504c) {
            return false;
        }
        long[] jArr = c6587i0.f14503b;
        for (int i10 = 0; i10 < this.f14504c; i10++) {
            if (this.f14503b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        m18641k(l10.longValue());
        return true;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14504c; i11++) {
            i10 = (i10 * 31) + C6633z.m19352f(this.f14503b[i11]);
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
            if (this.f14503b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void m18641k(long j10) {
        m18412c();
        int i10 = this.f14504c;
        long[] jArr = this.f14503b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f14503b = jArr2;
        }
        long[] jArr3 = this.f14503b;
        int i11 = this.f14504c;
        this.f14504c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(m18643n(i10));
    }

    /* renamed from: n */
    public long m18643n(int i10) {
        m18637l(i10);
        return this.f14503b[i10];
    }

    @Override // com.google.protobuf.C6633z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C6633z.h mo18430a(int i10) {
        if (i10 >= this.f14504c) {
            return new C6587i0(Arrays.copyOf(this.f14503b, i10), this.f14504c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        m18412c();
        m18637l(i10);
        long[] jArr = this.f14503b;
        long j10 = jArr[i10];
        if (i10 < this.f14504c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f14504c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(m18647s(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m18412c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f14503b;
        System.arraycopy(jArr, i11, jArr, i10, this.f14504c - i11);
        this.f14504c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public long m18647s(int i10, long j10) {
        m18412c();
        m18637l(i10);
        long[] jArr = this.f14503b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14504c;
    }
}
