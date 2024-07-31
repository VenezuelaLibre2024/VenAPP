package uj;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class a extends AtomicReference<Future<?>> implements gj.b {

    /* renamed from: c, reason: collision with root package name */
    protected static final FutureTask<Void> f27702c;

    /* renamed from: d, reason: collision with root package name */
    protected static final FutureTask<Void> f27703d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: a, reason: collision with root package name */
    protected final Runnable f27704a;

    /* renamed from: b, reason: collision with root package name */
    protected Thread f27705b;

    static {
        Runnable runnable = lj.a.f21261b;
        f27702c = new FutureTask<>(runnable, null);
        f27703d = new FutureTask<>(runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Runnable runnable) {
        this.f27704a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f27702c) {
                return;
            }
            if (future2 == f27703d) {
                future.cancel(this.f27705b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // gj.b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f27702c || future == (futureTask = f27703d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f27705b != Thread.currentThread());
    }

    @Override // gj.b
    public final boolean h() {
        Future<?> future = get();
        return future == f27702c || future == f27703d;
    }
}
