package p089el;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p089el.AbstractC7217e0;
import p124gk.InterfaceC7587f;
import p494zk.InterfaceC13078k2;

/* renamed from: el.e0 */
/* loaded from: classes3.dex */
public abstract class AbstractC7217e0<S extends AbstractC7217e0<S>> extends AbstractC7216e<S> implements InterfaceC13078k2 {

    /* renamed from: d */
    private static final AtomicIntegerFieldUpdater f16187d = AtomicIntegerFieldUpdater.newUpdater(AbstractC7217e0.class, "cleanedAndPointers");

    /* renamed from: c */
    public final long f16188c;
    private volatile int cleanedAndPointers;

    public AbstractC7217e0(long j10, S s10, int i10) {
        super(s10);
        this.f16188c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // p089el.AbstractC7216e
    /* renamed from: h */
    public boolean mo21560h() {
        return f16187d.get(this) == mo9809n() && !m21561i();
    }

    /* renamed from: m */
    public final boolean m21565m() {
        return f16187d.addAndGet(this, -65536) == mo9809n() && !m21561i();
    }

    /* renamed from: n */
    public abstract int mo9809n();

    /* renamed from: o */
    public abstract void mo9810o(int i10, Throwable th2, InterfaceC7587f interfaceC7587f);

    /* renamed from: p */
    public final void m21566p() {
        if (f16187d.incrementAndGet(this) == mo9809n()) {
            m21563k();
        }
    }

    /* renamed from: q */
    public final boolean m21567q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16187d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != mo9809n() || m21561i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
