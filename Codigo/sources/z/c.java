package z;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static ThreadLocal<ScheduledExecutorService> f32211b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Handler f32212a;

    /* loaded from: classes.dex */
    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return z.a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f32213a;

        b(Runnable runnable) {
            this.f32213a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f32213a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableScheduledFutureC0539c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a, reason: collision with root package name */
        final AtomicReference<c.a<V>> f32215a = new AtomicReference<>(null);

        /* renamed from: b, reason: collision with root package name */
        private final long f32216b;

        /* renamed from: c, reason: collision with root package name */
        private final Callable<V> f32217c;

        /* renamed from: d, reason: collision with root package name */
        private final com.google.common.util.concurrent.f<V> f32218d;

        /* renamed from: z.c$c$a */
        /* loaded from: classes.dex */
        class a implements c.InterfaceC0032c<V> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Handler f32219a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Callable f32220b;

            /* renamed from: z.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0540a implements Runnable {
                RunnableC0540a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC0539c.this.f32215a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f32219a.removeCallbacks(RunnableScheduledFutureC0539c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f32219a = handler;
                this.f32220b = callable;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public Object a(c.a<V> aVar) {
                aVar.a(new RunnableC0540a(), z.a.a());
                RunnableScheduledFutureC0539c.this.f32215a.set(aVar);
                return "HandlerScheduledFuture-" + this.f32220b.toString();
            }
        }

        RunnableScheduledFutureC0539c(Handler handler, long j10, Callable<V> callable) {
            this.f32216b = j10;
            this.f32217c = callable;
            this.f32218d = androidx.concurrent.futures.c.a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f32218d.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f32218d.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return this.f32218d.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f32216b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f32218d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f32218d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            c.a andSet = this.f32215a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.c(this.f32217c.call());
                } catch (Exception e10) {
                    andSet.f(e10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Handler handler) {
        this.f32212a = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f32212a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f32212a.post(runnable)) {
            throw a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        RunnableScheduledFutureC0539c runnableScheduledFutureC0539c = new RunnableScheduledFutureC0539c(this.f32212a, uptimeMillis, callable);
        return this.f32212a.postAtTime(runnableScheduledFutureC0539c, uptimeMillis) ? runnableScheduledFutureC0539c : a0.f.g(a());
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }
}
