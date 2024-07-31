package x7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s8.d0;
import s8.e0;
import t6.u1;
import t6.u3;
import t6.v1;
import t8.r0;
import v7.h0;
import v7.u0;
import v7.v0;
import v7.w0;
import x6.u;
import x6.v;
import x7.j;

/* loaded from: classes.dex */
public class i<T extends j> implements v0, w0, e0.b<f>, e0.f {
    private f A;
    private u1 B;
    private b<T> C;
    private long D;
    private long E;
    private int F;
    private x7.a G;
    boolean H;

    /* renamed from: a, reason: collision with root package name */
    public final int f30612a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f30613b;

    /* renamed from: c, reason: collision with root package name */
    private final u1[] f30614c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f30615d;

    /* renamed from: e, reason: collision with root package name */
    private final T f30616e;

    /* renamed from: f, reason: collision with root package name */
    private final w0.a<i<T>> f30617f;

    /* renamed from: r, reason: collision with root package name */
    private final h0.a f30618r;

    /* renamed from: s, reason: collision with root package name */
    private final d0 f30619s;

    /* renamed from: t, reason: collision with root package name */
    private final e0 f30620t;

    /* renamed from: u, reason: collision with root package name */
    private final h f30621u;

    /* renamed from: v, reason: collision with root package name */
    private final ArrayList<x7.a> f30622v;

    /* renamed from: w, reason: collision with root package name */
    private final List<x7.a> f30623w;

    /* renamed from: x, reason: collision with root package name */
    private final u0 f30624x;

    /* renamed from: y, reason: collision with root package name */
    private final u0[] f30625y;

    /* renamed from: z, reason: collision with root package name */
    private final c f30626z;

    /* loaded from: classes.dex */
    public final class a implements v0 {

        /* renamed from: a, reason: collision with root package name */
        public final i<T> f30627a;

        /* renamed from: b, reason: collision with root package name */
        private final u0 f30628b;

        /* renamed from: c, reason: collision with root package name */
        private final int f30629c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f30630d;

        public a(i<T> iVar, u0 u0Var, int i10) {
            this.f30627a = iVar;
            this.f30628b = u0Var;
            this.f30629c = i10;
        }

        private void b() {
            if (this.f30630d) {
                return;
            }
            i.this.f30618r.i(i.this.f30613b[this.f30629c], i.this.f30614c[this.f30629c], 0, null, i.this.E);
            this.f30630d = true;
        }

        @Override // v7.v0
        public void a() {
        }

        public void c() {
            t8.a.g(i.this.f30615d[this.f30629c]);
            i.this.f30615d[this.f30629c] = false;
        }

        @Override // v7.v0
        public boolean d() {
            return !i.this.H() && this.f30628b.K(i.this.H);
        }

        @Override // v7.v0
        public int p(long j10) {
            if (i.this.H()) {
                return 0;
            }
            int E = this.f30628b.E(j10, i.this.H);
            if (i.this.G != null) {
                E = Math.min(E, i.this.G.i(this.f30629c + 1) - this.f30628b.C());
            }
            this.f30628b.e0(E);
            if (E > 0) {
                b();
            }
            return E;
        }

