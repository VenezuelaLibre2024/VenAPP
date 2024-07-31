package wj;

/* loaded from: classes3.dex */
public class c<T> extends a<T> {
    private static final long serialVersionUID = -2151279923272604993L;

    /* renamed from: a, reason: collision with root package name */
    protected final im.b<? super T> f30171a;

    /* renamed from: b, reason: collision with root package name */
    protected T f30172b;

    public c(im.b<? super T> bVar) {
        this.f30171a = bVar;
    }

    public void cancel() {
        set(4);
        this.f30172b = null;
    }

    @Override // mj.j
    public final void clear() {
        lazySet(32);
        this.f30172b = null;
    }

    public final void e(T t10) {
        int i10 = get();
        while (i10 != 8) {
            if ((i10 & (-3)) != 0) {
                return;
            }
            if (i10 == 2) {
                lazySet(3);
                im.b<? super T> bVar = this.f30171a;
                bVar.c(t10);
                if (get() != 4) {
                    bVar.a();
                    return;
                }
                return;
            }
            this.f30172b = t10;
            if (compareAndSet(0, 1)) {
                return;
            }
            i10 = get();
            if (i10 == 4) {
                this.f30172b = null;
                return;
            }
        }
        this.f30172b = t10;
        lazySet(16);
        im.b<? super T> bVar2 = this.f30171a;
        bVar2.c(t10);
        if (get() != 4) {
            bVar2.a();
        }
    }

    @Override // im.c
    public final void i(long j10) {
        T t10;
        if (!g.p(j10)) {
            return;
        }
        do {
            int i10 = get();
            if ((i10 & (-2)) != 0) {
                return;
            }
            if (i10 == 1) {
                if (!compareAndSet(1, 3) || (t10 = this.f30172b) == null) {
                    return;
                }
                this.f30172b = null;
                im.b<? super T> bVar = this.f30171a;
                bVar.c(t10);
                if (get() != 4) {
                    bVar.a();
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
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
        lazySet(32);
        T t10 = this.f30172b;
        this.f30172b = null;
        return t10;
    }
}
