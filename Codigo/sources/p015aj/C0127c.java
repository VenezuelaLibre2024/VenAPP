package p015aj;

import com.google.common.util.concurrent.AbstractC5915a;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p082eb.C7153i;
import p082eb.C7159o;
import p082eb.C7165u;
import vi.AbstractC11904d;
import vi.AbstractC11913g;
import vi.C11901c;
import vi.C11915g1;
import vi.C11918h1;
import vi.C11921i1;
import vi.C11953w0;
import vi.C11955x0;

/* renamed from: aj.c */
/* loaded from: classes3.dex */
public final class C0127c {

    /* renamed from: a */
    private static final Logger f522a = Logger.getLogger(C0127c.class.getName());

    /* renamed from: b */
    static boolean f523b;

    /* renamed from: c */
    static final C11901c.c<d> f524c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aj.c$b */
    /* loaded from: classes3.dex */
    public static final class b<RespT> extends AbstractC5915a<RespT> {

        /* renamed from: s */
        private final AbstractC11913g<?, RespT> f525s;

        b(AbstractC11913g<?, RespT> abstractC11913g) {
            this.f525s = abstractC11913g;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.AbstractC5915a
        /* renamed from: A */
        public boolean mo589A(RespT respt) {
            return super.mo589A(respt);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.AbstractC5915a
        /* renamed from: B */
        public boolean mo590B(Throwable th2) {
            return super.mo590B(th2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a
        /* renamed from: w */
        protected void mo591w() {
            this.f525s.mo25522a("GrpcFuture was cancelled", null);
        }

        @Override // com.google.common.util.concurrent.AbstractC5915a
        /* renamed from: x */
        protected String mo592x() {
            return C7153i.m21274c(this).m21284d("clientCall", this.f525s).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aj.c$c */
    /* loaded from: classes3.dex */
    public static abstract class c<T> extends AbstractC11913g.a<T> {
        private c() {
        }

        /* renamed from: e */
        abstract void mo593e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: aj.c$d */
    /* loaded from: classes3.dex */
    public enum d {
        BLOCKING,
        FUTURE,
        ASYNC
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aj.c$e */
    /* loaded from: classes3.dex */
    public static final class e extends ConcurrentLinkedQueue<Runnable> implements Executor {

        /* renamed from: b */
        private static final Logger f526b = Logger.getLogger(e.class.getName());

        /* renamed from: c */
        private static final Object f527c = new Object();

        /* renamed from: a */
        private volatile Object f528a;

        e() {
        }

        /* renamed from: c */
        private static void m594c(Runnable runnable) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                f526b.log(Level.WARNING, "Runnable threw exception", th2);
            }
        }

        /* renamed from: d */
        private static void m595d() {
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            add(runnable);
            Object obj = this.f528a;
            if (obj != f527c) {
                LockSupport.unpark((Thread) obj);
            } else if (remove(runnable) && C0127c.f523b) {
                throw new RejectedExecutionException();
            }
        }

        /* renamed from: f */
        public void m596f() {
            Runnable poll;
            m595d();
            Runnable poll2 = poll();
            if (poll2 == null) {
                this.f528a = Thread.currentThread();
                while (true) {
                    try {
                        poll = poll();
                        if (poll != null) {
                            break;
                        }
                        LockSupport.park(this);
                        m595d();
                    } catch (Throwable th2) {
                        this.f528a = null;
                        throw th2;
                    }
                }
                this.f528a = null;
                poll2 = poll;
            }
            do {
                m594c(poll2);
                poll2 = poll();
            } while (poll2 != null);
        }

        public void shutdown() {
            this.f528a = f527c;
            while (true) {
                Runnable poll = poll();
                if (poll == null) {
                    return;
                } else {
                    m594c(poll);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aj.c$f */
    /* loaded from: classes3.dex */
    public static final class f<RespT> extends c<RespT> {

        /* renamed from: a */
        private final b<RespT> f529a;

        /* renamed from: b */
        private RespT f530b;

        /* renamed from: c */
        private boolean f531c;

        f(b<RespT> bVar) {
            super();
            this.f531c = false;
            this.f529a = bVar;
        }

        @Override // vi.AbstractC11913g.a
        /* renamed from: a */
        public void mo597a(C11915g1 c11915g1, C11953w0 c11953w0) {
            if (!c11915g1.m38145p()) {
                this.f529a.mo590B(c11915g1.m38140e(c11953w0));
                return;
            }
            if (!this.f531c) {
                this.f529a.mo590B(C11915g1.f31548t.m38147r("No value received for unary call").m38140e(c11953w0));
            }
            this.f529a.mo589A(this.f530b);
        }

        @Override // vi.AbstractC11913g.a
        /* renamed from: b */
        public void mo598b(C11953w0 c11953w0) {
        }

        @Override // vi.AbstractC11913g.a
        /* renamed from: c */
        public void mo599c(RespT respt) {
            if (this.f531c) {
                throw C11915g1.f31548t.m38147r("More than one value received for unary call").m38139d();
            }
            this.f530b = respt;
            this.f531c = true;
        }

        @Override // p015aj.C0127c.c
        /* renamed from: e */
        void mo593e() {
            ((b) this.f529a).f525s.mo25524c(2);
        }
    }

    static {
        f523b = !C7165u.m21349b(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE")) && Boolean.parseBoolean(System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"));
        f524c = C11901c.c.m38100b("internal-stub-type");
    }

    private C0127c() {
    }

    /* renamed from: a */
    private static <ReqT, RespT> void m581a(AbstractC11913g<ReqT, RespT> abstractC11913g, ReqT reqt, c<RespT> cVar) {
        m586f(abstractC11913g, cVar);
        try {
            abstractC11913g.mo25525d(reqt);
            abstractC11913g.mo25523b();
        } catch (Error e10) {
            throw m583c(abstractC11913g, e10);
        } catch (RuntimeException e11) {
            throw m583c(abstractC11913g, e11);
        }
    }

    /* renamed from: b */
    public static <ReqT, RespT> RespT m582b(AbstractC11904d abstractC11904d, C11955x0<ReqT, RespT> c11955x0, C11901c c11901c, ReqT reqt) {
        e eVar = new e();
        AbstractC11913g mo25518h = abstractC11904d.mo25518h(c11955x0, c11901c.m38093q(f524c, d.BLOCKING).m38090n(eVar));
        boolean z10 = false;
        try {
            try {
                InterfaceFutureC5920f m584d = m584d(mo25518h, reqt);
                while (!m584d.isDone()) {
                    try {
                        eVar.m596f();
                    } catch (InterruptedException e10) {
                        try {
                            mo25518h.mo25522a("Thread interrupted", e10);
                            z10 = true;
                        } catch (Error e11) {
                            e = e11;
                            throw m583c(mo25518h, e);
                        } catch (RuntimeException e12) {
                            e = e12;
                            throw m583c(mo25518h, e);
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
                RespT respt = (RespT) m585e(m584d);
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

    /* renamed from: c */
    private static RuntimeException m583c(AbstractC11913g<?, ?> abstractC11913g, Throwable th2) {
        try {
            abstractC11913g.mo25522a(null, th2);
        } catch (Throwable th3) {
            f522a.log(Level.SEVERE, "RuntimeException encountered while closing call", th3);
        }
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new AssertionError(th2);
    }

    /* renamed from: d */
    public static <ReqT, RespT> InterfaceFutureC5920f<RespT> m584d(AbstractC11913g<ReqT, RespT> abstractC11913g, ReqT reqt) {
        b bVar = new b(abstractC11913g);
        m581a(abstractC11913g, reqt, new f(bVar));
        return bVar;
    }

    /* renamed from: e */
    private static <V> V m585e(Future<V> future) {
        try {
            return future.get();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            throw C11915g1.f31535g.m38147r("Thread interrupted").m38146q(e10).m38139d();
        } catch (ExecutionException e11) {
            throw m587g(e11.getCause());
        }
    }

    /* renamed from: f */
    private static <ReqT, RespT> void m586f(AbstractC11913g<ReqT, RespT> abstractC11913g, c<RespT> cVar) {
        abstractC11913g.mo603e(cVar, new C11953w0());
        cVar.mo593e();
    }

    /* renamed from: g */
    private static C11921i1 m587g(Throwable th2) {
        for (Throwable th3 = (Throwable) C7159o.m21313p(th2, "t"); th3 != null; th3 = th3.getCause()) {
            if (th3 instanceof C11918h1) {
                C11918h1 c11918h1 = (C11918h1) th3;
                return new C11921i1(c11918h1.m38159a(), c11918h1.m38160b());
            }
            if (th3 instanceof C11921i1) {
                C11921i1 c11921i1 = (C11921i1) th3;
                return new C11921i1(c11921i1.m38167a(), c11921i1.m38168b());
            }
        }
        return C11915g1.f31536h.m38147r("unexpected exception").m38146q(th2).m38139d();
    }
}
