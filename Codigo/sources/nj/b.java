package nj;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class b<T> extends AtomicInteger implements mj.e<T> {
    private static final long serialVersionUID = -1001730202384742097L;

    @Override // mj.j
    public final boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
