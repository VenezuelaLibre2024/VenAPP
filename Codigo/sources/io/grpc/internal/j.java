package io.grpc.internal;

import io.grpc.internal.d2;
import java.util.List;
import java.util.Map;
import vi.f;
import vi.p0;
import vi.y0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final vi.r0 f18916a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18917b;

    /* loaded from: classes3.dex */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final p0.d f18918a;

        /* renamed from: b, reason: collision with root package name */
        private vi.p0 f18919b;

        /* renamed from: c, reason: collision with root package name */
        private vi.q0 f18920c;

        b(p0.d dVar) {
            this.f18918a = dVar;
            vi.q0 d10 = j.this.f18916a.d(j.this.f18917b);
            this.f18920c = d10;
            if (d10 != null) {
                this.f18919b = d10.a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + j.this.f18917b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public vi.p0 a() {
            return this.f18919b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void b(vi.g1 g1Var) {
            a().c(g1Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c() {
            this.f18919b.e();
            this.f18919b = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d(p0.g gVar) {
            d2.b bVar = (d2.b) gVar.c();
            if (bVar == null) {
                try {
                    j jVar = j.this;
                    bVar = new d2.b(jVar.d(jVar.f18917b, "using default policy"), null);
                } catch (f e10) {
                    this.f18918a.f(vi.p.TRANSIENT_FAILURE, new d(vi.g1.f29114t.r(e10.getMessage())));
                    this.f18919b.e();
                    this.f18920c = null;
                    this.f18919b = new e();
                    return true;
                }
            }
            if (this.f18920c == null || !bVar.f18683a.b().equals(this.f18920c.b())) {
                this.f18918a.f(vi.p.CONNECTING, new c());
                this.f18919b.e();
                vi.q0 q0Var = bVar.f18683a;
                this.f18920c = q0Var;
                vi.p0 p0Var = this.f18919b;
                this.f18919b = q0Var.a(this.f18918a);
                this.f18918a.b().b(f.a.INFO, "Load balancer changed from {0} to {1}", p0Var.getClass().getSimpleName(), this.f18919b.getClass().getSimpleName());
            }
            Object obj = bVar.f18684b;
            if (obj != null) {
                this.f18918a.b().b(f.a.DEBUG, "Load-balancing config: {0}", bVar.f18684b);
            }
            return a().a(p0.g.d().b(gVar.a()).c(gVar.b()).d(obj).a());
        }
    }

    /* loaded from: classes3.dex */
    private static final class c extends p0.i {
        private c() {
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            return p0.e.g();
        }

        public String toString() {
            return eb.i.b(c.class).toString();
        }
    }

    /* loaded from: classes3.dex */
    private static final class d extends p0.i {

        /* renamed from: a, reason: collision with root package name */
        private final vi.g1 f18922a;

        d(vi.g1 g1Var) {
            this.f18922a = g1Var;
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            return p0.e.f(this.f18922a);
        }
    }

    /* loaded from: classes3.dex */
    private static final class e extends vi.p0 {
        private e() {
        }

        @Override // vi.p0
        public boolean a(p0.g gVar) {
            return true;
        }

        @Override // vi.p0
        public void c(vi.g1 g1Var) {
        }

        @Override // vi.p0
        @Deprecated
        public void d(p0.g gVar) {
        }

        @Override // vi.p0
        public void e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class f extends Exception {
        private static final long serialVersionUID = 1;

        private f(String str) {
            super(str);
        }
    }

    public j(String str) {
        this(vi.r0.b(), str);
    }

    j(vi.r0 r0Var, String str) {
        this.f18916a = (vi.r0) eb.o.p(r0Var, "registry");
        this.f18917b = (String) eb.o.p(str, "defaultPolicy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vi.q0 d(String str, String str2) {
        vi.q0 d10 = this.f18916a.d(str);
        if (d10 != null) {
            return d10;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(p0.d dVar) {
        return new b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0.c f(Map<String, ?> map) {
        List<d2.a> A;
        if (map != null) {
            try {
                A = d2.A(d2.g(map));
            } catch (RuntimeException e10) {
                return y0.c.b(vi.g1.f29102h.r("can't parse load balancer configuration").q(e10));
            }
        } else {
            A = null;
        }
        if (A == null || A.isEmpty()) {
            return null;
        }
        return d2.y(A, this.f18916a);
    }
}
