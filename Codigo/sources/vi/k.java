package vi;

/* loaded from: classes3.dex */
public abstract class k extends j1 {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public k a(b bVar, w0 w0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f29137a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29138b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f29139c;

        /* loaded from: classes3.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private c f29140a = c.f29047k;

            /* renamed from: b, reason: collision with root package name */
            private int f29141b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f29142c;

            a() {
            }

            public b a() {
                return new b(this.f29140a, this.f29141b, this.f29142c);
            }

            public a b(c cVar) {
                this.f29140a = (c) eb.o.p(cVar, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z10) {
                this.f29142c = z10;
                return this;
            }

            public a d(int i10) {
                this.f29141b = i10;
                return this;
            }
        }

        b(c cVar, int i10, boolean z10) {
            this.f29137a = (c) eb.o.p(cVar, "callOptions");
            this.f29138b = i10;
            this.f29139c = z10;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return eb.i.c(this).d("callOptions", this.f29137a).b("previousAttempts", this.f29138b).e("isTransparentRetry", this.f29139c).toString();
        }
    }

    public void j() {
    }

    public void k(w0 w0Var) {
    }

    public void l() {
    }

    public void m(vi.a aVar, w0 w0Var) {
    }
}
