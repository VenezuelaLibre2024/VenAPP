package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.w */
/* loaded from: classes2.dex */
public final class C6014w extends AbstractC5955c<Float> implements C5950a0.f, RandomAccess, InterfaceC5951a1 {

    /* renamed from: d */
    private static final C6014w f12772d;

    /* renamed from: b */
    private float[] f12773b;

    /* renamed from: c */
    private int f12774c;

    static {
        C6014w c6014w = new C6014w(new float[0], 0);
        f12772d = c6014w;
        c6014w.mo15316b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6014w() {
        this(new float[10], 0);
    }

    private C6014w(float[] fArr, int i10) {
        this.f12773b = fArr;
        this.f12774c = i10;
    }

    /* renamed from: k */
    private void m16205k(int i10, float f10) {
        int i11;
        m15336c();
        if (i10 < 0 || i10 > (i11 = this.f12774c)) {
            throw new IndexOutOfBoundsException(m16207o(i10));
        }
        float[] fArr = this.f12773b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f12773b, i10, fArr2, i10 + 1, this.f12774c - i10);
            this.f12773b = fArr2;
        }
        this.f12773b[i10] = f10;
        this.f12774c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m16206l(int i10) {
        if (i10 < 0 || i10 >= this.f12774c) {
            throw new IndexOutOfBoundsException(m16207o(i10));
        }
    }

    /* renamed from: o */
    private String m16207o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12774c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m15336c();
        C5950a0.m15302a(collection);
        if (!(collection instanceof C6014w)) {
            return super.addAll(collection);
        }
        C6014w c6014w = (C6014w) collection;
        int i10 = c6014w.f12774c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12774c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f12773b;
        if (i12 > fArr.length) {
            this.f12773b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c6014w.f12773b, 0, this.f12773b, this.f12774c, c6014w.f12774c);
        this.f12774c = i12;
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
        m16205k(i10, f10.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6014w)) {
            return super.equals(obj);
        }
        C6014w c6014w = (C6014w) obj;
        if (this.f12774c != c6014w.f12774c) {
            return false;
        }
        float[] fArr = c6014w.f12773b;
        for (int i10 = 0; i10 < this.f12774c; i10++) {
            if (Float.floatToIntBits(this.f12773b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        m16210h(f10.floatValue());
        return true;
    }

    /* renamed from: h */
    public void m16210h(float f10) {
        m15336c();
        int i10 = this.f12774c;
        float[] fArr = this.f12773b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f12773b = fArr2;
        }
        float[] fArr3 = this.f12773b;
        int i11 = this.f12774c;
        this.f12774c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12774c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f12773b[i11]);
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
            if (this.f12773b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(m16212n(i10));
    }

    /* renamed from: n */
    public float m16212n(int i10) {
        m16206l(i10);
        return this.f12773b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5950a0.f mo15315a(int i10) {
        if (i10 >= this.f12774c) {
            return new C6014w(Arrays.copyOf(this.f12773b, i10), this.f12774c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        m15336c();
        m16206l(i10);
        float[] fArr = this.f12773b;
        float f10 = fArr[i10];
        if (i10 < this.f12774c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f12774c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(m16216s(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m15336c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f12773b;
        System.arraycopy(fArr, i11, fArr, i10, this.f12774c - i11);
        this.f12774c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public float m16216s(int i10, float f10) {
        m15336c();
        m16206l(i10);
        float[] fArr = this.f12773b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12774c;
    }
}
