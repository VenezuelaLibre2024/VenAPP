package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class o<T> extends qj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final dj.r f24086b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<gj.b> implements dj.l<T>, gj.b, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24087a;

        /* renamed from: b, reason: collision with root package name */
        final dj.r f24088b;

        /* renamed from: c, reason: collision with root package name */
        T f24089c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f24090d;

        a(dj.l<? super T> lVar, dj.r rVar) {
            this.f24087a = lVar;
            this.f24088b = rVar;
        }

        @Override // dj.l
        public void a() {
            kj.b.l(this, this.f24088b.b(this));
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.o(this, bVar)) {
                this.f24087a.b(this);
            }
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
            this.f24090d = th2;
            kj.b.l(this, this.f24088b.b(this));
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            this.f24089c = t10;
            kj.b.l(this, this.f24088b.b(this));
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable th2 = this.f24090d;
            if (th2 != null) {
                this.f24090d = null;
                this.f24087a.onError(th2);
                return;
            }
            T t10 = this.f24089c;
            if (t10 == null) {
                this.f24087a.a();
            } else {
                this.f24089c = null;
                this.f24087a.onSuccess(t10);
            }
        }
    }

    public o(dj.n<T> nVar, dj.r rVar) {
        super(nVar);
        this.f24086b = rVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f24047a.a(new a(lVar, this.f24086b));
    }
}
