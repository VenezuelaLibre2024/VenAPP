package p039c7;

import p363t8.C11137a;
import p363t8.C11146e0;
import p459y6.C12635y;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: c7.c */
/* loaded from: classes.dex */
public final class C1881c implements InterfaceC12621k {

    /* renamed from: q */
    public static final InterfaceC12626p f7824q = new InterfaceC12626p() { // from class: c7.b
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m9990h;
            m9990h = C1881c.m9990h();
            return m9990h;
        }
    };

    /* renamed from: f */
    private InterfaceC12623m f7830f;

    /* renamed from: h */
    private boolean f7832h;

    /* renamed from: i */
    private long f7833i;

    /* renamed from: j */
    private int f7834j;

    /* renamed from: k */
    private int f7835k;

    /* renamed from: l */
    private int f7836l;

    /* renamed from: m */
    private long f7837m;

    /* renamed from: n */
    private boolean f7838n;

    /* renamed from: o */
    private C1879a f7839o;

    /* renamed from: p */
    private C1884f f7840p;

    /* renamed from: a */
    private final C11146e0 f7825a = new C11146e0(4);

    /* renamed from: b */
    private final C11146e0 f7826b = new C11146e0(9);

    /* renamed from: c */
    private final C11146e0 f7827c = new C11146e0(11);

    /* renamed from: d */
    private final C11146e0 f7828d = new C11146e0();

    /* renamed from: e */
    private final C1882d f7829e = new C1882d();

    /* renamed from: g */
    private int f7831g = 1;

    /* renamed from: d */
    private void m9988d() {
        if (this.f7838n) {
            return;
        }
        this.f7830f.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
        this.f7838n = true;
    }

    /* renamed from: g */
    private long m9989g() {
        if (this.f7832h) {
            return this.f7833i + this.f7837m;
        }
        if (this.f7829e.m10005d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f7837m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ InterfaceC12621k[] m9990h() {
        return new InterfaceC12621k[]{new C1881c()};
    }

    /* renamed from: i */
    private C11146e0 m9991i(InterfaceC12622l interfaceC12622l) {
        if (this.f7836l > this.f7828d.m34680b()) {
            C11146e0 c11146e0 = this.f7828d;
            c11146e0.m34675S(new byte[Math.max(c11146e0.m34680b() * 2, this.f7836l)], 0);
        } else {
            this.f7828d.m34677U(0);
        }
        this.f7828d.m34676T(this.f7836l);
        interfaceC12622l.readFully(this.f7828d.m34682e(), 0, this.f7836l);
        return this.f7828d;
    }

    /* renamed from: j */
    private boolean m9992j(InterfaceC12622l interfaceC12622l) {
        if (!interfaceC12622l.mo41535g(this.f7826b.m34682e(), 0, 9, true)) {
            return false;
        }
        this.f7826b.m34677U(0);
        this.f7826b.m34678V(4);
        int m34664H = this.f7826b.m34664H();
        boolean z10 = (m34664H & 4) != 0;
        boolean z11 = (m34664H & 1) != 0;
        if (z10 && this.f7839o == null) {
            this.f7839o = new C1879a(this.f7830f.mo308d(8, 1));
        }
        if (z11 && this.f7840p == null) {
            this.f7840p = new C1884f(this.f7830f.mo308d(9, 2));
        }
        this.f7830f.mo324q();
        this.f7834j = (this.f7826b.m34692q() - 9) + 4;
        this.f7831g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m9993k(p459y6.InterfaceC12622l r10) {
        /*
            r9 = this;
            long r0 = r9.m9989g()
            int r2 = r9.f7835k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            c7.a r3 = r9.f7839o
            if (r3 == 0) goto L23
            r9.m9988d()
            c7.a r2 = r9.f7839o
        L19:
            t8.e0 r10 = r9.m9991i(r10)
            boolean r10 = r2.m10008a(r10, r0)
        L21:
            r0 = r6
            goto L6d
        L23:
            r3 = 9
            if (r2 != r3) goto L31
            c7.f r3 = r9.f7840p
            if (r3 == 0) goto L31
            r9.m9988d()
            c7.f r2 = r9.f7840p
            goto L19
        L31:
            r3 = 18
            if (r2 != r3) goto L66
            boolean r2 = r9.f7838n
            if (r2 != 0) goto L66
            c7.d r2 = r9.f7829e
            t8.e0 r10 = r9.m9991i(r10)
            boolean r10 = r2.m10008a(r10, r0)
            c7.d r0 = r9.f7829e
            long r0 = r0.m10005d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            y6.m r2 = r9.f7830f
            y6.x r3 = new y6.x
            c7.d r7 = r9.f7829e
            long[] r7 = r7.m10006e()
            c7.d r8 = r9.f7829e
            long[] r8 = r8.m10007f()
            r3.<init>(r7, r8, r0)
            r2.mo323p(r3)
            r9.f7838n = r6
            goto L21
        L66:
            int r0 = r9.f7836l
            r10.mo41538n(r0)
            r10 = 0
            r0 = r10
        L6d:
            boolean r1 = r9.f7832h
            if (r1 != 0) goto L87
            if (r10 == 0) goto L87
            r9.f7832h = r6
            c7.d r10 = r9.f7829e
            long r1 = r10.m10005d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L83
            long r1 = r9.f7837m
            long r1 = -r1
            goto L85
        L83:
            r1 = 0
        L85:
            r9.f7833i = r1
        L87:
            r10 = 4
            r9.f7834j = r10
            r10 = 2
            r9.f7831g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p039c7.C1881c.m9993k(y6.l):boolean");
    }

    /* renamed from: l */
    private boolean m9994l(InterfaceC12622l interfaceC12622l) {
        if (!interfaceC12622l.mo41535g(this.f7827c.m34682e(), 0, 11, true)) {
            return false;
        }
        this.f7827c.m34677U(0);
        this.f7835k = this.f7827c.m34664H();
        this.f7836l = this.f7827c.m34667K();
        this.f7837m = this.f7827c.m34667K();
        this.f7837m = ((this.f7827c.m34664H() << 24) | this.f7837m) * 1000;
        this.f7827c.m34678V(3);
        this.f7831g = 4;
        return true;
    }

    /* renamed from: m */
    private void m9995m(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41538n(this.f7834j);
        this.f7834j = 0;
        this.f7831g = 3;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        if (j10 == 0) {
            this.f7831g = 1;
            this.f7832h = false;
        } else {
            this.f7831g = 3;
        }
        this.f7834j = 0;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f7830f = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        interfaceC12622l.mo41540q(this.f7825a.m34682e(), 0, 3);
        this.f7825a.m34677U(0);
        if (this.f7825a.m34667K() != 4607062) {
            return false;
        }
        interfaceC12622l.mo41540q(this.f7825a.m34682e(), 0, 2);
        this.f7825a.m34677U(0);
        if ((this.f7825a.m34670N() & 250) != 0) {
            return false;
        }
        interfaceC12622l.mo41540q(this.f7825a.m34682e(), 0, 4);
        this.f7825a.m34677U(0);
        int m34692q = this.f7825a.m34692q();
        interfaceC12622l.mo41534f();
        interfaceC12622l.mo41536k(m34692q);
        interfaceC12622l.mo41540q(this.f7825a.m34682e(), 0, 4);
        this.f7825a.m34677U(0);
        return this.f7825a.m34692q() == 0;
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        C11137a.m34607i(this.f7830f);
        while (true) {
            int i10 = this.f7831g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m9995m(interfaceC12622l);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m9993k(interfaceC12622l)) {
                        return 0;
                    }
                } else if (!m9994l(interfaceC12622l)) {
                    return -1;
                }
            } else if (!m9992j(interfaceC12622l)) {
                return -1;
            }
        }
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
