package zk;

/* loaded from: classes3.dex */
final class t1 extends k {

    /* renamed from: a, reason: collision with root package name */
    private final ok.l<Throwable, ck.v> f32931a;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(ok.l<? super Throwable, ck.v> lVar) {
        this.f32931a = lVar;
    }

    @Override // zk.l
    public void d(Throwable th2) {
        this.f32931a.invoke(th2);
    }

    @Override // ok.l
    public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
        d(th2);
        return ck.v.f7137a;
    }

    public String toString() {
        return "InvokeOnCancel[" + o0.a(this.f32931a) + '@' + o0.b(this) + ']';
    }
}
