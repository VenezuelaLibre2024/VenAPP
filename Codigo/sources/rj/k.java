package rj;

import dj.p;
import dj.q;

/* loaded from: classes3.dex */
public final class k<T, U> extends rj.a<T, U> {

    /* renamed from: b, reason: collision with root package name */
    final jj.e<? super T, ? extends U> f25025b;

    /* loaded from: classes3.dex */
    static final class a<T, U> extends nj.a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final jj.e<? super T, ? extends U> f25026f;

        a(q<? super U> qVar, jj.e<? super T, ? extends U> eVar) {
            super(qVar);
            this.f25026f = eVar;
        }

        @Override // dj.q
        public void c(T t10) {
            if (this.f21982d) {
                return;
            }
            if (this.f21983e != 0) {
                this.f21979a.c(null);
                return;
            }
            try {
                this.f21979a.c(lj.b.d(this.f25026f.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                f(th2);
            }
        }

        @Override // mj.f
        public int l(int i10) {
            return g(i10);
        }

        @Override // mj.j
        public U poll() {
            T poll = this.f21981c.poll();
            if (poll != null) {
                return (U) lj.b.d(this.f25026f.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public k(p<T> pVar, jj.e<? super T, ? extends U> eVar) {
        super(pVar);
        this.f25025b = eVar;
    }

    @Override // dj.o
    public void s(q<? super U> qVar) {
        this.f24957a.d(new a(qVar, this.f25025b));
    }
}
