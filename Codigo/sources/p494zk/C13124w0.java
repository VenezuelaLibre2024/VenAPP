package p494zk;

import hk.C7751c;
import hk.C7752d;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p089el.C7215d0;
import p089el.C7228k;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;

/* renamed from: zk.w0 */
/* loaded from: classes3.dex */
public final class C13124w0<T> extends C7215d0<T> {

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f35490e = AtomicIntegerFieldUpdater.newUpdater(C13124w0.class, "_decision");
    private volatile int _decision;

    public C13124w0(InterfaceC7587f interfaceC7587f, Continuation<? super T> continuation) {
        super(interfaceC7587f, continuation);
    }

    /* renamed from: S0 */
    private final boolean m43309S0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35490e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f35490e.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: T0 */
    private final boolean m43310T0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35490e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f35490e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p089el.C7215d0, p494zk.AbstractC13032a
    /* renamed from: N0 */
    protected void mo21550N0(Object obj) {
        Continuation m23654b;
        if (m43309S0()) {
            return;
        }
        m23654b = C7751c.m23654b(this.f16184d);
        C7228k.m21597c(m23654b, C13052e0.m43147a(obj, this.f16184d), null, 2, null);
    }

    /* renamed from: R0 */
    public final Object m43311R0() {
        Object m23655c;
        if (m43310T0()) {
            m23655c = C7752d.m23655c();
            return m23655c;
        }
        Object m43158h = C13054e2.m43158h(m43113Y());
        if (m43158h instanceof C13033a0) {
            throw ((C13033a0) m43158h).f35388a;
        }
        return m43158h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p089el.C7215d0, p494zk.C13050d2
    /* renamed from: t */
    public void mo21552t(Object obj) {
        mo21550N0(obj);
    }
}
