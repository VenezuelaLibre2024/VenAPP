package com.google.common.collect;

import java.util.NoSuchElementException;
import p082eb.C7159o;

/* renamed from: com.google.common.collect.a */
/* loaded from: classes2.dex */
abstract class AbstractC5854a<E> extends AbstractC5880i1<E> {

    /* renamed from: a */
    private final int f12245a;

    /* renamed from: b */
    private int f12246b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC5854a(int i10, int i11) {
        C7159o.m21315r(i11, i10);
        this.f12245a = i10;
        this.f12246b = i11;
    }

    /* renamed from: a */
    protected abstract E mo14705a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f12246b < this.f12245a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f12246b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12246b;
        this.f12246b = i10 + 1;
        return mo14705a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f12246b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f12246b - 1;
        this.f12246b = i10;
        return mo14705a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f12246b - 1;
    }
}
