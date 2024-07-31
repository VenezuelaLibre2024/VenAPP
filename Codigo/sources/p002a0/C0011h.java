package p002a0;

import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a0.h */
/* loaded from: classes.dex */
public class C0011h<V> implements InterfaceFutureC5920f<List<V>> {

    /* renamed from: a */
    List<? extends InterfaceFutureC5920f<? extends V>> f25a;

    /* renamed from: b */
    List<V> f26b;

    /* renamed from: c */
    private final boolean f27c;

    /* renamed from: d */
    private final AtomicInteger f28d;

    /* renamed from: e */
    private final InterfaceFutureC5920f<List<V>> f29e = C0742c.m3752a(new a());

    /* renamed from: f */
    C0742c.a<List<V>> f30f;

    /* renamed from: a0.h$a */
    /* loaded from: classes.dex */
    class a implements C0742c.c<List<V>> {
        a() {
        }

        @Override // androidx.concurrent.futures.C0742c.c
        /* renamed from: a */
        public Object mo14a(C0742c.a<List<V>> aVar) {
            C0984h.m4836n(C0011h.this.f30f == null, "The result can only set once!");
            C0011h.this.f30f = aVar;
            return "ListFuture[" + this + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0.h$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0011h c0011h = C0011h.this;
            c0011h.f26b = null;
            c0011h.f25a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0.h$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f33a;

        /* renamed from: b */
        final /* synthetic */ InterfaceFutureC5920f f34b;

        c(int i10, InterfaceFutureC5920f interfaceFutureC5920f) {
            this.f33a = i10;
            this.f34b = interfaceFutureC5920f;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0011h.this.m37e(this.f33a, this.f34b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0011h(List<? extends InterfaceFutureC5920f<? extends V>> list, boolean z10, Executor executor) {
        this.f25a = (List) C0984h.m4833k(list);
        this.f26b = new ArrayList(list.size());
        this.f27c = z10;
        this.f28d = new AtomicInteger(list.size());
        m34d(executor);
    }

    /* renamed from: a */
    private void m33a() {
        List<? extends InterfaceFutureC5920f<? extends V>> list = this.f25a;
        if (list == null || isDone()) {
            return;
        }
        for (InterfaceFutureC5920f<? extends V> interfaceFutureC5920f : list) {
            while (!interfaceFutureC5920f.isDone()) {
                try {
                    interfaceFutureC5920f.get();
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

    /* renamed from: d */
    private void m34d(Executor executor) {
        addListener(new b(), C12747a.m42280a());
        if (this.f25a.isEmpty()) {
            this.f30f.m3756c(new ArrayList(this.f26b));
            return;
        }
        for (int i10 = 0; i10 < this.f25a.size(); i10++) {
            this.f26b.add(null);
        }
        List<? extends InterfaceFutureC5920f<? extends V>> list = this.f25a;
        for (int i11 = 0; i11 < list.size(); i11++) {
            InterfaceFutureC5920f<? extends V> interfaceFutureC5920f = list.get(i11);
            interfaceFutureC5920f.addListener(new c(i11, interfaceFutureC5920f), executor);
        }
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC5920f
    public void addListener(Runnable runnable, Executor executor) {
        this.f29e.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<V> get() {
        m33a();
        return this.f29e.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public List<V> get(long j10, TimeUnit timeUnit) {
        return this.f29e.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        List<? extends InterfaceFutureC5920f<? extends V>> list = this.f25a;
        if (list != null) {
            Iterator<? extends InterfaceFutureC5920f<? extends V>> it = list.iterator();
            while (it.hasNext()) {
                it.next().cancel(z10);
            }
        }
        return this.f29e.cancel(z10);
    }

    /* renamed from: e */
    void m37e(int i10, Future<? extends V> future) {
        C0742c.a<List<V>> aVar;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f26b;
        if (isDone() || list == null) {
            C0984h.m4836n(this.f27c, "Future was done before all dependencies completed");
            return;
        }
        try {
            try {
                try {
                    try {
                        C0984h.m4836n(future.isDone(), "Tried to set value from future which is not done");
                        list.set(i10, C0009f.m19e(future));
                        decrementAndGet = this.f28d.decrementAndGet();
                        C0984h.m4836n(decrementAndGet >= 0, "Less than 0 remaining futures");
                    } catch (Error e10) {
                        this.f30f.m3758f(e10);
                        int decrementAndGet2 = this.f28d.decrementAndGet();
                        C0984h.m4836n(decrementAndGet2 >= 0, "Less than 0 remaining futures");
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
                        C0984h.m4836n(decrementAndGet3 >= 0, "Less than 0 remaining futures");
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
                        this.f30f.m3758f(e11);
                    }
                    int decrementAndGet4 = this.f28d.decrementAndGet();
                    C0984h.m4836n(decrementAndGet4 >= 0, "Less than 0 remaining futures");
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
                    this.f30f.m3758f(e12.getCause());
                }
                int decrementAndGet5 = this.f28d.decrementAndGet();
                C0984h.m4836n(decrementAndGet5 >= 0, "Less than 0 remaining futures");
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
                    aVar.m3756c(arrayList);
                    return;
                }
                C0984h.m4835m(isDone());
            }
        } catch (Throwable th2) {
            int decrementAndGet6 = this.f28d.decrementAndGet();
            C0984h.m4836n(decrementAndGet6 >= 0, "Less than 0 remaining futures");
            if (decrementAndGet6 == 0) {
                List<V> list7 = this.f26b;
                if (list7 != null) {
                    this.f30f.m3756c(new ArrayList(list7));
                } else {
                    C0984h.m4835m(isDone());
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
