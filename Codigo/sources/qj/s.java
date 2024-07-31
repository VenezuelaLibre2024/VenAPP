package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class s<T> extends qj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final dj.n<? extends T> f24112b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<gj.b> implements dj.l<T>, gj.b {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24113a;

        /* renamed from: b, reason: collision with root package name */
        final dj.n<? extends T> f24114b;

        /* renamed from: qj.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0398a<T> implements dj.l<T> {

            /* renamed from: a, reason: collision with root package name */
            final dj.l<? super T> f24115a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference<gj.b> f24116b;

            C0398a(dj.l<? super T> lVar, AtomicReference<gj.b> atomicReference) {
                this.f24115a = lVar;
                this.f24116b = atomicReference;
            }

            @Override // dj.l
            public void a() {
                this.f24115a.a();
            }

            @Override // dj.l
            public void b(gj.b bVar) {
                kj.b.o(this.f24116b, bVar);
            }

            @Override // dj.l
            public void onError(Throwable th2) {
                this.f24115a.onError(th2);
            }

            @Override // dj.l
            public void onSuccess(T t10) {
                this.f24115a.onSuccess(t10);
            }
        }

        a(dj.l<? super T> lVar, dj.n<? extends T> nVar) {
            this.f24113a = lVar;
            this.f24114b = nVar;
        }

        @Override // dj.l
        public void a() {
            gj.b bVar = get();
            if (bVar == kj.b.DISPOSED || !compareAndSet(bVar, null)) {
                return;
            }
            this.f24114b.a(new C0398a(this.f24113a, this));
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.o(this, bVar)) {
                this.f24113a.b(this);
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
            this.f24113a.onError(th2);
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            this.f24113a.onSuccess(t10);
        }
    }

    public s(dj.n<T> nVar, dj.n<? extends T> nVar2) {
        super(nVar);
        this.f24112b = nVar2;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f24047a.a(new a(lVar, this.f24112b));
    }
}
