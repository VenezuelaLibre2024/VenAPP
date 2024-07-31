package c7;

import t8.e0;
import y6.k;
import y6.l;
import y6.m;
import y6.p;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: q, reason: collision with root package name */
    public static final p f6875q = new p() { // from class: c7.b
        @Override // y6.p
        public final k[] c() {
            k[] h10;
            h10 = c.h();
            return h10;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private m f6881f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6883h;

    /* renamed from: i, reason: collision with root package name */
    private long f6884i;

    /* renamed from: j, reason: collision with root package name */
    private int f6885j;

    /* renamed from: k, reason: collision with root package name */
    private int f6886k;

    /* renamed from: l, reason: collision with root package name */
    private int f6887l;

    /* renamed from: m, reason: collision with root package name */
    private long f6888m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6889n;

    /* renamed from: o, reason: collision with root package name */
    private a f6890o;

    /* renamed from: p, reason: collision with root package name */
    private f f6891p;

    /* renamed from: a, reason: collision with root package name */
    private final e0 f6876a = new e0(4);

    /* renamed from: b, reason: collision with root package name */
    private final e0 f6877b = new e0(9);

    /* renamed from: c, reason: collision with root package name */
    private final e0 f6878c = new e0(11);

    /* renamed from: d, reason: collision with root package name */
    private final e0 f6879d = new e0();

    /* renamed from: e, reason: collision with root package name */
    private final d f6880e = new d();

    /* renamed from: g, reason: collision with root package name */
    private int f6882g = 1;

    private void d() {
        if (this.f6889n) {
            return;
        }
        this.f6881f.p(new z.b(-9223372036854775807L));
        this.f6889n = true;
    }

    private long g() {
        if (this.f6883h) {
            return this.f6884i + this.f6888m;
        }
        if (this.f6880e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f6888m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] h() {
        return new k[]{new c()};
    }

    private e0 i(l lVar) {
        if (this.f6887l > this.f6879d.b()) {
            e0 e0Var = this.f6879d;
            e0Var.S(new byte[Math.max(e0Var.b() * 2, this.f6887l)], 0);
        } else {
            this.f6879d.U(0);
        }
        this.f6879d.T(this.f6887l);
        lVar.readFully(this.f6879d.e(), 0, this.f6887l);
        return this.f6879d;
    }

    private boolean j(l lVar) {
        if (!lVar.g(this.f6877b.e(), 0, 9, true)) {
            return false;
        }
        this.f6877b.U(0);
        this.f6877b.V(4);
        int H = this.f6877b.H();
        boolean z10 = (H & 4) != 0;
        boolean z11 = (H & 1) != 0;
        if (z10 && this.f6890o == null) {
            this.f6890o = new a(this.f6881f.d(8, 1));
        }
        if (z11 && this.f6891p == null) {
            this.f6891p = new f(this.f6881f.d(9, 2));
        }
        this.f6881f.q();
        this.f6885j = (this.f6877b.q() - 9) + 4;
        this.f6882g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean k(y6.l r10) {
        /*
            r9 = this;
            long r0 = r9.g()
            int r2 = r9.f6886k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            c7.a r3 = r9.f6890o
            if (r3 == 0) goto L23
            r9.d()
            c7.a r2 = r9.f6890o
        L19:
            t8.e0 r10 = r9.i(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L6d
        L23:
            r3 = 9
            if (r2 != r3) goto L31
            c7.f r3 = r9.f6891p
            if (r3 == 0) goto L31
            r9.d()
            c7.f r2 = r9.f6891p
            goto L19
        L31:
            r3 = 18
            if (r2 != r3) goto L66
            boolean r2 = r9.f6889n
            if (r2 != 0) goto L66
            c7.d r2 = r9.f6880e
            t8.e0 r10 = r9.i(r10)
            boolean r10 = r2.a(r10, r0)
            c7.d r0 = r9.f6880e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            y6.m r2 = r9.f6881f
            y6.x r3 = new y6.x
            c7.d r7 = r9.f6880e
            long[] r7 = r7.e()
            c7.d r8 = r9.f6880e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.p(r3)
            r9.f6889n = r6
            goto L21
        L66:
            int r0 = r9.f6887l
            r10.n(r0)
            r10 = 0
            r0 = r10
        L6d:
            boolean r1 = r9.f6883h
            if (r1 != 0) goto L87
            if (r10 == 0) goto L87
            r9.f6883h = r6
            c7.d r10 = r9.f6880e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L83
            long r1 = r9.f6888m
            long r1 = -r1
            goto L85
        L83:
            r1 = 0
        L85:
            r9.f6884i = r1
        L87:
            r10 = 4
            r9.f6885j = r10
            r10 = 2
            r9.f6882g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.c.k(y6.l):boolean");
    }

    private boolean l(l lVar) {
        if (!lVar.g(this.f6878c.e(), 0, 11, true)) {
            return false;
        }
        this.f6878c.U(0);
        this.f6886k = this.f6878c.H();
        this.f6887l = this.f6878c.K();
        this.f6888m = this.f6878c.K();
        this.f6888m = ((this.f6878c.H() << 24) | this.f6888m) * 1000;
        this.f6878c.V(3);
        this.f6882g = 4;
        return true;
    }

    private void m(l lVar) {
        lVar.n(this.f6885j);
        this.f6885j = 0;
        this.f6882g = 3;
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f6882g = 1;
            this.f6883h = false;
        } else {
            this.f6882g = 3;
        }
        this.f6885j = 0;
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f6881f = mVar;
    }

    @Override // y6.k
    public boolean e(l lVar) {
        lVar.q(this.f6876a.e(), 0, 3);
        this.f6876a.U(0);
        if (this.f6876a.K() != 4607062) {
            return false;
        }
        lVar.q(this.f6876a.e(), 0, 2);
        this.f6876a.U(0);
        if ((this.f6876a.N() & 250) != 0) {
            return false;
        }
        lVar.q(this.f6876a.e(), 0, 4);
        this.f6876a.U(0);
        int q10 = this.f6876a.q();
        lVar.f();
        lVar.k(q10);
        lVar.q(this.f6876a.e(), 0, 4);
        this.f6876a.U(0);
        return this.f6876a.q() == 0;
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        t8.a.i(this.f6881f);
        while (true) {
            int i10 = this.f6882g;
            if (i10 != 1) {
                if (i10 == 2) {
                    m(lVar);
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    if (k(lVar)) {
                        return 0;
                    }
                } else if (!l(lVar)) {
                    return -1;
                }
            } else if (!j(lVar)) {
                return -1;
            }
        }
    }

    @Override // y6.k
    public void release() {
    }
}
