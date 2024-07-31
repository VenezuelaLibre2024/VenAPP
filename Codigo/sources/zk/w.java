package zk;

import gk.Continuation;

/* loaded from: classes3.dex */
final class w<T> extends d2 implements v<T> {
    public w(w1 w1Var) {
        super(true);
        b0(w1Var);
    }

    @Override // zk.v
    public boolean B(T t10) {
        return l0(t10);
    }

    @Override // zk.d2
    public boolean V() {
        return true;
    }

    @Override // zk.r0
    public T g() {
        return (T) M();
    }

    @Override // zk.r0
    public Object i0(Continuation<? super T> continuation) {
        Object u10 = u(continuation);
        hk.d.c();
        return u10;
    }

    @Override // zk.v
    public boolean y(Throwable th2) {
        return l0(new a0(th2, false, 2, null));
    }
}
