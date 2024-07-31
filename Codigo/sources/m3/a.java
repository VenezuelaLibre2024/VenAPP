package m3;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.a;
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

/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: b, reason: collision with root package name */
    private static final long f21339b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c, reason: collision with root package name */
    private static volatile int f21340c;

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f21341a;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f21342a;

        /* renamed from: b, reason: collision with root package name */
        private int f21343b;

        /* renamed from: c, reason: collision with root package name */
        private int f21344c;

        /* renamed from: d, reason: collision with root package name */
        private final ThreadFactory f21345d = new c();

        /* renamed from: e, reason: collision with root package name */
        private e f21346e = e.f21360d;

        /* renamed from: f, reason: collision with root package name */
        private String f21347f;

        /* renamed from: g, reason: collision with root package name */
        private long f21348g;

        b(boolean z10) {
            this.f21342a = z10;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f21347f)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f21347f);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f21343b, this.f21344c, this.f21348g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f21345d, this.f21347f, this.f21346e, this.f21342a));
            if (this.f21348g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public b b(String str) {
            this.f21347f = str;
            return this;
        }

        public b c(int i10) {
            this.f21343b = i10;
            this.f21344c = i10;
            return this;
        }
    }

    /* loaded from: classes.dex */
    private static final class c implements ThreadFactory {

        /* renamed from: m3.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0338a extends Thread {
            C0338a(Runnable runnable) {
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
            return new C0338a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final ThreadFactory f21350a;

        /* renamed from: b, reason: collision with root package name */
        private final String f21351b;

        /* renamed from: c, reason: collision with root package name */
        final e f21352c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f21353d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f21354e = new AtomicInteger();

        /* renamed from: m3.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0339a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Runnable f21355a;

            RunnableC0339a(Runnable runnable) {
                this.f21355a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f21353d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f21355a.run();
                } catch (Throwable th2) {
                    d.this.f21352c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f21350a = threadFactory;
            this.f21351b = str;
            this.f21352c = eVar;
            this.f21353d = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f21350a.newThread(new RunnableC0339a(runnable));
            newThread.setName("glide-" + this.f21351b + "-thread-" + this.f21354e.getAndIncrement());
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f21357a = new C0340a();

        /* renamed from: b, reason: collision with root package name */
        public static final e f21358b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f21359c;

        /* renamed from: d, reason: collision with root package name */
        public static final e f21360d;

        /* renamed from: m3.a$e$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0340a implements e {
            C0340a() {
            }

            @Override // m3.a.e
            public void a(Throwable th2) {
            }
        }

        /* loaded from: classes.dex */
        class b implements e {
            b() {
            }

            @Override // m3.a.e
            public void a(Throwable th2) {
                if (th2 == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
            }
        }

        /* loaded from: classes.dex */
        class c implements e {
            c() {
            }

            @Override // m3.a.e
            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f21358b = bVar;
            f21359c = new c();
            f21360d = bVar;
        }

        void a(Throwable th2);
    }

    a(ExecutorService executorService) {
        this.f21341a = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f21340c == 0) {
            f21340c = Math.min(4, m3.b.a());
        }
        return f21340c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a f() {
        return e().a();
    }

    public static b g() {
        return new b(false).c(b()).b("source");
    }

    public static a h() {
        return g().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, a.e.API_PRIORITY_OTHER, f21339b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f21360d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f21341a.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f21341a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f21341a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f21341a.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f21341a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return (T) this.f21341a.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f21341a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f21341a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f21341a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f21341a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f21341a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f21341a.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f21341a.submit(callable);
    }

    public String toString() {
        return this.f21341a.toString();
    }
}
