package gj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
abstract class d<T> extends AtomicReference<T> implements b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(T t10) {
        super(lj.b.d(t10, "value is null"));
    }

    protected abstract void a(T t10);

    @Override // gj.b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // gj.b
    public final boolean h() {
        return get() == null;
    }
}
