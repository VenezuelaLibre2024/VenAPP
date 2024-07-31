package pj;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class y<T, U extends Collection<? super T>> extends pj.a<T, U> {

    /* renamed from: c, reason: collision with root package name */
    final Callable<U> f23272c;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> extends wj.c<U> implements dj.i<T>, im.c {
        private static final long serialVersionUID = -8134157938864266736L;

        /* renamed from: c, reason: collision with root package name */
        im.c f23273c;

        /* JADX WARN: Multi-variable type inference failed */
        a(im.b<? super U> bVar, U u10) {
            super(bVar);
            this.f30172b = u10;
        }

        @Override // im.b
        public void a() {
            e(this.f30172b);
        }

        @Override // im.b
        public void c(T t10) {
            Collection collection = (Collection) this.f30172b;
            if (collection != null) {
                collection.add(t10);
            }
        }

        @Override // wj.c, im.c
        public void cancel() {
            super.cancel();
            this.f23273c.cancel();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23273c, cVar)) {
                this.f23273c = cVar;
                this.f30171a.d(this);
                cVar.i(Long.MAX_VALUE);
            }
        }

        @Override // im.b
        public void onError(Throwable th2) {
            this.f30172b = null;
            this.f30171a.onError(th2);
        }
    }

    public y(dj.f<T> fVar, Callable<U> callable) {
        super(fVar);
        this.f23272c = callable;
    }

    @Override // dj.f
    protected void I(im.b<? super U> bVar) {
        try {
            this.f23056b.H(new a(bVar, (Collection) lj.b.d(this.f23272c.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            hj.b.b(th2);
            wj.d.h(th2, bVar);
        }
    }
}
