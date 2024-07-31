package p231m3;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.C5101a;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: m3.a */
/* loaded from: classes.dex */
public final class ExecutorServiceC9538a implements ExecutorService {

    /* renamed from: b */
    private static final long f23192b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    private static volatile int f23193c;

    /* renamed from: a */
    private final ExecutorService f23194a;

    /* renamed from: m3.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final boolean f23195a;

        /* renamed from: b */
        private int f23196b;

        /* renamed from: c */
        private int f23197c;

        /* renamed from: d */
        private final ThreadFactory f23198d = new c();

        /* renamed from: e */
        private e f23199e = e.f23213d;

        /* renamed from: f */
        private String f23200f;

        /* renamed from: g */
        private long f23201g;

        b(boolean z10) {
            this.f23195a = z10;
        }

        /* renamed from: a */
        public ExecutorServiceC9538a m28376a() {
            if (TextUtils.isEmpty(this.f23200f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f23200f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f23196b, this.f23197c, this.f23201g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f23198d, this.f23200f, this.f23199e, this.f23195a));
            if (this.f23201g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC9538a(threadPoolExecutor);
        }

        /* renamed from: b */
        public b m28377b(String str) {
            this.f23200f = str;
            return this;
        }

        /* renamed from: c */
        public b m28378c(int i10) {
            this.f23196b = i10;
            this.f23197c = i10;
            return this;
        }
    }

    /* renamed from: m3.a$c */
    /* loaded from: classes.dex */
    private static final class c implements ThreadFactory {

        /* renamed from: m3.a$c$a */
        /* loaded from: classes.dex */
        class a extends Thread {
            a(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m3.a$d */
    /* loaded from: classes.dex */
    public static final class d implements ThreadFactory {

        /* renamed from: a */
        private final ThreadFactory f23203a;

        /* renamed from: b */
        private final String f23204b;

        /* renamed from: c */
        final e f23205c;

        /* renamed from: d */
        final boolean f23206d;

        /* renamed from: e */
        private final AtomicInteger f23207e = new AtomicInteger();

        /* renamed from: m3.a$d$a */
        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Runnable f23208a;

            a(Runnable runnable) {
                this.f23208a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f23206d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f23208a.run();
                } catch (Throwable th2) {
                    d.this.f23205c.mo28379a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f23203a = threadFactory;
            this.f23204b = str;
            this.f23205c = eVar;
            this.f23206d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f23203a.newThread(new a(runnable));
            newThread.setName("glide-" + this.f23204b + "-thread-" + this.f23207e.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: m3.a$e */
    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a */
        public static final e f23210a = new a();

        /* renamed from: b */
        public static final e f23211b;

        /* renamed from: c */
        public static final e f23212c;

        /* renamed from: d */
        public static final e f23213d;

        /* renamed from: m3.a$e$a */
        /* loaded from: classes.dex */
        class a implements e {
            a() {
            }

            @Override // p231m3.ExecutorServiceC9538a.e
            /* renamed from: a */
            public void mo28379a(Throwable th2) {
            }
        }

        /* renamed from: m3.a$e$b */
        /* loaded from: classes.dex */
        class b implements e {
            b() {
            }

            @Override // p231m3.ExecutorServiceC9538a.e
            /* renamed from: a */
            public void mo28379a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* renamed from: m3.a$e$c */
        /* loaded from: classes.dex */
        class c implements e {
            c() {
            }

            @Override // p231m3.ExecutorServiceC9538a.e
            /* renamed from: a */
            public void mo28379a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f23211b = bVar;
            f23212c = new c();
            f23213d = bVar;
        }

        /* renamed from: a */
        void mo28379a(Throwable th2);
    }

    ExecutorServiceC9538a(ExecutorService executorService) {
        this.f23194a = executorService;
    }

    /* renamed from: a */
    static int m28367a() {
        return m28368b() >= 4 ? 2 : 1;
    }

    /* renamed from: b */
    public static int m28368b() {
        if (f23193c == 0) {
            f23193c = Math.min(4, C9539b.m28380a());
        }
        return f23193c;
    }

    /* renamed from: c */
    public static b m28369c() {
        return new b(true).m28378c(m28367a()).m28377b("animation");
    }

    /* renamed from: d */
    public static ExecutorServiceC9538a m28370d() {
        return m28369c().m28376a();
    }

    /* renamed from: e */
    public static b m28371e() {
        return new b(true).m28378c(1).m28377b("disk-cache");
    }

    /* renamed from: f */
    public static ExecutorServiceC9538a m28372f() {
        return m28371e().m28376a();
    }

    /* renamed from: g */
    public static b m28373g() {
        return new b(false).m28378c(m28368b()).m28377b("source");
    }

    /* renamed from: h */
    public static ExecutorServiceC9538a m28374h() {
        return m28373g().m28376a();
    }

    /* renamed from: i */
    public static ExecutorServiceC9538a m28375i() {
        return new ExecutorServiceC9538a(new ThreadPoolExecutor(0, C5101a.e.API_PRIORITY_OTHER, f23192b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f23213d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f23194a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f23194a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f23194a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f23194a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f23194a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f23194a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f23194a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f23194a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f23194a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f23194a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f23194a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f23194a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f23194a.submit(callable);
    }

    public String toString() {
        return this.f23194a.toString();
    }
}
