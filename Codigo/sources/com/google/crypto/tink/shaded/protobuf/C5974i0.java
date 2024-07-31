package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.i0 */
/* loaded from: classes2.dex */
public final class C5974i0 extends AbstractC5955c<Long> implements C5950a0.h, RandomAccess, InterfaceC5951a1 {

    /* renamed from: d */
    private static final C5974i0 f12629d;

    /* renamed from: b */
    private long[] f12630b;

    /* renamed from: c */
    private int f12631c;

    static {
        C5974i0 c5974i0 = new C5974i0(new long[0], 0);
        f12629d = c5974i0;
        c5974i0.mo15316b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5974i0() {
        this(new long[10], 0);
    }

    private C5974i0(long[] jArr, int i10) {
        this.f12630b = jArr;
        this.f12631c = i10;
    }

    /* renamed from: h */
    private void m15588h(int i10, long j10) {
        int i11;
        m15336c();
        if (i10 < 0 || i10 > (i11 = this.f12631c)) {
            throw new IndexOutOfBoundsException(m15590o(i10));
        }
        long[] jArr = this.f12630b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f12630b, i10, jArr2, i10 + 1, this.f12631c - i10);
            this.f12630b = jArr2;
        }
        this.f12630b[i10] = j10;
        this.f12631c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m15589l(int i10) {
        if (i10 < 0 || i10 >= this.f12631c) {
            throw new IndexOutOfBoundsException(m15590o(i10));
        }
    }

    /* renamed from: o */
    private String m15590o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12631c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m15336c();
        C5950a0.m15302a(collection);
        if (!(collection instanceof C5974i0)) {
            return super.addAll(collection);
        }
        C5974i0 c5974i0 = (C5974i0) collection;
        int i10 = c5974i0.f12631c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12631c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f12630b;
        if (i12 > jArr.length) {
            this.f12630b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c5974i0.f12630b, 0, this.f12630b, this.f12631c, c5974i0.f12631c);
        this.f12631c = i12;
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
        m15588h(i10, l10.longValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5974i0)) {
            return super.equals(obj);
        }
        C5974i0 c5974i0 = (C5974i0) obj;
        if (this.f12631c != c5974i0.f12631c) {
            return false;
        }
        long[] jArr = c5974i0.f12630b;
        for (int i10 = 0; i10 < this.f12631c; i10++) {
            if (this.f12630b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        m15593k(l10.longValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12631c; i11++) {
            i10 = (i10 * 31) + C5950a0.m15307f(this.f12630b[i11]);
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
            if (this.f12630b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void m15593k(long j10) {
        m15336c();
        int i10 = this.f12631c;
        long[] jArr = this.f12630b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f12630b = jArr2;
        }
        long[] jArr3 = this.f12630b;
        int i11 = this.f12631c;
        this.f12631c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(m15595n(i10));
    }

    /* renamed from: n */
    public long m15595n(int i10) {
        m15589l(i10);
        return this.f12630b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5950a0.h mo15315a(int i10) {
        if (i10 >= this.f12631c) {
            return new C5974i0(Arrays.copyOf(this.f12630b, i10), this.f12631c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        m15336c();
        m15589l(i10);
        long[] jArr = this.f12630b;
        long j10 = jArr[i10];
        if (i10 < this.f12631c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f12631c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(m15599s(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m15336c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f12630b;
        System.arraycopy(jArr, i11, jArr, i10, this.f12631c - i11);
        this.f12631c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public long m15599s(int i10, long j10) {
        m15336c();
        m15589l(i10);
        long[] jArr = this.f12630b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12631c;
    }
}
