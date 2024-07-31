package zk;

import gk.Continuation;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes3.dex */
public final class w0<T> extends el.d0<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f32939e = AtomicIntegerFieldUpdater.newUpdater(w0.class, "_decision");
    private volatile int _decision;

    public w0(gk.f fVar, Continuation<? super T> continuation) {
        super(fVar, continuation);
    }

    private final boolean S0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32939e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f32939e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean T0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f32939e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f32939e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // el.d0, zk.a
    protected void N0(Object obj) {
        Continuation b10;
        if (S0()) {
            return;
        }
        b10 = hk.c.b(this.f14761d);
        el.k.c(b10, e0.a(obj, this.f14761d), null, 2, null);
    }

    public final Object R0() {
        Object c10;
        if (T0()) {
            c10 = hk.d.c();
            return c10;
        }
        Object h10 = e2.h(Y());
        if (h10 instanceof a0) {
            throw ((a0) h10).f32837a;
        }
        return h10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // el.d0, zk.d2
    public void t(Object obj) {
        N0(obj);
    }
}
