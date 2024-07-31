package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class n<T> extends r0<T> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Comparator<T> f11145a;

    public n(Comparator<T> comparator) {
        this.f11145a = (Comparator) eb.o.o(comparator);
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f11145a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            return this.f11145a.equals(((n) obj).f11145a);
        }
        return false;
    }

    public int hashCode() {
        return this.f11145a.hashCode();
    }

    public String toString() {
        return this.f11145a.toString();
    }
}
