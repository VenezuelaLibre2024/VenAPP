package wj;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class e<T> extends AtomicInteger implements mj.g<T> {
    private static final long serialVersionUID = -3830916580126663321L;

    /* renamed from: a, reason: collision with root package name */
    final T f30173a;

    /* renamed from: b, reason: collision with root package name */
    final im.b<? super T> f30174b;

    public e(im.b<? super T> bVar, T t10) {
        this.f30174b = bVar;
        this.f30173a = t10;
    }

    @Override // im.c
    public void cancel() {
        lazySet(2);
    }

    @Override // mj.j
    public void clear() {
        lazySet(1);
    }

    @Override // im.c
    public void i(long j10) {
        if (g.p(j10) && compareAndSet(0, 1)) {
            im.b<? super T> bVar = this.f30174b;
            bVar.c(this.f30173a);
            if (get() != 2) {
                bVar.a();
            }
        }
    }

    @Override // mj.j
    public boolean isEmpty() {
        return get() != 0;
    }

    @Override // mj.f
    public int l(int i10) {
        return i10 & 1;
    }

    @Override // mj.j
    public boolean offer(T t10) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // mj.j
    public T poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.f30173a;
    }
}
