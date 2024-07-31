package p196k6;

import md.InterfaceC9569d;

/* renamed from: k6.e */
/* loaded from: classes.dex */
public final class C9173e {

    /* renamed from: c */
    private static final C9173e f22153c = new a().m27115a();

    /* renamed from: a */
    private final long f22154a;

    /* renamed from: b */
    private final long f22155b;

    /* renamed from: k6.e$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f22156a = 0;

        /* renamed from: b */
        private long f22157b = 0;

        a() {
        }

        /* renamed from: a */
        public C9173e m27115a() {
            return new C9173e(this.f22156a, this.f22157b);
        }

        /* renamed from: b */
        public a m27116b(long j10) {
            this.f22156a = j10;
            return this;
        }

        /* renamed from: c */
        public a m27117c(long j10) {
            this.f22157b = j10;
            return this;
        }
    }

    C9173e(long j10, long j11) {
        this.f22154a = j10;
        this.f22155b = j11;
    }

    /* renamed from: c */
    public static a m27112c() {
        return new a();
    }

    @InterfaceC9569d(tag = 1)
    /* renamed from: a */
    public long m27113a() {
        return this.f22154a;
    }

    @InterfaceC9569d(tag = 2)
    /* renamed from: b */
    public long m27114b() {
        return this.f22155b;
    }
}
