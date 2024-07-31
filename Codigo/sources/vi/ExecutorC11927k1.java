package vi;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;
import p082eb.C7159o;

/* renamed from: vi.k1 */
/* loaded from: classes3.dex */
public final class ExecutorC11927k1 implements Executor {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f31580a;

    /* renamed from: b */
    private final Queue<Runnable> f31581b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final AtomicReference<Thread> f31582c = new AtomicReference<>();

    /* renamed from: vi.k1$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c f31583a;

        /* renamed from: b */
        final /* synthetic */ Runnable f31584b;

        a(c cVar, Runnable runnable) {
            this.f31583a = cVar;
            this.f31584b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC11927k1.this.execute(this.f31583a);
        }

        public String toString() {
            return this.f31584b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* renamed from: vi.k1$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c f31586a;

        /* renamed from: b */
        final /* synthetic */ Runnable f31587b;

        /* renamed from: c */
        final /* synthetic */ long f31588c;

        b(c cVar, Runnable runnable, long j10) {
            this.f31586a = cVar;
            this.f31587b = runnable;
            this.f31588c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ExecutorC11927k1.this.execute(this.f31586a);
        }

        public String toString() {
            return this.f31587b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f31588c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vi.k1$c */
    /* loaded from: classes3.dex */
    public static class c implements Runnable {

        /* renamed from: a */
        final Runnable f31590a;

        /* renamed from: b */
        boolean f31591b;

        /* renamed from: c */
        boolean f31592c;

        c(Runnable runnable) {
            this.f31590a = (Runnable) C7159o.m21313p(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f31591b) {
                return;
            }
            this.f31592c = true;
            this.f31590a.run();
        }
    }

    /* renamed from: vi.k1$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        private final c f31593a;

        /* renamed from: b */
        private final ScheduledFuture<?> f31594b;

        private d(c cVar, ScheduledFuture<?> scheduledFuture) {
            this.f31593a = (c) C7159o.m21313p(cVar, "runnable");
            this.f31594b = (ScheduledFuture) C7159o.m21313p(scheduledFuture, "future");
        }

        /* synthetic */ d(c cVar, ScheduledFuture scheduledFuture, a aVar) {
            this(cVar, scheduledFuture);
        }

        /* renamed from: a */
        public void m38197a() {
            this.f31593a.f31591b = true;
            this.f31594b.cancel(false);
        }

        /* renamed from: b */
        public boolean m38198b() {
            c cVar = this.f31593a;
            return (cVar.f31592c || cVar.f31591b) ? false : true;
        }
    }

    public ExecutorC11927k1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f31580a = (Thread.UncaughtExceptionHandler) C7159o.m21313p(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    /* renamed from: a */
    public final void m38192a() {
        while (C7099c.m20926a(this.f31582c, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f31581b.poll();
                    if (poll == null) {
                        break;
                    }
                    try {
                        poll.run();
                    } catch (Throwable th2) {
                        this.f31580a.uncaughtException(Thread.currentThread(), th2);
                    }
                } catch (Throwable th3) {
                    this.f31582c.set(null);
                    throw th3;
                }
            }
            this.f31582c.set(null);
            if (this.f31581b.isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void m38193b(Runnable runnable) {
        this.f31581b.add((Runnable) C7159o.m21313p(runnable, "runnable is null"));
    }

    /* renamed from: c */
    public final d m38194c(Runnable runnable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.schedule(new a(cVar, runnable), j10, timeUnit), null);
    }

    /* renamed from: d */
    public final d m38195d(Runnable runnable, long j10, long j11, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        c cVar = new c(runnable);
        return new d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new b(cVar, runnable, j11), j10, j11, timeUnit), null);
    }

    /* renamed from: e */
    public void m38196e() {
        C7159o.m21319v(Thread.currentThread() == this.f31582c.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m38193b(runnable);
        m38192a();
    }
}
