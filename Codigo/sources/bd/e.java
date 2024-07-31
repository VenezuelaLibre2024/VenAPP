package bd;

import android.database.SQLException;
import android.os.SystemClock;
import com.google.android.gms.tasks.TaskCompletionSource;
import f6.f;
import f6.h;
import h6.l;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import sc.g;
import vc.g0;
import vc.u;
import vc.x0;
import xc.f0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final double f6408a;

    /* renamed from: b, reason: collision with root package name */
    private final double f6409b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6410c;

    /* renamed from: d, reason: collision with root package name */
    private final long f6411d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6412e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f6413f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f6414g;

    /* renamed from: h, reason: collision with root package name */
    private final f<f0> f6415h;

    /* renamed from: i, reason: collision with root package name */
    private final g0 f6416i;

    /* renamed from: j, reason: collision with root package name */
    private int f6417j;

    /* renamed from: k, reason: collision with root package name */
    private long f6418k;

    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final u f6419a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskCompletionSource<u> f6420b;

        private b(u uVar, TaskCompletionSource<u> taskCompletionSource) {
            this.f6419a = uVar;
            this.f6420b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.p(this.f6419a, this.f6420b);
            e.this.f6416i.e();
            double g10 = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(g10 / 1000.0d)) + " s for report: " + this.f6419a.d());
            e.q(g10);
        }
    }

    e(double d10, double d11, long j10, f<f0> fVar, g0 g0Var) {
        this.f6408a = d10;
        this.f6409b = d11;
        this.f6410c = j10;
        this.f6415h = fVar;
        this.f6416i = g0Var;
        this.f6411d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f6412e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f6413f = arrayBlockingQueue;
        this.f6414g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f6417j = 0;
        this.f6418k = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(f<f0> fVar, cd.d dVar, g0 g0Var) {
        this(dVar.f7051f, dVar.f7052g, dVar.f7053h * 1000, fVar, g0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f6408a) * Math.pow(this.f6409b, h()));
    }

    private int h() {
        if (this.f6418k == 0) {
            this.f6418k = o();
        }
        int o10 = (int) ((o() - this.f6418k) / this.f6410c);
        int min = l() ? Math.min(100, this.f6417j + o10) : Math.max(0, this.f6417j - o10);
        if (this.f6417j != min) {
            this.f6417j = min;
            this.f6418k = o();
        }
        return min;
    }

    private boolean k() {
        return this.f6413f.size() < this.f6412e;
    }

    private boolean l() {
        return this.f6413f.size() == this.f6412e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(CountDownLatch countDownLatch) {
        try {
            l.a(this.f6415h, f6.d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(TaskCompletionSource taskCompletionSource, boolean z10, u uVar, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            j();
        }
        taskCompletionSource.trySetResult(uVar);
    }

    private long o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final u uVar, final TaskCompletionSource<u> taskCompletionSource) {
        g.f().b("Sending report through Google DataTransport: " + uVar.d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f6411d < 2000;
        this.f6415h.a(f6.c.f(uVar.b()), new h() { // from class: bd.c
            @Override // f6.h
            public final void a(Exception exc) {
                e.this.n(taskCompletionSource, z10, uVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaskCompletionSource<u> i(u uVar, boolean z10) {
        synchronized (this.f6413f) {
            TaskCompletionSource<u> taskCompletionSource = new TaskCompletionSource<>();
            if (!z10) {
                p(uVar, taskCompletionSource);
                return taskCompletionSource;
            }
            this.f6416i.d();
            if (!k()) {
                h();
                g.f().b("Dropping report due to queue being full: " + uVar.d());
                this.f6416i.c();
                taskCompletionSource.trySetResult(uVar);
                return taskCompletionSource;
            }
            g.f().b("Enqueueing report: " + uVar.d());
            g.f().b("Queue size: " + this.f6413f.size());
            this.f6414g.execute(new b(uVar, taskCompletionSource));
            g.f().b("Closing task for report: " + uVar.d());
            taskCompletionSource.trySetResult(uVar);
            return taskCompletionSource;
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: bd.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.m(countDownLatch);
            }
        }).start();
        x0.g(countDownLatch, 2L, TimeUnit.SECONDS);
    }
}
