package qj;

/* loaded from: classes3.dex */
public final class m<T> extends dj.j<T> implements mj.h<T> {

    /* renamed from: a, reason: collision with root package name */
    final T f24081a;

    public m(T t10) {
        this.f24081a = t10;
    }

    @Override // mj.h, java.util.concurrent.Callable
    public T call() {
        return this.f24081a;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        lVar.b(gj.c.a());
        lVar.onSuccess(this.f24081a);
    }
}
