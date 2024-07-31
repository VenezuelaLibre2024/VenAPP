package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import t6.u1;
import t8.r0;
import v6.b;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    private final t8.d0 f17206a;

    /* renamed from: b, reason: collision with root package name */
    private final t8.e0 f17207b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17208c;

    /* renamed from: d, reason: collision with root package name */
    private String f17209d;

    /* renamed from: e, reason: collision with root package name */
    private y6.b0 f17210e;

    /* renamed from: f, reason: collision with root package name */
    private int f17211f;

    /* renamed from: g, reason: collision with root package name */
    private int f17212g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17213h;

    /* renamed from: i, reason: collision with root package name */
    private long f17214i;

    /* renamed from: j, reason: collision with root package name */
    private u1 f17215j;

    /* renamed from: k, reason: collision with root package name */
    private int f17216k;

    /* renamed from: l, reason: collision with root package name */
    private long f17217l;

    public c() {
        this(null);
    }

    public c(String str) {
        t8.d0 d0Var = new t8.d0(new byte[RecognitionOptions.ITF]);
        this.f17206a = d0Var;
        this.f17207b = new t8.e0(d0Var.f26645a);
        this.f17211f = 0;
        this.f17217l = -9223372036854775807L;
        this.f17208c = str;
    }

    private boolean a(t8.e0 e0Var, byte[] bArr, int i10) {
        int min = Math.min(e0Var.a(), i10 - this.f17212g);
        e0Var.l(bArr, this.f17212g, min);
        int i11 = this.f17212g + min;
        this.f17212g = i11;
        return i11 == i10;
    }

    private void g() {
        this.f17206a.p(0);
        b.C0458b f10 = v6.b.f(this.f17206a);
        u1 u1Var = this.f17215j;
        if (u1Var == null || f10.f27954d != u1Var.J || f10.f27953c != u1Var.K || !r0.c(f10.f27951a, u1Var.f26517w)) {
            u1.b b02 = new u1.b().U(this.f17209d).g0(f10.f27951a).J(f10.f27954d).h0(f10.f27953c).X(this.f17208c).b0(f10.f27957g);
            if ("audio/ac3".equals(f10.f27951a)) {
                b02.I(f10.f27957g);
            }
            u1 G = b02.G();
            this.f17215j = G;
            this.f17210e.c(G);
        }
        this.f17216k = f10.f27955e;
        this.f17214i = (f10.f27956f * 1000000) / this.f17215j.K;
    }

    private boolean h(t8.e0 e0Var) {
        while (true) {
            boolean z10 = false;
            if (e0Var.a() <= 0) {
                return false;
            }
            if (this.f17213h) {
                int H = e0Var.H();
                if (H == 119) {
                    this.f17213h = false;
                    return true;
                }
                if (H != 11) {
                    this.f17213h = z10;
                }
                z10 = true;
                this.f17213h = z10;
            } else {
                if (e0Var.H() != 11) {
                    this.f17213h = z10;
                }
                z10 = true;
                this.f17213h = z10;
            }
        }
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        t8.a.i(this.f17210e);
        while (e0Var.a() > 0) {
            int i10 = this.f17211f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(e0Var.a(), this.f17216k - this.f17212g);
                        this.f17210e.a(e0Var, min);
                        int i11 = this.f17212g + min;
                        this.f17212g = i11;
                        int i12 = this.f17216k;
                        if (i11 == i12) {
                            long j10 = this.f17217l;
                            if (j10 != -9223372036854775807L) {
                                this.f17210e.b(j10, 1, i12, 0, null);
                                this.f17217l += this.f17214i;
                            }
                            this.f17211f = 0;
                        }
                    }
                } else if (a(e0Var, this.f17207b.e(), RecognitionOptions.ITF)) {
                    g();
                    this.f17207b.U(0);
                    this.f17210e.a(this.f17207b, RecognitionOptions.ITF);
                    this.f17211f = 2;
                }
            } else if (h(e0Var)) {
                this.f17211f = 1;
                this.f17207b.e()[0] = 11;
                this.f17207b.e()[1] = 119;
                this.f17212g = 2;
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17211f = 0;
        this.f17212g = 0;
        this.f17213h = false;
        this.f17217l = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17209d = dVar.b();
        this.f17210e = mVar.d(dVar.c(), 1);
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17217l = j10;
        }
    }
}
