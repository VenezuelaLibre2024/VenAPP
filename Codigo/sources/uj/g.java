package uj;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class g extends a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public g(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void call() {
        this.f27705b = Thread.currentThread();
        try {
            this.f27704a.run();
            return null;
        } finally {
            lazySet(a.f27702c);
            this.f27705b = null;
        }
    }
}
