package p494zk;

import ck.C2037v;
import p280ok.InterfaceC9998l;

/* renamed from: zk.t1 */
/* loaded from: classes3.dex */
final class C13113t1 extends AbstractC13075k {

    /* renamed from: a */
    private final InterfaceC9998l<Throwable, C2037v> f35482a;

    /* JADX WARN: Multi-variable type inference failed */
    public C13113t1(InterfaceC9998l<? super Throwable, C2037v> interfaceC9998l) {
        this.f35482a = interfaceC9998l;
    }

    @Override // p494zk.AbstractC13079l
    /* renamed from: d */
    public void mo23660d(Throwable th2) {
        this.f35482a.invoke(th2);
    }

    @Override // p280ok.InterfaceC9998l
    public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
        mo23660d(th2);
        return C2037v.f8089a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C13092o0.m43273a(this.f35482a) + '@' + C13092o0.m43274b(this) + ']';
    }
}