        @Override // v7.v0
        public int q(v1 v1Var, w6.g gVar, int i10) {
            if (i.this.H()) {
                return -3;
            }
            if (i.this.G != null && i.this.G.i(this.f30629c + 1) <= this.f30628b.C()) {
                return -3;
            }
            b();
            return this.f30628b.S(v1Var, gVar, i10, i.this.H);
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends j> {
        void d(i<T> iVar);
    }

    public i(int i10, int[] iArr, u1[] u1VarArr, T t10, w0.a<i<T>> aVar, s8.b bVar, long j10, v vVar, u.a aVar2, d0 d0Var, h0.a aVar3) {
        this.f30612a = i10;
        int i11 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f30613b = iArr;
        this.f30614c = u1VarArr == null ? new u1[0] : u1VarArr;
        this.f30616e = t10;
        this.f30617f = aVar;
        this.f30618r = aVar3;
        this.f30619s = d0Var;
        this.f30620t = new e0("ChunkSampleStream");
        this.f30621u = new h();
        ArrayList<x7.a> arrayList = new ArrayList<>();
        this.f30622v = arrayList;
        this.f30623w = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f30625y = new u0[length];
        this.f30615d = new boolean[length];
        int i12 = length + 1;
        int[] iArr2 = new int[i12];
        u0[] u0VarArr = new u0[i12];
        u0 k10 = u0.k(bVar, vVar, aVar2);
        this.f30624x = k10;
        iArr2[0] = i10;
        u0VarArr[0] = k10;
        while (i11 < length) {
            u0 l10 = u0.l(bVar);
            this.f30625y[i11] = l10;
            int i13 = i11 + 1;
            u0VarArr[i13] = l10;
            iArr2[i13] = this.f30613b[i11];
            i11 = i13;
        }
        this.f30626z = new c(iArr2, u0VarArr);
        this.D = j10;
        this.E = j10;
    }

    private void A(int i10) {
        int min = Math.min(N(i10, 0), this.F);
        if (min > 0) {
            r0.N0(this.f30622v, 0, min);
            this.F -= min;
        }
    }

    private void B(int i10) {
        t8.a.g(!this.f30620t.j());
        int size = this.f30622v.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (!F(i10)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        long j10 = E().f30608h;
        x7.a C = C(i10);
        if (this.f30622v.isEmpty()) {
            this.D = this.E;
        }
        this.H = false;
        this.f30618r.D(this.f30612a, C.f30607g, j10);
    }

    private x7.a C(int i10) {
        x7.a aVar = this.f30622v.get(i10);
        ArrayList<x7.a> arrayList = this.f30622v;
        r0.N0(arrayList, i10, arrayList.size());
        this.F = Math.max(this.F, this.f30622v.size());
        u0 u0Var = this.f30624x;
        int i11 = 0;
        while (true) {
            u0Var.u(aVar.i(i11));
            u0[] u0VarArr = this.f30625y;
            if (i11 >= u0VarArr.length) {
                return aVar;
            }
            u0Var = u0VarArr[i11];
            i11++;
        }
    }

    private x7.a E() {
        return this.f30622v.get(r0.size() - 1);
    }

    private boolean F(int i10) {
        int C;
        x7.a aVar = this.f30622v.get(i10);
        if (this.f30624x.C() > aVar.i(0)) {
            return true;
        }
        int i11 = 0;
        do {
            u0[] u0VarArr = this.f30625y;
            if (i11 >= u0VarArr.length) {
                return false;
            }
            C = u0VarArr[i11].C();
            i11++;
        } while (C <= aVar.i(i11));
        return true;
    }

    private boolean G(f fVar) {
        return fVar instanceof x7.a;
    }

    private void I() {
        int N = N(this.f30624x.C(), this.F - 1);
        while (true) {
            int i10 = this.F;
            if (i10 > N) {
                return;
            }
            this.F = i10 + 1;
            J(i10);
        }
    }

    private void J(int i10) {
        x7.a aVar = this.f30622v.get(i10);
        u1 u1Var = aVar.f30604d;
        if (!u1Var.equals(this.B)) {
            this.f30618r.i(this.f30612a, u1Var, aVar.f30605e, aVar.f30606f, aVar.f30607g);
        }
        this.B = u1Var;
    }

    private int N(int i10, int i11) {
        do {
            i11++;
            if (i11 >= this.f30622v.size()) {
                return this.f30622v.size() - 1;
            }
        } while (this.f30622v.get(i11).i(0) <= i10);
        return i11 - 1;
    }

    private void Q() {
        this.f30624x.V();
        for (u0 u0Var : this.f30625y) {
            u0Var.V();
        }
    }

    public T D() {
        return this.f30616e;
    }

    boolean H() {
        return this.D != -9223372036854775807L;
    }

    @Override // s8.e0.b
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void i(f fVar, long j10, long j11, boolean z10) {
        this.A = null;
        this.G = null;
        v7.u uVar = new v7.u(fVar.f30601a, fVar.f30602b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f30619s.c(fVar.f30601a);
        this.f30618r.r(uVar, fVar.f30603c, this.f30612a, fVar.f30604d, fVar.f30605e, fVar.f30606f, fVar.f30607g, fVar.f30608h);
        if (z10) {
            return;
        }
        if (H()) {
            Q();
        } else if (G(fVar)) {
            C(this.f30622v.size() - 1);
            if (this.f30622v.isEmpty()) {
                this.D = this.E;
            }
        }
        this.f30617f.a(this);
    }

    @Override // s8.e0.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m(f fVar, long j10, long j11) {
        this.A = null;
        this.f30616e.i(fVar);
        v7.u uVar = new v7.u(fVar.f30601a, fVar.f30602b, fVar.f(), fVar.e(), j10, j11, fVar.a());
        this.f30619s.c(fVar.f30601a);
        this.f30618r.u(uVar, fVar.f30603c, this.f30612a, fVar.f30604d, fVar.f30605e, fVar.f30606f, fVar.f30607g, fVar.f30608h);
        this.f30617f.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    @Override // s8.e0.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s8.e0.c h(x7.f r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.i.h(x7.f, long, long, java.io.IOException, int):s8.e0$c");
    }

    public void O() {
        P(null);
    }

    public void P(b<T> bVar) {
        this.C = bVar;
        this.f30624x.R();
        for (u0 u0Var : this.f30625y) {
            u0Var.R();
        }
        this.f30620t.m(this);
    }

    public void R(long j10) {
        x7.a aVar;
        this.E = j10;
        if (H()) {
            this.D = j10;
            return;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f30622v.size(); i11++) {
            aVar = this.f30622v.get(i11);
            long j11 = aVar.f30607g;
            if (j11 == j10 && aVar.f30574k == -9223372036854775807L) {
                break;
            } else {
                if (j11 > j10) {
                    break;
                }
            }
        }
        aVar = null;
        if (aVar != null ? this.f30624x.Y(aVar.i(0)) : this.f30624x.Z(j10, j10 < b())) {
            this.F = N(this.f30624x.C(), 0);
            u0[] u0VarArr = this.f30625y;
            int length = u0VarArr.length;
            while (i10 < length) {
                u0VarArr[i10].Z(j10, true);
                i10++;
            }
            return;
        }
        this.D = j10;
        this.H = false;
        this.f30622v.clear();
        this.F = 0;
        if (!this.f30620t.j()) {
            this.f30620t.g();
            Q();
            return;
        }
        this.f30624x.r();
        u0[] u0VarArr2 = this.f30625y;
        int length2 = u0VarArr2.length;
        while (i10 < length2) {
            u0VarArr2[i10].r();
            i10++;
        }
        this.f30620t.f();
    }

    public i<T>.a S(long j10, int i10) {
        for (int i11 = 0; i11 < this.f30625y.length; i11++) {
            if (this.f30613b[i11] == i10) {
                t8.a.g(!this.f30615d[i11]);
                this.f30615d[i11] = true;
                this.f30625y[i11].Z(j10, true);
                return new a(this, this.f30625y[i11], i11);
            }
        }
        throw new IllegalStateException();
    }

    @Override // v7.v0
    public void a() {
        this.f30620t.a();
        this.f30624x.N();
        if (this.f30620t.j()) {
            return;
        }
        this.f30616e.a();
    }

    @Override // v7.w0
    public long b() {
        if (H()) {
            return this.D;
        }
        if (this.H) {
            return Long.MIN_VALUE;
        }
        return E().f30608h;
    }

    public long c(long j10, u3 u3Var) {
        return this.f30616e.c(j10, u3Var);
    }

    @Override // v7.v0
    public boolean d() {
        return !H() && this.f30624x.K(this.H);
    }

    @Override // v7.w0
    public boolean e(long j10) {
        List<x7.a> list;
        long j11;
        if (this.H || this.f30620t.j() || this.f30620t.i()) {
            return false;
        }
        boolean H = H();
        if (H) {
            list = Collections.emptyList();
            j11 = this.D;
        } else {
            list = this.f30623w;
            j11 = E().f30608h;
        }
        this.f30616e.j(j10, j11, list, this.f30621u);
        h hVar = this.f30621u;
        boolean z10 = hVar.f30611b;
        f fVar = hVar.f30610a;
        hVar.a();
        if (z10) {
            this.D = -9223372036854775807L;
            this.H = true;
            return true;
        }
        if (fVar == null) {
            return false;
        }
        this.A = fVar;
        if (G(fVar)) {
            x7.a aVar = (x7.a) fVar;
            if (H) {
                long j12 = aVar.f30607g;
                long j13 = this.D;
                if (j12 != j13) {
                    this.f30624x.b0(j13);
                    for (u0 u0Var : this.f30625y) {
                        u0Var.b0(this.D);
                    }
                }
                this.D = -9223372036854775807L;
            }
            aVar.k(this.f30626z);
            this.f30622v.add(aVar);
        } else if (fVar instanceof m) {
            ((m) fVar).g(this.f30626z);
        }
        this.f30618r.A(new v7.u(fVar.f30601a, fVar.f30602b, this.f30620t.n(fVar, this, this.f30619s.a(fVar.f30603c))), fVar.f30603c, this.f30612a, fVar.f30604d, fVar.f30605e, fVar.f30606f, fVar.f30607g, fVar.f30608h);
        return true;
    }

    @Override // v7.w0
    public long f() {
        if (this.H) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.D;
        }
        long j10 = this.E;
        x7.a E = E();
        if (!E.h()) {
            if (this.f30622v.size() > 1) {
                E = this.f30622v.get(r2.size() - 2);
            } else {
                E = null;
            }
        }
        if (E != null) {
            j10 = Math.max(j10, E.f30608h);
        }
        return Math.max(j10, this.f30624x.z());
    }

    @Override // v7.w0
    public void g(long j10) {
        if (this.f30620t.i() || H()) {
            return;
        }
        if (!this.f30620t.j()) {
            int h10 = this.f30616e.h(j10, this.f30623w);
            if (h10 < this.f30622v.size()) {
                B(h10);
                return;
            }
            return;
        }
        f fVar = (f) t8.a.e(this.A);
        if (!(G(fVar) && F(this.f30622v.size() - 1)) && this.f30616e.d(j10, fVar, this.f30623w)) {
            this.f30620t.f();
            if (G(fVar)) {
                this.G = (x7.a) fVar;
            }
        }
    }

    @Override // v7.w0
    public boolean isLoading() {
        return this.f30620t.j();
    }

    @Override // s8.e0.f
    public void n() {
        this.f30624x.T();
        for (u0 u0Var : this.f30625y) {
            u0Var.T();
        }
        this.f30616e.release();
        b<T> bVar = this.C;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    @Override // v7.v0
    public int p(long j10) {
        if (H()) {
            return 0;
        }
        int E = this.f30624x.E(j10, this.H);
        x7.a aVar = this.G;
        if (aVar != null) {
            E = Math.min(E, aVar.i(0) - this.f30624x.C());
        }
        this.f30624x.e0(E);
        I();
        return E;
    }

    @Override // v7.v0
    public int q(v1 v1Var, w6.g gVar, int i10) {
        if (H()) {
            return -3;
        }
        x7.a aVar = this.G;
        if (aVar != null && aVar.i(0) <= this.f30624x.C()) {
            return -3;
        }
        I();
        return this.f30624x.S(v1Var, gVar, i10, this.H);
    }

    public void s(long j10, boolean z10) {
        if (H()) {
            return;
        }
        int x10 = this.f30624x.x();
        this.f30624x.q(j10, z10, true);
        int x11 = this.f30624x.x();
        if (x11 > x10) {
            long y10 = this.f30624x.y();
            int i10 = 0;
            while (true) {
                u0[] u0VarArr = this.f30625y;
                if (i10 >= u0VarArr.length) {
                    break;
                }
                u0VarArr[i10].q(y10, z10, this.f30615d[i10]);
                i10++;
            }
        }
        A(x11);
    }
}
