package pj;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class u<T> extends pj.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicLong implements dj.i<T>, im.c {
        private static final long serialVersionUID = -3176480756392482682L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super T> f23241a;

        /* renamed from: b, reason: collision with root package name */
        im.c f23242b;

        /* renamed from: c, reason: collision with root package name */
        boolean f23243c;

        a(im.b<? super T> bVar) {
            this.f23241a = bVar;
        }

        @Override // im.b
        public void a() {
            if (this.f23243c) {
                return;
            }
            this.f23243c = true;
            this.f23241a.a();
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f23243c) {
                return;
            }
            if (get() == 0) {
                onError(new hj.c("could not emit value due to lack of requests"));
            } else {
                this.f23241a.c(t10);
                xj.d.d(this, 1L);
            }
        }

        @Override // im.c
        public void cancel() {
            this.f23242b.cancel();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23242b, cVar)) {
                this.f23242b = cVar;
                this.f23241a.d(this);
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
            if (this.f23243c) {
                yj.a.q(th2);
            } else {
                this.f23243c = true;
                this.f23241a.onError(th2);
            }
        }
    }

    public u(dj.f<T> fVar) {
        super(fVar);
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f23056b.H(new a(bVar));
    }
}
