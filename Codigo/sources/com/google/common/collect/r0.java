package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class r0<T> implements Comparator<T> {
    public static <T> r0<T> a(Comparator<T> comparator) {
        return comparator instanceof r0 ? (r0) comparator : new n(comparator);
    }

    public static <C extends Comparable> r0<C> c() {
        return o0.f11150a;
    }

    public <E extends T> w<E> b(Iterable<E> iterable) {
        return w.D(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public <T2 extends T> r0<Map.Entry<T2, ?>> d() {
        return (r0<Map.Entry<T2, ?>>) e(j0.e());
    }

    public <F> r0<F> e(eb.g<F, ? extends T> gVar) {
        return new h(gVar, this);
    }

    public <S extends T> r0<S> f() {
        return new y0(this);
    }
}
