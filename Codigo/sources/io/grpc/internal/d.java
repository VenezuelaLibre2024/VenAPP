package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.f;
import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.InputStream;
import vi.l;

/* loaded from: classes3.dex */
public abstract class d implements i2 {

    /* loaded from: classes3.dex */
    public static abstract class a implements f.h, k1.b {

        /* renamed from: a, reason: collision with root package name */
        private y f18670a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f18671b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final h2 f18672c;

        /* renamed from: d, reason: collision with root package name */
        private final n2 f18673d;

        /* renamed from: e, reason: collision with root package name */
        private final k1 f18674e;

        /* renamed from: f, reason: collision with root package name */
        private int f18675f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f18676g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f18677h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0297a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ cj.b f18678a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f18679b;

            RunnableC0297a(cj.b bVar, int i10) {
                this.f18678a = bVar;
                this.f18679b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                cj.c.f("AbstractStream.request");
                cj.c.d(this.f18678a);
                try {
                    a.this.f18670a.b(this.f18679b);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i10, h2 h2Var, n2 n2Var) {
            this.f18672c = (h2) eb.o.p(h2Var, "statsTraceCtx");
            this.f18673d = (n2) eb.o.p(n2Var, "transportTracer");
            k1 k1Var = new k1(this, l.b.f29160a, i10, h2Var, n2Var);
            this.f18674e = k1Var;
            this.f18670a = k1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean n() {
            boolean z10;
            synchronized (this.f18671b) {
                z10 = this.f18676g && this.f18675f < 32768 && !this.f18677h;
            }
            return z10;
        }

        private void p() {
            boolean n10;
            synchronized (this.f18671b) {
                n10 = n();
            }
            if (n10) {
                o().c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(int i10) {
            synchronized (this.f18671b) {
                this.f18675f += i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(int i10) {
            f(new RunnableC0297a(cj.c.e(), i10));
        }

        @Override // io.grpc.internal.k1.b
        public void a(j2.a aVar) {
            o().a(aVar);
        }

        public final void b(int i10) {
            boolean z10;
            synchronized (this.f18671b) {
                eb.o.v(this.f18676g, "onStreamAllocated was not called, but it seems the stream is active");
                int i11 = this.f18675f;
                z10 = true;
                boolean z11 = i11 < 32768;
                int i12 = i11 - i10;
                this.f18675f = i12;
                boolean z12 = i12 < 32768;
                if (z11 || !z12) {
                    z10 = false;
                }
            }
            if (z10) {
                p();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void k(boolean z10) {
            if (z10) {
                this.f18670a.close();
            } else {
                this.f18670a.i();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void l(u1 u1Var) {
            try {
                this.f18670a.f(u1Var);
            } catch (Throwable th2) {
                d(th2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public n2 m() {
            return this.f18673d;
        }

        protected abstract j2 o();

        /* JADX INFO: Access modifiers changed from: protected */
        public void r() {
            eb.o.u(o() != null);
            synchronized (this.f18671b) {
                eb.o.v(this.f18676g ? false : true, "Already allocated");
                this.f18676g = true;
            }
            p();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void s() {
            synchronized (this.f18671b) {
                this.f18677h = true;
            }
        }

        final void t() {
            this.f18674e.E(this);
            this.f18670a = this.f18674e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void v(vi.u uVar) {
            this.f18670a.g(uVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void w(r0 r0Var) {
            this.f18674e.B(r0Var);
            this.f18670a = new f(this, this, this.f18674e);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void x(int i10) {
            this.f18670a.e(i10);
        }
    }

    @Override // io.grpc.internal.i2
    public final void a(vi.n nVar) {
        r().a((vi.n) eb.o.p(nVar, "compressor"));
    }

    @Override // io.grpc.internal.i2
    public final void b(int i10) {
        t().u(i10);
    }

    @Override // io.grpc.internal.i2
    public boolean d() {
        return t().n();
    }

    @Override // io.grpc.internal.i2
    public final void flush() {
        if (r().isClosed()) {
            return;
        }
        r().flush();
    }

    @Override // io.grpc.internal.i2
    public final void h(InputStream inputStream) {
        eb.o.p(inputStream, Constants.MESSAGE);
        try {
            if (!r().isClosed()) {
                r().b(inputStream);
            }
        } finally {
            q0.e(inputStream);
        }
    }

    @Override // io.grpc.internal.i2
    public void i() {
        t().t();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q() {
        r().close();
    }

    protected abstract o0 r();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(int i10) {
        t().q(i10);
    }

    protected abstract a t();
}
