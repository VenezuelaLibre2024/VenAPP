package qj;

/* loaded from: classes3.dex */
public final class q<T> extends qj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final jj.d<? super gj.b> f24098b;

    /* renamed from: c, reason: collision with root package name */
    final jj.d<? super T> f24099c;

    /* renamed from: d, reason: collision with root package name */
    final jj.d<? super Throwable> f24100d;

    /* renamed from: e, reason: collision with root package name */
    final jj.a f24101e;

    /* renamed from: f, reason: collision with root package name */
    final jj.a f24102f;

    /* renamed from: r, reason: collision with root package name */
    final jj.a f24103r;

    /* loaded from: classes3.dex */
    static final class a<T> implements dj.l<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24104a;

        /* renamed from: b, reason: collision with root package name */
        final q<T> f24105b;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24106c;

        a(dj.l<? super T> lVar, q<T> qVar) {
            this.f24104a = lVar;
            this.f24105b = qVar;
        }

        @Override // dj.l
        public void a() {
            gj.b bVar = this.f24106c;
            kj.b bVar2 = kj.b.DISPOSED;
            if (bVar == bVar2) {
                return;
            }
            try {
                this.f24105b.f24101e.run();
                this.f24106c = bVar2;
                this.f24104a.a();
                c();
            } catch (Throwable th2) {
                hj.b.b(th2);
                d(th2);
            }
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24106c, bVar)) {
                try {
                    this.f24105b.f24098b.accept(bVar);
                    this.f24106c = bVar;
                    this.f24104a.b(this);
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    bVar.dispose();
                    this.f24106c = kj.b.DISPOSED;
                    kj.c.o(th2, this.f24104a);
                }
            }
        }

        void c() {
            try {
                this.f24105b.f24102f.run();
            } catch (Throwable th2) {
                hj.b.b(th2);
                yj.a.q(th2);
            }
        }

        void d(Throwable th2) {
            try {
                this.f24105b.f24100d.accept(th2);
            } catch (Throwable th3) {
                hj.b.b(th3);
                th2 = new hj.a(th2, th3);
            }
            this.f24106c = kj.b.DISPOSED;
            this.f24104a.onError(th2);
            c();
        }

        @Override // gj.b
        public void dispose() {
            try {
                this.f24105b.f24103r.run();
            } catch (Throwable th2) {
                hj.b.b(th2);
                yj.a.q(th2);
            }
            this.f24106c.dispose();
            this.f24106c = kj.b.DISPOSED;
        }

        @Override // gj.b
        public boolean h() {
            return this.f24106c.h();
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            if (this.f24106c == kj.b.DISPOSED) {
                yj.a.q(th2);
            } else {
                d(th2);
            }
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            gj.b bVar = this.f24106c;
            kj.b bVar2 = kj.b.DISPOSED;
            if (bVar == bVar2) {
                return;
            }
            try {
                this.f24105b.f24099c.accept(t10);
                this.f24106c = bVar2;
                this.f24104a.onSuccess(t10);
                c();
            } catch (Throwable th2) {
                hj.b.b(th2);
                d(th2);
            }
        }
    }

    public q(dj.n<T> nVar, jj.d<? super gj.b> dVar, jj.d<? super T> dVar2, jj.d<? super Throwable> dVar3, jj.a aVar, jj.a aVar2, jj.a aVar3) {
        super(nVar);
        this.f24098b = dVar;
        this.f24099c = dVar2;
        this.f24100d = dVar3;
        this.f24101e = aVar;
        this.f24102f = aVar2;
        this.f24103r = aVar3;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f24047a.a(new a(lVar, this));
    }
}
