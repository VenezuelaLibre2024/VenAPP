package p196k6;

import md.InterfaceC9568c;
import md.InterfaceC9569d;

/* renamed from: k6.c */
/* loaded from: classes.dex */
public final class C9171c {

    /* renamed from: c */
    private static final C9171c f22143c = new a().m27102a();

    /* renamed from: a */
    private final long f22144a;

    /* renamed from: b */
    private final b f22145b;

    /* renamed from: k6.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private long f22146a = 0;

        /* renamed from: b */
        private b f22147b = b.REASON_UNKNOWN;

        a() {
        }

        /* renamed from: a */
        public C9171c m27102a() {
            return new C9171c(this.f22146a, this.f22147b);
        }

        /* renamed from: b */
        public a m27103b(long j10) {
            this.f22146a = j10;
            return this;
        }

        /* renamed from: c */
        public a m27104c(b bVar) {
            this.f22147b = bVar;
            return this;
        }
    }

    /* renamed from: k6.c$b */
    /* loaded from: classes.dex */
    public enum b implements InterfaceC9568c {
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

        @Override // md.InterfaceC9568c
        /* renamed from: a */
        public int mo27105a() {
            return this.number_;
        }
    }

    C9171c(long j10, b bVar) {
        this.f22144a = j10;
        this.f22145b = bVar;
    }

    /* renamed from: c */
    public static a m27099c() {
        return new a();
    }

    @InterfaceC9569d(tag = 1)
    /* renamed from: a */
    public long m27100a() {
        return this.f22144a;
    }

    @InterfaceC9569d(tag = 3)
    /* renamed from: b */
    public b m27101b() {
        return this.f22145b;
    }
}
