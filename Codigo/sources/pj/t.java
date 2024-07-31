package pj;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class t<T> extends pj.a<T, T> implements jj.d<T> {

    /* renamed from: c, reason: collision with root package name */
    final jj.d<? super T> f23236c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements dj.i<T>, im.c {
        private static final long serialVersionUID = -6246093802440953054L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super T> f23237a;

        /* renamed from: b, reason: collision with root package name */
        final jj.d<? super T> f23238b;

        /* renamed from: c, reason: collision with root package name */
        im.c f23239c;

        /* renamed from: d, reason: collision with root package name */
        boolean f23240d;

        a(im.b<? super T> bVar, jj.d<? super T> dVar) {
            this.f23237a = bVar;
            this.f23238b = dVar;
        }

        @Override // im.b
        public void a() {
            if (this.f23240d) {
                return;
            }
            this.f23240d = true;
            this.f23237a.a();
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f23240d) {
                return;
            }
            if (get() != 0) {
                this.f23237a.c(t10);
                xj.d.d(this, 1L);
                return;
            }
            try {
                this.f23238b.accept(t10);
            } catch (Throwable th2) {
                hj.b.b(th2);
                cancel();
                onError(th2);
            }
        }

        @Override // im.c
        public void cancel() {
            this.f23239c.cancel();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23239c, cVar)) {
                this.f23239c = cVar;
                this.f23237a.d(this);
                cVar.i(Long.MAX_VALUE);
            }
        }

        @Override // im.c
        public void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.a(this, j10);
            }
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (this.f23240d) {
                yj.a.q(th2);
            } else {
                this.f23240d = true;
                this.f23237a.onError(th2);
            }
        }
    }

    public t(dj.f<T> fVar) {
        super(fVar);
        this.f23236c = this;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f23056b.H(new a(bVar, this.f23236c));
    }

    @Override // jj.d
    public void accept(T t10) {
    }
}
