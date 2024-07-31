package p126h0;

/* renamed from: h0.c */
/* loaded from: classes.dex */
public final class C7608c {

    /* renamed from: a */
    private final C7606a f17987a;

    /* renamed from: b */
    private final C7609d f17988b;

    /* renamed from: c */
    private final int f17989c;

    /* renamed from: h0.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private C7606a f17990a;

        /* renamed from: b */
        private C7609d f17991b;

        /* renamed from: c */
        private int f17992c;

        public a() {
            this.f17990a = C7606a.f17983c;
            this.f17991b = null;
            this.f17992c = 0;
        }

        private a(C7608c c7608c) {
            this.f17990a = C7606a.f17983c;
            this.f17991b = null;
            this.f17992c = 0;
            this.f17990a = c7608c.m23117b();
            this.f17991b = c7608c.m23119d();
            c7608c.m23118c();
            this.f17992c = c7608c.m23116a();
        }

        /* renamed from: b */
        public static a m23120b(C7608c c7608c) {
            return new a(c7608c);
        }

        /* renamed from: a */
        public C7608c m23121a() {
            return new C7608c(this.f17990a, this.f17991b, null, this.f17992c);
        }

        /* renamed from: c */
        public a m23122c(int i10) {
            this.f17992c = i10;
            return this;
        }

        /* renamed from: d */
        public a m23123d(C7606a c7606a) {
            this.f17990a = c7606a;
            return this;
        }

        /* renamed from: e */
        public a m23124e(C7609d c7609d) {
            this.f17991b = c7609d;
            return this;
        }
    }

    C7608c(C7606a c7606a, C7609d c7609d, InterfaceC7607b interfaceC7607b, int i10) {
        this.f17987a = c7606a;
        this.f17988b = c7609d;
        this.f17989c = i10;
    }

    /* renamed from: a */
    public int m23116a() {
        return this.f17989c;
    }

    /* renamed from: b */
    public C7606a m23117b() {
        return this.f17987a;
    }

    /* renamed from: c */
    public InterfaceC7607b m23118c() {
        return null;
    }

    /* renamed from: d */
    public C7609d m23119d() {
        return this.f17988b;
    }
}
