package f7;

import com.google.android.libraries.barhopper.RecognitionOptions;
import f7.g;
import java.io.EOFException;
import l7.a;
import q7.h;
import t6.u1;
import t8.e0;
import t8.r0;
import v6.s0;
import y6.b0;
import y6.j;
import y6.k;
import y6.l;
import y6.m;
import y6.p;
import y6.v;
import y6.w;
import y6.y;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: u */
    public static final p f14965u = new p() { // from class: f7.d
        @Override // y6.p
        public final k[] c() {
            k[] o10;
            o10 = f.o();
            return o10;
        }
    };

    /* renamed from: v */
    private static final h.a f14966v = new h.a() { // from class: f7.e
        @Override // q7.h.a
        public final boolean a(int i10, int i11, int i12, int i13, int i14) {
            boolean p10;
            p10 = f.p(i10, i11, i12, i13, i14);
            return p10;
        }
    };

    /* renamed from: a */
    private final int f14967a;

    /* renamed from: b */
    private final long f14968b;

    /* renamed from: c */
    private final e0 f14969c;

    /* renamed from: d */
    private final s0.a f14970d;

    /* renamed from: e */
    private final v f14971e;

    /* renamed from: f */
    private final w f14972f;

    /* renamed from: g */
    private final b0 f14973g;

    /* renamed from: h */
    private m f14974h;

    /* renamed from: i */
    private b0 f14975i;

    /* renamed from: j */
    private b0 f14976j;

    /* renamed from: k */
    private int f14977k;

    /* renamed from: l */
    private l7.a f14978l;

    /* renamed from: m */
    private long f14979m;

    /* renamed from: n */
    private long f14980n;

    /* renamed from: o */
    private long f14981o;

    /* renamed from: p */
    private int f14982p;

    /* renamed from: q */
    private g f14983q;

    /* renamed from: r */
    private boolean f14984r;

    /* renamed from: s */
    private boolean f14985s;

    /* renamed from: t */
    private long f14986t;

    public f() {
        this(0);
    }

    public f(int i10) {
        this(i10, -9223372036854775807L);
    }

    public f(int i10, long j10) {
        this.f14967a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f14968b = j10;
        this.f14969c = new e0(10);
        this.f14970d = new s0.a();
        this.f14971e = new v();
        this.f14979m = -9223372036854775807L;
        this.f14972f = new w();
        j jVar = new j();
        this.f14973g = jVar;
        this.f14976j = jVar;
    }

    private void g() {
        t8.a.i(this.f14975i);
        r0.j(this.f14974h);
    }

    private g h(l lVar) {
        long l10;
        long j10;
        g r10 = r(lVar);
        c q10 = q(this.f14978l, lVar.getPosition());
        if (this.f14984r) {
            return new g.a();
        }
        if ((this.f14967a & 4) != 0) {
            if (q10 != null) {
                l10 = q10.i();
                j10 = q10.g();
            } else if (r10 != null) {
                l10 = r10.i();
                j10 = r10.g();
            } else {
                l10 = l(this.f14978l);
                j10 = -1;
            }
            r10 = new b(l10, lVar.getPosition(), j10);
        } else if (q10 != null) {
            r10 = q10;
        } else if (r10 == null) {
            r10 = null;
        }
        if (r10 == null || !(r10.h() || (this.f14967a & 1) == 0)) {
            return k(lVar, (this.f14967a & 2) != 0);
        }
        return r10;
    }

    private long i(long j10) {
        return this.f14979m + ((j10 * 1000000) / this.f14970d.f28115d);
    }

    private g k(l lVar, boolean z10) {
        lVar.q(this.f14969c.e(), 0, 4);
        this.f14969c.U(0);
        this.f14970d.a(this.f14969c.q());
        return new a(lVar.getLength(), lVar.getPosition(), this.f14970d, z10);
    }

    private static long l(l7.a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int e10 = aVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof q7.m) {
                q7.m mVar = (q7.m) d10;
                if (mVar.f23583a.equals("TLEN")) {
                    return r0.C0(Long.parseLong(mVar.f23596d.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    private static int m(e0 e0Var, int i10) {
        if (e0Var.g() >= i10 + 4) {
            e0Var.U(i10);
            int q10 = e0Var.q();
            if (q10 == 1483304551 || q10 == 1231971951) {
                return q10;
            }
        }
        if (e0Var.g() < 40) {
            return 0;
        }
        e0Var.U(36);
        return e0Var.q() == 1447187017 ? 1447187017 : 0;
    }

    private static boolean n(int i10, long j10) {
        return ((long) (i10 & (-128000))) == (j10 & (-128000));
    }

    public static /* synthetic */ k[] o() {
        return new k[]{new f()};
    }

    public static /* synthetic */ boolean p(int i10, int i11, int i12, int i13, int i14) {
        return (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) || (i11 == 77 && i12 == 76 && i13 == 76 && (i14 == 84 || i10 == 2));
    }

    private static c q(l7.a aVar, long j10) {
        if (aVar == null) {
            return null;
        }
        int e10 = aVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            a.b d10 = aVar.d(i10);
            if (d10 instanceof q7.k) {
                return c.a(j10, (q7.k) d10, l(aVar));
            }
        }
        return null;
    }

    private g r(l lVar) {
        e0 e0Var = new e0(this.f14970d.f28114c);
        lVar.q(e0Var.e(), 0, this.f14970d.f28114c);
        s0.a aVar = this.f14970d;
        int i10 = aVar.f28112a & 1;
        int i11 = 21;
        int i12 = aVar.f28116e;
        if (i10 != 0) {
            if (i12 != 1) {
                i11 = 36;
            }
        } else if (i12 == 1) {
            i11 = 13;
        }
        int i13 = i11;
        int m10 = m(e0Var, i13);
        if (m10 != 1483304551 && m10 != 1231971951) {
            if (m10 != 1447187017) {
                lVar.f();
                return null;
            }
            h a10 = h.a(lVar.getLength(), lVar.getPosition(), this.f14970d, e0Var);
            lVar.n(this.f14970d.f28114c);
            return a10;
        }
        i a11 = i.a(lVar.getLength(), lVar.getPosition(), this.f14970d, e0Var);
        if (a11 != null && !this.f14971e.a()) {
            lVar.f();
            lVar.k(i13 + 141);
            lVar.q(this.f14969c.e(), 0, 3);
            this.f14969c.U(0);
            this.f14971e.d(this.f14969c.K());
        }
        lVar.n(this.f14970d.f28114c);
        return (a11 == null || a11.h() || m10 != 1231971951) ? a11 : k(lVar, false);
    }

    private boolean s(l lVar) {
        g gVar = this.f14983q;
        if (gVar != null) {
            long g10 = gVar.g();
            if (g10 != -1 && lVar.i() > g10 - 4) {
                return true;
            }
        }
        try {
            return !lVar.d(this.f14969c.e(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int t(l lVar) {
        if (this.f14977k == 0) {
            try {
                v(lVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.f14983q == null) {
            g h10 = h(lVar);
            this.f14983q = h10;
            this.f14974h.p(h10);
            this.f14976j.c(new u1.b().g0(this.f14970d.f28113b).Y(RecognitionOptions.AZTEC).J(this.f14970d.f28116e).h0(this.f14970d.f28115d).P(this.f14971e.f31788a).Q(this.f14971e.f31789b).Z((this.f14967a & 8) != 0 ? null : this.f14978l).G());
            this.f14981o = lVar.getPosition();
        } else if (this.f14981o != 0) {
            long position = lVar.getPosition();
            long j10 = this.f14981o;
            if (position < j10) {
                lVar.n((int) (j10 - position));
            }
        }
        return u(lVar);
    }

    private int u(l lVar) {
        if (this.f14982p == 0) {
            lVar.f();
            if (s(lVar)) {
                return -1;
            }
            this.f14969c.U(0);
            int q10 = this.f14969c.q();
            if (!n(q10, this.f14977k) || s0.j(q10) == -1) {
                lVar.n(1);
                this.f14977k = 0;
                return 0;
            }
            this.f14970d.a(q10);
            if (this.f14979m == -9223372036854775807L) {
                this.f14979m = this.f14983q.c(lVar.getPosition());
                if (this.f14968b != -9223372036854775807L) {
                    this.f14979m += this.f14968b - this.f14983q.c(0L);
                }
            }
            this.f14982p = this.f14970d.f28114c;
            g gVar = this.f14983q;
            if (gVar instanceof b) {
                b bVar = (b) gVar;
                bVar.b(i(this.f14980n + r0.f28118g), lVar.getPosition() + this.f14970d.f28114c);
                if (this.f14985s && bVar.a(this.f14986t)) {
                    this.f14985s = false;
                    this.f14976j = this.f14975i;
                }
            }
        }
        int f10 = this.f14976j.f(lVar, this.f14982p, true);
        if (f10 == -1) {
            return -1;
        }
        int i10 = this.f14982p - f10;
        this.f14982p = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f14976j.b(i(this.f14980n), 1, this.f14970d.f28114c, 0, null);
        this.f14980n += this.f14970d.f28118g;
        this.f14982p = 0;
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009e, code lost:
    
        if (r13 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a0, code lost:
    
        r12.n(r1 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a8, code lost:
    
        r11.f14977k = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00aa, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a5, code lost:
    
        r12.f();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean v(y6.l r12, boolean r13) {
        /*
            r11 = this;
            if (r13 == 0) goto L6
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L8
        L6:
            r0 = 131072(0x20000, float:1.83671E-40)
        L8:
            r12.f()
            long r1 = r12.getPosition()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L42
            int r1 = r11.f14967a
            r1 = r1 & 8
            if (r1 != 0) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = r4
        L21:
            if (r1 == 0) goto L25
            r1 = r2
            goto L27
        L25:
            q7.h$a r1 = f7.f.f14966v
        L27:
            y6.w r5 = r11.f14972f
            l7.a r1 = r5.a(r12, r1)
            r11.f14978l = r1
            if (r1 == 0) goto L36
            y6.v r5 = r11.f14971e
            r5.c(r1)
        L36:
            long r5 = r12.i()
            int r1 = (int) r5
            if (r13 != 0) goto L40
            r12.n(r1)
        L40:
            r5 = r4
            goto L44
        L42:
            r1 = r4
            r5 = r1
        L44:
            r6 = r5
            r7 = r6
        L46:
            boolean r8 = r11.s(r12)
            if (r8 == 0) goto L55
            if (r6 <= 0) goto L4f
            goto L9e
        L4f:
            java.io.EOFException r12 = new java.io.EOFException
            r12.<init>()
            throw r12
        L55:
            t8.e0 r8 = r11.f14969c
            r8.U(r4)
            t8.e0 r8 = r11.f14969c
            int r8 = r8.q()
            if (r5 == 0) goto L69
            long r9 = (long) r5
            boolean r9 = n(r8, r9)
            if (r9 == 0) goto L70
        L69:
            int r9 = v6.s0.j(r8)
            r10 = -1
            if (r9 != r10) goto L90
        L70:
            int r5 = r7 + 1
            if (r7 != r0) goto L7e
            if (r13 == 0) goto L77
            return r4
        L77:
            java.lang.String r12 = "Searched too many bytes."
            t6.b3 r12 = t6.b3.a(r12, r2)
            throw r12
        L7e:
            if (r13 == 0) goto L89
            r12.f()
            int r6 = r1 + r5
            r12.k(r6)
            goto L8c
        L89:
            r12.n(r3)
        L8c:
            r6 = r4
            r7 = r5
            r5 = r6
            goto L46
        L90:
            int r6 = r6 + 1
            if (r6 != r3) goto L9b
            v6.s0$a r5 = r11.f14970d
            r5.a(r8)
            r5 = r8
            goto Lab
        L9b:
            r8 = 4
            if (r6 != r8) goto Lab
        L9e:
            if (r13 == 0) goto La5
            int r1 = r1 + r7
            r12.n(r1)
            goto La8
        La5:
            r12.f()
        La8:
            r11.f14977k = r5
            return r3
        Lab:
            int r9 = r9 + (-4)
            r12.k(r9)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.f.v(y6.l, boolean):boolean");
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f14977k = 0;
        this.f14979m = -9223372036854775807L;
        this.f14980n = 0L;
        this.f14982p = 0;
        this.f14986t = j11;
        g gVar = this.f14983q;
        if (!(gVar instanceof b) || ((b) gVar).a(j11)) {
            return;
        }
        this.f14985s = true;
        this.f14976j = this.f14973g;
    }

    @Override // y6.k
    public void b(m mVar) {
        this.f14974h = mVar;
        b0 d10 = mVar.d(0, 1);
        this.f14975i = d10;
        this.f14976j = d10;
        this.f14974h.q();
    }

    @Override // y6.k
    public boolean e(l lVar) {
        return v(lVar, true);
    }

    @Override // y6.k
    public int f(l lVar, y yVar) {
        g();
        int t10 = t(lVar);
        if (t10 == -1 && (this.f14983q instanceof b)) {
            long i10 = i(this.f14980n);
            if (this.f14983q.i() != i10) {
                ((b) this.f14983q).e(i10);
                this.f14974h.p(this.f14983q);
            }
        }
        return t10;
    }

    public void j() {
        this.f14984r = true;
    }

    @Override // y6.k
    public void release() {
    }
}
