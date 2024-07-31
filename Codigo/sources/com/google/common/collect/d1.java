package com.google.common.collect;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d1<E> extends a0<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient E f11084c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(E e10) {
        this.f11084c = (E) eb.o.o(e10);
    }

    @Override // com.google.common.collect.a0, com.google.common.collect.u
    public w<E> c() {
        return w.w(this.f11084c);
    }

    @Override // com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f11084c.equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public int d(Object[] objArr, int i10) {
        objArr[i10] = this.f11084c;
        return i10 + 1;
    }

    @Override // com.google.common.collect.a0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f11084c.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.u
    public boolean l() {
        return false;
    }

    @Override // com.google.common.collect.a0, com.google.common.collect.u, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: m */
    public h1<E> iterator() {
        return f0.r(this.f11084c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f11084c.toString() + ']';
    }
}
