package ul;

import ck.v;
import com.google.android.gms.common.api.a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: h */
    public static final b f27820h = new b(null);

    /* renamed from: i */
    public static final e f27821i = new e(new c(rl.d.M(n.k(rl.d.f25047i, " TaskRunner"), true)));

    /* renamed from: j */
    private static final Logger f27822j;

    /* renamed from: a */
    private final a f27823a;

    /* renamed from: b */
    private int f27824b;

    /* renamed from: c */
    private boolean f27825c;

    /* renamed from: d */
    private long f27826d;

    /* renamed from: e */
    private final List<ul.d> f27827e;

    /* renamed from: f */
    private final List<ul.d> f27828f;

    /* renamed from: g */
    private final Runnable f27829g;

    /* loaded from: classes3.dex */
    public interface a {
        void a(e eVar, long j10);

        void b(e eVar);

        long c();

        void execute(Runnable runnable);
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final Logger a() {
            return e.f27822j;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a */
        private final ThreadPoolExecutor f27830a;

        public c(ThreadFactory threadFactory) {
            n.e(threadFactory, "threadFactory");
            this.f27830a = new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // ul.e.a
        public void a(e taskRunner, long j10) {
            n.e(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // ul.e.a
        public void b(e taskRunner) {
            n.e(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // ul.e.a
        public long c() {
            return System.nanoTime();
        }

        @Override // ul.e.a
        public void execute(Runnable runnable) {
            n.e(runnable, "runnable");
            this.f27830a.execute(runnable);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ul.a d10;
            long j10;
            while (true) {
                e eVar = e.this;
                synchronized (eVar) {
                    d10 = eVar.d();
                }
                if (d10 == null) {
                    return;
                }
                ul.d d11 = d10.d();
                n.b(d11);
                e eVar2 = e.this;
                boolean isLoggable = e.f27820h.a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = d11.h().g().c();
                    ul.b.c(d10, d11, "starting");
                } else {
                    j10 = -1;
                }
                try {
                    try {
                        eVar2.j(d10);
                        v vVar = v.f7137a;
                        if (isLoggable) {
                            ul.b.c(d10, d11, n.k("finished run in ", ul.b.b(d11.h().g().c() - j10)));
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        ul.b.c(d10, d11, n.k("failed a run in ", ul.b.b(d11.h().g().c() - j10)));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(e.class.getName());
        n.d(logger, "getLogger(TaskRunner::class.java.name)");
        f27822j = logger;
    }

    public e(a backend) {
        n.e(backend, "backend");
        this.f27823a = backend;
        this.f27824b = ModuleDescriptor.MODULE_VERSION;
        this.f27827e = new ArrayList();
        this.f27828f = new ArrayList();
        this.f27829g = new d();
    }

    private final void c(ul.a aVar, long j10) {
        if (rl.d.f25046h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        ul.d d10 = aVar.d();
        n.b(d10);
        if (!(d10.c() == aVar)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean d11 = d10.d();
        d10.m(false);
        d10.l(null);
        this.f27827e.remove(d10);
        if (j10 != -1 && !d11 && !d10.g()) {
            d10.k(aVar, j10, true);
        }
        if (!d10.e().isEmpty()) {
            this.f27828f.add(d10);
        }
    }

    private final void e(ul.a aVar) {
        if (rl.d.f25046h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        ul.d d10 = aVar.d();
        n.b(d10);
        d10.e().remove(aVar);
        this.f27828f.remove(d10);
        d10.l(aVar);
        this.f27827e.add(d10);
    }

    public final void j(ul.a aVar) {
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.b());
        try {
            long f10 = aVar.f();
            synchronized (this) {
                c(aVar, f10);
                v vVar = v.f7137a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                c(aVar, -1L);
                v vVar2 = v.f7137a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    public final ul.a d() {
        boolean z10;
        if (rl.d.f25046h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f27828f.isEmpty()) {
            long c10 = this.f27823a.c();
            Iterator<ul.d> it = this.f27828f.iterator();
            long j10 = Long.MAX_VALUE;
            ul.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                ul.a aVar2 = it.next().e().get(0);
                long max = Math.max(0L, aVar2.c() - c10);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                e(aVar);
                if (z10 || (!this.f27825c && (!this.f27828f.isEmpty()))) {
                    this.f27823a.execute(this.f27829g);
                }
                return aVar;
            }
            if (this.f27825c) {
                if (j10 < this.f27826d - c10) {
                    this.f27823a.b(this);
                }
                return null;
            }
            this.f27825c = true;
            this.f27826d = c10 + j10;
            try {
                try {
                    this.f27823a.a(this, j10);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.f27825c = false;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.f27827e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                this.f27827e.get(size).b();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        int size2 = this.f27828f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            ul.d dVar = this.f27828f.get(size2);
            dVar.b();
            if (dVar.e().isEmpty()) {
                this.f27828f.remove(size2);
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    public final a g() {
        return this.f27823a;
    }

    public final void h(ul.d taskQueue) {
        n.e(taskQueue, "taskQueue");
        if (rl.d.f25046h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.c() == null) {
            if (!taskQueue.e().isEmpty()) {
                rl.d.c(this.f27828f, taskQueue);
            } else {
                this.f27828f.remove(taskQueue);
            }
        }
        if (this.f27825c) {
            this.f27823a.b(this);
        } else {
            this.f27823a.execute(this.f27829g);
        }
    }

    public final ul.d i() {
        int i10;
        synchronized (this) {
            i10 = this.f27824b;
            this.f27824b = i10 + 1;
        }
        return new ul.d(this, n.k("Q", Integer.valueOf(i10)));
    }
}
