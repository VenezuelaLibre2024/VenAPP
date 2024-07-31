package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1147a0;
import com.google.android.gms.common.api.C5101a;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.w */
/* loaded from: classes.dex */
final class C1211w extends AbstractC1152c<Float> implements C1147a0.f, RandomAccess, InterfaceC1148a1 {

    /* renamed from: d */
    private static final C1211w f5025d;

    /* renamed from: b */
    private float[] f5026b;

    /* renamed from: c */
    private int f5027c;

    static {
        C1211w c1211w = new C1211w(new float[0], 0);
        f5025d = c1211w;
        c1211w.mo5657b();
    }

    C1211w() {
        this(new float[10], 0);
    }

    private C1211w(float[] fArr, int i10) {
        this.f5026b = fArr;
        this.f5027c = i10;
    }

    /* renamed from: k */
    private void m6528k(int i10, float f10) {
        int i11;
        m5675c();
        if (i10 < 0 || i10 > (i11 = this.f5027c)) {
            throw new IndexOutOfBoundsException(m6530o(i10));
        }
        float[] fArr = this.f5026b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f5026b, i10, fArr2, i10 + 1, this.f5027c - i10);
            this.f5026b = fArr2;
        }
        this.f5026b[i10] = f10;
        this.f5027c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m6529l(int i10) {
        if (i10 < 0 || i10 >= this.f5027c) {
            throw new IndexOutOfBoundsException(m6530o(i10));
        }
    }

    /* renamed from: o */
    private String m6530o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f5027c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m5675c();
        C1147a0.m5643a(collection);
        if (!(collection instanceof C1211w)) {
            return super.addAll(collection);
        }
        C1211w c1211w = (C1211w) collection;
        int i10 = c1211w.f5027c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5027c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f5026b;
        if (i12 > fArr.length) {
            this.f5026b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c1211w.f5026b, 0, this.f5026b, this.f5027c, c1211w.f5027c);
        this.f5027c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        m6528k(i10, f10.floatValue());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1211w)) {
            return super.equals(obj);
        }
        C1211w c1211w = (C1211w) obj;
        if (this.f5027c != c1211w.f5027c) {
            return false;
        }
        float[] fArr = c1211w.f5026b;
        for (int i10 = 0; i10 < this.f5027c; i10++) {
            if (Float.floatToIntBits(this.f5026b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        m6533h(f10.floatValue());
        return true;
    }

    /* renamed from: h */
    public void m6533h(float f10) {
        m5675c();
        int i10 = this.f5027c;
        float[] fArr = this.f5026b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f5026b = fArr2;
        }
        float[] fArr3 = this.f5026b;
        int i11 = this.f5027c;
        this.f5027c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5027c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f5026b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(m6535n(i10));
    }

    /* renamed from: n */
    public float m6535n(int i10) {
        m6529l(i10);
        return this.f5026b[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.C1147a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C1147a0.f mo5656a(int i10) {
        if (i10 >= this.f5027c) {
            return new C1211w(Arrays.copyOf(this.f5026b, i10), this.f5027c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        m5675c();
        m6529l(i10);
        float[] fArr = this.f5026b;
        float f10 = fArr[i10];
        if (i10 < this.f5027c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f5027c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(m6539s(i10, f10.floatValue()));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1152c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m5675c();
        for (int i10 = 0; i10 < this.f5027c; i10++) {
            if (obj.equals(Float.valueOf(this.f5026b[i10]))) {
                float[] fArr = this.f5026b;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f5027c - i10) - 1);
                this.f5027c--;
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
        float[] fArr = this.f5026b;
        System.arraycopy(fArr, i11, fArr, i10, this.f5027c - i11);
        this.f5027c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public float m6539s(int i10, float f10) {
        m5675c();
        m6529l(i10);
        float[] fArr = this.f5026b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5027c;
    }
}
