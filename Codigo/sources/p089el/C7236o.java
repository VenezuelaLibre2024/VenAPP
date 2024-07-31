package p089el;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p124gk.C7588g;
import p124gk.InterfaceC7587f;
import p494zk.AbstractC13064h0;
import p494zk.C13072j0;
import p494zk.C13100q0;
import p494zk.InterfaceC13044c1;
import p494zk.InterfaceC13112t0;

/* renamed from: el.o */
/* loaded from: classes3.dex */
public final class C7236o extends AbstractC13064h0 implements InterfaceC13112t0 {

    /* renamed from: s */
    private static final AtomicIntegerFieldUpdater f16215s = AtomicIntegerFieldUpdater.newUpdater(C7236o.class, "runningWorkers");

    /* renamed from: c */
    private final AbstractC13064h0 f16216c;

    /* renamed from: d */
    private final int f16217d;

    /* renamed from: e */
    private final /* synthetic */ InterfaceC13112t0 f16218e;

    /* renamed from: f */
    private final C7244t<Runnable> f16219f;

    /* renamed from: r */
    private final Object f16220r;
    private volatile int runningWorkers;

    /* renamed from: el.o$a */
    /* loaded from: classes3.dex */
    private final class a implements Runnable {

        /* renamed from: a */
        private Runnable f16221a;

        public a(Runnable runnable) {
            this.f16221a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f16221a.run();
                } catch (Throwable th2) {
                    C13072j0.m43220a(C7588g.f17931a, th2);
                }
                Runnable m21636L0 = C7236o.this.m21636L0();
                if (m21636L0 == null) {
                    return;
                }
                this.f16221a = m21636L0;
                i10++;
                if (i10 >= 16 && C7236o.this.f16216c.mo626F0(C7236o.this)) {
                    C7236o.this.f16216c.mo625D0(C7236o.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7236o(AbstractC13064h0 abstractC13064h0, int i10) {
        this.f16216c = abstractC13064h0;
        this.f16217d = i10;
        InterfaceC13112t0 interfaceC13112t0 = abstractC13064h0 instanceof InterfaceC13112t0 ? (InterfaceC13112t0) abstractC13064h0 : null;
        this.f16218e = interfaceC13112t0 == null ? C13100q0.m43287a() : interfaceC13112t0;
        this.f16219f = new C7244t<>(false);
        this.f16220r = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public final Runnable m21636L0() {
        while (true) {
            Runnable m21663d = this.f16219f.m21663d();
            if (m21663d != null) {
                return m21663d;
            }
            synchronized (this.f16220r) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16215s;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f16219f.m21662c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* renamed from: R0 */
    private final boolean m21637R0() {
        synchronized (this.f16220r) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f16215s;
            if (atomicIntegerFieldUpdater.get(this) >= this.f16217d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: D0 */
    public void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        Runnable m21636L0;
        this.f16219f.m21660a(runnable);
        if (f16215s.get(this) >= this.f16217d || !m21637R0() || (m21636L0 = m21636L0()) == null) {
            return;
        }
        this.f16216c.mo625D0(this, new a(m21636L0));
    }

    @Override // p494zk.InterfaceC13112t0
    /* renamed from: o */
    public InterfaceC13044c1 mo629o(long j10, Runnable runnable, InterfaceC7587f interfaceC7587f) {
        return this.f16218e.mo629o(j10, runnable, interfaceC7587f);
    }
}
