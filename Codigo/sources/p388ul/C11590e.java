package p388ul;

import ck.C2037v;
import com.google.android.gms.common.api.C5101a;
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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p341rl.C10727d;

/* renamed from: ul.e */
/* loaded from: classes3.dex */
public final class C11590e {

    /* renamed from: h */
    public static final b f30143h = new b(null);

    /* renamed from: i */
    public static final C11590e f30144i = new C11590e(new c(C10727d.m32627M(C9322n.m27787k(C10727d.f27166i, " TaskRunner"), true)));

    /* renamed from: j */
    private static final Logger f30145j;

    /* renamed from: a */
    private final a f30146a;

    /* renamed from: b */
    private int f30147b;

    /* renamed from: c */
    private boolean f30148c;

    /* renamed from: d */
    private long f30149d;

    /* renamed from: e */
    private final List<C11589d> f30150e;

    /* renamed from: f */
    private final List<C11589d> f30151f;

    /* renamed from: g */
    private final Runnable f30152g;

    /* renamed from: ul.e$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo36338a(C11590e c11590e, long j10);

        /* renamed from: b */
        void mo36339b(C11590e c11590e);

        /* renamed from: c */
        long mo36340c();

        void execute(Runnable runnable);
    }

    /* renamed from: ul.e$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final Logger m36341a() {
            return C11590e.f30145j;
        }
    }

    /* renamed from: ul.e$c */
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a */
        private final ThreadPoolExecutor f30153a;

        public c(ThreadFactory threadFactory) {
            C9322n.m27781e(threadFactory, "threadFactory");
            this.f30153a = new ThreadPoolExecutor(0, C5101a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p388ul.C11590e.a
        /* renamed from: a */
        public void mo36338a(C11590e taskRunner, long j10) {
            C9322n.m27781e(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // p388ul.C11590e.a
        /* renamed from: b */
        public void mo36339b(C11590e taskRunner) {
            C9322n.m27781e(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p388ul.C11590e.a
        /* renamed from: c */
        public long mo36340c() {
            return System.nanoTime();
        }

        @Override // p388ul.C11590e.a
        public void execute(Runnable runnable) {
            C9322n.m27781e(runnable, "runnable");
            this.f30153a.execute(runnable);
        }
    }

    /* renamed from: ul.e$d */
    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC11586a m36333d;
            long j10;
            while (true) {
                C11590e c11590e = C11590e.this;
                synchronized (c11590e) {
                    m36333d = c11590e.m36333d();
                }
                if (m36333d == null) {
                    return;
                }
                C11589d m36306d = m36333d.m36306d();
                C9322n.m27778b(m36306d);
                C11590e c11590e2 = C11590e.this;
                boolean isLoggable = C11590e.f30143h.m36341a().isLoggable(Level.FINE);
                if (isLoggable) {
                    j10 = m36306d.m36321h().m36335g().mo36340c();
                    C11587b.m36312c(m36333d, m36306d, "starting");
                } else {
                    j10 = -1;
                }
                try {
                    try {
                        c11590e2.m36332j(m36333d);
                        C2037v c2037v = C2037v.f8089a;
                        if (isLoggable) {
                            C11587b.m36312c(m36333d, m36306d, C9322n.m27787k("finished run in ", C11587b.m36311b(m36306d.m36321h().m36335g().mo36340c() - j10)));
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    if (isLoggable) {
                        C11587b.m36312c(m36333d, m36306d, C9322n.m27787k("failed a run in ", C11587b.m36311b(m36306d.m36321h().m36335g().mo36340c() - j10)));
                    }
                    throw th2;
                }
            }
        }
    }

    static {
        Logger logger = Logger.getLogger(C11590e.class.getName());
        C9322n.m27780d(logger, "getLogger(TaskRunner::class.java.name)");
        f30145j = logger;
    }

    public C11590e(a backend) {
        C9322n.m27781e(backend, "backend");
        this.f30146a = backend;
        this.f30147b = ModuleDescriptor.MODULE_VERSION;
        this.f30150e = new ArrayList();
        this.f30151f = new ArrayList();
        this.f30152g = new d();
    }

    /* renamed from: c */
    private final void m36330c(AbstractC11586a abstractC11586a, long j10) {
        if (C10727d.f27165h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        C11589d m36306d = abstractC11586a.m36306d();
        C9322n.m27778b(m36306d);
        if (!(m36306d.m36316c() == abstractC11586a)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean m36317d = m36306d.m36317d();
        m36306d.m36325m(false);
        m36306d.m36324l(null);
        this.f30150e.remove(m36306d);
        if (j10 != -1 && !m36317d && !m36306d.m36320g()) {
            m36306d.m36323k(abstractC11586a, j10, true);
        }
        if (!m36306d.m36318e().isEmpty()) {
            this.f30151f.add(m36306d);
        }
    }

    /* renamed from: e */
    private final void m36331e(AbstractC11586a abstractC11586a) {
        if (C10727d.f27165h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        abstractC11586a.m36309g(-1L);
        C11589d m36306d = abstractC11586a.m36306d();
        C9322n.m27778b(m36306d);
        m36306d.m36318e().remove(abstractC11586a);
        this.f30151f.remove(m36306d);
        m36306d.m36324l(abstractC11586a);
        this.f30150e.add(m36306d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final void m36332j(AbstractC11586a abstractC11586a) {
        if (C10727d.f27165h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(abstractC11586a.m36304b());
        try {
            long mo36308f = abstractC11586a.mo36308f();
            synchronized (this) {
                m36330c(abstractC11586a, mo36308f);
                C2037v c2037v = C2037v.f8089a;
            }
            currentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                m36330c(abstractC11586a, -1L);
                C2037v c2037v2 = C2037v.f8089a;
                currentThread.setName(name);
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final AbstractC11586a m36333d() {
        boolean z10;
        if (C10727d.f27165h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        while (!this.f30151f.isEmpty()) {
            long mo36340c = this.f30146a.mo36340c();
            Iterator<C11589d> it = this.f30151f.iterator();
            long j10 = Long.MAX_VALUE;
            AbstractC11586a abstractC11586a = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                AbstractC11586a abstractC11586a2 = it.next().m36318e().get(0);
                long max = Math.max(0L, abstractC11586a2.m36305c() - mo36340c);
                if (max > 0) {
                    j10 = Math.min(max, j10);
                } else {
                    if (abstractC11586a != null) {
                        z10 = true;
                        break;
                    }
                    abstractC11586a = abstractC11586a2;
                }
            }
            if (abstractC11586a != null) {
                m36331e(abstractC11586a);
                if (z10 || (!this.f30148c && (!this.f30151f.isEmpty()))) {
                    this.f30146a.execute(this.f30152g);
                }
                return abstractC11586a;
            }
            if (this.f30148c) {
                if (j10 < this.f30149d - mo36340c) {
                    this.f30146a.mo36339b(this);
                }
                return null;
            }
            this.f30148c = true;
            this.f30149d = mo36340c + j10;
            try {
                try {
                    this.f30146a.mo36338a(this, j10);
                } catch (InterruptedException unused) {
                    m36334f();
                }
            } finally {
                this.f30148c = false;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m36334f() {
        int size = this.f30150e.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                this.f30150e.get(size).m36315b();
                if (i10 < 0) {
                    break;
                } else {
                    size = i10;
                }
            }
        }
        int size2 = this.f30151f.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            C11589d c11589d = this.f30151f.get(size2);
            c11589d.m36315b();
            if (c11589d.m36318e().isEmpty()) {
                this.f30151f.remove(size2);
            }
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }

    /* renamed from: g */
    public final a m36335g() {
        return this.f30146a;
    }

    /* renamed from: h */
    public final void m36336h(C11589d taskQueue) {
        C9322n.m27781e(taskQueue, "taskQueue");
        if (C10727d.f27165h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (taskQueue.m36316c() == null) {
            if (!taskQueue.m36318e().isEmpty()) {
                C10727d.m32643c(this.f30151f, taskQueue);
            } else {
                this.f30151f.remove(taskQueue);
            }
        }
        if (this.f30148c) {
            this.f30146a.mo36339b(this);
        } else {
            this.f30146a.execute(this.f30152g);
        }
    }

    /* renamed from: i */
    public final C11589d m36337i() {
        int i10;
        synchronized (this) {
            i10 = this.f30147b;
            this.f30147b = i10 + 1;
        }
        return new C11589d(this, C9322n.m27787k("Q", Integer.valueOf(i10)));
    }
}
