package qj;

/* loaded from: classes3.dex */
public final class u<T> extends dj.o<T> {

    /* renamed from: a, reason: collision with root package name */
    final dj.n<T> f24119a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<T> extends nj.d<T> implements dj.l<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24120c;

        a(dj.q<? super T> qVar) {
            super(qVar);
        }

        @Override // dj.l
        public void a() {
            d();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24120c, bVar)) {
                this.f24120c = bVar;
                this.f21984a.b(this);
            }
        }

        @Override // nj.d, gj.b
        public void dispose() {
            super.dispose();
            this.f24120c.dispose();
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            f(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            e(t10);
        }
    }

    public u(dj.n<T> nVar) {
        this.f24119a = nVar;
    }

    public static <T> dj.l<T> v(dj.q<? super T> qVar) {
        return new a(qVar);
    }

    @Override // dj.o
    protected void s(dj.q<? super T> qVar) {
        this.f24119a.a(v(qVar));
    }
}
