package i7;

import i7.i0;
import t6.u1;
import v6.c;

/* loaded from: classes.dex */
public final class f implements m {

    /* renamed from: a, reason: collision with root package name */
    private final t8.d0 f17234a;

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17235b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17236c;

    /* renamed from: d, reason: collision with root package name */
    private String f17237d;

    /* renamed from: e, reason: collision with root package name */
    private y6.b0 f17238e;

    /* renamed from: f, reason: collision with root package name */
    private int f17239f;

    /* renamed from: g, reason: collision with root package name */
    private int f17240g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17241h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17242i;

    /* renamed from: j, reason: collision with root package name */
    private long f17243j;

    /* renamed from: k, reason: collision with root package name */
    private u1 f17244k;

    /* renamed from: l, reason: collision with root package name */
    private int f17245l;

    /* renamed from: m, reason: collision with root package name */
    private long f17246m;

    public f() {
        this(null);
    }

    public f(String str) {
        t8.d0 d0Var = new t8.d0(new byte[16]);
        this.f17234a = d0Var;
        this.f17235b = new t8.e0(d0Var.f26645a);
        this.f17239f = 0;
        this.f17240g = 0;
        this.f17241h = false;
        this.f17242i = false;
        this.f17246m = -9223372036854775807L;
        this.f17236c = str;
    }

    private boolean a(t8.e0 e0Var, byte[] bArr, int i10) {
        int min = Math.min(e0Var.a(), i10 - this.f17240g);
        e0Var.l(bArr, this.f17240g, min);
        int i11 = this.f17240g + min;
        this.f17240g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f17234a.p(0);
        c.b d10 = v6.c.d(this.f17234a);
        u1 u1Var = this.f17244k;
        if (u1Var == null || d10.f27961c != u1Var.J || d10.f27960b != u1Var.K || !"audio/ac4".equals(u1Var.f26517w)) {
            u1 G = new u1.b().U(this.f17237d).g0("audio/ac4").J(d10.f27961c).h0(d10.f27960b).X(this.f17236c).G();
            this.f17244k = G;
            this.f17238e.c(G);
        }
        this.f17245l = d10.f27962d;
        this.f17243j = (d10.f27963e * 1000000) / this.f17244k.K;
    }

    private boolean h(t8.e0 e0Var) {
        int H;
        while (true) {
            if (e0Var.a() <= 0) {
                return false;
            }
            if (this.f17241h) {
                H = e0Var.H();
                this.f17241h = H == 172;
                if (H == 64 || H == 65) {
                    break;
                }
            } else {
                this.f17241h = e0Var.H() == 172;
            }
        }
        this.f17242i = H == 65;
        return true;
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        t8.a.i(this.f17238e);
        while (e0Var.a() > 0) {
            int i10 = this.f17239f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(e0Var.a(), this.f17245l - this.f17240g);
                        this.f17238e.a(e0Var, min);
                        int i11 = this.f17240g + min;
                        this.f17240g = i11;
                        int i12 = this.f17245l;
                        if (i11 == i12) {
                            long j10 = this.f17246m;
                            if (j10 != -9223372036854775807L) {
                                this.f17238e.b(j10, 1, i12, 0, null);
                                this.f17246m += this.f17243j;
                            }
                            this.f17239f = 0;
                        }
                    }
                } else if (a(e0Var, this.f17235b.e(), 16)) {
                    g();
                    this.f17235b.U(0);
                    this.f17238e.a(this.f17235b, 16);
                    this.f17239f = 2;
                }
            } else if (h(e0Var)) {
                this.f17239f = 1;
                this.f17235b.e()[0] = -84;
                this.f17235b.e()[1] = (byte) (this.f17242i ? 65 : 64);
                this.f17240g = 2;
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17239f = 0;
        this.f17240g = 0;
        this.f17241h = false;
        this.f17242i = false;
        this.f17246m = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17237d = dVar.b();
        this.f17238e = mVar.d(dVar.c(), 1);
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17246m = j10;
        }
    }
}
