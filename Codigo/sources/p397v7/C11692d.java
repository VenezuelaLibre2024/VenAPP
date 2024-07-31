package p397v7;

import p307q8.InterfaceC10312r;
import p361t6.C11108u1;
import p361t6.C11110u3;
import p361t6.C11113v1;
import p363t8.C11137a;
import p363t8.C11172r0;
import p363t8.C11178w;
import p397v7.C11695e;
import p397v7.InterfaceC11739y;
import p414w6.C12082g;

/* renamed from: v7.d */
/* loaded from: classes.dex */
public final class C11692d implements InterfaceC11739y, InterfaceC11739y.a {

    /* renamed from: a */
    public final InterfaceC11739y f30639a;

    /* renamed from: b */
    private InterfaceC11739y.a f30640b;

    /* renamed from: c */
    private a[] f30641c = new a[0];

    /* renamed from: d */
    private long f30642d;

    /* renamed from: e */
    long f30643e;

    /* renamed from: f */
    long f30644f;

    /* renamed from: r */
    private C11695e.b f30645r;

    /* renamed from: v7.d$a */
    /* loaded from: classes.dex */
    private final class a implements InterfaceC11734v0 {

        /* renamed from: a */
        public final InterfaceC11734v0 f30646a;

        /* renamed from: b */
        private boolean f30647b;

