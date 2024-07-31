package rj;

import dj.o;
import dj.p;
import dj.q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class l {

    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicInteger implements mj.e<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: a, reason: collision with root package name */
        final q<? super T> f25027a;

        /* renamed from: b, reason: collision with root package name */
        final T f25028b;

        public a(q<? super T> qVar, T t10) {
            this.f25027a = qVar;
            this.f25028b = t10;
        }

        @Override // mj.j
        public void clear() {
            lazySet(3);
        }

        @Override // gj.b
        public void dispose() {
            set(3);
        }

        @Override // gj.b
        public boolean h() {
            return get() == 3;
        }

        @Override // mj.j
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // mj.f
        public int l(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // mj.j
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // mj.j
        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f25028b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f25027a.c(this.f25028b);
                if (get() == 2) {
                    lazySet(3);
                    this.f25027a.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b<T, R> extends o<R> {

        /* renamed from: a, reason: collision with root package name */
        final T f25029a;

        /* renamed from: b, reason: collision with root package name */
        final jj.e<? super T, ? extends p<? extends R>> f25030b;

        b(T t10, jj.e<? super T, ? extends p<? extends R>> eVar) {
            this.f25029a = t10;
            this.f25030b = eVar;
        }

        @Override // dj.o
        public void s(q<? super R> qVar) {
            try {
                p pVar = (p) lj.b.d(this.f25030b.apply(this.f25029a), "The mapper returned a null ObservableSource");
                if (!(pVar instanceof Callable)) {
                    pVar.d(qVar);
                    return;
                }
                try {
                    Object call = ((Callable) pVar).call();
                    if (call == null) {
                        kj.c.m(qVar);
                        return;
                    }
                    a aVar = new a(qVar, call);
                    qVar.b(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    hj.b.b(th2);
                    kj.c.p(th2, qVar);
                }
            } catch (Throwable th3) {
                kj.c.p(th3, qVar);
            }
        }
    }

    public static <T, U> o<U> a(T t10, jj.e<? super T, ? extends p<? extends U>> eVar) {
        return yj.a.m(new b(t10, eVar));
    }

    public static <T, R> boolean b(p<T> pVar, q<? super R> qVar, jj.e<? super T, ? extends p<? extends R>> eVar) {
        if (!(pVar instanceof Callable)) {
            return false;
        }
        try {
            defpackage.a aVar = (Object) ((Callable) pVar).call();
            if (aVar == null) {
                kj.c.m(qVar);
                return true;
            }
            p pVar2 = (p) lj.b.d(eVar.apply(aVar), "The mapper returned a null ObservableSource");
            if (pVar2 instanceof Callable) {
                Object call = ((Callable) pVar2).call();
                if (call == null) {
                    kj.c.m(qVar);
                    return true;
                }
                a aVar2 = new a(qVar, call);
                qVar.b(aVar2);
                aVar2.run();
            } else {
                pVar2.d(qVar);
            }
            return true;
        } catch (Throwable th2) {
            hj.b.b(th2);
            kj.c.p(th2, qVar);
            return true;
        }
    }
}
