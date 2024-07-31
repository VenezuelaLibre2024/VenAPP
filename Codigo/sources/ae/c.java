package ae;

import android.app.Application;
import be.e0;
import be.f0;
import be.g0;
import be.h0;
import be.i0;
import be.j0;
import be.k;
import be.k0;
import be.l;
import be.l0;
import be.m;
import be.m0;
import be.n;
import be.n0;
import be.o;
import be.o0;
import be.p;
import be.p0;
import be.q;
import be.q0;
import be.r0;
import be.s0;
import be.t;
import be.u;
import be.v;
import be.w;
import be.x;
import be.y;
import dj.r;
import java.util.concurrent.Executor;
import zd.m3;
import zd.n3;
import zd.o3;
import zd.p3;
import zd.r2;
import zd.s;
import zd.u2;
import zd.v2;
import zd.w0;
import zd.w2;
import zd.x0;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private w f377a;

        /* renamed from: b, reason: collision with root package name */
        private n0 f378b;

        /* renamed from: c, reason: collision with root package name */
        private n f379c;

        /* renamed from: d, reason: collision with root package name */
        private u f380d;

        /* renamed from: e, reason: collision with root package name */
        private e0 f381e;

        /* renamed from: f, reason: collision with root package name */
        private be.a f382f;

        /* renamed from: g, reason: collision with root package name */
        private h0 f383g;

        /* renamed from: h, reason: collision with root package name */
        private r0 f384h;

        /* renamed from: i, reason: collision with root package name */
        private l0 f385i;

        /* renamed from: j, reason: collision with root package name */
        private k f386j;

        /* renamed from: k, reason: collision with root package name */
        private q f387k;

        private b() {
        }

        public b a(be.a aVar) {
            this.f382f = (be.a) rd.d.b(aVar);
            return this;
        }

        public b b(k kVar) {
            this.f386j = (k) rd.d.b(kVar);
            return this;
        }

        public b c(n nVar) {
            this.f379c = (n) rd.d.b(nVar);
            return this;
        }

        public d d() {
            if (this.f377a == null) {
                this.f377a = new w();
            }
            if (this.f378b == null) {
                this.f378b = new n0();
            }
            rd.d.a(this.f379c, n.class);
            if (this.f380d == null) {
                this.f380d = new u();
            }
            rd.d.a(this.f381e, e0.class);
            if (this.f382f == null) {
                this.f382f = new be.a();
            }
            if (this.f383g == null) {
                this.f383g = new h0();
            }
            if (this.f384h == null) {
                this.f384h = new r0();
            }
            if (this.f385i == null) {
                this.f385i = new l0();
            }
            rd.d.a(this.f386j, k.class);
            rd.d.a(this.f387k, q.class);
            return new C0008c(this.f377a, this.f378b, this.f379c, this.f380d, this.f381e, this.f382f, this.f383g, this.f384h, this.f385i, this.f386j, this.f387k);
        }

        public b e(q qVar) {
            this.f387k = (q) rd.d.b(qVar);
            return this;
        }

        public b f(e0 e0Var) {
            this.f381e = (e0) rd.d.b(e0Var);
            return this;
        }
    }

    /* renamed from: ae.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static final class C0008c implements d {
        private bk.a<Executor> A;
        private bk.a<s> B;
        private bk.a<Executor> C;
        private bk.a<Executor> D;

        /* renamed from: a, reason: collision with root package name */
        private final r0 f388a;

        /* renamed from: b, reason: collision with root package name */
        private final l0 f389b;

        /* renamed from: c, reason: collision with root package name */
        private final C0008c f390c;

        /* renamed from: d, reason: collision with root package name */
        private bk.a<Application> f391d;

        /* renamed from: e, reason: collision with root package name */
        private bk.a<v2> f392e;

        /* renamed from: f, reason: collision with root package name */
        private bk.a<String> f393f;

        /* renamed from: g, reason: collision with root package name */
        private bk.a<vi.d> f394g;

        /* renamed from: h, reason: collision with root package name */
        private bk.a<r> f395h;

        /* renamed from: i, reason: collision with root package name */
        private bk.a<r> f396i;

        /* renamed from: j, reason: collision with root package name */
        private bk.a<r> f397j;

        /* renamed from: k, reason: collision with root package name */
        private bk.a<o3> f398k;

        /* renamed from: l, reason: collision with root package name */
        private bk.a<ij.a<String>> f399l;

        /* renamed from: m, reason: collision with root package name */
        private bk.a<ij.a<String>> f400m;

        /* renamed from: n, reason: collision with root package name */
        private bk.a<r2> f401n;

        /* renamed from: o, reason: collision with root package name */
        private bk.a<cc.a> f402o;

        /* renamed from: p, reason: collision with root package name */
        private bk.a<zd.c> f403p;

        /* renamed from: q, reason: collision with root package name */
        private bk.a<ij.a<String>> f404q;

        /* renamed from: r, reason: collision with root package name */
        private bk.a<nd.d> f405r;

        /* renamed from: s, reason: collision with root package name */
        private bk.a<u2> f406s;

        /* renamed from: t, reason: collision with root package name */
        private bk.a<ce.a> f407t;

        /* renamed from: u, reason: collision with root package name */
        private bk.a<zd.k> f408u;

        /* renamed from: v, reason: collision with root package name */
        private bk.a<u2> f409v;

        /* renamed from: w, reason: collision with root package name */
        private bk.a<w0> f410w;

        /* renamed from: x, reason: collision with root package name */
        private bk.a<de.k> f411x;

        /* renamed from: y, reason: collision with root package name */
        private bk.a<u2> f412y;

        /* renamed from: z, reason: collision with root package name */
        private bk.a<m3> f413z;

        private C0008c(w wVar, n0 n0Var, n nVar, u uVar, e0 e0Var, be.a aVar, h0 h0Var, r0 r0Var, l0 l0Var, k kVar, q qVar) {
            this.f390c = this;
            this.f388a = r0Var;
            this.f389b = l0Var;
            s(wVar, n0Var, nVar, uVar, e0Var, aVar, h0Var, r0Var, l0Var, kVar, qVar);
        }

        private void s(w wVar, n0 n0Var, n nVar, u uVar, e0 e0Var, be.a aVar, h0 h0Var, r0 r0Var, l0 l0Var, k kVar, q qVar) {
            bk.a<Application> a10 = rd.a.a(p.a(nVar));
            this.f391d = a10;
            this.f392e = rd.a.a(w2.a(a10));
            bk.a<String> a11 = rd.a.a(y.a(wVar));
            this.f393f = a11;
            this.f394g = rd.a.a(x.a(wVar, a11));
            this.f395h = rd.a.a(p0.a(n0Var));
            this.f396i = rd.a.a(o0.a(n0Var));
            bk.a<r> a12 = rd.a.a(q0.a(n0Var));
            this.f397j = a12;
            this.f398k = rd.a.a(p3.a(this.f395h, this.f396i, a12));
            this.f399l = rd.a.a(v.a(uVar, this.f391d));
            this.f400m = rd.a.a(f0.a(e0Var));
            this.f401n = rd.a.a(g0.a(e0Var));
            bk.a<cc.a> a13 = rd.a.a(l.a(kVar));
            this.f402o = a13;
            bk.a<zd.c> a14 = rd.a.a(be.c.a(aVar, a13));
            this.f403p = a14;
            this.f404q = rd.a.a(be.b.a(aVar, a14));
            this.f405r = rd.a.a(m.a(kVar));
            this.f406s = rd.a.a(i0.a(h0Var, this.f391d));
            s0 a15 = s0.a(r0Var);
            this.f407t = a15;
            this.f408u = rd.a.a(zd.l.a(this.f406s, this.f391d, a15));
            bk.a<u2> a16 = rd.a.a(j0.a(h0Var, this.f391d));
            this.f409v = a16;
            this.f410w = rd.a.a(x0.a(a16));
            this.f411x = rd.a.a(de.l.a());
            bk.a<u2> a17 = rd.a.a(k0.a(h0Var, this.f391d));
            this.f412y = a17;
            this.f413z = rd.a.a(n3.a(a17, this.f407t));
            bk.a<Executor> a18 = rd.a.a(be.r.a(qVar));
            this.A = a18;
            this.B = rd.a.a(o.a(nVar, a18));
            this.C = rd.a.a(t.a(qVar));
            this.D = rd.a.a(be.s.a(qVar));
        }

        @Override // ae.d
        public de.m a() {
            return m0.a(this.f389b);
        }

        @Override // ae.d
        public zd.c b() {
            return this.f403p.get();
        }

        @Override // ae.d
        public w0 c() {
            return this.f410w.get();
        }

        @Override // ae.d
        public v2 d() {
            return this.f392e.get();
        }

        @Override // ae.d
        public m3 e() {
            return this.f413z.get();
        }

        @Override // ae.d
        public ij.a<String> f() {
            return this.f399l.get();
        }

        @Override // ae.d
        public ce.a g() {
            return s0.c(this.f388a);
        }

        @Override // ae.d
        public vi.d h() {
            return this.f394g.get();
        }

        @Override // ae.d
        public Application i() {
            return this.f391d.get();
        }

        @Override // ae.d
        public r2 j() {
            return this.f401n.get();
        }

        @Override // ae.d
        public Executor k() {
            return this.D.get();
        }

        @Override // ae.d
        public nd.d l() {
            return this.f405r.get();
        }

        @Override // ae.d
        public s m() {
            return this.B.get();
        }

        @Override // ae.d
        public o3 n() {
            return this.f398k.get();
        }

        @Override // ae.d
        public zd.k o() {
            return this.f408u.get();
        }

        @Override // ae.d
        public Executor p() {
            return this.C.get();
        }

        @Override // ae.d
        public ij.a<String> q() {
            return this.f400m.get();
        }

        @Override // ae.d
        public cc.a r() {
            return this.f402o.get();
        }
    }

    public static b a() {
        return new b();
    }
}
