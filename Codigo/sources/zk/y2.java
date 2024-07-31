package zk;

/* loaded from: classes3.dex */
public final class y2 extends h0 {

    /* renamed from: c, reason: collision with root package name */
    public static final y2 f32945c = new y2();

    private y2() {
    }

    @Override // zk.h0
    public void D0(gk.f fVar, Runnable runnable) {
        c3 c3Var = (c3) fVar.b(c3.f32847c);
        if (c3Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c3Var.f32848b = true;
    }

    @Override // zk.h0
    public boolean F0(gk.f fVar) {
        return false;
    }

    @Override // zk.h0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
