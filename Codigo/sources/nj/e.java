package nj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e extends AtomicReference<gj.b> implements dj.c, gj.b {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // dj.c
    public void a() {
        lazySet(kj.b.DISPOSED);
    }

    @Override // dj.c
    public void b(gj.b bVar) {
        kj.b.o(this, bVar);
    }

    @Override // gj.b
    public void dispose() {
        kj.b.b(this);
    }

    @Override // gj.b
    public boolean h() {
        return get() == kj.b.DISPOSED;
    }

    @Override // dj.c
    public void onError(Throwable th2) {
        lazySet(kj.b.DISPOSED);
        yj.a.q(new hj.d(th2));
    }
}
