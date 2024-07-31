package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.Arrays;
import java.util.Collections;
import t6.u1;
import t8.r0;
import v6.a;

/* loaded from: classes.dex */
public final class i implements m {

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f17296v = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f17297a;

    /* renamed from: b, reason: collision with root package name */
    private final t8.d0 f17298b;

    /* renamed from: c, reason: collision with root package name */
    private final t8.e0 f17299c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17300d;

    /* renamed from: e, reason: collision with root package name */
    private String f17301e;

    /* renamed from: f, reason: collision with root package name */
    private y6.b0 f17302f;

    /* renamed from: g, reason: collision with root package name */
    private y6.b0 f17303g;

    /* renamed from: h, reason: collision with root package name */
    private int f17304h;

    /* renamed from: i, reason: collision with root package name */
    private int f17305i;

    /* renamed from: j, reason: collision with root package name */
    private int f17306j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17307k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f17308l;

    /* renamed from: m, reason: collision with root package name */
    private int f17309m;

    /* renamed from: n, reason: collision with root package name */
    private int f17310n;

    /* renamed from: o, reason: collision with root package name */
    private int f17311o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f17312p;

    /* renamed from: q, reason: collision with root package name */
    private long f17313q;

    /* renamed from: r, reason: collision with root package name */
    private int f17314r;

    /* renamed from: s, reason: collision with root package name */
    private long f17315s;

    /* renamed from: t, reason: collision with root package name */
    private y6.b0 f17316t;

    /* renamed from: u, reason: collision with root package name */
    private long f17317u;

    public i(boolean z10) {
        this(z10, null);
    }

    public i(boolean z10, String str) {
        this.f17298b = new t8.d0(new byte[7]);
        this.f17299c = new t8.e0(Arrays.copyOf(f17296v, 10));
        s();
        this.f17309m = -1;
        this.f17310n = -1;
        this.f17313q = -9223372036854775807L;
        this.f17315s = -9223372036854775807L;
        this.f17297a = z10;
        this.f17300d = str;
    }

    private void a() {
        t8.a.e(this.f17302f);
        r0.j(this.f17316t);
        r0.j(this.f17303g);
    }

    private void g(t8.e0 e0Var) {
        if (e0Var.a() == 0) {
            return;
        }
        this.f17298b.f26645a[0] = e0Var.e()[e0Var.f()];
        this.f17298b.p(2);
        int h10 = this.f17298b.h(4);
        int i10 = this.f17310n;
        if (i10 != -1 && h10 != i10) {
            q();
            return;
        }
        if (!this.f17308l) {
            this.f17308l = true;
            this.f17309m = this.f17311o;
            this.f17310n = h10;
        }
        t();
    }

