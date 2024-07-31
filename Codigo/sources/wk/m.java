package wk;

import java.util.Iterator;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class m<T, R> implements d<R> {

    /* renamed from: a, reason: collision with root package name */
    private final d<T> f30194a;

    /* renamed from: b, reason: collision with root package name */
    private final ok.l<T, R> f30195b;

    /* loaded from: classes3.dex */
    public static final class a implements Iterator<R>, pk.a {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator<T> f30196a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ m<T, R> f30197b;

        a(m<T, R> mVar) {
            this.f30197b = mVar;
            this.f30196a = ((m) mVar).f30194a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f30196a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((m) this.f30197b).f30195b.invoke(this.f30196a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(d<? extends T> sequence, ok.l<? super T, ? extends R> transformer) {
        n.e(sequence, "sequence");
        n.e(transformer, "transformer");
        this.f30194a = sequence;
        this.f30195b = transformer;
    }

    @Override // wk.d
    public Iterator<R> iterator() {
        return new a(this);
    }
}
