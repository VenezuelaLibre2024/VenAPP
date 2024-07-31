package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class m extends c<Double> implements a0.b, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final m f4223d;

    /* renamed from: b, reason: collision with root package name */
    private double[] f4224b;

    /* renamed from: c, reason: collision with root package name */
    private int f4225c;

    static {
        m mVar = new m(new double[0], 0);
        f4223d = mVar;
        mVar.b();
    }

    m() {
        this(new double[10], 0);
    }

    private m(double[] dArr, int i10) {
        this.f4224b = dArr;
        this.f4225c = i10;
    }

    private void k(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f4225c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        double[] dArr = this.f4224b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f4224b, i10, dArr2, i10 + 1, this.f4225c - i10);
            this.f4224b = dArr2;
        }
        this.f4224b[i10] = d10;
        this.f4225c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f4225c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f4225c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f4225c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4225c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f4224b;
        if (i12 > dArr.length) {
            this.f4224b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(mVar.f4224b, 0, this.f4224b, this.f4225c, mVar.f4225c);
        this.f4225c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        k(i10, d10.doubleValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f4225c != mVar.f4225c) {
            return false;
        }
        double[] dArr = mVar.f4224b;
        for (int i10 = 0; i10 < this.f4225c; i10++) {
            if (Double.doubleToLongBits(this.f4224b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        h(d10.doubleValue());
        return true;
    }

    public void h(double d10) {
        c();
        int i10 = this.f4225c;
        double[] dArr = this.f4224b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f4224b = dArr2;
        }
        double[] dArr3 = this.f4224b;
        int i11 = this.f4225c;
        this.f4225c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4225c; i11++) {
            i10 = (i10 * 31) + a0.f(Double.doubleToLongBits(this.f4224b[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(n(i10));
    }

    public double n(int i10) {
        l(i10);
        return this.f4224b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0.b a(int i10) {
        if (i10 >= this.f4225c) {
            return new m(Arrays.copyOf(this.f4224b, i10), this.f4225c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        c();
        l(i10);
        double[] dArr = this.f4224b;
        double d10 = dArr[i10];
        if (i10 < this.f4225c - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f4225c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(s(i10, d10.doubleValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f4225c; i10++) {
            if (obj.equals(Double.valueOf(this.f4224b[i10]))) {
                double[] dArr = this.f4224b;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f4225c - i10) - 1);
                this.f4225c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f4224b;
        System.arraycopy(dArr, i11, dArr, i10, this.f4225c - i11);
        this.f4225c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public double s(int i10, double d10) {
        c();
        l(i10);
        double[] dArr = this.f4224b;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4225c;
    }
}
