package io.grpc.internal;

import vi.b;

/* loaded from: classes3.dex */
final class m1 extends b.a {

    /* renamed from: a, reason: collision with root package name */
    private final s f18988a;

    /* renamed from: b, reason: collision with root package name */
    private final vi.x0<?, ?> f18989b;

    /* renamed from: c, reason: collision with root package name */
    private final vi.w0 f18990c;

    /* renamed from: d, reason: collision with root package name */
    private final vi.c f18991d;

    /* renamed from: f, reason: collision with root package name */
    private final a f18993f;

    /* renamed from: g, reason: collision with root package name */
    private final vi.k[] f18994g;

    /* renamed from: i, reason: collision with root package name */
    private q f18996i;

    /* renamed from: j, reason: collision with root package name */
    boolean f18997j;

    /* renamed from: k, reason: collision with root package name */
    b0 f18998k;

    /* renamed from: h, reason: collision with root package name */
    private final Object f18995h = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final vi.r f18992e = vi.r.e();

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m1(s sVar, vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, a aVar, vi.k[] kVarArr) {
        this.f18988a = sVar;
        this.f18989b = x0Var;
        this.f18990c = w0Var;
        this.f18991d = cVar;
        this.f18993f = aVar;
        this.f18994g = kVarArr;
    }

    private void b(q qVar) {
        boolean z10;
        eb.o.v(!this.f18997j, "already finalized");
        this.f18997j = true;
        synchronized (this.f18995h) {
            if (this.f18996i == null) {
                this.f18996i = qVar;
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (!z10) {
            eb.o.v(this.f18998k != null, "delayedStream is null");
            Runnable w10 = this.f18998k.w(qVar);
            if (w10 != null) {
                w10.run();
            }
        }
        this.f18993f.a();
    }

    public void a(vi.g1 g1Var) {
        eb.o.e(!g1Var.p(), "Cannot fail with OK status");
        eb.o.v(!this.f18997j, "apply() or fail() already called");
        b(new f0(q0.n(g1Var), this.f18994g));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q c() {
        synchronized (this.f18995h) {
            q qVar = this.f18996i;
            if (qVar != null) {
                return qVar;
            }
            b0 b0Var = new b0();
            this.f18998k = b0Var;
            this.f18996i = b0Var;
            return b0Var;
        }
    }
}
