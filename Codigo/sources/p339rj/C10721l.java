package p339rj;

import dj.AbstractC6990o;
import dj.InterfaceC6991p;
import dj.InterfaceC6992q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C0000a;
import p145hj.C7744b;
import p186jj.InterfaceC9077e;
import p205kj.EnumC9285c;
import p224lj.C9513b;
import p241mj.InterfaceC9595e;
import p471yj.C12727a;

/* renamed from: rj.l */
/* loaded from: classes3.dex */
public final class C10721l {

    /* renamed from: rj.l$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends AtomicInteger implements InterfaceC9595e<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: a */
        final InterfaceC6992q<? super T> f27146a;

        /* renamed from: b */
        final T f27147b;

        public a(InterfaceC6992q<? super T> interfaceC6992q, T t10) {
            this.f27146a = interfaceC6992q;
            this.f27147b = t10;
        }

        @Override // p241mj.InterfaceC9600j
        public void clear() {
            lazySet(3);
        }

        @Override // p123gj.InterfaceC7578b
        public void dispose() {
            set(3);
        }

        @Override // p123gj.InterfaceC7578b
        /* renamed from: h */
        public boolean mo616h() {
            return get() == 3;
        }

        @Override // p241mj.InterfaceC9600j
        public boolean isEmpty() {
            return get() != 1;
        }

        @Override // p241mj.InterfaceC9596f
        /* renamed from: l */
        public int mo27706l(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        @Override // p241mj.InterfaceC9600j
        public boolean offer(T t10) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p241mj.InterfaceC9600j
        public T poll() {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f27147b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f27146a.mo607c(this.f27147b);
                if (get() == 2) {
                    lazySet(3);
                    this.f27146a.mo605a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rj.l$b */
    /* loaded from: classes3.dex */
    public static final class b<T, R> extends AbstractC6990o<R> {

        /* renamed from: a */
        final T f27148a;

        /* renamed from: b */
        final InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> f27149b;

        b(T t10, InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> interfaceC9077e) {
            this.f27148a = t10;
            this.f27149b = interfaceC9077e;
        }

        @Override // dj.AbstractC6990o
        /* renamed from: s */
        public void mo608s(InterfaceC6992q<? super R> interfaceC6992q) {
            try {
                InterfaceC6991p interfaceC6991p = (InterfaceC6991p) C9513b.m28324d(this.f27149b.apply(this.f27148a), "The mapper returned a null ObservableSource");
                if (!(interfaceC6991p instanceof Callable)) {
                    interfaceC6991p.mo20285d(interfaceC6992q);
                    return;
                }
                try {
                    Object call = ((Callable) interfaceC6991p).call();
                    if (call == null) {
                        EnumC9285c.m27701m(interfaceC6992q);
                        return;
                    }
                    a aVar = new a(interfaceC6992q, call);
                    interfaceC6992q.mo606b(aVar);
                    aVar.run();
                } catch (Throwable th2) {
                    C7744b.m23648b(th2);
                    EnumC9285c.m27704p(th2, interfaceC6992q);
                }
            } catch (Throwable th3) {
                EnumC9285c.m27704p(th3, interfaceC6992q);
            }
        }
    }

    /* renamed from: a */
    public static <T, U> AbstractC6990o<U> m32607a(T t10, InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends U>> interfaceC9077e) {
        return C12727a.m41991m(new b(t10, interfaceC9077e));
    }

    /* renamed from: b */
    public static <T, R> boolean m32608b(InterfaceC6991p<T> interfaceC6991p, InterfaceC6992q<? super R> interfaceC6992q, InterfaceC9077e<? super T, ? extends InterfaceC6991p<? extends R>> interfaceC9077e) {
        if (!(interfaceC6991p instanceof Callable)) {
            return false;
        }
        try {
            C0000a c0000a = (Object) ((Callable) interfaceC6991p).call();
            if (c0000a == null) {
                EnumC9285c.m27701m(interfaceC6992q);
                return true;
            }
            InterfaceC6991p interfaceC6991p2 = (InterfaceC6991p) C9513b.m28324d(interfaceC9077e.apply(c0000a), "The mapper returned a null ObservableSource");
            if (interfaceC6991p2 instanceof Callable) {
                Object call = ((Callable) interfaceC6991p2).call();
                if (call == null) {
                    EnumC9285c.m27701m(interfaceC6992q);
                    return true;
                }
                a aVar = new a(interfaceC6992q, call);
                interfaceC6992q.mo606b(aVar);
                aVar.run();
            } else {
                interfaceC6991p2.mo20285d(interfaceC6992q);
            }
            return true;
        } catch (Throwable th2) {
            C7744b.m23648b(th2);
            EnumC9285c.m27704p(th2, interfaceC6992q);
            return true;
        }
    }
}
