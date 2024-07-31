package ma;

import android.os.Process;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f21413a;

    public d(Runnable runnable, int i10) {
        this.f21413a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f21413a.run();
    }
}
