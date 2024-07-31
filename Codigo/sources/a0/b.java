package a0;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b<I, O> extends d<O> implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    private a0.a<? super I, ? extends O> f4c;

    /* renamed from: d, reason: collision with root package name */
    private final BlockingQueue<Boolean> f5d = new LinkedBlockingQueue(1);

    /* renamed from: e, reason: collision with root package name */
    private final CountDownLatch f6e = new CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    private com.google.common.util.concurrent.f<? extends I> f7f;

    /* renamed from: r, reason: collision with root package name */
    volatile com.google.common.util.concurrent.f<? extends O> f8r;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.f f9a;

        a(com.google.common.util.concurrent.f fVar) {
            this.f9a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    b.this.b(f.e(this.f9a));
                } catch (CancellationException unused) {
                    b.this.cancel(false);
                    b.this.f8r = null;
                    return;
                } catch (ExecutionException e10) {
                    b.this.c(e10.getCause());
                }
                b.this.f8r = null;
            } catch (Throwable th2) {
                b.this.f8r = null;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a0.a<? super I, ? extends O> aVar, com.google.common.util.concurrent.f<? extends I> fVar) {
        this.f4c = (a0.a) androidx.core.util.h.k(aVar);
        this.f7f = (com.google.common.util.concurrent.f) androidx.core.util.h.k(fVar);
    }

    private void f(Future<?> future, boolean z10) {
        if (future != null) {
            future.cancel(z10);
        }
    }

    private <E> void g(BlockingQueue<E> blockingQueue, E e10) {
        boolean z10 = false;
        while (true) {
            try {
                blockingQueue.put(e10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E h(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z10 = false;
        while (true) {
            try {
                take = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // a0.d, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        if (!super.cancel(z10)) {
            return false;
        }
        g(this.f5d, Boolean.valueOf(z10));
        f(this.f7f, z10);
        f(this.f8r, z10);
        return true;
    }

    @Override // a0.d, java.util.concurrent.Future
    public O get() {
        if (!isDone()) {
            com.google.common.util.concurrent.f<? extends I> fVar = this.f7f;
            if (fVar != null) {
                fVar.get();
            }
            this.f6e.await();
            com.google.common.util.concurrent.f<? extends O> fVar2 = this.f8r;
            if (fVar2 != null) {
                fVar2.get();
            }
        }
        return (O) super.get();
    }

    @Override // a0.d, java.util.concurrent.Future
    public O get(long j10, TimeUnit timeUnit) {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j10 = timeUnit2.convert(j10, timeUnit);
                timeUnit = timeUnit2;
            }
            com.google.common.util.concurrent.f<? extends I> fVar = this.f7f;
            if (fVar != null) {
                long nanoTime = System.nanoTime();
                fVar.get(j10, timeUnit);
                j10 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (!this.f6e.await(j10, timeUnit)) {
                throw new TimeoutException();
            }
            j10 -= Math.max(0L, System.nanoTime() - nanoTime2);
            com.google.common.util.concurrent.f<? extends O> fVar2 = this.f8r;
            if (fVar2 != null) {
                fVar2.get(j10, timeUnit);
            }
        }
        return (O) super.get(j10, timeUnit);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.google.common.util.concurrent.f<? extends O> apply;
        try {
            try {
                try {
                    apply = this.f4c.apply(f.e(this.f7f));
                    this.f8r = apply;
                } catch (Error e10) {
                    e = e10;
                    c(e);
                    this.f4c = null;
                    this.f7f = null;
                    this.f6e.countDown();
                    return;
                } catch (UndeclaredThrowableException e11) {
                    e = e11.getCause();
                    c(e);
                    this.f4c = null;
                    this.f7f = null;
                    this.f6e.countDown();
                    return;
                } catch (Exception e12) {
                    e = e12;
                    c(e);
                    this.f4c = null;
                    this.f7f = null;
                    this.f6e.countDown();
                    return;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e13) {
                c(e13.getCause());
            }
            if (!isCancelled()) {
                apply.addListener(new a(apply), z.a.a());
                this.f4c = null;
                this.f7f = null;
                this.f6e.countDown();
                return;
            }
            apply.cancel(((Boolean) h(this.f5d)).booleanValue());
            this.f8r = null;
            this.f4c = null;
            this.f7f = null;
            this.f6e.countDown();
        } catch (Throwable th2) {
            this.f4c = null;
            this.f7f = null;
            this.f6e.countDown();
            throw th2;
        }
    }
}
