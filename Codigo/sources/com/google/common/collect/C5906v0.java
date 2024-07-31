package com.google.common.collect;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.v0 */
/* loaded from: classes2.dex */
public final class C5906v0<E> extends AbstractC5855a0<E> {

    /* renamed from: s */
    private static final Object[] f12391s;

    /* renamed from: t */
    static final C5906v0<Object> f12392t;

    /* renamed from: c */
    final transient Object[] f12393c;

    /* renamed from: d */
    private final transient int f12394d;

    /* renamed from: e */
    final transient Object[] f12395e;

    /* renamed from: f */
    private final transient int f12396f;

    /* renamed from: r */
    private final transient int f12397r;

    static {
        Object[] objArr = new Object[0];
        f12391s = objArr;
        f12392t = new C5906v0<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5906v0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f12393c = objArr;
        this.f12394d = i10;
        this.f12395e = objArr2;
        this.f12396f = i11;
        this.f12397r = i12;
    }

    @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f12395e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m15051c = C5901t.m15051c(obj);
        while (true) {
            int i10 = m15051c & this.f12396f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m15051c = i10 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: d */
    public int mo14834d(Object[] objArr, int i10) {
        System.arraycopy(this.f12393c, 0, objArr, i10, this.f12397r);
        return i10 + this.f12397r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: f */
    public Object[] mo15052f() {
        return this.f12393c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: h */
    public int mo15053h() {
        return this.f12397r;
    }

    @Override // com.google.common.collect.AbstractC5855a0, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f12394d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: k */
    public int mo15054k() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: l */
    public boolean mo14745l() {
        return false;
    }

    @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public AbstractC5877h1<E> iterator() {
        return mo14719c().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f12397r;
    }

    @Override // com.google.common.collect.AbstractC5855a0
    /* renamed from: t */
    AbstractC5907w<E> mo14721t() {
        return AbstractC5907w.m15076o(this.f12393c, this.f12397r);
    }

    @Override // com.google.common.collect.AbstractC5855a0
    /* renamed from: u */
    boolean mo14722u() {
        return true;
    }
}
