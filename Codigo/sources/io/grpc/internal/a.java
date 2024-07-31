package io.grpc.internal;

import io.grpc.internal.d;
import io.grpc.internal.l1;
import io.grpc.internal.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.w0;

/* loaded from: classes3.dex */
public abstract class a extends d implements q, l1.d {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f18507g = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final n2 f18508a;

    /* renamed from: b, reason: collision with root package name */
    private final o0 f18509b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18510c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f18511d;

    /* renamed from: e, reason: collision with root package name */
    private vi.w0 f18512e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f18513f;

    /* renamed from: io.grpc.internal.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private class C0295a implements o0 {

        /* renamed from: a, reason: collision with root package name */
        private vi.w0 f18514a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f18515b;

        /* renamed from: c, reason: collision with root package name */
        private final h2 f18516c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f18517d;

        public C0295a(vi.w0 w0Var, h2 h2Var) {
            this.f18514a = (vi.w0) eb.o.p(w0Var, "headers");
            this.f18516c = (h2) eb.o.p(h2Var, "statsTraceCtx");
        }

        @Override // io.grpc.internal.o0
        public o0 a(vi.n nVar) {
            return this;
        }

        @Override // io.grpc.internal.o0
        public void b(InputStream inputStream) {
            eb.o.v(this.f18517d == null, "writePayload should not be called multiple times");
            try {
                this.f18517d = fb.b.d(inputStream);
                this.f18516c.i(0);
                h2 h2Var = this.f18516c;
                byte[] bArr = this.f18517d;
                h2Var.j(0, bArr.length, bArr.length);
                this.f18516c.k(this.f18517d.length);
                this.f18516c.l(this.f18517d.length);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.grpc.internal.o0
        public void close() {
            this.f18515b = true;
            eb.o.v(this.f18517d != null, "Lack of request message. GET request is only supported for unary requests");
            a.this.u().e(this.f18514a, this.f18517d);
            this.f18517d = null;
            this.f18514a = null;
        }

        @Override // io.grpc.internal.o0
        public void f(int i10) {
        }

        @Override // io.grpc.internal.o0
        public void flush() {
        }

        @Override // io.grpc.internal.o0
        public boolean isClosed() {
            return this.f18515b;
        }
    }

    /* loaded from: classes3.dex */
    protected interface b {
        void c(vi.g1 g1Var);

        void d(o2 o2Var, boolean z10, boolean z11, int i10);

        void e(vi.w0 w0Var, byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static abstract class c extends d.a {

        /* renamed from: i, reason: collision with root package name */
        private final h2 f18519i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f18520j;

        /* renamed from: k, reason: collision with root package name */
        private r f18521k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f18522l;

        /* renamed from: m, reason: collision with root package name */
        private vi.v f18523m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f18524n;

        /* renamed from: o, reason: collision with root package name */
        private Runnable f18525o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f18526p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f18527q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f18528r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0296a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ vi.g1 f18529a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r.a f18530b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ vi.w0 f18531c;

            RunnableC0296a(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
                this.f18529a = g1Var;
                this.f18530b = aVar;
                this.f18531c = w0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.C(this.f18529a, this.f18530b, this.f18531c);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c(int i10, h2 h2Var, n2 n2Var) {
            super(i10, h2Var, n2Var);
            this.f18523m = vi.v.c();
            this.f18524n = false;
            this.f18519i = (h2) eb.o.p(h2Var, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
            if (this.f18520j) {
                return;
            }
            this.f18520j = true;
            this.f18519i.m(g1Var);
            o().d(g1Var, aVar, w0Var);
            if (m() != null) {
                m().f(g1Var.p());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(vi.v vVar) {
            eb.o.v(this.f18521k == null, "Already called start");
            this.f18523m = (vi.v) eb.o.p(vVar, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(boolean z10) {
            this.f18522l = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L() {
            this.f18526p = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void D(u1 u1Var) {
            eb.o.p(u1Var, "frame");
            boolean z10 = true;
            try {
                if (this.f18527q) {
                    a.f18507g.log(Level.INFO, "Received data on closed stream");
                    u1Var.close();
                    return;
                }
                try {
                    l(u1Var);
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                    if (z10) {
                        u1Var.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void E(vi.w0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f18527q
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                eb.o.v(r0, r2)
                io.grpc.internal.h2 r0 = r5.f18519i
                r0.a()
                vi.w0$g<java.lang.String> r0 = io.grpc.internal.q0.f19087g
                java.lang.Object r0 = r6.g(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f18522l
                r3 = 0
                if (r2 == 0) goto L4f
                if (r0 == 0) goto L4f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L2f
                io.grpc.internal.r0 r0 = new io.grpc.internal.r0
                r0.<init>()
                r5.w(r0)
                r0 = r1
                goto L50
            L2f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L4f
                vi.g1 r6 = vi.g1.f29114t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                vi.g1 r6 = r6.r(r0)
                vi.i1 r6 = r6.d()
                r5.d(r6)
                return
            L4f:
                r0 = r3
            L50:
                vi.w0$g<java.lang.String> r2 = io.grpc.internal.q0.f19085e
                java.lang.Object r2 = r6.g(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L93
                vi.v r4 = r5.f18523m
                vi.u r4 = r4.e(r2)
                if (r4 != 0) goto L7a
                vi.g1 r6 = vi.g1.f29114t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                vi.g1 r6 = r6.r(r0)
                vi.i1 r6 = r6.d()
                r5.d(r6)
                return
            L7a:
                vi.l r1 = vi.l.b.f29160a
                if (r4 == r1) goto L93
                if (r0 == 0) goto L90
                vi.g1 r6 = vi.g1.f29114t
                java.lang.String r0 = "Full stream and gRPC message encoding cannot both be set"
                vi.g1 r6 = r6.r(r0)
                vi.i1 r6 = r6.d()
                r5.d(r6)
                return
            L90:
                r5.v(r4)
            L93:
                io.grpc.internal.r r0 = r5.o()
                r0.b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a.c.E(vi.w0):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void F(vi.w0 w0Var, vi.g1 g1Var) {
            eb.o.p(g1Var, "status");
            eb.o.p(w0Var, "trailers");
            if (this.f18527q) {
                a.f18507g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{g1Var, w0Var});
            } else {
                this.f18519i.b(w0Var);
                N(g1Var, false, w0Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final boolean G() {
            return this.f18526p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public final r o() {
            return this.f18521k;
        }

        public final void K(r rVar) {
            eb.o.v(this.f18521k == null, "Already called setListener");
            this.f18521k = (r) eb.o.p(rVar, "listener");
        }

        public final void M(vi.g1 g1Var, r.a aVar, boolean z10, vi.w0 w0Var) {
            eb.o.p(g1Var, "status");
            eb.o.p(w0Var, "trailers");
            if (!this.f18527q || z10) {
                this.f18527q = true;
                this.f18528r = g1Var.p();
                s();
                if (this.f18524n) {
                    this.f18525o = null;
                    C(g1Var, aVar, w0Var);
                } else {
                    this.f18525o = new RunnableC0296a(g1Var, aVar, w0Var);
                    k(z10);
                }
            }
        }

        public final void N(vi.g1 g1Var, boolean z10, vi.w0 w0Var) {
            M(g1Var, r.a.PROCESSED, z10, w0Var);
        }

        @Override // io.grpc.internal.k1.b
        public void e(boolean z10) {
            eb.o.v(this.f18527q, "status should have been reported on deframer closed");
            this.f18524n = true;
            if (this.f18528r && z10) {
                N(vi.g1.f29114t.r("Encountered end-of-stream mid-frame"), true, new vi.w0());
            }
            Runnable runnable = this.f18525o;
            if (runnable != null) {
                runnable.run();
                this.f18525o = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(p2 p2Var, h2 h2Var, n2 n2Var, vi.w0 w0Var, vi.c cVar, boolean z10) {
        eb.o.p(w0Var, "headers");
        this.f18508a = (n2) eb.o.p(n2Var, "transportTracer");
        this.f18510c = q0.o(cVar);
        this.f18511d = z10;
        if (z10) {
            this.f18509b = new C0295a(w0Var, h2Var);
        } else {
            this.f18509b = new l1(this, p2Var, h2Var);
            this.f18512e = w0Var;
        }
    }

    @Override // io.grpc.internal.q
    public final void c(vi.g1 g1Var) {
        eb.o.e(!g1Var.p(), "Should not cancel with OK status");
        this.f18513f = true;
        u().c(g1Var);
    }

    @Override // io.grpc.internal.d, io.grpc.internal.i2
    public final boolean d() {
        return super.d() && !this.f18513f;
    }

    @Override // io.grpc.internal.q
    public void e(int i10) {
        t().x(i10);
    }

    @Override // io.grpc.internal.q
    public void f(int i10) {
        this.f18509b.f(i10);
    }

    @Override // io.grpc.internal.q
    public void g(vi.t tVar) {
        vi.w0 w0Var = this.f18512e;
        w0.g<Long> gVar = q0.f19084d;
        w0Var.e(gVar);
        this.f18512e.o(gVar, Long.valueOf(Math.max(0L, tVar.q(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.q
    public final void j(boolean z10) {
        t().J(z10);
    }

    @Override // io.grpc.internal.q
    public final void k(vi.v vVar) {
        t().I(vVar);
    }

    @Override // io.grpc.internal.q
    public final void m(w0 w0Var) {
        w0Var.b("remote_addr", getAttributes().b(vi.a0.f29029a));
    }

    @Override // io.grpc.internal.q
    public final void n() {
        if (t().G()) {
            return;
        }
        t().L();
        q();
    }

    @Override // io.grpc.internal.q
    public final void o(r rVar) {
        t().K(rVar);
        if (this.f18511d) {
            return;
        }
        u().e(this.f18512e, null);
        this.f18512e = null;
    }

    @Override // io.grpc.internal.l1.d
    public final void p(o2 o2Var, boolean z10, boolean z11, int i10) {
        eb.o.e(o2Var != null || z10, "null frame before EOS");
        u().d(o2Var, z10, z11, i10);
    }

    @Override // io.grpc.internal.d
    protected final o0 r() {
        return this.f18509b;
    }

    protected abstract b u();

    /* JADX INFO: Access modifiers changed from: protected */
    public n2 w() {
        return this.f18508a;
    }

    public final boolean x() {
        return this.f18510c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.d
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract c t();
}
