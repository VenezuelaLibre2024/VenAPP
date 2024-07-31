package vc;

import android.os.Process;

/* renamed from: vc.d */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC11829d implements Runnable {
    /* renamed from: a */
    protected abstract void mo37693a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        mo37693a();
    }
}
