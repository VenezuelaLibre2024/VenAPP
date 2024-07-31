package p494zk;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zk.m2 */
/* loaded from: classes3.dex */
public final class C13086m2<T> extends AbstractC13045c2 {

    /* renamed from: e */
    private final C13087n<T> f35461e;

    /* JADX WARN: Multi-variable type inference failed */
    public C13086m2(C13087n<? super T> c13087n) {
        this.f35461e = c13087n;
    }

    @Override // p280ok.InterfaceC9998l
    public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
        mo43063v(th2);
        return C2037v.f8089a;
    }

    @Override // p494zk.AbstractC13043c0
    /* renamed from: v */
    public void mo43063v(Throwable th2) {
        C13087n<T> c13087n;
        Object m43158h;
        Object m43113Y = m43066w().m43113Y();
        if (m43113Y instanceof C13033a0) {
            c13087n = this.f35461e;
            C2029n.a aVar = C2029n.f8078b;
            m43158h = C2030o.m10348a(((C13033a0) m43113Y).f35388a);
        } else {
            c13087n = this.f35461e;
            C2029n.a aVar2 = C2029n.f8078b;
            m43158h = C13054e2.m43158h(m43113Y);
        }
        c13087n.resumeWith(C2029n.m10340b(m43158h));
    }
}
