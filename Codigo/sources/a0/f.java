package a0;

import a0.g;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final m.a<?, ?> f15a = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a<I, O> implements a0.a<I, O> {

        /* renamed from: a */
        final /* synthetic */ m.a f16a;

        a(m.a aVar) {
            this.f16a = aVar;
        }

        @Override // a0.a
        public com.google.common.util.concurrent.f<O> apply(I i10) {
            return f.h(this.f16a.apply(i10));
        }
    }

    /* loaded from: classes.dex */
    class b implements m.a<Object, Object> {
        b() {
        }

        @Override // m.a
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public class c<I> implements a0.c<I> {

        /* renamed from: a */
        final /* synthetic */ c.a f17a;

        /* renamed from: b */
        final /* synthetic */ m.a f18b;

        c(c.a aVar, m.a aVar2) {
            this.f17a = aVar;
            this.f18b = aVar2;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            this.f17a.f(th2);
        }

        @Override // a0.c
        public void onSuccess(I i10) {
            try {
                this.f17a.c(this.f18b.apply(i10));
            } catch (Throwable th2) {
                this.f17a.f(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ com.google.common.util.concurrent.f f19a;

        d(com.google.common.util.concurrent.f fVar) {
            this.f19a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19a.cancel(true);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f20a;

        /* renamed from: b */
        final a0.c<? super V> f21b;

        e(Future<V> future, a0.c<? super V> cVar) {
            this.f20a = future;
            this.f21b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f21b.onSuccess(f.d(this.f20a));
            } catch (Error e10) {
                e = e10;
                this.f21b.a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f21b.a(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.f21b.a(e12);
                } else {
                    this.f21b.a(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f21b;
        }
    }

    public static <V> void b(com.google.common.util.concurrent.f<V> fVar, a0.c<? super V> cVar, Executor executor) {
        androidx.core.util.h.k(cVar);
        fVar.addListener(new e(fVar, cVar), executor);
    }

    public static <V> com.google.common.util.concurrent.f<List<V>> c(Collection<? extends com.google.common.util.concurrent.f<? extends V>> collection) {
        return new h(new ArrayList(collection), true, z.a.a());
    }

    public static <V> V d(Future<V> future) {
        androidx.core.util.h.n(future.isDone(), "Future was expected to be done, " + future);
        return (V) e(future);
    }

    public static <V> V e(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public static <V> com.google.common.util.concurrent.f<V> f(Throwable th2) {
        return new g.a(th2);
    }

    public static <V> ScheduledFuture<V> g(Throwable th2) {
        return new g.b(th2);
    }

    public static <V> com.google.common.util.concurrent.f<V> h(V v10) {
        return v10 == null ? g.b() : new g.c(v10);
    }

    public static /* synthetic */ Object i(com.google.common.util.concurrent.f fVar, c.a aVar) {
        m(false, fVar, f15a, aVar, z.a.a());
        return "nonCancellationPropagating[" + fVar + "]";
    }

    public static <V> com.google.common.util.concurrent.f<V> j(com.google.common.util.concurrent.f<V> fVar) {
        androidx.core.util.h.k(fVar);
        return fVar.isDone() ? fVar : androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: a0.e
            public /* synthetic */ e() {
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object i10;
                i10 = f.i(com.google.common.util.concurrent.f.this, aVar);
                return i10;
            }
        });
    }

    public static <V> void k(com.google.common.util.concurrent.f<V> fVar, c.a<V> aVar) {
        l(fVar, f15a, aVar, z.a.a());
    }

    public static <I, O> void l(com.google.common.util.concurrent.f<I> fVar, m.a<? super I, ? extends O> aVar, c.a<O> aVar2, Executor executor) {
        m(true, fVar, aVar, aVar2, executor);
    }

    private static <I, O> void m(boolean z10, com.google.common.util.concurrent.f<I> fVar, m.a<? super I, ? extends O> aVar, c.a<O> aVar2, Executor executor) {
        androidx.core.util.h.k(fVar);
        androidx.core.util.h.k(aVar);
        androidx.core.util.h.k(aVar2);
        androidx.core.util.h.k(executor);
        b(fVar, new c(aVar2, aVar), executor);
        if (z10) {
            aVar2.a(new d(fVar), z.a.a());
        }
    }

    public static <V> com.google.common.util.concurrent.f<List<V>> n(Collection<? extends com.google.common.util.concurrent.f<? extends V>> collection) {
        return new h(new ArrayList(collection), false, z.a.a());
    }

    public static <I, O> com.google.common.util.concurrent.f<O> o(com.google.common.util.concurrent.f<I> fVar, m.a<? super I, ? extends O> aVar, Executor executor) {
        androidx.core.util.h.k(aVar);
        return p(fVar, new a(aVar), executor);
    }

    public static <I, O> com.google.common.util.concurrent.f<O> p(com.google.common.util.concurrent.f<I> fVar, a0.a<? super I, ? extends O> aVar, Executor executor) {
        a0.b bVar = new a0.b(aVar, fVar);
        fVar.addListener(bVar, executor);
        return bVar;
    }
}
