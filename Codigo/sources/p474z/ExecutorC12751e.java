package p474z;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: z.e */
/* loaded from: classes.dex */
final class ExecutorC12751e implements Executor {

    /* renamed from: b */
    private static volatile Executor f34777b;

    /* renamed from: a */
    private final ExecutorService f34778a = Executors.newFixedThreadPool(2, new a());

    /* renamed from: z.e$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f34779a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f34779a.getAndIncrement())));
            return thread;
        }
    }

    ExecutorC12751e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m42292a() {
        if (f34777b != null) {
            return f34777b;
        }
        synchronized (ExecutorC12751e.class) {
            if (f34777b == null) {
                f34777b = new ExecutorC12751e();
            }
        }
        return f34777b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f34778a.execute(runnable);
    }
}
