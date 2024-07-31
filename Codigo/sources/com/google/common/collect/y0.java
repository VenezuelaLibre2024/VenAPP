package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y0<T> extends r0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final r0<? super T> f11207a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(r0<? super T> r0Var) {
        this.f11207a = (r0) eb.o.o(r0Var);
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f11207a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            return this.f11207a.equals(((y0) obj).f11207a);
        }
        return false;
    }

    @Override // com.google.common.collect.r0
    public <S extends T> r0<S> f() {
        return this.f11207a;
    }

    public int hashCode() {
        return -this.f11207a.hashCode();
    }

    public String toString() {
        return this.f11207a + ".reverse()";
    }
}
