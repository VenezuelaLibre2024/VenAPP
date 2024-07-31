package qj;

/* loaded from: classes3.dex */
public final class k<T> extends qj.a<T, Boolean> {

    /* loaded from: classes3.dex */
    static final class a<T> implements dj.l<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super Boolean> f24076a;

        /* renamed from: b, reason: collision with root package name */
        gj.b f24077b;

        a(dj.l<? super Boolean> lVar) {
            this.f24076a = lVar;
        }

        @Override // dj.l
        public void a() {
            this.f24076a.onSuccess(Boolean.TRUE);
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24077b, bVar)) {
                this.f24077b = bVar;
                this.f24076a.b(this);
            }
        }

        @Override // gj.b
        public void dispose() {
            this.f24077b.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f24077b.h();
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24076a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            this.f24076a.onSuccess(Boolean.FALSE);
        }
    }

    public k(dj.n<T> nVar) {
        super(nVar);
    }

    @Override // dj.j
    protected void u(dj.l<? super Boolean> lVar) {
        this.f24047a.a(new a(lVar));
    }
}
