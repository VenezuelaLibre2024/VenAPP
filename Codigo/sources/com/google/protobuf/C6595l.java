package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.protobuf.C6633z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.l */
/* loaded from: classes2.dex */
final class C6595l extends AbstractC6568c<Double> implements C6633z.b, RandomAccess, InterfaceC6564a1 {

    /* renamed from: d */
    private static final C6595l f14560d;

    /* renamed from: b */
    private double[] f14561b;

    /* renamed from: c */
    private int f14562c;

    static {
        C6595l c6595l = new C6595l(new double[0], 0);
        f14560d = c6595l;
        c6595l.mo18411b();
    }

    C6595l() {
        this(new double[10], 0);
    }

    private C6595l(double[] dArr, int i10) {
        this.f14561b = dArr;
        this.f14562c = i10;
    }

    /* renamed from: k */
    private void m18912k(int i10, double d10) {
        int i11;
        m18412c();
        if (i10 < 0 || i10 > (i11 = this.f14562c)) {
            throw new IndexOutOfBoundsException(m18914o(i10));
        }
        double[] dArr = this.f14561b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f14561b, i10, dArr2, i10 + 1, this.f14562c - i10);
            this.f14561b = dArr2;
        }
        this.f14561b[i10] = d10;
        this.f14562c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m18913l(int i10) {
        if (i10 < 0 || i10 >= this.f14562c) {
            throw new IndexOutOfBoundsException(m18914o(i10));
        }
    }

    /* renamed from: o */
    private String m18914o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f14562c;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m18412c();
        C6633z.m19347a(collection);
        if (!(collection instanceof C6595l)) {
            return super.addAll(collection);
        }
        C6595l c6595l = (C6595l) collection;
        int i10 = c6595l.f14562c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14562c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f14561b;
        if (i12 > dArr.length) {
            this.f14561b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c6595l.f14561b, 0, this.f14561b, this.f14562c, c6595l.f14562c);
        this.f14562c = i12;
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
        m18912k(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6595l)) {
            return super.equals(obj);
        }
        C6595l c6595l = (C6595l) obj;
        if (this.f14562c != c6595l.f14562c) {
            return false;
        }
        double[] dArr = c6595l.f14561b;
        for (int i10 = 0; i10 < this.f14562c; i10++) {
            if (Double.doubleToLongBits(this.f14561b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        m18917h(d10.doubleValue());
        return true;
    }

    /* renamed from: h */
    public void m18917h(double d10) {
        m18412c();
        int i10 = this.f14562c;
        double[] dArr = this.f14561b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f14561b = dArr2;
        }
        double[] dArr3 = this.f14561b;
        int i11 = this.f14562c;
        this.f14562c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14562c; i11++) {
            i10 = (i10 * 31) + C6633z.m19352f(Double.doubleToLongBits(this.f14561b[i11]));
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
            if (this.f14561b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(m18919n(i10));
    }

    /* renamed from: n */
    public double m18919n(int i10) {
        m18913l(i10);
        return this.f14561b[i10];
    }

    @Override // com.google.protobuf.C6633z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C6633z.b mo18430a(int i10) {
        if (i10 >= this.f14562c) {
            return new C6595l(Arrays.copyOf(this.f14561b, i10), this.f14562c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        m18412c();
        m18913l(i10);
        double[] dArr = this.f14561b;
        double d10 = dArr[i10];
        if (i10 < this.f14562c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f14562c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(m18923s(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m18412c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f14561b;
        System.arraycopy(dArr, i11, dArr, i10, this.f14562c - i11);
        this.f14562c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public double m18923s(int i10, double d10) {
        m18412c();
        m18913l(i10);
        double[] dArr = this.f14561b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14562c;
    }
}
