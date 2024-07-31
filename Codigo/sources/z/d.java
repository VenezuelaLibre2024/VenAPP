package z;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class d implements Executor {

    /* renamed from: b, reason: collision with root package name */
    private static volatile Executor f32223b;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f32224a = Executors.newSingleThreadExecutor(new a());

    /* loaded from: classes.dex */
    class a implements ThreadFactory {
        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        if (f32223b != null) {
            return f32223b;
        }
        synchronized (d.class) {
            if (f32223b == null) {
                f32223b = new d();
            }
        }
        return f32223b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f32224a.execute(runnable);
    }
}
