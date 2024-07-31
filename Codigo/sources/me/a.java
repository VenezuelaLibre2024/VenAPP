package me;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: p, reason: collision with root package name */
    private static final a f21446p = new C0345a().a();

    /* renamed from: a, reason: collision with root package name */
    private final long f21447a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21448b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21449c;

    /* renamed from: d, reason: collision with root package name */
    private final c f21450d;

    /* renamed from: e, reason: collision with root package name */
    private final d f21451e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21452f;

    /* renamed from: g, reason: collision with root package name */
    private final String f21453g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21454h;

    /* renamed from: i, reason: collision with root package name */
    private final int f21455i;

    /* renamed from: j, reason: collision with root package name */
    private final String f21456j;

    /* renamed from: k, reason: collision with root package name */
    private final long f21457k;

    /* renamed from: l, reason: collision with root package name */
    private final b f21458l;

    /* renamed from: m, reason: collision with root package name */
    private final String f21459m;

    /* renamed from: n, reason: collision with root package name */
    private final long f21460n;

    /* renamed from: o, reason: collision with root package name */
    private final String f21461o;

    /* renamed from: me.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0345a {

        /* renamed from: a, reason: collision with root package name */
        private long f21462a = 0;

        /* renamed from: b, reason: collision with root package name */
        private String f21463b = "";

        /* renamed from: c, reason: collision with root package name */
        private String f21464c = "";

        /* renamed from: d, reason: collision with root package name */
        private c f21465d = c.UNKNOWN;

        /* renamed from: e, reason: collision with root package name */
        private d f21466e = d.UNKNOWN_OS;

        /* renamed from: f, reason: collision with root package name */
        private String f21467f = "";

        /* renamed from: g, reason: collision with root package name */
        private String f21468g = "";

        /* renamed from: h, reason: collision with root package name */
        private int f21469h = 0;

        /* renamed from: i, reason: collision with root package name */
        private int f21470i = 0;

        /* renamed from: j, reason: collision with root package name */
        private String f21471j = "";

        /* renamed from: k, reason: collision with root package name */
        private long f21472k = 0;

        /* renamed from: l, reason: collision with root package name */
        private b f21473l = b.UNKNOWN_EVENT;

        /* renamed from: m, reason: collision with root package name */
        private String f21474m = "";

        /* renamed from: n, reason: collision with root package name */
        private long f21475n = 0;

        /* renamed from: o, reason: collision with root package name */
        private String f21476o = "";

        C0345a() {
        }

        public a a() {
            return new a(this.f21462a, this.f21463b, this.f21464c, this.f21465d, this.f21466e, this.f21467f, this.f21468g, this.f21469h, this.f21470i, this.f21471j, this.f21472k, this.f21473l, this.f21474m, this.f21475n, this.f21476o);
        }

        public C0345a b(String str) {
            this.f21474m = str;
            return this;
        }

        public C0345a c(String str) {
            this.f21468g = str;
            return this;
        }

        public C0345a d(String str) {
            this.f21476o = str;
            return this;
        }

        public C0345a e(b bVar) {
            this.f21473l = bVar;
            return this;
        }

        public C0345a f(String str) {
            this.f21464c = str;
            return this;
        }

        public C0345a g(String str) {
            this.f21463b = str;
            return this;
        }

        public C0345a h(c cVar) {
            this.f21465d = cVar;
            return this;
        }

        public C0345a i(String str) {
            this.f21467f = str;
            return this;
        }

        public C0345a j(long j10) {
            this.f21462a = j10;
            return this;
        }

        public C0345a k(d dVar) {
            this.f21466e = dVar;
            return this;
        }

        public C0345a l(String str) {
            this.f21471j = str;
            return this;
        }

        public C0345a m(int i10) {
            this.f21470i = i10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum b implements md.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // md.c
        public int a() {
            return this.number_;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements md.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i10) {
            this.number_ = i10;
        }

        @Override // md.c
        public int a() {
            return this.number_;
        }
    }

    /* loaded from: classes.dex */
    public enum d implements md.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i10) {
            this.number_ = i10;
        }

        @Override // md.c
        public int a() {
            return this.number_;
        }
    }

    a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f21447a = j10;
        this.f21448b = str;
        this.f21449c = str2;
        this.f21450d = cVar;
        this.f21451e = dVar;
        this.f21452f = str3;
        this.f21453g = str4;
        this.f21454h = i10;
        this.f21455i = i11;
        this.f21456j = str5;
        this.f21457k = j11;
        this.f21458l = bVar;
        this.f21459m = str6;
        this.f21460n = j12;
        this.f21461o = str7;
    }

    public static C0345a p() {
        return new C0345a();
    }

    @md.d(tag = 13)
    public String a() {
        return this.f21459m;
    }

    @md.d(tag = 11)
    public long b() {
        return this.f21457k;
    }

    @md.d(tag = 14)
    public long c() {
        return this.f21460n;
    }

    @md.d(tag = 7)
    public String d() {
        return this.f21453g;
    }

    @md.d(tag = 15)
    public String e() {
        return this.f21461o;
    }

    @md.d(tag = 12)
    public b f() {
        return this.f21458l;
    }

    @md.d(tag = 3)
    public String g() {
        return this.f21449c;
    }

    @md.d(tag = 2)
    public String h() {
        return this.f21448b;
    }

    @md.d(tag = 4)
    public c i() {
        return this.f21450d;
    }

    @md.d(tag = 6)
    public String j() {
        return this.f21452f;
    }

    @md.d(tag = 8)
    public int k() {
        return this.f21454h;
    }

    @md.d(tag = 1)
    public long l() {
        return this.f21447a;
    }

    @md.d(tag = 5)
    public d m() {
        return this.f21451e;
    }

    @md.d(tag = 10)
    public String n() {
        return this.f21456j;
    }

    @md.d(tag = 9)
    public int o() {
        return this.f21455i;
    }
}
