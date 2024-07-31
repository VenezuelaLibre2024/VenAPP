package io.grpc.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import vi.p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class q1 extends vi.p0 {

    /* renamed from: c */
    private final p0.d f19106c;

    /* renamed from: d */
    private p0.h f19107d;

    /* loaded from: classes3.dex */
    class a implements p0.j {

        /* renamed from: a */
        final /* synthetic */ p0.h f19108a;

        a(p0.h hVar) {
            this.f19108a = hVar;
        }

        @Override // vi.p0.j
        public void a(vi.q qVar) {
            q1.this.h(this.f19108a, qVar);
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f19110a;

        static {
            int[] iArr = new int[vi.p.values().length];
            f19110a = iArr;
            try {
                iArr[vi.p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19110a[vi.p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19110a[vi.p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19110a[vi.p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends p0.i {

        /* renamed from: a */
        private final p0.e f19111a;

        c(p0.e eVar) {
            this.f19111a = (p0.e) eb.o.p(eVar, "result");
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            return this.f19111a;
        }

        public String toString() {
            return eb.i.b(c.class).d("result", this.f19111a).toString();
        }
    }

    /* loaded from: classes3.dex */
    public final class d extends p0.i {

        /* renamed from: a */
        private final p0.h f19112a;

        /* renamed from: b */
        private final AtomicBoolean f19113b = new AtomicBoolean(false);

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f19112a.e();
            }
        }

        d(p0.h hVar) {
            this.f19112a = (p0.h) eb.o.p(hVar, "subchannel");
        }

        @Override // vi.p0.i
        public p0.e a(p0.f fVar) {
            if (this.f19113b.compareAndSet(false, true)) {
                q1.this.f19106c.d().execute(new a());
            }
            return p0.e.g();
        }
    }

    public q1(p0.d dVar) {
        this.f19106c = (p0.d) eb.o.p(dVar, "helper");
    }

    public void h(p0.h hVar, vi.q qVar) {
        p0.i dVar;
        p0.i iVar;
        vi.p c10 = qVar.c();
        if (c10 == vi.p.SHUTDOWN) {
            return;
        }
        if (qVar.c() == vi.p.TRANSIENT_FAILURE || qVar.c() == vi.p.IDLE) {
            this.f19106c.e();
        }
        int i10 = b.f19110a[c10.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iVar = new c(p0.e.g());
            } else if (i10 == 3) {
                dVar = new c(p0.e.h(hVar));
            } else {
                if (i10 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + c10);
                }
                iVar = new c(p0.e.f(qVar.d()));
            }
            this.f19106c.f(c10, iVar);
        }
        dVar = new d(hVar);
        iVar = dVar;
        this.f19106c.f(c10, iVar);
    }

    @Override // vi.p0
    public boolean a(p0.g gVar) {
        List<vi.x> a10 = gVar.a();
        if (a10.isEmpty()) {
            c(vi.g1.f29115u.r("NameResolver returned no usable address. addrs=" + gVar.a() + ", attrs=" + gVar.b()));
            return false;
        }
        p0.h hVar = this.f19107d;
        if (hVar != null) {
            hVar.h(a10);
            return true;
        }
        p0.h a11 = this.f19106c.a(p0.b.c().d(a10).b());
        a11.g(new a(a11));
        this.f19107d = a11;
        this.f19106c.f(vi.p.CONNECTING, new c(p0.e.h(a11)));
        a11.e();
        return true;
    }

    @Override // vi.p0
    public void c(vi.g1 g1Var) {
        p0.h hVar = this.f19107d;
        if (hVar != null) {
            hVar.f();
            this.f19107d = null;
        }
        this.f19106c.f(vi.p.TRANSIENT_FAILURE, new c(p0.e.f(g1Var)));
    }

    @Override // vi.p0
    public void e() {
        p0.h hVar = this.f19107d;
        if (hVar != null) {
            hVar.f();
        }
    }
}
