package k6;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final c f20361c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f20362a;

    /* renamed from: b, reason: collision with root package name */
    private final b f20363b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f20364a = 0;

        /* renamed from: b, reason: collision with root package name */
        private b f20365b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f20364a, this.f20365b);
        }

        public a b(long j10) {
            this.f20364a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f20365b = bVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements md.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // md.c
        public int a() {
            return this.number_;
        }
    }

    c(long j10, b bVar) {
        this.f20362a = j10;
        this.f20363b = bVar;
    }

    public static a c() {
        return new a();
    }

    @md.d(tag = 1)
    public long a() {
        return this.f20362a;
    }

    @md.d(tag = 3)
    public b b() {
        return this.f20363b;
    }
}
