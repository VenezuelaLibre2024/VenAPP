package v7;

import t6.u1;
import t6.u3;
import t6.v1;
import v7.e;
import v7.y;

/* loaded from: classes.dex */
public final class d implements y, y.a {

    /* renamed from: a */
    public final y f28269a;

    /* renamed from: b */
    private y.a f28270b;

    /* renamed from: c */
    private a[] f28271c = new a[0];

    /* renamed from: d */
    private long f28272d;

    /* renamed from: e */
    long f28273e;

    /* renamed from: f */
    long f28274f;

    /* renamed from: r */
    private e.b f28275r;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a implements v0 {

        /* renamed from: a */
        public final v0 f28276a;

        /* renamed from: b */
        private boolean f28277b;

        public a(v0 v0Var) {
            this.f28276a = v0Var;
        }

        @Override // v7.v0
        public void a() {
            this.f28276a.a();
        }

        public void b() {
            this.f28277b = false;
        }

        @Override // v7.v0
        public boolean d() {
            return !d.this.m() && this.f28276a.d();
        }

        @Override // v7.v0
        public int p(long j10) {
            if (d.this.m()) {
                return -3;
            }
            return this.f28276a.p(j10);
        }

        @Override // v7.v0
        public int q(v1 v1Var, w6.g gVar, int i10) {
            if (d.this.m()) {
                return -3;
            }
            if (this.f28277b) {
                gVar.w(4);
                return -4;
            }
            int q10 = this.f28276a.q(v1Var, gVar, i10);
            if (q10 == -5) {
                u1 u1Var = (u1) t8.a.e(v1Var.f26567b);
                int i11 = u1Var.M;
                if (i11 != 0 || u1Var.N != 0) {
                    d dVar = d.this;
                    if (dVar.f28273e != 0) {
                        i11 = 0;
                    }
                    v1Var.f26567b = u1Var.c().P(i11).Q(dVar.f28274f == Long.MIN_VALUE ? u1Var.N : 0).G();
                }
                return -5;
            }
            d dVar2 = d.this;
            long j10 = dVar2.f28274f;
            if (j10 == Long.MIN_VALUE || ((q10 != -4 || gVar.f29681e < j10) && !(q10 == -3 && dVar2.f() == Long.MIN_VALUE && !gVar.f29680d))) {
                return q10;
            }
            gVar.n();
            gVar.w(4);
            this.f28277b = true;
            return -4;
        }
    }

    public d(y yVar, boolean z10, long j10, long j11) {
        this.f28269a = yVar;
        this.f28272d = z10 ? j10 : -9223372036854775807L;
        this.f28273e = j10;
        this.f28274f = j11;
    }

    private u3 d(long j10, u3 u3Var) {
        long r10 = t8.r0.r(u3Var.f26555a, 0L, j10 - this.f28273e);
        long j11 = u3Var.f26556b;
        long j12 = this.f28274f;
        long r11 = t8.r0.r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (r10 == u3Var.f26555a && r11 == u3Var.f26556b) ? u3Var : new u3(r10, r11);
    }

    private static boolean q(long j10, q8.r[] rVarArr) {
        if (j10 != 0) {
            for (q8.r rVar : rVarArr) {
                if (rVar != null) {
                    u1 s10 = rVar.s();
                    if (!t8.w.a(s10.f26517w, s10.f26514t)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // v7.y, v7.w0
    public long b() {
        long b10 = this.f28269a.b();
        if (b10 != Long.MIN_VALUE) {
            long j10 = this.f28274f;
            if (j10 == Long.MIN_VALUE || b10 < j10) {
                return b10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        long j11 = this.f28273e;
        if (j10 == j11) {
            return j11;
        }
        return this.f28269a.c(j10, d(j10, u3Var));
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        return this.f28269a.e(j10);
    }

    @Override // v7.y, v7.w0
    public long f() {
        long f10 = this.f28269a.f();
        if (f10 != Long.MIN_VALUE) {
            long j10 = this.f28274f;
            if (j10 == Long.MIN_VALUE || f10 < j10) {
                return f10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
        this.f28269a.g(j10);
    }

    @Override // v7.y.a
    public void h(y yVar) {
        if (this.f28275r != null) {
            return;
        }
        ((y.a) t8.a.e(this.f28270b)).h(this);
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return this.f28269a.isLoading();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L39;
     */
    @Override // v7.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long j(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f28272d = r0
            v7.d$a[] r0 = r5.f28271c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            v7.y r0 = r5.f28269a
            long r0 = r0.j(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f28273e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f28274f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            t8.a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.d.j(long):long");
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.f28270b = aVar;
        this.f28269a.k(this, j10);
    }

    @Override // v7.y
    public long l() {
        if (m()) {
            long j10 = this.f28272d;
            this.f28272d = -9223372036854775807L;
            long l10 = l();
            return l10 != -9223372036854775807L ? l10 : j10;
        }
        long l11 = this.f28269a.l();
        if (l11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        t8.a.g(l11 >= this.f28273e);
        long j11 = this.f28274f;
        if (j11 != Long.MIN_VALUE && l11 > j11) {
            z10 = false;
        }
        t8.a.g(z10);
        return l11;
    }

    boolean m() {
        return this.f28272d != -9223372036854775807L;
    }

    @Override // v7.w0.a
    /* renamed from: n */
    public void a(y yVar) {
        ((y.a) t8.a.e(this.f28270b)).a(this);
    }

    @Override // v7.y
    public void o() {
        e.b bVar = this.f28275r;
        if (bVar != null) {
            throw bVar;
        }
        this.f28269a.o();
    }

    public void p(e.b bVar) {
        this.f28275r = bVar;
    }

    @Override // v7.y
    public f1 r() {
        return this.f28269a.r();
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        this.f28269a.s(j10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // v7.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long t(q8.r[] r13, boolean[] r14, v7.v0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            v7.d$a[] r2 = new v7.d.a[r2]
            r0.f28271c = r2
            int r2 = r1.length
            v7.v0[] r9 = new v7.v0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            v7.d$a[] r3 = r0.f28271c
            r4 = r1[r2]
            v7.d$a r4 = (v7.d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            v7.v0 r11 = r4.f28276a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            v7.y r2 = r0.f28269a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.t(r3, r4, r5, r6, r7)
            boolean r4 = r12.m()
            if (r4 == 0) goto L43
            long r4 = r0.f28273e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = q(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f28272d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f28273e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f28274f
            r6 = -9223372036854775808
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L63
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L61
            goto L63
        L61:
            r4 = r10
            goto L64
        L63:
            r4 = 1
        L64:
            t8.a.g(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            v7.d$a[] r4 = r0.f28271c
            r4[r10] = r11
            goto L84
        L73:
            v7.d$a[] r5 = r0.f28271c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            v7.v0 r6 = r6.f28276a
            if (r6 == r4) goto L84
        L7d:
            v7.d$a r6 = new v7.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            v7.d$a[] r4 = r0.f28271c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.d.t(q8.r[], boolean[], v7.v0[], boolean[], long):long");
    }

    public void u(long j10, long j11) {
        this.f28273e = j10;
        this.f28274f = j11;
    }
}
