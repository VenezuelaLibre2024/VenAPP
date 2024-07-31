package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f19253a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19254b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f19255c;

    /* renamed from: d, reason: collision with root package name */
    private final eb.t f19256d;

    /* renamed from: e, reason: collision with root package name */
    private long f19257e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19258f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture<?> f19259g;

    /* loaded from: classes3.dex */
    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!x1.this.f19258f) {
                x1.this.f19259g = null;
                return;
            }
            long j10 = x1.this.j();
            if (x1.this.f19257e - j10 > 0) {
                x1 x1Var = x1.this;
                x1Var.f19259g = x1Var.f19253a.schedule(new c(), x1.this.f19257e - j10, TimeUnit.NANOSECONDS);
            } else {
                x1.this.f19258f = false;
                x1.this.f19259g = null;
                x1.this.f19255c.run();
            }
        }
    }

    /* loaded from: classes3.dex */
    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x1.this.f19254b.execute(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, eb.t tVar) {
        this.f19255c = runnable;
        this.f19254b = executor;
        this.f19253a = scheduledExecutorService;
        this.f19256d = tVar;
        tVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f19256d.d(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        this.f19258f = false;
        if (!z10 || (scheduledFuture = this.f19259g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f19259g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        long j11 = j() + nanos;
        this.f19258f = true;
        if (j11 - this.f19257e < 0 || this.f19259g == null) {
            ScheduledFuture<?> scheduledFuture = this.f19259g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f19259g = this.f19253a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f19257e = j11;
    }
}
