package p310qc;

import java.util.concurrent.Executor;

/* renamed from: qc.j */
/* loaded from: classes.dex */
public class C10428j {

    /* renamed from: qc.j$a */
    /* loaded from: classes.dex */
    private enum a implements Executor {
        INSTANCE;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m31228a() {
        return a.INSTANCE;
    }

    /* renamed from: b */
    public static Executor m31229b(Executor executor, int i10) {
        return new ExecutorC10430l(executor, i10);
    }

    /* renamed from: c */
    public static Executor m31230c(Executor executor) {
        return new ExecutorC10431m(executor);
    }
}
