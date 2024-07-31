package nj;

import dj.q;

/* loaded from: classes3.dex */
public class d<T> extends b<T> {
    private static final long serialVersionUID = -5502432239815349361L;

    /* renamed from: a, reason: collision with root package name */
    protected final q<? super T> f21984a;

    /* renamed from: b, reason: collision with root package name */
    protected T f21985b;

    public d(q<? super T> qVar) {
        this.f21984a = qVar;
    }

    @Override // mj.j
    public final void clear() {
        lazySet(32);
        this.f21985b = null;
    }

    public final void d() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f21984a.a();
    }

    @Override // gj.b
    public void dispose() {
        set(4);
        this.f21985b = null;
    }

    public final void e(T t10) {
        int i10 = get();
        if ((i10 & 54) != 0) {
            return;
        }
        q<? super T> qVar = this.f21984a;
        if (i10 == 8) {
            this.f21985b = t10;
            lazySet(16);
            t10 = null;
        } else {
            lazySet(2);
        }
        qVar.c(t10);
        if (get() != 4) {
            qVar.a();
        }
    }

    public final void f(Throwable th2) {
        if ((get() & 54) != 0) {
            yj.a.q(th2);
        } else {
            lazySet(2);
            this.f21984a.onError(th2);
        }
    }

    @Override // gj.b
    public final boolean h() {
        return get() == 4;
    }

    @Override // mj.j
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // mj.f
    public final int l(int i10) {
        if ((i10 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // mj.j
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        T t10 = this.f21985b;
        this.f21985b = null;
        lazySet(32);
        return t10;
    }
}
