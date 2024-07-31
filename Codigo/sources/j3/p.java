package j3;

/* loaded from: classes.dex */
class p<Z> implements v<Z> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19682a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f19683b;

    /* renamed from: c, reason: collision with root package name */
    private final v<Z> f19684c;

    /* renamed from: d, reason: collision with root package name */
    private final a f19685d;

    /* renamed from: e, reason: collision with root package name */
    private final h3.f f19686e;

    /* renamed from: f, reason: collision with root package name */
    private int f19687f;

    /* renamed from: r, reason: collision with root package name */
    private boolean f19688r;

    /* loaded from: classes.dex */
    interface a {
        void d(h3.f fVar, p<?> pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(v<Z> vVar, boolean z10, boolean z11, h3.f fVar, a aVar) {
        this.f19684c = (v) c4.k.d(vVar);
        this.f19682a = z10;
        this.f19683b = z11;
        this.f19686e = fVar;
        this.f19685d = (a) c4.k.d(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a() {
        if (this.f19688r) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f19687f++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v<Z> b() {
        return this.f19684c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f19682a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f19687f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f19687f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f19685d.d(this.f19686e, this);
        }
    }

    @Override // j3.v
    public Z get() {
        return this.f19684c.get();
    }

    @Override // j3.v
    public int p() {
        return this.f19684c.p();
    }

    @Override // j3.v
    public synchronized void q() {
        if (this.f19687f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f19688r) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f19688r = true;
        if (this.f19683b) {
            this.f19684c.q();
        }
    }

    @Override // j3.v
    public Class<Z> r() {
        return this.f19684c.r();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f19682a + ", listener=" + this.f19685d + ", key=" + this.f19686e + ", acquired=" + this.f19687f + ", isRecycled=" + this.f19688r + ", resource=" + this.f19684c + '}';
    }
}
