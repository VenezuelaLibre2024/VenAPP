package p317qj;

import dj.AbstractC6985j;
import dj.InterfaceC6987l;
import java.util.concurrent.Callable;
import p123gj.C7579c;
import p123gj.InterfaceC7578b;
import p145hj.C7744b;
import p471yj.C12727a;

/* renamed from: qj.i */
/* loaded from: classes3.dex */
public final class CallableC10503i<T> extends AbstractC6985j<T> implements Callable<T> {

    /* renamed from: a */
    final Callable<? extends T> f26114a;

    public CallableC10503i(Callable<? extends T> callable) {
        this.f26114a = callable;
    }

    @Override // java.util.concurrent.Callable
    public T call() {
        return this.f26114a.call();
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        InterfaceC7578b m23025b = C7579c.m23025b();
        interfaceC6987l.mo20279b(m23025b);
        if (m23025b.mo616h()) {
            return;
        }
        try {
            T call = this.f26114a.call();
            if (m23025b.mo616h()) {
                return;
            }
            if (call == null) {
                interfaceC6987l.mo20278a();
            } else {
                interfaceC6987l.onSuccess(call);
            }
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            if (m23025b.mo616h()) {
                C12727a.m41995q(th2);
            } else {
                interfaceC6987l.onError(th2);
            }
        }
    }
}
