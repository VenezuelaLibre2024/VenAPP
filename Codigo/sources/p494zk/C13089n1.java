package p494zk;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p089el.C7212c;
import p124gk.InterfaceC7587f;

/* renamed from: zk.n1 */
/* loaded from: classes3.dex */
public final class C13089n1 extends AbstractC13085m1 implements InterfaceC13112t0 {

    /* renamed from: d */
    private final Executor f35467d;

    public C13089n1(Executor executor) {
        this.f35467d = executor;
        C7212c.m21543a(m43272J0());
    }

    /* renamed from: I0 */
    private final void m43270I0(InterfaceC7587f interfaceC7587f, RejectedExecutionException rejectedExecutionException) {
        C13035a2.m43044c(interfaceC7587f, C13081l1.m43234a("The task was rejected", rejectedExecutionException));
    }

    /* renamed from: L0 */
    private final ScheduledFuture<?> m43271L0(ScheduledExecutorService scheduledExecutorService, Runnable runnable, InterfaceC7587f interfaceC7587f, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            m43270I0(interfaceC7587f, e10);
            return null;
        }
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: D0 */
    public void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        try {
            Executor m43272J0 = m43272J0();
            C13042c.m43062a();
            m43272J0.execute(runnable);
        } catch (RejectedExecutionException e10) {
            C13042c.m43062a();
            m43270I0(interfaceC7587f, e10);
            C13034a1.m43040b().mo625D0(interfaceC7587f, runnable);
        }
    }

    /* renamed from: J0 */
    public Executor m43272J0() {
        return this.f35467d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor m43272J0 = m43272J0();
        ExecutorService executorService = m43272J0 instanceof ExecutorService ? (ExecutorService) m43272J0 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13089n1) && ((C13089n1) obj).m43272J0() == m43272J0();
    }

    public int hashCode() {
        return System.identityHashCode(m43272J0());
    }

    @Override // p494zk.InterfaceC13112t0
    /* renamed from: o */
    public InterfaceC13044c1 mo629o(long j10, Runnable runnable, InterfaceC7587f interfaceC7587f) {
        Executor m43272J0 = m43272J0();
        ScheduledExecutorService scheduledExecutorService = m43272J0 instanceof ScheduledExecutorService ? (ScheduledExecutorService) m43272J0 : null;
        ScheduledFuture<?> m43271L0 = scheduledExecutorService != null ? m43271L0(scheduledExecutorService, runnable, interfaceC7587f, j10) : null;
        return m43271L0 != null ? new C13039b1(m43271L0) : RunnableC13096p0.f35470t.mo629o(j10, runnable, interfaceC7587f);
    }

    @Override // p494zk.AbstractC13064h0
    public String toString() {
        return m43272J0().toString();
    }
}
