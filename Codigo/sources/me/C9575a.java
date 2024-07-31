package me;

import md.InterfaceC9568c;
import md.InterfaceC9569d;

/* renamed from: me.a */
/* loaded from: classes.dex */
public final class C9575a {

    /* renamed from: p */
    private static final C9575a f23300p = new a().m28501a();

    /* renamed from: a */
    private final long f23301a;

    /* renamed from: b */
    private final String f23302b;

    /* renamed from: c */
    private final String f23303c;

    /* renamed from: d */
    private final c f23304d;

    /* renamed from: e */
    private final d f23305e;

    /* renamed from: f */
    private final String f23306f;

    /* renamed from: g */
    private final String f23307g;

    /* renamed from: h */
    private final int f23308h;

    /* renamed from: i */
    private final int f23309i;

    /* renamed from: j */
    private final String f23310j;

    /* renamed from: k */
    private final long f23311k;

    /* renamed from: l */
    private final b f23312l;

    /* renamed from: m */
    private final String f23313m;

    /* renamed from: n */
    private final long f23314n;

    /* renamed from: o */
    private final String f23315o;

    /* renamed from: me.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f23316a = 0;

        /* renamed from: b */
        private String f23317b = "";

        /* renamed from: c */
        private String f23318c = "";

        /* renamed from: d */
        private c f23319d = c.UNKNOWN;

        /* renamed from: e */
        private d f23320e = d.UNKNOWN_OS;

        /* renamed from: f */
        private String f23321f = "";

        /* renamed from: g */
        private String f23322g = "";

        /* renamed from: h */
        private int f23323h = 0;

        /* renamed from: i */
        private int f23324i = 0;

        /* renamed from: j */
        private String f23325j = "";

        /* renamed from: k */
        private long f23326k = 0;

        /* renamed from: l */
        private b f23327l = b.UNKNOWN_EVENT;

        /* renamed from: m */
        private String f23328m = "";

        /* renamed from: n */
        private long f23329n = 0;

        /* renamed from: o */
        private String f23330o = "";

        a() {
        }

        /* renamed from: a */
        public C9575a m28501a() {
            return new C9575a(this.f23316a, this.f23317b, this.f23318c, this.f23319d, this.f23320e, this.f23321f, this.f23322g, this.f23323h, this.f23324i, this.f23325j, this.f23326k, this.f23327l, this.f23328m, this.f23329n, this.f23330o);
        }

        /* renamed from: b */
        public a m28502b(String str) {
            this.f23328m = str;
            return this;
        }

        /* renamed from: c */
        public a m28503c(String str) {
            this.f23322g = str;
            return this;
        }

        /* renamed from: d */
        public a m28504d(String str) {
            this.f23330o = str;
            return this;
        }

        /* renamed from: e */
        public a m28505e(b bVar) {
            this.f23327l = bVar;
            return this;
        }

        /* renamed from: f */
        public a m28506f(String str) {
            this.f23318c = str;
            return this;
        }

        /* renamed from: g */
        public a m28507g(String str) {
            this.f23317b = str;
            return this;
        }

        /* renamed from: h */
        public a m28508h(c cVar) {
            this.f23319d = cVar;
            return this;
        }

        /* renamed from: i */
        public a m28509i(String str) {
            this.f23321f = str;
            return this;
        }

        /* renamed from: j */
        public a m28510j(long j10) {
            this.f23316a = j10;
            return this;
        }

        /* renamed from: k */
        public a m28511k(d dVar) {
            this.f23320e = dVar;
            return this;
        }

        /* renamed from: l */
        public a m28512l(String str) {
            this.f23325j = str;
            return this;
        }

        /* renamed from: m */
        public a m28513m(int i10) {
            this.f23324i = i10;
            return this;
        }
    }

    /* renamed from: me.a$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC9568c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        b(int i10) {
            this.number_ = i10;
        }

        @Override // md.InterfaceC9568c
        /* renamed from: a */
        public int mo27105a() {
            return this.number_;
        }
    }

    /* renamed from: me.a$c */
    /* loaded from: classes.dex */
    public enum c implements InterfaceC9568c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        c(int i10) {
            this.number_ = i10;
        }

        @Override // md.InterfaceC9568c
        /* renamed from: a */
        public int mo27105a() {
            return this.number_;
        }
    }

    /* renamed from: me.a$d */
    /* loaded from: classes.dex */
    public enum d implements InterfaceC9568c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        d(int i10) {
            this.number_ = i10;
        }

        @Override // md.InterfaceC9568c
        /* renamed from: a */
        public int mo27105a() {
            return this.number_;
        }
    }

    C9575a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f23301a = j10;
        this.f23302b = str;
        this.f23303c = str2;
        this.f23304d = cVar;
        this.f23305e = dVar;
        this.f23306f = str3;
        this.f23307g = str4;
        this.f23308h = i10;
        this.f23309i = i11;
        this.f23310j = str5;
        this.f23311k = j11;
        this.f23312l = bVar;
        this.f23313m = str6;
        this.f23314n = j12;
        this.f23315o = str7;
    }

    /* renamed from: p */
    public static a m28485p() {
        return new a();
    }

    @InterfaceC9569d(tag = 13)
    /* renamed from: a */
    public String m28486a() {
        return this.f23313m;
    }

    @InterfaceC9569d(tag = 11)
    /* renamed from: b */
    public long m28487b() {
        return this.f23311k;
    }

    @InterfaceC9569d(tag = 14)
    /* renamed from: c */
    public long m28488c() {
        return this.f23314n;
    }

    @InterfaceC9569d(tag = 7)
    /* renamed from: d */
    public String m28489d() {
        return this.f23307g;
    }

    @InterfaceC9569d(tag = 15)
    /* renamed from: e */
    public String m28490e() {
        return this.f23315o;
    }

    @InterfaceC9569d(tag = 12)
    /* renamed from: f */
    public b m28491f() {
        return this.f23312l;
    }

    @InterfaceC9569d(tag = 3)
    /* renamed from: g */
    public String m28492g() {
        return this.f23303c;
    }

    @InterfaceC9569d(tag = 2)
    /* renamed from: h */
    public String m28493h() {
        return this.f23302b;
    }

    @InterfaceC9569d(tag = 4)
    /* renamed from: i */
    public c m28494i() {
        return this.f23304d;
    }

    @InterfaceC9569d(tag = 6)
    /* renamed from: j */
    public String m28495j() {
        return this.f23306f;
    }

    @InterfaceC9569d(tag = 8)
    /* renamed from: k */
    public int m28496k() {
        return this.f23308h;
    }

    @InterfaceC9569d(tag = 1)
    /* renamed from: l */
    public long m28497l() {
        return this.f23301a;
    }

    @InterfaceC9569d(tag = 5)
    /* renamed from: m */
    public d m28498m() {
        return this.f23305e;
    }

    @InterfaceC9569d(tag = 10)
    /* renamed from: n */
    public String m28499n() {
        return this.f23310j;
    }

    @InterfaceC9569d(tag = 9)
    /* renamed from: o */
    public int m28500o() {
        return this.f23309i;
    }
}
