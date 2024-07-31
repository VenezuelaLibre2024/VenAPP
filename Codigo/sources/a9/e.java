package a9;

import x8.c0;

@Deprecated
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f253a;

    /* renamed from: b, reason: collision with root package name */
    private final int f254b;

    /* renamed from: c, reason: collision with root package name */
    private final int f255c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f256d;

    /* renamed from: e, reason: collision with root package name */
    private final int f257e;

    /* renamed from: f, reason: collision with root package name */
    private final c0 f258f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f259g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private c0 f264e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f260a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f261b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f262c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f263d = false;

        /* renamed from: f, reason: collision with root package name */
        private int f265f = 1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f266g = false;

        public e a() {
            return new e(this, null);
        }

        public a b(int i10) {
            this.f265f = i10;
            return this;
        }

        @Deprecated
        public a c(int i10) {
            this.f261b = i10;
            return this;
        }

        public a d(int i10) {
            this.f262c = i10;
            return this;
        }

        public a e(boolean z10) {
            this.f266g = z10;
            return this;
        }

        public a f(boolean z10) {
            this.f263d = z10;
            return this;
        }

        public a g(boolean z10) {
            this.f260a = z10;
            return this;
        }

        public a h(c0 c0Var) {
            this.f264e = c0Var;
            return this;
        }
    }

    /* synthetic */ e(a aVar, k kVar) {
        this.f253a = aVar.f260a;
        this.f254b = aVar.f261b;
        this.f255c = aVar.f262c;
        this.f256d = aVar.f263d;
        this.f257e = aVar.f265f;
        this.f258f = aVar.f264e;
        this.f259g = aVar.f266g;
    }

    public int a() {
        return this.f257e;
    }

    @Deprecated
    public int b() {
        return this.f254b;
    }

    public int c() {
        return this.f255c;
    }

    public c0 d() {
        return this.f258f;
    }

    public boolean e() {
        return this.f256d;
    }

    public boolean f() {
        return this.f253a;
    }

    public final boolean g() {
        return this.f259g;
    }
}
