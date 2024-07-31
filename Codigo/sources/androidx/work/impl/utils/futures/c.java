package androidx.work.impl.utils.futures;

import com.google.common.util.concurrent.f;

/* loaded from: classes.dex */
public final class c<V> extends a<V> {
    private c() {
    }

    public static <V> c<V> s() {
        return new c<>();
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean o(V v10) {
        return super.o(v10);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean p(Throwable th2) {
        return super.p(th2);
    }

    @Override // androidx.work.impl.utils.futures.a
    public boolean q(f<? extends V> fVar) {
        return super.q(fVar);
    }
}
