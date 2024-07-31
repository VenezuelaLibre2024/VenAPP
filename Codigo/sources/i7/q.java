package i7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import i7.i0;
import java.util.Collections;
import t6.u1;
import t8.r0;
import t8.x;

/* loaded from: classes.dex */
public final class q implements m {

    /* renamed from: a, reason: collision with root package name */
    private final d0 f17448a;

    /* renamed from: b, reason: collision with root package name */
    private String f17449b;

    /* renamed from: c, reason: collision with root package name */
    private y6.b0 f17450c;

    /* renamed from: d, reason: collision with root package name */
    private a f17451d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17452e;

    /* renamed from: l, reason: collision with root package name */
    private long f17459l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f17453f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final u f17454g = new u(32, RecognitionOptions.ITF);

    /* renamed from: h, reason: collision with root package name */
    private final u f17455h = new u(33, RecognitionOptions.ITF);

    /* renamed from: i, reason: collision with root package name */
    private final u f17456i = new u(34, RecognitionOptions.ITF);

    /* renamed from: j, reason: collision with root package name */
    private final u f17457j = new u(39, RecognitionOptions.ITF);

    /* renamed from: k, reason: collision with root package name */
    private final u f17458k = new u(40, RecognitionOptions.ITF);

    /* renamed from: m, reason: collision with root package name */
    private long f17460m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final t8.e0 f17461n = new t8.e0();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final y6.b0 f17462a;

        /* renamed from: b, reason: collision with root package name */
        private long f17463b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f17464c;

        /* renamed from: d, reason: collision with root package name */
        private int f17465d;

        /* renamed from: e, reason: collision with root package name */
        private long f17466e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f17467f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f17468g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f17469h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f17470i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f17471j;

        /* renamed from: k, reason: collision with root package name */
        private long f17472k;

        /* renamed from: l, reason: collision with root package name */
        private long f17473l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f17474m;

