package p310qc;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import p294pc.C10135d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qc.l */
/* loaded from: classes.dex */
public class ExecutorC10430l implements Executor {

    /* renamed from: a */
    private final Executor f25970a;

    /* renamed from: b */
    private final Semaphore f25971b;

    /* renamed from: c */
    private final LinkedBlockingQueue<Runnable> f25972c = new LinkedBlockingQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExecutorC10430l(Executor executor, int i10) {
        C10135d0.m30302a(i10 > 0, "concurrency must be positive.");
        this.f25970a = executor;
        this.f25971b = new Semaphore(i10, true);
    }

    /* renamed from: b */
    private Runnable m31232b(final Runnable runnable) {
        return new Runnable() { // from class: qc.k
            @Override // java.lang.Runnable
            public final void run() {
                ExecutorC10430l.this.m31233c(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m31233c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f25971b.release();
            m31234d();
        }
    }

    /* renamed from: d */
    private void m31234d() {
        while (this.f25971b.tryAcquire()) {
            Runnable poll = this.f25972c.poll();
            if (poll == null) {
                this.f25971b.release();
                return;
            }
            this.f25970a.execute(m31232b(poll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f25972c.offer(runnable);
        m31234d();
    }
}
