package com.google.common.collect;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class a<E> extends i1<E> {

    /* renamed from: a, reason: collision with root package name */
    private final int f11030a;

    /* renamed from: b, reason: collision with root package name */
    private int f11031b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i10, int i11) {
        eb.o.r(i11, i10);
        this.f11030a = i10;
        this.f11031b = i11;
    }

    protected abstract E a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f11031b < this.f11030a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f11031b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11031b;
        this.f11031b = i10 + 1;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f11031b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f11031b - 1;
        this.f11031b = i10;
        return a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f11031b - 1;
    }
}
