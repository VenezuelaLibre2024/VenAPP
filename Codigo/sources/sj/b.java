package sj;

import dj.s;
import dj.t;
import dj.u;

/* loaded from: classes3.dex */
public final class b<T> extends s<T> {

    /* renamed from: a */
    final u<T> f25672a;

    /* renamed from: b */
    final jj.d<? super T> f25673b;

    /* loaded from: classes3.dex */
    final class a implements t<T> {

        /* renamed from: a */
        private final t<? super T> f25674a;

        a(t<? super T> tVar) {
            this.f25674a = tVar;
        }

        @Override // dj.t
        public void b(gj.b bVar) {
            this.f25674a.b(bVar);
        }

        @Override // dj.t
        public void onError(Throwable th2) {
            this.f25674a.onError(th2);
        }

        @Override // dj.t
        public void onSuccess(T t10) {
            try {
                b.this.f25673b.accept(t10);
                this.f25674a.onSuccess(t10);
            } catch (Throwable th2) {
                hj.b.b(th2);
                this.f25674a.onError(th2);
            }
        }
    }

    public b(u<T> uVar, jj.d<? super T> dVar) {
        this.f25672a = uVar;
        this.f25673b = dVar;
    }

    @Override // dj.s
    protected void k(t<? super T> tVar) {
        this.f25672a.c(new a(tVar));
    }
}
