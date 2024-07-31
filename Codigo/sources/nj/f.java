package nj;

import dj.t;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReference<gj.b> f21986a;

    /* renamed from: b, reason: collision with root package name */
    final t<? super T> f21987b;

    public f(AtomicReference<gj.b> atomicReference, t<? super T> tVar) {
        this.f21986a = atomicReference;
        this.f21987b = tVar;
    }

    @Override // dj.t
    public void b(gj.b bVar) {
        kj.b.l(this.f21986a, bVar);
    }

    @Override // dj.t
    public void onError(Throwable th2) {
        this.f21987b.onError(th2);
    }

    @Override // dj.t
    public void onSuccess(T t10) {
        this.f21987b.onSuccess(t10);
    }
}
