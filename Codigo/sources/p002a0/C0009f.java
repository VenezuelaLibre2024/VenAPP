package p002a0;

import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p002a0.AbstractC0010g;
import p227m.InterfaceC9531a;
import p474z.C12747a;

/* renamed from: a0.f */
/* loaded from: classes.dex */
public final class C0009f {

    /* renamed from: a */
    private static final InterfaceC9531a<?, ?> f15a = new b();

    /* JADX INFO: Add missing generic type declarations: [I, O] */
    /* renamed from: a0.f$a */
    /* loaded from: classes.dex */
    class a<I, O> implements InterfaceC0004a<I, O> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9531a f16a;

        a(InterfaceC9531a interfaceC9531a) {
            this.f16a = interfaceC9531a;
        }

        @Override // p002a0.InterfaceC0004a
        public InterfaceFutureC5920f<O> apply(I i10) {
            return C0009f.m22h(this.f16a.apply(i10));
        }
    }

    /* renamed from: a0.f$b */
    /* loaded from: classes.dex */
    class b implements InterfaceC9531a<Object, Object> {
        b() {
        }

        @Override // p227m.InterfaceC9531a
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* renamed from: a0.f$c */
    /* loaded from: classes.dex */
    public class c<I> implements InterfaceC0006c<I> {

        /* renamed from: a */
        final /* synthetic */ C0742c.a f17a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9531a f18b;

        c(C0742c.a aVar, InterfaceC9531a interfaceC9531a) {
            this.f17a = aVar;
            this.f18b = interfaceC9531a;
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            this.f17a.m3758f(th2);
        }

        @Override // p002a0.InterfaceC0006c
        public void onSuccess(I i10) {
            try {
                this.f17a.m3756c(this.f18b.apply(i10));
            } catch (Throwable th2) {
                this.f17a.m3758f(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0.f$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceFutureC5920f f19a;

        d(InterfaceFutureC5920f interfaceFutureC5920f) {
            this.f19a = interfaceFutureC5920f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19a.cancel(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0.f$e */
    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {

        /* renamed from: a */
        final Future<V> f20a;

        /* renamed from: b */
        final InterfaceC0006c<? super V> f21b;

        e(Future<V> future, InterfaceC0006c<? super V> interfaceC0006c) {
            this.f20a = future;
            this.f21b = interfaceC0006c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f21b.onSuccess(C0009f.m18d(this.f20a));
            } catch (Error e10) {
                e = e10;
                this.f21b.mo8a(e);
            } catch (RuntimeException e11) {
                e = e11;
                this.f21b.mo8a(e);
            } catch (ExecutionException e12) {
                Throwable cause = e12.getCause();
                if (cause == null) {
                    this.f21b.mo8a(e12);
                } else {
                    this.f21b.mo8a(cause);
                }
            }
        }

        public String toString() {
            return e.class.getSimpleName() + "," + this.f21b;
        }
    }

    /* renamed from: b */
    public static <V> void m16b(InterfaceFutureC5920f<V> interfaceFutureC5920f, InterfaceC0006c<? super V> interfaceC0006c, Executor executor) {
        C0984h.m4833k(interfaceC0006c);
        interfaceFutureC5920f.addListener(new e(interfaceFutureC5920f, interfaceC0006c), executor);
    }

    /* renamed from: c */
    public static <V> InterfaceFutureC5920f<List<V>> m17c(Collection<? extends InterfaceFutureC5920f<? extends V>> collection) {
        return new C0011h(new ArrayList(collection), true, C12747a.m42280a());
    }

    /* renamed from: d */
    public static <V> V m18d(Future<V> future) {
        C0984h.m4836n(future.isDone(), "Future was expected to be done, " + future);
        return (V) m19e(future);
    }

    /* renamed from: e */
    public static <V> V m19e(Future<V> future) {
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

    /* renamed from: f */
    public static <V> InterfaceFutureC5920f<V> m20f(Throwable th2) {
        return new AbstractC0010g.a(th2);
    }

    /* renamed from: g */
    public static <V> ScheduledFuture<V> m21g(Throwable th2) {
        return new AbstractC0010g.b(th2);
    }

    /* renamed from: h */
    public static <V> InterfaceFutureC5920f<V> m22h(V v10) {
        return v10 == null ? AbstractC0010g.m31b() : new AbstractC0010g.c(v10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ Object m23i(InterfaceFutureC5920f interfaceFutureC5920f, C0742c.a aVar) {
        m27m(false, interfaceFutureC5920f, f15a, aVar, C12747a.m42280a());
        return "nonCancellationPropagating[" + interfaceFutureC5920f + "]";
    }

    /* renamed from: j */
    public static <V> InterfaceFutureC5920f<V> m24j(final InterfaceFutureC5920f<V> interfaceFutureC5920f) {
        C0984h.m4833k(interfaceFutureC5920f);
        return interfaceFutureC5920f.isDone() ? interfaceFutureC5920f : C0742c.m3752a(new C0742c.c() { // from class: a0.e
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m23i;
                m23i = C0009f.m23i(InterfaceFutureC5920f.this, aVar);
                return m23i;
            }
        });
    }

    /* renamed from: k */
    public static <V> void m25k(InterfaceFutureC5920f<V> interfaceFutureC5920f, C0742c.a<V> aVar) {
        m26l(interfaceFutureC5920f, f15a, aVar, C12747a.m42280a());
    }

    /* renamed from: l */
    public static <I, O> void m26l(InterfaceFutureC5920f<I> interfaceFutureC5920f, InterfaceC9531a<? super I, ? extends O> interfaceC9531a, C0742c.a<O> aVar, Executor executor) {
        m27m(true, interfaceFutureC5920f, interfaceC9531a, aVar, executor);
    }

    /* renamed from: m */
    private static <I, O> void m27m(boolean z10, InterfaceFutureC5920f<I> interfaceFutureC5920f, InterfaceC9531a<? super I, ? extends O> interfaceC9531a, C0742c.a<O> aVar, Executor executor) {
        C0984h.m4833k(interfaceFutureC5920f);
        C0984h.m4833k(interfaceC9531a);
        C0984h.m4833k(aVar);
        C0984h.m4833k(executor);
        m16b(interfaceFutureC5920f, new c(aVar, interfaceC9531a), executor);
        if (z10) {
            aVar.m3754a(new d(interfaceFutureC5920f), C12747a.m42280a());
        }
    }

    /* renamed from: n */
    public static <V> InterfaceFutureC5920f<List<V>> m28n(Collection<? extends InterfaceFutureC5920f<? extends V>> collection) {
        return new C0011h(new ArrayList(collection), false, C12747a.m42280a());
    }

    /* renamed from: o */
    public static <I, O> InterfaceFutureC5920f<O> m29o(InterfaceFutureC5920f<I> interfaceFutureC5920f, InterfaceC9531a<? super I, ? extends O> interfaceC9531a, Executor executor) {
        C0984h.m4833k(interfaceC9531a);
        return m30p(interfaceFutureC5920f, new a(interfaceC9531a), executor);
    }

    /* renamed from: p */
    public static <I, O> InterfaceFutureC5920f<O> m30p(InterfaceFutureC5920f<I> interfaceFutureC5920f, InterfaceC0004a<? super I, ? extends O> interfaceC0004a, Executor executor) {
        RunnableC0005b runnableC0005b = new RunnableC0005b(interfaceC0004a, interfaceFutureC5920f);
        interfaceFutureC5920f.addListener(runnableC0005b, executor);
        return runnableC0005b;
    }
}
