package rj;

import dj.p;
import dj.q;

/* loaded from: classes3.dex */
public final class e<T> extends rj.a<T, T> {

    /* renamed from: b, reason: collision with root package name */
    final jj.g<? super T> f24970b;

    /* loaded from: classes3.dex */
    static final class a<T> extends nj.a<T, T> {

        /* renamed from: f, reason: collision with root package name */
        final jj.g<? super T> f24971f;

        a(q<? super T> qVar, jj.g<? super T> gVar) {
            super(qVar);
            this.f24971f = gVar;
        }

        @Override // dj.q
        public void c(T t10) {
            if (this.f21983e != 0) {
                this.f21979a.c(null);
                return;
            }
            try {
                if (this.f24971f.test(t10)) {
                    this.f21979a.c(t10);
                }
            } catch (Throwable th2) {
                f(th2);
            }
        }

        @Override // mj.f
        public int l(int i10) {
            return g(i10);
        }

        @Override // mj.j
        public T poll() {
            T poll;
            do {
                poll = this.f21981c.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f24971f.test(poll));
            return poll;
        }
    }

    public e(p<T> pVar, jj.g<? super T> gVar) {
        super(pVar);
        this.f24970b = gVar;
    }

    @Override // dj.o
    public void s(q<? super T> qVar) {
        this.f24957a.d(new a(qVar, this.f24970b));
    }
}
