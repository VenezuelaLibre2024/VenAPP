package h0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final h0.a f16350a;

    /* renamed from: b, reason: collision with root package name */
    private final d f16351b;

    /* renamed from: c, reason: collision with root package name */
    private final int f16352c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private h0.a f16353a;

        /* renamed from: b, reason: collision with root package name */
        private d f16354b;

        /* renamed from: c, reason: collision with root package name */
        private int f16355c;

        public a() {
            this.f16353a = h0.a.f16346c;
            this.f16354b = null;
            this.f16355c = 0;
        }

        private a(c cVar) {
            this.f16353a = h0.a.f16346c;
            this.f16354b = null;
            this.f16355c = 0;
            this.f16353a = cVar.b();
            this.f16354b = cVar.d();
            cVar.c();
            this.f16355c = cVar.a();
        }

        public static a b(c cVar) {
            return new a(cVar);
        }

        public c a() {
            return new c(this.f16353a, this.f16354b, null, this.f16355c);
        }

        public a c(int i10) {
            this.f16355c = i10;
            return this;
        }

        public a d(h0.a aVar) {
            this.f16353a = aVar;
            return this;
        }

        public a e(d dVar) {
            this.f16354b = dVar;
            return this;
        }
    }

    c(h0.a aVar, d dVar, b bVar, int i10) {
        this.f16350a = aVar;
        this.f16351b = dVar;
        this.f16352c = i10;
    }

    public int a() {
        return this.f16352c;
    }

    public h0.a b() {
        return this.f16350a;
    }

    public b c() {
        return null;
    }

    public d d() {
        return this.f16351b;
    }
}
