package a0;

import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h<V> implements com.google.common.util.concurrent.f<List<V>> {

    /* renamed from: a, reason: collision with root package name */
    List<? extends com.google.common.util.concurrent.f<? extends V>> f25a;

    /* renamed from: b, reason: collision with root package name */
    List<V> f26b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f28d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.common.util.concurrent.f<List<V>> f29e = androidx.concurrent.futures.c.a(new a());

    /* renamed from: f, reason: collision with root package name */
    c.a<List<V>> f30f;

    /* loaded from: classes.dex */
    class a implements c.InterfaceC0032c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.c.InterfaceC0032c
        public Object a(c.a<List<V>> aVar) {
            androidx.core.util.h.n(h.this.f30f == null, "The result can only set once!");
            h.this.f30f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f26b = null;
            hVar.f25a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.common.util.concurrent.f f34b;

        c(int i10, com.google.common.util.concurrent.f fVar) {
            this.f33a = i10;
            this.f34b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.e(this.f33a, this.f34b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(List<? extends com.google.common.util.concurrent.f<? extends V>> list, boolean z10, Executor executor) {
        this.f25a = (List) androidx.core.util.h.k(list);
        this.f26b = new ArrayList(list.size());
        this.f27c = z10;
        this.f28d = new AtomicInteger(list.size());
        d(executor);
    }

    private void a() {
        List<? extends com.google.common.util.concurrent.f<? extends V>> list = this.f25a;
        if (list == null || isDone()) {
            return;
        }
        for (com.google.common.util.concurrent.f<? extends V> fVar : list) {
            while (!fVar.isDone()) {
                try {
                    fVar.get();
                } catch (Error e10) {
                    throw e10;
                } catch (InterruptedException e11) {
                    throw e11;
                } catch (Throwable unused) {
                    if (this.f27c) {
                        return;
                    }
                }
            }
        }
    }

    private void d(Executor executor) {
        addListener(new b(), z.a.a());
        if (this.f25a.isEmpty()) {
            this.f30f.c(new ArrayList(this.f26b));
            return;
        }
        for (int i10 = 0; i10 < this.f25a.size(); i10++) {
            this.f26b.add(null);
        }
        List<? extends com.google.common.util.concurrent.f<? extends V>> list = this.f25a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            com.google.common.util.concurrent.f<? extends V> fVar = list.get(i11);
            fVar.addListener(new c(i11, fVar), executor);
        }
    }

    @Override // com.google.common.util.concurrent.f
    public void addListener(Runnable runnable, Executor executor) {
        this.f29e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<V> get() {
        a();
        return this.f29e.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.f29e.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends com.google.common.util.concurrent.f<? extends V>> list = this.f25a;
        if (list != null) {
            Iterator<? extends com.google.common.util.concurrent.f<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f29e.cancel(z10);
    }

    void e(int i10, Future<? extends V> future) {
        c.a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f26b;
        if (isDone() || list == null) {
            androidx.core.util.h.n(this.f27c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        androidx.core.util.h.n(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i10, f.e(future));
                        decrementAndGet = this.f28d.decrementAndGet();
                        androidx.core.util.h.n(decrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (Error e10) {
                        this.f30f.f(e10);
                        int decrementAndGet2 = this.f28d.decrementAndGet();
                        androidx.core.util.h.n(decrementAndGet2 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet2 != 0) {
                            return;
                        }
                        List<V> list2 = this.f26b;
                        if (list2 != null) {
                            aVar = this.f30f;
                            arrayList = new ArrayList(list2);
                        }
                    } catch (CancellationException unused) {
                        if (this.f27c) {
                            cancel(false);
                        }
                        int decrementAndGet3 = this.f28d.decrementAndGet();
                        androidx.core.util.h.n(decrementAndGet3 >= 0, "Less than 0 remaining futures");
                        if (decrementAndGet3 != 0) {
                            return;
                        }
                        List<V> list3 = this.f26b;
                        if (list3 != null) {
                            aVar = this.f30f;
                            arrayList = new ArrayList(list3);
                        }
                    }
                } catch (RuntimeException e11) {
                    if (this.f27c) {
                        this.f30f.f(e11);
                    }
                    int decrementAndGet4 = this.f28d.decrementAndGet();
                    androidx.core.util.h.n(decrementAndGet4 >= 0, "Less than 0 remaining futures");
                    if (decrementAndGet4 != 0) {
                        return;
                    }
                    List<V> list4 = this.f26b;
                    if (list4 != null) {
                        aVar = this.f30f;
                        arrayList = new ArrayList(list4);
                    }
                }
            } catch (ExecutionException e12) {
                if (this.f27c) {
                    this.f30f.f(e12.getCause());
                }
                int decrementAndGet5 = this.f28d.decrementAndGet();
                androidx.core.util.h.n(decrementAndGet5 >= 0, "Less than 0 remaining futures");
                if (decrementAndGet5 != 0) {
                    return;
                }
                List<V> list5 = this.f26b;
                if (list5 != null) {
                    aVar = this.f30f;
                    arrayList = new ArrayList(list5);
                }
            }
            if (decrementAndGet == 0) {
                List<V> list6 = this.f26b;
                if (list6 != null) {
                    aVar = this.f30f;
                    arrayList = new ArrayList(list6);
                    aVar.c(arrayList);
                    return;
                }
                androidx.core.util.h.m(isDone());
            }
        } catch (Throwable th2) {
            int decrementAndGet6 = this.f28d.decrementAndGet();
            androidx.core.util.h.n(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.f26b;
                if (list7 != null) {
                    this.f30f.c(new ArrayList(list7));
                } else {
                    androidx.core.util.h.m(isDone());
                }
            }
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f29e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f29e.isDone();
    }
}
