package qj;

/* loaded from: classes3.dex */
public final class j<T> extends dj.j<T> {

    /* renamed from: a, reason: collision with root package name */
    final dj.d f24073a;

    /* loaded from: classes3.dex */
    static final class a<T> implements dj.c, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24074a;

        /* renamed from: b, reason: collision with root package name */
        gj.b f24075b;

        a(dj.l<? super T> lVar) {
            this.f24074a = lVar;
        }

        @Override // dj.c
        public void a() {
            this.f24075b = kj.b.DISPOSED;
            this.f24074a.a();
        }

        @Override // dj.c
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24075b, bVar)) {
                this.f24075b = bVar;
                this.f24074a.b(this);
            }
        }

        @Override // gj.b
        public void dispose() {
            this.f24075b.dispose();
            this.f24075b = kj.b.DISPOSED;
        }

        @Override // gj.b
        public boolean h() {
            return this.f24075b.h();
        }

        @Override // dj.c
        public void onError(Throwable th2) {
            this.f24075b = kj.b.DISPOSED;
            this.f24074a.onError(th2);
        }
    }

    public j(dj.d dVar) {
        this.f24073a = dVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f24073a.a(new a(lVar));
    }
}
