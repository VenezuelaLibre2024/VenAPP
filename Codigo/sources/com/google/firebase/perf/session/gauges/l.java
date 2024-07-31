package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.o;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    private static final re.a f12356f = re.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f12357a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue<xe.b> f12358b;

    /* renamed from: c, reason: collision with root package name */
    private final Runtime f12359c;

    /* renamed from: d, reason: collision with root package name */
    private ScheduledFuture f12360d;

    /* renamed from: e, reason: collision with root package name */
    private long f12361e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f12360d = null;
        this.f12361e = -1L;
        this.f12357a = scheduledExecutorService;
        this.f12358b = new ConcurrentLinkedQueue<>();
        this.f12359c = runtime;
    }

    private int d() {
        return o.c(com.google.firebase.perf.util.k.BYTES.b(this.f12359c.totalMemory() - this.f12359c.freeMemory()));
    }

    public static boolean e(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(com.google.firebase.perf.util.l lVar) {
        xe.b l10 = l(lVar);
        if (l10 != null) {
            this.f12358b.add(l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(com.google.firebase.perf.util.l lVar) {
        xe.b l10 = l(lVar);
        if (l10 != null) {
            this.f12358b.add(l10);
        }
    }

    private synchronized void h(final com.google.firebase.perf.util.l lVar) {
        try {
            this.f12357a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.f(lVar);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f12356f.j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    private synchronized void i(long j10, final com.google.firebase.perf.util.l lVar) {
        this.f12361e = j10;
        try {
            this.f12360d = this.f12357a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.this.g(lVar);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f12356f.j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    private xe.b l(com.google.firebase.perf.util.l lVar) {
        if (lVar == null) {
            return null;
        }
        return xe.b.e0().I(lVar.b()).J(d()).build();
    }

    public void c(com.google.firebase.perf.util.l lVar) {
        h(lVar);
    }

    public void j(long j10, com.google.firebase.perf.util.l lVar) {
        if (e(j10)) {
            return;
        }
        if (this.f12360d == null) {
            i(j10, lVar);
        } else if (this.f12361e != j10) {
            k();
            i(j10, lVar);
        }
    }

    public void k() {
        ScheduledFuture scheduledFuture = this.f12360d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f12360d = null;
        this.f12361e = -1L;
    }
}
