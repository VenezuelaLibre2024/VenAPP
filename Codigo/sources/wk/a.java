package wk;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<d<T>> f30182a;

    public a(d<? extends T> sequence) {
        n.e(sequence, "sequence");
        this.f30182a = new AtomicReference<>(sequence);
    }

    @Override // wk.d
    public Iterator<T> iterator() {
        d<T> andSet = this.f30182a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
