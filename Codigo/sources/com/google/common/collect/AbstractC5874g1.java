package com.google.common.collect;

import java.util.Iterator;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.g1 */
/* loaded from: classes2.dex */
abstract class AbstractC5874g1<F, T> implements Iterator<T> {

    /* renamed from: a */
    final Iterator<? extends F> f12313a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5874g1(Iterator<? extends F> it) {
        this.f12313a = (Iterator) C7159o.m21312o(it);
    }

    /* renamed from: a */
    abstract T mo14871a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12313a.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo14871a(this.f12313a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f12313a.remove();
    }
}
