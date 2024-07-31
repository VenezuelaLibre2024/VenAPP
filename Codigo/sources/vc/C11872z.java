package vc;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import sc.C10889g;

/* renamed from: vc.z */
/* loaded from: classes.dex */
public final class C11872z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.z$a */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f31373a;

        /* renamed from: b */
        final /* synthetic */ AtomicLong f31374b;

        /* renamed from: vc.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C13260a extends AbstractRunnableC11829d {

            /* renamed from: a */
            final /* synthetic */ Runnable f31375a;

            C13260a(Runnable runnable) {
                this.f31375a = runnable;
            }

            @Override // vc.AbstractRunnableC11829d
            /* renamed from: a */
            public void mo37693a() {
                this.f31375a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f31373a = str;
            this.f31374b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C13260a(runnable));
            newThread.setName(this.f31373a + this.f31374b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vc.z$b */
    /* loaded from: classes.dex */
    public class b extends AbstractRunnableC11829d {

        /* renamed from: a */
        final /* synthetic */ String f31377a;

        /* renamed from: b */
        final /* synthetic */ ExecutorService f31378b;

        /* renamed from: c */
        final /* synthetic */ long f31379c;

        /* renamed from: d */
        final /* synthetic */ TimeUnit f31380d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f31377a = str;
            this.f31378b = executorService;
            this.f31379c = j10;
            this.f31380d = timeUnit;
        }

        @Override // vc.AbstractRunnableC11829d
        /* renamed from: a */
        public void mo37693a() {
            try {
                C10889g.m33216f().m33217b("Executing shutdown hook for " + this.f31377a);
                this.f31378b.shutdown();
                if (this.f31378b.awaitTermination(this.f31379c, this.f31380d)) {
                    return;
                }
                C10889g.m33216f().m33217b(this.f31377a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f31378b.shutdownNow();
            } catch (InterruptedException unused) {
                C10889g.m33216f().m33217b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f31377a));
                this.f31378b.shutdownNow();
            }
        }
    }

    /* renamed from: a */
    private static void m37957a(String str, ExecutorService executorService) {
        m37958b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    private static void m37958b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    /* renamed from: c */
    public static ExecutorService m37959c(String str) {
        ExecutorService m37961e = m37961e(m37960d(str), new ThreadPoolExecutor.DiscardPolicy());
        m37957a(str, m37961e);
        return m37961e;
    }

    /* renamed from: d */
    public static ThreadFactory m37960d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    /* renamed from: e */
    private static ExecutorService m37961e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
