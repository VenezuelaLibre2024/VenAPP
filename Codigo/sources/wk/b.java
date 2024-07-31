package wk;

import java.util.Iterator;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class b<T> implements d<T>, c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final d<T> f30183a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30184b;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, pk.a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f30185a;

        /* renamed from: b, reason: collision with root package name */
        private int f30186b;

        a(b<T> bVar) {
            this.f30185a = ((b) bVar).f30183a.iterator();
            this.f30186b = ((b) bVar).f30184b;
        }

        private final void a() {
            while (this.f30186b > 0 && this.f30185a.hasNext()) {
                this.f30185a.next();
                this.f30186b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f30185a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            a();
            return this.f30185a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(d<? extends T> sequence, int i10) {
        n.e(sequence, "sequence");
        this.f30183a = sequence;
        this.f30184b = i10;
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
    }

    @Override // wk.c
    public d<T> a(int i10) {
        int i11 = this.f30184b + i10;
        return i11 < 0 ? new b(this, i10) : new b(this.f30183a, i11);
    }

    @Override // wk.d
    public Iterator<T> iterator() {
        return new a(this);
    }
}
