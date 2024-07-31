package g7;

import t8.e0;

/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    public c f16016a;

    /* renamed from: b, reason: collision with root package name */
    public long f16017b;

    /* renamed from: c, reason: collision with root package name */
    public long f16018c;

    /* renamed from: d, reason: collision with root package name */
    public long f16019d;

    /* renamed from: e, reason: collision with root package name */
    public int f16020e;

    /* renamed from: f, reason: collision with root package name */
    public int f16021f;

    /* renamed from: l, reason: collision with root package name */
    public boolean f16027l;

    /* renamed from: n, reason: collision with root package name */
    public p f16029n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f16031p;

    /* renamed from: q, reason: collision with root package name */
    public long f16032q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f16033r;

    /* renamed from: g, reason: collision with root package name */
    public long[] f16022g = new long[0];

    /* renamed from: h, reason: collision with root package name */
    public int[] f16023h = new int[0];

    /* renamed from: i, reason: collision with root package name */
    public int[] f16024i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public long[] f16025j = new long[0];

    /* renamed from: k, reason: collision with root package name */
    public boolean[] f16026k = new boolean[0];

    /* renamed from: m, reason: collision with root package name */
    public boolean[] f16028m = new boolean[0];

    /* renamed from: o, reason: collision with root package name */
    public final e0 f16030o = new e0();

    public void a(e0 e0Var) {
        e0Var.l(this.f16030o.e(), 0, this.f16030o.g());
        this.f16030o.U(0);
        this.f16031p = false;
    }

    public void b(y6.l lVar) {
        lVar.readFully(this.f16030o.e(), 0, this.f16030o.g());
        this.f16030o.U(0);
        this.f16031p = false;
    }

    public long c(int i10) {
        return this.f16025j[i10];
    }

    public void d(int i10) {
        this.f16030o.Q(i10);
        this.f16027l = true;
        this.f16031p = true;
    }

    public void e(int i10, int i11) {
        this.f16020e = i10;
        this.f16021f = i11;
        if (this.f16023h.length < i10) {
            this.f16022g = new long[i10];
            this.f16023h = new int[i10];
        }
        if (this.f16024i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f16024i = new int[i12];
            this.f16025j = new long[i12];
            this.f16026k = new boolean[i12];
            this.f16028m = new boolean[i12];
        }
    }

    public void f() {
        this.f16020e = 0;
        this.f16032q = 0L;
        this.f16033r = false;
        this.f16027l = false;
        this.f16031p = false;
        this.f16029n = null;
    }

    public boolean g(int i10) {
        return this.f16027l && this.f16028m[i10];
    }
}
