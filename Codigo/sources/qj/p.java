package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class p<T> extends qj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super Throwable, ? extends dj.n<? extends T>> f24091b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f24092c;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<gj.b> implements dj.l<T>, gj.b {
        private static final long serialVersionUID = 2026620218879969836L;

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24093a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super Throwable, ? extends dj.n<? extends T>> f24094b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f24095c;

        /* renamed from: qj.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0397a<T> implements dj.l<T> {

            /* renamed from: a, reason: collision with root package name */
            final dj.l<? super T> f24096a;

            /* renamed from: b, reason: collision with root package name */
            final AtomicReference<gj.b> f24097b;

            C0397a(dj.l<? super T> lVar, AtomicReference<gj.b> atomicReference) {
                this.f24096a = lVar;
                this.f24097b = atomicReference;
            }

            @Override // dj.l
            public void a() {
                this.f24096a.a();
            }

            @Override // dj.l
            public void b(gj.b bVar) {
                kj.b.o(this.f24097b, bVar);
            }

            @Override // dj.l
            public void onError(Throwable th2) {
                this.f24096a.onError(th2);
            }

            @Override // dj.l
            public void onSuccess(T t10) {
                this.f24096a.onSuccess(t10);
            }
        }

        a(dj.l<? super T> lVar, jj.e<? super Throwable, ? extends dj.n<? extends T>> eVar, boolean z10) {
            this.f24093a = lVar;
            this.f24094b = eVar;
            this.f24095c = z10;
        }

        @Override // dj.l
        public void a() {
            this.f24093a.a();
        }

        @Override // dj.l
        public void b(gj.b bVar) {
            if (kj.b.o(this, bVar)) {
                this.f24093a.b(this);
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
            if (!this.f24095c && !(th2 instanceof Exception)) {
                this.f24093a.onError(th2);
                return;
            }
            try {
                dj.n nVar = (dj.n) lj.b.d(this.f24094b.apply(th2), "The resumeFunction returned a null MaybeSource");
                kj.b.l(this, null);
                nVar.a(new C0397a(this.f24093a, this));
            } catch (Throwable th3) {
                hj.b.b(th3);
                this.f24093a.onError(new hj.a(th2, th3));
            }
        }

        @Override // dj.l
        public void onSuccess(T t10) {
            this.f24093a.onSuccess(t10);
        }
    }

    public p(dj.n<T> nVar, jj.e<? super Throwable, ? extends dj.n<? extends T>> eVar, boolean z10) {
        super(nVar);
        this.f24091b = eVar;
        this.f24092c = z10;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        this.f24047a.a(new a(lVar, this.f24091b, this.f24092c));
    }
}
