package qj;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class c<T> extends dj.j<T> {

    /* renamed from: a, reason: collision with root package name */
    final dj.m<T> f24051a;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<gj.b> implements dj.k<T>, gj.b {
        private static final long serialVersionUID = -2467358622224974244L;

        /* renamed from: a, reason: collision with root package name */
        final dj.l<? super T> f24052a;

        a(dj.l<? super T> lVar) {
            this.f24052a = lVar;
        }

        @Override // dj.k
        public void a() {
            gj.b andSet;
            gj.b bVar = get();
            kj.b bVar2 = kj.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return;
            }
            try {
                this.f24052a.a();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        public boolean b(Throwable th2) {
            gj.b andSet;
            if (th2 == null) {
                th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            gj.b bVar = get();
            kj.b bVar2 = kj.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return false;
            }
            try {
                this.f24052a.onError(th2);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
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

        @Override // dj.k
        public void onError(Throwable th2) {
            if (b(th2)) {
                return;
            }
            yj.a.q(th2);
        }

        @Override // dj.k
        public void onSuccess(T t10) {
            gj.b andSet;
            gj.b bVar = get();
            kj.b bVar2 = kj.b.DISPOSED;
            if (bVar == bVar2 || (andSet = getAndSet(bVar2)) == bVar2) {
                return;
            }
            try {
                if (t10 == null) {
                    this.f24052a.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.f24052a.onSuccess(t10);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th2) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th2;
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public c(dj.m<T> mVar) {
        this.f24051a = mVar;
    }

    @Override // dj.j
    protected void u(dj.l<? super T> lVar) {
        a aVar = new a(lVar);
        lVar.b(aVar);
        try {
            this.f24051a.a(aVar);
        } catch (Throwable th2) {
            hj.b.b(th2);
            aVar.onError(th2);
        }
    }
}