        public a(y6.b0 b0Var) {
            this.f17462a = b0Var;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f17473l;
            if (j10 == -9223372036854775807L) {
                return;
            }
            boolean z10 = this.f17474m;
            this.f17462a.b(j10, z10 ? 1 : 0, (int) (this.f17463b - this.f17472k), i10, null);
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f17471j && this.f17468g) {
                this.f17474m = this.f17464c;
                this.f17471j = false;
            } else if (this.f17469h || this.f17468g) {
                if (z10 && this.f17470i) {
                    d(i10 + ((int) (j10 - this.f17463b)));
                }
                this.f17472k = this.f17463b;
                this.f17473l = this.f17466e;
                this.f17474m = this.f17464c;
                this.f17470i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f17467f) {
                int i12 = this.f17465d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f17465d = i12 + (i11 - i10);
                } else {
                    this.f17468g = (bArr[i13] & 128) != 0;
                    this.f17467f = false;
                }
            }
        }

        public void f() {
            this.f17467f = false;
            this.f17468g = false;
            this.f17469h = false;
            this.f17470i = false;
            this.f17471j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f17468g = false;
            this.f17469h = false;
            this.f17466e = j11;
            this.f17465d = 0;
            this.f17463b = j10;
            if (!c(i11)) {
                if (this.f17470i && !this.f17471j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f17470i = false;
                }
                if (b(i11)) {
                    this.f17469h = !this.f17471j;
                    this.f17471j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f17464c = z11;
            this.f17467f = z11 || i11 <= 9;
        }
    }

    public q(d0 d0Var) {
        this.f17448a = d0Var;
    }

    private void a() {
        t8.a.i(this.f17450c);
        r0.j(this.f17451d);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f17451d.a(j10, i10, this.f17452e);
        if (!this.f17452e) {
            this.f17454g.b(i11);
            this.f17455h.b(i11);
            this.f17456i.b(i11);
            if (this.f17454g.c() && this.f17455h.c() && this.f17456i.c()) {
                this.f17450c.c(i(this.f17449b, this.f17454g, this.f17455h, this.f17456i));
                this.f17452e = true;
            }
        }
        if (this.f17457j.b(i11)) {
            u uVar = this.f17457j;
            this.f17461n.S(this.f17457j.f17517d, t8.x.q(uVar.f17517d, uVar.f17518e));
            this.f17461n.V(5);
            this.f17448a.a(j11, this.f17461n);
        }
        if (this.f17458k.b(i11)) {
            u uVar2 = this.f17458k;
            this.f17461n.S(this.f17458k.f17517d, t8.x.q(uVar2.f17517d, uVar2.f17518e));
            this.f17461n.V(5);
            this.f17448a.a(j11, this.f17461n);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f17451d.e(bArr, i10, i11);
        if (!this.f17452e) {
            this.f17454g.a(bArr, i10, i11);
            this.f17455h.a(bArr, i10, i11);
            this.f17456i.a(bArr, i10, i11);
        }
        this.f17457j.a(bArr, i10, i11);
        this.f17458k.a(bArr, i10, i11);
    }

    private static u1 i(String str, u uVar, u uVar2, u uVar3) {
        int i10 = uVar.f17518e;
        byte[] bArr = new byte[uVar2.f17518e + i10 + uVar3.f17518e];
        System.arraycopy(uVar.f17517d, 0, bArr, 0, i10);
        System.arraycopy(uVar2.f17517d, 0, bArr, uVar.f17518e, uVar2.f17518e);
        System.arraycopy(uVar3.f17517d, 0, bArr, uVar.f17518e + uVar2.f17518e, uVar3.f17518e);
        x.a h10 = t8.x.h(uVar2.f17517d, 3, uVar2.f17518e);
        return new u1.b().U(str).g0("video/hevc").K(t8.e.c(h10.f26777a, h10.f26778b, h10.f26779c, h10.f26780d, h10.f26781e, h10.f26782f)).n0(h10.f26784h).S(h10.f26785i).c0(h10.f26786j).V(Collections.singletonList(bArr)).G();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f17451d.g(j10, i10, i11, j11, this.f17452e);
        if (!this.f17452e) {
            this.f17454g.e(i11);
            this.f17455h.e(i11);
            this.f17456i.e(i11);
        }
        this.f17457j.e(i11);
        this.f17458k.e(i11);
    }

    @Override // i7.m
    public void b(t8.e0 e0Var) {
        a();
        while (e0Var.a() > 0) {
            int f10 = e0Var.f();
            int g10 = e0Var.g();
            byte[] e10 = e0Var.e();
            this.f17459l += e0Var.a();
            this.f17450c.a(e0Var, e0Var.a());
            while (f10 < g10) {
                int c10 = t8.x.c(e10, f10, g10, this.f17453f);
                if (c10 == g10) {
                    h(e10, f10, g10);
                    return;
                }
                int e11 = t8.x.e(e10, c10);
                int i10 = c10 - f10;
                if (i10 > 0) {
                    h(e10, f10, c10);
                }
                int i11 = g10 - c10;
                long j10 = this.f17459l - i11;
                g(j10, i11, i10 < 0 ? -i10 : 0, this.f17460m);
                j(j10, i11, e11, this.f17460m);
                f10 = c10 + 3;
            }
        }
    }

    @Override // i7.m
    public void c() {
        this.f17459l = 0L;
        this.f17460m = -9223372036854775807L;
        t8.x.a(this.f17453f);
        this.f17454g.d();
        this.f17455h.d();
        this.f17456i.d();
        this.f17457j.d();
        this.f17458k.d();
        a aVar = this.f17451d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // i7.m
    public void d(y6.m mVar, i0.d dVar) {
        dVar.a();
        this.f17449b = dVar.b();
        y6.b0 d10 = mVar.d(dVar.c(), 2);
        this.f17450c = d10;
        this.f17451d = new a(d10);
        this.f17448a.b(mVar, dVar);
    }

    @Override // i7.m
    public void e() {
    }

    @Override // i7.m
    public void f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f17460m = j10;
        }
    }
}
