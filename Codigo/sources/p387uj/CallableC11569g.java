package p387uj;

import java.util.concurrent.Callable;

/* renamed from: uj.g */
/* loaded from: classes3.dex */
public final class CallableC11569g extends AbstractC11563a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public CallableC11569g(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f30028b = Thread.currentThread();
        try {
            this.f30027a.run();
            return null;
        } finally {
            lazySet(AbstractC11563a.f30025c);
            this.f30028b = null;
        }
    }
}
