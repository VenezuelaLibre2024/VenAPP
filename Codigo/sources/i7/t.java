package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import t6.u1;
import v6.s0;

/* loaded from: classes.dex */
public final class t implements m {

    /* renamed from: a, reason: collision with root package name */
    private final t8.e0 f17502a;

    /* renamed from: b, reason: collision with root package name */
    private final s0.a f17503b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17504c;

    /* renamed from: d, reason: collision with root package name */
    private y6.b0 f17505d;

    /* renamed from: e, reason: collision with root package name */
    private String f17506e;

    /* renamed from: f, reason: collision with root package name */
    private int f17507f;

    /* renamed from: g, reason: collision with root package name */
    private int f17508g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17509h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17510i;

    /* renamed from: j, reason: collision with root package name */
    private long f17511j;

    /* renamed from: k, reason: collision with root package name */
    private int f17512k;

    /* renamed from: l, reason: collision with root package name */
    private long f17513l;

    public t() {
        this(null);
    }

    public t(String str) {
        this.f17507f = 0;
        t8.e0 e0Var = new t8.e0(4);
        this.f17502a = e0Var;
        e0Var.e()[0] = -1;
        this.f17503b = new s0.a();
        this.f17513l = -9223372036854775807L;
        this.f17504c = str;
    }

    private void a(t8.e0 e0Var) {
        byte[] e10 = e0Var.e();
        int g10 = e0Var.g();
        for (int f10 = e0Var.f(); f10 < g10; f10++) {
            byte b10 = e10[f10];
            boolean z10 = (b10 & 255) == 255;
            boolean z11 = this.f17510i && (b10 & 224) == 224;
            this.f17510i = z10;
            if (z11) {
                e0Var.U(f10 + 1);
                this.f17510i = false;
                this.f17502a.e()[1] = e10[f10];
                this.f17508g = 2;
                this.f17507f = 1;
                return;
            }
        }
        e0Var.U(g10);
    }

    private void g(t8.e0 e0Var) {
        int min = Math.min(e0Var.a(), this.f17512k - this.f17508g);
        this.f17505d.a(e0Var, min);
        int i10 = this.f17508g + min;
        this.f17508g = i10;
        int i11 = this.f17512k;
        if (i10 < i11) {
            return;
        }
        long j10 = this.f17513l;
        if (j10 != -9223372036854775807L) {
            this.f17505d.b(j10, 1, i11, 0, null);
            this.f17513l += this.f17511j;
        }
        this.f17508g = 0;
        this.f17507f = 0;
    }

    private void h(t8.e0 e0Var) {
        int min = Math.min(e0Var.a(), 4 - this.f17508g);
        e0Var.l(this.f17502a.e(), this.f17508g, min);
        int i10 = this.f17508g + min;
        this.f17508g = i10;
        if (i10 < 4) {
            return;
        }
        this.f17502a.U(0);
        if (!this.f17503b.a(this.f17502a.q())) {
            this.f17508g = 0;
            this.f17507f = 1;
            return;
        }
        this.f17512k = this.f17503b.f28114c;
        if (!this.f17509h) {
            this.f17511j = (r8.f28118g * 1000000) / r8.f28115d;
            this.f17505d.c(new u1.b().U(this.f17506e).g0(this.f17503b.f28113b).Y(RecognitionOptions.AZTEC).J(this.f17503b.f28116e).h0(this.f17503b.f28115d).X(this.f17504c).G());
            this.f17509h = true;
        }
        this.f17502a.U(0);
        this.f17505d.a(this.f17502a, 4);
        this.f17507f = 2;
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        t8.a.i(this.f17505d);
        while (e0Var.a() > 0) {
            int i10 = this.f17507f;
            if (i10 == 0) {
                a(e0Var);
            } else if (i10 == 1) {
                h(e0Var);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(e0Var);
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17507f = 0;
        this.f17508g = 0;
        this.f17510i = false;
        this.f17513l = -9223372036854775807L;
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17506e = dVar.b();
        this.f17505d = mVar.d(dVar.c(), 1);
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17513l = j10;
        }
    }
}
