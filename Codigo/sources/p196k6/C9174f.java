package p196k6;

import md.InterfaceC9569d;

/* renamed from: k6.f */
/* loaded from: classes.dex */
public final class C9174f {

    /* renamed from: c */
    private static final C9174f f22158c = new a().m27121a();

    /* renamed from: a */
    private final long f22159a;

    /* renamed from: b */
    private final long f22160b;

    /* renamed from: k6.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f22161a = 0;

        /* renamed from: b */
        private long f22162b = 0;

        a() {
        }

        /* renamed from: a */
        public C9174f m27121a() {
            return new C9174f(this.f22161a, this.f22162b);
        }

        /* renamed from: b */
        public a m27122b(long j10) {
            this.f22162b = j10;
            return this;
        }

        /* renamed from: c */
        public a m27123c(long j10) {
            this.f22161a = j10;
            return this;
        }
    }

    C9174f(long j10, long j11) {
        this.f22159a = j10;
        this.f22160b = j11;
    }

    /* renamed from: c */
    public static a m27118c() {
        return new a();
    }

    @InterfaceC9569d(tag = 2)
    /* renamed from: a */
    public long m27119a() {
        return this.f22160b;
    }

    @InterfaceC9569d(tag = 1)
    /* renamed from: b */
    public long m27120b() {
        return this.f22159a;
    }
}
