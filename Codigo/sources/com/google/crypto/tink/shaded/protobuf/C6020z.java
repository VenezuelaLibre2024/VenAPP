package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.z */
/* loaded from: classes2.dex */
public final class C6020z extends AbstractC5955c<Integer> implements C5950a0.g, RandomAccess, InterfaceC5951a1 {

    /* renamed from: d */
    private static final C6020z f12788d;

    /* renamed from: b */
    private int[] f12789b;

    /* renamed from: c */
    private int f12790c;

    static {
        C6020z c6020z = new C6020z(new int[0], 0);
        f12788d = c6020z;
        c6020z.mo15316b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6020z() {
        this(new int[10], 0);
    }

    private C6020z(int[] iArr, int i10) {
        this.f12789b = iArr;
        this.f12790c = i10;
    }

    /* renamed from: h */
    private void m16275h(int i10, int i11) {
        int i12;
        m15336c();
        if (i10 < 0 || i10 > (i12 = this.f12790c)) {
            throw new IndexOutOfBoundsException(m16277m(i10));
        }
        int[] iArr = this.f12789b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f12789b, i10, iArr2, i10 + 1, this.f12790c - i10);
            this.f12789b = iArr2;
        }
        this.f12789b[i10] = i11;
        this.f12790c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: k */
    private void m16276k(int i10) {
        if (i10 < 0 || i10 >= this.f12790c) {
            throw new IndexOutOfBoundsException(m16277m(i10));
        }
    }

    /* renamed from: m */
    private String m16277m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12790c;
    }

    /* renamed from: F0 */
    public void m16278F0(int i10) {
        m15336c();
        int i11 = this.f12790c;
        int[] iArr = this.f12789b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f12789b = iArr2;
        }
        int[] iArr3 = this.f12789b;
        int i12 = this.f12790c;
        this.f12790c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m15336c();
        C5950a0.m15302a(collection);
        if (!(collection instanceof C6020z)) {
            return super.addAll(collection);
        }
        C6020z c6020z = (C6020z) collection;
        int i10 = c6020z.f12790c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12790c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f12789b;
        if (i12 > iArr.length) {
            this.f12789b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c6020z.f12789b, 0, this.f12789b, this.f12790c, c6020z.f12790c);
        this.f12790c = i12;
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
        m16275h(i10, num.intValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6020z)) {
            return super.equals(obj);
        }
        C6020z c6020z = (C6020z) obj;
        if (this.f12790c != c6020z.f12790c) {
            return false;
        }
        int[] iArr = c6020z.f12789b;
        for (int i10 = 0; i10 < this.f12790c; i10++) {
            if (this.f12789b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m16278F0(num.intValue());
        return true;
    }

    public int getInt(int i10) {
        m16276k(i10);
        return this.f12789b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12790c; i11++) {
            i10 = (i10 * 31) + this.f12789b[i11];
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
            if (this.f12789b[i10] == intValue) {
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

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5950a0.g mo15315a(int i10) {
        if (i10 >= this.f12790c) {
            return new C6020z(Arrays.copyOf(this.f12789b, i10), this.f12790c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        m15336c();
        m16276k(i10);
        int[] iArr = this.f12789b;
        int i11 = iArr[i10];
        if (i10 < this.f12790c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f12790c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(m16285q(i10, num.intValue()));
    }

    /* renamed from: q */
    public int m16285q(int i10, int i11) {
        m15336c();
        m16276k(i10);
        int[] iArr = this.f12789b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m15336c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f12789b;
        System.arraycopy(iArr, i11, iArr, i10, this.f12790c - i11);
        this.f12790c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12790c;
    }
}
