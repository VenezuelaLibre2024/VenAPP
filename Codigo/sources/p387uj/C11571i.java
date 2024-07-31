package p387uj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p073e2.C7099c;

/* renamed from: uj.i */
/* loaded from: classes3.dex */
public final class C11571i {

    /* renamed from: a */
    public static final boolean f30073a;

    /* renamed from: b */
    public static final int f30074b;

    /* renamed from: c */
    static final AtomicReference<ScheduledExecutorService> f30075c = new AtomicReference<>();

    /* renamed from: d */
    static final Map<ScheduledThreadPoolExecutor, Object> f30076d = new ConcurrentHashMap();

    /* renamed from: uj.i$a */
    /* loaded from: classes3.dex */
    static final class a {

        /* renamed from: a */
        boolean f30077a;

        /* renamed from: b */
        int f30078b;

        a() {
        }

        /* renamed from: a */
        void m36260a(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.f30077a = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.f30077a = true;
            }
            if (this.f30077a && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.f30078b = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            this.f30078b = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uj.i$b */
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C11571i.f30076d.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    C11571i.f30076d.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    static {
        Properties properties = System.getProperties();
        a aVar = new a();
        aVar.m36260a(properties);
        f30073a = aVar.f30077a;
        f30074b = aVar.f30078b;
        m36257b();
    }

    /* renamed from: a */
    public static ScheduledExecutorService m36256a(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        m36258c(f30073a, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    /* renamed from: b */
    public static void m36257b() {
        m36259d(f30073a);
    }

    /* renamed from: c */
    static void m36258c(boolean z10, ScheduledExecutorService scheduledExecutorService) {
        if (z10 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            f30076d.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    /* renamed from: d */
    static void m36259d(boolean z10) {
        if (!z10) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f30075c;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService != null) {
                return;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new ThreadFactoryC11568f("RxSchedulerPurge"));
            if (C7099c.m20926a(atomicReference, scheduledExecutorService, newScheduledThreadPool)) {
                b bVar = new b();
                int i10 = f30074b;
                newScheduledThreadPool.scheduleAtFixedRate(bVar, i10, i10, TimeUnit.SECONDS);
                return;
            }
            newScheduledThreadPool.shutdownNow();
        }
    }
}
