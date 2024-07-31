package a0;

import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class d<V> implements com.google.common.util.concurrent.f<V> {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.f<V> f11a;

    /* renamed from: b, reason: collision with root package name */
    c.a<V> f12b;

    /* loaded from: classes.dex */
    class a implements c.InterfaceC0032c<V> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0032c
        public Object a(c.a<V> aVar) {
            androidx.core.util.h.n(d.this.f12b == null, "The result can only set once!");
            d.this.f12b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        this.f11a = androidx.concurrent.futures.c.a(new a());
    }

    d(com.google.common.util.concurrent.f<V> fVar) {
        this.f11a = (com.google.common.util.concurrent.f) androidx.core.util.h.k(fVar);
    }

    public static <V> d<V> a(com.google.common.util.concurrent.f<V> fVar) {
        return fVar instanceof d ? (d) fVar : new d<>(fVar);
    }

    @Override // com.google.common.util.concurrent.f
    public void addListener(Runnable runnable, Executor executor) {
        this.f11a.addListener(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b(V v10) {
        c.a<V> aVar = this.f12b;
        if (aVar != null) {
            return aVar.c(v10);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(Throwable th2) {
        c.a<V> aVar = this.f12b;
        if (aVar != null) {
            return aVar.f(th2);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f11a.cancel(z10);
    }

    public final <T> d<T> d(m.a<? super V, T> aVar, Executor executor) {
        return (d) f.o(this, aVar, executor);
    }

    public final <T> d<T> e(a0.a<? super V, T> aVar, Executor executor) {
        return (d) f.p(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() {
        return this.f11a.get();
    }

    @Override // java.util.concurrent.Future
    public V get(long j10, TimeUnit timeUnit) {
        return this.f11a.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f11a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f11a.isDone();
    }
}
