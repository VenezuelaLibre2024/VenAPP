package v7;

import android.net.Uri;
import s8.j;
import s8.n;
import t6.c2;
import t6.d4;
import t6.u1;
import v7.a0;

/* loaded from: classes.dex */
public final class a1 extends v7.a {
    private s8.m0 A;

    /* renamed from: s, reason: collision with root package name */
    private final s8.n f28243s;

    /* renamed from: t, reason: collision with root package name */
    private final j.a f28244t;

    /* renamed from: u, reason: collision with root package name */
    private final u1 f28245u;

    /* renamed from: v, reason: collision with root package name */
    private final long f28246v;

    /* renamed from: w, reason: collision with root package name */
    private final s8.d0 f28247w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f28248x;

    /* renamed from: y, reason: collision with root package name */
    private final d4 f28249y;

    /* renamed from: z, reason: collision with root package name */
    private final c2 f28250z;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final j.a f28251a;

        /* renamed from: b, reason: collision with root package name */
        private s8.d0 f28252b = new s8.v();

        /* renamed from: c, reason: collision with root package name */
        private boolean f28253c = true;

        /* renamed from: d, reason: collision with root package name */
        private Object f28254d;

        /* renamed from: e, reason: collision with root package name */
        private String f28255e;

        public b(j.a aVar) {
            this.f28251a = (j.a) t8.a.e(aVar);
        }

        public a1 a(c2.l lVar, long j10) {
            return new a1(this.f28255e, lVar, this.f28251a, j10, this.f28252b, this.f28253c, this.f28254d);
        }

        public b b(s8.d0 d0Var) {
            if (d0Var == null) {
                d0Var = new s8.v();
            }
            this.f28252b = d0Var;
            return this;
        }
    }

    private a1(String str, c2.l lVar, j.a aVar, long j10, s8.d0 d0Var, boolean z10, Object obj) {
        this.f28244t = aVar;
        this.f28246v = j10;
        this.f28247w = d0Var;
        this.f28248x = z10;
        c2 a10 = new c2.c().g(Uri.EMPTY).d(lVar.f25972a.toString()).e(com.google.common.collect.w.w(lVar)).f(obj).a();
        this.f28250z = a10;
        u1.b W = new u1.b().g0((String) eb.i.a(lVar.f25973b, "text/x-unknown")).X(lVar.f25974c).i0(lVar.f25975d).e0(lVar.f25976e).W(lVar.f25977f);
        String str2 = lVar.f25978g;
        this.f28245u = W.U(str2 == null ? str : str2).G();
        this.f28243s = new n.b().i(lVar.f25972a).b(1).a();
        this.f28249y = new y0(j10, true, false, false, null, a10);
    }

    @Override // v7.a
    protected void C(s8.m0 m0Var) {
        this.A = m0Var;
        D(this.f28249y);
    }

    @Override // v7.a
    protected void E() {
    }

    @Override // v7.a0
    public c2 d() {
        return this.f28250z;
    }

    @Override // v7.a0
    public y e(a0.b bVar, s8.b bVar2, long j10) {
        return new z0(this.f28243s, this.f28244t, this.A, this.f28245u, this.f28246v, this.f28247w, w(bVar), this.f28248x);
    }

    @Override // v7.a0
    public void l(y yVar) {
        ((z0) yVar).q();
    }

    @Override // v7.a0
    public void n() {
    }
}
