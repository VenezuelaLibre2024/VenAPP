package io.grpc.internal;

import io.grpc.internal.AbstractC8837d;
import io.grpc.internal.C8871l1;
import io.grpc.internal.InterfaceC8892r;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7159o;
import p103fb.C7324b;
import vi.C11896a0;
import vi.C11901c;
import vi.C11915g1;
import vi.C11946t;
import vi.C11950v;
import vi.C11953w0;
import vi.InterfaceC11934n;

/* renamed from: io.grpc.internal.a */
/* loaded from: classes3.dex */
public abstract class AbstractC8825a extends AbstractC8837d implements InterfaceC8889q, C8871l1.d {

    /* renamed from: g */
    private static final Logger f20201g = Logger.getLogger(AbstractC8825a.class.getName());

    /* renamed from: a */
    private final C8880n2 f20202a;

    /* renamed from: b */
    private final InterfaceC8882o0 f20203b;

    /* renamed from: c */
    private boolean f20204c;

    /* renamed from: d */
    private boolean f20205d;

    /* renamed from: e */
    private C11953w0 f20206e;

    /* renamed from: f */
    private volatile boolean f20207f;

    /* renamed from: io.grpc.internal.a$a */
    /* loaded from: classes3.dex */
    private class a implements InterfaceC8882o0 {

        /* renamed from: a */
        private C11953w0 f20208a;

        /* renamed from: b */
        private boolean f20209b;

        /* renamed from: c */
        private final C8856h2 f20210c;

        /* renamed from: d */
        private byte[] f20211d;

        public a(C11953w0 c11953w0, C8856h2 c8856h2) {
            this.f20208a = (C11953w0) C7159o.m21313p(c11953w0, "headers");
            this.f20210c = (C8856h2) C7159o.m21313p(c8856h2, "statsTraceCtx");
        }

        @Override // io.grpc.internal.InterfaceC8882o0
        /* renamed from: a */
        public InterfaceC8882o0 mo25211a(InterfaceC11934n interfaceC11934n) {
            return this;
        }

