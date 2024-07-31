package p270oa;

import android.os.Process;

/* renamed from: oa.a */
/* loaded from: classes.dex */
final class C9825a extends Thread {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C9825a(ThreadGroup threadGroup, String str) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
