package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class a<T> implements Iterator<T>, pk.a {

    /* renamed from: a, reason: collision with root package name */
    private final T[] f20741a;

    /* renamed from: b, reason: collision with root package name */
    private int f20742b;

    public a(T[] array) {
        n.e(array, "array");
        this.f20741a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f20742b < this.f20741a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f20741a;
            int i10 = this.f20742b;
            this.f20742b = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f20742b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
