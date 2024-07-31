package p387uj;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import p123gj.InterfaceC7578b;
import p224lj.C9512a;

/* renamed from: uj.a */
/* loaded from: classes3.dex */
abstract class AbstractC11563a extends AtomicReference<Future<?>> implements InterfaceC7578b {

    /* renamed from: c */
    protected static final FutureTask<Void> f30025c;

    /* renamed from: d */
    protected static final FutureTask<Void> f30026d;
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: a */
    protected final Runnable f30027a;

    /* renamed from: b */
    protected Thread f30028b;

    static {
        Runnable runnable = C9512a.f23114b;
        f30025c = new FutureTask<>(runnable, null);
        f30026d = new FutureTask<>(runnable, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC11563a(Runnable runnable) {
        this.f30027a = runnable;
    }

    /* renamed from: a */
    public final void m36238a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f30025c) {
                return;
            }
            if (future2 == f30026d) {
                future.cancel(this.f30028b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // p123gj.InterfaceC7578b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f30025c || future == (futureTask = f30026d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f30028b != Thread.currentThread());
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public final boolean mo616h() {
        Future<?> future = get();
        return future == f30025c || future == f30026d;
    }
}
