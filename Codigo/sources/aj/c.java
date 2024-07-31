package aj;

import eb.i;
import eb.o;
import eb.u;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.c;
import vi.g;
import vi.g1;
import vi.h1;
import vi.i1;
import vi.w0;
import vi.x0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f457a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static boolean f458b;

    /* renamed from: c, reason: collision with root package name */
    static final c.C0470c<d> f459c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class b<RespT> extends com.google.common.util.concurrent.a<RespT> {

        /* renamed from: s, reason: collision with root package name */
        private final g<?, RespT> f460s;

        b(g<?, RespT> gVar) {
            this.f460s = gVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.a
        public boolean A(RespT respt) {
            return super.A(respt);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.a
        public boolean B(Throwable th2) {
            return super.B(th2);
        }

        @Override // com.google.common.util.concurrent.a
        protected void w() {
            this.f460s.a("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.a
        protected String x() {
            return i.c(this).d("clientCall", this.f460s).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aj.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0009c<T> extends g.a<T> {
        private AbstractC0009c() {
        }

        abstract void e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum d {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class e extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* renamed from: b, reason: collision with root package name */
        private static final Logger f461b = Logger.getLogger(e.class.getName());

        /* renamed from: c, reason: collision with root package name */
        private static final Object f462c = new Object();

        /* renamed from: a, reason: collision with root package name */
        private volatile Object f463a;

        e() {
        }

        private static void c(Runnable runnable) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                f461b.log(Level.WARNING, "Runnable threw exception", th2);
            }
        }

        private static void d() {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f463a;
            if (obj != f462c) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && c.f458b) {
                throw new RejectedExecutionException();
            }
        }

        public void f() {
            Runnable poll;
            d();
            Runnable poll2 = poll();
            if (poll2 == null) {
                this.f463a = Thread.currentThread();
                while (true) {
                    try {
                        poll = poll();
                        if (poll != null) {
                            break;
                        }
                        LockSupport.park(this);
                        d();
                    } catch (Throwable th2) {
                        this.f463a = null;
                        throw th2;
                    }
                }
                this.f463a = null;
                poll2 = poll;
            }
            do {
                c(poll2);
                poll2 = poll();
            } while (poll2 != null);
        }

        public void shutdown() {
            this.f463a = f462c;
            while (true) {
                Runnable poll = poll();
                if (poll == null) {
                    return;
                } else {
                    c(poll);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class f<RespT> extends AbstractC0009c<RespT> {

        /* renamed from: a, reason: collision with root package name */
        private final b<RespT> f464a;

        /* renamed from: b, reason: collision with root package name */
        private RespT f465b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f466c;

        f(b<RespT> bVar) {
            super();
            this.f466c = false;
            this.f464a = bVar;
        }

        @Override // vi.g.a
        public void a(g1 g1Var, w0 w0Var) {
            if (!g1Var.p()) {
                this.f464a.B(g1Var.e(w0Var));
                return;
            }
            if (!this.f466c) {
                this.f464a.B(g1.f29114t.r("No value received for unary call").e(w0Var));
            }
            this.f464a.A(this.f465b);
        }

        @Override // vi.g.a
        public void b(w0 w0Var) {
        }

        @Override // vi.g.a
        public void c(RespT respt) {
            if (this.f466c) {
                throw g1.f29114t.r("More than one value received for unary call").d();
            }
            this.f465b = respt;
            this.f466c = true;
        }

        @Override // aj.c.AbstractC0009c
        void e() {
            ((b) this.f464a).f460s.c(2);
        }
    }

    static {
        f458b = !u.b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f459c = c.C0470c.b("internal-stub-type");
    }

    private c() {
    }

    private static <ReqT, RespT> void a(g<ReqT, RespT> gVar, ReqT reqt, AbstractC0009c<RespT> abstractC0009c) {
        f(gVar, abstractC0009c);
        try {
            gVar.d(reqt);
            gVar.b();
        } catch (Error e10) {
            throw c(gVar, e10);
        } catch (RuntimeException e11) {
            throw c(gVar, e11);
        }
    }

    public static <ReqT, RespT> RespT b(vi.d dVar, x0<ReqT, RespT> x0Var, vi.c cVar, ReqT reqt) {
        e eVar = new e();
        g h10 = dVar.h(x0Var, cVar.q(f459c, d.BLOCKING).n(eVar));
        boolean z10 = false;
        try {
            try {
                com.google.common.util.concurrent.f d10 = d(h10, reqt);
                while (!d10.isDone()) {
                    try {
                        eVar.f();
                    } catch (InterruptedException e10) {
                        try {
                            h10.a("Thread interrupted", e10);
                            z10 = true;
                        } catch (Error e11) {
                            e = e11;
                            throw c(h10, e);
                        } catch (RuntimeException e12) {
                            e = e12;
                            throw c(h10, e);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                }
                eVar.shutdown();
                RespT respt = (RespT) e(d10);
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                return respt;
            } catch (Error e13) {
                e = e13;
            } catch (RuntimeException e14) {
                e = e14;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static RuntimeException c(g<?, ?> gVar, Throwable th2) {
        try {
            gVar.a(null, th2);
        } catch (Throwable th3) {
            f457a.log(Level.SEVERE, "RuntimeException encountered while closing call", th3);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new AssertionError(th2);
    }

    public static <ReqT, RespT> com.google.common.util.concurrent.f<RespT> d(g<ReqT, RespT> gVar, ReqT reqt) {
        b bVar = new b(gVar);
        a(gVar, reqt, new f(bVar));
        return bVar;
    }

    private static <V> V e(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw g1.f29101g.r("Thread interrupted").q(e10).d();
        } catch (ExecutionException e11) {
            throw g(e11.getCause());
        }
    }

    private static <ReqT, RespT> void f(g<ReqT, RespT> gVar, AbstractC0009c<RespT> abstractC0009c) {
        gVar.e(abstractC0009c, new w0());
        abstractC0009c.e();
    }

    private static i1 g(Throwable th2) {
        for (Throwable th3 = (Throwable) o.p(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof h1) {
                h1 h1Var = (h1) th3;
                return new i1(h1Var.a(), h1Var.b());
            }
            if (th3 instanceof i1) {
                i1 i1Var = (i1) th3;
                return new i1(i1Var.a(), i1Var.b());
            }
        }
        return g1.f29102h.r("unexpected exception").q(th2).d();
    }
}
