package qj;

/* loaded from: classes3.dex */
public final class e<T> extends qj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final jj.g<? super T> f24054b;

    /* loaded from: classes3.dex */
    static final class a<T> implements dj.l<T>, gj.b {

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24055a;

        /* renamed from: b, reason: collision with root package name */
        final jj.g<? super T> f24056b;

        /* renamed from: c, reason: collision with root package name */
        gj.b f24057c;

        a(dj.l<? super T> lVar, jj.g<? super T> gVar) {
            this.f24055a = lVar;
            this.f24056b = gVar;
        }

        @Override // dj.l
        public void a() {
            this.f24055a.a();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24057c, bVar)) {
                this.f24057c = bVar;
                this.f24055a.b(this);
            }
        }

        @Override // gj.b
        public void dispose() {
            gj.b bVar = this.f24057c;
            this.f24057c = kj.b.DISPOSED;
            bVar.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f24057c.h();
        }

        @Override // dj.l
        public void onError(Throwable th2) {
            this.f24055a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            try {
                if (this.f24056b.test(t10)) {
                    this.f24055a.onSuccess(t10);
                } else {
                    this.f24055a.a();
                }
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f24055a.onError(th2);
            }
        }
    }

    public e(dj.n<T> nVar, jj.g<? super T> gVar) {
        super(nVar);
        this.f24054b = gVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f24047a.a(new a(lVar, this.f24054b));
    }
}
