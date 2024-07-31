package io.grpc.internal;

import io.grpc.internal.C8840d2;
import java.util.List;
import java.util.Map;
import p082eb.C7153i;
import p082eb.C7159o;
import vi.AbstractC11910f;
import vi.AbstractC11939p0;
import vi.AbstractC11941q0;
import vi.AbstractC11957y0;
import vi.C11915g1;
import vi.C11943r0;
import vi.EnumC11938p;

/* renamed from: io.grpc.internal.j */
/* loaded from: classes3.dex */
public final class C8861j {

    /* renamed from: a */
    private final C11943r0 f20659a;

    /* renamed from: b */
    private final String f20660b;

    /* renamed from: io.grpc.internal.j$b */
    /* loaded from: classes3.dex */
    public final class b {

        /* renamed from: a */
        private final AbstractC11939p0.d f20661a;

        /* renamed from: b */
        private AbstractC11939p0 f20662b;

        /* renamed from: c */
        private AbstractC11941q0 f20663c;

        b(AbstractC11939p0.d dVar) {
            this.f20661a = dVar;
            AbstractC11941q0 m38258d = C8861j.this.f20659a.m38258d(C8861j.this.f20660b);
            this.f20663c = m38258d;
            if (m38258d != null) {
                this.f20662b = m38258d.mo9648a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + C8861j.this.f20660b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        /* renamed from: a */
        public AbstractC11939p0 m25620a() {
            return this.f20662b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m25621b(C11915g1 c11915g1) {
            m25620a().mo9549c(c11915g1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public void m25622c() {
            this.f20662b.mo9574e();
            this.f20662b = null;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean m25623d(AbstractC11939p0.g gVar) {
            C8840d2.b bVar = (C8840d2.b) gVar.m38230c();
            if (bVar == null) {
                try {
                    C8861j c8861j = C8861j.this;
                    bVar = new C8840d2.b(c8861j.m25617d(c8861j.f20660b, "using default policy"), null);
                } catch (f e10) {
                    this.f20661a.mo9577f(EnumC11938p.TRANSIENT_FAILURE, new d(C11915g1.f31548t.m38147r(e10.getMessage())));
                    this.f20662b.mo9574e();
                    this.f20663c = null;
                    this.f20662b = new e();
                    return true;
                }
            }
            if (this.f20663c == null || !bVar.f20379a.mo9649b().equals(this.f20663c.mo9649b())) {
                this.f20661a.mo9577f(EnumC11938p.CONNECTING, new c());
                this.f20662b.mo9574e();
                AbstractC11941q0 abstractC11941q0 = bVar.f20379a;
                this.f20663c = abstractC11941q0;
                AbstractC11939p0 abstractC11939p0 = this.f20662b;
                this.f20662b = abstractC11941q0.mo9648a(this.f20661a);
                this.f20661a.mo9553b().mo25683b(AbstractC11910f.a.INFO, "Load balancer changed from {0} to {1}", abstractC11939p0.getClass().getSimpleName(), this.f20662b.getClass().getSimpleName());
            }
            Object obj = bVar.f20380b;
            if (obj != null) {
                this.f20661a.mo9553b().mo25683b(AbstractC11910f.a.DEBUG, "Load-balancing config: {0}", bVar.f20380b);
            }
            return m25620a().mo9586a(AbstractC11939p0.g.m38227d().m38233b(gVar.m38228a()).m38234c(gVar.m38229b()).m38235d(obj).m38232a());
        }
    }

    /* renamed from: io.grpc.internal.j$c */
    /* loaded from: classes3.dex */
    private static final class c extends AbstractC11939p0.i {
        private c() {
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            return AbstractC11939p0.e.m38220g();
        }

        public String toString() {
            return C7153i.m21273b(c.class).toString();
        }
    }

    /* renamed from: io.grpc.internal.j$d */
    /* loaded from: classes3.dex */
    private static final class d extends AbstractC11939p0.i {

        /* renamed from: a */
        private final C11915g1 f20665a;

        d(C11915g1 c11915g1) {
            this.f20665a = c11915g1;
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            return AbstractC11939p0.e.m38219f(this.f20665a);
        }
    }

    /* renamed from: io.grpc.internal.j$e */
    /* loaded from: classes3.dex */
    private static final class e extends AbstractC11939p0 {
        private e() {
        }

        @Override // vi.AbstractC11939p0
        /* renamed from: a */
        public boolean mo9586a(AbstractC11939p0.g gVar) {
            return true;
        }

        @Override // vi.AbstractC11939p0
        /* renamed from: c */
        public void mo9549c(C11915g1 c11915g1) {
        }

        @Override // vi.AbstractC11939p0
        @Deprecated
        /* renamed from: d */
        public void mo9550d(AbstractC11939p0.g gVar) {
        }

        @Override // vi.AbstractC11939p0
        /* renamed from: e */
        public void mo9574e() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.j$f */
    /* loaded from: classes3.dex */
    public static final class f extends Exception {
        private static final long serialVersionUID = 1;

        private f(String str) {
            super(str);
        }
    }

    public C8861j(String str) {
        this(C11943r0.m38255b(), str);
    }

    C8861j(C11943r0 c11943r0, String str) {
        this.f20659a = (C11943r0) C7159o.m21313p(c11943r0, "registry");
        this.f20660b = (String) C7159o.m21313p(str, "defaultPolicy");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public AbstractC11941q0 m25617d(String str, String str2) {
        AbstractC11941q0 m38258d = this.f20659a.m38258d(str);
        if (m38258d != null) {
            return m38258d;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    /* renamed from: e */
    public b m25618e(AbstractC11939p0.d dVar) {
        return new b(dVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC11957y0.c m25619f(Map<String, ?> map) {
        List<C8840d2.a> m25390A;
        if (map != null) {
            try {
                m25390A = C8840d2.m25390A(C8840d2.m25397g(map));
            } catch (RuntimeException e10) {
                return AbstractC11957y0.c.m38372b(C11915g1.f31536h.m38147r("can't parse load balancer configuration").m38146q(e10));
            }
        } else {
            m25390A = null;
        }
        if (m25390A == null || m25390A.isEmpty()) {
            return null;
        }
        return C8840d2.m25415y(m25390A, this.f20659a);
    }
}
