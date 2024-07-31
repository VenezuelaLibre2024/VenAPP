package zk;

import ck.n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m2<T> extends c2 {

    /* renamed from: e, reason: collision with root package name */
    private final n<T> f32910e;

    /* JADX WARN: Multi-variable type inference failed */
    public m2(n<? super T> nVar) {
        this.f32910e = nVar;
    }

    @Override // ok.l
    public /* bridge */ /* synthetic */ ck.v invoke(Throwable th2) {
        v(th2);
        return ck.v.f7137a;
    }

    @Override // zk.c0
    public void v(Throwable th2) {
        n<T> nVar;
        Object h10;
        Object Y = w().Y();
        if (Y instanceof a0) {
            nVar = this.f32910e;
            n.a aVar = ck.n.f7126b;
            h10 = ck.o.a(((a0) Y).f32837a);
        } else {
            nVar = this.f32910e;
            n.a aVar2 = ck.n.f7126b;
            h10 = e2.h(Y);
        }
        nVar.resumeWith(ck.n.b(h10));
    }
}
