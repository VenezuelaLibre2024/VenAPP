package v7;

import com.facebook.ads.AdError;
import t6.u1;
import t6.v1;
import v7.u0;
import x6.n;
import x6.u;
import x6.v;
import y6.b0;

/* loaded from: classes.dex */
public class u0 implements y6.b0 {
    private u1 A;
    private u1 B;
    private int C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* renamed from: a */
    private final s0 f28476a;

    /* renamed from: d */
    private final x6.v f28479d;

    /* renamed from: e */
    private final u.a f28480e;

    /* renamed from: f */
    private d f28481f;

    /* renamed from: g */
    private u1 f28482g;

    /* renamed from: h */
    private x6.n f28483h;

    /* renamed from: p */
    private int f28491p;

    /* renamed from: q */
    private int f28492q;

    /* renamed from: r */
    private int f28493r;

    /* renamed from: s */
    private int f28494s;

    /* renamed from: w */
    private boolean f28498w;

    /* renamed from: z */
    private boolean f28501z;

    /* renamed from: b */
    private final b f28477b = new b();

    /* renamed from: i */
    private int f28484i = AdError.NETWORK_ERROR_CODE;

    /* renamed from: j */
    private int[] f28485j = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: k */
    private long[] f28486k = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: n */
    private long[] f28489n = new long[AdError.NETWORK_ERROR_CODE];

    /* renamed from: m */
    private int[] f28488m = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: l */
    private int[] f28487l = new int[AdError.NETWORK_ERROR_CODE];

    /* renamed from: o */
    private b0.a[] f28490o = new b0.a[AdError.NETWORK_ERROR_CODE];

    /* renamed from: c */
    private final b1<c> f28478c = new b1<>(new t8.h() { // from class: v7.t0
        @Override // t8.h
        public final void accept(Object obj) {
            u0.L((u0.c) obj);
        }
    });

    /* renamed from: t */
    private long f28495t = Long.MIN_VALUE;

    /* renamed from: u */
    private long f28496u = Long.MIN_VALUE;

    /* renamed from: v */
    private long f28497v = Long.MIN_VALUE;

    /* renamed from: y */
    private boolean f28500y = true;

    /* renamed from: x */
    private boolean f28499x = true;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f28502a;

        /* renamed from: b */
        public long f28503b;

        /* renamed from: c */
        public b0.a f28504c;

        b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final u1 f28505a;

        /* renamed from: b */
        public final v.b f28506b;

        private c(u1 u1Var, v.b bVar) {
            this.f28505a = u1Var;
            this.f28506b = bVar;
        }

        /* synthetic */ c(u1 u1Var, v.b bVar, a aVar) {
            this(u1Var, bVar);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(u1 u1Var);
    }

    public u0(s8.b bVar, x6.v vVar, u.a aVar) {
        this.f28479d = vVar;
        this.f28480e = aVar;
        this.f28476a = new s0(bVar);
    }

