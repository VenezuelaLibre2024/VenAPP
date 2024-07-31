package qc;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import pc.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f23928a;

    /* renamed from: b, reason: collision with root package name */
    private final Semaphore f23929b;

    /* renamed from: c, reason: collision with root package name */
    private final LinkedBlockingQueue<Runnable> f23930c = new LinkedBlockingQueue<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Executor executor, int i10) {
        d0.a(i10 > 0, "concurrency must be positive.");
        this.f23928a = executor;
        this.f23929b = new Semaphore(i10, true);
    }

    private Runnable b(final Runnable runnable) {
        return new Runnable() { // from class: qc.k
            @Override // java.lang.Runnable
            public final void run() {
                l.this.c(runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        try {
            runnable.run();
        } finally {
            this.f23929b.release();
            d();
        }
    }

    private void d() {
        while (this.f23929b.tryAcquire()) {
            Runnable poll = this.f23930c.poll();
            if (poll == null) {
                this.f23929b.release();
                return;
            }
            this.f23928a.execute(b(poll));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f23930c.offer(runnable);
        d();
    }
}
