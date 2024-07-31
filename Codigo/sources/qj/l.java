package qj;

/* loaded from: classes3.dex */
public final class l<T> extends dj.s<Boolean> implements mj.c<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final dj.n<T> f24078a;

    /* loaded from: classes3.dex */
    static final class a<T> implements dj.l<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.t<? super Boolean> f24079a;

        /* renamed from: b, reason: collision with root package name */
        gj.b f24080b;

        a(dj.t<? super Boolean> tVar) {
            this.f24079a = tVar;
        }

        @Override // dj.l
        public void a() {
            this.f24080b = kj.b.DISPOSED;
            this.f24079a.onSuccess(Boolean.TRUE);
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24080b, bVar)) {
                this.f24080b = bVar;
                this.f24079a.b(this);
            }
        }

        @Override // gj.b
        public void dispose() {
            this.f24080b.dispose();
            this.f24080b = kj.b.DISPOSED;
        }

        @Override // gj.b
        public boolean h() {
            return this.f24080b.h();
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24080b = kj.b.DISPOSED;
            this.f24079a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            this.f24080b = kj.b.DISPOSED;
            this.f24079a.onSuccess(Boolean.FALSE);
        }
    }

    public l(dj.n<T> nVar) {
        this.f24078a = nVar;
    }

    @Override // mj.c
    public dj.j<Boolean> a() {
        return yj.a.l(new k(this.f24078a));
    }

    @Override // dj.s
    protected void k(dj.t<? super Boolean> tVar) {
        this.f24078a.a(new a(tVar));
    }
}
