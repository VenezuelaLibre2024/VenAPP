package g7;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.a;
import com.google.android.libraries.barhopper.RecognitionOptions;
import g7.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import t6.b3;
import t6.u1;
import t8.e0;
import t8.n0;
import t8.r0;
import t8.s;
import t8.x;
import x6.m;
import y6.b0;
import y6.v;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public class g implements y6.k {
    public static final y6.p I = new y6.p() { // from class: g7.f
        @Override // y6.p
        public final y6.k[] c() {
            y6.k[] m10;
            m10 = g.m();
            return m10;
        }
    };
    private static final byte[] J = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final u1 K = new u1.b().g0("application/x-emsg").G();
    private int A;
    private int B;
    private int C;
    private boolean D;
    private y6.m E;
    private b0[] F;
    private b0[] G;
    private boolean H;

    /* renamed from: a */
    private final int f15916a;

    /* renamed from: b */
    private final o f15917b;

    /* renamed from: c */
    private final List<u1> f15918c;

    /* renamed from: d */
    private final SparseArray<b> f15919d;

    /* renamed from: e */
    private final e0 f15920e;

    /* renamed from: f */
    private final e0 f15921f;

    /* renamed from: g */
    private final e0 f15922g;

    /* renamed from: h */
    private final byte[] f15923h;

    /* renamed from: i */
    private final e0 f15924i;

    /* renamed from: j */
    private final n0 f15925j;

    /* renamed from: k */
    private final n7.c f15926k;

    /* renamed from: l */
    private final e0 f15927l;

    /* renamed from: m */
    private final ArrayDeque<a.C0260a> f15928m;

    /* renamed from: n */
    private final ArrayDeque<a> f15929n;

    /* renamed from: o */
    private final b0 f15930o;

    /* renamed from: p */
    private int f15931p;

    /* renamed from: q */
    private int f15932q;

    /* renamed from: r */
    private long f15933r;

    /* renamed from: s */
    private int f15934s;

    /* renamed from: t */
    private e0 f15935t;

    /* renamed from: u */
    private long f15936u;

    /* renamed from: v */
    private int f15937v;

    /* renamed from: w */
    private long f15938w;

    /* renamed from: x */
    private long f15939x;

    /* renamed from: y */
    private long f15940y;

    /* renamed from: z */
    private b f15941z;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f15942a;

        /* renamed from: b */
        public final boolean f15943b;

        /* renamed from: c */
        public final int f15944c;

        public a(long j10, boolean z10, int i10) {
            this.f15942a = j10;
            this.f15943b = z10;
            this.f15944c = i10;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final b0 f15945a;

        /* renamed from: d */
        public r f15948d;

        /* renamed from: e */
        public c f15949e;

        /* renamed from: f */
        public int f15950f;

        /* renamed from: g */
        public int f15951g;

        /* renamed from: h */
        public int f15952h;

        /* renamed from: i */
        public int f15953i;

        /* renamed from: l */
        private boolean f15956l;

        /* renamed from: b */
        public final q f15946b = new q();

        /* renamed from: c */
        public final e0 f15947c = new e0();

        /* renamed from: j */
        private final e0 f15954j = new e0(1);

        /* renamed from: k */
        private final e0 f15955k = new e0();

        public b(b0 b0Var, r rVar, c cVar) {
            this.f15945a = b0Var;
            this.f15948d = rVar;
            this.f15949e = cVar;
            j(rVar, cVar);
        }

        public int c() {
            int i10 = !this.f15956l ? this.f15948d.f16040g[this.f15950f] : this.f15946b.f16026k[this.f15950f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f15956l ? this.f15948d.f16036c[this.f15950f] : this.f15946b.f16022g[this.f15952h];
        }

        public long e() {
            return !this.f15956l ? this.f15948d.f16039f[this.f15950f] : this.f15946b.c(this.f15950f);
        }

        public int f() {
            return !this.f15956l ? this.f15948d.f16037d[this.f15950f] : this.f15946b.f16024i[this.f15950f];
        }

        public p g() {
            if (!this.f15956l) {
                return null;
            }
            int i10 = ((c) r0.j(this.f15946b.f16016a)).f15905a;
            p pVar = this.f15946b.f16029n;
            if (pVar == null) {
                pVar = this.f15948d.f16034a.a(i10);
            }
            if (pVar == null || !pVar.f16011a) {
                return null;
            }
            return pVar;
        }

        public boolean h() {
            this.f15950f++;
            if (!this.f15956l) {
                return false;
            }
            int i10 = this.f15951g + 1;
            this.f15951g = i10;
            int[] iArr = this.f15946b.f16023h;
            int i11 = this.f15952h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f15952h = i11 + 1;
            this.f15951g = 0;
            return false;
        }

        public int i(int i10, int i11) {
            e0 e0Var;
            p g10 = g();
            if (g10 == null) {
                return 0;
            }
            int i12 = g10.f16014d;
            if (i12 != 0) {
                e0Var = this.f15946b.f16030o;
            } else {
                byte[] bArr = (byte[]) r0.j(g10.f16015e);
                this.f15955k.S(bArr, bArr.length);
                e0 e0Var2 = this.f15955k;
                i12 = bArr.length;
                e0Var = e0Var2;
            }
            boolean g11 = this.f15946b.g(this.f15950f);
            boolean z10 = g11 || i11 != 0;
            this.f15954j.e()[0] = (byte) ((z10 ? RecognitionOptions.ITF : 0) | i12);
            this.f15954j.U(0);
            this.f15945a.d(this.f15954j, 1, 1);
            this.f15945a.d(e0Var, i12, 1);
            if (!z10) {
                return i12 + 1;
            }
            if (!g11) {
                this.f15947c.Q(8);
                byte[] e10 = this.f15947c.e();
                e10[0] = 0;
                e10[1] = 1;
                e10[2] = (byte) ((i11 >> 8) & 255);
                e10[3] = (byte) (i11 & 255);
                e10[4] = (byte) ((i10 >> 24) & 255);
                e10[5] = (byte) ((i10 >> 16) & 255);
                e10[6] = (byte) ((i10 >> 8) & 255);
                e10[7] = (byte) (i10 & 255);
                this.f15945a.d(this.f15947c, 8, 1);
                return i12 + 1 + 8;
            }
            e0 e0Var3 = this.f15946b.f16030o;
            int N = e0Var3.N();
            e0Var3.V(-2);
            int i13 = (N * 6) + 2;
            if (i11 != 0) {
                this.f15947c.Q(i13);
                byte[] e11 = this.f15947c.e();
                e0Var3.l(e11, 0, i13);
                int i14 = (((e11[2] & 255) << 8) | (e11[3] & 255)) + i11;
                e11[2] = (byte) ((i14 >> 8) & 255);
                e11[3] = (byte) (i14 & 255);
                e0Var3 = this.f15947c;
            }
            this.f15945a.d(e0Var3, i13, 1);
            return i12 + 1 + i13;
        }

        public void j(r rVar, c cVar) {
            this.f15948d = rVar;
            this.f15949e = cVar;
            this.f15945a.c(rVar.f16034a.f16005f);
            k();
        }

        public void k() {
            this.f15946b.f();
            this.f15950f = 0;
            this.f15952h = 0;
            this.f15951g = 0;
            this.f15953i = 0;
            this.f15956l = false;
        }

        public void l(long j10) {
            int i10 = this.f15950f;
            while (true) {
                q qVar = this.f15946b;
                if (i10 >= qVar.f16021f || qVar.c(i10) > j10) {
                    return;
                }
                if (this.f15946b.f16026k[i10]) {
                    this.f15953i = i10;
                }
                i10++;
            }
        }

        public void m() {
            p g10 = g();
            if (g10 == null) {
                return;
            }
            e0 e0Var = this.f15946b.f16030o;
            int i10 = g10.f16014d;
            if (i10 != 0) {
                e0Var.V(i10);
            }
            if (this.f15946b.g(this.f15950f)) {
                e0Var.V(e0Var.N() * 6);
            }
        }

        public void n(x6.m mVar) {
            p a10 = this.f15948d.f16034a.a(((c) r0.j(this.f15946b.f16016a)).f15905a);
            this.f15945a.c(this.f15948d.f16034a.f16005f.c().O(mVar.c(a10 != null ? a10.f16012b : null)).G());
        }
    }

    public g() {
        this(0);
    }

    public g(int i10) {
        this(i10, null);
    }

    public g(int i10, n0 n0Var) {
        this(i10, n0Var, null, Collections.emptyList());
    }

    public g(int i10, n0 n0Var, o oVar) {
        this(i10, n0Var, oVar, Collections.emptyList());
    }

    public g(int i10, n0 n0Var, o oVar, List<u1> list) {
        this(i10, n0Var, oVar, list, null);
    }

    public g(int i10, n0 n0Var, o oVar, List<u1> list, b0 b0Var) {
        this.f15916a = i10;
        this.f15925j = n0Var;
        this.f15917b = oVar;
        this.f15918c = Collections.unmodifiableList(list);
        this.f15930o = b0Var;
        this.f15926k = new n7.c();
        this.f15927l = new e0(16);
        this.f15920e = new e0(x.f26773a);
        this.f15921f = new e0(5);
        this.f15922g = new e0();
        byte[] bArr = new byte[16];
        this.f15923h = bArr;
        this.f15924i = new e0(bArr);
        this.f15928m = new ArrayDeque<>();
        this.f15929n = new ArrayDeque<>();
        this.f15919d = new SparseArray<>();
        this.f15939x = -9223372036854775807L;
        this.f15938w = -9223372036854775807L;
        this.f15940y = -9223372036854775807L;
        this.E = y6.m.f31766o;
        this.F = new b0[0];
        this.G = new b0[0];
    }

    private static void A(e0 e0Var, q qVar) {
        z(e0Var, 0, qVar);
    }

    private static Pair<Long, y6.c> B(e0 e0Var, long j10) {
        long M;
        long M2;
        e0Var.U(8);
        int c10 = g7.a.c(e0Var.q());
        e0Var.V(4);
        long J2 = e0Var.J();
        if (c10 == 0) {
            M = e0Var.J();
            M2 = e0Var.J();
        } else {
            M = e0Var.M();
            M2 = e0Var.M();
        }
        long j11 = M;
        long j12 = j10 + M2;
        long O0 = r0.O0(j11, 1000000L, J2);
        e0Var.V(2);
        int N = e0Var.N();
        int[] iArr = new int[N];
        long[] jArr = new long[N];
        long[] jArr2 = new long[N];
        long[] jArr3 = new long[N];
        long j13 = O0;
        int i10 = 0;
        long j14 = j11;
        while (i10 < N) {
            int q10 = e0Var.q();
            if ((q10 & Integer.MIN_VALUE) != 0) {
                throw b3.a("Unhandled indirect reference", null);
            }
            long J3 = e0Var.J();
            iArr[i10] = q10 & a.e.API_PRIORITY_OTHER;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + J3;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i11 = N;
            long O02 = r0.O0(j15, 1000000L, J2);
            jArr4[i10] = O02 - jArr5[i10];
            e0Var.V(4);
            j12 += r1[i10];
            i10++;
            iArr = iArr;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            N = i11;
            j14 = j15;
            j13 = O02;
        }
        return Pair.create(Long.valueOf(O0), new y6.c(iArr, jArr, jArr2, jArr3));
    }

    private static long C(e0 e0Var) {
        e0Var.U(8);
        return g7.a.c(e0Var.q()) == 1 ? e0Var.M() : e0Var.J();
    }

    private static b D(e0 e0Var, SparseArray<b> sparseArray, boolean z10) {
        e0Var.U(8);
        int b10 = g7.a.b(e0Var.q());
        b valueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(e0Var.q());
        if (valueAt == null) {
            return null;
        }
        if ((b10 & 1) != 0) {
            long M = e0Var.M();
            q qVar = valueAt.f15946b;
            qVar.f16018c = M;
            qVar.f16019d = M;
        }
        c cVar = valueAt.f15949e;
        valueAt.f15946b.f16016a = new c((b10 & 2) != 0 ? e0Var.q() - 1 : cVar.f15905a, (b10 & 8) != 0 ? e0Var.q() : cVar.f15906b, (b10 & 16) != 0 ? e0Var.q() : cVar.f15907c, (b10 & 32) != 0 ? e0Var.q() : cVar.f15908d);
        return valueAt;
    }

    private static void E(a.C0260a c0260a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        b D = D(((a.b) t8.a.e(c0260a.g(1952868452))).f15875b, sparseArray, z10);
        if (D == null) {
            return;
        }
        q qVar = D.f15946b;
        long j10 = qVar.f16032q;
        boolean z11 = qVar.f16033r;
        D.k();
        D.f15956l = true;
        a.b g10 = c0260a.g(1952867444);
        if (g10 == null || (i10 & 2) != 0) {
            qVar.f16032q = j10;
            qVar.f16033r = z11;
        } else {
            qVar.f16032q = C(g10.f15875b);
            qVar.f16033r = true;
        }
        H(c0260a, D, i10);
        p a10 = D.f15948d.f16034a.a(((c) t8.a.e(qVar.f16016a)).f15905a);
        a.b g11 = c0260a.g(1935763834);
        if (g11 != null) {
            x((p) t8.a.e(a10), g11.f15875b, qVar);
        }
        a.b g12 = c0260a.g(1935763823);
        if (g12 != null) {
            w(g12.f15875b, qVar);
        }
        a.b g13 = c0260a.g(1936027235);
        if (g13 != null) {
            A(g13.f15875b, qVar);
        }
        y(c0260a, a10 != null ? a10.f16012b : null, qVar);
        int size = c0260a.f15873c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = c0260a.f15873c.get(i11);
            if (bVar.f15871a == 1970628964) {
                I(bVar.f15875b, qVar, bArr);
            }
        }
    }

    private static Pair<Integer, c> F(e0 e0Var) {
        e0Var.U(12);
        return Pair.create(Integer.valueOf(e0Var.q()), new c(e0Var.q() - 1, e0Var.q(), e0Var.q(), e0Var.q()));
    }

    private static int G(b bVar, int i10, int i11, e0 e0Var, int i12) {
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        b bVar2 = bVar;
        e0Var.U(8);
        int b10 = g7.a.b(e0Var.q());
        o oVar = bVar2.f15948d.f16034a;
        q qVar = bVar2.f15946b;
        c cVar = (c) r0.j(qVar.f16016a);
        qVar.f16023h[i10] = e0Var.L();
        long[] jArr = qVar.f16022g;
        long j10 = qVar.f16018c;
        jArr[i10] = j10;
        if ((b10 & 1) != 0) {
            jArr[i10] = j10 + e0Var.q();
        }
        boolean z15 = (b10 & 4) != 0;
        int i16 = cVar.f15908d;
        if (z15) {
            i16 = e0Var.q();
        }
        boolean z16 = (b10 & RecognitionOptions.QR_CODE) != 0;
        boolean z17 = (b10 & RecognitionOptions.UPC_A) != 0;
        boolean z18 = (b10 & RecognitionOptions.UPC_E) != 0;
        boolean z19 = (b10 & RecognitionOptions.PDF417) != 0;
        long j11 = l(oVar) ? ((long[]) r0.j(oVar.f16008i))[0] : 0L;
        int[] iArr = qVar.f16024i;
        long[] jArr2 = qVar.f16025j;
        boolean[] zArr = qVar.f16026k;
        int i17 = i16;
        boolean z20 = oVar.f16001b == 2 && (i11 & 1) != 0;
        int i18 = i12 + qVar.f16023h[i10];
        boolean z21 = z20;
        long j12 = oVar.f16002c;
        long j13 = qVar.f16032q;
        int i19 = i12;
        while (i19 < i18) {
            int d10 = d(z16 ? e0Var.q() : cVar.f15906b);
            if (z17) {
                i13 = e0Var.q();
                z10 = z16;
            } else {
                z10 = z16;
                i13 = cVar.f15907c;
            }
            int d11 = d(i13);
            if (z18) {
                z11 = z15;
                i14 = e0Var.q();
            } else if (i19 == 0 && z15) {
                z11 = z15;
                i14 = i17;
            } else {
                z11 = z15;
                i14 = cVar.f15908d;
            }
            if (z19) {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = e0Var.q();
            } else {
                z12 = z19;
                z13 = z17;
                z14 = z18;
                i15 = 0;
            }
            long O0 = r0.O0((i15 + j13) - j11, 1000000L, j12);
            jArr2[i19] = O0;
            if (!qVar.f16033r) {
                jArr2[i19] = O0 + bVar2.f15948d.f16041h;
            }
            iArr[i19] = d11;
            zArr[i19] = ((i14 >> 16) & 1) == 0 && (!z21 || i19 == 0);
            j13 += d10;
            i19++;
            bVar2 = bVar;
            z16 = z10;
            z15 = z11;
            z19 = z12;
            z17 = z13;
            z18 = z14;
        }
        qVar.f16032q = j13;
        return i18;
    }

    private static void H(a.C0260a c0260a, b bVar, int i10) {
        List<a.b> list = c0260a.f15873c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            a.b bVar2 = list.get(i13);
            if (bVar2.f15871a == 1953658222) {
                e0 e0Var = bVar2.f15875b;
                e0Var.U(12);
                int L = e0Var.L();
                if (L > 0) {
                    i12 += L;
                    i11++;
                }
            }
        }
        bVar.f15952h = 0;
        bVar.f15951g = 0;
        bVar.f15950f = 0;
        bVar.f15946b.e(i11, i12);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            a.b bVar3 = list.get(i16);
            if (bVar3.f15871a == 1953658222) {
                i15 = G(bVar, i14, i10, bVar3.f15875b, i15);
                i14++;
            }
        }
    }

    private static void I(e0 e0Var, q qVar, byte[] bArr) {
        e0Var.U(8);
        e0Var.l(bArr, 0, 16);
        if (Arrays.equals(bArr, J)) {
            z(e0Var, 16, qVar);
        }
    }

    private void J(long j10) {
        while (!this.f15928m.isEmpty() && this.f15928m.peek().f15872b == j10) {
            o(this.f15928m.pop());
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean K(y6.l r12) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g7.g.K(y6.l):boolean");
    }

    private void L(y6.l lVar) {
        int i10 = ((int) this.f15933r) - this.f15934s;
        e0 e0Var = this.f15935t;
        if (e0Var != null) {
            lVar.readFully(e0Var.e(), 8, i10);
            q(new a.b(this.f15932q, e0Var), lVar.getPosition());
        } else {
            lVar.n(i10);
        }
        J(lVar.getPosition());
    }

    private void M(y6.l lVar) {
        int size = this.f15919d.size();
        long j10 = Long.MAX_VALUE;
        b bVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = this.f15919d.valueAt(i10).f15946b;
            if (qVar.f16031p) {
                long j11 = qVar.f16019d;
                if (j11 < j10) {
                    bVar = this.f15919d.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVar == null) {
            this.f15931p = 3;
            return;
        }
        int position = (int) (j10 - lVar.getPosition());
        if (position < 0) {
            throw b3.a("Offset to encryption data was negative.", null);
        }
        lVar.n(position);
        bVar.f15946b.b(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean N(y6.l lVar) {
        int f10;
        int i10;
        b bVar = this.f15941z;
        Throwable th2 = null;
        if (bVar == null) {
            bVar = j(this.f15919d);
            if (bVar == null) {
                int position = (int) (this.f15936u - lVar.getPosition());
                if (position < 0) {
                    throw b3.a("Offset to end of mdat was negative.", null);
                }
                lVar.n(position);
                g();
                return false;
            }
            int d10 = (int) (bVar.d() - lVar.getPosition());
            if (d10 < 0) {
                s.i("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                d10 = 0;
            }
            lVar.n(d10);
            this.f15941z = bVar;
        }
        int i11 = 4;
        int i12 = 1;
        if (this.f15931p == 3) {
            int f11 = bVar.f();
            this.A = f11;
            if (bVar.f15950f < bVar.f15953i) {
                lVar.n(f11);
                bVar.m();
                if (!bVar.h()) {
                    this.f15941z = null;
                }
                this.f15931p = 3;
                return true;
            }
            if (bVar.f15948d.f16034a.f16006g == 1) {
                this.A = f11 - 8;
                lVar.n(8);
            }
            if ("audio/ac4".equals(bVar.f15948d.f16034a.f16005f.f26517w)) {
                this.B = bVar.i(this.A, 7);
                v6.c.a(this.A, this.f15924i);
                bVar.f15945a.a(this.f15924i, 7);
                i10 = this.B + 7;
            } else {
                i10 = bVar.i(this.A, 0);
            }
            this.B = i10;
            this.A += this.B;
            this.f15931p = 4;
            this.C = 0;
        }
        o oVar = bVar.f15948d.f16034a;
        b0 b0Var = bVar.f15945a;
        long e10 = bVar.e();
        n0 n0Var = this.f15925j;
        if (n0Var != null) {
            e10 = n0Var.a(e10);
        }
        long j10 = e10;
        if (oVar.f16009j == 0) {
            while (true) {
                int i13 = this.B;
                int i14 = this.A;
                if (i13 >= i14) {
                    break;
                }
                this.B += b0Var.f(lVar, i14 - i13, false);
            }
        } else {
            byte[] e11 = this.f15921f.e();
            e11[0] = 0;
            e11[1] = 0;
            e11[2] = 0;
            int i15 = oVar.f16009j;
            int i16 = i15 + 1;
            int i17 = 4 - i15;
            while (this.B < this.A) {
                int i18 = this.C;
                if (i18 == 0) {
                    lVar.readFully(e11, i17, i16);
                    this.f15921f.U(0);
                    int q10 = this.f15921f.q();
                    if (q10 < i12) {
                        throw b3.a("Invalid NAL length", th2);
                    }
                    this.C = q10 - 1;
                    this.f15920e.U(0);
                    b0Var.a(this.f15920e, i11);
                    b0Var.a(this.f15921f, i12);
                    this.D = (this.G.length <= 0 || !x.g(oVar.f16005f.f26517w, e11[i11])) ? 0 : i12;
                    this.B += 5;
                    this.A += i17;
                } else {
                    if (this.D) {
                        this.f15922g.Q(i18);
                        lVar.readFully(this.f15922g.e(), 0, this.C);
                        b0Var.a(this.f15922g, this.C);
                        f10 = this.C;
                        int q11 = x.q(this.f15922g.e(), this.f15922g.g());
                        this.f15922g.U("video/hevc".equals(oVar.f16005f.f26517w) ? 1 : 0);
                        this.f15922g.T(q11);
                        y6.b.a(j10, this.f15922g, this.G);
                    } else {
                        f10 = b0Var.f(lVar, i18, false);
                    }
                    this.B += f10;
                    this.C -= f10;
                    th2 = null;
                    i11 = 4;
                    i12 = 1;
                }
            }
        }
        int c10 = bVar.c();
        p g10 = bVar.g();
        b0Var.b(j10, c10, this.A, 0, g10 != null ? g10.f16013c : null);
        t(j10);
        if (!bVar.h()) {
            this.f15941z = null;
        }
        this.f15931p = 3;
        return true;
    }

    private static boolean O(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean P(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    private static int d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw b3.a("Unexpected negative value: " + i10, null);
    }

    private void g() {
        this.f15931p = 0;
        this.f15934s = 0;
    }

    private c h(SparseArray<c> sparseArray, int i10) {
        return (c) (sparseArray.size() == 1 ? sparseArray.valueAt(0) : t8.a.e(sparseArray.get(i10)));
    }

    private static x6.m i(List<a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            a.b bVar = list.get(i10);
            if (bVar.f15871a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] e10 = bVar.f15875b.e();
                UUID f10 = l.f(e10);
                if (f10 == null) {
                    s.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new m.b(f10, "video/mp4", e10));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new x6.m(arrayList);
    }

    private static b j(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b valueAt = sparseArray.valueAt(i10);
            if ((valueAt.f15956l || valueAt.f15950f != valueAt.f15948d.f16035b) && (!valueAt.f15956l || valueAt.f15952h != valueAt.f15946b.f16020e)) {
                long d10 = valueAt.d();
                if (d10 < j10) {
                    bVar = valueAt;
                    j10 = d10;
                }
            }
        }
        return bVar;
    }

    private void k() {
        int i10;
        b0[] b0VarArr = new b0[2];
        this.F = b0VarArr;
        b0 b0Var = this.f15930o;
        int i11 = 0;
        if (b0Var != null) {
            b0VarArr[0] = b0Var;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f15916a & 4) != 0) {
            b0VarArr[i10] = this.E.d(100, 5);
            i12 = 101;
            i10++;
        }
        b0[] b0VarArr2 = (b0[]) r0.H0(this.F, i10);
        this.F = b0VarArr2;
        for (b0 b0Var2 : b0VarArr2) {
            b0Var2.c(K);
        }
        this.G = new b0[this.f15918c.size()];
        while (i11 < this.G.length) {
            b0 d10 = this.E.d(i12, 3);
            d10.c(this.f15918c.get(i11));
            this.G[i11] = d10;
            i11++;
            i12++;
        }
    }

    private static boolean l(o oVar) {
        long[] jArr;
        long[] jArr2 = oVar.f16007h;
        if (jArr2 == null || jArr2.length != 1 || (jArr = oVar.f16008i) == null) {
            return false;
        }
        long j10 = jArr2[0];
        return j10 == 0 || r0.O0(j10 + jArr[0], 1000000L, oVar.f16003d) >= oVar.f16004e;
    }

    public static /* synthetic */ y6.k[] m() {
        return new y6.k[]{new g()};
    }

    private void o(a.C0260a c0260a) {
        int i10 = c0260a.f15871a;
        if (i10 == 1836019574) {
            s(c0260a);
        } else if (i10 == 1836019558) {
            r(c0260a);
        } else {
            if (this.f15928m.isEmpty()) {
                return;
            }
            this.f15928m.peek().d(c0260a);
        }
    }

    private void p(e0 e0Var) {
        long O0;
        String str;
        long O02;
        String str2;
        long J2;
        long j10;
        if (this.F.length == 0) {
            return;
        }
        e0Var.U(8);
        int c10 = g7.a.c(e0Var.q());
        if (c10 == 0) {
            String str3 = (String) t8.a.e(e0Var.B());
            String str4 = (String) t8.a.e(e0Var.B());
            long J3 = e0Var.J();
            O0 = r0.O0(e0Var.J(), 1000000L, J3);
            long j11 = this.f15940y;
            long j12 = j11 != -9223372036854775807L ? j11 + O0 : -9223372036854775807L;
            str = str3;
            O02 = r0.O0(e0Var.J(), 1000L, J3);
            str2 = str4;
            J2 = e0Var.J();
            j10 = j12;
        } else {
            if (c10 != 1) {
                s.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + c10);
                return;
            }
            long J4 = e0Var.J();
            j10 = r0.O0(e0Var.M(), 1000000L, J4);
            long O03 = r0.O0(e0Var.J(), 1000L, J4);
            long J5 = e0Var.J();
            str = (String) t8.a.e(e0Var.B());
            O02 = O03;
            J2 = J5;
            str2 = (String) t8.a.e(e0Var.B());
            O0 = -9223372036854775807L;
        }
        byte[] bArr = new byte[e0Var.a()];
        e0Var.l(bArr, 0, e0Var.a());
        e0 e0Var2 = new e0(this.f15926k.a(new n7.a(str, str2, O02, J2, bArr)));
        int a10 = e0Var2.a();
        for (b0 b0Var : this.F) {
            e0Var2.U(0);
            b0Var.a(e0Var2, a10);
        }
        if (j10 == -9223372036854775807L) {
            this.f15929n.addLast(new a(O0, true, a10));
        } else {
            if (this.f15929n.isEmpty()) {
                n0 n0Var = this.f15925j;
                if (n0Var != null) {
                    j10 = n0Var.a(j10);
                }
                for (b0 b0Var2 : this.F) {
                    b0Var2.b(j10, 1, a10, 0, null);
                }
                return;
            }
            this.f15929n.addLast(new a(j10, false, a10));
        }
        this.f15937v += a10;
    }

    private void q(a.b bVar, long j10) {
        if (!this.f15928m.isEmpty()) {
            this.f15928m.peek().e(bVar);
            return;
        }
        int i10 = bVar.f15871a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                p(bVar.f15875b);
            }
        } else {
            Pair<Long, y6.c> B = B(bVar.f15875b, j10);
            this.f15940y = ((Long) B.first).longValue();
            this.E.p((z) B.second);
            this.H = true;
        }
    }

    private void r(a.C0260a c0260a) {
        v(c0260a, this.f15919d, this.f15917b != null, this.f15916a, this.f15923h);
        x6.m i10 = i(c0260a.f15873c);
        if (i10 != null) {
            int size = this.f15919d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f15919d.valueAt(i11).n(i10);
            }
        }
        if (this.f15938w != -9223372036854775807L) {
            int size2 = this.f15919d.size();
            for (int i12 = 0; i12 < size2; i12++) {
                this.f15919d.valueAt(i12).l(this.f15938w);
            }
            this.f15938w = -9223372036854775807L;
        }
    }

    private void s(a.C0260a c0260a) {
        int i10 = 0;
        t8.a.h(this.f15917b == null, "Unexpected moov box.");
        x6.m i11 = i(c0260a.f15873c);
        a.C0260a c0260a2 = (a.C0260a) t8.a.e(c0260a.f(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = c0260a2.f15873c.size();
        long j10 = -9223372036854775807L;
        for (int i12 = 0; i12 < size; i12++) {
            a.b bVar = c0260a2.f15873c.get(i12);
            int i13 = bVar.f15871a;
            if (i13 == 1953654136) {
                Pair<Integer, c> F = F(bVar.f15875b);
                sparseArray.put(((Integer) F.first).intValue(), (c) F.second);
            } else if (i13 == 1835362404) {
                j10 = u(bVar.f15875b);
            }
        }
        List<r> A = g7.b.A(c0260a, new v(), j10, i11, (this.f15916a & 16) != 0, false, new eb.g() { // from class: g7.e
            public /* synthetic */ e() {
            }

            @Override // eb.g
            public final Object apply(Object obj) {
                return g.this.n((o) obj);
            }
        });
        int size2 = A.size();
        if (this.f15919d.size() != 0) {
            t8.a.g(this.f15919d.size() == size2);
            while (i10 < size2) {
                r rVar = A.get(i10);
                o oVar = rVar.f16034a;
                this.f15919d.get(oVar.f16000a).j(rVar, h(sparseArray, oVar.f16000a));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            r rVar2 = A.get(i10);
            o oVar2 = rVar2.f16034a;
            this.f15919d.put(oVar2.f16000a, new b(this.E.d(i10, oVar2.f16001b), rVar2, h(sparseArray, oVar2.f16000a)));
            this.f15939x = Math.max(this.f15939x, oVar2.f16004e);
            i10++;
        }
        this.E.q();
    }

    private void t(long j10) {
        while (!this.f15929n.isEmpty()) {
            a removeFirst = this.f15929n.removeFirst();
            this.f15937v -= removeFirst.f15944c;
            long j11 = removeFirst.f15942a;
            if (removeFirst.f15943b) {
                j11 += j10;
            }
            n0 n0Var = this.f15925j;
            if (n0Var != null) {
                j11 = n0Var.a(j11);
            }
            for (b0 b0Var : this.F) {
                b0Var.b(j11, 1, removeFirst.f15944c, this.f15937v, null);
            }
        }
    }

    private static long u(e0 e0Var) {
        e0Var.U(8);
        return g7.a.c(e0Var.q()) == 0 ? e0Var.J() : e0Var.M();
    }

    private static void v(a.C0260a c0260a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) {
        int size = c0260a.f15874d.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.C0260a c0260a2 = c0260a.f15874d.get(i11);
            if (c0260a2.f15871a == 1953653094) {
                E(c0260a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void w(e0 e0Var, q qVar) {
        e0Var.U(8);
        int q10 = e0Var.q();
        if ((g7.a.b(q10) & 1) == 1) {
            e0Var.V(8);
        }
        int L = e0Var.L();
        if (L == 1) {
            qVar.f16019d += g7.a.c(q10) == 0 ? e0Var.J() : e0Var.M();
        } else {
            throw b3.a("Unexpected saio entry count: " + L, null);
        }
    }

    private static void x(p pVar, e0 e0Var, q qVar) {
        int i10;
        int i11 = pVar.f16014d;
        e0Var.U(8);
        if ((g7.a.b(e0Var.q()) & 1) == 1) {
            e0Var.V(8);
        }
        int H = e0Var.H();
        int L = e0Var.L();
        if (L > qVar.f16021f) {
            throw b3.a("Saiz sample count " + L + " is greater than fragment sample count" + qVar.f16021f, null);
        }
        if (H == 0) {
            boolean[] zArr = qVar.f16028m;
            i10 = 0;
            for (int i12 = 0; i12 < L; i12++) {
                int H2 = e0Var.H();
                i10 += H2;
                zArr[i12] = H2 > i11;
            }
        } else {
            i10 = (H * L) + 0;
            Arrays.fill(qVar.f16028m, 0, L, H > i11);
        }
        Arrays.fill(qVar.f16028m, L, qVar.f16021f, false);
        if (i10 > 0) {
            qVar.d(i10);
        }
    }

    private static void y(a.C0260a c0260a, String str, q qVar) {
        byte[] bArr = null;
        e0 e0Var = null;
        e0 e0Var2 = null;
        for (int i10 = 0; i10 < c0260a.f15873c.size(); i10++) {
            a.b bVar = c0260a.f15873c.get(i10);
            e0 e0Var3 = bVar.f15875b;
            int i11 = bVar.f15871a;
            if (i11 == 1935828848) {
                e0Var3.U(12);
                if (e0Var3.q() == 1936025959) {
                    e0Var = e0Var3;
                }
            } else if (i11 == 1936158820) {
                e0Var3.U(12);
                if (e0Var3.q() == 1936025959) {
                    e0Var2 = e0Var3;
                }
            }
        }
        if (e0Var == null || e0Var2 == null) {
            return;
        }
        e0Var.U(8);
        int c10 = g7.a.c(e0Var.q());
        e0Var.V(4);
        if (c10 == 1) {
            e0Var.V(4);
        }
        if (e0Var.q() != 1) {
            throw b3.e("Entry count in sbgp != 1 (unsupported).");
        }
        e0Var2.U(8);
        int c11 = g7.a.c(e0Var2.q());
        e0Var2.V(4);
        if (c11 == 1) {
            if (e0Var2.J() == 0) {
                throw b3.e("Variable length description in sgpd found (unsupported)");
            }
        } else if (c11 >= 2) {
            e0Var2.V(4);
        }
        if (e0Var2.J() != 1) {
            throw b3.e("Entry count in sgpd != 1 (unsupported).");
        }
        e0Var2.V(1);
        int H = e0Var2.H();
        int i12 = (H & 240) >> 4;
        int i13 = H & 15;
        boolean z10 = e0Var2.H() == 1;
        if (z10) {
            int H2 = e0Var2.H();
            byte[] bArr2 = new byte[16];
            e0Var2.l(bArr2, 0, 16);
            if (H2 == 0) {
                int H3 = e0Var2.H();
                bArr = new byte[H3];
                e0Var2.l(bArr, 0, H3);
            }
            qVar.f16027l = true;
            qVar.f16029n = new p(z10, str, H2, bArr2, i12, i13, bArr);
        }
    }

    private static void z(e0 e0Var, int i10, q qVar) {
        e0Var.U(i10 + 8);
        int b10 = g7.a.b(e0Var.q());
        if ((b10 & 1) != 0) {
            throw b3.e("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (b10 & 2) != 0;
        int L = e0Var.L();
        if (L == 0) {
            Arrays.fill(qVar.f16028m, 0, qVar.f16021f, false);
            return;
        }
        if (L == qVar.f16021f) {
            Arrays.fill(qVar.f16028m, 0, L, z10);
            qVar.d(e0Var.a());
            qVar.a(e0Var);
        } else {
            throw b3.a("Senc sample count " + L + " is different from fragment sample count" + qVar.f16021f, null);
        }
    }

    @Override // y6.k
    public void a(long j10, long j11) {
        int size = this.f15919d.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15919d.valueAt(i10).k();
        }
        this.f15929n.clear();
        this.f15937v = 0;
        this.f15938w = j11;
        this.f15928m.clear();
        g();
    }

    @Override // y6.k
    public void b(y6.m mVar) {
        this.E = mVar;
        g();
        k();
        o oVar = this.f15917b;
        if (oVar != null) {
            this.f15919d.put(0, new b(mVar.d(0, oVar.f16001b), new r(this.f15917b, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0)));
            this.E.q();
        }
    }

    @Override // y6.k
    public boolean e(y6.l lVar) {
        return n.b(lVar);
    }

    @Override // y6.k
    public int f(y6.l lVar, y yVar) {
        while (true) {
            int i10 = this.f15931p;
            if (i10 != 0) {
                if (i10 == 1) {
                    L(lVar);
                } else if (i10 == 2) {
                    M(lVar);
                } else if (N(lVar)) {
                    return 0;
                }
            } else if (!K(lVar)) {
                return -1;
            }
        }
    }

    public o n(o oVar) {
        return oVar;
    }

    @Override // y6.k
    public void release() {
    }
}
