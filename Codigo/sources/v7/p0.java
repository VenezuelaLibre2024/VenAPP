package v7;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import s8.d0;
import s8.e0;
import s8.n;
import t6.b3;
import t6.u1;
import t6.u3;
import t6.v1;
import v7.h0;
import v7.t;
import v7.u0;
import v7.y;
import x6.u;
import y6.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class p0 implements y, y6.m, e0.b<a>, e0.f, u0.d {
    private static final Map<String, String> X = K();
    private static final u1 Y = new u1.b().U("icy").g0("application/x-icy").G();
    private y.a B;
    private p7.b C;
    private boolean F;
    private boolean G;
    private boolean H;
    private e I;
    private y6.z J;
    private boolean L;
    private boolean N;
    private boolean O;
    private int P;
    private boolean Q;
    private long R;
    private boolean T;
    private int U;
    private boolean V;
    private boolean W;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f28380a;

    /* renamed from: b, reason: collision with root package name */
    private final s8.j f28381b;

    /* renamed from: c, reason: collision with root package name */
    private final x6.v f28382c;

    /* renamed from: d, reason: collision with root package name */
    private final s8.d0 f28383d;

    /* renamed from: e, reason: collision with root package name */
    private final h0.a f28384e;

    /* renamed from: f, reason: collision with root package name */
    private final u.a f28385f;

    /* renamed from: r, reason: collision with root package name */
    private final b f28386r;

    /* renamed from: s, reason: collision with root package name */
    private final s8.b f28387s;

    /* renamed from: t, reason: collision with root package name */
    private final String f28388t;

    /* renamed from: u, reason: collision with root package name */
    private final long f28389u;

    /* renamed from: w, reason: collision with root package name */
    private final k0 f28391w;

    /* renamed from: v, reason: collision with root package name */
    private final s8.e0 f28390v = new s8.e0("ProgressiveMediaPeriod");

    /* renamed from: x, reason: collision with root package name */
    private final t8.g f28392x = new t8.g();

    /* renamed from: y, reason: collision with root package name */
    private final Runnable f28393y = new Runnable() { // from class: v7.l0
        @Override // java.lang.Runnable
        public final void run() {
            p0.this.T();
        }
    };

    /* renamed from: z, reason: collision with root package name */
    private final Runnable f28394z = new Runnable() { // from class: v7.m0
        @Override // java.lang.Runnable
        public final void run() {
            p0.this.Q();
        }
    };
    private final Handler A = t8.r0.w();
    private d[] E = new d[0];
    private u0[] D = new u0[0];
    private long S = -9223372036854775807L;
    private long K = -9223372036854775807L;
    private int M = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public final class a implements e0.e, t.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f28396b;

        /* renamed from: c, reason: collision with root package name */
        private final s8.l0 f28397c;

        /* renamed from: d, reason: collision with root package name */
        private final k0 f28398d;

        /* renamed from: e, reason: collision with root package name */
        private final y6.m f28399e;

        /* renamed from: f, reason: collision with root package name */
        private final t8.g f28400f;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f28402h;

        /* renamed from: j, reason: collision with root package name */
        private long f28404j;

        /* renamed from: l, reason: collision with root package name */
        private y6.b0 f28406l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f28407m;

        /* renamed from: g, reason: collision with root package name */
        private final y6.y f28401g = new y6.y();

        /* renamed from: i, reason: collision with root package name */
        private boolean f28403i = true;

        /* renamed from: a, reason: collision with root package name */
        private final long f28395a = u.a();

        /* renamed from: k, reason: collision with root package name */
        private s8.n f28405k = i(0);

        public a(Uri uri, s8.j jVar, k0 k0Var, y6.m mVar, t8.g gVar) {
            this.f28396b = uri;
            this.f28397c = new s8.l0(jVar);
            this.f28398d = k0Var;
            this.f28399e = mVar;
            this.f28400f = gVar;
        }

        private s8.n i(long j10) {
            return new n.b().i(this.f28396b).h(j10).f(p0.this.f28388t).b(6).e(p0.X).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f28401g.f31795a = j10;
            this.f28404j = j11;
            this.f28403i = true;
            this.f28407m = false;
        }

        @Override // v7.t.a
        public void a(t8.e0 e0Var) {
            long max = !this.f28407m ? this.f28404j : Math.max(p0.this.M(true), this.f28404j);
            int a10 = e0Var.a();
            y6.b0 b0Var = (y6.b0) t8.a.e(this.f28406l);
            b0Var.a(e0Var, a10);
            b0Var.b(max, 1, a10, 0, null);
            this.f28407m = true;
        }

        @Override // s8.e0.e
        public void b() {
            int i10 = 0;
            while (i10 == 0 && !this.f28402h) {
                try {
                    long j10 = this.f28401g.f31795a;
                    s8.n i11 = i(j10);
                    this.f28405k = i11;
                    long o10 = this.f28397c.o(i11);
                    if (o10 != -1) {
                        o10 += j10;
                        p0.this.Y();
                    }
                    long j11 = o10;
                    p0.this.C = p7.b.a(this.f28397c.e());
                    s8.h hVar = this.f28397c;
                    if (p0.this.C != null && p0.this.C.f22866f != -1) {
                        hVar = new t(this.f28397c, p0.this.C.f22866f, this);
                        y6.b0 N = p0.this.N();
                        this.f28406l = N;
                        N.c(p0.Y);
                    }
                    long j12 = j10;
                    this.f28398d.e(hVar, this.f28396b, this.f28397c.e(), j10, j11, this.f28399e);
                    if (p0.this.C != null) {
                        this.f28398d.b();
                    }
                    if (this.f28403i) {
                        this.f28398d.a(j12, this.f28404j);
                        this.f28403i = false;
                    }
                    while (true) {
                        long j13 = j12;
                        while (i10 == 0 && !this.f28402h) {
                            try {
                                this.f28400f.a();
                                i10 = this.f28398d.c(this.f28401g);
                                j12 = this.f28398d.d();
                                if (j12 > p0.this.f28389u + j13) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f28400f.c();
                        p0.this.A.post(p0.this.f28394z);
                    }
                    if (i10 == 1) {
                        i10 = 0;
                    } else if (this.f28398d.d() != -1) {
                        this.f28401g.f31795a = this.f28398d.d();
                    }
                    s8.m.a(this.f28397c);
                } catch (Throwable th2) {
                    if (i10 != 1 && this.f28398d.d() != -1) {
                        this.f28401g.f31795a = this.f28398d.d();
                    }
                    s8.m.a(this.f28397c);
                    throw th2;
                }
            }
        }

        @Override // s8.e0.e
        public void c() {
            this.f28402h = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void k(long j10, boolean z10, boolean z11);
    }

    /* loaded from: classes.dex */
    private final class c implements v0 {

        /* renamed from: a, reason: collision with root package name */
        private final int f28409a;

        public c(int i10) {
            this.f28409a = i10;
        }

        @Override // v7.v0
        public void a() {
            p0.this.X(this.f28409a);
        }

        @Override // v7.v0
        public boolean d() {
            return p0.this.P(this.f28409a);
        }

        @Override // v7.v0
        public int p(long j10) {
            return p0.this.h0(this.f28409a, j10);
        }

        @Override // v7.v0
        public int q(v1 v1Var, w6.g gVar, int i10) {
            return p0.this.d0(this.f28409a, v1Var, gVar, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f28411a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28412b;

        public d(int i10, boolean z10) {
            this.f28411a = i10;
            this.f28412b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f28411a == dVar.f28411a && this.f28412b == dVar.f28412b;
        }

        public int hashCode() {
            return (this.f28411a * 31) + (this.f28412b ? 1 : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final f1 f28413a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f28414b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f28415c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f28416d;

        public e(f1 f1Var, boolean[] zArr) {
            this.f28413a = f1Var;
            this.f28414b = zArr;
            int i10 = f1Var.f28314a;
            this.f28415c = new boolean[i10];
            this.f28416d = new boolean[i10];
        }
    }

    public p0(Uri uri, s8.j jVar, k0 k0Var, x6.v vVar, u.a aVar, s8.d0 d0Var, h0.a aVar2, b bVar, s8.b bVar2, String str, int i10) {
        this.f28380a = uri;
        this.f28381b = jVar;
        this.f28382c = vVar;
        this.f28385f = aVar;
        this.f28383d = d0Var;
        this.f28384e = aVar2;
        this.f28386r = bVar;
        this.f28387s = bVar2;
        this.f28388t = str;
        this.f28389u = i10;
        this.f28391w = k0Var;
    }

    private void I() {
        t8.a.g(this.G);
        t8.a.e(this.I);
        t8.a.e(this.J);
    }

    private boolean J(a aVar, int i10) {
        y6.z zVar;
        if (this.Q || !((zVar = this.J) == null || zVar.i() == -9223372036854775807L)) {
            this.U = i10;
            return true;
        }
        if (this.G && !j0()) {
            this.T = true;
            return false;
        }
        this.O = this.G;
        this.R = 0L;
        this.U = 0;
        for (u0 u0Var : this.D) {
            u0Var.V();
        }
        aVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int L() {
        int i10 = 0;
        for (u0 u0Var : this.D) {
            i10 += u0Var.G();
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long M(boolean z10) {
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.D.length; i10++) {
            if (z10 || ((e) t8.a.e(this.I)).f28415c[i10]) {
                j10 = Math.max(j10, this.D[i10].z());
            }
        }
        return j10;
    }

    private boolean O() {
        return this.S != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        if (this.W) {
            return;
        }
        ((y.a) t8.a.e(this.B)).a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        this.Q = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.W || this.G || !this.F || this.J == null) {
            return;
        }
        for (u0 u0Var : this.D) {
            if (u0Var.F() == null) {
                return;
            }
        }
        this.f28392x.c();
        int length = this.D.length;
        d1[] d1VarArr = new d1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            u1 u1Var = (u1) t8.a.e(this.D[i10].F());
            String str = u1Var.f26517w;
            boolean o10 = t8.w.o(str);
            boolean z10 = o10 || t8.w.s(str);
            zArr[i10] = z10;
            this.H = z10 | this.H;
            p7.b bVar = this.C;
            if (bVar != null) {
                if (o10 || this.E[i10].f28412b) {
                    l7.a aVar = u1Var.f26515u;
                    u1Var = u1Var.c().Z(aVar == null ? new l7.a(bVar) : aVar.a(bVar)).G();
                }
                if (o10 && u1Var.f26511f == -1 && u1Var.f26512r == -1 && bVar.f22861a != -1) {
                    u1Var = u1Var.c().I(bVar.f22861a).G();
                }
            }
            d1VarArr[i10] = new d1(Integer.toString(i10), u1Var.d(this.f28382c.d(u1Var)));
        }
        this.I = new e(new f1(d1VarArr), zArr);
        this.G = true;
        ((y.a) t8.a.e(this.B)).h(this);
    }

    private void U(int i10) {
        I();
        e eVar = this.I;
        boolean[] zArr = eVar.f28416d;
        if (zArr[i10]) {
            return;
        }
        u1 d10 = eVar.f28413a.c(i10).d(0);
        this.f28384e.i(t8.w.k(d10.f26517w), d10, 0, null, this.R);
        zArr[i10] = true;
    }

    private void V(int i10) {
        I();
        boolean[] zArr = this.I.f28414b;
        if (this.T && zArr[i10]) {
            if (this.D[i10].K(false)) {
                return;
            }
            this.S = 0L;
            this.T = false;
            this.O = true;
            this.R = 0L;
            this.U = 0;
            for (u0 u0Var : this.D) {
                u0Var.V();
            }
            ((y.a) t8.a.e(this.B)).a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.A.post(new Runnable() { // from class: v7.n0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.R();
            }
        });
    }

    private y6.b0 c0(d dVar) {
        int length = this.D.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (dVar.equals(this.E[i10])) {
                return this.D[i10];
            }
        }
        u0 k10 = u0.k(this.f28387s, this.f28382c, this.f28385f);
        k10.d0(this);
        int i11 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.E, i11);
        dVarArr[length] = dVar;
        this.E = (d[]) t8.r0.k(dVarArr);
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.D, i11);
        u0VarArr[length] = k10;
        this.D = (u0[]) t8.r0.k(u0VarArr);
        return k10;
    }

    private boolean f0(boolean[] zArr, long j10) {
        int length = this.D.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!this.D[i10].Z(j10, false) && (zArr[i10] || !this.H)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void S(y6.z zVar) {
        this.J = this.C == null ? zVar : new z.b(-9223372036854775807L);
        this.K = zVar.i();
        boolean z10 = !this.Q && zVar.i() == -9223372036854775807L;
        this.L = z10;
        this.M = z10 ? 7 : 1;
        this.f28386r.k(this.K, zVar.h(), this.L);
        if (this.G) {
            return;
        }
        T();
    }

    private void i0() {
        a aVar = new a(this.f28380a, this.f28381b, this.f28391w, this, this.f28392x);
        if (this.G) {
            t8.a.g(O());
            long j10 = this.K;
            if (j10 != -9223372036854775807L && this.S > j10) {
                this.V = true;
                this.S = -9223372036854775807L;
                return;
            }
            aVar.j(((y6.z) t8.a.e(this.J)).d(this.S).f31796a.f31688b, this.S);
            for (u0 u0Var : this.D) {
                u0Var.b0(this.S);
            }
            this.S = -9223372036854775807L;
        }
        this.U = L();
        this.f28384e.A(new u(aVar.f28395a, aVar.f28405k, this.f28390v.n(aVar, this, this.f28383d.a(this.M))), 1, -1, null, 0, null, aVar.f28404j, this.K);
    }

    private boolean j0() {
        return this.O || O();
    }

    y6.b0 N() {
        return c0(new d(0, true));
    }

    boolean P(int i10) {
        return !j0() && this.D[i10].K(this.V);
    }

    void W() {
        this.f28390v.k(this.f28383d.a(this.M));
    }

    void X(int i10) {
        this.D[i10].N();
        W();
    }

    @Override // s8.e0.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void i(a aVar, long j10, long j11, boolean z10) {
        s8.l0 l0Var = aVar.f28397c;
        u uVar = new u(aVar.f28395a, aVar.f28405k, l0Var.r(), l0Var.s(), j10, j11, l0Var.h());
        this.f28383d.c(aVar.f28395a);
        this.f28384e.r(uVar, 1, -1, null, 0, null, aVar.f28404j, this.K);
        if (z10) {
            return;
        }
        for (u0 u0Var : this.D) {
            u0Var.V();
        }
        if (this.P > 0) {
            ((y.a) t8.a.e(this.B)).a(this);
        }
    }

    @Override // v7.u0.d
    public void a(u1 u1Var) {
        this.A.post(this.f28393y);
    }

    @Override // s8.e0.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void m(a aVar, long j10, long j11) {
        y6.z zVar;
        if (this.K == -9223372036854775807L && (zVar = this.J) != null) {
            boolean h10 = zVar.h();
            long M = M(true);
            long j12 = M == Long.MIN_VALUE ? 0L : M + 10000;
            this.K = j12;
            this.f28386r.k(j12, h10, this.L);
        }
        s8.l0 l0Var = aVar.f28397c;
        u uVar = new u(aVar.f28395a, aVar.f28405k, l0Var.r(), l0Var.s(), j10, j11, l0Var.h());
        this.f28383d.c(aVar.f28395a);
        this.f28384e.u(uVar, 1, -1, null, 0, null, aVar.f28404j, this.K);
        this.V = true;
        ((y.a) t8.a.e(this.B)).a(this);
    }

    @Override // v7.y, v7.w0
    public long b() {
        return f();
    }

    @Override // s8.e0.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public e0.c h(a aVar, long j10, long j11, IOException iOException, int i10) {
        boolean z10;
        a aVar2;
        e0.c h10;
        s8.l0 l0Var = aVar.f28397c;
        u uVar = new u(aVar.f28395a, aVar.f28405k, l0Var.r(), l0Var.s(), j10, j11, l0Var.h());
        long d10 = this.f28383d.d(new d0.c(uVar, new x(1, -1, null, 0, null, t8.r0.a1(aVar.f28404j), t8.r0.a1(this.K)), iOException, i10));
        if (d10 == -9223372036854775807L) {
            h10 = s8.e0.f25221g;
        } else {
            int L = L();
            if (L > this.U) {
                aVar2 = aVar;
                z10 = true;
            } else {
                z10 = false;
                aVar2 = aVar;
            }
            h10 = J(aVar2, L) ? s8.e0.h(z10, d10) : s8.e0.f25220f;
        }
        boolean z11 = !h10.c();
        this.f28384e.w(uVar, 1, -1, null, 0, null, aVar.f28404j, this.K, iOException, z11);
        if (z11) {
            this.f28383d.c(aVar.f28395a);
        }
        return h10;
    }

    @Override // v7.y
    public long c(long j10, u3 u3Var) {
        I();
        if (!this.J.h()) {
            return 0L;
        }
        z.a d10 = this.J.d(j10);
        return u3Var.a(j10, d10.f31796a.f31687a, d10.f31797b.f31687a);
    }

    @Override // y6.m
    public y6.b0 d(int i10, int i11) {
        return c0(new d(i10, false));
    }

    int d0(int i10, v1 v1Var, w6.g gVar, int i11) {
        if (j0()) {
            return -3;
        }
        U(i10);
        int S = this.D[i10].S(v1Var, gVar, i11, this.V);
        if (S == -3) {
            V(i10);
        }
        return S;
    }

    @Override // v7.y, v7.w0
    public boolean e(long j10) {
        if (this.V || this.f28390v.i() || this.T) {
            return false;
        }
        if (this.G && this.P == 0) {
            return false;
        }
        boolean e10 = this.f28392x.e();
        if (this.f28390v.j()) {
            return e10;
        }
        i0();
        return true;
    }

    public void e0() {
        if (this.G) {
            for (u0 u0Var : this.D) {
                u0Var.R();
            }
        }
        this.f28390v.m(this);
        this.A.removeCallbacksAndMessages(null);
        this.B = null;
        this.W = true;
    }

    @Override // v7.y, v7.w0
    public long f() {
        long j10;
        I();
        if (this.V || this.P == 0) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.S;
        }
        if (this.H) {
            int length = this.D.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = this.I;
                if (eVar.f28414b[i10] && eVar.f28415c[i10] && !this.D[i10].J()) {
                    j10 = Math.min(j10, this.D[i10].z());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = M(false);
        }
        return j10 == Long.MIN_VALUE ? this.R : j10;
    }

    @Override // v7.y, v7.w0
    public void g(long j10) {
    }

    int h0(int i10, long j10) {
        if (j0()) {
            return 0;
        }
        U(i10);
        u0 u0Var = this.D[i10];
        int E = u0Var.E(j10, this.V);
        u0Var.e0(E);
        if (E == 0) {
            V(i10);
        }
        return E;
    }

    @Override // v7.y, v7.w0
    public boolean isLoading() {
        return this.f28390v.j() && this.f28392x.d();
    }

    @Override // v7.y
    public long j(long j10) {
        I();
        boolean[] zArr = this.I.f28414b;
        if (!this.J.h()) {
            j10 = 0;
        }
        int i10 = 0;
        this.O = false;
        this.R = j10;
        if (O()) {
            this.S = j10;
            return j10;
        }
        if (this.M != 7 && f0(zArr, j10)) {
            return j10;
        }
        this.T = false;
        this.S = j10;
        this.V = false;
        if (this.f28390v.j()) {
            u0[] u0VarArr = this.D;
            int length = u0VarArr.length;
            while (i10 < length) {
                u0VarArr[i10].r();
                i10++;
            }
            this.f28390v.f();
        } else {
            this.f28390v.g();
            u0[] u0VarArr2 = this.D;
            int length2 = u0VarArr2.length;
            while (i10 < length2) {
                u0VarArr2[i10].V();
                i10++;
            }
        }
        return j10;
    }

    @Override // v7.y
    public void k(y.a aVar, long j10) {
        this.B = aVar;
        this.f28392x.e();
        i0();
    }

    @Override // v7.y
    public long l() {
        if (!this.O) {
            return -9223372036854775807L;
        }
        if (!this.V && L() <= this.U) {
            return -9223372036854775807L;
        }
        this.O = false;
        return this.R;
    }

    @Override // s8.e0.f
    public void n() {
        for (u0 u0Var : this.D) {
            u0Var.T();
        }
        this.f28391w.release();
    }

    @Override // v7.y
    public void o() {
        W();
        if (this.V && !this.G) {
            throw b3.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // y6.m
    public void p(final y6.z zVar) {
        this.A.post(new Runnable() { // from class: v7.o0
            @Override // java.lang.Runnable
            public final void run() {
                p0.this.S(zVar);
            }
        });
    }

    @Override // y6.m
    public void q() {
        this.F = true;
        this.A.post(this.f28393y);
    }

    @Override // v7.y
    public f1 r() {
        I();
        return this.I.f28413a;
    }

    @Override // v7.y
    public void s(long j10, boolean z10) {
        I();
        if (O()) {
            return;
        }
        boolean[] zArr = this.I.f28415c;
        int length = this.D.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.D[i10].q(j10, z10, zArr[i10]);
        }
    }

    @Override // v7.y
    public long t(q8.r[] rVarArr, boolean[] zArr, v0[] v0VarArr, boolean[] zArr2, long j10) {
        q8.r rVar;
        I();
        e eVar = this.I;
        f1 f1Var = eVar.f28413a;
        boolean[] zArr3 = eVar.f28415c;
        int i10 = this.P;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            v0 v0Var = v0VarArr[i12];
            if (v0Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((c) v0Var).f28409a;
                t8.a.g(zArr3[i13]);
                this.P--;
                zArr3[i13] = false;
                v0VarArr[i12] = null;
            }
        }
        boolean z10 = !this.N ? j10 == 0 : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (v0VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                t8.a.g(rVar.length() == 1);
                t8.a.g(rVar.b(0) == 0);
                int d10 = f1Var.d(rVar.d());
                t8.a.g(!zArr3[d10]);
                this.P++;
                zArr3[d10] = true;
                v0VarArr[i14] = new c(d10);
                zArr2[i14] = true;
                if (!z10) {
                    u0 u0Var = this.D[d10];
                    z10 = (u0Var.Z(j10, true) || u0Var.C() == 0) ? false : true;
                }
            }
        }
        if (this.P == 0) {
            this.T = false;
            this.O = false;
            if (this.f28390v.j()) {
                u0[] u0VarArr = this.D;
                int length = u0VarArr.length;
                while (i11 < length) {
                    u0VarArr[i11].r();
                    i11++;
                }
                this.f28390v.f();
            } else {
                u0[] u0VarArr2 = this.D;
                int length2 = u0VarArr2.length;
                while (i11 < length2) {
                    u0VarArr2[i11].V();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = j(j10);
            while (i11 < v0VarArr.length) {
                if (v0VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.N = true;
        return j10;
    }
}
