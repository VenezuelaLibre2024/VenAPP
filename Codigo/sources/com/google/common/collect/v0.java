package com.google.common.collect;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v0<E> extends a0<E> {

    /* renamed from: s, reason: collision with root package name */
    private static final Object[] f11176s;

    /* renamed from: t, reason: collision with root package name */
    static final v0<Object> f11177t;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f11178c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f11179d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f11180e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f11181f;

    /* renamed from: r, reason: collision with root package name */
    private final transient int f11182r;

    static {
        Object[] objArr = new Object[0];
        f11176s = objArr;
        f11177t = new v0<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f11178c = objArr;
        this.f11179d = i10;
        this.f11180e = objArr2;
        this.f11181f = i11;
        this.f11182r = i12;
    }

    @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f11180e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c10 = t.c(obj);
        while (true) {
            int i10 = c10 & this.f11181f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c10 = i10 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public int d(Object[] objArr, int i10) {
        System.arraycopy(this.f11178c, 0, objArr, i10, this.f11182r);
        return i10 + this.f11182r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public Object[] f() {
        return this.f11178c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public int h() {
        return this.f11182r;
    }

    @Override // com.google.common.collect.a0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f11179d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public int k() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public boolean l() {
        return false;
    }

    @Override // com.google.common.collect.a0, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public h1<E> iterator() {
        return c().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f11182r;
    }

    @Override // com.google.common.collect.a0
    w<E> t() {
        return w.o(this.f11178c, this.f11182r);
    }

    @Override // com.google.common.collect.a0
    boolean u() {
        return true;
    }
}
