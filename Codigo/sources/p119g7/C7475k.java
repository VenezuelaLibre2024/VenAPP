package p119g7;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import p082eb.InterfaceC7151g;
import p119g7.AbstractC7465a;
import p216l7.C9400a;
import p328r7.C10632b;
import p361t6.C11005b3;
import p361t6.C11108u1;
import p363t8.C11146e0;
import p363t8.C11172r0;
import p363t8.C11179x;
import p396v6.C11635c;
import p459y6.C12611c0;
import p459y6.C12632v;
import p459y6.C12635y;
import p459y6.InterfaceC12609b0;
import p459y6.InterfaceC12621k;
import p459y6.InterfaceC12622l;
import p459y6.InterfaceC12623m;
import p459y6.InterfaceC12626p;
import p459y6.InterfaceC12636z;

/* renamed from: g7.k */
/* loaded from: classes.dex */
public final class C7475k implements InterfaceC12621k, InterfaceC12636z {

    /* renamed from: y */
    public static final InterfaceC12626p f17551y = new InterfaceC12626p() { // from class: g7.i
        @Override // p459y6.InterfaceC12626p
        /* renamed from: c */
        public final InterfaceC12621k[] mo9153c() {
            InterfaceC12621k[] m22718s;
            m22718s = C7475k.m22718s();
            return m22718s;
        }
    };

    /* renamed from: a */
    private final int f17552a;

    /* renamed from: b */
    private final C11146e0 f17553b;

    /* renamed from: c */
    private final C11146e0 f17554c;

    /* renamed from: d */
    private final C11146e0 f17555d;

    /* renamed from: e */
    private final C11146e0 f17556e;

    /* renamed from: f */
    private final ArrayDeque<AbstractC7465a.a> f17557f;

    /* renamed from: g */
    private final C7477m f17558g;

    /* renamed from: h */
    private final List<C9400a.b> f17559h;

    /* renamed from: i */
    private int f17560i;

    /* renamed from: j */
    private int f17561j;

    /* renamed from: k */
    private long f17562k;

    /* renamed from: l */
    private int f17563l;

    /* renamed from: m */
    private C11146e0 f17564m;

    /* renamed from: n */
    private int f17565n;

    /* renamed from: o */
    private int f17566o;

    /* renamed from: p */
    private int f17567p;

    /* renamed from: q */
    private int f17568q;

    /* renamed from: r */
    private InterfaceC12623m f17569r;

    /* renamed from: s */
    private a[] f17570s;

    /* renamed from: t */
    private long[][] f17571t;

    /* renamed from: u */
    private int f17572u;

    /* renamed from: v */
    private long f17573v;

    /* renamed from: w */
    private int f17574w;

    /* renamed from: x */
    private C10632b f17575x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g7.k$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C7479o f17576a;

        /* renamed from: b */
        public final C7482r f17577b;

        /* renamed from: c */
        public final InterfaceC12609b0 f17578c;

        /* renamed from: d */
        public final C12611c0 f17579d;

        /* renamed from: e */
        public int f17580e;

