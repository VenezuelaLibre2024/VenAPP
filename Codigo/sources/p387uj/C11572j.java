package p387uj;

import dj.AbstractC6993r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.C7577a;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9285c;
import p471yj.C12727a;

/* renamed from: uj.j */
/* loaded from: classes3.dex */
public final class C11572j extends AbstractC6993r {

    /* renamed from: d */
    static final ThreadFactoryC11568f f30079d;

    /* renamed from: e */
    static final ScheduledExecutorService f30080e;

    /* renamed from: b */
    final ThreadFactory f30081b;

    /* renamed from: c */
    final AtomicReference<ScheduledExecutorService> f30082c;

    /* renamed from: uj.j$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC6993r.b {

        /* renamed from: a */
        final ScheduledExecutorService f30083a;

        /* renamed from: b */
        final C7577a f30084b = new C7577a();

        /* renamed from: c */
        volatile boolean f30085c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f30083a = scheduledExecutorService;
        }

        @Override // dj.AbstractC6993r.b
        /* renamed from: c */
        public InterfaceC7578b mo20303c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f30085c) {
                return EnumC9285c.INSTANCE;
            }
            RunnableC11570h runnableC11570h = new RunnableC11570h(C12727a.m41997s(runnable), this.f30084b);
            this.f30084b.mo23021b(runnableC11570h);
            try {
                runnableC11570h.m36255a(j10 <= 0 ? this.f30083a.submit((Callable) runnableC11570h) : this.f30083a.schedule((Callable) runnableC11570h, j10, timeUnit));
                return runnableC11570h;
            } catch (RejectedExecutionException e10) {
                dispose();
                C12727a.m41995q(e10);
                return EnumC9285c.INSTANCE;
            }
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            if (this.f30085c) {
                return;
            }
            this.f30085c = true;
            this.f30084b.dispose();
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f30085c;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f30080e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f30079d = new ThreadFactoryC11568f("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C11572j() {
        this(f30079d);
    }

    public C11572j(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f30082c = atomicReference;
        this.f30081b = threadFactory;
        atomicReference.lazySet(m36261d(threadFactory));
    }

    /* renamed from: d */
    static ScheduledExecutorService m36261d(ThreadFactory threadFactory) {
        return C11571i.m36256a(threadFactory);
    }

    @Override // dj.AbstractC6993r
    /* renamed from: a */
    public AbstractC6993r.b mo20298a() {
        return new a(this.f30082c.get());
    }

    @Override // dj.AbstractC6993r
    /* renamed from: c */
    public InterfaceC7578b mo20300c(Runnable runnable, long j10, TimeUnit timeUnit) {
        CallableC11569g callableC11569g = new CallableC11569g(C12727a.m41997s(runnable));
        try {
            callableC11569g.m36238a(j10 <= 0 ? this.f30082c.get().submit(callableC11569g) : this.f30082c.get().schedule(callableC11569g, j10, timeUnit));
            return callableC11569g;
        } catch (RejectedExecutionException e10) {
            C12727a.m41995q(e10);
            return EnumC9285c.INSTANCE;
        }
    }
}
