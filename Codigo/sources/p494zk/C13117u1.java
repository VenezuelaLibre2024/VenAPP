package p494zk;

import ck.C2037v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p280ok.InterfaceC9998l;

/* renamed from: zk.u1 */
/* loaded from: classes3.dex */
final class C13117u1 extends AbstractC13133y1 {

    /* renamed from: f */
    private static final AtomicIntegerFieldUpdater f35486f = AtomicIntegerFieldUpdater.newUpdater(C13117u1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: e */
    private final InterfaceC9998l<Throwable, C2037v> f35487e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13117u1(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        this.f35487e = interfaceC9998l;
    }

    @Override // p280ok.InterfaceC9998l
    public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
        mo43063v(th2);
        return C2037v.f8089a;
    }

    @Override // p494zk.AbstractC13043c0
    /* renamed from: v */
    public void mo43063v(Throwable th2) {
        if (f35486f.compareAndSet(this, 0, 1)) {
            this.f35487e.invoke(th2);
        }
    }
}
