package qj;

/* loaded from: classes3.dex */
public final class n<T, R> extends qj.a<T, R> {

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super T, ? extends R> f24082b;

    /* loaded from: classes3.dex */
    static final class a<T, R> implements dj.l<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super R> f24083a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends R> f24084b;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24085c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(dj.l<? super R> lVar, jj.e<? super T, ? extends R> eVar) {
            this.f24083a = lVar;
            this.f24084b = eVar;
        }

        @Override // dj.l
        public void a() {
            this.f24083a.a();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24085c, bVar)) {
                this.f24085c = bVar;
                this.f24083a.b(this);
            }
        }

        @Override // gj.b
        public void dispose() {
            gj.b bVar = this.f24085c;
            this.f24085c = kj.b.DISPOSED;
            bVar.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f24085c.h();
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24083a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            try {
                this.f24083a.onSuccess(lj.b.d(this.f24084b.apply(t10), "The mapper returned a null item"));
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f24083a.onError(th2);
            }
        }
    }

    public n(dj.n<T> nVar, jj.e<? super T, ? extends R> eVar) {
        super(nVar);
        this.f24082b = eVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super R> lVar) {
        this.f24047a.a(new a(lVar, this.f24082b));
    }
}
