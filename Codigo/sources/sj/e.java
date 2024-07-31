package sj;

import dj.f;
import dj.t;
import dj.u;

/* loaded from: classes3.dex */
public final class e<T> extends f<T> {

    /* renamed from: b */
    final u<? extends T> f25681b;

    /* loaded from: classes3.dex */
    static final class a<T> extends wj.c<T> implements t<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: c */
        gj.b f25682c;

        a(im.b<? super T> bVar) {
            super(bVar);
        }

        @Override // dj.t
        public void b(gj.b bVar) {
            if (kj.b.p(this.f25682c, bVar)) {
                this.f25682c = bVar;
                this.f30171a.d(this);
            }
        }

        @Override // wj.c, im.c
        public void cancel() {
            super.cancel();
            this.f25682c.dispose();
        }

        @Override // dj.t
        public void onError(Throwable th2) {
            this.f30171a.onError(th2);
        }

        @Override // dj.t
        public void onSuccess(T t10) {
            e(t10);
        }
    }

    public e(u<? extends T> uVar) {
        this.f25681b = uVar;
    }

    @Override // dj.f
    public void I(im.b<? super T> bVar) {
        this.f25681b.c(new a(bVar));
    }
}
