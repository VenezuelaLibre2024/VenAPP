package xc;

import xc.f0;

/* loaded from: classes.dex */
final class k extends f0.e.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f31044a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31045b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31046c;

    /* renamed from: d, reason: collision with root package name */
    private final long f31047d;

    /* renamed from: e, reason: collision with root package name */
    private final long f31048e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f31049f;

    /* renamed from: g, reason: collision with root package name */
    private final int f31050g;

    /* renamed from: h, reason: collision with root package name */
    private final String f31051h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31052i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f0.e.c.a {

        /* renamed from: a, reason: collision with root package name */
        private Integer f31053a;

        /* renamed from: b, reason: collision with root package name */
        private String f31054b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f31055c;

        /* renamed from: d, reason: collision with root package name */
        private Long f31056d;

        /* renamed from: e, reason: collision with root package name */
        private Long f31057e;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f31058f;

        /* renamed from: g, reason: collision with root package name */
        private Integer f31059g;

        /* renamed from: h, reason: collision with root package name */
        private String f31060h;

        /* renamed from: i, reason: collision with root package name */
        private String f31061i;

        @Override // xc.f0.e.c.a
        public f0.e.c a() {
            String str = "";
            if (this.f31053a == null) {
                str = " arch";
            }
            if (this.f31054b == null) {
                str = str + " model";
            }
            if (this.f31055c == null) {
                str = str + " cores";
            }
            if (this.f31056d == null) {
                str = str + " ram";
            }
            if (this.f31057e == null) {
                str = str + " diskSpace";
            }
            if (this.f31058f == null) {
                str = str + " simulator";
            }
            if (this.f31059g == null) {
                str = str + " state";
            }
            if (this.f31060h == null) {
                str = str + " manufacturer";
            }
            if (this.f31061i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new k(this.f31053a.intValue(), this.f31054b, this.f31055c.intValue(), this.f31056d.longValue(), this.f31057e.longValue(), this.f31058f.booleanValue(), this.f31059g.intValue(), this.f31060h, this.f31061i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a b(int i10) {
            this.f31053a = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a c(int i10) {
            this.f31055c = Integer.valueOf(i10);
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a d(long j10) {
            this.f31057e = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f31060h = str;
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f31054b = str;
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f31061i = str;
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a h(long j10) {
            this.f31056d = Long.valueOf(j10);
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a i(boolean z10) {
            this.f31058f = Boolean.valueOf(z10);
            return this;
        }

        @Override // xc.f0.e.c.a
        public f0.e.c.a j(int i10) {
            this.f31059g = Integer.valueOf(i10);
            return this;
        }
    }

    private k(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f31044a = i10;
        this.f31045b = str;
        this.f31046c = i11;
        this.f31047d = j10;
        this.f31048e = j11;
        this.f31049f = z10;
        this.f31050g = i12;
        this.f31051h = str2;
        this.f31052i = str3;
    }

    @Override // xc.f0.e.c
    public int b() {
        return this.f31044a;
    }

    @Override // xc.f0.e.c
    public int c() {
        return this.f31046c;
    }

    @Override // xc.f0.e.c
    public long d() {
        return this.f31048e;
    }

    @Override // xc.f0.e.c
    public String e() {
        return this.f31051h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.c)) {
            return false;
        }
        f0.e.c cVar = (f0.e.c) obj;
        return this.f31044a == cVar.b() && this.f31045b.equals(cVar.f()) && this.f31046c == cVar.c() && this.f31047d == cVar.h() && this.f31048e == cVar.d() && this.f31049f == cVar.j() && this.f31050g == cVar.i() && this.f31051h.equals(cVar.e()) && this.f31052i.equals(cVar.g());
    }

    @Override // xc.f0.e.c
    public String f() {
        return this.f31045b;
    }

    @Override // xc.f0.e.c
    public String g() {
        return this.f31052i;
    }

    @Override // xc.f0.e.c
    public long h() {
        return this.f31047d;
    }

    public int hashCode() {
        int hashCode = (((((this.f31044a ^ 1000003) * 1000003) ^ this.f31045b.hashCode()) * 1000003) ^ this.f31046c) * 1000003;
        long j10 = this.f31047d;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f31048e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f31049f ? 1231 : 1237)) * 1000003) ^ this.f31050g) * 1000003) ^ this.f31051h.hashCode()) * 1000003) ^ this.f31052i.hashCode();
    }

    @Override // xc.f0.e.c
    public int i() {
        return this.f31050g;
    }

    @Override // xc.f0.e.c
    public boolean j() {
        return this.f31049f;
    }

    public String toString() {
        return "Device{arch=" + this.f31044a + ", model=" + this.f31045b + ", cores=" + this.f31046c + ", ram=" + this.f31047d + ", diskSpace=" + this.f31048e + ", simulator=" + this.f31049f + ", state=" + this.f31050g + ", manufacturer=" + this.f31051h + ", modelClass=" + this.f31052i + "}";
    }
}
