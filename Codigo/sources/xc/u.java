package xc;

import xc.f0;

/* loaded from: classes.dex */
final class u extends f0.e.d.c {

    /* renamed from: a, reason: collision with root package name */
    private final Double f31146a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31147b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31148c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31149d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31150e;

    /* renamed from: f, reason: collision with root package name */
    private final long f31151f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Double f31152a;

        /* renamed from: b, reason: collision with root package name */
        private Integer f31153b;

        /* renamed from: c, reason: collision with root package name */
        private Boolean f31154c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f31155d;

        /* renamed from: e, reason: collision with root package name */
        private Long f31156e;

        /* renamed from: f, reason: collision with root package name */
        private Long f31157f;

        @Override // xc.f0.e.d.c.a
        public f0.e.d.c a() {
            String str = "";
            if (this.f31153b == null) {
                str = " batteryVelocity";
            }
            if (this.f31154c == null) {
                str = str + " proximityOn";
            }
            if (this.f31155d == null) {
                str = str + " orientation";
            }
            if (this.f31156e == null) {
                str = str + " ramUsed";
            }
            if (this.f31157f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new u(this.f31152a, this.f31153b.intValue(), this.f31154c.booleanValue(), this.f31155d.intValue(), this.f31156e.longValue(), this.f31157f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.c.a
        public f0.e.d.c.a b(Double d10) {
            this.f31152a = d10;
            return this;
        }

        @Override // xc.f0.e.d.c.a
        public f0.e.d.c.a c(int i10) {
            this.f31153b = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.d.c.a
        public f0.e.d.c.a d(long j10) {
            this.f31157f = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.d.c.a
        public f0.e.d.c.a e(int i10) {
            this.f31155d = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.d.c.a
        public f0.e.d.c.a f(boolean z10) {
            this.f31154c = Boolean.valueOf(z10);
            return this;
        }

        @Override // xc.f0.e.d.c.a
        public f0.e.d.c.a g(long j10) {
            this.f31156e = Long.valueOf(j10);
            return this;
        }
    }

    private u(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f31146a = d10;
        this.f31147b = i10;
        this.f31148c = z10;
        this.f31149d = i11;
        this.f31150e = j10;
        this.f31151f = j11;
    }

    @Override // xc.f0.e.d.c
    public Double b() {
        return this.f31146a;
    }

    @Override // xc.f0.e.d.c
    public int c() {
        return this.f31147b;
    }

    @Override // xc.f0.e.d.c
    public long d() {
        return this.f31151f;
    }

    @Override // xc.f0.e.d.c
    public int e() {
        return this.f31149d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.c)) {
            return false;
        }
        f0.e.d.c cVar = (f0.e.d.c) obj;
        Double d10 = this.f31146a;
        if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
            if (this.f31147b == cVar.c() && this.f31148c == cVar.g() && this.f31149d == cVar.e() && this.f31150e == cVar.f() && this.f31151f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // xc.f0.e.d.c
    public long f() {
        return this.f31150e;
    }

    @Override // xc.f0.e.d.c
    public boolean g() {
        return this.f31148c;
    }

    public int hashCode() {
        Double d10 = this.f31146a;
        int hashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f31147b) * 1000003) ^ (this.f31148c ? 1231 : 1237)) * 1000003) ^ this.f31149d) * 1000003;
        long j10 = this.f31150e;
        long j11 = this.f31151f;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f31146a + ", batteryVelocity=" + this.f31147b + ", proximityOn=" + this.f31148c + ", orientation=" + this.f31149d + ", ramUsed=" + this.f31150e + ", diskUsed=" + this.f31151f + "}";
    }
}
