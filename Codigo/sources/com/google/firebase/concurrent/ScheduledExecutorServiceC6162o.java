package com.google.firebase.concurrent;

import com.google.firebase.concurrent.ScheduledFutureC6163p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.concurrent.o */
/* loaded from: classes.dex */
public class ScheduledExecutorServiceC6162o implements ScheduledExecutorService {

    /* renamed from: a */
    private final ExecutorService f13071a;

    /* renamed from: b */
    private final ScheduledExecutorService f13072b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScheduledExecutorServiceC6162o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f13071a = executorService;
        this.f13072b = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ void m16675n(Runnable runnable, ScheduledFutureC6163p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.mo16690a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m16676o(final Runnable runnable, final ScheduledFutureC6163p.b bVar) {
        this.f13071a.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6162o.m16675n(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ ScheduledFuture m16677p(final Runnable runnable, long j10, TimeUnit timeUnit, final ScheduledFutureC6163p.b bVar) {
        return this.f13072b.schedule(new Runnable() { // from class: com.google.firebase.concurrent.k
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6162o.this.m16676o(runnable, bVar);
            }
        }, j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ void m16678q(Callable callable, ScheduledFutureC6163p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.mo16690a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Future m16679s(final Callable callable, final ScheduledFutureC6163p.b bVar) {
        return this.f13071a.submit(new Runnable() { // from class: com.google.firebase.concurrent.m
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6162o.m16678q(callable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ ScheduledFuture m16680t(final Callable callable, long j10, TimeUnit timeUnit, final ScheduledFutureC6163p.b bVar) {
        return this.f13072b.schedule(new Callable() { // from class: com.google.firebase.concurrent.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future m16679s;
                m16679s = ScheduledExecutorServiceC6162o.this.m16679s(callable, bVar);
                return m16679s;
            }
        }, j10, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m16681u(Runnable runnable, ScheduledFutureC6163p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.mo16690a(e10);
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m16682v(final Runnable runnable, final ScheduledFutureC6163p.b bVar) {
        this.f13071a.execute(new Runnable() { // from class: com.google.firebase.concurrent.n
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6162o.m16681u(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ ScheduledFuture m16683w(final Runnable runnable, long j10, long j11, TimeUnit timeUnit, final ScheduledFutureC6163p.b bVar) {
        return this.f13072b.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.i
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6162o.this.m16682v(runnable, bVar);
            }
        }, j10, j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m16684x(final Runnable runnable, final ScheduledFutureC6163p.b bVar) {
        this.f13071a.execute(new Runnable() { // from class: com.google.firebase.concurrent.e
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6162o.m16686z(runnable, bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ ScheduledFuture m16685y(final Runnable runnable, long j10, long j11, TimeUnit timeUnit, final ScheduledFutureC6163p.b bVar) {
        return this.f13072b.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.j
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorServiceC6162o.this.m16684x(runnable, bVar);
            }
        }, j10, j11, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ void m16686z(Runnable runnable, ScheduledFutureC6163p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.mo16690a(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f13071a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f13071a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f13071a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f13071a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f13071a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f13071a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f13071a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f13071a.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC6163p(new ScheduledFutureC6163p.c() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.ScheduledFutureC6163p.c
            /* renamed from: a */
            public final ScheduledFuture mo16662a(ScheduledFutureC6163p.b bVar) {
                ScheduledFuture m16677p;
                m16677p = ScheduledExecutorServiceC6162o.this.m16677p(runnable, j10, timeUnit, bVar);
                return m16677p;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new ScheduledFutureC6163p(new ScheduledFutureC6163p.c() { // from class: com.google.firebase.concurrent.c
            @Override // com.google.firebase.concurrent.ScheduledFutureC6163p.c
            /* renamed from: a */
            public final ScheduledFuture mo16662a(ScheduledFutureC6163p.b bVar) {
                ScheduledFuture m16680t;
                m16680t = ScheduledExecutorServiceC6162o.this.m16680t(callable, j10, timeUnit, bVar);
                return m16680t;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC6163p(new ScheduledFutureC6163p.c() { // from class: com.google.firebase.concurrent.h
            @Override // com.google.firebase.concurrent.ScheduledFutureC6163p.c
            /* renamed from: a */
            public final ScheduledFuture mo16662a(ScheduledFutureC6163p.b bVar) {
                ScheduledFuture m16683w;
                m16683w = ScheduledExecutorServiceC6162o.this.m16683w(runnable, j10, j11, timeUnit, bVar);
                return m16683w;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new ScheduledFutureC6163p(new ScheduledFutureC6163p.c() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.ScheduledFutureC6163p.c
            /* renamed from: a */
            public final ScheduledFuture mo16662a(ScheduledFutureC6163p.b bVar) {
                ScheduledFuture m16685y;
                m16685y = ScheduledExecutorServiceC6162o.this.m16685y(runnable, j10, j11, timeUnit, bVar);
                return m16685y;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f13071a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f13071a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f13071a.submit(callable);
    }
}
