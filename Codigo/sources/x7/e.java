package x7;

import android.util.SparseArray;
import java.util.List;
import t6.u1;
import t8.e0;
import t8.r0;
import t8.w;
import u6.m3;
import x7.g;
import y6.b0;
import y6.y;
import y6.z;

/* loaded from: classes.dex */
public final class e implements y6.m, g {

    /* renamed from: u, reason: collision with root package name */
    public static final g.a f30583u = new g.a() { // from class: x7.d
        @Override // x7.g.a
        public final g a(int i10, u1 u1Var, boolean z10, List list, b0 b0Var, m3 m3Var) {
            g g10;
            g10 = e.g(i10, u1Var, z10, list, b0Var, m3Var);
            return g10;
        }
    };

    /* renamed from: v, reason: collision with root package name */
    private static final y f30584v = new y();

    /* renamed from: a, reason: collision with root package name */
    private final y6.k f30585a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30586b;

    /* renamed from: c, reason: collision with root package name */
    private final u1 f30587c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<a> f30588d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    private boolean f30589e;

    /* renamed from: f, reason: collision with root package name */
    private g.b f30590f;

    /* renamed from: r, reason: collision with root package name */
    private long f30591r;

    /* renamed from: s, reason: collision with root package name */
    private z f30592s;

    /* renamed from: t, reason: collision with root package name */
    private u1[] f30593t;

    /* loaded from: classes.dex */
    private static final class a implements b0 {

        /* renamed from: a, reason: collision with root package name */
        private final int f30594a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30595b;

        /* renamed from: c, reason: collision with root package name */
        private final u1 f30596c;

        /* renamed from: d, reason: collision with root package name */
        private final y6.j f30597d = new y6.j();

        /* renamed from: e, reason: collision with root package name */
        public u1 f30598e;

        /* renamed from: f, reason: collision with root package name */
        private b0 f30599f;

        /* renamed from: g, reason: collision with root package name */
        private long f30600g;

        public a(int i10, int i11, u1 u1Var) {
            this.f30594a = i10;
            this.f30595b = i11;
            this.f30596c = u1Var;
        }

        @Override // y6.b0
        public void b(long j10, int i10, int i11, int i12, b0.a aVar) {
            long j11 = this.f30600g;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.f30599f = this.f30597d;
            }
            ((b0) r0.j(this.f30599f)).b(j10, i10, i11, i12, aVar);
        }

        @Override // y6.b0
        public void c(u1 u1Var) {
            u1 u1Var2 = this.f30596c;
            if (u1Var2 != null) {
                u1Var = u1Var.l(u1Var2);
            }
            this.f30598e = u1Var;
            ((b0) r0.j(this.f30599f)).c(this.f30598e);
        }

        @Override // y6.b0
        public void d(e0 e0Var, int i10, int i11) {
            ((b0) r0.j(this.f30599f)).a(e0Var, i10);
        }

        @Override // y6.b0
        public int e(s8.h hVar, int i10, boolean z10, int i11) {
            return ((b0) r0.j(this.f30599f)).f(hVar, i10, z10);
        }

        public void g(g.b bVar, long j10) {
            if (bVar == null) {
                this.f30599f = this.f30597d;
                return;
            }
            this.f30600g = j10;
            b0 d10 = bVar.d(this.f30594a, this.f30595b);
            this.f30599f = d10;
            u1 u1Var = this.f30598e;
            if (u1Var != null) {
                d10.c(u1Var);
            }
        }
    }

    public e(y6.k kVar, int i10, u1 u1Var) {
        this.f30585a = kVar;
        this.f30586b = i10;
        this.f30587c = u1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g g(int i10, u1 u1Var, boolean z10, List list, b0 b0Var, m3 m3Var) {
        y6.k gVar;
        String str = u1Var.f26516v;
        if (w.r(str)) {
            return null;
        }
        if (w.q(str)) {
            gVar = new e7.e(1);
        } else {
            gVar = new g7.g(z10 ? 4 : 0, null, null, list, b0Var);
        }
        return new e(gVar, i10, u1Var);
    }

    @Override // x7.g
    public boolean a(y6.l lVar) {
        int f10 = this.f30585a.f(lVar, f30584v);
        t8.a.g(f10 != 1);
        return f10 == 0;
    }

    @Override // x7.g
    public y6.c b() {
        z zVar = this.f30592s;
        if (zVar instanceof y6.c) {
            return (y6.c) zVar;
        }
        return null;
    }

    @Override // x7.g
    public void c(g.b bVar, long j10, long j11) {
        this.f30590f = bVar;
        this.f30591r = j11;
        if (!this.f30589e) {
            this.f30585a.b(this);
            if (j10 != -9223372036854775807L) {
                this.f30585a.a(0L, j10);
            }
            this.f30589e = true;
            return;
        }
        y6.k kVar = this.f30585a;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        kVar.a(0L, j10);
        for (int i10 = 0; i10 < this.f30588d.size(); i10++) {
            this.f30588d.valueAt(i10).g(bVar, j11);
        }
    }

    @Override // y6.m
    public b0 d(int i10, int i11) {
        a aVar = this.f30588d.get(i10);
        if (aVar == null) {
            t8.a.g(this.f30593t == null);
            aVar = new a(i10, i11, i11 == this.f30586b ? this.f30587c : null);
            aVar.g(this.f30590f, this.f30591r);
            this.f30588d.put(i10, aVar);
        }
        return aVar;
    }

    @Override // x7.g
    public u1[] e() {
        return this.f30593t;
    }

    @Override // y6.m
    public void p(z zVar) {
        this.f30592s = zVar;
    }

    @Override // y6.m
    public void q() {
        u1[] u1VarArr = new u1[this.f30588d.size()];
        for (int i10 = 0; i10 < this.f30588d.size(); i10++) {
            u1VarArr[i10] = (u1) t8.a.i(this.f30588d.valueAt(i10).f30598e);
        }
        this.f30593t = u1VarArr;
    }

    @Override // x7.g
    public void release() {
        this.f30585a.release();
    }
}