    private long B(int i10) {
        long j10 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int D = D(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = Math.max(j10, this.f28489n[D]);
            if ((this.f28488m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f28484i - 1;
            }
        }
        return j10;
    }

    private int D(int i10) {
        int i11 = this.f28493r + i10;
        int i12 = this.f28484i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean H() {
        return this.f28494s != this.f28491p;
    }

    public static /* synthetic */ void L(c cVar) {
        cVar.f28506b.release();
    }

    private boolean M(int i10) {
        x6.n nVar = this.f28483h;
        return nVar == null || nVar.getState() == 4 || ((this.f28488m[i10] & 1073741824) == 0 && this.f28483h.e());
    }

    private void O(u1 u1Var, v1 v1Var) {
        u1 u1Var2 = this.f28482g;
        boolean z10 = u1Var2 == null;
        x6.m mVar = z10 ? null : u1Var2.f26520z;
        this.f28482g = u1Var;
        x6.m mVar2 = u1Var.f26520z;
        x6.v vVar = this.f28479d;
        v1Var.f26567b = vVar != null ? u1Var.d(vVar.d(u1Var)) : u1Var;
        v1Var.f26566a = this.f28483h;
        if (this.f28479d == null) {
            return;
        }
        if (z10 || !t8.r0.c(mVar, mVar2)) {
            x6.n nVar = this.f28483h;
            x6.n c10 = this.f28479d.c(this.f28480e, u1Var);
            this.f28483h = c10;
            v1Var.f26566a = c10;
            if (nVar != null) {
                nVar.d(this.f28480e);
            }
        }
    }

    private synchronized int P(v1 v1Var, w6.g gVar, boolean z10, boolean z11, b bVar) {
        gVar.f29680d = false;
        if (!H()) {
            if (!z11 && !this.f28498w) {
                u1 u1Var = this.B;
                if (u1Var == null || (!z10 && u1Var == this.f28482g)) {
                    return -3;
                }
                O((u1) t8.a.e(u1Var), v1Var);
                return -5;
            }
            gVar.w(4);
            return -4;
        }
        u1 u1Var2 = this.f28478c.e(C()).f28505a;
        if (!z10 && u1Var2 == this.f28482g) {
            int D = D(this.f28494s);
            if (!M(D)) {
                gVar.f29680d = true;
                return -3;
            }
            gVar.w(this.f28488m[D]);
            if (this.f28494s == this.f28491p - 1 && (z11 || this.f28498w)) {
                gVar.m(536870912);
            }
            long j10 = this.f28489n[D];
            gVar.f29681e = j10;
            if (j10 < this.f28495t) {
                gVar.m(Integer.MIN_VALUE);
            }
            bVar.f28502a = this.f28487l[D];
            bVar.f28503b = this.f28486k[D];
            bVar.f28504c = this.f28490o[D];
            return -4;
        }
        O(u1Var2, v1Var);
        return -5;
    }

    private void U() {
        x6.n nVar = this.f28483h;
        if (nVar != null) {
            nVar.d(this.f28480e);
            this.f28483h = null;
            this.f28482g = null;
        }
    }

    private synchronized void X() {
        this.f28494s = 0;
        this.f28476a.o();
    }

    private synchronized boolean c0(u1 u1Var) {
        this.f28500y = false;
        if (t8.r0.c(u1Var, this.B)) {
            return false;
        }
        if (!this.f28478c.g() && this.f28478c.f().f28505a.equals(u1Var)) {
            u1Var = this.f28478c.f().f28505a;
        }
        this.B = u1Var;
        u1 u1Var2 = this.B;
        this.D = t8.w.a(u1Var2.f26517w, u1Var2.f26514t);
        this.E = false;
        return true;
    }

    private synchronized boolean h(long j10) {
        if (this.f28491p == 0) {
            return j10 > this.f28496u;
        }
        if (A() >= j10) {
            return false;
        }
        t(this.f28492q + j(j10));
        return true;
    }

    private synchronized void i(long j10, int i10, long j11, int i11, b0.a aVar) {
        int i12 = this.f28491p;
        if (i12 > 0) {
            int D = D(i12 - 1);
            t8.a.a(this.f28486k[D] + ((long) this.f28487l[D]) <= j11);
        }
        this.f28498w = (536870912 & i10) != 0;
        this.f28497v = Math.max(this.f28497v, j10);
        int D2 = D(this.f28491p);
        this.f28489n[D2] = j10;
        this.f28486k[D2] = j11;
        this.f28487l[D2] = i11;
        this.f28488m[D2] = i10;
        this.f28490o[D2] = aVar;
        this.f28485j[D2] = this.C;
        if (this.f28478c.g() || !this.f28478c.f().f28505a.equals(this.B)) {
            x6.v vVar = this.f28479d;
            this.f28478c.a(G(), new c((u1) t8.a.e(this.B), vVar != null ? vVar.e(this.f28480e, this.B) : v.b.f30573a));
        }
        int i13 = this.f28491p + 1;
        this.f28491p = i13;
        int i14 = this.f28484i;
        if (i13 == i14) {
            int i15 = i14 + AdError.NETWORK_ERROR_CODE;
            int[] iArr = new int[i15];
            long[] jArr = new long[i15];
            long[] jArr2 = new long[i15];
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            b0.a[] aVarArr = new b0.a[i15];
            int i16 = this.f28493r;
            int i17 = i14 - i16;
            System.arraycopy(this.f28486k, i16, jArr, 0, i17);
            System.arraycopy(this.f28489n, this.f28493r, jArr2, 0, i17);
            System.arraycopy(this.f28488m, this.f28493r, iArr2, 0, i17);
            System.arraycopy(this.f28487l, this.f28493r, iArr3, 0, i17);
            System.arraycopy(this.f28490o, this.f28493r, aVarArr, 0, i17);
            System.arraycopy(this.f28485j, this.f28493r, iArr, 0, i17);
            int i18 = this.f28493r;
            System.arraycopy(this.f28486k, 0, jArr, i17, i18);
            System.arraycopy(this.f28489n, 0, jArr2, i17, i18);
            System.arraycopy(this.f28488m, 0, iArr2, i17, i18);
            System.arraycopy(this.f28487l, 0, iArr3, i17, i18);
            System.arraycopy(this.f28490o, 0, aVarArr, i17, i18);
            System.arraycopy(this.f28485j, 0, iArr, i17, i18);
            this.f28486k = jArr;
            this.f28489n = jArr2;
            this.f28488m = iArr2;
            this.f28487l = iArr3;
            this.f28490o = aVarArr;
            this.f28485j = iArr;
            this.f28493r = 0;
            this.f28484i = i15;
        }
    }

    private int j(long j10) {
        int i10 = this.f28491p;
        int D = D(i10 - 1);
        while (i10 > this.f28494s && this.f28489n[D] >= j10) {
            i10--;
            D--;
            if (D == -1) {
                D = this.f28484i - 1;
            }
        }
        return i10;
    }

    public static u0 k(s8.b bVar, x6.v vVar, u.a aVar) {
        return new u0(bVar, (x6.v) t8.a.e(vVar), (u.a) t8.a.e(aVar));
    }

    public static u0 l(s8.b bVar) {
        return new u0(bVar, null, null);
    }

    private synchronized long m(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.f28491p;
        if (i11 != 0) {
            long[] jArr = this.f28489n;
            int i12 = this.f28493r;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.f28494s) != i11) {
                    i11 = i10 + 1;
                }
                int v10 = v(i12, i11, j10, z10);
                if (v10 == -1) {
                    return -1L;
                }
                return p(v10);
            }
        }
        return -1L;
    }

    private synchronized long n() {
        int i10 = this.f28491p;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    private long p(int i10) {
        this.f28496u = Math.max(this.f28496u, B(i10));
        this.f28491p -= i10;
        int i11 = this.f28492q + i10;
        this.f28492q = i11;
        int i12 = this.f28493r + i10;
        this.f28493r = i12;
        int i13 = this.f28484i;
        if (i12 >= i13) {
            this.f28493r = i12 - i13;
        }
        int i14 = this.f28494s - i10;
        this.f28494s = i14;
        if (i14 < 0) {
            this.f28494s = 0;
        }
        this.f28478c.d(i11);
        if (this.f28491p != 0) {
            return this.f28486k[this.f28493r];
        }
        int i15 = this.f28493r;
        if (i15 == 0) {
            i15 = this.f28484i;
        }
        return this.f28486k[i15 - 1] + this.f28487l[r6];
    }

    private long t(int i10) {
        int G = G() - i10;
        boolean z10 = false;
        t8.a.a(G >= 0 && G <= this.f28491p - this.f28494s);
        int i11 = this.f28491p - G;
        this.f28491p = i11;
        this.f28497v = Math.max(this.f28496u, B(i11));
        if (G == 0 && this.f28498w) {
            z10 = true;
        }
        this.f28498w = z10;
        this.f28478c.c(i10);
        int i12 = this.f28491p;
        if (i12 == 0) {
            return 0L;
        }
        return this.f28486k[D(i12 - 1)] + this.f28487l[r9];
    }

    private int v(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f28489n[i10];
            if (j11 > j10) {
                return i12;
            }
            if (!z10 || (this.f28488m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f28484i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized long A() {
        return Math.max(this.f28496u, B(this.f28494s));
    }

    public final int C() {
        return this.f28492q + this.f28494s;
    }

    public final synchronized int E(long j10, boolean z10) {
        int D = D(this.f28494s);
        if (H() && j10 >= this.f28489n[D]) {
            if (j10 > this.f28497v && z10) {
                return this.f28491p - this.f28494s;
            }
            int v10 = v(D, this.f28491p - this.f28494s, j10, true);
            if (v10 == -1) {
                return 0;
            }
            return v10;
        }
        return 0;
    }

    public final synchronized u1 F() {
        return this.f28500y ? null : this.B;
    }

    public final int G() {
        return this.f28492q + this.f28491p;
    }

    public final void I() {
        this.f28501z = true;
    }

    public final synchronized boolean J() {
        return this.f28498w;
    }

    public synchronized boolean K(boolean z10) {
        u1 u1Var;
        boolean z11 = true;
        if (H()) {
            if (this.f28478c.e(C()).f28505a != this.f28482g) {
                return true;
            }
            return M(D(this.f28494s));
        }
        if (!z10 && !this.f28498w && ((u1Var = this.B) == null || u1Var == this.f28482g)) {
            z11 = false;
        }
        return z11;
    }

    public void N() {
        x6.n nVar = this.f28483h;
        if (nVar != null && nVar.getState() == 1) {
            throw ((n.a) t8.a.e(this.f28483h.a()));
        }
    }

    public final synchronized int Q() {
        return H() ? this.f28485j[D(this.f28494s)] : this.C;
    }

    public void R() {
        r();
        U();
    }

    public int S(v1 v1Var, w6.g gVar, int i10, boolean z10) {
        int P = P(v1Var, gVar, (i10 & 2) != 0, z10, this.f28477b);
        if (P == -4 && !gVar.s()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                s0 s0Var = this.f28476a;
                b bVar = this.f28477b;
                if (z11) {
                    s0Var.f(gVar, bVar);
                } else {
                    s0Var.m(gVar, bVar);
                }
            }
            if (!z11) {
                this.f28494s++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z10) {
        this.f28476a.n();
        this.f28491p = 0;
        this.f28492q = 0;
        this.f28493r = 0;
        this.f28494s = 0;
        this.f28499x = true;
        this.f28495t = Long.MIN_VALUE;
        this.f28496u = Long.MIN_VALUE;
        this.f28497v = Long.MIN_VALUE;
        this.f28498w = false;
        this.f28478c.b();
        if (z10) {
            this.A = null;
            this.B = null;
            this.f28500y = true;
        }
    }

    public final synchronized boolean Y(int i10) {
        X();
        int i11 = this.f28492q;
        if (i10 >= i11 && i10 <= this.f28491p + i11) {
            this.f28495t = Long.MIN_VALUE;
            this.f28494s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean Z(long j10, boolean z10) {
        X();
        int D = D(this.f28494s);
        if (H() && j10 >= this.f28489n[D] && (j10 <= this.f28497v || z10)) {
            int v10 = v(D, this.f28491p - this.f28494s, j10, true);
            if (v10 == -1) {
                return false;
            }
            this.f28495t = j10;
            this.f28494s += v10;
            return true;
        }
        return false;
    }

    public final void a0(long j10) {
        if (this.F != j10) {
            this.F = j10;
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // y6.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(long r12, int r14, int r15, int r16, y6.b0.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.f28501z
            if (r0 == 0) goto L10
            t6.u1 r0 = r8.A
            java.lang.Object r0 = t8.a.i(r0)
            t6.u1 r0 = (t6.u1) r0
            r11.c(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f28499x
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f28499x = r1
        L22:
            long r4 = r8.F
            long r4 = r4 + r12
            boolean r6 = r8.D
            if (r6 == 0) goto L54
            long r6 = r8.f28495t
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L54
            boolean r0 = r8.E
            if (r0 != 0) goto L50
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r0.append(r6)
            t6.u1 r6 = r8.B
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "SampleQueue"
            t8.s.i(r6, r0)
            r8.E = r2
        L50:
            r0 = r14 | 1
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            boolean r0 = r8.G
            if (r0 == 0) goto L66
            if (r3 == 0) goto L65
            boolean r0 = r11.h(r4)
            if (r0 != 0) goto L62
            goto L65
        L62:
            r8.G = r1
            goto L66
        L65:
            return
        L66:
            v7.s0 r0 = r8.f28476a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.i(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v7.u0.b(long, int, int, int, y6.b0$a):void");
    }

    public final void b0(long j10) {
        this.f28495t = j10;
    }

    @Override // y6.b0
    public final void c(u1 u1Var) {
        u1 w10 = w(u1Var);
        this.f28501z = false;
        this.A = u1Var;
        boolean c02 = c0(w10);
        d dVar = this.f28481f;
        if (dVar == null || !c02) {
            return;
        }
        dVar.a(w10);
    }

    @Override // y6.b0
    public final void d(t8.e0 e0Var, int i10, int i11) {
        this.f28476a.q(e0Var, i10);
    }

    public final void d0(d dVar) {
        this.f28481f = dVar;
    }

    @Override // y6.b0
    public final int e(s8.h hVar, int i10, boolean z10, int i11) {
        return this.f28476a.p(hVar, i10, z10);
    }

    public final synchronized void e0(int i10) {
        boolean z10;
        if (i10 >= 0) {
            try {
                if (this.f28494s + i10 <= this.f28491p) {
                    z10 = true;
                    t8.a.a(z10);
                    this.f28494s += i10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z10 = false;
        t8.a.a(z10);
        this.f28494s += i10;
    }

    public final void f0(int i10) {
        this.C = i10;
    }

    public final void g0() {
        this.G = true;
    }

    public synchronized long o() {
        int i10 = this.f28494s;
        if (i10 == 0) {
            return -1L;
        }
        return p(i10);
    }

    public final void q(long j10, boolean z10, boolean z11) {
        this.f28476a.b(m(j10, z10, z11));
    }

    public final void r() {
        this.f28476a.b(n());
    }

    public final void s() {
        this.f28476a.b(o());
    }

    public final void u(int i10) {
        this.f28476a.c(t(i10));
    }

    public u1 w(u1 u1Var) {
        return (this.F == 0 || u1Var.A == Long.MAX_VALUE) ? u1Var : u1Var.c().k0(u1Var.A + this.F).G();
    }

    public final int x() {
        return this.f28492q;
    }

    public final synchronized long y() {
        return this.f28491p == 0 ? Long.MIN_VALUE : this.f28489n[this.f28493r];
    }

    public final synchronized long z() {
        return this.f28497v;
    }
}
