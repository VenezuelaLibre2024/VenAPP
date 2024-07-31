package wj;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class b<T> extends AtomicLong implements mj.g<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // mj.j
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
