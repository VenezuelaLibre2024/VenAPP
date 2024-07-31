package cd;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f7046a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7047b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7048c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7049d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7050e;

    /* renamed from: f, reason: collision with root package name */
    public final double f7051f;

    /* renamed from: g, reason: collision with root package name */
    public final double f7052g;

    /* renamed from: h, reason: collision with root package name */
    public final int f7053h;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7054a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7055b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7056c;

        public a(boolean z10, boolean z11, boolean z12) {
            this.f7054a = z10;
            this.f7055b = z11;
            this.f7056c = z12;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7057a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7058b;

        public b(int i10, int i11) {
            this.f7057a = i10;
            this.f7058b = i11;
        }
    }

    public d(long j10, b bVar, a aVar, int i10, int i11, double d10, double d11, int i12) {
        this.f7048c = j10;
        this.f7046a = bVar;
        this.f7047b = aVar;
        this.f7049d = i10;
        this.f7050e = i11;
        this.f7051f = d10;
        this.f7052g = d11;
        this.f7053h = i12;
    }

    public boolean a(long j10) {
        return this.f7048c < j10;
    }
}
