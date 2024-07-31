package vi;

import vi.g;

/* loaded from: classes3.dex */
public abstract class y<ReqT, RespT> extends b1<ReqT, RespT> {

    /* loaded from: classes3.dex */
    public static abstract class a<ReqT, RespT> extends y<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        private final g<ReqT, RespT> f29261a;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(g<ReqT, RespT> gVar) {
            this.f29261a = gVar;
        }

        @Override // vi.y, vi.b1, vi.g
        public /* bridge */ /* synthetic */ void a(String str, Throwable th2) {
            super.a(str, th2);
        }

        @Override // vi.y, vi.b1, vi.g
        public /* bridge */ /* synthetic */ void b() {
            super.b();
        }

        @Override // vi.y, vi.b1, vi.g
        public /* bridge */ /* synthetic */ void c(int i10) {
            super.c(i10);
        }

        @Override // vi.y, vi.b1
        protected g<ReqT, RespT> f() {
            return this.f29261a;
        }

        @Override // vi.y, vi.b1
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // vi.b1, vi.g
    public /* bridge */ /* synthetic */ void a(String str, Throwable th2) {
        super.a(str, th2);
    }

    @Override // vi.b1, vi.g
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // vi.b1, vi.g
    public /* bridge */ /* synthetic */ void c(int i10) {
        super.c(i10);
    }

    @Override // vi.g
    public void d(ReqT reqt) {
        f().d(reqt);
    }

    @Override // vi.g
    public void e(g.a<RespT> aVar, w0 w0Var) {
        f().e(aVar, w0Var);
    }

    @Override // vi.b1
    protected abstract g<ReqT, RespT> f();

    @Override // vi.b1
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
