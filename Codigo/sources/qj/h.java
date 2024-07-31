package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h<T, R> extends qj.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super T, ? extends dj.n<? extends R>> f24067b;

    /* loaded from: classes3.dex */
    static final class a<T, R> extends AtomicReference<gj.b> implements dj.l<T>, gj.b {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super R> f24068a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends dj.n<? extends R>> f24069b;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24070c;

        /* renamed from: qj.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0396a implements dj.l<R> {
            C0396a() {
            }

            @Override // dj.l
            public void a() {
                a.this.f24068a.a();
            }

            @Override // dj.l
            public void b(gj.b bVar) {
                kj.b.o(a.this, bVar);
            }

            @Override // dj.l
            public void onError(Throwable th2) {
                a.this.f24068a.onError(th2);
            }

            @Override // dj.l
            public void onSuccess(R r10) {
                a.this.f24068a.onSuccess(r10);
            }
        }

        a(dj.l<? super R> lVar, jj.e<? super T, ? extends dj.n<? extends R>> eVar) {
            this.f24068a = lVar;
            this.f24069b = eVar;
        }

        @Override // dj.l
        public void a() {
            this.f24068a.a();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24070c, bVar)) {
                this.f24070c = bVar;
                this.f24068a.b(this);
            }
        }

        @Override // gj.b
        public void dispose() {
            kj.b.b(this);
            this.f24070c.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return kj.b.i(get());
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24068a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            try {
                dj.n nVar = (dj.n) lj.b.d(this.f24069b.apply(t10), "The mapper returned a null MaybeSource");
                if (h()) {
                    return;
                }
                nVar.a(new C0396a());
            } catch (Exception e10) {
                hj.b.b(e10);
                this.f24068a.onError(e10);
            }
        }
    }

    public h(dj.n<T> nVar, jj.e<? super T, ? extends dj.n<? extends R>> eVar) {
        super(nVar);
        this.f24067b = eVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super R> lVar) {
        this.f24047a.a(new a(lVar, this.f24067b));
    }
}