        public a(C7479o c7479o, C7482r c7482r, InterfaceC12609b0 interfaceC12609b0) {
            this.f17576a = c7479o;
            this.f17577b = c7482r;
            this.f17578c = interfaceC12609b0;
            this.f17579d = "audio/true-hd".equals(c7479o.f17598f.f28797w) ? new C12611c0() : null;
        }
    }

    public C7475k() {
        this(0);
    }

    public C7475k(int i10) {
        this.f17552a = i10;
        this.f17560i = (i10 & 4) != 0 ? 3 : 0;
        this.f17558g = new C7477m();
        this.f17559h = new ArrayList();
        this.f17556e = new C11146e0(16);
        this.f17557f = new ArrayDeque<>();
        this.f17553b = new C11146e0(C11179x.f29069a);
        this.f17554c = new C11146e0(4);
        this.f17555d = new C11146e0();
        this.f17565n = -1;
        this.f17569r = InterfaceC12623m.f34302o;
        this.f17570s = new a[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m22703A(p459y6.InterfaceC12622l r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p119g7.C7475k.m22703A(y6.l):boolean");
    }

    /* renamed from: B */
    private boolean m22704B(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        boolean z10;
        long j10 = this.f17562k - this.f17563l;
        long position = interfaceC12622l.getPosition() + j10;
        C11146e0 c11146e0 = this.f17564m;
        if (c11146e0 != null) {
            interfaceC12622l.readFully(c11146e0.m34682e(), this.f17563l, (int) j10);
            if (this.f17561j == 1718909296) {
                this.f17574w = m22723x(c11146e0);
            } else if (!this.f17557f.isEmpty()) {
                this.f17557f.peek().m22594e(new AbstractC7465a.b(this.f17561j, c11146e0));
            }
        } else {
            if (j10 >= 262144) {
                c12635y.f34331a = interfaceC12622l.getPosition() + j10;
                z10 = true;
                m22721v(position);
                return (z10 || this.f17560i == 2) ? false : true;
            }
            interfaceC12622l.mo41538n((int) j10);
        }
        z10 = false;
        m22721v(position);
        if (z10) {
        }
    }

    /* renamed from: C */
    private int m22705C(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int i10;
        C12635y c12635y2;
        long position = interfaceC12622l.getPosition();
        if (this.f17565n == -1) {
            int m22716q = m22716q(position);
            this.f17565n = m22716q;
            if (m22716q == -1) {
                return -1;
            }
        }
        a aVar = this.f17570s[this.f17565n];
        InterfaceC12609b0 interfaceC12609b0 = aVar.f17578c;
        int i11 = aVar.f17580e;
        C7482r c7482r = aVar.f17577b;
        long j10 = c7482r.f17629c[i11];
        int i12 = c7482r.f17630d[i11];
        C12611c0 c12611c0 = aVar.f17579d;
        long j11 = (j10 - position) + this.f17566o;
        if (j11 < 0) {
            i10 = 1;
            c12635y2 = c12635y;
        } else {
            if (j11 < 262144) {
                if (aVar.f17576a.f17599g == 1) {
                    j11 += 8;
                    i12 -= 8;
                }
                interfaceC12622l.mo41538n((int) j11);
                C7479o c7479o = aVar.f17576a;
                if (c7479o.f17602j == 0) {
                    if ("audio/ac4".equals(c7479o.f17598f.f28797w)) {
                        if (this.f17567p == 0) {
                            C11635c.m36480a(i12, this.f17555d);
                            interfaceC12609b0.m41511a(this.f17555d, 7);
                            this.f17567p += 7;
                        }
                        i12 += 7;
                    } else if (c12611c0 != null) {
                        c12611c0.m41517d(interfaceC12622l);
                    }
                    while (true) {
                        int i13 = this.f17567p;
                        if (i13 >= i12) {
                            break;
                        }
                        int m41512f = interfaceC12609b0.m41512f(interfaceC12622l, i12 - i13, false);
                        this.f17566o += m41512f;
                        this.f17567p += m41512f;
                        this.f17568q -= m41512f;
                    }
                } else {
                    byte[] m34682e = this.f17554c.m34682e();
                    m34682e[0] = 0;
                    m34682e[1] = 0;
                    m34682e[2] = 0;
                    int i14 = aVar.f17576a.f17602j;
                    int i15 = 4 - i14;
                    while (this.f17567p < i12) {
                        int i16 = this.f17568q;
                        if (i16 == 0) {
                            interfaceC12622l.readFully(m34682e, i15, i14);
                            this.f17566o += i14;
                            this.f17554c.m34677U(0);
                            int m34692q = this.f17554c.m34692q();
                            if (m34692q < 0) {
                                throw C11005b3.m33715a("Invalid NAL length", null);
                            }
                            this.f17568q = m34692q;
                            this.f17553b.m34677U(0);
                            interfaceC12609b0.m41511a(this.f17553b, 4);
                            this.f17567p += 4;
                            i12 += i15;
                        } else {
                            int m41512f2 = interfaceC12609b0.m41512f(interfaceC12622l, i16, false);
                            this.f17566o += m41512f2;
                            this.f17567p += m41512f2;
                            this.f17568q -= m41512f2;
                        }
                    }
                }
                int i17 = i12;
                C7482r c7482r2 = aVar.f17577b;
                long j12 = c7482r2.f17632f[i11];
                int i18 = c7482r2.f17633g[i11];
                if (c12611c0 != null) {
                    c12611c0.m41516c(interfaceC12609b0, j12, i18, i17, 0, null);
                    if (i11 + 1 == aVar.f17577b.f17628b) {
                        c12611c0.m41514a(interfaceC12609b0, null);
                    }
                } else {
                    interfaceC12609b0.mo331b(j12, i18, i17, 0, null);
                }
                aVar.f17580e++;
                this.f17565n = -1;
                this.f17566o = 0;
                this.f17567p = 0;
                this.f17568q = 0;
                return 0;
            }
            c12635y2 = c12635y;
            i10 = 1;
        }
        c12635y2.f34331a = j10;
        return i10;
    }

    /* renamed from: D */
    private int m22706D(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        int m22742c = this.f17558g.m22742c(interfaceC12622l, c12635y, this.f17559h);
        if (m22742c == 1 && c12635y.f34331a == 0) {
            m22714n();
        }
        return m22742c;
    }

    /* renamed from: E */
    private static boolean m22707E(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    /* renamed from: F */
    private static boolean m22708F(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    /* renamed from: G */
    private void m22709G(a aVar, long j10) {
        C7482r c7482r = aVar.f17577b;
        int m22757a = c7482r.m22757a(j10);
        if (m22757a == -1) {
            m22757a = c7482r.m22758b(j10);
        }
        aVar.f17580e = m22757a;
    }

    /* renamed from: l */
    private static int m22712l(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: m */
    private static long[][] m22713m(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].f17577b.f17628b];
            jArr2[i10] = aVarArr[i10].f17577b.f17632f[0];
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
            C7482r c7482r = aVarArr[i12].f17577b;
            j10 += c7482r.f17630d[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = c7482r.f17632f[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    /* renamed from: n */
    private void m22714n() {
        this.f17560i = 0;
        this.f17563l = 0;
    }

    /* renamed from: p */
    private static int m22715p(C7482r c7482r, long j10) {
        int m22757a = c7482r.m22757a(j10);
        return m22757a == -1 ? c7482r.m22758b(j10) : m22757a;
    }

    /* renamed from: q */
    private int m22716q(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f17570s;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.f17580e;
            C7482r c7482r = aVar.f17577b;
            if (i13 != c7482r.f17628b) {
                long j14 = c7482r.f17629c[i13];
                long j15 = ((long[][]) C11172r0.m34928j(this.f17571t))[i12][i13];
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
    /* renamed from: r */
    public static /* synthetic */ C7479o m22717r(C7479o c7479o) {
        return c7479o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ InterfaceC12621k[] m22718s() {
        return new InterfaceC12621k[]{new C7475k()};
    }

    /* renamed from: t */
    private static long m22719t(C7482r c7482r, long j10, long j11) {
        int m22715p = m22715p(c7482r, j10);
        return m22715p == -1 ? j11 : Math.min(c7482r.f17629c[m22715p], j11);
    }

    /* renamed from: u */
    private void m22720u(InterfaceC12622l interfaceC12622l) {
        this.f17555d.m34673Q(8);
        interfaceC12622l.mo41540q(this.f17555d.m34682e(), 0, 8);
        C7466b.m22605e(this.f17555d);
        interfaceC12622l.mo41538n(this.f17555d.m34683f());
        interfaceC12622l.mo41534f();
    }

    /* renamed from: v */
    private void m22721v(long j10) {
        while (!this.f17557f.isEmpty() && this.f17557f.peek().f17454b == j10) {
            AbstractC7465a.a pop = this.f17557f.pop();
            if (pop.f17453a == 1836019574) {
                m22724y(pop);
                this.f17557f.clear();
                this.f17560i = 2;
            } else if (!this.f17557f.isEmpty()) {
                this.f17557f.peek().m22593d(pop);
            }
        }
        if (this.f17560i != 2) {
            m22714n();
        }
    }

    /* renamed from: w */
    private void m22722w() {
        if (this.f17574w != 2 || (this.f17552a & 2) == 0) {
            return;
        }
        this.f17569r.mo308d(0, 4).mo332c(new C11108u1.b().m34545Z(this.f17575x == null ? null : new C9400a(this.f17575x)).m34526G());
        this.f17569r.mo324q();
        this.f17569r.mo323p(new InterfaceC12636z.b(-9223372036854775807L));
    }

    /* renamed from: x */
    private static int m22723x(C11146e0 c11146e0) {
        c11146e0.m34677U(8);
        int m22712l = m22712l(c11146e0.m34692q());
        if (m22712l != 0) {
            return m22712l;
        }
        c11146e0.m34678V(4);
        while (c11146e0.m34679a() > 0) {
            int m22712l2 = m22712l(c11146e0.m34692q());
            if (m22712l2 != 0) {
                return m22712l2;
            }
        }
        return 0;
    }

    /* renamed from: y */
    private void m22724y(AbstractC7465a.a aVar) {
        C9400a c9400a;
        C9400a c9400a2;
        List<C7482r> list;
        int i10;
        int i11;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f17574w == 1;
        C12632v c12632v = new C12632v();
        AbstractC7465a.b m22596g = aVar.m22596g(1969517665);
        if (m22596g != null) {
            Pair<C9400a, C9400a> m22598B = C7466b.m22598B(m22596g);
            C9400a c9400a3 = (C9400a) m22598B.first;
            C9400a c9400a4 = (C9400a) m22598B.second;
            if (c9400a3 != null) {
                c12632v.m41604c(c9400a3);
            }
            c9400a = c9400a4;
            c9400a2 = c9400a3;
        } else {
            c9400a = null;
            c9400a2 = null;
        }
        AbstractC7465a.a m22595f = aVar.m22595f(1835365473);
        C9400a m22614n = m22595f != null ? C7466b.m22614n(m22595f) : null;
        List<C7482r> m22597A = C7466b.m22597A(aVar, c12632v, -9223372036854775807L, null, (this.f17552a & 1) != 0, z10, new InterfaceC7151g() { // from class: g7.j
            @Override // p082eb.InterfaceC7151g
            public final Object apply(Object obj) {
                C7479o m22717r;
                m22717r = C7475k.m22717r((C7479o) obj);
                return m22717r;
            }
        });
        int size = m22597A.size();
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        int i12 = 0;
        int i13 = -1;
        while (i12 < size) {
            C7482r c7482r = m22597A.get(i12);
            if (c7482r.f17628b == 0) {
                list = m22597A;
                i10 = size;
            } else {
                C7479o c7479o = c7482r.f17627a;
                list = m22597A;
                i10 = size;
                long j12 = c7479o.f17597e;
                if (j12 == j10) {
                    j12 = c7482r.f17634h;
                }
                long max = Math.max(j11, j12);
                a aVar2 = new a(c7479o, c7482r, this.f17569r.mo308d(i12, c7479o.f17594b));
                int i14 = "audio/true-hd".equals(c7479o.f17598f.f28797w) ? c7482r.f17631e * 16 : c7482r.f17631e + 30;
                C11108u1.b m34488c = c7479o.f17598f.m34488c();
                m34488c.m34544Y(i14);
                if (c7479o.f17594b == 2 && j12 > 0 && (i11 = c7482r.f17628b) > 1) {
                    m34488c.m34537R(i11 / (((float) j12) / 1000000.0f));
                }
                C7472h.m22701k(c7479o.f17594b, c12632v, m34488c);
                int i15 = c7479o.f17594b;
                C9400a[] c9400aArr = new C9400a[2];
                c9400aArr[0] = c9400a;
                c9400aArr[1] = this.f17559h.isEmpty() ? null : new C9400a(this.f17559h);
                C7472h.m22702l(i15, c9400a2, m22614n, m34488c, c9400aArr);
                aVar2.f17578c.mo332c(m34488c.m34526G());
                if (c7479o.f17594b == 2 && i13 == -1) {
                    i13 = arrayList.size();
                }
                arrayList.add(aVar2);
                j11 = max;
            }
            i12++;
            m22597A = list;
            size = i10;
            j10 = -9223372036854775807L;
        }
        this.f17572u = i13;
        this.f17573v = j11;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.f17570s = aVarArr;
        this.f17571t = m22713m(aVarArr);
        this.f17569r.mo324q();
        this.f17569r.mo323p(this);
    }

    /* renamed from: z */
    private void m22725z(long j10) {
        if (this.f17561j == 1836086884) {
            int i10 = this.f17563l;
            this.f17575x = new C10632b(0L, j10, -9223372036854775807L, j10 + i10, this.f17562k - i10);
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: a */
    public void mo121a(long j10, long j11) {
        this.f17557f.clear();
        this.f17563l = 0;
        this.f17565n = -1;
        this.f17566o = 0;
        this.f17567p = 0;
        this.f17568q = 0;
        if (j10 == 0) {
            if (this.f17560i != 3) {
                m22714n();
                return;
            } else {
                this.f17558g.m22743g();
                this.f17559h.clear();
                return;
            }
        }
        for (a aVar : this.f17570s) {
            m22709G(aVar, j11);
            C12611c0 c12611c0 = aVar.f17579d;
            if (c12611c0 != null) {
                c12611c0.m41515b();
            }
        }
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: b */
    public void mo122b(InterfaceC12623m interfaceC12623m) {
        this.f17569r = interfaceC12623m;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: d */
    public InterfaceC12636z.a mo125d(long j10) {
        return m22726o(j10, -1);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: e */
    public boolean mo123e(InterfaceC12622l interfaceC12622l) {
        return C7478n.m22747d(interfaceC12622l, (this.f17552a & 2) != 0);
    }

    @Override // p459y6.InterfaceC12621k
    /* renamed from: f */
    public int mo124f(InterfaceC12622l interfaceC12622l, C12635y c12635y) {
        while (true) {
            int i10 = this.f17560i;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return m22705C(interfaceC12622l, c12635y);
                    }
                    if (i10 == 3) {
                        return m22706D(interfaceC12622l, c12635y);
                    }
                    throw new IllegalStateException();
                }
                if (m22704B(interfaceC12622l, c12635y)) {
                    return 1;
                }
            } else if (!m22703A(interfaceC12622l)) {
                return -1;
            }
        }
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: h */
    public boolean mo126h() {
        return true;
    }

    @Override // p459y6.InterfaceC12636z
    /* renamed from: i */
    public long mo127i() {
        return this.f17573v;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p459y6.InterfaceC12636z.a m22726o(long r17, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r19
            g7.k$a[] r4 = r0.f17570s
            int r5 = r4.length
            if (r5 != 0) goto L13
            y6.z$a r1 = new y6.z$a
            y6.a0 r2 = p459y6.C12607a0.f34222c
            r1.<init>(r2)
            return r1
        L13:
            r5 = -1
            if (r3 == r5) goto L18
            r6 = r3
            goto L1a
        L18:
            int r6 = r0.f17572u
        L1a:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = -1
            if (r6 == r5) goto L58
            r4 = r4[r6]
            g7.r r4 = r4.f17577b
            int r6 = m22715p(r4, r1)
            if (r6 != r5) goto L35
            y6.z$a r1 = new y6.z$a
            y6.a0 r2 = p459y6.C12607a0.f34222c
            r1.<init>(r2)
            return r1
        L35:
            long[] r11 = r4.f17632f
            r12 = r11[r6]
            long[] r11 = r4.f17629c
            r14 = r11[r6]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5e
            int r11 = r4.f17628b
            int r11 = r11 + (-1)
            if (r6 >= r11) goto L5e
            int r1 = r4.m22758b(r1)
            if (r1 == r5) goto L5e
            if (r1 == r6) goto L5e
            long[] r2 = r4.f17632f
            r9 = r2[r1]
            long[] r2 = r4.f17629c
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
            g7.k$a[] r4 = r0.f17570s
            int r5 = r4.length
            if (r3 >= r5) goto L7f
            int r5 = r0.f17572u
            if (r3 == r5) goto L7c
            r4 = r4[r3]
            g7.r r4 = r4.f17577b
            long r14 = m22719t(r4, r12, r14)
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L7c
            long r1 = m22719t(r4, r9, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: p119g7.C7475k.m22726o(long, int):y6.z$a");
    }

    @Override // p459y6.InterfaceC12621k
    public void release() {
    }
}
