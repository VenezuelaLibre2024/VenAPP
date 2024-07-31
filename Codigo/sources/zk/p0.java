package zk;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import zk.h1;

/* loaded from: classes3.dex */
public final class p0 extends h1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: t, reason: collision with root package name */
    public static final p0 f32919t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f32920u;

    static {
        Long l10;
        p0 p0Var = new p0();
        f32919t = p0Var;
        g1.Y0(p0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f32920u = timeUnit.toNanos(l10.longValue());
    }

    private p0() {
    }

    private final synchronized void L1() {
        if (O1()) {
            debugStatus = 3;
            F1();
            kotlin.jvm.internal.n.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread M1() {
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

    private final boolean N1() {
        return debugStatus == 4;
    }

    private final boolean O1() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean P1() {
        if (O1()) {
            return false;
        }
        debugStatus = 1;
        kotlin.jvm.internal.n.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void Q1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // zk.h1
    public void A1(Runnable runnable) {
        if (N1()) {
            Q1();
        }
        super.A1(runnable);
    }

    @Override // zk.h1, zk.t0
    public c1 o(long j10, Runnable runnable, gk.f fVar) {
        return I1(j10, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean D1;
        s2.f32928a.d(this);
        c.a();
        try {
            if (!P1()) {
                if (D1) {
                    return;
                } else {
                    return;
                }
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long c12 = c1();
                if (c12 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f32920u + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        L1();
                        c.a();
                        if (D1()) {
                            return;
                        }
                        u1();
                        return;
                    }
                    c12 = uk.l.e(c12, j11);
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (c12 > 0) {
                    if (O1()) {
                        _thread = null;
                        L1();
                        c.a();
                        if (D1()) {
                            return;
                        }
                        u1();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, c12);
                }
            }
        } finally {
            _thread = null;
            L1();
            c.a();
            if (!D1()) {
                u1();
            }
        }
    }

    @Override // zk.h1, zk.g1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // zk.i1
    protected Thread u1() {
        Thread thread = _thread;
        return thread == null ? M1() : thread;
    }

    @Override // zk.i1
    protected void v1(long j10, h1.b bVar) {
        Q1();
    }
}
