package zk;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class f<T> extends a<T> {

    /* renamed from: d, reason: collision with root package name */
    private final Thread f32880d;

    /* renamed from: e, reason: collision with root package name */
    private final g1 f32881e;

    public f(gk.f fVar, Thread thread, g1 g1Var) {
        super(fVar, true, true);
        this.f32880d = thread;
        this.f32881e = g1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T R0() {
        c.a();
        try {
            g1 g1Var = this.f32881e;
            if (g1Var != null) {
                g1.Y0(g1Var, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    g1 g1Var2 = this.f32881e;
                    long c12 = g1Var2 != null ? g1Var2.c1() : Long.MAX_VALUE;
                    if (d0()) {
                        c.a();
                        T t10 = (T) e2.h(Y());
                        r3 = t10 instanceof a0 ? (a0) t10 : null;
                        if (r3 == null) {
                            return t10;
                        }
                        throw r3.f32837a;
                    }
                    c.a();
                    LockSupport.parkNanos(this, c12);
                } finally {
                    g1 g1Var3 = this.f32881e;
                    if (g1Var3 != null) {
                        g1.J0(g1Var3, false, 1, null);
                    }
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            w(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            c.a();
            throw th2;
        }
    }

    @Override // zk.d2
    protected boolean e0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // zk.d2
    public void t(Object obj) {
        if (kotlin.jvm.internal.n.a(Thread.currentThread(), this.f32880d)) {
            return;
        }
        Thread thread = this.f32880d;
        c.a();
        LockSupport.unpark(thread);
    }
}
