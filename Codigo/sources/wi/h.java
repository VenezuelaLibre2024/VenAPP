package wi;

import io.grpc.internal.a;
import io.grpc.internal.h2;
import io.grpc.internal.n2;
import io.grpc.internal.o2;
import io.grpc.internal.r;
import io.grpc.internal.t0;
import java.util.List;
import vi.g1;
import vi.w0;
import vi.x0;
import wi.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class h extends io.grpc.internal.a {

    /* renamed from: p, reason: collision with root package name */
    private static final dm.b f30084p = new dm.b();

    /* renamed from: h, reason: collision with root package name */
    private final x0<?, ?> f30085h;

    /* renamed from: i, reason: collision with root package name */
    private final String f30086i;

    /* renamed from: j, reason: collision with root package name */
    private final h2 f30087j;

    /* renamed from: k, reason: collision with root package name */
    private String f30088k;

    /* renamed from: l, reason: collision with root package name */
    private final b f30089l;

    /* renamed from: m, reason: collision with root package name */
    private final a f30090m;

    /* renamed from: n, reason: collision with root package name */
    private final vi.a f30091n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f30092o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements a.b {
        a() {
        }

        @Override // io.grpc.internal.a.b
        public void c(g1 g1Var) {
            cj.c.f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (h.this.f30089l.f30095z) {
                    h.this.f30089l.a0(g1Var, true, null);
                }
            } finally {
                cj.c.h("OkHttpClientStream$Sink.cancel");
            }
        }

        @Override // io.grpc.internal.a.b
        public void d(o2 o2Var, boolean z10, boolean z11, int i10) {
            dm.b c10;
            cj.c.f("OkHttpClientStream$Sink.writeFrame");
            if (o2Var == null) {
                c10 = h.f30084p;
            } else {
                c10 = ((o) o2Var).c();
                int size = (int) c10.size();
                if (size > 0) {
                    h.this.s(size);
                }
            }
            try {
                synchronized (h.this.f30089l.f30095z) {
                    h.this.f30089l.e0(c10, z10, z11);
                    h.this.w().e(i10);
                }
            } finally {
                cj.c.h("OkHttpClientStream$Sink.writeFrame");
            }
        }

        @Override // io.grpc.internal.a.b
        public void e(w0 w0Var, byte[] bArr) {
            cj.c.f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + h.this.f30085h.c();
            if (bArr != null) {
                h.this.f30092o = true;
                str = str + "?" + fb.a.b().f(bArr);
            }
            try {
                synchronized (h.this.f30089l.f30095z) {
                    h.this.f30089l.g0(w0Var, str);
                }
            } finally {
                cj.c.h("OkHttpClientStream$Sink.writeHeaders");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends t0 implements q.b {
        private List<xi.d> A;
        private dm.b B;
        private boolean C;
        private boolean D;
        private boolean E;
        private int F;
        private int G;
        private final wi.b H;
        private final q I;
        private final i J;
        private boolean K;
        private final cj.d L;
        private q.c M;
        private int N;

        /* renamed from: y, reason: collision with root package name */
        private final int f30094y;

        /* renamed from: z, reason: collision with root package name */
        private final Object f30095z;

        public b(int i10, h2 h2Var, Object obj, wi.b bVar, q qVar, i iVar, int i11, String str) {
            super(i10, h2Var, h.this.w());
            this.B = new dm.b();
            this.C = false;
            this.D = false;
            this.E = false;
            this.K = true;
            this.N = -1;
            this.f30095z = eb.o.p(obj, "lock");
            this.H = bVar;
            this.I = qVar;
            this.J = iVar;
            this.F = i11;
            this.G = i11;
            this.f30094y = i11;
            this.L = cj.c.a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(g1 g1Var, boolean z10, w0 w0Var) {
            if (this.E) {
                return;
            }
            this.E = true;
            if (!this.K) {
                this.J.U(c0(), g1Var, r.a.PROCESSED, z10, xi.a.CANCEL, w0Var);
                return;
            }
            this.J.h0(h.this);
            this.A = null;
            this.B.b();
            this.K = false;
            if (w0Var == null) {
                w0Var = new w0();
            }
            N(g1Var, true, w0Var);
        }

        private void d0() {
            if (G()) {
                this.J.U(c0(), null, r.a.PROCESSED, false, null, null);
            } else {
                this.J.U(c0(), null, r.a.PROCESSED, false, xi.a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(dm.b bVar, boolean z10, boolean z11) {
            if (this.E) {
                return;
            }
            if (!this.K) {
                eb.o.v(c0() != -1, "streamId should be set");
                this.I.d(z10, this.M, bVar, z11);
            } else {
                this.B.K0(bVar, (int) bVar.size());
                this.C |= z10;
                this.D |= z11;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(w0 w0Var, String str) {
            this.A = d.b(w0Var, str, h.this.f30088k, h.this.f30086i, h.this.f30092o, this.J.b0());
            this.J.o0(h.this);
        }

        @Override // io.grpc.internal.t0
        protected void P(g1 g1Var, boolean z10, w0 w0Var) {
            a0(g1Var, z10, w0Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public q.c b0() {
            q.c cVar;
            synchronized (this.f30095z) {
                cVar = this.M;
            }
            return cVar;
        }

        @Override // io.grpc.internal.k1.b
        public void c(int i10) {
            int i11 = this.G - i10;
            this.G = i11;
            float f10 = i11;
            int i12 = this.f30094y;
            if (f10 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.F += i13;
                this.G = i11 + i13;
                this.H.d(c0(), i13);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int c0() {
            return this.N;
        }

        @Override // io.grpc.internal.k1.b
        public void d(Throwable th2) {
            P(g1.l(th2), true, new w0());
        }

        @Override // io.grpc.internal.t0, io.grpc.internal.a.c, io.grpc.internal.k1.b
        public void e(boolean z10) {
            d0();
            super.e(z10);
        }

        @Override // io.grpc.internal.g.d
        public void f(Runnable runnable) {
            synchronized (this.f30095z) {
                runnable.run();
            }
        }

        public void f0(int i10) {
            eb.o.x(this.N == -1, "the stream has been started with id %s", i10);
            this.N = i10;
            this.M = this.I.c(this, i10);
            h.this.f30089l.r();
            if (this.K) {
                this.H.r1(h.this.f30092o, false, this.N, 0, this.A);
                h.this.f30087j.c();
                this.A = null;
                if (this.B.size() > 0) {
                    this.I.d(this.C, this.M, this.B, this.D);
                }
                this.K = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public cj.d h0() {
            return this.L;
        }

        public void i0(dm.b bVar, boolean z10) {
            int size = this.F - ((int) bVar.size());
            this.F = size;
            if (size >= 0) {
                super.S(new l(bVar), z10);
            } else {
                this.H.s(c0(), xi.a.FLOW_CONTROL_ERROR);
                this.J.U(c0(), g1.f29114t.r("Received data size exceeded our receiving window size"), r.a.PROCESSED, false, null, null);
            }
        }

        public void j0(List<xi.d> list, boolean z10) {
            if (z10) {
                U(r.c(list));
            } else {
                T(r.a(list));
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        public void r() {
            super.r();
            m().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(x0<?, ?> x0Var, w0 w0Var, wi.b bVar, i iVar, q qVar, Object obj, int i10, int i11, String str, String str2, h2 h2Var, n2 n2Var, vi.c cVar, boolean z10) {
        super(new p(), h2Var, n2Var, w0Var, cVar, z10 && x0Var.f());
        this.f30090m = new a();
        this.f30092o = false;
        this.f30087j = (h2) eb.o.p(h2Var, "statsTraceCtx");
        this.f30085h = x0Var;
        this.f30088k = str;
        this.f30086i = str2;
        this.f30091n = iVar.V();
        this.f30089l = new b(i10, h2Var, obj, bVar, qVar, iVar, i11, x0Var.c());
    }

    public x0.d L() {
        return this.f30085h.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b t() {
        return this.f30089l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N() {
        return this.f30092o;
    }

    @Override // io.grpc.internal.q
    public vi.a getAttributes() {
        return this.f30091n;
    }

    @Override // io.grpc.internal.q
    public void l(String str) {
        this.f30088k = (String) eb.o.p(str, "authority");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public a u() {
        return this.f30090m;
    }
}
