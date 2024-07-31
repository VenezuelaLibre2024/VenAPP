package p407w;

import androidx.camera.core.impl.InterfaceC0598a0;
import androidx.core.util.C0984h;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: w.m */
/* loaded from: classes.dex */
class ExecutorC12024m implements Executor {

    /* renamed from: c */
    private static final ThreadFactory f31975c = new a();

    /* renamed from: a */
    private final Object f31976a = new Object();

    /* renamed from: b */
    private ThreadPoolExecutor f31977b = m38633b();

    /* renamed from: w.m$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f31978a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f31978a.getAndIncrement())));
            return thread;
        }
    }

    /* renamed from: b */
    private static ThreadPoolExecutor m38633b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f31975c);
        threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: w.l
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                C12029o0.m38640c("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
            }
        });
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m38635c(InterfaceC0598a0 interfaceC0598a0) {
        ThreadPoolExecutor threadPoolExecutor;
        C0984h.m4833k(interfaceC0598a0);
        synchronized (this.f31976a) {
            if (this.f31977b.isShutdown()) {
                this.f31977b = m38633b();
            }
            threadPoolExecutor = this.f31977b;
        }
        int max = Math.max(1, interfaceC0598a0.mo2800b().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        C0984h.m4833k(runnable);
        synchronized (this.f31976a) {
            this.f31977b.execute(runnable);
        }
    }
}
