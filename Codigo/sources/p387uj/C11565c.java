package p387uj;

import dj.AbstractC6993r;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p123gj.C7577a;
import p123gj.InterfaceC7578b;
import p205kj.EnumC9285c;

/* renamed from: uj.c */
/* loaded from: classes3.dex */
public final class C11565c extends AbstractC6993r {

    /* renamed from: d */
    static final ThreadFactoryC11568f f30043d;

    /* renamed from: e */
    static final ThreadFactoryC11568f f30044e;

    /* renamed from: f */
    private static final TimeUnit f30045f = TimeUnit.SECONDS;

    /* renamed from: g */
    static final c f30046g;

    /* renamed from: h */
    static final a f30047h;

    /* renamed from: b */
    final ThreadFactory f30048b;

    /* renamed from: c */
    final AtomicReference<a> f30049c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.c$a */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a */
        private final long f30050a;

        /* renamed from: b */
        private final ConcurrentLinkedQueue<c> f30051b;

        /* renamed from: c */
        final C7577a f30052c;

        /* renamed from: d */
        private final ScheduledExecutorService f30053d;

        /* renamed from: e */
        private final Future<?> f30054e;

        /* renamed from: f */
        private final ThreadFactory f30055f;

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f30050a = nanos;
            this.f30051b = new ConcurrentLinkedQueue<>();
            this.f30052c = new C7577a();
            this.f30055f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C11565c.f30044e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f30053d = scheduledExecutorService;
            this.f30054e = scheduledFuture;
        }

        /* renamed from: a */
        void m36244a() {
            if (this.f30051b.isEmpty()) {
                return;
            }
            long m36246c = m36246c();
            Iterator<c> it = this.f30051b.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.m36249g() > m36246c) {
                    return;
                }
                if (this.f30051b.remove(next)) {
                    this.f30052c.mo23020a(next);
                }
            }
        }

        /* renamed from: b */
        c m36245b() {
            if (this.f30052c.mo616h()) {
                return C11565c.f30046g;
            }
            while (!this.f30051b.isEmpty()) {
                c poll = this.f30051b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            c cVar = new c(this.f30055f);
            this.f30052c.mo23021b(cVar);
            return cVar;
        }

        /* renamed from: c */
        long m36246c() {
            return System.nanoTime();
        }

        /* renamed from: d */
        void m36247d(c cVar) {
            cVar.m36250i(m36246c() + this.f30050a);
            this.f30051b.offer(cVar);
        }

        /* renamed from: e */
        void m36248e() {
            this.f30052c.dispose();
            Future<?> future = this.f30054e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f30053d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m36244a();
        }
    }

    /* renamed from: uj.c$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC6993r.b {

        /* renamed from: b */
        private final a f30057b;

        /* renamed from: c */
        private final c f30058c;

        /* renamed from: d */
        final AtomicBoolean f30059d = new AtomicBoolean();

        /* renamed from: a */
        private final C7577a f30056a = new C7577a();

        b(a aVar) {
            this.f30057b = aVar;
            this.f30058c = aVar.m36245b();
        }

        @Override // dj.AbstractC6993r.b
        /* renamed from: c */
        public InterfaceC7578b mo20303c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f30056a.mo616h() ? EnumC9285c.INSTANCE : this.f30058c.m36251d(runnable, j10, timeUnit, this.f30056a);
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            if (this.f30059d.compareAndSet(false, true)) {
                this.f30056a.dispose();
                this.f30057b.m36247d(this.f30058c);
            }
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return this.f30059d.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.c$c */
    /* loaded from: classes3.dex */
    public static final class c extends C11567e {

        /* renamed from: c */
        private long f30060c;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f30060c = 0L;
        }

        /* renamed from: g */
        public long m36249g() {
            return this.f30060c;
        }

        /* renamed from: i */
        public void m36250i(long j10) {
            this.f30060c = j10;
        }
    }

    static {
        c cVar = new c(new ThreadFactoryC11568f("RxCachedThreadSchedulerShutdown"));
        f30046g = cVar;
        cVar.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        ThreadFactoryC11568f threadFactoryC11568f = new ThreadFactoryC11568f("RxCachedThreadScheduler", max);
        f30043d = threadFactoryC11568f;
        f30044e = new ThreadFactoryC11568f("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0L, null, threadFactoryC11568f);
        f30047h = aVar;
        aVar.m36248e();
    }

    public C11565c() {
        this(f30043d);
    }

    public C11565c(ThreadFactory threadFactory) {
        this.f30048b = threadFactory;
        this.f30049c = new AtomicReference<>(f30047h);
        m36243d();
    }

    @Override // dj.AbstractC6993r
    /* renamed from: a */
    public AbstractC6993r.b mo20298a() {
        return new b(this.f30049c.get());
    }

    /* renamed from: d */
    public void m36243d() {
        a aVar = new a(60L, f30045f, this.f30048b);
        if (C7099c.m20926a(this.f30049c, f30047h, aVar)) {
            return;
        }
        aVar.m36248e();
    }
}
