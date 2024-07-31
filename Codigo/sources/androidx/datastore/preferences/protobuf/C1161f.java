package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import com.google.android.gms.common.api.C5101a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.f */
/* loaded from: classes.dex */
final class C1161f extends AbstractC1152c<Boolean> implements C1147a0.a, RandomAccess, InterfaceC1148a1 {

    /* renamed from: d */
    private static final C1161f f4825d;

    /* renamed from: b */
    private boolean[] f4826b;

    /* renamed from: c */
    private int f4827c;

    static {
        C1161f c1161f = new C1161f(new boolean[0], 0);
        f4825d = c1161f;
        c1161f.mo5657b();
    }

    C1161f() {
        this(new boolean[10], 0);
    }

    private C1161f(boolean[] zArr, int i10) {
        this.f4826b = zArr;
        this.f4827c = i10;
    }

    /* renamed from: h */
    private void m5769h(int i10, boolean z10) {
        int i11;
        m5675c();
        if (i10 < 0 || i10 > (i11 = this.f4827c)) {
            throw new IndexOutOfBoundsException(m5771o(i10));
        }
        boolean[] zArr = this.f4826b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f4826b, i10, zArr2, i10 + 1, this.f4827c - i10);
            this.f4826b = zArr2;
        }
        this.f4826b[i10] = z10;
        this.f4827c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m5770l(int i10) {
        if (i10 < 0 || i10 >= this.f4827c) {
            throw new IndexOutOfBoundsException(m5771o(i10));
        }
    }

    /* renamed from: o */
    private String m5771o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f4827c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m5675c();
        C1147a0.m5643a(collection);
        if (!(collection instanceof C1161f)) {
            return super.addAll(collection);
        }
        C1161f c1161f = (C1161f) collection;
        int i10 = c1161f.f4827c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4827c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f4826b;
        if (i12 > zArr.length) {
            this.f4826b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c1161f.f4826b, 0, this.f4826b, this.f4827c, c1161f.f4827c);
        this.f4827c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        m5769h(i10, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1161f)) {
            return super.equals(obj);
        }
        C1161f c1161f = (C1161f) obj;
        if (this.f4827c != c1161f.f4827c) {
            return false;
        }
        boolean[] zArr = c1161f.f4826b;
        for (int i10 = 0; i10 < this.f4827c; i10++) {
            if (this.f4826b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m5774k(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4827c; i11++) {
            i10 = (i10 * 31) + C1147a0.m5645c(this.f4826b[i11]);
        }
        return i10;
    }

    /* renamed from: k */
    public void m5774k(boolean z10) {
        m5675c();
        int i10 = this.f4827c;
        boolean[] zArr = this.f4826b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f4826b = zArr2;
        }
        boolean[] zArr3 = this.f4826b;
        int i11 = this.f4827c;
        this.f4827c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(m5776n(i10));
    }

    /* renamed from: n */
    public boolean m5776n(int i10) {
        m5770l(i10);
        return this.f4826b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C1147a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C1147a0.a mo5656a(int i10) {
        if (i10 >= this.f4827c) {
            return new C1161f(Arrays.copyOf(this.f4826b, i10), this.f4827c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        m5675c();
        m5770l(i10);
        boolean[] zArr = this.f4826b;
        boolean z10 = zArr[i10];
        if (i10 < this.f4827c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f4827c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(m5780s(i10, bool.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m5675c();
        for (int i10 = 0; i10 < this.f4827c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f4826b[i10]))) {
                boolean[] zArr = this.f4826b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f4827c - i10) - 1);
                this.f4827c--;
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
        boolean[] zArr = this.f4826b;
        System.arraycopy(zArr, i11, zArr, i10, this.f4827c - i11);
        this.f4827c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public boolean m5780s(int i10, boolean z10) {
        m5675c();
        m5770l(i10);
        boolean[] zArr = this.f4826b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4827c;
    }
}
