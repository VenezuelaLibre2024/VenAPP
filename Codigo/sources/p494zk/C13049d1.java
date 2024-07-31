package p494zk;

import ck.C2037v;

/* renamed from: zk.d1 */
/* loaded from: classes3.dex */
final class C13049d1 extends AbstractC13075k {

    /* renamed from: a */
    private final InterfaceC13044c1 f35401a;

    public C13049d1(InterfaceC13044c1 interfaceC13044c1) {
        this.f35401a = interfaceC13044c1;
    }

    @Override // p494zk.AbstractC13079l
    /* renamed from: d */
    public void mo23660d(Throwable th2) {
        this.f35401a.dispose();
    }

    @Override // p280ok.InterfaceC9998l
    public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
        mo23660d(th2);
        return C2037v.f8089a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f35401a + ']';
    }
}
