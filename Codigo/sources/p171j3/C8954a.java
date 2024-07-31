package p171j3;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p036c4.C1870k;
import p129h3.InterfaceC7622f;
import p171j3.C8969p;

/* renamed from: j3.a */
/* loaded from: classes.dex */
final class C8954a {

    /* renamed from: a */
    private final boolean f21296a;

    /* renamed from: b */
    private final Executor f21297b;

    /* renamed from: c */
    final Map<InterfaceC7622f, c> f21298c;

    /* renamed from: d */
    private final ReferenceQueue<C8969p<?>> f21299d;

    /* renamed from: e */
    private C8969p.a f21300e;

    /* renamed from: f */
    private volatile boolean f21301f;

    /* renamed from: j3.a$a */
    /* loaded from: classes.dex */
    class a implements ThreadFactory {

        /* renamed from: j3.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC13218a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f21302a;

            RunnableC13218a(Runnable runnable) {
                this.f21302a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f21302a.run();
            }
        }

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC13218a(runnable), "glide-active-resources");
        }
    }

    /* renamed from: j3.a$b */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8954a.this.m26181b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j3.a$c */
    /* loaded from: classes.dex */
    public static final class c extends WeakReference<C8969p<?>> {

        /* renamed from: a */
        final InterfaceC7622f f21305a;

        /* renamed from: b */
        final boolean f21306b;

        /* renamed from: c */
        InterfaceC8975v<?> f21307c;

        c(InterfaceC7622f interfaceC7622f, C8969p<?> c8969p, ReferenceQueue<? super C8969p<?>> referenceQueue, boolean z10) {
            super(c8969p, referenceQueue);
            this.f21305a = (InterfaceC7622f) C1870k.m9950d(interfaceC7622f);
            this.f21307c = (c8969p.m26307c() && z10) ? (InterfaceC8975v) C1870k.m9950d(c8969p.m26306b()) : null;
            this.f21306b = c8969p.m26307c();
        }

        /* renamed from: a */
        void m26186a() {
            this.f21307c = null;
            clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8954a(boolean z10) {
        this(z10, Executors.newSingleThreadExecutor(new a()));
    }

    C8954a(boolean z10, Executor executor) {
        this.f21298c = new HashMap();
        this.f21299d = new ReferenceQueue<>();
        this.f21296a = z10;
        this.f21297b = executor;
        executor.execute(new b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void m26180a(InterfaceC7622f interfaceC7622f, C8969p<?> c8969p) {
        c put = this.f21298c.put(interfaceC7622f, new c(interfaceC7622f, c8969p, this.f21299d, this.f21296a));
        if (put != null) {
            put.m26186a();
        }
    }

    /* renamed from: b */
    void m26181b() {
        while (!this.f21301f) {
            try {
                m26182c((c) this.f21299d.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    void m26182c(c cVar) {
        InterfaceC8975v<?> interfaceC8975v;
        synchronized (this) {
            this.f21298c.remove(cVar.f21305a);
            if (cVar.f21306b && (interfaceC8975v = cVar.f21307c) != null) {
                this.f21300e.mo26274d(cVar.f21305a, new C8969p<>(interfaceC8975v, true, false, cVar.f21305a, this.f21300e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void m26183d(InterfaceC7622f interfaceC7622f) {
        c remove = this.f21298c.remove(interfaceC7622f);
        if (remove != null) {
            remove.m26186a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized C8969p<?> m26184e(InterfaceC7622f interfaceC7622f) {
        c cVar = this.f21298c.get(interfaceC7622f);
        if (cVar == null) {
            return null;
        }
        C8969p<?> c8969p = cVar.get();
        if (c8969p == null) {
            m26182c(cVar);
        }
        return c8969p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m26185f(C8969p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f21300e = aVar;
            }
        }
    }
}
