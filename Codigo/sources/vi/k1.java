package vi;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class k1 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f29145a;

    /* renamed from: b, reason: collision with root package name */
    private final Queue<Runnable> f29146b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference<Thread> f29147c = new AtomicReference<>();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f29148a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f29149b;

        a(c cVar, Runnable runnable) {
            this.f29148a = cVar;
            this.f29149b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.execute(this.f29148a);
        }

        public String toString() {
            return this.f29149b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f29151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f29152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f29153c;

        b(c cVar, Runnable runnable, long j10) {
            this.f29151a = cVar;
            this.f29152b = runnable;
            this.f29153c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            k1.this.execute(this.f29151a);
        }

        public String toString() {
            return this.f29152b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f29153c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final Runnable f29155a;

        /* renamed from: b, reason: collision with root package name */
        boolean f29156b;

        /* renamed from: c, reason: collision with root package name */
        boolean f29157c;

        c(Runnable runnable) {
            this.f29155a = (Runnable) eb.o.p(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29156b) {
                return;
            }
            this.f29157c = true;
            this.f29155a.run();
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final c f29158a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledFuture<?> f29159b;

        private d(c cVar, ScheduledFuture<?> scheduledFuture) {
            this.f29158a = (c) eb.o.p(cVar, "runnable");
            this.f29159b = (ScheduledFuture) eb.o.p(scheduledFuture, "future");
        }

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        public void a() {
            this.f29158a.f29156b = true;
            this.f29159b.cancel(false);
        }

        public boolean b() {
            c cVar = this.f29158a;
            return (cVar.f29157c || cVar.f29156b) ? false : true;
        }
    }

    public k1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f29145a = (Thread.UncaughtExceptionHandler) eb.o.p(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (e2.c.a(this.f29147c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f29146b.poll();
                    if (poll == null) {
                        break;
                    }
                    try {
                        poll.run();
                    } catch (Throwable th2) {
                        this.f29145a.uncaughtException(Thread.currentThread(), th2);
                    }
                } catch (Throwable th3) {
                    this.f29147c.set(null);
                    throw th3;
                }
            }
            this.f29147c.set(null);
            if (this.f29146b.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f29146b.add((Runnable) eb.o.p(runnable, "runnable is null"));
    }

    public final d c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j10, timeUnit), null);
    }

    public final d d(Runnable runnable, long j10, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j11), j10, j11, timeUnit), null);
    }

    public void e() {
        eb.o.v(Thread.currentThread() == this.f29147c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
