package el;

import el.e0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zk.k2;

/* loaded from: classes3.dex */
public abstract class e0<S extends e0<S>> extends e<S> implements k2 {

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f14764d = AtomicIntegerFieldUpdater.newUpdater(e0.class, "cleanedAndPointers");

    /* renamed from: c */
    public final long f14765c;
    private volatile int cleanedAndPointers;

    public e0(long j10, S s10, int i10) {
        super(s10);
        this.f14765c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // el.e
    public boolean h() {
        return f14764d.get(this) == n() && !i();
    }

    public final boolean m() {
        return f14764d.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th2, gk.f fVar);

    public final void p() {
        if (f14764d.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14764d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != n() || i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
