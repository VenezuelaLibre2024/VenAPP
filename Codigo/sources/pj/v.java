package pj;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class v<T> extends pj.a<T, T> {

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements dj.i<T>, im.c {
        private static final long serialVersionUID = 163080509307634843L;

        /* renamed from: a, reason: collision with root package name */
        final im.b<? super T> f23244a;

        /* renamed from: b, reason: collision with root package name */
        im.c f23245b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f23246c;

        /* renamed from: d, reason: collision with root package name */
        Throwable f23247d;

        /* renamed from: e, reason: collision with root package name */
        volatile boolean f23248e;

        /* renamed from: f, reason: collision with root package name */
        final AtomicLong f23249f = new AtomicLong();

        /* renamed from: r, reason: collision with root package name */
        final AtomicReference<T> f23250r = new AtomicReference<>();

        a(im.b<? super T> bVar) {
            this.f23244a = bVar;
        }

        @Override // im.b
        public void a() {
            this.f23246c = true;
            e();
        }

        boolean b(boolean z10, boolean z11, im.b<?> bVar, AtomicReference<T> atomicReference) {
            if (this.f23248e) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f23247d;
            if (th2 != null) {
                atomicReference.lazySet(null);
                bVar.onError(th2);
                return true;
            }
            if (!z11) {
                return false;
            }
            bVar.a();
            return true;
        }

        @Override // im.b
        public void c(T t10) {
            this.f23250r.lazySet(t10);
            e();
        }

        @Override // im.c
        public void cancel() {
            if (this.f23248e) {
                return;
            }
            this.f23248e = true;
            this.f23245b.cancel();
            if (getAndIncrement() == 0) {
                this.f23250r.lazySet(null);
            }
        }

        @Override // dj.i, im.b
        public void d(im.c cVar) {
            if (wj.g.q(this.f23245b, cVar)) {
                this.f23245b = cVar;
                this.f23244a.d(this);
                cVar.i(Long.MAX_VALUE);
            }
        }

        void e() {
            if (getAndIncrement() != 0) {
                return;
            }
            im.b<? super T> bVar = this.f23244a;
            AtomicLong atomicLong = this.f23249f;
            AtomicReference<T> atomicReference = this.f23250r;
            int i10 = 1;
            do {
                long j10 = 0;
                while (true) {
                    if (j10 == atomicLong.get()) {
                        break;
                    }
                    boolean z10 = this.f23246c;
                    T andSet = atomicReference.getAndSet(null);
                    boolean z11 = andSet == null;
                    if (b(z10, z11, bVar, atomicReference)) {
                        return;
                    }
                    if (z11) {
                        break;
                    }
                    bVar.c(andSet);
                    j10++;
                }
                if (j10 == atomicLong.get()) {
                    if (b(this.f23246c, atomicReference.get() == null, bVar, atomicReference)) {
                        return;
                    }
                }
                if (j10 != 0) {
                    xj.d.d(atomicLong, j10);
                }
                i10 = addAndGet(-i10);
            } while (i10 != 0);
        }

        @Override // im.c
        public void i(long j10) {
            if (wj.g.p(j10)) {
                xj.d.a(this.f23249f, j10);
                e();
            }
        }

        @Override // im.b
        public void onError(Throwable th2) {
            this.f23247d = th2;
            this.f23246c = true;
            e();
        }
    }

    public v(dj.f<T> fVar) {
        super(fVar);
    }

    @Override // dj.f
    protected void I(im.b<? super T> bVar) {
        this.f23056b.H(new a(bVar));
    }
}
