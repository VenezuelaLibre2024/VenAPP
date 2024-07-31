package p474z;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.C0742c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
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
import p002a0.C0009f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.c */
/* loaded from: classes.dex */
public final class ScheduledExecutorServiceC12749c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b */
    private static ThreadLocal<ScheduledExecutorService> f34762b = new a();

    /* renamed from: a */
    private final Handler f34763a;

    /* renamed from: z.c$a */
    /* loaded from: classes.dex */
    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C12747a.m42283d();
            }
            if (Looper.myLooper() != null) {
                return new ScheduledExecutorServiceC12749c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: z.c$b */
    /* loaded from: classes.dex */
    class b implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ Runnable f34764a;

        b(Runnable runnable) {
            this.f34764a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.f34764a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z.c$c */
    /* loaded from: classes.dex */
    public static class c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a */
        final AtomicReference<C0742c.a<V>> f34766a = new AtomicReference<>(null);

        /* renamed from: b */
        private final long f34767b;

        /* renamed from: c */
        private final Callable<V> f34768c;

        /* renamed from: d */
        private final InterfaceFutureC5920f<V> f34769d;

        /* renamed from: z.c$c$a */
        /* loaded from: classes.dex */
        class a implements C0742c.c<V> {

            /* renamed from: a */
            final /* synthetic */ Handler f34770a;

            /* renamed from: b */
            final /* synthetic */ Callable f34771b;

            /* renamed from: z.c$c$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC13292a implements Runnable {
                RunnableC13292a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (c.this.f34766a.getAndSet(null) != null) {
                        a aVar = a.this;
                        aVar.f34770a.removeCallbacks(c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f34770a = handler;
                this.f34771b = callable;
            }

            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public Object mo14a(C0742c.a<V> aVar) {
                aVar.m3754a(new RunnableC13292a(), C12747a.m42280a());
                c.this.f34766a.set(aVar);
                return "HandlerScheduledFuture-" + this.f34771b.toString();
            }
        }

        c(Handler handler, long j10, Callable<V> callable) {
            this.f34767b = j10;
            this.f34768c = callable;
            this.f34769d = C0742c.m3752a(new a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return this.f34769d.cancel(z10);
        }

        @Override // java.util.concurrent.Future
        public V get() {
            return this.f34769d.get();
        }

        @Override // java.util.concurrent.Future
        public V get(long j10, TimeUnit timeUnit) {
            return this.f34769d.get(j10, timeUnit);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f34767b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f34769d.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f34769d.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            C0742c.a andSet = this.f34766a.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.m3756c(this.f34768c.call());
                } catch (Exception e10) {
                    andSet.m3758f(e10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledExecutorServiceC12749c(Handler handler) {
        this.f34763a = handler;
    }

    /* renamed from: a */
    private RejectedExecutionException m42287a() {
        return new RejectedExecutionException(this.f34763a + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC12749c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.f34763a.post(runnable)) {
            throw m42287a();
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
        c cVar = new c(this.f34763a, uptimeMillis, callable);
        return this.f34763a.postAtTime(cVar, uptimeMillis) ? cVar : C0009f.m21g(m42287a());
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC12749c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC12749c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC12749c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC12749c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }
}
