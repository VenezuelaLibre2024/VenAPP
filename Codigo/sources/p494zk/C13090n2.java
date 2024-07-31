package p494zk;

import ck.C2029n;
import ck.C2037v;
import p124gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zk.n2 */
/* loaded from: classes3.dex */
public final class C13090n2 extends AbstractC13045c2 {

    /* renamed from: e */
    private final Continuation<C2037v> f35468e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13090n2(Continuation<? super C2037v> continuation) {
        this.f35468e = continuation;
    }

    @Override // p280ok.InterfaceC9998l
    public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
        mo43063v(th2);
        return C2037v.f8089a;
    }

    @Override // p494zk.AbstractC13043c0
    /* renamed from: v */
    public void mo43063v(Throwable th2) {
        Continuation<C2037v> continuation = this.f35468e;
        C2029n.a aVar = C2029n.f8078b;
        continuation.resumeWith(C2029n.m10340b(C2037v.f8089a));
    }
}
