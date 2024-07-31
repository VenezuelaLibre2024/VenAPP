package zk;

import ck.n;
import gk.Continuation;

/* loaded from: classes3.dex */
final class n2 extends c2 {

    /* renamed from: e, reason: collision with root package name */
    private final Continuation<ck.v> f32917e;

    /* JADX WARN: Multi-variable type inference failed */
    public n2(Continuation<? super ck.v> continuation) {
        this.f32917e = continuation;
    }

    @Override // ok.l
    public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
        v(th2);
        return ck.v.f7137a;
    }

    @Override // zk.c0
    public void v(Throwable th2) {
        Continuation<ck.v> continuation = this.f32917e;
        n.a aVar = ck.n.f7126b;
        continuation.resumeWith(ck.n.b(ck.v.f7137a));
    }
}
