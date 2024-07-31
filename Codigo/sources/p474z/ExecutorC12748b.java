package p474z;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z.b */
/* loaded from: classes.dex */
public final class ExecutorC12748b implements Executor {

    /* renamed from: a */
    private static volatile ExecutorC12748b f34761a;

    ExecutorC12748b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m42286a() {
        if (f34761a != null) {
            return f34761a;
        }
        synchronized (ExecutorC12748b.class) {
            if (f34761a == null) {
                f34761a = new ExecutorC12748b();
            }
        }
        return f34761a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
