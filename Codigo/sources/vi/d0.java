package vi;

/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f29081a;

    /* renamed from: b, reason: collision with root package name */
    public final b f29082b;

    /* renamed from: c, reason: collision with root package name */
    public final long f29083c;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f29084d;

    /* renamed from: e, reason: collision with root package name */
    public final n0 f29085e;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f29086a;

        /* renamed from: b, reason: collision with root package name */
        private b f29087b;

        /* renamed from: c, reason: collision with root package name */
        private Long f29088c;

        /* renamed from: d, reason: collision with root package name */
        private n0 f29089d;

        /* renamed from: e, reason: collision with root package name */
        private n0 f29090e;

        public d0 a() {
            eb.o.p(this.f29086a, "description");
            eb.o.p(this.f29087b, "severity");
            eb.o.p(this.f29088c, "timestampNanos");
            eb.o.v(this.f29089d == null || this.f29090e == null, "at least one of channelRef and subchannelRef must be null");
            return new d0(this.f29086a, this.f29087b, this.f29088c.longValue(), this.f29089d, this.f29090e);
        }

        public a b(String str) {
            this.f29086a = str;
            return this;
        }

        public a c(b bVar) {
            this.f29087b = bVar;
            return this;
        }

        public a d(n0 n0Var) {
            this.f29090e = n0Var;
            return this;
        }

        public a e(long j10) {
            this.f29088c = Long.valueOf(j10);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    private d0(String str, b bVar, long j10, n0 n0Var, n0 n0Var2) {
        this.f29081a = str;
        this.f29082b = (b) eb.o.p(bVar, "severity");
        this.f29083c = j10;
        this.f29084d = n0Var;
        this.f29085e = n0Var2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return eb.k.a(this.f29081a, d0Var.f29081a) && eb.k.a(this.f29082b, d0Var.f29082b) && this.f29083c == d0Var.f29083c && eb.k.a(this.f29084d, d0Var.f29084d) && eb.k.a(this.f29085e, d0Var.f29085e);
    }

    public int hashCode() {
        return eb.k.b(this.f29081a, this.f29082b, Long.valueOf(this.f29083c), this.f29084d, this.f29085e);
    }

    public String toString() {
        return eb.i.c(this).d("description", this.f29081a).d("severity", this.f29082b).c("timestampNanos", this.f29083c).d("channelRef", this.f29084d).d("subchannelRef", this.f29085e).toString();
    }
}
