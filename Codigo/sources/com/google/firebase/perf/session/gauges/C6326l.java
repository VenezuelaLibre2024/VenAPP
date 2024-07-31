package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.C6338l;
import com.google.firebase.perf.util.C6341o;
import com.google.firebase.perf.util.EnumC6337k;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p444xe.C12469b;
import re.C10696a;

/* renamed from: com.google.firebase.perf.session.gauges.l */
/* loaded from: classes.dex */
public class C6326l {

    /* renamed from: f */
    private static final C10696a f13588f = C10696a.m32565e();

    /* renamed from: a */
    private final ScheduledExecutorService f13589a;

    /* renamed from: b */
    public final ConcurrentLinkedQueue<C12469b> f13590b;

    /* renamed from: c */
    private final Runtime f13591c;

    /* renamed from: d */
    private ScheduledFuture f13592d;

    /* renamed from: e */
    private long f13593e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6326l() {
        this(Executors.newSingleThreadScheduledExecutor(), Runtime.getRuntime());
    }

    C6326l(ScheduledExecutorService scheduledExecutorService, Runtime runtime) {
        this.f13592d = null;
        this.f13593e = -1L;
        this.f13589a = scheduledExecutorService;
        this.f13590b = new ConcurrentLinkedQueue<>();
        this.f13591c = runtime;
    }

    /* renamed from: d */
    private int m17498d() {
        return C6341o.m17542c(EnumC6337k.BYTES.m17527b(this.f13591c.totalMemory() - this.f13591c.freeMemory()));
    }

    /* renamed from: e */
    public static boolean m17499e(long j10) {
        return j10 <= 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m17500f(C6338l c6338l) {
        C12469b m17504l = m17504l(c6338l);
        if (m17504l != null) {
            this.f13590b.add(m17504l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m17501g(C6338l c6338l) {
        C12469b m17504l = m17504l(c6338l);
        if (m17504l != null) {
            this.f13590b.add(m17504l);
        }
    }

    /* renamed from: h */
    private synchronized void m17502h(final C6338l c6338l) {
        try {
            this.f13589a.schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.k
                @Override // java.lang.Runnable
                public final void run() {
                    C6326l.this.m17500f(c6338l);
                }
            }, 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f13588f.m32574j("Unable to collect Memory Metric: " + e10.getMessage());
        }
    }

    /* renamed from: i */
    private synchronized void m17503i(long j10, final C6338l c6338l) {
        this.f13593e = j10;
        try {
            this.f13592d = this.f13589a.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.j
                @Override // java.lang.Runnable
                public final void run() {
                    C6326l.this.m17501g(c6338l);
                }
            }, 0L, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            f13588f.m32574j("Unable to start collecting Memory Metrics: " + e10.getMessage());
        }
    }

    /* renamed from: l */
    private C12469b m17504l(C6338l c6338l) {
        if (c6338l == null) {
            return null;
        }
        return C12469b.m40505e0().m40508I(c6338l.m17531b()).m40509J(m17498d()).build();
    }

    /* renamed from: c */
    public void m17505c(C6338l c6338l) {
        m17502h(c6338l);
    }

    /* renamed from: j */
    public void m17506j(long j10, C6338l c6338l) {
        if (m17499e(j10)) {
            return;
        }
        if (this.f13592d == null) {
            m17503i(j10, c6338l);
        } else if (this.f13593e != j10) {
            m17507k();
            m17503i(j10, c6338l);
        }
    }

    /* renamed from: k */
    public void m17507k() {
        ScheduledFuture scheduledFuture = this.f13592d;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f13592d = null;
        this.f13593e = -1L;
    }
}
