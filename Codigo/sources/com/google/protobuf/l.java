package com.google.protobuf;

import com.google.android.gms.common.api.a;
import com.google.protobuf.z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class l extends c<Double> implements z.b, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final l f13286d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f13287b;

    /* renamed from: c, reason: collision with root package name */
    private int f13288c;

    static {
        l lVar = new l(new double[0], 0);
        f13286d = lVar;
        lVar.b();
    }

    l() {
        this(new double[10], 0);
    }

    private l(double[] dArr, int i10) {
        this.f13287b = dArr;
        this.f13288c = i10;
    }

    private void k(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f13288c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        double[] dArr = this.f13287b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f13287b, i10, dArr2, i10 + 1, this.f13288c - i10);
            this.f13287b = dArr2;
        }
        this.f13287b[i10] = d10;
        this.f13288c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f13288c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f13288c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        z.a(collection);
        if (!(collection instanceof l)) {
            return super.addAll(collection);
        }
        l lVar = (l) collection;
        int i10 = lVar.f13288c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f13288c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f13287b;
        if (i12 > dArr.length) {
            this.f13287b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(lVar.f13287b, 0, this.f13287b, this.f13288c, lVar.f13288c);
        this.f13288c = i12;
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
        k(i10, d10.doubleValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return super.equals(obj);
        }
        l lVar = (l) obj;
        if (this.f13288c != lVar.f13288c) {
            return false;
        }
        double[] dArr = lVar.f13287b;
        for (int i10 = 0; i10 < this.f13288c; i10++) {
            if (Double.doubleToLongBits(this.f13287b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        h(d10.doubleValue());
        return true;
    }

    public void h(double d10) {
        c();
        int i10 = this.f13288c;
        double[] dArr = this.f13287b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f13287b = dArr2;
        }
        double[] dArr3 = this.f13287b;
        int i11 = this.f13288c;
        this.f13288c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f13288c; i11++) {
            i10 = (i10 * 31) + z.f(Double.doubleToLongBits(this.f13287b[i11]));
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
            if (this.f13287b[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(n(i10));
    }

    public double n(int i10) {
        l(i10);
        return this.f13287b[i10];
    }

    @Override // com.google.protobuf.z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public z.b a(int i10) {
        if (i10 >= this.f13288c) {
            return new l(Arrays.copyOf(this.f13287b, i10), this.f13288c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        c();
        l(i10);
        double[] dArr = this.f13287b;
        double d10 = dArr[i10];
        if (i10 < this.f13288c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f13288c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(s(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f13287b;
        System.arraycopy(dArr, i11, dArr, i10, this.f13288c - i11);
        this.f13288c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public double s(int i10, double d10) {
        c();
        l(i10);
        double[] dArr = this.f13287b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13288c;
    }
}
