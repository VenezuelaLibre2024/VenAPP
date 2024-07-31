package uj;

import dj.r;
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

/* loaded from: classes3.dex */
public final class c extends r {

    /* renamed from: d, reason: collision with root package name */
    static final f f27720d;

    /* renamed from: e, reason: collision with root package name */
    static final f f27721e;

    /* renamed from: f, reason: collision with root package name */
    private static final TimeUnit f27722f = TimeUnit.SECONDS;

    /* renamed from: g, reason: collision with root package name */
    static final C0449c f27723g;

    /* renamed from: h, reason: collision with root package name */
    static final a f27724h;

    /* renamed from: b, reason: collision with root package name */
    final ThreadFactory f27725b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<a> f27726c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f27727a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentLinkedQueue<C0449c> f27728b;

        /* renamed from: c, reason: collision with root package name */
        final gj.a f27729c;

        /* renamed from: d, reason: collision with root package name */
        private final ScheduledExecutorService f27730d;

        /* renamed from: e, reason: collision with root package name */
        private final Future<?> f27731e;

        /* renamed from: f, reason: collision with root package name */
        private final ThreadFactory f27732f;

        a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f27727a = nanos;
            this.f27728b = new ConcurrentLinkedQueue<>();
            this.f27729c = new gj.a();
            this.f27732f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, c.f27721e);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f27730d = scheduledExecutorService;
            this.f27731e = scheduledFuture;
        }

        void a() {
            if (this.f27728b.isEmpty()) {
                return;
            }
            long c10 = c();
            Iterator<C0449c> it = this.f27728b.iterator();
            while (it.hasNext()) {
                C0449c next = it.next();
                if (next.g() > c10) {
                    return;
                }
                if (this.f27728b.remove(next)) {
                    this.f27729c.a(next);
                }
            }
        }

        C0449c b() {
            if (this.f27729c.h()) {
                return c.f27723g;
            }
            while (!this.f27728b.isEmpty()) {
                C0449c poll = this.f27728b.poll();
                if (poll != null) {
                    return poll;
                }
            }
            C0449c c0449c = new C0449c(this.f27732f);
            this.f27729c.b(c0449c);
            return c0449c;
        }

        long c() {
            return System.nanoTime();
        }

        void d(C0449c c0449c) {
            c0449c.i(c() + this.f27727a);
            this.f27728b.offer(c0449c);
        }

        void e() {
            this.f27729c.dispose();
            Future<?> future = this.f27731e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f27730d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends r.b {

        /* renamed from: b, reason: collision with root package name */
        private final a f27734b;

        /* renamed from: c, reason: collision with root package name */
        private final C0449c f27735c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicBoolean f27736d = new AtomicBoolean();

        /* renamed from: a, reason: collision with root package name */
        private final gj.a f27733a = new gj.a();

        b(a aVar) {
            this.f27734b = aVar;
            this.f27735c = aVar.b();
        }

        @Override // dj.r.b
        public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f27733a.h() ? kj.c.INSTANCE : this.f27735c.d(runnable, j10, timeUnit, this.f27733a);
        }

        @Override // gj.b
        public void dispose() {
            if (this.f27736d.compareAndSet(false, true)) {
                this.f27733a.dispose();
                this.f27734b.d(this.f27735c);
            }
        }

        @Override // gj.b
        public boolean h() {
            return this.f27736d.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0449c extends e {

        /* renamed from: c, reason: collision with root package name */
        private long f27737c;

        C0449c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f27737c = 0L;
        }

        public long g() {
            return this.f27737c;
        }

        public void i(long j10) {
            this.f27737c = j10;
        }
    }

    static {
        C0449c c0449c = new C0449c(new f("RxCachedThreadSchedulerShutdown"));
        f27723g = c0449c;
        c0449c.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        f fVar = new f("RxCachedThreadScheduler", max);
        f27720d = fVar;
        f27721e = new f("RxCachedWorkerPoolEvictor", max);
        a aVar = new a(0L, null, fVar);
        f27724h = aVar;
        aVar.e();
    }

    public c() {
        this(f27720d);
    }

    public c(ThreadFactory threadFactory) {
        this.f27725b = threadFactory;
        this.f27726c = new AtomicReference<>(f27724h);
        d();
    }

    @Override // dj.r
    public r.b a() {
        return new b(this.f27726c.get());
    }

    public void d() {
        a aVar = new a(60L, f27722f, this.f27725b);
        if (e2.c.a(this.f27726c, f27724h, aVar)) {
            return;
        }
        aVar.e();
    }
}