    private boolean h(t8.e0 e0Var, int i10) {
        e0Var.U(i10 + 1);
        if (!w(e0Var, this.f17298b.f26645a, 1)) {
            return false;
        }
        this.f17298b.p(4);
        int h10 = this.f17298b.h(1);
        int i11 = this.f17309m;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f17310n != -1) {
            if (!w(e0Var, this.f17298b.f26645a, 1)) {
                return true;
            }
            this.f17298b.p(2);
            if (this.f17298b.h(4) != this.f17310n) {
                return false;
            }
            e0Var.U(i10 + 2);
        }
        if (!w(e0Var, this.f17298b.f26645a, 4)) {
            return true;
        }
        this.f17298b.p(14);
        int h11 = this.f17298b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] e10 = e0Var.e();
        int g10 = e0Var.g();
        int i12 = i10 + h11;
        if (i12 >= g10) {
            return true;
        }
        byte b10 = e10[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == g10) {
                return true;
            }
            return l((byte) -1, e10[i13]) && ((e10[i13] & 8) >> 3) == h10;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == g10) {
            return true;
        }
        if (e10[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == g10 || e10[i15] == 51;
    }

    private boolean i(t8.e0 e0Var, byte[] bArr, int i10) {
        int min = Math.min(e0Var.a(), i10 - this.f17305i);
        e0Var.l(bArr, this.f17305i, min);
        int i11 = this.f17305i + min;
        this.f17305i = i11;
        return i11 == i10;
    }

    private void j(t8.e0 e0Var) {
        int i10;
        byte[] e10 = e0Var.e();
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        while (f10 < g10) {
            int i11 = f10 + 1;
            int i12 = e10[f10] & 255;
            if (this.f17306j == 512 && l((byte) -1, (byte) i12) && (this.f17308l || h(e0Var, i11 - 2))) {
                this.f17311o = (i12 & 8) >> 3;
                this.f17307k = (i12 & 1) == 0;
                if (this.f17308l) {
                    t();
                } else {
                    r();
                }
                e0Var.U(i11);
                return;
            }
            int i13 = this.f17306j;
            int i14 = i12 | i13;
            if (i14 != 329) {
                if (i14 == 511) {
                    this.f17306j = RecognitionOptions.UPC_A;
                } else if (i14 == 836) {
                    i10 = RecognitionOptions.UPC_E;
                } else if (i14 == 1075) {
                    u();
                    e0Var.U(i11);
                    return;
                } else if (i13 != 256) {
                    this.f17306j = RecognitionOptions.QR_CODE;
                    i11--;
                }
                f10 = i11;
            } else {
                i10 = 768;
            }
            this.f17306j = i10;
            f10 = i11;
        }
        e0Var.U(f10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() {
        this.f17298b.p(0);
        if (this.f17312p) {
            this.f17298b.r(10);
        } else {
            int h10 = this.f17298b.h(2) + 1;
            if (h10 != 2) {
                t8.s.i("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
                h10 = 2;
            }
            this.f17298b.r(5);
            byte[] b10 = v6.a.b(h10, this.f17310n, this.f17298b.h(3));
            a.b f10 = v6.a.f(b10);
            u1 G = new u1.b().U(this.f17301e).g0("audio/mp4a-latm").K(f10.f27942c).J(f10.f27941b).h0(f10.f27940a).V(Collections.singletonList(b10)).X(this.f17300d).G();
            this.f17313q = 1024000000 / G.K;
            this.f17302f.c(G);
            this.f17312p = true;
        }
        this.f17298b.r(4);
        int h11 = (this.f17298b.h(13) - 2) - 5;
        if (this.f17307k) {
            h11 -= 2;
        }
        v(this.f17302f, this.f17313q, 0, h11);
    }

    private void o() {
        this.f17303g.a(this.f17299c, 10);
        this.f17299c.U(6);
        v(this.f17303g, 0L, 10, this.f17299c.G() + 10);
    }

    private void p(t8.e0 e0Var) {
        int min = Math.min(e0Var.a(), this.f17314r - this.f17305i);
        this.f17316t.a(e0Var, min);
        int i10 = this.f17305i + min;
        this.f17305i = i10;
        int i11 = this.f17314r;
        if (i10 == i11) {
            long j10 = this.f17315s;
            if (j10 != -9223372036854775807L) {
                this.f17316t.b(j10, 1, i11, 0, null);
                this.f17315s += this.f17317u;
            }
            s();
        }
    }

    private void q() {
        this.f17308l = false;
        s();
    }

    private void r() {
        this.f17304h = 1;
        this.f17305i = 0;
    }

    private void s() {
        this.f17304h = 0;
        this.f17305i = 0;
        this.f17306j = RecognitionOptions.QR_CODE;
    }

    private void t() {
        this.f17304h = 3;
        this.f17305i = 0;
    }

    private void u() {
        this.f17304h = 2;
        this.f17305i = f17296v.length;
        this.f17314r = 0;
        this.f17299c.U(0);
    }

    private void v(y6.b0 b0Var, long j10, int i10, int i11) {
        this.f17304h = 4;
        this.f17305i = i10;
        this.f17316t = b0Var;
        this.f17317u = j10;
        this.f17314r = i11;
    }

    private boolean w(t8.e0 e0Var, byte[] bArr, int i10) {
        if (e0Var.a() < i10) {
            return false;
        }
        e0Var.l(bArr, 0, i10);
        return true;
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        a();
        while (e0Var.a() > 0) {
            int i10 = this.f17304h;
            if (i10 == 0) {
                j(e0Var);
            } else if (i10 == 1) {
                g(e0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(e0Var, this.f17298b.f26645a, this.f17307k ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(e0Var);
                }
            } else if (i(e0Var, this.f17299c.e(), 10)) {
                o();
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17315s = -9223372036854775807L;
        q();
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17301e = dVar.b();
        y6.b0 d10 = mVar.d(dVar.c(), 1);
        this.f17302f = d10;
        this.f17316t = d10;
        if (!this.f17297a) {
            this.f17303g = new y6.j();
            return;
        }
        dVar.a();
        y6.b0 d11 = mVar.d(dVar.c(), 5);
        this.f17303g = d11;
        d11.c(new u1.b().U(dVar.b()).g0("application/id3").G());
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17315s = j10;
        }
    }

    public long k() {
        return this.f17313q;
    }
}
