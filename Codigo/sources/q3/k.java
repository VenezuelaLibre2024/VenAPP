package q3;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f23446a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final k f23447b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final k f23448c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final k f23449d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final k f23450e;

    /* renamed from: f, reason: collision with root package name */
    public static final k f23451f;

    /* renamed from: g, reason: collision with root package name */
    public static final k f23452g;

    /* renamed from: h, reason: collision with root package name */
    public static final h3.g<k> f23453h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f23454i;

    /* loaded from: classes.dex */
    private static class a extends k {
        a() {
        }

        @Override // q3.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // q3.k
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends k {
        b() {
        }

        @Override // q3.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        @Override // q3.k
        public float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(ceil)) >= ceil ? 0 : 1));
        }
    }

    /* loaded from: classes.dex */
    private static class c extends k {
        c() {
        }

        @Override // q3.k
        public g a(int i10, int i11, int i12, int i13) {
            return b(i10, i11, i12, i13) == 1.0f ? g.QUALITY : k.f23448c.a(i10, i11, i12, i13);
        }

        @Override // q3.k
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, k.f23448c.b(i10, i11, i12, i13));
        }
    }

    /* loaded from: classes.dex */
    private static class d extends k {
        d() {
        }

        @Override // q3.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // q3.k
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }
    }

    /* loaded from: classes.dex */
    private static class e extends k {
        e() {
        }

        @Override // q3.k
        public g a(int i10, int i11, int i12, int i13) {
            return k.f23454i ? g.QUALITY : g.MEMORY;
        }

        @Override // q3.k
        public float b(int i10, int i11, int i12, int i13) {
            if (k.f23454i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }
    }

    /* loaded from: classes.dex */
    private static class f extends k {
        f() {
        }

        @Override // q3.k
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        @Override // q3.k
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f23450e = dVar;
        f23451f = new f();
        f23452g = dVar;
        f23453h = h3.g.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f23454i = true;
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}
