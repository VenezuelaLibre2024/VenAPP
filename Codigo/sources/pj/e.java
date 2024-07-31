package pj;

import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class e<T> extends pj.a<T, T> {

    /* renamed from: c, reason: collision with root package name */
    final long f23107c;

    /* renamed from: d, reason: collision with root package name */
    final T f23108d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f23109e;

    /* loaded from: classes3.dex */
    static final class a<T> extends wj.c<T> implements dj.i<T> {
        private static final long serialVersionUID = 4066607327284737757L;

        /* renamed from: c, reason: collision with root package name */
        final long f23110c;

        /* renamed from: d, reason: collision with root package name */
        final T f23111d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f23112e;

        /* renamed from: f, reason: collision with root package name */
        im.c f23113f;

        /* renamed from: r, reason: collision with root package name */
        long f23114r;

        /* renamed from: s, reason: collision with root package name */
        boolean f23115s;

        a(im.b<? super T> bVar, long j10, T t10, boolean z10) {
            super(bVar);
            this.f23110c = j10;
            this.f23111d = t10;
            this.f23112e = z10;
        }

        @Override // im.b
        public void a() {
            if (this.f23115s) {
                return;
            }
            this.f23115s = true;
            T t10 = this.f23111d;
            if (t10 != null) {
                e(t10);
            } else if (this.f23112e) {
                this.f30171a.onError(new NoSuchElementException());
            } else {
                this.f30171a.a();
            }
        }

        @Override // im.b
        public void c(T t10) {
            if (this.f23115s) {
                return;
            }
            long j10 = this.f23114r;
            if (j10 != this.f23110c) {
                this.f23114r = j10 + 1;
                return;
            }
            this.f23115s = true;
            this.f23113f.cancel();
            e(t10);
        }

        @Override // wj.c, im.c
        public void cancel() {
            super.cancel();
            this.f23113f.cancel();
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23113f, cVar)) {
                this.f23113f = cVar;
                this.f30171a.d(this);
                cVar.i(Long.MAX_VALUE);
            }
        }

        @Override // im.b
        public void onError(Throwable th2) {
            if (this.f23115s) {
                yj.a.q(th2);
            } else {
                this.f23115s = true;
                this.f30171a.onError(th2);
            }
        }
    }

    public e(dj.f<T> fVar, long j10, T t10, boolean z10) {
        super(fVar);
        this.f23107c = j10;
        this.f23108d = t10;
        this.f23109e = z10;
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f23056b.H(new a(bVar, this.f23107c, this.f23108d, this.f23109e));
    }
}
