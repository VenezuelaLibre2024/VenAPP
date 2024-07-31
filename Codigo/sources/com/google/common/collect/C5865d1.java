package com.google.common.collect;

import p082eb.C7159o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.d1 */
/* loaded from: classes2.dex */
public final class C5865d1<E> extends AbstractC5855a0<E> {

    /* renamed from: c */
    final transient E f12299c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5865d1(E e10) {
        this.f12299c = (E) C7159o.m21312o(e10);
    }

    @Override // com.google.common.collect.AbstractC5855a0, com.google.common.collect.AbstractC5903u
    /* renamed from: c */
    public AbstractC5907w<E> mo14719c() {
        return AbstractC5907w.m15082w(this.f12299c);
    }

    @Override // com.google.common.collect.AbstractC5903u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f12299c.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC5903u
    /* renamed from: d */
    public int mo14834d(Object[] objArr, int i10) {
        objArr[i10] = this.f12299c;
        return i10 + 1;
    }

    @Override // com.google.common.collect.AbstractC5855a0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f12299c.hashCode();
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
        return C5870f0.m14867r(this.f12299c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f12299c.toString() + ']';
    }
}
