package dk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class n0<T> extends c<T> implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f14227b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14228c;

    /* renamed from: d, reason: collision with root package name */
    private int f14229d;

    /* renamed from: e, reason: collision with root package name */
    private int f14230e;

    /* loaded from: classes3.dex */
    public static final class a extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        private int f14231c;

        /* renamed from: d, reason: collision with root package name */
        private int f14232d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n0<T> f14233e;

        a(n0<T> n0Var) {
            this.f14233e = n0Var;
            this.f14231c = n0Var.size();
            this.f14232d = ((n0) n0Var).f14229d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dk.b
        protected void a() {
            if (this.f14231c == 0) {
                c();
                return;
            }
            d(((n0) this.f14233e).f14227b[this.f14232d]);
            this.f14232d = (this.f14232d + 1) % ((n0) this.f14233e).f14228c;
            this.f14231c--;
        }
    }

    public n0(int i10) {
        this(new Object[i10], 0);
    }

    public n0(Object[] buffer, int i10) {
        kotlin.jvm.internal.n.e(buffer, "buffer");
        this.f14227b = buffer;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i10).toString());
        }
        if (i10 <= buffer.length) {
            this.f14228c = buffer.length;
            this.f14230e = i10;
            return;
        }
        throw new IllegalArgumentException(("ring buffer filled size: " + i10 + " cannot be larger than the buffer size: " + buffer.length).toString());
    }

    @Override // dk.a
    public int c() {
        return this.f14230e;
    }

    @Override // dk.c, java.util.List
    public T get(int i10) {
        c.f14211a.b(i10, size());
        return (T) this.f14227b[(this.f14229d + i10) % this.f14228c];
    }

    @Override // dk.c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final void l(T t10) {
        if (n()) {
            throw new IllegalStateException("ring buffer is full");
        }
        this.f14227b[(this.f14229d + size()) % this.f14228c] = t10;
        this.f14230e = size() + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n0<T> m(int i10) {
        int d10;
        Object[] array;
        int i11 = this.f14228c;
        d10 = uk.l.d(i11 + (i11 >> 1) + 1, i10);
        if (this.f14229d == 0) {
            array = Arrays.copyOf(this.f14227b, d10);
            kotlin.jvm.internal.n.d(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[d10]);
        }
        return new n0<>(array, size());
    }

    public final boolean n() {
        return size() == this.f14228c;
    }

    public final void o(int i10) {
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i10).toString());
        }
        if (!(i10 <= size())) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i10 + ", size = " + size()).toString());
        }
        if (i10 > 0) {
            int i11 = this.f14229d;
            int i12 = (i11 + i10) % this.f14228c;
            if (i11 > i12) {
                l.k(this.f14227b, null, i11, this.f14228c);
                l.k(this.f14227b, null, 0, i12);
            } else {
                l.k(this.f14227b, null, i11, i12);
            }
            this.f14229d = i12;
            this.f14230e = size() - i10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dk.a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // dk.a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.n.e(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.n.d(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = this.f14229d; i11 < size && i12 < this.f14228c; i12++) {
            array[i11] = this.f14227b[i12];
            i11++;
        }
        while (i11 < size) {
            array[i11] = this.f14227b[i10];
            i11++;
            i10++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }
}
