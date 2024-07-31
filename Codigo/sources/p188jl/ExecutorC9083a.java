package p188jl;

import java.util.concurrent.Executor;

/* renamed from: jl.a */
/* loaded from: classes3.dex */
final class ExecutorC9083a implements Executor {

    /* renamed from: a */
    public static final ExecutorC9083a f21768a = new ExecutorC9083a();

    private ExecutorC9083a() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
