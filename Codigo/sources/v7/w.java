package v7;

import t6.c2;
import t6.d4;
import v7.a0;

/* loaded from: classes.dex */
public final class w extends h1 {
    private a A;
    private v B;
    private boolean C;
    private boolean D;
    private boolean E;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f28516x;

    /* renamed from: y, reason: collision with root package name */
    private final d4.d f28517y;

    /* renamed from: z, reason: collision with root package name */
    private final d4.b f28518z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends s {

        /* renamed from: t, reason: collision with root package name */
        public static final Object f28519t = new Object();

        /* renamed from: r, reason: collision with root package name */
        private final Object f28520r;

        /* renamed from: s, reason: collision with root package name */
        private final Object f28521s;

        private a(d4 d4Var, Object obj, Object obj2) {
            super(d4Var);
            this.f28520r = obj;
            this.f28521s = obj2;
        }

        public static a A(d4 d4Var, Object obj, Object obj2) {
            return new a(d4Var, obj, obj2);
        }

        public static a z(c2 c2Var) {
            return new a(new b(c2Var), d4.d.C, f28519t);
        }

        @Override // v7.s, t6.d4
        public int g(Object obj) {
            Object obj2;
            d4 d4Var = this.f28451f;
            if (f28519t.equals(obj) && (obj2 = this.f28521s) != null) {
                obj = obj2;
            }
            return d4Var.g(obj);
        }

        @Override // v7.s, t6.d4
        public d4.b l(int i10, d4.b bVar, boolean z10) {
            this.f28451f.l(i10, bVar, z10);
            if (t8.r0.c(bVar.f26056b, this.f28521s) && z10) {
                bVar.f26056b = f28519t;
            }
            return bVar;
        }

        @Override // v7.s, t6.d4
        public Object r(int i10) {
            Object r10 = this.f28451f.r(i10);
            return t8.r0.c(r10, this.f28521s) ? f28519t : r10;
        }

        @Override // v7.s, t6.d4
        public d4.d t(int i10, d4.d dVar, long j10) {
            this.f28451f.t(i10, dVar, j10);
            if (t8.r0.c(dVar.f26066a, this.f28520r)) {
                dVar.f26066a = d4.d.C;
            }
            return dVar;
        }

        public a y(d4 d4Var) {
            return new a(d4Var, this.f28520r, this.f28521s);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends d4 {

        /* renamed from: f, reason: collision with root package name */
        private final c2 f28522f;

        public b(c2 c2Var) {
            this.f28522f = c2Var;
        }

        @Override // t6.d4
        public int g(Object obj) {
            return obj == a.f28519t ? 0 : -1;
        }

        @Override // t6.d4
        public d4.b l(int i10, d4.b bVar, boolean z10) {
            bVar.w(z10 ? 0 : null, z10 ? a.f28519t : null, 0, -9223372036854775807L, 0L, w7.c.f29708r, true);
            return bVar;
        }

        @Override // t6.d4
        public int n() {
            return 1;
        }

        @Override // t6.d4
        public Object r(int i10) {
            return a.f28519t;
        }

        @Override // t6.d4
        public d4.d t(int i10, d4.d dVar, long j10) {
            dVar.j(d4.d.C, this.f28522f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            dVar.f26077w = true;
            return dVar;
        }

        @Override // t6.d4
        public int u() {
            return 1;
        }
    }

    public w(a0 a0Var, boolean z10) {
        super(a0Var);
        this.f28516x = z10 && a0Var.o();
        this.f28517y = new d4.d();
        this.f28518z = new d4.b();
        d4 p10 = a0Var.p();
        if (p10 == null) {
            this.A = a.z(a0Var.d());
        } else {
            this.A = a.A(p10, null, null);
            this.E = true;
        }
    }

    private Object X(Object obj) {
        return (this.A.f28521s == null || !this.A.f28521s.equals(obj)) ? obj : a.f28519t;
    }

    private Object Y(Object obj) {
        return (this.A.f28521s == null || !obj.equals(a.f28519t)) ? obj : this.A.f28521s;
    }

    private void a0(long j10) {
        v vVar = this.B;
        int g10 = this.A.g(vVar.f28507a.f28543a);
        if (g10 == -1) {
            return;
        }
        long j11 = this.A.k(g10, this.f28518z).f26058d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        vVar.u(j10);
    }

    @Override // v7.g, v7.a
    public void E() {
        this.D = false;
        this.C = false;
        super.E();
    }

    @Override // v7.h1
    protected a0.b N(a0.b bVar) {
        return bVar.c(X(bVar.f28543a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bb  */
    @Override // v7.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void T(t6.d4 r15) {
        /*
            r14 = this;
            boolean r0 = r14.D
            if (r0 == 0) goto L19
            v7.w$a r0 = r14.A
            v7.w$a r15 = r0.y(r15)
            r14.A = r15
            v7.v r15 = r14.B
            if (r15 == 0) goto Lae
            long r0 = r15.m()
            r14.a0(r0)
            goto Lae
        L19:
            boolean r0 = r15.v()
            if (r0 == 0) goto L36
            boolean r0 = r14.E
            if (r0 == 0) goto L2a
            v7.w$a r0 = r14.A
            v7.w$a r15 = r0.y(r15)
            goto L32
        L2a:
            java.lang.Object r0 = t6.d4.d.C
            java.lang.Object r1 = v7.w.a.f28519t
            v7.w$a r15 = v7.w.a.A(r15, r0, r1)
        L32:
            r14.A = r15
            goto Lae
        L36:
            t6.d4$d r0 = r14.f28517y
            r1 = 0
            r15.s(r1, r0)
            t6.d4$d r0 = r14.f28517y
            long r2 = r0.f()
            t6.d4$d r0 = r14.f28517y
            java.lang.Object r0 = r0.f26066a
            v7.v r4 = r14.B
            if (r4 == 0) goto L74
            long r4 = r4.n()
            v7.w$a r6 = r14.A
            v7.v r7 = r14.B
            v7.a0$b r7 = r7.f28507a
            java.lang.Object r7 = r7.f28543a
            t6.d4$b r8 = r14.f28518z
            r6.m(r7, r8)
            t6.d4$b r6 = r14.f28518z
            long r6 = r6.r()
            long r6 = r6 + r4
            v7.w$a r4 = r14.A
            t6.d4$d r5 = r14.f28517y
            t6.d4$d r1 = r4.s(r1, r5)
            long r4 = r1.f()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            t6.d4$d r9 = r14.f28517y
            t6.d4$b r10 = r14.f28518z
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.o(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.E
            if (r1 == 0) goto L94
            v7.w$a r0 = r14.A
            v7.w$a r15 = r0.y(r15)
            goto L98
        L94:
            v7.w$a r15 = v7.w.a.A(r15, r0, r2)
        L98:
            r14.A = r15
            v7.v r15 = r14.B
            if (r15 == 0) goto Lae
            r14.a0(r3)
            v7.a0$b r15 = r15.f28507a
            java.lang.Object r0 = r15.f28543a
            java.lang.Object r0 = r14.Y(r0)
            v7.a0$b r15 = r15.c(r0)
            goto Laf
        Lae:
            r15 = 0
        Laf:
            r0 = 1
            r14.E = r0
            r14.D = r0
            v7.w$a r0 = r14.A
            r14.D(r0)
            if (r15 == 0) goto Lc6
            v7.v r0 = r14.B
            java.lang.Object r0 = t8.a.e(r0)
            v7.v r0 = (v7.v) r0
            r0.d(r15)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.w.T(t6.d4):void");
    }

    @Override // v7.h1
    public void V() {
        if (this.f28516x) {
            return;
        }
        this.C = true;
        U();
    }

    @Override // v7.a0
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public v e(a0.b bVar, s8.b bVar2, long j10) {
        v vVar = new v(bVar, bVar2, j10);
        vVar.w(this.f28340v);
        if (this.D) {
            vVar.d(bVar.c(Y(bVar.f28543a)));
        } else {
            this.B = vVar;
            if (!this.C) {
                this.C = true;
                U();
            }
        }
        return vVar;
    }

    public d4 Z() {
        return this.A;
    }

    @Override // v7.a0
    public void l(y yVar) {
        ((v) yVar).v();
        if (yVar == this.B) {
            this.B = null;
        }
    }

    @Override // v7.g, v7.a0
    public void n() {
    }
}
