package j1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
abstract class c<Params, Progress, Result> {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f19506f;

    /* renamed from: r, reason: collision with root package name */
    private static final BlockingQueue<Runnable> f19507r;

    /* renamed from: s, reason: collision with root package name */
    public static final Executor f19508s;

    /* renamed from: t, reason: collision with root package name */
    private static f f19509t;

    /* renamed from: u, reason: collision with root package name */
    private static volatile Executor f19510u;

    /* renamed from: a, reason: collision with root package name */
    private final h<Params, Result> f19511a;

    /* renamed from: b, reason: collision with root package name */
    private final FutureTask<Result> f19512b;

    /* renamed from: c, reason: collision with root package name */
    private volatile g f19513c = g.PENDING;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f19514d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    final AtomicBoolean f19515e = new AtomicBoolean();

    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f19516a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f19516a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            c.this.f19515e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) c.this.b(this.f19522a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: j1.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0305c extends FutureTask<Result> {
        C0305c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                c.this.m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                c.this.m(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19519a;

        static {
            int[] iArr = new int[g.values().length];
            f19519a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19519a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a, reason: collision with root package name */
        final c f19520a;

        /* renamed from: b, reason: collision with root package name */
        final Data[] f19521b;

        e(c cVar, Data... dataArr) {
            this.f19520a = cVar;
            this.f19521b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f extends Handler {
        f() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i10 = message.what;
            if (i10 == 1) {
                eVar.f19520a.d(eVar.f19521b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f19520a.k(eVar.f19521b);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a, reason: collision with root package name */
        Params[] f19522a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f19506f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f19507r = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, RecognitionOptions.ITF, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f19508s = threadPoolExecutor;
        f19510u = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        b bVar = new b();
        this.f19511a = bVar;
        this.f19512b = new C0305c(bVar);
    }

    private static Handler e() {
        f fVar;
        synchronized (c.class) {
            if (f19509t == null) {
                f19509t = new f();
            }
            fVar = f19509t;
        }
        return fVar;
    }

    public final boolean a(boolean z10) {
        this.f19514d.set(true);
        return this.f19512b.cancel(z10);
    }

    protected abstract Result b(Params... paramsArr);

    public final c<Params, Progress, Result> c(Executor executor, Params... paramsArr) {
        if (this.f19513c == g.PENDING) {
            this.f19513c = g.RUNNING;
            j();
            this.f19511a.f19522a = paramsArr;
            executor.execute(this.f19512b);
            return this;
        }
        int i10 = d.f19519a[this.f19513c.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    void d(Result result) {
        if (f()) {
            h(result);
        } else {
            i(result);
        }
        this.f19513c = g.FINISHED;
    }

    public final boolean f() {
        return this.f19514d.get();
    }

    protected void g() {
    }

    protected void h(Result result) {
        g();
    }

    protected void i(Result result) {
    }

    protected void j() {
    }

    protected void k(Progress... progressArr) {
    }

    Result l(Result result) {
        e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    void m(Result result) {
        if (this.f19515e.get()) {
            return;
        }
        l(result);
    }
}
