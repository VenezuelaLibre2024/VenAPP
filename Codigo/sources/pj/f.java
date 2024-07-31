package pj;

/* loaded from: classes3.dex */
public final class f<T> extends dj.j<T> implements mj.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final dj.f<T> f23116a;

    /* renamed from: b, reason: collision with root package name */
    final long f23117b;

    /* loaded from: classes3.dex */
    static final class a<T> implements dj.i<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f23118a;

        /* renamed from: b, reason: collision with root package name */
        final long f23119b;

        /* renamed from: c, reason: collision with root package name */
        im.c f23120c;

        /* renamed from: d, reason: collision with root package name */
        long f23121d;

        /* renamed from: e, reason: collision with root package name */
        boolean f23122e;

        a(dj.l<? super T> lVar, long j10) {
            this.f23118a = lVar;
            this.f23119b = j10;
        }

        @Override // im.b
        public void a() {
            this.f23120c = wj.g.CANCELLED;
            if (this.f23122e) {
                return;
            }
            this.f23122e = true;
            this.f23118a.a();
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f23122e) {
                return;
            }
            long j10 = this.f23121d;
            if (j10 != this.f23119b) {
                this.f23121d = j10 + 1;
                return;
            }
            this.f23122e = true;
            this.f23120c.cancel();
            this.f23120c = wj.g.CANCELLED;
            this.f23118a.onSuccess(t10);
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23120c, cVar)) {
                this.f23120c = cVar;
                this.f23118a.b(this);
                cVar.i(Long.MAX_VALUE);
            }
        }

        @Override // gj.b
        public void dispose() {
            this.f23120c.cancel();
            this.f23120c = wj.g.CANCELLED;
        }

        @Override // gj.b
        public boolean h() {
            return this.f23120c == wj.g.CANCELLED;
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (this.f23122e) {
                yj.a.q(th2);
                return;
            }
            this.f23122e = true;
            this.f23120c = wj.g.CANCELLED;
            this.f23118a.onError(th2);
        }
    }

    public f(dj.f<T> fVar, long j10) {
        this.f23116a = fVar;
        this.f23117b = j10;
    }

    @Override // mj.b
    public dj.f<T> d() {
        return yj.a.k(new e(this.f23116a, this.f23117b, null, false));
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f23116a.H(new a(lVar, this.f23117b));
    }
}
