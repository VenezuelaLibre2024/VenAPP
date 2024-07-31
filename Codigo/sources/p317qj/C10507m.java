package p317qj;

import dj.AbstractC6985j;
import dj.InterfaceC6987l;
import p123gj.C7579c;
import p241mj.InterfaceCallableC9598h;

/* renamed from: qj.m */
/* loaded from: classes3.dex */
public final class C10507m<T> extends AbstractC6985j<T> implements InterfaceCallableC9598h<T> {

    /* renamed from: a */
    final T f26123a;

    public C10507m(T t10) {
        this.f26123a = t10;
    }

    @Override // p241mj.InterfaceCallableC9598h, java.util.concurrent.Callable
    public T call() {
        return this.f26123a;
    }

    @Override // dj.AbstractC6985j
    /* renamed from: u */
    protected void mo20271u(InterfaceC6987l<? super T> interfaceC6987l) {
        interfaceC6987l.mo20279b(C7579c.m23024a());
        interfaceC6987l.onSuccess(this.f26123a);
    }
}
