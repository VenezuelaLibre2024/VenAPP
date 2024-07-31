package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import com.google.android.gms.common.api.C5101a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.z */
/* loaded from: classes.dex */
final class C1217z extends AbstractC1152c<Integer> implements C1147a0.g, RandomAccess, InterfaceC1148a1 {

    /* renamed from: d */
    private static final C1217z f5041d;

    /* renamed from: b */
    private int[] f5042b;

    /* renamed from: c */
    private int f5043c;

    static {
        C1217z c1217z = new C1217z(new int[0], 0);
        f5041d = c1217z;
        c1217z.mo5657b();
    }

    C1217z() {
        this(new int[10], 0);
    }

    private C1217z(int[] iArr, int i10) {
        this.f5042b = iArr;
        this.f5043c = i10;
    }

    /* renamed from: h */
    private void m6581h(int i10, int i11) {
        int i12;
        m5675c();
        if (i10 < 0 || i10 > (i12 = this.f5043c)) {
            throw new IndexOutOfBoundsException(m6583m(i10));
        }
        int[] iArr = this.f5042b;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f5042b, i10, iArr2, i10 + 1, this.f5043c - i10);
            this.f5042b = iArr2;
        }
        this.f5042b[i10] = i11;
        this.f5043c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: k */
    private void m6582k(int i10) {
        if (i10 < 0 || i10 >= this.f5043c) {
            throw new IndexOutOfBoundsException(m6583m(i10));
        }
    }

    /* renamed from: m */
    private String m6583m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f5043c;
    }

    /* renamed from: F0 */
    public void m6584F0(int i10) {
        m5675c();
        int i11 = this.f5043c;
        int[] iArr = this.f5042b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f5042b = iArr2;
        }
        int[] iArr3 = this.f5042b;
        int i12 = this.f5043c;
        this.f5043c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m5675c();
        C1147a0.m5643a(collection);
        if (!(collection instanceof C1217z)) {
            return super.addAll(collection);
        }
        C1217z c1217z = (C1217z) collection;
        int i10 = c1217z.f5043c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5043c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f5042b;
        if (i12 > iArr.length) {
            this.f5042b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c1217z.f5042b, 0, this.f5042b, this.f5043c, c1217z.f5043c);
        this.f5043c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        m6581h(i10, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1217z)) {
            return super.equals(obj);
        }
        C1217z c1217z = (C1217z) obj;
        if (this.f5043c != c1217z.f5043c) {
            return false;
        }
        int[] iArr = c1217z.f5042b;
        for (int i10 = 0; i10 < this.f5043c; i10++) {
            if (this.f5042b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m6584F0(num.intValue());
        return true;
    }

    public int getInt(int i10) {
        m6582k(i10);
        return this.f5042b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5043c; i11++) {
            i10 = (i10 * 31) + this.f5042b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // androidx.datastore.preferences.protobuf.C1147a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C1147a0.g mo5656a(int i10) {
        if (i10 >= this.f5043c) {
            return new C1217z(Arrays.copyOf(this.f5042b, i10), this.f5043c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        m5675c();
        m6582k(i10);
        int[] iArr = this.f5042b;
        int i11 = iArr[i10];
        if (i10 < this.f5043c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f5043c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(m6591q(i10, num.intValue()));
    }

    /* renamed from: q */
    public int m6591q(int i10, int i11) {
        m5675c();
        m6582k(i10);
        int[] iArr = this.f5042b;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m5675c();
        for (int i10 = 0; i10 < this.f5043c; i10++) {
            if (obj.equals(Integer.valueOf(this.f5042b[i10]))) {
                int[] iArr = this.f5042b;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f5043c - i10) - 1);
                this.f5043c--;
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
        int[] iArr = this.f5042b;
        System.arraycopy(iArr, i11, iArr, i10, this.f5043c - i11);
        this.f5043c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5043c;
    }
}
