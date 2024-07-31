package p132h6;

import java.util.concurrent.Executor;
import p215l6.C9399a;

/* renamed from: h6.n */
/* loaded from: classes.dex */
class ExecutorC7644n implements Executor {

    /* renamed from: a */
    private final Executor f18087a;

    /* renamed from: h6.n$a */
    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: a */
        private final Runnable f18088a;

        a(Runnable runnable) {
            this.f18088a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f18088a.run();
            } catch (Exception e10) {
                C9399a.m27991d("Executor", "Background execution failure.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC7644n(Executor executor) {
        this.f18087a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f18087a.execute(new a(runnable));
    }
}
