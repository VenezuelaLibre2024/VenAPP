package kj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class e extends AtomicReference<gj.b> implements gj.b {
    private static final long serialVersionUID = -754898800686245608L;

    public boolean a(gj.b bVar) {
        return b.l(this, bVar);
    }

    public boolean b(gj.b bVar) {
        return b.n(this, bVar);
    }

    @Override // gj.b
    public void dispose() {
        b.b(this);
    }

    @Override // gj.b
    public boolean h() {
        return b.i(get());
    }
}
