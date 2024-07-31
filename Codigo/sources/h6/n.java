package h6;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class n implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f16450a;

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Runnable f16451a;

        a(Runnable runnable) {
            this.f16451a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f16451a.run();
            } catch (Exception e10) {
                l6.a.d("Executor", "Background execution failure.", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.f16450a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f16450a.execute(new a(runnable));
    }
}
