package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g<T> extends dj.b {

    /* renamed from: a, reason: collision with root package name */
    final dj.n<T> f24063a;

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super T, ? extends dj.d> f24064b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<gj.b> implements dj.l<T>, dj.c, gj.b {
        private static final long serialVersionUID = -2177128922851101253L;

        /* renamed from: a, reason: collision with root package name */
        final dj.c f24065a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends dj.d> f24066b;

        a(dj.c cVar, jj.e<? super T, ? extends dj.d> eVar) {
            this.f24065a = cVar;
            this.f24066b = eVar;
        }

        @Override // dj.l
        public void a() {
            this.f24065a.a();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            kj.b.l(this, bVar);
        }

        @Override // gj.b
        public void dispose() {
            kj.b.b(this);
        }

        @Override // gj.b
        public boolean h() {
            return kj.b.i(get());
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24065a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            try {
                dj.d dVar = (dj.d) lj.b.d(this.f24066b.apply(t10), "The mapper returned a null CompletableSource");
                if (h()) {
                    return;
                }
                dVar.a(this);
            } catch (Throwable th2) {
                hj.b.b(th2);
                onError(th2);
            }
        }
    }

    public g(dj.n<T> nVar, jj.e<? super T, ? extends dj.d> eVar) {
        this.f24063a = nVar;
        this.f24064b = eVar;
    }

    @Override // dj.b
    protected void p(dj.c cVar) {
        a aVar = new a(cVar, this.f24064b);
        cVar.b(aVar);
        this.f24063a.a(aVar);
    }
}
