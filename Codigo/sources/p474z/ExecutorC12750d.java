package p474z;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: z.d */
/* loaded from: classes.dex */
final class ExecutorC12750d implements Executor {

    /* renamed from: b */
    private static volatile Executor f34774b;

    /* renamed from: a */
    private final ExecutorService f34775a = Executors.newSingleThreadExecutor(new a());

    /* renamed from: z.d$a */
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

    ExecutorC12750d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m42291a() {
        if (f34774b != null) {
            return f34774b;
        }
        synchronized (ExecutorC12750d.class) {
            if (f34774b == null) {
                f34774b = new ExecutorC12750d();
            }
        }
        return f34774b;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f34775a.execute(runnable);
    }
}
