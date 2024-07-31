package t6;

/* loaded from: classes.dex */
public abstract class l implements q3, r3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f26283a;

    /* renamed from: c, reason: collision with root package name */
    private s3 f26285c;

    /* renamed from: d, reason: collision with root package name */
    private int f26286d;

    /* renamed from: e, reason: collision with root package name */
    private u6.m3 f26287e;

    /* renamed from: f, reason: collision with root package name */
    private int f26288f;

    /* renamed from: r, reason: collision with root package name */
    private v7.v0 f26289r;

    /* renamed from: s, reason: collision with root package name */
    private u1[] f26290s;

    /* renamed from: t, reason: collision with root package name */
    private long f26291t;

    /* renamed from: u, reason: collision with root package name */
    private long f26292u;

    /* renamed from: w, reason: collision with root package name */
    private boolean f26294w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f26295x;

    /* renamed from: b, reason: collision with root package name */
    private final v1 f26284b = new v1();

    /* renamed from: v, reason: collision with root package name */
    private long f26293v = Long.MIN_VALUE;

    public l(int i10) {
        this.f26283a = i10;
    }

    private void W(long j10, boolean z10) {
        this.f26294w = false;
        this.f26292u = j10;
        this.f26293v = j10;
        Q(j10, z10);
    }

    @Override // t6.q3
    public final void A(u1[] u1VarArr, v7.v0 v0Var, long j10, long j11) {
        t8.a.g(!this.f26294w);
        this.f26289r = v0Var;
        if (this.f26293v == Long.MIN_VALUE) {
            this.f26293v = j10;
        }
        this.f26290s = u1VarArr;
        this.f26291t = j11;
        U(u1VarArr, j10, j11);
    }

    @Override // t6.q3
    public final void B(s3 s3Var, u1[] u1VarArr, v7.v0 v0Var, long j10, boolean z10, boolean z11, long j11, long j12) {
        t8.a.g(this.f26288f == 0);
        this.f26285c = s3Var;
        this.f26288f = 1;
        P(z10, z11);
        A(u1VarArr, v0Var, j11, j12);
        W(j10, z10);
    }

    @Override // t6.q3
    public final long C() {
        return this.f26293v;
    }

    @Override // t6.q3
    public final void D(long j10) {
        W(j10, false);
    }

    @Override // t6.q3
    public t8.u E() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final x G(Throwable th2, u1 u1Var, int i10) {
        return H(th2, u1Var, false, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final x H(Throwable th2, u1 u1Var, boolean z10, int i10) {
        int i11;
        if (u1Var != null && !this.f26295x) {
            this.f26295x = true;
            try {
                i11 = r3.F(a(u1Var));
            } catch (x unused) {
            } finally {
                this.f26295x = false;
            }
            return x.g(th2, getName(), K(), u1Var, i11, z10, i10);
        }
        i11 = 4;
        return x.g(th2, getName(), K(), u1Var, i11, z10, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final s3 I() {
        return (s3) t8.a.e(this.f26285c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final v1 J() {
        this.f26284b.a();
        return this.f26284b;
    }

    protected final int K() {
        return this.f26286d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u6.m3 L() {
        return (u6.m3) t8.a.e(this.f26287e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final u1[] M() {
        return (u1[]) t8.a.e(this.f26290s);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean N() {
        return i() ? this.f26294w : ((v7.v0) t8.a.e(this.f26289r)).d();
    }

    protected abstract void O();

    protected void P(boolean z10, boolean z11) {
    }

    protected abstract void Q(long j10, boolean z10);

    protected void R() {
    }

    protected void S() {
    }

    protected void T() {
    }

    protected abstract void U(u1[] u1VarArr, long j10, long j11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int V(v1 v1Var, w6.g gVar, int i10) {
        int q10 = ((v7.v0) t8.a.e(this.f26289r)).q(v1Var, gVar, i10);
        if (q10 == -4) {
            if (gVar.s()) {
                this.f26293v = Long.MIN_VALUE;
                return this.f26294w ? -4 : -3;
            }
            long j10 = gVar.f29681e + this.f26291t;
            gVar.f29681e = j10;
            this.f26293v = Math.max(this.f26293v, j10);
        } else if (q10 == -5) {
            u1 u1Var = (u1) t8.a.e(v1Var.f26567b);
            if (u1Var.A != Long.MAX_VALUE) {
                v1Var.f26567b = u1Var.c().k0(u1Var.A + this.f26291t).G();
            }
        }
        return q10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int X(long j10) {
        return ((v7.v0) t8.a.e(this.f26289r)).p(j10 - this.f26291t);
    }

    @Override // t6.q3
    public final void f() {
        t8.a.g(this.f26288f == 1);
        this.f26284b.a();
        this.f26288f = 0;
        this.f26289r = null;
        this.f26290s = null;
        this.f26294w = false;
        O();
    }

    @Override // t6.q3, t6.r3
    public final int g() {
        return this.f26283a;
    }

    @Override // t6.q3
    public final int getState() {
        return this.f26288f;
    }

    @Override // t6.q3
    public final v7.v0 h() {
        return this.f26289r;
    }

    @Override // t6.q3
    public final boolean i() {
        return this.f26293v == Long.MIN_VALUE;
    }

    @Override // t6.q3
    public final void k() {
        this.f26294w = true;
    }

    @Override // t6.m3.b
    public void p(int i10, Object obj) {
    }

    @Override // t6.q3
    public final void q() {
        ((v7.v0) t8.a.e(this.f26289r)).a();
    }

    @Override // t6.q3
    public final boolean r() {
        return this.f26294w;
    }

    @Override // t6.q3
    public final void reset() {
        t8.a.g(this.f26288f == 0);
        this.f26284b.a();
        R();
    }

    @Override // t6.q3
    public final void s(int i10, u6.m3 m3Var) {
        this.f26286d = i10;
        this.f26287e = m3Var;
    }

    @Override // t6.q3
    public final void start() {
        t8.a.g(this.f26288f == 1);
        this.f26288f = 2;
        S();
    }

    @Override // t6.q3
    public final void stop() {
        t8.a.g(this.f26288f == 2);
        this.f26288f = 1;
        T();
    }

    @Override // t6.q3
    public final r3 u() {
        return this;
    }

    public int y() {
        return 0;
    }
}
