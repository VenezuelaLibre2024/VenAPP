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

/* loaded from: classes.dex */
public final class z {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28939a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f28940b;

        /* renamed from: vc.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0466a extends d {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f28941a;

            C0466a(Runnable runnable) {
                this.f28941a = runnable;
            }

            @Override // vc.d
            public void a() {
                this.f28941a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f28939a = str;
            this.f28940b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0466a(runnable));
            newThread.setName(this.f28939a + this.f28940b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f28943a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExecutorService f28944b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f28945c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TimeUnit f28946d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f28943a = str;
            this.f28944b = executorService;
            this.f28945c = j10;
            this.f28946d = timeUnit;
        }

        @Override // vc.d
        public void a() {
            try {
                sc.g.f().b("Executing shutdown hook for " + this.f28943a);
                this.f28944b.shutdown();
                if (this.f28944b.awaitTermination(this.f28945c, this.f28946d)) {
                    return;
                }
                sc.g.f().b(this.f28943a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f28944b.shutdownNow();
            } catch (InterruptedException unused) {
                sc.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f28943a));
                this.f28944b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j10, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e10 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e10);
        return e10;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
