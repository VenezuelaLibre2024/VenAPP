package p494zk;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C9322n;
import p124gk.InterfaceC7587f;
import p494zk.AbstractC13065h1;
import uk.C11585l;

/* renamed from: zk.p0 */
/* loaded from: classes3.dex */
public final class RunnableC13096p0 extends AbstractC13065h1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: t */
    public static final RunnableC13096p0 f35470t;

    /* renamed from: u */
    private static final long f35471u;

    static {
        Long l10;
        RunnableC13096p0 runnableC13096p0 = new RunnableC13096p0();
        f35470t = runnableC13096p0;
        AbstractC13061g1.m43175Y0(runnableC13096p0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f35471u = timeUnit.toNanos(l10.longValue());
    }

    private RunnableC13096p0() {
    }

    /* renamed from: L1 */
    private final synchronized void m43280L1() {
        if (m43283O1()) {
            debugStatus = 3;
            m43204F1();
            C9322n.m27779c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* renamed from: M1 */
    private final synchronized Thread m43281M1() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: N1 */
    private final boolean m43282N1() {
        return debugStatus == 4;
    }

    /* renamed from: O1 */
    private final boolean m43283O1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    /* renamed from: P1 */
    private final synchronized boolean m43284P1() {
        if (m43283O1()) {
            return false;
        }
        debugStatus = 1;
        C9322n.m27779c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    /* renamed from: Q1 */
    private final void m43285Q1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p494zk.AbstractC13065h1
    /* renamed from: A1 */
    public void mo43202A1(Runnable runnable) {
        if (m43282N1()) {
            m43285Q1();
        }
        super.mo43202A1(runnable);
    }

    @Override // p494zk.AbstractC13065h1, p494zk.InterfaceC13112t0
    /* renamed from: o */
    public InterfaceC13044c1 mo629o(long j10, Runnable runnable, InterfaceC7587f interfaceC7587f) {
        return m43206I1(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m43203D1;
        C13110s2.f35479a.m43299d(this);
        C13042c.m43062a();
        try {
            if (!m43284P1()) {
                if (m43203D1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long mo43182c1 = mo43182c1();
                if (mo43182c1 == Long.MAX_VALUE) {
                    C13042c.m43062a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f35471u + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        m43280L1();
                        C13042c.m43062a();
                        if (m43203D1()) {
                            return;
                        }
                        mo43162u1();
                        return;
                    }
                    mo43182c1 = C11585l.m36296e(mo43182c1, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (mo43182c1 > 0) {
                    if (m43283O1()) {
                        _thread = null;
                        m43280L1();
                        C13042c.m43062a();
                        if (m43203D1()) {
                            return;
                        }
                        mo43162u1();
                        return;
                    }
                    C13042c.m43062a();
                    LockSupport.parkNanos(this, mo43182c1);
                }
            }
        } finally {
            _thread = null;
            m43280L1();
            C13042c.m43062a();
            if (!m43203D1()) {
                mo43162u1();
            }
        }
    }

    @Override // p494zk.AbstractC13065h1, p494zk.AbstractC13061g1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p494zk.AbstractC13069i1
    /* renamed from: u1 */
    protected Thread mo43162u1() {
        Thread thread = _thread;
        return thread == null ? m43281M1() : thread;
    }

    @Override // p494zk.AbstractC13069i1
    /* renamed from: v1 */
    protected void mo43213v1(long j10, AbstractC13065h1.b bVar) {
        m43285Q1();
    }
}
