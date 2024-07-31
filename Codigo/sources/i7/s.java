package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.Collections;
import t6.b3;
import t6.u1;
import v6.a;

/* loaded from: classes.dex */
public final class s implements m {

    /* renamed from: a, reason: collision with root package name */
    private final String f17481a;

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17482b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.d0 f17483c;

    /* renamed from: d, reason: collision with root package name */
    private y6.b0 f17484d;

    /* renamed from: e, reason: collision with root package name */
    private String f17485e;

    /* renamed from: f, reason: collision with root package name */
    private u1 f17486f;

    /* renamed from: g, reason: collision with root package name */
    private int f17487g;

    /* renamed from: h, reason: collision with root package name */
    private int f17488h;

    /* renamed from: i, reason: collision with root package name */
    private int f17489i;

    /* renamed from: j, reason: collision with root package name */
    private int f17490j;

    /* renamed from: k, reason: collision with root package name */
    private long f17491k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17492l;

    /* renamed from: m, reason: collision with root package name */
    private int f17493m;

    /* renamed from: n, reason: collision with root package name */
    private int f17494n;

    /* renamed from: o, reason: collision with root package name */
    private int f17495o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17496p;

    /* renamed from: q, reason: collision with root package name */
    private long f17497q;

    /* renamed from: r, reason: collision with root package name */
    private int f17498r;

    /* renamed from: s, reason: collision with root package name */
    private long f17499s;

    /* renamed from: t, reason: collision with root package name */
    private int f17500t;

    /* renamed from: u, reason: collision with root package name */
    private String f17501u;

    public s(String str) {
        this.f17481a = str;
        t8.e0 e0Var = new t8.e0(RecognitionOptions.UPC_E);
        this.f17482b = e0Var;
        this.f17483c = new t8.d0(e0Var.e());
        this.f17491k = -9223372036854775807L;
    }

    private static long a(t8.d0 d0Var) {
        return d0Var.h((d0Var.h(2) + 1) * 8);
    }

    private void g(t8.d0 d0Var) {
        if (!d0Var.g()) {
            this.f17492l = true;
            l(d0Var);
        } else if (!this.f17492l) {
            return;
        }
        if (this.f17493m != 0) {
            throw b3.a(null, null);
        }
        if (this.f17494n != 0) {
            throw b3.a(null, null);
        }
        k(d0Var, j(d0Var));
        if (this.f17496p) {
            d0Var.r((int) this.f17497q);
        }
    }

    private int h(t8.d0 d0Var) {
        int b10 = d0Var.b();
        a.b e10 = v6.a.e(d0Var, true);
        this.f17501u = e10.f27942c;
        this.f17498r = e10.f27940a;
        this.f17500t = e10.f27941b;
        return b10 - d0Var.b();
    }

    private void i(t8.d0 d0Var) {
        int i10;
        int h10 = d0Var.h(3);
        this.f17495o = h10;
        if (h10 == 0) {
            i10 = 8;
        } else {
            if (h10 != 1) {
                if (h10 == 3 || h10 == 4 || h10 == 5) {
                    d0Var.r(6);
                    return;
                } else {
                    if (h10 != 6 && h10 != 7) {
                        throw new IllegalStateException();
                    }
                    d0Var.r(1);
                    return;
                }
            }
            i10 = 9;
        }
        d0Var.r(i10);
    }

    private int j(t8.d0 d0Var) {
        int h10;
        if (this.f17495o != 0) {
            throw b3.a(null, null);
        }
        int i10 = 0;
        do {
            h10 = d0Var.h(8);
            i10 += h10;
        } while (h10 == 255);
        return i10;
    }

    private void k(t8.d0 d0Var, int i10) {
        int e10 = d0Var.e();
        if ((e10 & 7) == 0) {
            this.f17482b.U(e10 >> 3);
        } else {
            d0Var.i(this.f17482b.e(), 0, i10 * 8);
            this.f17482b.U(0);
        }
        this.f17484d.a(this.f17482b, i10);
        long j10 = this.f17491k;
        if (j10 != -9223372036854775807L) {
            this.f17484d.b(j10, 1, i10, 0, null);
            this.f17491k += this.f17499s;
        }
    }

    private void l(t8.d0 d0Var) {
        boolean g10;
        int h10 = d0Var.h(1);
        int h11 = h10 == 1 ? d0Var.h(1) : 0;
        this.f17493m = h11;
        if (h11 != 0) {
            throw b3.a(null, null);
        }
        if (h10 == 1) {
            a(d0Var);
        }
        if (!d0Var.g()) {
            throw b3.a(null, null);
        }
        this.f17494n = d0Var.h(6);
        int h12 = d0Var.h(4);
        int h13 = d0Var.h(3);
        if (h12 != 0 || h13 != 0) {
            throw b3.a(null, null);
        }
        if (h10 == 0) {
            int e10 = d0Var.e();
            int h14 = h(d0Var);
            d0Var.p(e10);
            byte[] bArr = new byte[(h14 + 7) / 8];
            d0Var.i(bArr, 0, h14);
            u1 G = new u1.b().U(this.f17485e).g0("audio/mp4a-latm").K(this.f17501u).J(this.f17500t).h0(this.f17498r).V(Collections.singletonList(bArr)).X(this.f17481a).G();
            if (!G.equals(this.f17486f)) {
                this.f17486f = G;
                this.f17499s = 1024000000 / G.K;
                this.f17484d.c(G);
            }
        } else {
            d0Var.r(((int) a(d0Var)) - h(d0Var));
        }
        i(d0Var);
        boolean g11 = d0Var.g();
        this.f17496p = g11;
        this.f17497q = 0L;
        if (g11) {
            if (h10 == 1) {
                this.f17497q = a(d0Var);
            }
            do {
                g10 = d0Var.g();
                this.f17497q = (this.f17497q << 8) + d0Var.h(8);
            } while (g10);
        }
        if (d0Var.g()) {
            d0Var.r(8);
        }
    }

    private void m(int i10) {
        this.f17482b.Q(i10);
        this.f17483c.n(this.f17482b.e());
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        t8.a.i(this.f17484d);
        while (e0Var.a() > 0) {
            int i10 = this.f17487g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int H = e0Var.H();
                    if ((H & 224) == 224) {
                        this.f17490j = H;
                        this.f17487g = 2;
                    } else if (H != 86) {
                        this.f17487g = 0;
                    }
                } else if (i10 == 2) {
                    int H2 = ((this.f17490j & (-225)) << 8) | e0Var.H();
                    this.f17489i = H2;
                    if (H2 > this.f17482b.e().length) {
                        m(this.f17489i);
                    }
                    this.f17488h = 0;
                    this.f17487g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int min = Math.min(e0Var.a(), this.f17489i - this.f17488h);
                    e0Var.l(this.f17483c.f26645a, this.f17488h, min);
                    int i11 = this.f17488h + min;
                    this.f17488h = i11;
                    if (i11 == this.f17489i) {
                        this.f17483c.p(0);
                        g(this.f17483c);
                        this.f17487g = 0;
                    }
                }
            } else if (e0Var.H() == 86) {
                this.f17487g = 1;
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17487g = 0;
        this.f17491k = -9223372036854775807L;
        this.f17492l = false;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17484d = mVar.d(dVar.c(), 1);
        this.f17485e = dVar.b();
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17491k = j10;
        }
    }
}
