package k6;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f20358b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final e f20359a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private e f20360a = null;

        a() {
        }

        public b a() {
            return new b(this.f20360a);
        }

        public a b(e eVar) {
            this.f20360a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f20359a = eVar;
    }

    public static a b() {
        return new a();
    }

    @md.d(tag = 1)
    public e a() {
        return this.f20359a;
    }
}
