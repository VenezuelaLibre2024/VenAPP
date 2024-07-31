package oj;

/* loaded from: classes3.dex */
public final class f extends dj.b {

    /* renamed from: a, reason: collision with root package name */
    final dj.d f22668a;

    /* renamed from: b, reason: collision with root package name */
    final jj.g<? super Throwable> f22669b;

    /* loaded from: classes3.dex */
    final class a implements dj.c {

        /* renamed from: a, reason: collision with root package name */
        private final dj.c f22670a;

        a(dj.c cVar) {
            this.f22670a = cVar;
        }

        @Override // dj.c
        public void a() {
            this.f22670a.a();
        }

        @Override // dj.c
        public void b(gj.b bVar) {
            this.f22670a.b(bVar);
        }

        @Override // dj.c
        public void onError(Throwable th2) {
            try {
                if (f.this.f22669b.test(th2)) {
                    this.f22670a.a();
                } else {
                    this.f22670a.onError(th2);
                }
            } catch (Throwable th3) {
                hj.b.b(th3);
                this.f22670a.onError(new hj.a(th2, th3));
            }
        }
    }

    public f(dj.d dVar, jj.g<? super Throwable> gVar) {
        this.f22668a = dVar;
        this.f22669b = gVar;
    }

    @Override // dj.b
    protected void p(dj.c cVar) {
        this.f22668a.a(new a(cVar));
    }
}
