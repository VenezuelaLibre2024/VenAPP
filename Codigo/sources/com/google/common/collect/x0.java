package com.google.common.collect;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class x0 extends r0<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final x0 f11192a = new x0();
    private static final long serialVersionUID = 0;

    private x0() {
    }

    private Object readResolve() {
        return f11192a;
    }

    @Override // com.google.common.collect.r0
    public <S extends Comparable<?>> r0<S> f() {
        return r0.c();
    }

    @Override // com.google.common.collect.r0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        eb.o.o(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
