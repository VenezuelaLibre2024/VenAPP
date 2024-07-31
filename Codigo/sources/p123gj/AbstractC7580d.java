package p123gj;

import java.util.concurrent.atomic.AtomicReference;
import p224lj.C9513b;

/* renamed from: gj.d */
/* loaded from: classes3.dex */
abstract class AbstractC7580d<T> extends AtomicReference<T> implements InterfaceC7578b {
    private static final long serialVersionUID = 6537757548749041217L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC7580d(T t10) {
        super(C9513b.m28324d(t10, "value is null"));
    }

    /* renamed from: a */
    protected abstract void mo23027a(T t10);

    @Override // p123gj.InterfaceC7578b
    public final void dispose() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        mo23027a(andSet);
    }

    @Override // p123gj.InterfaceC7578b
    /* renamed from: h */
    public final boolean mo616h() {
        return get() == null;
    }
}
