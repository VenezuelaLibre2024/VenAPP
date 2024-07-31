package uj;

import dj.r;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class e extends r.b {

    /* renamed from: a */
    private final ScheduledExecutorService f27740a;

    /* renamed from: b */
    volatile boolean f27741b;

    public e(ThreadFactory threadFactory) {
        this.f27740a = i.a(threadFactory);
    }

    @Override // dj.r.b
    public gj.b b(Runnable runnable) {
        return c(runnable, 0L, null);
    }

    @Override // dj.r.b
    public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f27741b ? kj.c.INSTANCE : d(runnable, j10, timeUnit, null);
    }

    public h d(Runnable runnable, long j10, TimeUnit timeUnit, kj.a aVar) {
        h hVar = new h(yj.a.s(runnable), aVar);
        if (aVar != null && !aVar.b(hVar)) {
            return hVar;
        }
        try {
            hVar.a(j10 <= 0 ? this.f27740a.submit((Callable) hVar) : this.f27740a.schedule((Callable) hVar, j10, timeUnit));
        } catch (RejectedExecutionException e10) {
            if (aVar != null) {
                aVar.a(hVar);
            }
            yj.a.q(e10);
        }
        return hVar;
    }

    @Override // gj.b
    public void dispose() {
        if (this.f27741b) {
            return;
        }
        this.f27741b = true;
        this.f27740a.shutdownNow();
    }

    public gj.b e(Runnable runnable, long j10, TimeUnit timeUnit) {
        g gVar = new g(yj.a.s(runnable));
        try {
            gVar.a(j10 <= 0 ? this.f27740a.submit(gVar) : this.f27740a.schedule(gVar, j10, timeUnit));
            return gVar;
        } catch (RejectedExecutionException e10) {
            yj.a.q(e10);
            return kj.c.INSTANCE;
        }
    }

    public void f() {
        if (this.f27741b) {
            return;
        }
        this.f27741b = true;
        this.f27740a.shutdown();
    }

    @Override // gj.b
    public boolean h() {
        return this.f27741b;
    }
}
