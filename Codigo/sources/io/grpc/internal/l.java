package io.grpc.internal;

import com.google.android.gms.common.api.a;
import io.grpc.internal.m1;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import vi.b;

/* loaded from: classes3.dex */
final class l implements t {

    /* renamed from: a, reason: collision with root package name */
    private final t f18946a;

    /* renamed from: b, reason: collision with root package name */
    private final vi.b f18947b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f18948c;

    /* loaded from: classes3.dex */
    private class a extends j0 {

        /* renamed from: a, reason: collision with root package name */
        private final v f18949a;

        /* renamed from: b, reason: collision with root package name */
        private final String f18950b;

        /* renamed from: d, reason: collision with root package name */
        private volatile vi.g1 f18952d;

        /* renamed from: e, reason: collision with root package name */
        private vi.g1 f18953e;

        /* renamed from: f, reason: collision with root package name */
        private vi.g1 f18954f;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f18951c = new AtomicInteger(-2147483647);

        /* renamed from: g, reason: collision with root package name */
        private final m1.a f18955g = new C0299a();

        /* renamed from: io.grpc.internal.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0299a implements m1.a {
            C0299a() {
            }

            @Override // io.grpc.internal.m1.a
            public void a() {
                if (a.this.f18951c.decrementAndGet() == 0) {
                    a.this.j();
                }
            }
        }

        /* loaded from: classes3.dex */
        class b extends b.AbstractC0469b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ vi.x0 f18958a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ vi.c f18959b;

            b(vi.x0 x0Var, vi.c cVar) {
                this.f18958a = x0Var;
                this.f18959b = cVar;
            }
        }

        a(v vVar, String str) {
            this.f18949a = (v) eb.o.p(vVar, "delegate");
            this.f18950b = (String) eb.o.p(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            synchronized (this) {
                if (this.f18951c.get() != 0) {
                    return;
                }
                vi.g1 g1Var = this.f18953e;
                vi.g1 g1Var2 = this.f18954f;
                this.f18953e = null;
                this.f18954f = null;
                if (g1Var != null) {
                    super.d(g1Var);
                }
                if (g1Var2 != null) {
                    super.b(g1Var2);
                }
            }
        }

        @Override // io.grpc.internal.j0
        protected v a() {
            return this.f18949a;
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.j1
        public void b(vi.g1 g1Var) {
            eb.o.p(g1Var, "status");
            synchronized (this) {
                if (this.f18951c.get() < 0) {
                    this.f18952d = g1Var;
                    this.f18951c.addAndGet(a.e.API_PRIORITY_OTHER);
                } else if (this.f18954f != null) {
                    return;
                }
                if (this.f18951c.get() != 0) {
                    this.f18954f = g1Var;
                } else {
                    super.b(g1Var);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [vi.b] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        @Override // io.grpc.internal.j0, io.grpc.internal.s
        public q c(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, vi.k[] kVarArr) {
            vi.j0 mVar;
            vi.b c10 = cVar.c();
            if (c10 == null) {
                mVar = l.this.f18947b;
            } else {
                mVar = c10;
                if (l.this.f18947b != null) {
                    mVar = new vi.m(l.this.f18947b, c10);
                }
            }
            if (mVar == 0) {
                return this.f18951c.get() >= 0 ? new f0(this.f18952d, kVarArr) : this.f18949a.c(x0Var, w0Var, cVar, kVarArr);
            }
            m1 m1Var = new m1(this.f18949a, x0Var, w0Var, cVar, this.f18955g, kVarArr);
            if (this.f18951c.incrementAndGet() > 0) {
                this.f18955g.a();
                return new f0(this.f18952d, kVarArr);
            }
            try {
                mVar.a(new b(x0Var, cVar), ((mVar instanceof vi.j0) && mVar.a() && cVar.e() != null) ? cVar.e() : l.this.f18948c, m1Var);
            } catch (Throwable th2) {
                m1Var.a(vi.g1.f29108n.r("Credentials should use fail() instead of throwing exceptions").q(th2));
            }
            return m1Var.c();
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.j1
        public void d(vi.g1 g1Var) {
            eb.o.p(g1Var, "status");
            synchronized (this) {
                if (this.f18951c.get() < 0) {
                    this.f18952d = g1Var;
                    this.f18951c.addAndGet(a.e.API_PRIORITY_OTHER);
                    if (this.f18951c.get() != 0) {
                        this.f18953e = g1Var;
                    } else {
                        super.d(g1Var);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(t tVar, vi.b bVar, Executor executor) {
        this.f18946a = (t) eb.o.p(tVar, "delegate");
        this.f18947b = bVar;
        this.f18948c = (Executor) eb.o.p(executor, "appExecutor");
    }

    @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f18946a.close();
    }

    @Override // io.grpc.internal.t
    public v h1(SocketAddress socketAddress, t.a aVar, vi.f fVar) {
        return new a(this.f18946a.h1(socketAddress, aVar, fVar), aVar.a());
    }

    @Override // io.grpc.internal.t
    public ScheduledExecutorService l0() {
        return this.f18946a.l0();
    }
}
