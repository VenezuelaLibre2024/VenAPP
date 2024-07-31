package j3;

import android.os.Process;
import j3.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19545a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19546b;

    /* renamed from: c, reason: collision with root package name */
    final Map<h3.f, c> f19547c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f19548d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f19549e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f19550f;

    /* renamed from: j3.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class ThreadFactoryC0306a implements ThreadFactory {

        /* renamed from: j3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0307a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f19551a;

            RunnableC0307a(Runnable runnable) {
                this.f19551a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f19551a.run();
            }
        }

        ThreadFactoryC0306a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0307a(runnable), "glide-active-resources");
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends WeakReference<p<?>> {

        /* renamed from: a, reason: collision with root package name */
        final h3.f f19554a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f19555b;

        /* renamed from: c, reason: collision with root package name */
        v<?> f19556c;

        c(h3.f fVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z10) {
            super(pVar, referenceQueue);
            this.f19554a = (h3.f) c4.k.d(fVar);
            this.f19556c = (pVar.c() && z10) ? (v) c4.k.d(pVar.b()) : null;
            this.f19555b = pVar.c();
        }

        void a() {
            this.f19556c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new ThreadFactoryC0306a()));
    }

    a(boolean z10, Executor executor) {
        this.f19547c = new HashMap();
        this.f19548d = new ReferenceQueue<>();
        this.f19545a = z10;
        this.f19546b = executor;
        executor.execute(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void a(h3.f fVar, p<?> pVar) {
        c put = this.f19547c.put(fVar, new c(fVar, pVar, this.f19548d, this.f19545a));
        if (put != null) {
            put.a();
        }
    }

    void b() {
        while (!this.f19550f) {
            try {
                c((c) this.f19548d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(c cVar) {
        v<?> vVar;
        synchronized (this) {
            this.f19547c.remove(cVar.f19554a);
            if (cVar.f19555b && (vVar = cVar.f19556c) != null) {
                this.f19549e.d(cVar.f19554a, new p<>(vVar, true, false, cVar.f19554a, this.f19549e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void d(h3.f fVar) {
        c remove = this.f19547c.remove(fVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized p<?> e(h3.f fVar) {
        c cVar = this.f19547c.get(fVar);
        if (cVar == null) {
            return null;
        }
        p<?> pVar = cVar.get();
        if (pVar == null) {
            c(cVar);
        }
        return pVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f19549e = aVar;
            }
        }
    }
}
