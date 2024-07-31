package rj;

import dj.o;
import dj.q;
import rj.l;

/* loaded from: classes3.dex */
public final class j<T> extends o<T> implements mj.h<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f25024a;

    public j(T t10) {
        this.f25024a = t10;
    }

    @Override // mj.h, java.util.concurrent.Callable
    public T call() {
        return this.f25024a;
    }

    @Override // dj.o
    protected void s(q<? super T> qVar) {
        l.a aVar = new l.a(qVar, this.f25024a);
        qVar.b(aVar);
        aVar.run();
    }
}
