package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import p082eb.InterfaceC7151g;

/* renamed from: com.google.common.collect.r0 */
/* loaded from: classes2.dex */
public abstract class AbstractC5898r0<T> implements Comparator<T> {
    /* renamed from: a */
    public static <T> AbstractC5898r0<T> m15039a(Comparator<T> comparator) {
        return comparator instanceof AbstractC5898r0 ? (AbstractC5898r0) comparator : new C5889n(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> AbstractC5898r0<C> m15040c() {
        return C5892o0.f12365a;
    }

    /* renamed from: b */
    public <E extends T> AbstractC5907w<E> m15041b(Iterable<E> iterable) {
        return AbstractC5907w.m15074D(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public <T2 extends T> AbstractC5898r0<Map.Entry<T2, ?>> m15042d() {
        return (AbstractC5898r0<Map.Entry<T2, ?>>) m15043e(C5882j0.m14892e());
    }

    /* renamed from: e */
    public <F> AbstractC5898r0<F> m15043e(InterfaceC7151g<F, ? extends T> interfaceC7151g) {
        return new C5875h(interfaceC7151g, this);
    }

    /* renamed from: f */
    public <S extends T> AbstractC5898r0<S> mo15026f() {
        return new C5912y0(this);
    }
}
