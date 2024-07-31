package qj;

/* loaded from: classes3.dex */
public final class t<T> extends dj.f<T> {

    /* renamed from: b, reason: collision with root package name */
    final dj.n<T> f24117b;

    /* loaded from: classes3.dex */
    static final class a<T> extends wj.c<T> implements dj.l<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24118c;

        a(im.b<? super T> bVar) {
            super(bVar);
        }

        @Override // dj.l
        public void a() {
            this.f30171a.a();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24118c, bVar)) {
                this.f24118c = bVar;
                this.f30171a.d(this);
            }
        }

        @Override // wj.c, im.c
        public void cancel() {
            super.cancel();
            this.f24118c.dispose();
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f30171a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            e(t10);
        }
    }

    public t(dj.n<T> nVar) {
        this.f24117b = nVar;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f24117b.a(new a(bVar));
    }
}
