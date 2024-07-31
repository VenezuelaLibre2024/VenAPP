package p169j1;

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

/* renamed from: j1.c */
/* loaded from: classes.dex */
abstract class AbstractC8939c<Params, Progress, Result> {

    /* renamed from: f */
    private static final ThreadFactory f21257f;

    /* renamed from: r */
    private static final BlockingQueue<Runnable> f21258r;

    /* renamed from: s */
    public static final Executor f21259s;

    /* renamed from: t */
    private static f f21260t;

    /* renamed from: u */
    private static volatile Executor f21261u;

    /* renamed from: a */
    private final h<Params, Result> f21262a;

    /* renamed from: b */
    private final FutureTask<Result> f21263b;

    /* renamed from: c */
    private volatile g f21264c = g.PENDING;

    /* renamed from: d */
    final AtomicBoolean f21265d = new AtomicBoolean();

    /* renamed from: e */
    final AtomicBoolean f21266e = new AtomicBoolean();

    /* renamed from: j1.c$a */
    /* loaded from: classes.dex */
    static class a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f21267a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f21267a.getAndIncrement());
        }
    }

    /* renamed from: j1.c$b */
    /* loaded from: classes.dex */
    class b extends h<Params, Result> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        public Result call() {
            AbstractC8939c.this.f21266e.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) AbstractC8939c.this.mo26117b(this.f21273a);
                Binder.flushPendingCommands();
                return result;
            } finally {
            }
        }
    }

    /* renamed from: j1.c$c */
    /* loaded from: classes.dex */
    class c extends FutureTask<Result> {
        c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                AbstractC8939c.this.m26149m(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (CancellationException unused) {
                AbstractC8939c.this.m26149m(null);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: j1.c$d */
    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a */
        static final /* synthetic */ int[] f21270a;

        static {
            int[] iArr = new int[g.values().length];
            f21270a = iArr;
            try {
                iArr[g.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21270a[g.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1.c$e */
    /* loaded from: classes.dex */
    public static class e<Data> {

        /* renamed from: a */
        final AbstractC8939c f21271a;

        /* renamed from: b */
        final Data[] f21272b;

        e(AbstractC8939c abstractC8939c, Data... dataArr) {
            this.f21271a = abstractC8939c;
            this.f21272b = dataArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1.c$f */
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
                eVar.f21271a.m26143d(eVar.f21272b[0]);
            } else {
                if (i10 != 2) {
                    return;
                }
                eVar.f21271a.m26147k(eVar.f21272b);
            }
        }
    }

    /* renamed from: j1.c$g */
    /* loaded from: classes.dex */
    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: j1.c$h */
    /* loaded from: classes.dex */
    private static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a */
        Params[] f21273a;

        h() {
        }
    }

    static {
        a aVar = new a();
        f21257f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f21258r = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, RecognitionOptions.ITF, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
        f21259s = threadPoolExecutor;
        f21261u = threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8939c() {
        b bVar = new b();
        this.f21262a = bVar;
        this.f21263b = new c(bVar);
    }

    /* renamed from: e */
    private static Handler m26140e() {
        f fVar;
        synchronized (AbstractC8939c.class) {
            if (f21260t == null) {
                f21260t = new f();
            }
            fVar = f21260t;
        }
        return fVar;
    }

    /* renamed from: a */
    public final boolean m26141a(boolean z10) {
        this.f21265d.set(true);
        return this.f21263b.cancel(z10);
    }

    /* renamed from: b */
    protected abstract Result mo26117b(Params... paramsArr);

    /* renamed from: c */
    public final AbstractC8939c<Params, Progress, Result> m26142c(Executor executor, Params... paramsArr) {
        if (this.f21264c == g.PENDING) {
            this.f21264c = g.RUNNING;
            m26146j();
            this.f21262a.f21273a = paramsArr;
            executor.execute(this.f21263b);
            return this;
        }
        int i10 = d.f21270a[this.f21264c.ordinal()];
        if (i10 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i10 != 2) {
            throw new IllegalStateException("We should never reach this state");
        }
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    /* renamed from: d */
    void m26143d(Result result) {
        if (m26144f()) {
            mo26118h(result);
        } else {
            mo26119i(result);
        }
        this.f21264c = g.FINISHED;
    }

    /* renamed from: f */
    public final boolean m26144f() {
        return this.f21265d.get();
    }

    /* renamed from: g */
    protected void m26145g() {
    }

    /* renamed from: h */
    protected void mo26118h(Result result) {
        m26145g();
    }

    /* renamed from: i */
    protected void mo26119i(Result result) {
    }

    /* renamed from: j */
    protected void m26146j() {
    }

    /* renamed from: k */
    protected void m26147k(Progress... progressArr) {
    }

    /* renamed from: l */
    Result m26148l(Result result) {
        m26140e().obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }

    /* renamed from: m */
    void m26149m(Result result) {
        if (this.f21266e.get()) {
            return;
        }
        m26148l(result);
    }
}
