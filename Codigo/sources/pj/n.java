package pj;

/* loaded from: classes3.dex */
public final class n<T> extends dj.f<T> {

    /* renamed from: b, reason: collision with root package name */
    private final dj.o<T> f23196b;

    /* loaded from: classes3.dex */
    static class a<T> implements dj.q<T>, im.c {

        /* renamed from: a, reason: collision with root package name */
        private final im.b<? super T> f23197a;

        /* renamed from: b, reason: collision with root package name */
        private gj.b f23198b;

        a(im.b<? super T> bVar) {
            this.f23197a = bVar;
        }

        @Override // dj.q
        public void a() {
            this.f23197a.a();
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            this.f23198b = bVar;
            this.f23197a.d(this);
        }

        @Override // dj.q
        public void c(T t10) {
            this.f23197a.c(t10);
        }

        @Override // im.c
        public void cancel() {
            this.f23198b.dispose();
        }

        @Override // im.c
        public void i(long j10) {
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            this.f23197a.onError(th2);
        }
    }

    public n(dj.o<T> oVar) {
        this.f23196b = oVar;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f23196b.d(new a(bVar));
    }
}
