package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class o0 extends r0<Comparable<?>> implements Serializable {

    /* renamed from: a */
    static final o0 f11150a = new o0();
    private static final long serialVersionUID = 0;

    private o0() {
    }

    private Object readResolve() {
        return f11150a;
    }

    @Override // com.google.common.collect.r0
    public <S extends Comparable<?>> r0<S> f() {
        return x0.f11192a;
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    /* renamed from: g */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        eb.o.o(comparable);
        eb.o.o(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
