package com.google.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.protobuf.C6633z;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.v */
/* loaded from: classes2.dex */
final class C6625v extends AbstractC6568c<Float> implements C6633z.f, RandomAccess, InterfaceC6564a1 {

    /* renamed from: d */
    private static final C6625v f14649d;

    /* renamed from: b */
    private float[] f14650b;

    /* renamed from: c */
    private int f14651c;

    static {
        C6625v c6625v = new C6625v(new float[0], 0);
        f14649d = c6625v;
        c6625v.mo18411b();
    }

    C6625v() {
        this(new float[10], 0);
    }

    private C6625v(float[] fArr, int i10) {
        this.f14650b = fArr;
        this.f14651c = i10;
    }

    /* renamed from: k */
    private void m19263k(int i10, float f10) {
        int i11;
        m18412c();
        if (i10 < 0 || i10 > (i11 = this.f14651c)) {
            throw new IndexOutOfBoundsException(m19265o(i10));
        }
        float[] fArr = this.f14650b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f14650b, i10, fArr2, i10 + 1, this.f14651c - i10);
            this.f14650b = fArr2;
        }
        this.f14650b[i10] = f10;
        this.f14651c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m19264l(int i10) {
        if (i10 < 0 || i10 >= this.f14651c) {
            throw new IndexOutOfBoundsException(m19265o(i10));
        }
    }

    /* renamed from: o */
    private String m19265o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f14651c;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m18412c();
        C6633z.m19347a(collection);
        if (!(collection instanceof C6625v)) {
            return super.addAll(collection);
        }
        C6625v c6625v = (C6625v) collection;
        int i10 = c6625v.f14651c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f14651c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f14650b;
        if (i12 > fArr.length) {
            this.f14650b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c6625v.f14650b, 0, this.f14650b, this.f14651c, c6625v.f14651c);
        this.f14651c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        m19263k(i10, f10.floatValue());
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6625v)) {
            return super.equals(obj);
        }
        C6625v c6625v = (C6625v) obj;
        if (this.f14651c != c6625v.f14651c) {
            return false;
        }
        float[] fArr = c6625v.f14650b;
        for (int i10 = 0; i10 < this.f14651c; i10++) {
            if (Float.floatToIntBits(this.f14650b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        m19268h(f10.floatValue());
        return true;
    }

    /* renamed from: h */
    public void m19268h(float f10) {
        m18412c();
        int i10 = this.f14651c;
        float[] fArr = this.f14650b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f14650b = fArr2;
        }
        float[] fArr3 = this.f14650b;
        int i11 = this.f14651c;
        this.f14651c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f14651c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f14650b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f14650b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(m19270n(i10));
    }

    /* renamed from: n */
    public float m19270n(int i10) {
        m19264l(i10);
        return this.f14650b[i10];
    }

    @Override // com.google.protobuf.C6633z.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C6633z.f mo18430a(int i10) {
        if (i10 >= this.f14651c) {
            return new C6625v(Arrays.copyOf(this.f14650b, i10), this.f14651c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6568c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        m18412c();
        m19264l(i10);
        float[] fArr = this.f14650b;
        float f10 = fArr[i10];
        if (i10 < this.f14651c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f14651c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(m19274s(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m18412c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f14650b;
        System.arraycopy(fArr, i11, fArr, i10, this.f14651c - i11);
        this.f14651c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public float m19274s(int i10, float f10) {
        m18412c();
        m19264l(i10);
        float[] fArr = this.f14650b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f14651c;
    }
}
