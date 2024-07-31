package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class b<T> extends AtomicReference<gj.b> implements dj.l<T>, gj.b {
    private static final long serialVersionUID = -6076952298809384986L;

    /* renamed from: a, reason: collision with root package name */
    final jj.d<? super T> f24048a;

    /* renamed from: b, reason: collision with root package name */
    final jj.d<? super Throwable> f24049b;

    /* renamed from: c, reason: collision with root package name */
    final jj.a f24050c;

    public b(jj.d<? super T> dVar, jj.d<? super Throwable> dVar2, jj.a aVar) {
        this.f24048a = dVar;
        this.f24049b = dVar2;
        this.f24050c = aVar;
    }

    @Override // dj.l
    public void a() {
        lazySet(kj.b.DISPOSED);
        try {
            this.f24050c.run();
        } catch (Throwable th2) {
            hj.b.b(th2);
            yj.a.q(th2);
        }
    }

    @Override // dj.l
    public void b(gj.b bVar) {
        kj.b.o(this, bVar);
    }

    @Override // gj.b
    public void dispose() {
        kj.b.b(this);
    }

    @Override // gj.b
    public boolean h() {
        return kj.b.i(get());
    }

    @Override // dj.l
    public void onError(Throwable th2) {
        lazySet(kj.b.DISPOSED);
        try {
            this.f24049b.accept(th2);
        } catch (Throwable th3) {
            hj.b.b(th3);
            yj.a.q(new hj.a(th2, th3));
        }
    }

    @Override // dj.l
    public void onSuccess(T t10) {
        lazySet(kj.b.DISPOSED);
        try {
            this.f24048a.accept(t10);
        } catch (Throwable th2) {
            hj.b.b(th2);
            yj.a.q(th2);
        }
    }
}
