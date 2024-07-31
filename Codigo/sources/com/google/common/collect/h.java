package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h<F, T> extends r0<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final eb.g<F, ? extends T> f11099a;

    /* renamed from: b */
    final r0<T> f11100b;

    public h(eb.g<F, ? extends T> gVar, r0<T> r0Var) {
        this.f11099a = (eb.g) eb.o.o(gVar);
        this.f11100b = (r0) eb.o.o(r0Var);
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f11100b.compare(this.f11099a.apply(f10), this.f11099a.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f11099a.equals(hVar.f11099a) && this.f11100b.equals(hVar.f11100b);
    }

    public int hashCode() {
        return eb.k.b(this.f11099a, this.f11100b);
    }

    public String toString() {
        return this.f11100b + ".onResultOf(" + this.f11099a + ")";
    }
}
