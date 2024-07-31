package k6;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    private static final f f20376c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f20377a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20378b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f20379a = 0;

        /* renamed from: b, reason: collision with root package name */
        private long f20380b = 0;

        a() {
        }

        public f a() {
            return new f(this.f20379a, this.f20380b);
        }

        public a b(long j10) {
            this.f20380b = j10;
            return this;
        }

        public a c(long j10) {
            this.f20379a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f20377a = j10;
        this.f20378b = j11;
    }

    public static a c() {
        return new a();
    }

    @md.d(tag = 2)
    public long a() {
        return this.f20378b;
    }

    @md.d(tag = 1)
    public long b() {
        return this.f20377a;
    }
}
