package w;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
class m implements Executor {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadFactory f29520c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f29521a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f29522b = b();

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f29523a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f29523a.getAndIncrement())));
            return thread;
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f29520c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: w.l
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                o0.c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(androidx.camera.core.impl.a0 a0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        androidx.core.util.h.k(a0Var);
        synchronized (this.f29521a) {
            if (this.f29522b.isShutdown()) {
                this.f29522b = b();
            }
            threadPoolExecutor = this.f29522b;
        }
        int max = Math.max(1, a0Var.b().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        androidx.core.util.h.k(runnable);
        synchronized (this.f29521a) {
            this.f29522b.execute(runnable);
        }
    }
}
