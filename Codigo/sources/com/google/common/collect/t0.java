package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class t0<E> extends w<E> {

    /* renamed from: e, reason: collision with root package name */
    static final w<Object> f11153e = new t0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f11154c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f11155d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(Object[] objArr, int i10) {
        this.f11154c = objArr;
        this.f11155d = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.w, com.google.common.collect.u
    public int d(Object[] objArr, int i10) {
        System.arraycopy(this.f11154c, 0, objArr, i10, this.f11155d);
        return i10 + this.f11155d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public Object[] f() {
        return this.f11154c;
    }

    @Override // java.util.List
    public E get(int i10) {
        eb.o.m(i10, this.f11155d);
        E e10 = (E) this.f11154c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public int h() {
        return this.f11155d;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f11155d;
    }
}
