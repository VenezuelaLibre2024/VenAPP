package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import com.google.android.gms.common.api.C5101a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.i0 */
/* loaded from: classes.dex */
final class C1171i0 extends AbstractC1152c<Long> implements C1147a0.h, RandomAccess, InterfaceC1148a1 {

    /* renamed from: d */
    private static final C1171i0 f4868d;

    /* renamed from: b */
    private long[] f4869b;

    /* renamed from: c */
    private int f4870c;

    static {
        C1171i0 c1171i0 = new C1171i0(new long[0], 0);
        f4868d = c1171i0;
        c1171i0.mo5657b();
    }

    C1171i0() {
        this(new long[10], 0);
    }

    private C1171i0(long[] jArr, int i10) {
        this.f4869b = jArr;
        this.f4870c = i10;
    }

    /* renamed from: h */
    private void m5905h(int i10, long j10) {
        int i11;
        m5675c();
        if (i10 < 0 || i10 > (i11 = this.f4870c)) {
            throw new IndexOutOfBoundsException(m5907o(i10));
        }
        long[] jArr = this.f4869b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f4869b, i10, jArr2, i10 + 1, this.f4870c - i10);
            this.f4869b = jArr2;
        }
        this.f4869b[i10] = j10;
        this.f4870c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m5906l(int i10) {
        if (i10 < 0 || i10 >= this.f4870c) {
            throw new IndexOutOfBoundsException(m5907o(i10));
        }
    }

    /* renamed from: o */
    private String m5907o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f4870c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m5675c();
        C1147a0.m5643a(collection);
        if (!(collection instanceof C1171i0)) {
            return super.addAll(collection);
        }
        C1171i0 c1171i0 = (C1171i0) collection;
        int i10 = c1171i0.f4870c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4870c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f4869b;
        if (i12 > jArr.length) {
            this.f4869b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c1171i0.f4869b, 0, this.f4869b, this.f4870c, c1171i0.f4870c);
        this.f4870c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        m5905h(i10, l10.longValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1171i0)) {
            return super.equals(obj);
        }
        C1171i0 c1171i0 = (C1171i0) obj;
        if (this.f4870c != c1171i0.f4870c) {
            return false;
        }
        long[] jArr = c1171i0.f4869b;
        for (int i10 = 0; i10 < this.f4870c; i10++) {
            if (this.f4869b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        m5910k(l10.longValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4870c; i11++) {
            i10 = (i10 * 31) + C1147a0.m5648f(this.f4869b[i11]);
        }
        return i10;
    }

    /* renamed from: k */
    public void m5910k(long j10) {
        m5675c();
        int i10 = this.f4870c;
        long[] jArr = this.f4869b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f4869b = jArr2;
        }
        long[] jArr3 = this.f4869b;
        int i11 = this.f4870c;
        this.f4870c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(m5912n(i10));
    }

    /* renamed from: n */
    public long m5912n(int i10) {
        m5906l(i10);
        return this.f4869b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C1147a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C1147a0.h mo5656a(int i10) {
        if (i10 >= this.f4870c) {
            return new C1171i0(Arrays.copyOf(this.f4869b, i10), this.f4870c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        m5675c();
        m5906l(i10);
        long[] jArr = this.f4869b;
        long j10 = jArr[i10];
        if (i10 < this.f4870c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f4870c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(m5916s(i10, l10.longValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m5675c();
        for (int i10 = 0; i10 < this.f4870c; i10++) {
            if (obj.equals(Long.valueOf(this.f4869b[i10]))) {
                long[] jArr = this.f4869b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f4870c - i10) - 1);
                this.f4870c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m5675c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4869b;
        System.arraycopy(jArr, i11, jArr, i10, this.f4870c - i11);
        this.f4870c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public long m5916s(int i10, long j10) {
        m5675c();
        m5906l(i10);
        long[] jArr = this.f4869b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4870c;
    }
}
