package pj;

/* loaded from: classes3.dex */
public final class p<T> extends dj.f<T> implements mj.h<T> {

    /* renamed from: b, reason: collision with root package name */
    private final T f23199b;

    public p(T t10) {
        this.f23199b = t10;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        bVar.d(new wj.e(bVar, this.f23199b));
    }

    @Override // mj.h, java.util.concurrent.Callable
    public T call() {
        return this.f23199b;
    }
}