        public a(InterfaceC11734v0 interfaceC11734v0) {
            this.f30646a = interfaceC11734v0;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: a */
        public void mo262a() {
            this.f30646a.mo262a();
        }

        /* renamed from: b */
        public void m36841b() {
            this.f30647b = false;
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: d */
        public boolean mo264d() {
            return !C11692d.this.m36837m() && this.f30646a.mo264d();
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: p */
        public int mo266p(long j10) {
            if (C11692d.this.m36837m()) {
                return -3;
            }
            return this.f30646a.mo266p(j10);
        }

        @Override // p397v7.InterfaceC11734v0
        /* renamed from: q */
        public int mo267q(C11113v1 c11113v1, C12082g c12082g, int i10) {
            if (C11692d.this.m36837m()) {
                return -3;
            }
            if (this.f30647b) {
                c12082g.m38798w(4);
                return -4;
            }
            int mo267q = this.f30646a.mo267q(c11113v1, c12082g, i10);
            if (mo267q == -5) {
                C11108u1 c11108u1 = (C11108u1) C11137a.m34603e(c11113v1.f28853b);
                int i11 = c11108u1.f28779M;
                if (i11 != 0 || c11108u1.f28780N != 0) {
                    C11692d c11692d = C11692d.this;
                    if (c11692d.f30643e != 0) {
                        i11 = 0;
                    }
                    c11113v1.f28853b = c11108u1.m34488c().m34535P(i11).m34536Q(c11692d.f30644f == Long.MIN_VALUE ? c11108u1.f28780N : 0).m34526G();
                }
                return -5;
            }
            C11692d c11692d2 = C11692d.this;
            long j10 = c11692d2.f30644f;
            if (j10 == Long.MIN_VALUE || ((mo267q != -4 || c12082g.f32144e < j10) && !(mo267q == -3 && c11692d2.mo249f() == Long.MIN_VALUE && !c12082g.f32143d))) {
                return mo267q;
            }
            c12082g.mo22818n();
            c12082g.m38798w(4);
            this.f30647b = true;
            return -4;
        }
    }

    public C11692d(InterfaceC11739y interfaceC11739y, boolean z10, long j10, long j11) {
        this.f30639a = interfaceC11739y;
        this.f30642d = z10 ? j10 : -9223372036854775807L;
        this.f30643e = j10;
        this.f30644f = j11;
    }

    /* renamed from: d */
    private C11110u3 m36835d(long j10, C11110u3 c11110u3) {
        long m34944r = C11172r0.m34944r(c11110u3.f28841a, 0L, j10 - this.f30643e);
        long j11 = c11110u3.f28842b;
        long j12 = this.f30644f;
        long m34944r2 = C11172r0.m34944r(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (m34944r == c11110u3.f28841a && m34944r2 == c11110u3.f28842b) ? c11110u3 : new C11110u3(m34944r, m34944r2);
    }

    /* renamed from: q */
    private static boolean m36836q(long j10, InterfaceC10312r[] interfaceC10312rArr) {
        if (j10 != 0) {
            for (InterfaceC10312r interfaceC10312r : interfaceC10312rArr) {
                if (interfaceC10312r != null) {
                    C11108u1 mo30889s = interfaceC10312r.mo30889s();
                    if (!C11178w.m34993a(mo30889s.f28797w, mo30889s.f28794t)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: b */
    public long mo245b() {
        long mo245b = this.f30639a.mo245b();
        if (mo245b != Long.MIN_VALUE) {
            long j10 = this.f30644f;
            if (j10 == Long.MIN_VALUE || mo245b < j10) {
                return mo245b;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: c */
    public long mo246c(long j10, C11110u3 c11110u3) {
        long j11 = this.f30643e;
        if (j10 == j11) {
            return j11;
        }
        return this.f30639a.mo246c(j10, m36835d(j10, c11110u3));
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: e */
    public boolean mo248e(long j10) {
        return this.f30639a.mo248e(j10);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: f */
    public long mo249f() {
        long mo249f = this.f30639a.mo249f();
        if (mo249f != Long.MIN_VALUE) {
            long j10 = this.f30644f;
            if (j10 == Long.MIN_VALUE || mo249f < j10) {
                return mo249f;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    /* renamed from: g */
    public void mo250g(long j10) {
        this.f30639a.mo250g(j10);
    }

    @Override // p397v7.InterfaceC11739y.a
    /* renamed from: h */
    public void mo34427h(InterfaceC11739y interfaceC11739y) {
        if (this.f30645r != null) {
            return;
        }
        ((InterfaceC11739y.a) C11137a.m34603e(this.f30640b)).mo34427h(this);
    }

    @Override // p397v7.InterfaceC11739y, p397v7.InterfaceC11736w0
    public boolean isLoading() {
        return this.f30639a.isLoading();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r0 > r6) goto L17;
     */
    @Override // p397v7.InterfaceC11739y
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo251j(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f30642d = r0
            v7.d$a[] r0 = r5.f30641c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.m36841b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            v7.y r0 = r5.f30639a
            long r0 = r0.mo251j(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            long r6 = r5.f30643e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L35
            long r6 = r5.f30644f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L34
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L35
        L34:
            r2 = 1
        L35:
            p363t8.C11137a.m34605g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p397v7.C11692d.mo251j(long):long");
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: k */
    public void mo252k(InterfaceC11739y.a aVar, long j10) {
        this.f30640b = aVar;
        this.f30639a.mo252k(this, j10);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: l */
    public long mo253l() {
        if (m36837m()) {
            long j10 = this.f30642d;
            this.f30642d = -9223372036854775807L;
            long mo253l = mo253l();
            return mo253l != -9223372036854775807L ? mo253l : j10;
        }
        long mo253l2 = this.f30639a.mo253l();
        if (mo253l2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = true;
        C11137a.m34605g(mo253l2 >= this.f30643e);
        long j11 = this.f30644f;
        if (j11 != Long.MIN_VALUE && mo253l2 > j11) {
            z10 = false;
        }
        C11137a.m34605g(z10);
        return mo253l2;
    }

    /* renamed from: m */
    boolean m36837m() {
        return this.f30642d != -9223372036854775807L;
    }

    @Override // p397v7.InterfaceC11736w0.a
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo258a(InterfaceC11739y interfaceC11739y) {
        ((InterfaceC11739y.a) C11137a.m34603e(this.f30640b)).mo258a(this);
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: o */
    public void mo254o() {
        C11695e.b bVar = this.f30645r;
        if (bVar != null) {
            throw bVar;
        }
        this.f30639a.mo254o();
    }

    /* renamed from: p */
    public void m36839p(C11695e.b bVar) {
        this.f30645r = bVar;
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: r */
    public C11700f1 mo255r() {
        return this.f30639a.mo255r();
    }

    @Override // p397v7.InterfaceC11739y
    /* renamed from: s */
    public void mo256s(long j10, boolean z10) {
        this.f30639a.mo256s(j10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (r2 > r4) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    @Override // p397v7.InterfaceC11739y
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo257t(p307q8.InterfaceC10312r[] r13, boolean[] r14, p397v7.InterfaceC11734v0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            v7.d$a[] r2 = new p397v7.C11692d.a[r2]
            r0.f30641c = r2
            int r2 = r1.length
            v7.v0[] r9 = new p397v7.InterfaceC11734v0[r2]
            r10 = 0
            r2 = r10
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L21
            v7.d$a[] r3 = r0.f30641c
            r4 = r1[r2]
            v7.d$a r4 = (p397v7.C11692d.a) r4
            r3[r2] = r4
            if (r4 == 0) goto L1c
            v7.v0 r11 = r4.f30646a
        L1c:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L21:
            v7.y r2 = r0.f30639a
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.mo257t(r3, r4, r5, r6, r7)
            boolean r4 = r12.m36837m()
            if (r4 == 0) goto L43
            long r4 = r0.f30643e
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            r6 = r13
            boolean r4 = m36836q(r4, r13)
            if (r4 == 0) goto L43
            r4 = r2
            goto L48
        L43:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L48:
            r0.f30642d = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L63
            long r4 = r0.f30643e
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L61
            long r4 = r0.f30644f
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
            p363t8.C11137a.m34605g(r4)
        L67:
            int r4 = r1.length
            if (r10 >= r4) goto L8d
            r4 = r9[r10]
            if (r4 != 0) goto L73
            v7.d$a[] r4 = r0.f30641c
            r4[r10] = r11
            goto L84
        L73:
            v7.d$a[] r5 = r0.f30641c
            r6 = r5[r10]
            if (r6 == 0) goto L7d
            v7.v0 r6 = r6.f30646a
            if (r6 == r4) goto L84
        L7d:
            v7.d$a r6 = new v7.d$a
            r6.<init>(r4)
            r5[r10] = r6
        L84:
            v7.d$a[] r4 = r0.f30641c
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L67
        L8d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p397v7.C11692d.mo257t(q8.r[], boolean[], v7.v0[], boolean[], long):long");
    }

    /* renamed from: u */
    public void m36840u(long j10, long j11) {
        this.f30643e = j10;
        this.f30644f = j11;
    }
}
