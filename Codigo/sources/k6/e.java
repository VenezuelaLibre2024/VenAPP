package k6;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    private static final e f20371c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f20372a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20373b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f20374a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f20375b = 0;

        a() {
        }

        public e a() {
            return new e(this.f20374a, this.f20375b);
        }

        public a b(long j10) {
            this.f20374a = j10;
            return this;
        }

        public a c(long j10) {
            this.f20375b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f20372a = j10;
        this.f20373b = j11;
    }

    public static a c() {
        return new a();
    }

    @md.d(tag = 1)
    public long a() {
        return this.f20372a;
    }

    @md.d(tag = 2)
    public long b() {
        return this.f20373b;
    }
}
