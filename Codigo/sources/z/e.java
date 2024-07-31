package z;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class e implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f32226b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f32227a = Executors.newFixedThreadPool(2, new a());

    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f32228a = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", Integer.valueOf(this.f32228a.getAndIncrement())));
            return thread;
        }
    }

    e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        if (f32226b != null) {
            return f32226b;
        }
        synchronized (e.class) {
            if (f32226b == null) {
                f32226b = new e();
            }
        }
        return f32226b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f32227a.execute(runnable);
    }
}
