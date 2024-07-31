package ma;

import android.os.Process;

/* renamed from: ma.d */
/* loaded from: classes.dex */
final class RunnableC9562d implements Runnable {

    /* renamed from: a */
    private final Runnable f23267a;

    public RunnableC9562d(Runnable runnable, int i10) {
        this.f23267a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f23267a.run();
    }
}
