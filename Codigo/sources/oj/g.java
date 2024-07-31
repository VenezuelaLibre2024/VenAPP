package oj;

/* loaded from: classes3.dex */
public final class g extends dj.b {

    /* renamed from: a, reason: collision with root package name */
    final dj.d f22672a;

    /* renamed from: b, reason: collision with root package name */
    final jj.d<? super gj.b> f22673b;

    /* renamed from: c, reason: collision with root package name */
    final jj.d<? super Throwable> f22674c;

    /* renamed from: d, reason: collision with root package name */
    final jj.a f22675d;

    /* renamed from: e, reason: collision with root package name */
    final jj.a f22676e;

    /* renamed from: f, reason: collision with root package name */
    final jj.a f22677f;

    /* renamed from: r, reason: collision with root package name */
    final jj.a f22678r;

    /* loaded from: classes3.dex */
    final class a implements dj.c, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.c f22679a;

        /* renamed from: b, reason: collision with root package name */
        gj.b f22680b;

        a(dj.c cVar) {
            this.f22679a = cVar;
        }

        @Override // dj.c
        public void a() {
            if (this.f22680b == kj.b.DISPOSED) {
                return;
            }
            try {
                g.this.f22675d.run();
                g.this.f22676e.run();
                this.f22679a.a();
                c();
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f22679a.onError(th2);
            }
        }

        @Override // dj.c
        public void b(gj.b bVar) {
            try {
                g.this.f22673b.accept(bVar);
                if (kj.b.p(this.f22680b, bVar)) {
                    this.f22680b = bVar;
                    this.f22679a.b(this);
                }
            } catch (Throwable th2) {
                hj.b.b(th2);
                bVar.dispose();
                this.f22680b = kj.b.DISPOSED;
                kj.c.n(th2, this.f22679a);
            }
        }

        void c() {
            try {
                g.this.f22677f.run();
            } catch (Throwable th2) {
                hj.b.b(th2);
                yj.a.q(th2);
            }
        }

        @Override // gj.b
        public void dispose() {
            try {
                g.this.f22678r.run();
            } catch (Throwable th2) {
                hj.b.b(th2);
                yj.a.q(th2);
            }
            this.f22680b.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f22680b.h();
        }

        @Override // dj.c
        public void onError(Throwable th2) {
            if (this.f22680b == kj.b.DISPOSED) {
                yj.a.q(th2);
                return;
            }
            try {
                g.this.f22674c.accept(th2);
                g.this.f22676e.run();
            } catch (Throwable th3) {
                hj.b.b(th3);
                th2 = new hj.a(th2, th3);
            }
            this.f22679a.onError(th2);
            c();
        }
    }

    public g(dj.d dVar, jj.d<? super gj.b> dVar2, jj.d<? super Throwable> dVar3, jj.a aVar, jj.a aVar2, jj.a aVar3, jj.a aVar4) {
        this.f22672a = dVar;
        this.f22673b = dVar2;
        this.f22674c = dVar3;
        this.f22675d = aVar;
        this.f22676e = aVar2;
        this.f22677f = aVar3;
        this.f22678r = aVar4;
    }

    @Override // dj.b
    protected void p(dj.c cVar) {
        this.f22672a.a(new a(cVar));
    }
}
