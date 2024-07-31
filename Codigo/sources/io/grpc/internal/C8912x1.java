package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p082eb.C7164t;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.x1 */
/* loaded from: classes3.dex */
public final class C8912x1 {

    /* renamed from: a */
    private final ScheduledExecutorService f21000a;

    /* renamed from: b */
    private final Executor f21001b;

    /* renamed from: c */
    private final Runnable f21002c;

    /* renamed from: d */
    private final C7164t f21003d;

    /* renamed from: e */
    private long f21004e;

    /* renamed from: f */
    private boolean f21005f;

    /* renamed from: g */
    private ScheduledFuture<?> f21006g;

    /* renamed from: io.grpc.internal.x1$b */
    /* loaded from: classes3.dex */
    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!C8912x1.this.f21005f) {
                C8912x1.this.f21006g = null;
                return;
            }
            long m25936j = C8912x1.this.m25936j();
            if (C8912x1.this.f21004e - m25936j > 0) {
                C8912x1 c8912x1 = C8912x1.this;
                c8912x1.f21006g = c8912x1.f21000a.schedule(new c(), C8912x1.this.f21004e - m25936j, TimeUnit.NANOSECONDS);
            } else {
                C8912x1.this.f21005f = false;
                C8912x1.this.f21006g = null;
                C8912x1.this.f21002c.run();
            }
        }
    }

    /* renamed from: io.grpc.internal.x1$c */
    /* loaded from: classes3.dex */
    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8912x1.this.f21001b.execute(new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8912x1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C7164t c7164t) {
        this.f21002c = runnable;
        this.f21001b = executor;
        this.f21000a = scheduledExecutorService;
        this.f21003d = c7164t;
        c7164t.m21347g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public long m25936j() {
        return this.f21003d.m21345d(TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m25937i(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        this.f21005f = false;
        if (!z10 || (scheduledFuture = this.f21006g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f21006g = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m25938k(long j10, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j10);
        long m25936j = m25936j() + nanos;
        this.f21005f = true;
        if (m25936j - this.f21004e < 0 || this.f21006g == null) {
            ScheduledFuture<?> scheduledFuture = this.f21006g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f21006g = this.f21000a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f21004e = m25936j;
    }
}
