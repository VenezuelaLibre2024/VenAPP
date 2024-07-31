package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class g1<F, T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f11098a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(Iterator<? extends F> it) {
        this.f11098a = (Iterator) eb.o.o(it);
    }

    abstract T a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f11098a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return a(this.f11098a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f11098a.remove();
    }
}
