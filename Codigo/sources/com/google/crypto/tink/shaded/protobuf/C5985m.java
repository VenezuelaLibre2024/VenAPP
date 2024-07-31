package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.m */
/* loaded from: classes2.dex */
public final class C5985m extends AbstractC5955c<Double> implements C5950a0.b, RandomAccess, InterfaceC5951a1 {

    /* renamed from: d */
    private static final C5985m f12682d;

    /* renamed from: b */
    private double[] f12683b;

    /* renamed from: c */
    private int f12684c;

    static {
        C5985m c5985m = new C5985m(new double[0], 0);
        f12682d = c5985m;
        c5985m.mo15316b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5985m() {
        this(new double[10], 0);
    }

    private C5985m(double[] dArr, int i10) {
        this.f12683b = dArr;
        this.f12684c = i10;
    }

    /* renamed from: k */
    private void m15865k(int i10, double d10) {
        int i11;
        m15336c();
        if (i10 < 0 || i10 > (i11 = this.f12684c)) {
            throw new IndexOutOfBoundsException(m15867o(i10));
        }
        double[] dArr = this.f12683b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f12683b, i10, dArr2, i10 + 1, this.f12684c - i10);
            this.f12683b = dArr2;
        }
        this.f12683b[i10] = d10;
        this.f12684c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m15866l(int i10) {
        if (i10 < 0 || i10 >= this.f12684c) {
            throw new IndexOutOfBoundsException(m15867o(i10));
        }
    }

    /* renamed from: o */
    private String m15867o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12684c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m15336c();
        C5950a0.m15302a(collection);
        if (!(collection instanceof C5985m)) {
            return super.addAll(collection);
        }
        C5985m c5985m = (C5985m) collection;
        int i10 = c5985m.f12684c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12684c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f12683b;
        if (i12 > dArr.length) {
            this.f12683b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c5985m.f12683b, 0, this.f12683b, this.f12684c, c5985m.f12684c);
        this.f12684c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        m15865k(i10, d10.doubleValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5985m)) {
            return super.equals(obj);
        }
        C5985m c5985m = (C5985m) obj;
        if (this.f12684c != c5985m.f12684c) {
            return false;
        }
        double[] dArr = c5985m.f12683b;
        for (int i10 = 0; i10 < this.f12684c; i10++) {
            if (Double.doubleToLongBits(this.f12683b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        m15870h(d10.doubleValue());
        return true;
    }

    /* renamed from: h */
    public void m15870h(double d10) {
        m15336c();
        int i10 = this.f12684c;
        double[] dArr = this.f12683b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f12683b = dArr2;
        }
        double[] dArr3 = this.f12683b;
        int i11 = this.f12684c;
        this.f12684c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12684c; i11++) {
            i10 = (i10 * 31) + C5950a0.m15307f(Double.doubleToLongBits(this.f12683b[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f12683b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(m15872n(i10));
    }

    /* renamed from: n */
    public double m15872n(int i10) {
        m15866l(i10);
        return this.f12683b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5950a0.b mo15315a(int i10) {
        if (i10 >= this.f12684c) {
            return new C5985m(Arrays.copyOf(this.f12683b, i10), this.f12684c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        m15336c();
        m15866l(i10);
        double[] dArr = this.f12683b;
        double d10 = dArr[i10];
        if (i10 < this.f12684c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f12684c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(m15876s(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m15336c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f12683b;
        System.arraycopy(dArr, i11, dArr, i10, this.f12684c - i11);
        this.f12684c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public double m15876s(int i10, double d10) {
        m15336c();
        m15866l(i10);
        double[] dArr = this.f12683b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12684c;
    }
}
