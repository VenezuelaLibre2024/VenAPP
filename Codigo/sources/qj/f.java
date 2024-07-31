package qj;

/* loaded from: classes3.dex */
public final class f<T> extends dj.j<T> {

    /* renamed from: a */
    final dj.u<T> f24058a;

    /* renamed from: b */
    final jj.g<? super T> f24059b;

    /* loaded from: classes3.dex */
    static final class a<T> implements dj.t<T>, gj.b {

        /* renamed from: a */
        final dj.l<? super T> f24060a;

        /* renamed from: b */
        final jj.g<? super T> f24061b;

        /* renamed from: c */
        gj.b f24062c;

        a(dj.l<? super T> lVar, jj.g<? super T> gVar) {
            this.f24060a = lVar;
            this.f24061b = gVar;
        }

        @Override // dj.t
        public void b(gj.b bVar) {
            if (kj.b.p(this.f24062c, bVar)) {
                this.f24062c = bVar;
                this.f24060a.b(this);
            }
        }

        @Override // gj.b
        public void dispose() {
            gj.b bVar = this.f24062c;
            this.f24062c = kj.b.DISPOSED;
            bVar.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f24062c.h();
        }

        @Override // dj.t
        public void onError(Throwable th2) {
            this.f24060a.onError(th2);
        }

        @Override // dj.t
        public void onSuccess(T t10) {
            try {
                if (this.f24061b.test(t10)) {
                    this.f24060a.onSuccess(t10);
                } else {
                    this.f24060a.a();
                }
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f24060a.onError(th2);
            }
        }
    }

    public f(dj.u<T> uVar, jj.g<? super T> gVar) {
        this.f24058a = uVar;
        this.f24059b = gVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f24058a.c(new a(lVar, this.f24059b));
    }
}
