package sj;

import dj.s;
import dj.t;
import dj.u;

/* loaded from: classes3.dex */
public final class a<T> extends s<T> {

    /* renamed from: a */
    final u<T> f25668a;

    /* renamed from: b */
    final jj.d<? super Throwable> f25669b;

    /* renamed from: sj.a$a */
    /* loaded from: classes3.dex */
    final class C0430a implements t<T> {

        /* renamed from: a */
        private final t<? super T> f25670a;

        C0430a(t<? super T> tVar) {
            this.f25670a = tVar;
        }

        @Override // dj.t
        public void b(gj.b bVar) {
            this.f25670a.b(bVar);
        }

        @Override // dj.t
        public void onError(Throwable th2) {
            try {
                a.this.f25669b.accept(th2);
            } catch (Throwable th3) {
                hj.b.b(th3);
                th2 = new hj.a(th2, th3);
            }
            this.f25670a.onError(th2);
        }

        @Override // dj.t
        public void onSuccess(T t10) {
            this.f25670a.onSuccess(t10);
        }
    }

    public a(u<T> uVar, jj.d<? super Throwable> dVar) {
        this.f25668a = uVar;
        this.f25669b = dVar;
    }

    @Override // dj.s
    protected void k(t<? super T> tVar) {
        this.f25668a.c(new C0430a(tVar));
    }
}
