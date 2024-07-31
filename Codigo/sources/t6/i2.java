package t6;

import v7.a0;

/* loaded from: classes.dex */
final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public final v7.y f26185a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26186b;

    /* renamed from: c, reason: collision with root package name */
    public final v7.v0[] f26187c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26188d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f26189e;

    /* renamed from: f, reason: collision with root package name */
    public j2 f26190f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f26191g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f26192h;

    /* renamed from: i, reason: collision with root package name */
    private final r3[] f26193i;

    /* renamed from: j, reason: collision with root package name */
    private final q8.a0 f26194j;

    /* renamed from: k, reason: collision with root package name */
    private final a3 f26195k;

    /* renamed from: l, reason: collision with root package name */
    private i2 f26196l;

    /* renamed from: m, reason: collision with root package name */
    private v7.f1 f26197m;

    /* renamed from: n, reason: collision with root package name */
    private q8.b0 f26198n;

    /* renamed from: o, reason: collision with root package name */
    private long f26199o;

    public i2(r3[] r3VarArr, long j10, q8.a0 a0Var, s8.b bVar, a3 a3Var, j2 j2Var, q8.b0 b0Var) {
        this.f26193i = r3VarArr;
        this.f26199o = j10;
        this.f26194j = a0Var;
        this.f26195k = a3Var;
        a0.b bVar2 = j2Var.f26237a;
        this.f26186b = bVar2.f28543a;
        this.f26190f = j2Var;
        this.f26197m = v7.f1.f28311d;
        this.f26198n = b0Var;
        this.f26187c = new v7.v0[r3VarArr.length];
        this.f26192h = new boolean[r3VarArr.length];
        this.f26185a = e(bVar2, a3Var, bVar, j2Var.f26238b, j2Var.f26240d);
    }

    private void c(v7.v0[] v0VarArr) {
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.f26193i;
            if (i10 >= r3VarArr.length) {
                return;
            }
            if (r3VarArr[i10].g() == -2 && this.f26198n.c(i10)) {
                v0VarArr[i10] = new v7.r();
            }
            i10++;
        }
    }

    private static v7.y e(a0.b bVar, a3 a3Var, s8.b bVar2, long j10, long j11) {
        v7.y h10 = a3Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new v7.d(h10, true, 0L, j11) : h10;
    }

    private void f() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            q8.b0 b0Var = this.f26198n;
            if (i10 >= b0Var.f23626a) {
                return;
            }
            boolean c10 = b0Var.c(i10);
            q8.r rVar = this.f26198n.f23628c[i10];
            if (c10 && rVar != null) {
                rVar.f();
            }
            i10++;
        }
    }

    private void g(v7.v0[] v0VarArr) {
        int i10 = 0;
        while (true) {
            r3[] r3VarArr = this.f26193i;
            if (i10 >= r3VarArr.length) {
                return;
            }
            if (r3VarArr[i10].g() == -2) {
                v0VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void h() {
        if (!r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            q8.b0 b0Var = this.f26198n;
            if (i10 >= b0Var.f23626a) {
                return;
            }
            boolean c10 = b0Var.c(i10);
            q8.r rVar = this.f26198n.f23628c[i10];
            if (c10 && rVar != null) {
                rVar.p();
            }
            i10++;
        }
    }

    private boolean r() {
        return this.f26196l == null;
    }

    private static void u(a3 a3Var, v7.y yVar) {
        try {
            if (yVar instanceof v7.d) {
                yVar = ((v7.d) yVar).f28269a;
            }
            a3Var.z(yVar);
        } catch (RuntimeException e10) {
            t8.s.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A() {
        v7.y yVar = this.f26185a;
        if (yVar instanceof v7.d) {
            long j10 = this.f26190f.f26240d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((v7.d) yVar).u(0L, j10);
        }
    }

    public long a(q8.b0 b0Var, long j10, boolean z10) {
        return b(b0Var, j10, z10, new boolean[this.f26193i.length]);
    }

    public long b(q8.b0 b0Var, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= b0Var.f23626a) {
                break;
            }
            boolean[] zArr2 = this.f26192h;
            if (z10 || !b0Var.b(this.f26198n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        g(this.f26187c);
        f();
        this.f26198n = b0Var;
        h();
        long t10 = this.f26185a.t(b0Var.f23628c, this.f26192h, this.f26187c, zArr, j10);
        c(this.f26187c);
        this.f26189e = false;
        int i11 = 0;
        while (true) {
            v7.v0[] v0VarArr = this.f26187c;
            if (i11 >= v0VarArr.length) {
                return t10;
            }
            if (v0VarArr[i11] != null) {
                t8.a.g(b0Var.c(i11));
                if (this.f26193i[i11].g() != -2) {
                    this.f26189e = true;
                }
            } else {
                t8.a.g(b0Var.f23628c[i11] == null);
            }
            i11++;
        }
    }

    public void d(long j10) {
        t8.a.g(r());
        this.f26185a.e(y(j10));
    }

    public long i() {
        if (!this.f26188d) {
            return this.f26190f.f26238b;
        }
        long f10 = this.f26189e ? this.f26185a.f() : Long.MIN_VALUE;
        return f10 == Long.MIN_VALUE ? this.f26190f.f26241e : f10;
    }

    public i2 j() {
        return this.f26196l;
    }

    public long k() {
        if (this.f26188d) {
            return this.f26185a.b();
        }
        return 0L;
    }

    public long l() {
        return this.f26199o;
    }

    public long m() {
        return this.f26190f.f26238b + this.f26199o;
    }

    public v7.f1 n() {
        return this.f26197m;
    }

    public q8.b0 o() {
        return this.f26198n;
    }

    public void p(float f10, d4 d4Var) {
        this.f26188d = true;
        this.f26197m = this.f26185a.r();
        q8.b0 v10 = v(f10, d4Var);
        j2 j2Var = this.f26190f;
        long j10 = j2Var.f26238b;
        long j11 = j2Var.f26241e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long a10 = a(v10, j10, false);
        long j12 = this.f26199o;
        j2 j2Var2 = this.f26190f;
        this.f26199o = j12 + (j2Var2.f26238b - a10);
        this.f26190f = j2Var2.b(a10);
    }

    public boolean q() {
        return this.f26188d && (!this.f26189e || this.f26185a.f() == Long.MIN_VALUE);
    }

    public void s(long j10) {
        t8.a.g(r());
        if (this.f26188d) {
            this.f26185a.g(y(j10));
        }
    }

    public void t() {
        f();
        u(this.f26195k, this.f26185a);
    }

    public q8.b0 v(float f10, d4 d4Var) {
        q8.b0 g10 = this.f26194j.g(this.f26193i, n(), this.f26190f.f26237a, d4Var);
        for (q8.r rVar : g10.f23628c) {
            if (rVar != null) {
                rVar.l(f10);
            }
        }
        return g10;
    }

    public void w(i2 i2Var) {
        if (i2Var == this.f26196l) {
            return;
        }
        f();
        this.f26196l = i2Var;
        h();
    }

    public void x(long j10) {
        this.f26199o = j10;
    }

    public long y(long j10) {
        return j10 - l();
    }

    public long z(long j10) {
        return j10 + l();
    }
}
