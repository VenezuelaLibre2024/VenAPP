package zk;

/* loaded from: classes3.dex */
final class d1 extends k {

    /* renamed from: a, reason: collision with root package name */
    private final c1 f32850a;

    public d1(c1 c1Var) {
        this.f32850a = c1Var;
    }

    @Override // zk.l
    public void d(Throwable th2) {
        this.f32850a.dispose();
    }

    @Override // ok.l
    public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
        d(th2);
        return ck.v.f7137a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f32850a + ']';
    }
}
