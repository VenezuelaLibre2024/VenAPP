package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.C5101a;
import com.google.crypto.tink.shaded.protobuf.C5950a0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.crypto.tink.shaded.protobuf.f */
/* loaded from: classes2.dex */
public final class C5964f extends AbstractC5955c<Boolean> implements C5950a0.a, RandomAccess, InterfaceC5951a1 {

    /* renamed from: d */
    private static final C5964f f12585d;

    /* renamed from: b */
    private boolean[] f12586b;

    /* renamed from: c */
    private int f12587c;

    static {
        C5964f c5964f = new C5964f(new boolean[0], 0);
        f12585d = c5964f;
        c5964f.mo15316b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5964f() {
        this(new boolean[10], 0);
    }

    private C5964f(boolean[] zArr, int i10) {
        this.f12586b = zArr;
        this.f12587c = i10;
    }

    /* renamed from: h */
    private void m15405h(int i10, boolean z10) {
        int i11;
        m15336c();
        if (i10 < 0 || i10 > (i11 = this.f12587c)) {
            throw new IndexOutOfBoundsException(m15407o(i10));
        }
        boolean[] zArr = this.f12586b;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f12586b, i10, zArr2, i10 + 1, this.f12587c - i10);
            this.f12586b = zArr2;
        }
        this.f12586b[i10] = z10;
        this.f12587c++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: l */
    private void m15406l(int i10) {
        if (i10 < 0 || i10 >= this.f12587c) {
            throw new IndexOutOfBoundsException(m15407o(i10));
        }
    }

    /* renamed from: o */
    private String m15407o(int i10) {
        return "Index:" + i10 + ", Size:" + this.f12587c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m15336c();
        C5950a0.m15302a(collection);
        if (!(collection instanceof C5964f)) {
            return super.addAll(collection);
        }
        C5964f c5964f = (C5964f) collection;
        int i10 = c5964f.f12587c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f12587c;
        if (C5101a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f12586b;
        if (i12 > zArr.length) {
            this.f12586b = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c5964f.f12586b, 0, this.f12586b, this.f12587c, c5964f.f12587c);
        this.f12587c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        m15405h(i10, bool.booleanValue());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5964f)) {
            return super.equals(obj);
        }
        C5964f c5964f = (C5964f) obj;
        if (this.f12587c != c5964f.f12587c) {
            return false;
        }
        boolean[] zArr = c5964f.f12586b;
        for (int i10 = 0; i10 < this.f12587c; i10++) {
            if (this.f12586b[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m15410k(bool.booleanValue());
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f12587c; i11++) {
            i10 = (i10 * 31) + C5950a0.m15304c(this.f12586b[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f12586b[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public void m15410k(boolean z10) {
        m15336c();
        int i10 = this.f12587c;
        boolean[] zArr = this.f12586b;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f12586b = zArr2;
        }
        boolean[] zArr3 = this.f12586b;
        int i11 = this.f12587c;
        this.f12587c = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(m15412n(i10));
    }

    /* renamed from: n */
    public boolean m15412n(int i10) {
        m15406l(i10);
        return this.f12586b[i10];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C5950a0.i
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public C5950a0.a mo15315a(int i10) {
        if (i10 >= this.f12587c) {
            return new C5964f(Arrays.copyOf(this.f12586b, i10), this.f12587c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC5955c, java.util.AbstractList, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        m15336c();
        m15406l(i10);
        boolean[] zArr = this.f12586b;
        boolean z10 = zArr[i10];
        if (i10 < this.f12587c - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f12587c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(m15416s(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        m15336c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f12586b;
        System.arraycopy(zArr, i11, zArr, i10, this.f12587c - i11);
        this.f12587c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: s */
    public boolean m15416s(int i10, boolean z10) {
        m15336c();
        m15406l(i10);
        boolean[] zArr = this.f12586b;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12587c;
    }
}
