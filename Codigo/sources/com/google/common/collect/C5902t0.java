package com.google.common.collect;

import java.util.Objects;
import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.t0 */
/* loaded from: classes2.dex */
public class C5902t0<E> extends AbstractC5907w<E> {

    /* renamed from: e */
    static final AbstractC5907w<Object> f12368e = new C5902t0(new Object[0], 0);

    /* renamed from: c */
    final transient Object[] f12369c;

    /* renamed from: d */
    private final transient int f12370d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5902t0(Object[] objArr, int i10) {
        this.f12369c = objArr;
        this.f12370d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5907w, com.google.common.collect.AbstractC5903u
    /* renamed from: d */
    public int mo14834d(Object[] objArr, int i10) {
        System.arraycopy(this.f12369c, 0, objArr, i10, this.f12370d);
        return i10 + this.f12370d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: f */
    public Object[] mo15052f() {
        return this.f12369c;
    }

    @Override // java.util.List
    public E get(int i10) {
        C7159o.m21310m(i10, this.f12370d);
        E e10 = (E) this.f12369c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: h */
    public int mo15053h() {
        return this.f12370d;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f12370d;
    }
}
