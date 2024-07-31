package p002a0;

import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p407w.C12029o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a0.g */
/* loaded from: classes.dex */
public abstract class AbstractC0010g<V> implements InterfaceFutureC5920f<V> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0.g$a */
    /* loaded from: classes.dex */
    public static class a<V> extends AbstractC0010g<V> {

        /* renamed from: a */
        private final Throwable f22a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Throwable th2) {
            this.f22a = th2;
        }

        @Override // p002a0.AbstractC0010g, java.util.concurrent.Future
        public V get() {
            throw new ExecutionException(this.f22a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f22a + "]]";
        }
    }

    /* renamed from: a0.g$b */
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
    /* renamed from: a0.g$c */
    /* loaded from: classes.dex */
    public static final class c<V> extends AbstractC0010g<V> {

        /* renamed from: b */
        static final AbstractC0010g<Object> f23b = new c(null);

        /* renamed from: a */
        private final V f24a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(V v10) {
            this.f24a = v10;
        }

        @Override // p002a0.AbstractC0010g, java.util.concurrent.Future
        public V get() {
            return this.f24a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f24a + "]]";
        }
    }

    AbstractC0010g() {
    }

    /* renamed from: b */
    public static <V> InterfaceFutureC5920f<V> m31b() {
        return c.f23b;
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
    public void addListener(Runnable runnable, Executor executor) {
        C0984h.m4833k(runnable);
        C0984h.m4833k(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            C12029o0.m38641d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
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
        C0984h.m4833k(timeUnit);
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
