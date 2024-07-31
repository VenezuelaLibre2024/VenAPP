package pj;

import java.util.Collection;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class z<T, U extends Collection<? super T>> extends dj.s<U> implements mj.b<U> {

    /* renamed from: a, reason: collision with root package name */
    final dj.f<T> f23274a;

    /* renamed from: b, reason: collision with root package name */
    final Callable<U> f23275b;

    /* loaded from: classes3.dex */
    static final class a<T, U extends Collection<? super T>> implements dj.i<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.t<? super U> f23276a;

        /* renamed from: b, reason: collision with root package name */
        im.c f23277b;

        /* renamed from: c, reason: collision with root package name */
        U f23278c;

        a(dj.t<? super U> tVar, U u10) {
            this.f23276a = tVar;
            this.f23278c = u10;
        }

        @Override // im.b
        public void a() {
            this.f23277b = wj.g.CANCELLED;
            this.f23276a.onSuccess(this.f23278c);
        }

        @Override // im.b
        public void c(T t10) {
            this.f23278c.add(t10);
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23277b, cVar)) {
                this.f23277b = cVar;
                this.f23276a.b(this);
                cVar.i(Long.MAX_VALUE);
            }
        }

        @Override // gj.b
        public void dispose() {
            this.f23277b.cancel();
            this.f23277b = wj.g.CANCELLED;
        }

        @Override // gj.b
        public boolean h() {
            return this.f23277b == wj.g.CANCELLED;
        }

        @Override // im.b
        public void onError(Throwable th2) {
            this.f23278c = null;
            this.f23277b = wj.g.CANCELLED;
            this.f23276a.onError(th2);
        }
    }

    public z(dj.f<T> fVar) {
        this(fVar, xj.b.h());
    }

    public z(dj.f<T> fVar, Callable<U> callable) {
        this.f23274a = fVar;
        this.f23275b = callable;
    }

    @Override // mj.b
    public dj.f<U> d() {
        return yj.a.k(new y(this.f23274a, this.f23275b));
    }

    @Override // dj.s
    protected void k(dj.t<? super U> tVar) {
        try {
            this.f23274a.H(new a(tVar, (Collection) lj.b.d(this.f23275b.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            hj.b.b(th2);
            kj.c.q(th2, tVar);
        }
    }
}
