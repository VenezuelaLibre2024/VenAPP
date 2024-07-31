package rj;

import dj.o;
import dj.q;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i<T> extends o<T> {

    /* renamed from: a, reason: collision with root package name */
    final Iterable<? extends T> f25017a;

    /* loaded from: classes3.dex */
    static final class a<T> extends nj.c<T> {

        /* renamed from: a, reason: collision with root package name */
        final q<? super T> f25018a;

        /* renamed from: b, reason: collision with root package name */
        final Iterator<? extends T> f25019b;

        /* renamed from: c, reason: collision with root package name */
        volatile boolean f25020c;

        /* renamed from: d, reason: collision with root package name */
        boolean f25021d;

        /* renamed from: e, reason: collision with root package name */
        boolean f25022e;

        /* renamed from: f, reason: collision with root package name */
        boolean f25023f;

        a(q<? super T> qVar, Iterator<? extends T> it) {
            this.f25018a = qVar;
            this.f25019b = it;
        }

        void a() {
            while (!h()) {
                try {
                    this.f25018a.c(lj.b.d(this.f25019b.next(), "The iterator returned a null value"));
                    if (h()) {
                        return;
                    }
                    if (!this.f25019b.hasNext()) {
                        if (h()) {
                            return;
                        }
                        this.f25018a.a();
                        return;
                    }
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    this.f25018a.onError(th2);
                    return;
                }
            }
        }

        @Override // mj.j
        public void clear() {
            this.f25022e = true;
        }

        @Override // gj.b
        public void dispose() {
            this.f25020c = true;
        }

        @Override // gj.b
        public boolean h() {
            return this.f25020c;
        }

        @Override // mj.j
        public boolean isEmpty() {
            return this.f25022e;
        }

        @Override // mj.f
        public int l(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            this.f25021d = true;
            return 1;
        }

        @Override // mj.j
        public T poll() {
            if (this.f25022e) {
                return null;
            }
            if (!this.f25023f) {
                this.f25023f = true;
            } else if (!this.f25019b.hasNext()) {
                this.f25022e = true;
                return null;
            }
            return (T) lj.b.d(this.f25019b.next(), "The iterator returned a null value");
        }
    }

    public i(Iterable<? extends T> iterable) {
        this.f25017a = iterable;
    }

    @Override // dj.o
    public void s(q<? super T> qVar) {
        try {
            Iterator<? extends T> it = this.f25017a.iterator();
            if (!it.hasNext()) {
                kj.c.m(qVar);
                return;
            }
            a aVar = new a(qVar, it);
            qVar.b(aVar);
            if (aVar.f25021d) {
                return;
            }
            aVar.a();
        } catch (Throwable th2) {
            hj.b.b(th2);
            kj.c.p(th2, qVar);
        }
    }
}
