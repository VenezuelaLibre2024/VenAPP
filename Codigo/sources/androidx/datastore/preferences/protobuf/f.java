package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import com.google.android.gms.common.api.a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class f extends c<Boolean> implements a0.a, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final f f4114d;

    /* renamed from: b, reason: collision with root package name */
    private boolean[] f4115b;

    /* renamed from: c, reason: collision with root package name */
    private int f4116c;

    static {
        f fVar = new f(new boolean[0], 0);
        f4114d = fVar;
        fVar.b();
    }

    f() {
        this(new boolean[10], 0);
    }

    private f(boolean[] zArr, int i10) {
        this.f4115b = zArr;
        this.f4116c = i10;
    }

    private void h(int i10, boolean z10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f4116c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        boolean[] zArr = this.f4115b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f4115b, i10, zArr2, i10 + 1, this.f4116c - i10);
            this.f4115b = zArr2;
        }
        this.f4115b[i10] = z10;
        this.f4116c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f4116c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f4116c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f4116c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f4116c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f4115b;
        if (i12 > zArr.length) {
            this.f4115b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(fVar.f4115b, 0, this.f4115b, this.f4116c, fVar.f4116c);
        this.f4116c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        h(i10, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f4116c != fVar.f4116c) {
            return false;
        }
        boolean[] zArr = fVar.f4115b;
        for (int i10 = 0; i10 < this.f4116c; i10++) {
            if (this.f4115b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        k(bool.booleanValue());
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f4116c; i11++) {
            i10 = (i10 * 31) + a0.c(this.f4115b[i11]);
        }
        return i10;
    }

    public void k(boolean z10) {
        c();
        int i10 = this.f4116c;
        boolean[] zArr = this.f4115b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f4115b = zArr2;
        }
        boolean[] zArr3 = this.f4115b;
        int i11 = this.f4116c;
        this.f4116c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(n(i10));
    }

    public boolean n(int i10) {
        l(i10);
        return this.f4115b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0.a a(int i10) {
        if (i10 >= this.f4116c) {
            return new f(Arrays.copyOf(this.f4115b, i10), this.f4116c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        c();
        l(i10);
        boolean[] zArr = this.f4115b;
        boolean z10 = zArr[i10];
        if (i10 < this.f4116c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f4116c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(s(i10, bool.booleanValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f4116c; i10++) {
            if (obj.equals(Boolean.valueOf(this.f4115b[i10]))) {
                boolean[] zArr = this.f4115b;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f4116c - i10) - 1);
                this.f4116c--;
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
        boolean[] zArr = this.f4115b;
        System.arraycopy(zArr, i11, zArr, i10, this.f4116c - i11);
        this.f4116c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public boolean s(int i10, boolean z10) {
        c();
        l(i10);
        boolean[] zArr = this.f4115b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4116c;
    }
}