package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.protobuf.C6633z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.y */
/* loaded from: classes2.dex */
public final class C6631y extends AbstractC6568c<Integer> implements C6633z.g, RandomAccess, InterfaceC6564a1 {

    /* renamed from: d */
    private static final C6631y f14667d;

    /* renamed from: b */
    private int[] f14668b;

    /* renamed from: c */
    private int f14669c;

    static {
        C6631y c6631y = new C6631y(new int[0], 0);
        f14667d = c6631y;
        c6631y.mo18411b();
    }

    C6631y() {
        this(new int[10], 0);
    }

    private C6631y(int[] iArr, int i10) {
        this.f14668b = iArr;
        this.f14669c = i10;
    }

    /* renamed from: h */
    private void m19333h(int i10, int i11) {
        int i12;
        m18412c();
        if (i10 < 0 || i10 > (i12 = this.f14669c)) {
            throw new IndexOutOfBoundsException(m19336n(i10));
        }
        int[] iArr = this.f14668b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f14668b, i10, iArr2, i10 + 1, this.f14669c - i10);
            this.f14668b = iArr2;
        }
        this.f14668b[i10] = i11;
        this.f14669c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: k */
    public static C6631y m19334k() {
        return f14667d;
    }

    /* renamed from: l */
    private void m19335l(int i10) {
        if (i10 < 0 || i10 >= this.f14669c) {
            throw new IndexOutOfBoundsException(m19336n(i10));
        }
    }

    /* renamed from: n */
    private String m19336n(int i10) {
        return "Index:" + i10 + ", Size:" + this.f14669c;
    }

    @Override // com.google.protobuf.C6633z.g
    /* renamed from: F0 */
    public void mo19337F0(int i10) {
        m18412c();
        int i11 = this.f14669c;
        int[] iArr = this.f14668b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f14668b = iArr2;
        }
        int[] iArr3 = this.f14668b;
        int i12 = this.f14669c;
        this.f14669c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // com.google.protobuf.C6633z.i
    /* renamed from: a */
    public C6633z.i<Integer> mo18430a(int i10) {
        if (i10 >= this.f14669c) {
            return new C6631y(Arrays.copyOf(this.f14668b, i10), this.f14669c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m18412c();
        C6633z.m19347a(collection);
        if (!(collection instanceof C6631y)) {
            return super.addAll(collection);
        }
        C6631y c6631y = (C6631y) collection;
        int i10 = c6631y.f14669c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14669c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f14668b;
        if (i12 > iArr.length) {
            this.f14668b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c6631y.f14668b, 0, this.f14668b, this.f14669c, c6631y.f14669c);
        this.f14669c = i12;
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
        m19333h(i10, num.intValue());
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6631y)) {
            return super.equals(obj);
        }
        C6631y c6631y = (C6631y) obj;
        if (this.f14669c != c6631y.f14669c) {
            return false;
        }
        int[] iArr = c6631y.f14668b;
        for (int i10 = 0; i10 < this.f14669c; i10++) {
            if (this.f14668b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        mo19337F0(num.intValue());
        return true;
    }

    @Override // com.google.protobuf.C6633z.g
    public int getInt(int i10) {
        m19335l(i10);
        return this.f14668b[i10];
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14669c; i11++) {
            i10 = (i10 * 31) + this.f14668b[i11];
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
            if (this.f14668b[i10] == intValue) {
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

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        m18412c();
        m19335l(i10);
        int[] iArr = this.f14668b;
        int i11 = iArr[i10];
        if (i10 < this.f14669c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f14669c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(m19343q(i10, num.intValue()));
    }

    /* renamed from: q */
    public int m19343q(int i10, int i11) {
        m18412c();
        m19335l(i10);
        int[] iArr = this.f14668b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m18412c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14668b;
        System.arraycopy(iArr, i11, iArr, i10, this.f14669c - i11);
        this.f14669c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14669c;
    }
}
