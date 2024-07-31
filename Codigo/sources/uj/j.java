package uj;

import dj.r;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class j extends r {

    /* renamed from: d, reason: collision with root package name */
    static final f f27756d;

    /* renamed from: e, reason: collision with root package name */
    static final ScheduledExecutorService f27757e;

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f27758b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f27759c;

    /* loaded from: classes3.dex */
    static final class a extends r.b {

        /* renamed from: a, reason: collision with root package name */
        final ScheduledExecutorService f27760a;

        /* renamed from: b, reason: collision with root package name */
        final gj.a f27761b = new gj.a();

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f27762c;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f27760a = scheduledExecutorService;
        }

        @Override // dj.r.b
        public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (this.f27762c) {
                return kj.c.INSTANCE;
            }
            h hVar = new h(yj.a.s(runnable), this.f27761b);
            this.f27761b.b(hVar);
            try {
                hVar.a(j10 <= 0 ? this.f27760a.submit((Callable) hVar) : this.f27760a.schedule((Callable) hVar, j10, timeUnit));
                return hVar;
            } catch (RejectedExecutionException e10) {
                dispose();
                yj.a.q(e10);
                return kj.c.INSTANCE;
            }
        }

        @Override // gj.b
        public void dispose() {
            if (this.f27762c) {
                return;
            }
            this.f27762c = true;
            this.f27761b.dispose();
        }

        @Override // gj.b
        public boolean h() {
            return this.f27762c;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f27757e = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f27756d = new f("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public j() {
        this(f27756d);
    }

    public j(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f27759c = atomicReference;
        this.f27758b = threadFactory;
        atomicReference.lazySet(d(threadFactory));
    }

    static ScheduledExecutorService d(ThreadFactory threadFactory) {
        return i.a(threadFactory);
    }

    @Override // dj.r
    public r.b a() {
        return new a(this.f27759c.get());
    }

    @Override // dj.r
    public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        g gVar = new g(yj.a.s(runnable));
        try {
            gVar.a(j10 <= 0 ? this.f27759c.get().submit(gVar) : this.f27759c.get().schedule(gVar, j10, timeUnit));
            return gVar;
        } catch (RejectedExecutionException e10) {
            yj.a.q(e10);
            return kj.c.INSTANCE;
        }
    }
}
