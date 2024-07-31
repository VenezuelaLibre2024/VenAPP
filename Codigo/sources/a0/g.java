package a0;

import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import w.o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class g<V> implements com.google.common.util.concurrent.f<V> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<V> extends g<V> {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f22a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Throwable th2) {
            this.f22a = th2;
        }

        @Override // a0.g, java.util.concurrent.Future
        public V get() {
            throw new ExecutionException(this.f22a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f22a + "]]";
        }
    }

    /* loaded from: classes.dex */
    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Throwable th2) {
            super(th2);
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(Delayed delayed) {
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c<V> extends g<V> {

        /* renamed from: b, reason: collision with root package name */
        static final g<Object> f23b = new c(null);

        /* renamed from: a, reason: collision with root package name */
        private final V f24a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(V v10) {
            this.f24a = v10;
        }

        @Override // a0.g, java.util.concurrent.Future
        public V get() {
            return this.f24a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f24a + "]]";
        }
    }

    g() {
    }

    public static <V> com.google.common.util.concurrent.f<V> b() {
        return c.f23b;
    }

    @Override // com.google.common.util.concurrent.f
    public void addListener(Runnable runnable, Executor executor) {
        androidx.core.util.h.k(runnable);
        androidx.core.util.h.k(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            o0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        androidx.core.util.h.k(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
