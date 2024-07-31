package p494zk;

import p124gk.InterfaceC7587f;

/* renamed from: zk.y2 */
/* loaded from: classes3.dex */
public final class C13134y2 extends AbstractC13064h0 {

    /* renamed from: c */
    public static final C13134y2 f35496c = new C13134y2();

    private C13134y2() {
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: D0 */
    public void mo625D0(InterfaceC7587f interfaceC7587f, Runnable runnable) {
        C13046c3 c13046c3 = (C13046c3) interfaceC7587f.mo20647b(C13046c3.f35398c);
        if (c13046c3 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c13046c3.f35399b = true;
    }

    @Override // p494zk.AbstractC13064h0
    /* renamed from: F0 */
    public boolean mo626F0(InterfaceC7587f interfaceC7587f) {
        return false;
    }

    @Override // p494zk.AbstractC13064h0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
