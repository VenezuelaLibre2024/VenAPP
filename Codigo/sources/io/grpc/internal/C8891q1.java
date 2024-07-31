package io.grpc.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p082eb.C7153i;
import p082eb.C7159o;
import vi.AbstractC11939p0;
import vi.C11915g1;
import vi.C11940q;
import vi.C11954x;
import vi.EnumC11938p;

/* renamed from: io.grpc.internal.q1 */
/* loaded from: classes3.dex */
final class C8891q1 extends AbstractC11939p0 {

    /* renamed from: c */
    private final AbstractC11939p0.d f20853c;

    /* renamed from: d */
    private AbstractC11939p0.h f20854d;

    /* renamed from: io.grpc.internal.q1$a */
    /* loaded from: classes3.dex */
    class a implements AbstractC11939p0.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC11939p0.h f20855a;

        a(AbstractC11939p0.h hVar) {
            this.f20855a = hVar;
        }

        @Override // vi.AbstractC11939p0.j
        /* renamed from: a */
        public void mo9644a(C11940q c11940q) {
            C8891q1.this.m25780h(this.f20855a, c11940q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.q1$b */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f20857a;

        static {
            int[] iArr = new int[EnumC11938p.values().length];
            f20857a = iArr;
            try {
                iArr[EnumC11938p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20857a[EnumC11938p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20857a[EnumC11938p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20857a[EnumC11938p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.q1$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC11939p0.i {

        /* renamed from: a */
        private final AbstractC11939p0.e f20858a;

        c(AbstractC11939p0.e eVar) {
            this.f20858a = (AbstractC11939p0.e) C7159o.m21313p(eVar, "result");
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            return this.f20858a;
        }

        public String toString() {
            return C7153i.m21273b(c.class).m21284d("result", this.f20858a).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.q1$d */
    /* loaded from: classes3.dex */
    public final class d extends AbstractC11939p0.i {

        /* renamed from: a */
        private final AbstractC11939p0.h f20859a;

        /* renamed from: b */
        private final AtomicBoolean f20860b = new AtomicBoolean(false);

        /* renamed from: io.grpc.internal.q1$d$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f20859a.mo9560e();
            }
        }

        d(AbstractC11939p0.h hVar) {
            this.f20859a = (AbstractC11939p0.h) C7159o.m21313p(hVar, "subchannel");
        }

        @Override // vi.AbstractC11939p0.i
        /* renamed from: a */
        public AbstractC11939p0.e mo9576a(AbstractC11939p0.f fVar) {
            if (this.f20860b.compareAndSet(false, true)) {
                C8891q1.this.f20853c.mo9555d().execute(new a());
            }
            return AbstractC11939p0.e.m38220g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8891q1(AbstractC11939p0.d dVar) {
        this.f20853c = (AbstractC11939p0.d) C7159o.m21313p(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m25780h(AbstractC11939p0.h hVar, C11940q c11940q) {
        AbstractC11939p0.i dVar;
        AbstractC11939p0.i iVar;
        EnumC11938p m38239c = c11940q.m38239c();
        if (m38239c == EnumC11938p.SHUTDOWN) {
            return;
        }
        if (c11940q.m38239c() == EnumC11938p.TRANSIENT_FAILURE || c11940q.m38239c() == EnumC11938p.IDLE) {
            this.f20853c.mo9556e();
        }
        int i10 = b.f20857a[m38239c.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iVar = new c(AbstractC11939p0.e.m38220g());
            } else if (i10 == 3) {
                dVar = new c(AbstractC11939p0.e.m38221h(hVar));
            } else {
                if (i10 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + m38239c);
                }
                iVar = new c(AbstractC11939p0.e.m38219f(c11940q.m38240d()));
            }
            this.f20853c.mo9577f(m38239c, iVar);
        }
        dVar = new d(hVar);
        iVar = dVar;
        this.f20853c.mo9577f(m38239c, iVar);
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: a */
    public boolean mo9586a(AbstractC11939p0.g gVar) {
        List<C11954x> m38228a = gVar.m38228a();
        if (m38228a.isEmpty()) {
            mo9549c(C11915g1.f31549u.m38147r("NameResolver returned no usable address. addrs=" + gVar.m38228a() + ", attrs=" + gVar.m38229b()));
            return false;
        }
        AbstractC11939p0.h hVar = this.f20854d;
        if (hVar != null) {
            hVar.mo9638h(m38228a);
            return true;
        }
        AbstractC11939p0.h mo9552a = this.f20853c.mo9552a(AbstractC11939p0.b.m38208c().m38215d(m38228a).m38214b());
        mo9552a.mo9562g(new a(mo9552a));
        this.f20854d = mo9552a;
        this.f20853c.mo9577f(EnumC11938p.CONNECTING, new c(AbstractC11939p0.e.m38221h(mo9552a)));
        mo9552a.mo9560e();
        return true;
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: c */
    public void mo9549c(C11915g1 c11915g1) {
        AbstractC11939p0.h hVar = this.f20854d;
        if (hVar != null) {
            hVar.mo9561f();
            this.f20854d = null;
        }
        this.f20853c.mo9577f(EnumC11938p.TRANSIENT_FAILURE, new c(AbstractC11939p0.e.m38219f(c11915g1)));
    }

    @Override // vi.AbstractC11939p0
    /* renamed from: e */
    public void mo9574e() {
        AbstractC11939p0.h hVar = this.f20854d;
        if (hVar != null) {
            hVar.mo9561f();
        }
    }
}
