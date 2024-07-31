package sj;

import dj.s;
import dj.t;
import dj.u;
import java.util.concurrent.atomic.AtomicReference;
import nj.f;

/* loaded from: classes3.dex */
public final class d<T> extends s<T> {

    /* renamed from: a */
    final u<? extends T> f25677a;

    /* renamed from: b */
    final jj.e<? super Throwable, ? extends u<? extends T>> f25678b;

    /* loaded from: classes3.dex */
    static final class a<T> extends AtomicReference<gj.b> implements t<T>, gj.b {
        private static final long serialVersionUID = -5314538511045349925L;

        /* renamed from: a */
        final t<? super T> f25679a;

        /* renamed from: b */
        final jj.e<? super Throwable, ? extends u<? extends T>> f25680b;

        a(t<? super T> tVar, jj.e<? super Throwable, ? extends u<? extends T>> eVar) {
            this.f25679a = tVar;
            this.f25680b = eVar;
        }

        @Override // dj.t
        public void b(gj.b bVar) {
            if (kj.b.o(this, bVar)) {
                this.f25679a.b(this);
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

        @Override // dj.t
        public void onError(Throwable th2) {
            try {
                ((u) lj.b.d(this.f25680b.apply(th2), "The nextFunction returned a null SingleSource.")).c(new f(this, this.f25679a));
            } catch (Throwable th3) {
                hj.b.b(th3);
                this.f25679a.onError(new hj.a(th2, th3));
            }
        }

        @Override // dj.t
        public void onSuccess(T t10) {
            this.f25679a.onSuccess(t10);
        }
    }

    public d(u<? extends T> uVar, jj.e<? super Throwable, ? extends u<? extends T>> eVar) {
        this.f25677a = uVar;
        this.f25678b = eVar;
    }

    @Override // dj.s
    protected void k(t<? super T> tVar) {
        this.f25677a.c(new a(tVar, this.f25678b));
    }
}
