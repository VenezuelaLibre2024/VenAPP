package rj;

import dj.o;
import dj.p;
import dj.q;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class h<T> extends dj.b implements mj.d<T> {

    /* renamed from: a, reason: collision with root package name */
    final p<T> f25006a;

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super T, ? extends dj.d> f25007b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f25008c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicInteger implements gj.b, q<T> {
        private static final long serialVersionUID = 8443155186132538303L;

        /* renamed from: a, reason: collision with root package name */
        final dj.c f25009a;

        /* renamed from: c, reason: collision with root package name */
        final jj.e<? super T, ? extends dj.d> f25011c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f25012d;

        /* renamed from: f, reason: collision with root package name */
        gj.b f25014f;

        /* renamed from: r, reason: collision with root package name */
        volatile boolean f25015r;

        /* renamed from: b, reason: collision with root package name */
        final xj.c f25010b = new xj.c();

        /* renamed from: e, reason: collision with root package name */
        final gj.a f25013e = new gj.a();

        /* renamed from: rj.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0418a extends AtomicReference<gj.b> implements dj.c, gj.b {
            private static final long serialVersionUID = 8606673141535671828L;

            C0418a() {
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

        a(dj.c cVar, jj.e<? super T, ? extends dj.d> eVar, boolean z10) {
            this.f25009a = cVar;
            this.f25011c = eVar;
            this.f25012d = z10;
            lazySet(1);
        }

        @Override // dj.q
        public void a() {
            if (decrementAndGet() == 0) {
                Throwable b10 = this.f25010b.b();
                if (b10 != null) {
                    this.f25009a.onError(b10);
                } else {
                    this.f25009a.a();
                }
            }
        }

        @Override // dj.q
        public void b(gj.b bVar) {
            if (kj.b.p(this.f25014f, bVar)) {
                this.f25014f = bVar;
                this.f25009a.b(this);
            }
        }

        @Override // dj.q
        public void c(T t10) {
            try {
                dj.d dVar = (dj.d) lj.b.d(this.f25011c.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0418a c0418a = new C0418a();
                if (this.f25015r || !this.f25013e.b(c0418a)) {
                    return;
                }
                dVar.a(c0418a);
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f25014f.dispose();
                onError(th2);
            }
        }

        void d(a<T>.C0418a c0418a) {
            this.f25013e.c(c0418a);
            a();
        }

        @Override // gj.b
        public void dispose() {
            this.f25015r = true;
            this.f25014f.dispose();
            this.f25013e.dispose();
        }

        void e(a<T>.C0418a c0418a, Throwable th2) {
            this.f25013e.c(c0418a);
            onError(th2);
        }

        @Override // gj.b
        public boolean h() {
            return this.f25014f.h();
        }

        @Override // dj.q
        public void onError(Throwable th2) {
            if (!this.f25010b.a(th2)) {
                yj.a.q(th2);
                return;
            }
            if (!this.f25012d) {
                dispose();
                if (getAndSet(0) <= 0) {
                    return;
                }
            } else if (decrementAndGet() != 0) {
                return;
            }
            this.f25009a.onError(this.f25010b.b());
        }
    }

    public h(p<T> pVar, jj.e<? super T, ? extends dj.d> eVar, boolean z10) {
        this.f25006a = pVar;
        this.f25007b = eVar;
        this.f25008c = z10;
    }

    @Override // mj.d
    public o<T> b() {
        return yj.a.m(new g(this.f25006a, this.f25007b, this.f25008c));
    }

    @Override // dj.b
    protected void p(dj.c cVar) {
        this.f25006a.d(new a(cVar, this.f25007b, this.f25008c));
    }
}
