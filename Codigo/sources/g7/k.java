package g7;

import android.util.Pair;
import g7.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import l7.a;
import t6.b3;
import t6.u1;
import t8.e0;
import t8.r0;
import t8.x;
import y6.b0;
import y6.c0;
import y6.v;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class k implements y6.k, z {

    /* renamed from: y, reason: collision with root package name */
    public static final y6.p f15958y = new y6.p() { // from class: g7.i
        @Override // y6.p
        public final y6.k[] c() {
            y6.k[] s10;
            s10 = k.s();
            return s10;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f15959a;

    /* renamed from: b, reason: collision with root package name */
    private final e0 f15960b;

    /* renamed from: c, reason: collision with root package name */
    private final e0 f15961c;

    /* renamed from: d, reason: collision with root package name */
    private final e0 f15962d;

    /* renamed from: e, reason: collision with root package name */
    private final e0 f15963e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<a.C0260a> f15964f;

    /* renamed from: g, reason: collision with root package name */
    private final m f15965g;

    /* renamed from: h, reason: collision with root package name */
    private final List<a.b> f15966h;

    /* renamed from: i, reason: collision with root package name */
    private int f15967i;

    /* renamed from: j, reason: collision with root package name */
    private int f15968j;

    /* renamed from: k, reason: collision with root package name */
    private long f15969k;

    /* renamed from: l, reason: collision with root package name */
    private int f15970l;

    /* renamed from: m, reason: collision with root package name */
    private e0 f15971m;

    /* renamed from: n, reason: collision with root package name */
    private int f15972n;

    /* renamed from: o, reason: collision with root package name */
    private int f15973o;

    /* renamed from: p, reason: collision with root package name */
    private int f15974p;

    /* renamed from: q, reason: collision with root package name */
    private int f15975q;

    /* renamed from: r, reason: collision with root package name */
    private y6.m f15976r;

    /* renamed from: s, reason: collision with root package name */
    private a[] f15977s;

    /* renamed from: t, reason: collision with root package name */
    private long[][] f15978t;

    /* renamed from: u, reason: collision with root package name */
    private int f15979u;

    /* renamed from: v, reason: collision with root package name */
    private long f15980v;

    /* renamed from: w, reason: collision with root package name */
    private int f15981w;

    /* renamed from: x, reason: collision with root package name */
    private r7.b f15982x;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final o f15983a;

        /* renamed from: b, reason: collision with root package name */
        public final r f15984b;

        /* renamed from: c, reason: collision with root package name */
        public final b0 f15985c;

        /* renamed from: d, reason: collision with root package name */
        public final c0 f15986d;

        /* renamed from: e, reason: collision with root package name */
        public int f15987e;

        public a(o oVar, r rVar, b0 b0Var) {
            this.f15983a = oVar;
            this.f15984b = rVar;
            this.f15985c = b0Var;
            this.f15986d = "audio/true-hd".equals(oVar.f16005f.f26517w) ? new c0() : null;
        }
    }

    public k() {
        this(0);
    }

    public k(int i10) {
        this.f15959a = i10;
        this.f15967i = (i10 & 4) != 0 ? 3 : 0;
        this.f15965g = new m();
        this.f15966h = new ArrayList();
        this.f15963e = new e0(16);
        this.f15964f = new ArrayDeque<>();
        this.f15960b = new e0(x.f26773a);
        this.f15961c = new e0(4);
        this.f15962d = new e0();
        this.f15972n = -1;
        this.f15976r = y6.m.f31766o;
        this.f15977s = new a[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A(y6.l r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.k.A(y6.l):boolean");
    }

    private boolean B(y6.l lVar, y yVar) {
        boolean z10;
        long j10 = this.f15969k - this.f15970l;
        long position = lVar.getPosition() + j10;
        e0 e0Var = this.f15971m;
        if (e0Var != null) {
            lVar.readFully(e0Var.e(), this.f15970l, (int) j10);
            if (this.f15968j == 1718909296) {
                this.f15981w = x(e0Var);
            } else if (!this.f15964f.isEmpty()) {
                this.f15964f.peek().e(new a.b(this.f15968j, e0Var));
            }
        } else {
            if (j10 >= 262144) {
                yVar.f31795a = lVar.getPosition() + j10;
                z10 = true;
                v(position);
                return (z10 || this.f15967i == 2) ? false : true;
            }
            lVar.n((int) j10);
        }
        z10 = false;
        v(position);
        if (z10) {
        }
    }

    private int C(y6.l lVar, y yVar) {
        int i10;
        y yVar2;
        long position = lVar.getPosition();
        if (this.f15972n == -1) {
            int q10 = q(position);
            this.f15972n = q10;
            if (q10 == -1) {
                return -1;
            }
        }
        a aVar = this.f15977s[this.f15972n];
        b0 b0Var = aVar.f15985c;
        int i11 = aVar.f15987e;
        r rVar = aVar.f15984b;
        long j10 = rVar.f16036c[i11];
        int i12 = rVar.f16037d[i11];
        c0 c0Var = aVar.f15986d;
        long j11 = (j10 - position) + this.f15973o;
        if (j11 < 0) {
            i10 = 1;
            yVar2 = yVar;
        } else {
            if (j11 < 262144) {
                if (aVar.f15983a.f16006g == 1) {
                    j11 += 8;
                    i12 -= 8;
                }
                lVar.n((int) j11);
                o oVar = aVar.f15983a;
                if (oVar.f16009j == 0) {
                    if ("audio/ac4".equals(oVar.f16005f.f26517w)) {
                        if (this.f15974p == 0) {
                            v6.c.a(i12, this.f15962d);
                            b0Var.a(this.f15962d, 7);
                            this.f15974p += 7;
                        }
                        i12 += 7;
                    } else if (c0Var != null) {
                        c0Var.d(lVar);
                    }
                    while (true) {
                        int i13 = this.f15974p;
                        if (i13 >= i12) {
                            break;
                        }
                        int f10 = b0Var.f(lVar, i12 - i13, false);
                        this.f15973o += f10;
                        this.f15974p += f10;
                        this.f15975q -= f10;
                    }
                } else {
                    byte[] e10 = this.f15961c.e();
                    e10[0] = 0;
                    e10[1] = 0;
                    e10[2] = 0;
                    int i14 = aVar.f15983a.f16009j;
                    int i15 = 4 - i14;
                    while (this.f15974p < i12) {
                        int i16 = this.f15975q;
                        if (i16 == 0) {
                            lVar.readFully(e10, i15, i14);
                            this.f15973o += i14;
                            this.f15961c.U(0);
                            int q11 = this.f15961c.q();
                            if (q11 < 0) {
                                throw b3.a("Invalid NAL length", null);
                            }
                            this.f15975q = q11;
                            this.f15960b.U(0);
                            b0Var.a(this.f15960b, 4);
                            this.f15974p += 4;
                            i12 += i15;
                        } else {
                            int f11 = b0Var.f(lVar, i16, false);
                            this.f15973o += f11;
                            this.f15974p += f11;
                            this.f15975q -= f11;
                        }
                    }
                }
                int i17 = i12;
                r rVar2 = aVar.f15984b;
                long j12 = rVar2.f16039f[i11];
                int i18 = rVar2.f16040g[i11];
                if (c0Var != null) {
                    c0Var.c(b0Var, j12, i18, i17, 0, null);
                    if (i11 + 1 == aVar.f15984b.f16035b) {
                        c0Var.a(b0Var, null);
                    }
                } else {
                    b0Var.b(j12, i18, i17, 0, null);
                }
                aVar.f15987e++;
                this.f15972n = -1;
                this.f15973o = 0;
                this.f15974p = 0;
                this.f15975q = 0;
                return 0;
            }
            yVar2 = yVar;
            i10 = 1;
        }
        yVar2.f31795a = j10;
        return i10;
    }

    private int D(y6.l lVar, y yVar) {
        int c10 = this.f15965g.c(lVar, yVar, this.f15966h);
        if (c10 == 1 && yVar.f31795a == 0) {
            n();
        }
        return c10;
    }

    private static boolean E(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean F(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    private void G(a aVar, long j10) {
        r rVar = aVar.f15984b;
        int a10 = rVar.a(j10);
        if (a10 == -1) {
            a10 = rVar.b(j10);
        }
        aVar.f15987e = a10;
    }

    private static int l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f15984b.f16035b];
            jArr2[i10] = aVarArr[i10].f15984b.f16039f[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            r rVar = aVarArr[i12].f15984b;
            j10 += rVar.f16037d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = rVar.f16039f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void n() {
        this.f15967i = 0;
        this.f15970l = 0;
    }

    private static int p(r rVar, long j10) {
        int a10 = rVar.a(j10);
        return a10 == -1 ? rVar.b(j10) : a10;
    }

    private int q(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f15977s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f15987e;
            r rVar = aVar.f15984b;
            if (i13 != rVar.f16035b) {
                long j14 = rVar.f16036c[i13];
                long j15 = ((long[][]) r0.j(this.f15978t))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + 10485760) ? i11 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o r(o oVar) {
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y6.k[] s() {
        return new y6.k[]{new k()};
    }

    private static long t(r rVar, long j10, long j11) {
        int p10 = p(rVar, j10);
        return p10 == -1 ? j11 : Math.min(rVar.f16036c[p10], j11);
    }

    private void u(y6.l lVar) {
        this.f15962d.Q(8);
        lVar.q(this.f15962d.e(), 0, 8);
        b.e(this.f15962d);
        lVar.n(this.f15962d.f());
        lVar.f();
    }

    private void v(long j10) {
        while (!this.f15964f.isEmpty() && this.f15964f.peek().f15872b == j10) {
            a.C0260a pop = this.f15964f.pop();
            if (pop.f15871a == 1836019574) {
                y(pop);
                this.f15964f.clear();
                this.f15967i = 2;
            } else if (!this.f15964f.isEmpty()) {
                this.f15964f.peek().d(pop);
            }
        }
        if (this.f15967i != 2) {
            n();
        }
    }

    private void w() {
        if (this.f15981w != 2 || (this.f15959a & 2) == 0) {
            return;
        }
        this.f15976r.d(0, 4).c(new u1.b().Z(this.f15982x == null ? null : new l7.a(this.f15982x)).G());
        this.f15976r.q();
        this.f15976r.p(new z.b(-9223372036854775807L));
    }

    private static int x(e0 e0Var) {
        e0Var.U(8);
        int l10 = l(e0Var.q());
        if (l10 != 0) {
            return l10;
        }
        e0Var.V(4);
        while (e0Var.a() > 0) {
            int l11 = l(e0Var.q());
            if (l11 != 0) {
                return l11;
            }
        }
        return 0;
    }

    private void y(a.C0260a c0260a) {
        l7.a aVar;
        l7.a aVar2;
        List<r> list;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f15981w == 1;
        v vVar = new v();
        a.b g10 = c0260a.g(1969517665);
        if (g10 != null) {
            Pair<l7.a, l7.a> B = b.B(g10);
            l7.a aVar3 = (l7.a) B.first;
            l7.a aVar4 = (l7.a) B.second;
            if (aVar3 != null) {
                vVar.c(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        a.C0260a f10 = c0260a.f(1835365473);
        l7.a n10 = f10 != null ? b.n(f10) : null;
        List<r> A = b.A(c0260a, vVar, -9223372036854775807L, null, (this.f15959a & 1) != 0, z10, new eb.g() { // from class: g7.j
            @Override // eb.g
            public final Object apply(Object obj) {
                o r10;
                r10 = k.r((o) obj);
                return r10;
            }
        });
        int size = A.size();
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        int i12 = 0;
        int i13 = -1;
        while (i12 < size) {
            r rVar = A.get(i12);
            if (rVar.f16035b == 0) {
                list = A;
                i10 = size;
            } else {
                o oVar = rVar.f16034a;
                list = A;
                i10 = size;
                long j12 = oVar.f16004e;
                if (j12 == j10) {
                    j12 = rVar.f16041h;
                }
                long max = Math.max(j11, j12);
                a aVar5 = new a(oVar, rVar, this.f15976r.d(i12, oVar.f16001b));
                int i14 = "audio/true-hd".equals(oVar.f16005f.f26517w) ? rVar.f16038e * 16 : rVar.f16038e + 30;
                u1.b c10 = oVar.f16005f.c();
                c10.Y(i14);
                if (oVar.f16001b == 2 && j12 > 0 && (i11 = rVar.f16035b) > 1) {
                    c10.R(i11 / (((float) j12) / 1000000.0f));
                }
                h.k(oVar.f16001b, vVar, c10);
                int i15 = oVar.f16001b;
                l7.a[] aVarArr = new l7.a[2];
                aVarArr[0] = aVar;
                aVarArr[1] = this.f15966h.isEmpty() ? null : new l7.a(this.f15966h);
                h.l(i15, aVar2, n10, c10, aVarArr);
                aVar5.f15985c.c(c10.G());
                if (oVar.f16001b == 2 && i13 == -1) {
                    i13 = arrayList.size();
                }
                arrayList.add(aVar5);
                j11 = max;
            }
            i12++;
            A = list;
            size = i10;
            j10 = -9223372036854775807L;
        }
        this.f15979u = i13;
        this.f15980v = j11;
        a[] aVarArr2 = (a[]) arrayList.toArray(new a[0]);
        this.f15977s = aVarArr2;
        this.f15978t = m(aVarArr2);
        this.f15976r.q();
        this.f15976r.p(this);
    }

    private void z(long j10) {
        if (this.f15968j == 1836086884) {
            int i10 = this.f15970l;
            this.f15982x = new r7.b(0L, j10, -9223372036854775807L, j10 + i10, this.f15969k - i10);
        }
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        this.f15964f.clear();
        this.f15970l = 0;
        this.f15972n = -1;
        this.f15973o = 0;
        this.f15974p = 0;
        this.f15975q = 0;
        if (j10 == 0) {
            if (this.f15967i != 3) {
                n();
                return;
            } else {
                this.f15965g.g();
                this.f15966h.clear();
                return;
            }
        }
        for (a aVar : this.f15977s) {
            G(aVar, j11);
            c0 c0Var = aVar.f15986d;
            if (c0Var != null) {
                c0Var.b();
            }
        }
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.f15976r = mVar;
    }

    @Override // y6.z
    public z.a d(long j10) {
        return o(j10, -1);
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        return n.d(lVar, (this.f15959a & 2) != 0);
    }

    @Override // y6.k
    public int f(y6.l lVar, y yVar) {
        while (true) {
            int i10 = this.f15967i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return C(lVar, yVar);
                    }
                    if (i10 == 3) {
                        return D(lVar, yVar);
                    }
                    throw new IllegalStateException();
                }
                if (B(lVar, yVar)) {
                    return 1;
                }
            } else if (!A(lVar)) {
                return -1;
            }
        }
    }

    @Override // y6.z
    public boolean h() {
        return true;
    }

    @Override // y6.z
    public long i() {
        return this.f15980v;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y6.z.a o(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            g7.k$a[] r4 = r0.f15977s
            int r5 = r4.length
            if (r5 != 0) goto L13
            y6.z$a r1 = new y6.z$a
            y6.a0 r2 = y6.a0.f31686c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f15979u
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            g7.r r4 = r4.f15984b
            int r6 = p(r4, r1)
            if (r6 != r5) goto L35
            y6.z$a r1 = new y6.z$a
            y6.a0 r2 = y6.a0.f31686c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f16039f
            r12 = r11[r6]
            long[] r11 = r4.f16036c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f16035b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f16039f
            r9 = r2[r1]
            long[] r2 = r4.f16036c
            r1 = r2[r1]
            goto L60
        L58:
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = r1
        L5e:
            r1 = r9
            r9 = r7
        L60:
            if (r3 != r5) goto L7f
            r3 = 0
        L63:
            g7.k$a[] r4 = r0.f15977s
            int r5 = r4.length
            if (r3 >= r5) goto L7f
            int r5 = r0.f15979u
            if (r3 == r5) goto L7c
            r4 = r4[r3]
            g7.r r4 = r4.f15984b
            long r14 = t(r4, r12, r14)
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L7c
            long r1 = t(r4, r9, r1)
        L7c:
            int r3 = r3 + 1
            goto L63
        L7f:
            y6.a0 r3 = new y6.a0
            r3.<init>(r12, r14)
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 != 0) goto L8e
            y6.z$a r1 = new y6.z$a
            r1.<init>(r3)
            return r1
        L8e:
            y6.a0 r4 = new y6.a0
            r4.<init>(r9, r1)
            y6.z$a r1 = new y6.z$a
            r1.<init>(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.k.o(long, int):y6.z$a");
    }

    @Override // y6.k
    public void release() {
    }
}
