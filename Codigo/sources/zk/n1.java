package zk;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class n1 extends m1 implements t0 {

    /* renamed from: d */
    private final Executor f32916d;

    public n1(Executor executor) {
        this.f32916d = executor;
        el.c.a(J0());
    }

    private final void I0(gk.f fVar, RejectedExecutionException rejectedExecutionException) {
        a2.c(fVar, l1.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> L0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, gk.f fVar, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            I0(fVar, e10);
            return null;
        }
    }

    @Override // zk.h0
    public void D0(gk.f fVar, Runnable runnable) {
        try {
            Executor J0 = J0();
            c.a();
            J0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            c.a();
            I0(fVar, e10);
            a1.b().D0(fVar, runnable);
        }
    }

    public Executor J0() {
        return this.f32916d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor J0 = J0();
        ExecutorService executorService = J0 instanceof ExecutorService ? (ExecutorService) J0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof n1) && ((n1) obj).J0() == J0();
    }

    public int hashCode() {
        return System.identityHashCode(J0());
    }

    @Override // zk.t0
    public c1 o(long j10, Runnable runnable, gk.f fVar) {
        Executor J0 = J0();
        ScheduledExecutorService scheduledExecutorService = J0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) J0 : null;
        ScheduledFuture<?> L0 = scheduledExecutorService != null ? L0(scheduledExecutorService, runnable, fVar, j10) : null;
        return L0 != null ? new b1(L0) : p0.f32919t.o(j10, runnable, fVar);
    }

    @Override // zk.h0
    public String toString() {
        return J0().toString();
    }
}