        @Override // io.grpc.internal.InterfaceC8882o0
        /* renamed from: b */
        public void mo25212b(InputStream inputStream) {
            C7159o.m21319v(this.f20211d == null, "writePayload should not be called multiple times");
            try {
                this.f20211d = C7324b.m21978d(inputStream);
                this.f20210c.m25599i(0);
                C8856h2 c8856h2 = this.f20210c;
                byte[] bArr = this.f20211d;
                c8856h2.m25600j(0, bArr.length, bArr.length);
                this.f20210c.m25601k(this.f20211d.length);
                this.f20210c.m25602l(this.f20211d.length);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // io.grpc.internal.InterfaceC8882o0
        public void close() {
            this.f20209b = true;
            C7159o.m21319v(this.f20211d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC8825a.this.mo25207u().mo25216e(this.f20208a, this.f20211d);
            this.f20211d = null;
            this.f20208a = null;
        }

        @Override // io.grpc.internal.InterfaceC8882o0
        /* renamed from: f */
        public void mo25213f(int i10) {
        }

        @Override // io.grpc.internal.InterfaceC8882o0
        public void flush() {
        }

        @Override // io.grpc.internal.InterfaceC8882o0
        public boolean isClosed() {
            return this.f20209b;
        }
    }

    /* renamed from: io.grpc.internal.a$b */
    /* loaded from: classes3.dex */
    protected interface b {
        /* renamed from: c */
        void mo25214c(C11915g1 c11915g1);

        /* renamed from: d */
        void mo25215d(InterfaceC8884o2 interfaceC8884o2, boolean z10, boolean z11, int i10);

        /* renamed from: e */
        void mo25216e(C11953w0 c11953w0, byte[] bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: io.grpc.internal.a$c */
    /* loaded from: classes3.dex */
    public static abstract class c extends AbstractC8837d.a {

        /* renamed from: i */
        private final C8856h2 f20213i;

        /* renamed from: j */
        private boolean f20214j;

        /* renamed from: k */
        private InterfaceC8892r f20215k;

        /* renamed from: l */
        private boolean f20216l;

        /* renamed from: m */
        private C11950v f20217m;

        /* renamed from: n */
        private boolean f20218n;

        /* renamed from: o */
        private Runnable f20219o;

        /* renamed from: p */
        private volatile boolean f20220p;

        /* renamed from: q */
        private boolean f20221q;

        /* renamed from: r */
        private boolean f20222r;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.a$c$a */
        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11915g1 f20223a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC8892r.a f20224b;

            /* renamed from: c */
            final /* synthetic */ C11953w0 f20225c;

            a(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
                this.f20223a = c11915g1;
                this.f20224b = aVar;
                this.f20225c = c11953w0;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.m25219C(this.f20223a, this.f20224b, this.f20225c);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public c(int i10, C8856h2 c8856h2, C8880n2 c8880n2) {
            super(i10, c8856h2, c8880n2);
            this.f20217m = C11950v.m38278c();
            this.f20218n = false;
            this.f20213i = (C8856h2) C7159o.m21313p(c8856h2, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: C */
        public void m25219C(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
            if (this.f20214j) {
                return;
            }
            this.f20214j = true;
            this.f20213i.m25603m(c11915g1);
            mo25234o().mo25293d(c11915g1, aVar, c11953w0);
            if (m25378m() != null) {
                m25378m().m25694f(c11915g1.m38145p());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: I */
        public void m25220I(C11950v c11950v) {
            C7159o.m21319v(this.f20215k == null, "Already called start");
            this.f20217m = (C11950v) C7159o.m21313p(c11950v, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J */
        public void m25221J(boolean z10) {
            this.f20216l = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: L */
        public final void m25222L() {
            this.f20220p = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: D */
        public void m25225D(InterfaceC8903u1 interfaceC8903u1) {
            C7159o.m21313p(interfaceC8903u1, "frame");
            boolean z10 = true;
            try {
                if (this.f20221q) {
                    AbstractC8825a.f20201g.log(Level.INFO, "Received data on closed stream");
                    interfaceC8903u1.close();
                    return;
                }
                try {
                    m25377l(interfaceC8903u1);
                } catch (Throwable th2) {
                    th = th2;
                    z10 = false;
                    if (z10) {
                        interfaceC8903u1.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m25226E(vi.C11953w0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f20221q
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                p082eb.C7159o.m21319v(r0, r2)
                io.grpc.internal.h2 r0 = r5.f20213i
                r0.m25592a()
                vi.w0$g<java.lang.String> r0 = io.grpc.internal.C8890q0.f20834g
                java.lang.Object r0 = r6.m38310g(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f20216l
                r3 = 0
                if (r2 == 0) goto L4f
                if (r0 == 0) goto L4f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L2f
                io.grpc.internal.r0 r0 = new io.grpc.internal.r0
                r0.<init>()
                r5.m25383w(r0)
                r0 = r1
                goto L50
            L2f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L4f
                vi.g1 r6 = vi.C11915g1.f31548t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                vi.g1 r6 = r6.m38147r(r0)
                vi.i1 r6 = r6.m38139d()
                r5.mo25572d(r6)
                return
            L4f:
                r0 = r3
            L50:
                vi.w0$g<java.lang.String> r2 = io.grpc.internal.C8890q0.f20832e
                java.lang.Object r2 = r6.m38310g(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L93
                vi.v r4 = r5.f20217m
                vi.u r4 = r4.m38281e(r2)
                if (r4 != 0) goto L7a
                vi.g1 r6 = vi.C11915g1.f31548t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                vi.g1 r6 = r6.m38147r(r0)
                vi.i1 r6 = r6.m38139d()
                r5.mo25572d(r6)
                return
            L7a:
                vi.l r1 = vi.InterfaceC11928l.b.f31595a
                if (r4 == r1) goto L93
                if (r0 == 0) goto L90
                vi.g1 r6 = vi.C11915g1.f31548t
                java.lang.String r0 = "Full stream and gRPC message encoding cannot both be set"
                vi.g1 r6 = r6.m38147r(r0)
                vi.i1 r6 = r6.m38139d()
                r5.mo25572d(r6)
                return
            L90:
                r5.m25382v(r4)
            L93:
                io.grpc.internal.r r0 = r5.mo25234o()
                r0.mo25291b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.AbstractC8825a.c.m25226E(vi.w0):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: F */
        public void m25227F(C11953w0 c11953w0, C11915g1 c11915g1) {
            C7159o.m21313p(c11915g1, "status");
            C7159o.m21313p(c11953w0, "trailers");
            if (this.f20221q) {
                AbstractC8825a.f20201g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c11915g1, c11953w0});
            } else {
                this.f20213i.m25593b(c11953w0);
                m25232N(c11915g1, false, c11953w0);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: G */
        public final boolean m25228G() {
            return this.f20220p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.AbstractC8837d.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8892r mo25234o() {
            return this.f20215k;
        }

        /* renamed from: K */
        public final void m25230K(InterfaceC8892r interfaceC8892r) {
            C7159o.m21319v(this.f20215k == null, "Already called setListener");
            this.f20215k = (InterfaceC8892r) C7159o.m21313p(interfaceC8892r, "listener");
        }

        /* renamed from: M */
        public final void m25231M(C11915g1 c11915g1, InterfaceC8892r.a aVar, boolean z10, C11953w0 c11953w0) {
            C7159o.m21313p(c11915g1, "status");
            C7159o.m21313p(c11953w0, "trailers");
            if (!this.f20221q || z10) {
                this.f20221q = true;
                this.f20222r = c11915g1.m38145p();
                m25380s();
                if (this.f20218n) {
                    this.f20219o = null;
                    m25219C(c11915g1, aVar, c11953w0);
                } else {
                    this.f20219o = new a(c11915g1, aVar, c11953w0);
                    m25376k(z10);
                }
            }
        }

        /* renamed from: N */
        public final void m25232N(C11915g1 c11915g1, boolean z10, C11953w0 c11953w0) {
            m25231M(c11915g1, InterfaceC8892r.a.PROCESSED, z10, c11953w0);
        }

        @Override // io.grpc.internal.C8867k1.b
        /* renamed from: e */
        public void mo25233e(boolean z10) {
            C7159o.m21319v(this.f20221q, "status should have been reported on deframer closed");
            this.f20218n = true;
            if (this.f20222r && z10) {
                m25232N(C11915g1.f31548t.m38147r("Encountered end-of-stream mid-frame"), true, new C11953w0());
            }
            Runnable runnable = this.f20219o;
            if (runnable != null) {
                runnable.run();
                this.f20219o = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC8825a(InterfaceC8888p2 interfaceC8888p2, C8856h2 c8856h2, C8880n2 c8880n2, C11953w0 c11953w0, C11901c c11901c, boolean z10) {
        C7159o.m21313p(c11953w0, "headers");
        this.f20202a = (C8880n2) C7159o.m21313p(c8880n2, "transportTracer");
        this.f20204c = C8890q0.m25758o(c11901c);
        this.f20205d = z10;
        if (z10) {
            this.f20203b = new a(c11953w0, c8856h2);
        } else {
            this.f20203b = new C8871l1(this, interfaceC8888p2, c8856h2);
            this.f20206e = c11953w0;
        }
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: c */
    public final void mo25194c(C11915g1 c11915g1) {
        C7159o.m21302e(!c11915g1.m38145p(), "Should not cancel with OK status");
        this.f20207f = true;
        mo25207u().mo25214c(c11915g1);
    }

    @Override // io.grpc.internal.AbstractC8837d, io.grpc.internal.InterfaceC8860i2
    /* renamed from: d */
    public final boolean mo25195d() {
        return super.mo25195d() && !this.f20207f;
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: e */
    public void mo25196e(int i10) {
        mo25206t().m25384x(i10);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: f */
    public void mo25197f(int i10) {
        this.f20203b.mo25213f(i10);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: g */
    public void mo25198g(C11946t c11946t) {
        C11953w0 c11953w0 = this.f20206e;
        C11953w0.g<Long> gVar = C8890q0.f20831d;
        c11953w0.m38309e(gVar);
        this.f20206e.m38313o(gVar, Long.valueOf(Math.max(0L, c11946t.m38270q(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: j */
    public final void mo25199j(boolean z10) {
        mo25206t().m25221J(z10);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: k */
    public final void mo25200k(C11950v c11950v) {
        mo25206t().m25220I(c11950v);
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: m */
    public final void mo25201m(C8908w0 c8908w0) {
        c8908w0.m25876b("remote_addr", getAttributes().m38048b(C11896a0.f31463a));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: n */
    public final void mo25202n() {
        if (mo25206t().m25228G()) {
            return;
        }
        mo25206t().m25222L();
        m25364q();
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: o */
    public final void mo25203o(InterfaceC8892r interfaceC8892r) {
        mo25206t().m25230K(interfaceC8892r);
        if (this.f20205d) {
            return;
        }
        mo25207u().mo25216e(this.f20206e, null);
        this.f20206e = null;
    }

    @Override // io.grpc.internal.C8871l1.d
    /* renamed from: p */
    public final void mo25204p(InterfaceC8884o2 interfaceC8884o2, boolean z10, boolean z11, int i10) {
        C7159o.m21302e(interfaceC8884o2 != null || z10, "null frame before EOS");
        mo25207u().mo25215d(interfaceC8884o2, z10, z11, i10);
    }

    @Override // io.grpc.internal.AbstractC8837d
    /* renamed from: r */
    protected final InterfaceC8882o0 mo25205r() {
        return this.f20203b;
    }

    /* renamed from: u */
    protected abstract b mo25207u();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public C8880n2 m25208w() {
        return this.f20202a;
    }

    /* renamed from: x */
    public final boolean m25209x() {
        return this.f20204c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.AbstractC8837d
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public abstract c mo25206t();
}
