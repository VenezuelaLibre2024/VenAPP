package qj;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class i<T> extends dj.j<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable<? extends T> f24072a;

    public i(Callable<? extends T> callable) {
        this.f24072a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return this.f24072a.call();
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        gj.b b10 = gj.c.b();
        lVar.b(b10);
        if (b10.h()) {
            return;
        }
        try {
            T call = this.f24072a.call();
            if (b10.h()) {
                return;
            }
            if (call == null) {
                lVar.a();
            } else {
                lVar.onSuccess(call);
            }
        } catch (Throwable th2) {
            hj.b.b(th2);
            if (b10.h()) {
                yj.a.q(th2);
            } else {
                lVar.onError(th2);
            }
        }
    }
}
