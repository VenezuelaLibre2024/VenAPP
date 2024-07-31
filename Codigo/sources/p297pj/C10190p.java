package p297pj;

import dj.AbstractC6981f;
import im.InterfaceC8015b;
import p241mj.InterfaceCallableC9598h;
import p426wj.C12222e;

/* renamed from: pj.p */
/* loaded from: classes3.dex */
public final class C10190p<T> extends AbstractC6981f<T> implements InterfaceCallableC9598h<T> {

    /* renamed from: b */
    private final T f25136b;

    public C10190p(T t10) {
        this.f25136b = t10;
    }

    @Override // dj.AbstractC6981f
    /* renamed from: I */
    protected void mo20229I(InterfaceC8015b<? super T> interfaceC8015b) {
        interfaceC8015b.mo20249d(new C12222e(interfaceC8015b, this.f25136b));
    }

    @Override // p241mj.InterfaceCallableC9598h, java.util.concurrent.Callable
    public T call() {
        return this.f25136b;
    }
}
