package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class w extends c<Float> implements a0.f, RandomAccess, a1 {

    /* renamed from: d, reason: collision with root package name */
    private static final w f11557d;

    /* renamed from: b, reason: collision with root package name */
    private float[] f11558b;

    /* renamed from: c, reason: collision with root package name */
    private int f11559c;

    static {
        w wVar = new w(new float[0], 0);
        f11557d = wVar;
        wVar.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w() {
        this(new float[10], 0);
    }

    private w(float[] fArr, int i10) {
        this.f11558b = fArr;
        this.f11559c = i10;
    }

    private void k(int i10, float f10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f11559c)) {
            throw new IndexOutOfBoundsException(o(i10));
        }
        float[] fArr = this.f11558b;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f11558b, i10, fArr2, i10 + 1, this.f11559c - i10);
            this.f11558b = fArr2;
        }
        this.f11558b[i10] = f10;
        this.f11559c++;
        ((AbstractList) this).modCount++;
    }

    private void l(int i10) {
        if (i10 < 0 || i10 >= this.f11559c) {
            throw new IndexOutOfBoundsException(o(i10));
        }
    }

    private String o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f11559c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i10 = wVar.f11559c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f11559c;
        if (a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f11558b;
        if (i12 > fArr.length) {
            this.f11558b = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(wVar.f11558b, 0, this.f11558b, this.f11559c, wVar.f11559c);
        this.f11559c = i12;
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
        k(i10, f10.floatValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f11559c != wVar.f11559c) {
            return false;
        }
        float[] fArr = wVar.f11558b;
        for (int i10 = 0; i10 < this.f11559c; i10++) {
            if (Float.floatToIntBits(this.f11558b[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        h(f10.floatValue());
        return true;
    }

    public void h(float f10) {
        c();
        int i10 = this.f11559c;
        float[] fArr = this.f11558b;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f11558b = fArr2;
        }
        float[] fArr3 = this.f11558b;
        int i11 = this.f11559c;
        this.f11559c = i11 + 1;
        fArr3[i11] = f10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f11559c; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f11558b[i11]);
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
            if (this.f11558b[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(n(i10));
    }

    public float n(int i10) {
        l(i10);
        return this.f11558b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a0.f a(int i10) {
        if (i10 >= this.f11559c) {
            return new w(Arrays.copyOf(this.f11558b, i10), this.f11559c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        c();
        l(i10);
        float[] fArr = this.f11558b;
        float f10 = fArr[i10];
        if (i10 < this.f11559c - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f11559c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(s(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f11558b;
        System.arraycopy(fArr, i11, fArr, i10, this.f11559c - i11);
        this.f11559c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public float s(int i10, float f10) {
        c();
        l(i10);
        float[] fArr = this.f11558b;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11559c;
    }
}
