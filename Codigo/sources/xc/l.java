package xc;

import xc.f0;

/* loaded from: classes.dex */
final class l extends f0.e.d {

    /* renamed from: a, reason: collision with root package name */
    private final long f31062a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31063b;

    /* renamed from: c, reason: collision with root package name */
    private final f0.e.d.a f31064c;

    /* renamed from: d, reason: collision with root package name */
    private final f0.e.d.c f31065d;

    /* renamed from: e, reason: collision with root package name */
    private final f0.e.d.AbstractC0518d f31066e;

    /* renamed from: f, reason: collision with root package name */
    private final f0.e.d.f f31067f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.d.b {

        /* renamed from: a, reason: collision with root package name */
        private Long f31068a;

        /* renamed from: b, reason: collision with root package name */
        private String f31069b;

        /* renamed from: c, reason: collision with root package name */
        private f0.e.d.a f31070c;

        /* renamed from: d, reason: collision with root package name */
        private f0.e.d.c f31071d;

        /* renamed from: e, reason: collision with root package name */
        private f0.e.d.AbstractC0518d f31072e;

        /* renamed from: f, reason: collision with root package name */
        private f0.e.d.f f31073f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(f0.e.d dVar) {
            this.f31068a = Long.valueOf(dVar.f());
            this.f31069b = dVar.g();
            this.f31070c = dVar.b();
            this.f31071d = dVar.c();
            this.f31072e = dVar.d();
            this.f31073f = dVar.e();
        }

        @Override // xc.f0.e.d.b
        public f0.e.d a() {
            String str = "";
            if (this.f31068a == null) {
                str = " timestamp";
            }
            if (this.f31069b == null) {
                str = str + " type";
            }
            if (this.f31070c == null) {
                str = str + " app";
            }
            if (this.f31071d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f31068a.longValue(), this.f31069b, this.f31070c, this.f31071d, this.f31072e, this.f31073f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.d.b
        public f0.e.d.b b(f0.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f31070c = aVar;
            return this;
        }

        @Override // xc.f0.e.d.b
        public f0.e.d.b c(f0.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f31071d = cVar;
            return this;
        }

        @Override // xc.f0.e.d.b
        public f0.e.d.b d(f0.e.d.AbstractC0518d abstractC0518d) {
            this.f31072e = abstractC0518d;
            return this;
        }

        @Override // xc.f0.e.d.b
        public f0.e.d.b e(f0.e.d.f fVar) {
            this.f31073f = fVar;
            return this;
        }

        @Override // xc.f0.e.d.b
        public f0.e.d.b f(long j10) {
            this.f31068a = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.d.b
        public f0.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f31069b = str;
            return this;
        }
    }

    private l(long j10, String str, f0.e.d.a aVar, f0.e.d.c cVar, f0.e.d.AbstractC0518d abstractC0518d, f0.e.d.f fVar) {
        this.f31062a = j10;
        this.f31063b = str;
        this.f31064c = aVar;
        this.f31065d = cVar;
        this.f31066e = abstractC0518d;
        this.f31067f = fVar;
    }

    @Override // xc.f0.e.d
    public f0.e.d.a b() {
        return this.f31064c;
    }

    @Override // xc.f0.e.d
    public f0.e.d.c c() {
        return this.f31065d;
    }

    @Override // xc.f0.e.d
    public f0.e.d.AbstractC0518d d() {
        return this.f31066e;
    }

    @Override // xc.f0.e.d
    public f0.e.d.f e() {
        return this.f31067f;
    }

    public boolean equals(Object obj) {
        f0.e.d.AbstractC0518d abstractC0518d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d)) {
            return false;
        }
        f0.e.d dVar = (f0.e.d) obj;
        if (this.f31062a == dVar.f() && this.f31063b.equals(dVar.g()) && this.f31064c.equals(dVar.b()) && this.f31065d.equals(dVar.c()) && ((abstractC0518d = this.f31066e) != null ? abstractC0518d.equals(dVar.d()) : dVar.d() == null)) {
            f0.e.d.f fVar = this.f31067f;
            f0.e.d.f e10 = dVar.e();
            if (fVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (fVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    @Override // xc.f0.e.d
    public long f() {
        return this.f31062a;
    }

    @Override // xc.f0.e.d
    public String g() {
        return this.f31063b;
    }

    @Override // xc.f0.e.d
    public f0.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f31062a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f31063b.hashCode()) * 1000003) ^ this.f31064c.hashCode()) * 1000003) ^ this.f31065d.hashCode()) * 1000003;
        f0.e.d.AbstractC0518d abstractC0518d = this.f31066e;
        int hashCode2 = (hashCode ^ (abstractC0518d == null ? 0 : abstractC0518d.hashCode())) * 1000003;
        f0.e.d.f fVar = this.f31067f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f31062a + ", type=" + this.f31063b + ", app=" + this.f31064c + ", device=" + this.f31065d + ", log=" + this.f31066e + ", rollouts=" + this.f31067f + "}";
    }
}
