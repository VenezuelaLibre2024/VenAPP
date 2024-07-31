package rj;

import dj.p;
import dj.q;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class g<T> extends rj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super T, ? extends dj.d> f24996b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f24997c;

    /* loaded from: classes3.dex */
    static final class a<T> extends nj.b<T> implements q<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: a, reason: collision with root package name */
        final q<? super T> f24998a;

        /* renamed from: c, reason: collision with root package name */
        final jj.e<? super T, ? extends dj.d> f25000c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f25001d;

        /* renamed from: f, reason: collision with root package name */
        gj.b f25003f;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f25004r;

        /* renamed from: b, reason: collision with root package name */
        final xj.c f24999b = new xj.c();

        /* renamed from: e, reason: collision with root package name */
        final gj.a f25002e = new gj.a();

        /* renamed from: rj.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0417a extends AtomicReference<gj.b> implements dj.c, gj.b {
            private static final long serialVersionUID = 8606673141535671828L;

            C0417a() {
            }

            @Override // dj.c
            public void a() {
                a.this.d(this);
            }

            @Override // dj.c
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

            @Override // dj.c
            public void onError(Throwable th2) {
                a.this.e(this, th2);
            }
        }

        a(q<? super T> qVar, jj.e<? super T, ? extends dj.d> eVar, boolean z10) {
            this.f24998a = qVar;
            this.f25000c = eVar;
            this.f25001d = z10;
            lazySet(1);
        }

        @Override // dj.q
        public void a() {
            if (decrementAndGet() == 0) {
                Throwable b10 = this.f24999b.b();
                if (b10 != null) {
                    this.f24998a.onError(b10);
                } else {
                    this.f24998a.a();
                }
            }
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            if (kj.b.p(this.f25003f, bVar)) {
                this.f25003f = bVar;
                this.f24998a.b(this);
            }
        }

        @Override // dj.q
        public void c(T t10) {
            try {
                dj.d dVar = (dj.d) lj.b.d(this.f25000c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0417a c0417a = new C0417a();
                if (this.f25004r || !this.f25002e.b(c0417a)) {
                    return;
                }
                dVar.a(c0417a);
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f25003f.dispose();
                onError(th2);
            }
        }

        @Override // mj.j
        public void clear() {
        }

        void d(a<T>.C0417a c0417a) {
            this.f25002e.c(c0417a);
            a();
        }

        @Override // gj.b
        public void dispose() {
            this.f25004r = true;
            this.f25003f.dispose();
            this.f25002e.dispose();
        }

        void e(a<T>.C0417a c0417a, Throwable th2) {
            this.f25002e.c(c0417a);
            onError(th2);
        }

        @Override // gj.b
        public boolean h() {
            return this.f25003f.h();
        }

        @Override // mj.j
        public boolean isEmpty() {
            return true;
        }

        @Override // mj.f
        public int l(int i10) {
            return i10 & 2;
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            if (!this.f24999b.a(th2)) {
                yj.a.q(th2);
                return;
            }
            if (!this.f25001d) {
                dispose();
                if (getAndSet(0) <= 0) {
                    return;
                }
            } else if (decrementAndGet() != 0) {
                return;
            }
            this.f24998a.onError(this.f24999b.b());
        }

        @Override // mj.j
        public T poll() {
            return null;
        }
    }

    public g(p<T> pVar, jj.e<? super T, ? extends dj.d> eVar, boolean z10) {
        super(pVar);
        this.f24996b = eVar;
        this.f24997c = z10;
    }

    @Override // dj.o
    protected void s(q<? super T> qVar) {
        this.f24957a.d(new a(qVar, this.f24996b, this.f24997c));
    }
}
