package p339rj;

import dj.AbstractC6990o;
import dj.InterfaceC6992q;
import p241mj.InterfaceCallableC9598h;
import p339rj.C10721l;

/* renamed from: rj.j */
/* loaded from: classes3.dex */
public final class C10719j<T> extends AbstractC6990o<T> implements InterfaceCallableC9598h<T> {

    /* renamed from: a */
    private final T f27143a;

    public C10719j(T t10) {
        this.f27143a = t10;
    }

    @Override // p241mj.InterfaceCallableC9598h, java.util.concurrent.Callable
    public T call() {
        return this.f27143a;
    }

    @Override // dj.AbstractC6990o
    /* renamed from: s */
    protected void mo608s(InterfaceC6992q<? super T> interfaceC6992q) {
        C10721l.a aVar = new C10721l.a(interfaceC6992q, this.f27143a);
        interfaceC6992q.mo606b(aVar);
        aVar.run();
    }
}
