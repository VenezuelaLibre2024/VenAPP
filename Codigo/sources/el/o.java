package el;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import zk.c1;
import zk.t0;

/* loaded from: classes3.dex */
public final class o extends zk.h0 implements t0 {

    /* renamed from: s, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f14792s = AtomicIntegerFieldUpdater.newUpdater(o.class, "runningWorkers");

    /* renamed from: c, reason: collision with root package name */
    private final zk.h0 f14793c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14794d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ t0 f14795e;

    /* renamed from: f, reason: collision with root package name */
    private final t<Runnable> f14796f;

    /* renamed from: r, reason: collision with root package name */
    private final Object f14797r;
    private volatile int runningWorkers;

    /* loaded from: classes3.dex */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private Runnable f14798a;

        public a(Runnable runnable) {
            this.f14798a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f14798a.run();
                } catch (Throwable th2) {
                    zk.j0.a(gk.g.f16294a, th2);
                }
                Runnable L0 = o.this.L0();
                if (L0 == null) {
                    return;
                }
                this.f14798a = L0;
                i10++;
                if (i10 >= 16 && o.this.f14793c.F0(o.this)) {
                    o.this.f14793c.D0(o.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(zk.h0 h0Var, int i10) {
        this.f14793c = h0Var;
        this.f14794d = i10;
        t0 t0Var = h0Var instanceof t0 ? (t0) h0Var : null;
        this.f14795e = t0Var == null ? zk.q0.a() : t0Var;
        this.f14796f = new t<>(false);
        this.f14797r = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable L0() {
        while (true) {
            Runnable d10 = this.f14796f.d();
            if (d10 != null) {
                return d10;
            }
            synchronized (this.f14797r) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14792s;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f14796f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean R0() {
        synchronized (this.f14797r) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14792s;
            if (atomicIntegerFieldUpdater.get(this) >= this.f14794d) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // zk.h0
    public void D0(gk.f fVar, Runnable runnable) {
        Runnable L0;
        this.f14796f.a(runnable);
        if (f14792s.get(this) >= this.f14794d || !R0() || (L0 = L0()) == null) {
            return;
        }
        this.f14793c.D0(this, new a(L0));
    }

    @Override // zk.t0
    public c1 o(long j10, Runnable runnable, gk.f fVar) {
        return this.f14795e.o(j10, runnable, fVar);
    }
}
