package wj;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class a<T> extends AtomicInteger implements mj.g<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    @Override // mj.j
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
