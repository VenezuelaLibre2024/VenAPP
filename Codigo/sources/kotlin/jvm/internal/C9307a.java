package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import pk.InterfaceC10201a;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes3.dex */
final class C9307a<T> implements Iterator<T>, InterfaceC10201a {

    /* renamed from: a */
    private final T[] f22563a;

    /* renamed from: b */
    private int f22564b;

    public C9307a(T[] array) {
        C9322n.m27781e(array, "array");
        this.f22563a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f22564b < this.f22563a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f22563a;
            int i10 = this.f22564b;
            this.f22564b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f22564b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
