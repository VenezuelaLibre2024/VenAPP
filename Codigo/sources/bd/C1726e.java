package bd;

import android.database.SQLException;
import android.os.SystemClock;
import cd.C1947d;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p098f6.AbstractC7299c;
import p098f6.EnumC7300d;
import p098f6.InterfaceC7302f;
import p098f6.InterfaceC7304h;
import p132h6.C7642l;
import p442xc.AbstractC12426f0;
import sc.C10889g;
import vc.AbstractC11863u;
import vc.C11836g0;
import vc.C11870x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bd.e */
/* loaded from: classes.dex */
public final class C1726e {

    /* renamed from: a */
    private final double f7330a;

    /* renamed from: b */
    private final double f7331b;

    /* renamed from: c */
    private final long f7332c;

    /* renamed from: d */
    private final long f7333d;

    /* renamed from: e */
    private final int f7334e;

    /* renamed from: f */
    private final BlockingQueue<Runnable> f7335f;

    /* renamed from: g */
    private final ThreadPoolExecutor f7336g;

    /* renamed from: h */
    private final InterfaceC7302f<AbstractC12426f0> f7337h;

    /* renamed from: i */
    private final C11836g0 f7338i;

    /* renamed from: j */
    private int f7339j;

    /* renamed from: k */
    private long f7340k;

    /* renamed from: bd.e$b */
    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: a */
        private final AbstractC11863u f7341a;

        /* renamed from: b */
        private final TaskCompletionSource<AbstractC11863u> f7342b;

        private b(AbstractC11863u abstractC11863u, TaskCompletionSource<AbstractC11863u> taskCompletionSource) {
            this.f7341a = abstractC11863u;
            this.f7342b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1726e.this.m9349p(this.f7341a, this.f7342b);
            C1726e.this.f7338i.m37712e();
            double m9342g = C1726e.this.m9342g();
            C10889g.m33216f().m33217b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(m9342g / 1000.0d)) + " s for report: " + this.f7341a.mo37674d());
            C1726e.m9350q(m9342g);
        }
    }

    C1726e(double d10, double d11, long j10, InterfaceC7302f<AbstractC12426f0> interfaceC7302f, C11836g0 c11836g0) {
        this.f7330a = d10;
        this.f7331b = d11;
        this.f7332c = j10;
        this.f7337h = interfaceC7302f;
        this.f7338i = c11836g0;
        this.f7333d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f7334e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f7335f = arrayBlockingQueue;
        this.f7336g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f7339j = 0;
        this.f7340k = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1726e(InterfaceC7302f<AbstractC12426f0> interfaceC7302f, C1947d c1947d, C11836g0 c11836g0) {
        this(c1947d.f8003f, c1947d.f8004g, c1947d.f8005h * 1000, interfaceC7302f, c11836g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public double m9342g() {
        return Math.min(3600000.0d, (60000.0d / this.f7330a) * Math.pow(this.f7331b, m9343h()));
    }

    /* renamed from: h */
    private int m9343h() {
        if (this.f7340k == 0) {
            this.f7340k = m9348o();
        }
        int m9348o = (int) ((m9348o() - this.f7340k) / this.f7332c);
        int min = m9345l() ? Math.min(100, this.f7339j + m9348o) : Math.max(0, this.f7339j - m9348o);
        if (this.f7339j != min) {
            this.f7339j = min;
            this.f7340k = m9348o();
        }
        return min;
    }

    /* renamed from: k */
    private boolean m9344k() {
        return this.f7335f.size() < this.f7334e;
    }

    /* renamed from: l */
    private boolean m9345l() {
        return this.f7335f.size() == this.f7334e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m9346m(CountDownLatch countDownLatch) {
        try {
            C7642l.m23220a(this.f7337h, EnumC7300d.HIGHEST);
        } catch (SQLException unused) {
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m9347n(TaskCompletionSource taskCompletionSource, boolean z10, AbstractC11863u abstractC11863u, Exception exc) {
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z10) {
            m9352j();
        }
        taskCompletionSource.trySetResult(abstractC11863u);
    }

    /* renamed from: o */
    private long m9348o() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m9349p(final AbstractC11863u abstractC11863u, final TaskCompletionSource<AbstractC11863u> taskCompletionSource) {
        C10889g.m33216f().m33217b("Sending report through Google DataTransport: " + abstractC11863u.mo37674d());
        final boolean z10 = SystemClock.elapsedRealtime() - this.f7333d < 2000;
        this.f7337h.mo21883a(AbstractC7299c.m21882f(abstractC11863u.mo37672b()), new InterfaceC7304h() { // from class: bd.c
            @Override // p098f6.InterfaceC7304h
            /* renamed from: a */
            public final void mo9335a(Exception exc) {
                C1726e.this.m9347n(taskCompletionSource, z10, abstractC11863u, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static void m9350q(double d10) {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public TaskCompletionSource<AbstractC11863u> m9351i(AbstractC11863u abstractC11863u, boolean z10) {
        synchronized (this.f7335f) {
            TaskCompletionSource<AbstractC11863u> taskCompletionSource = new TaskCompletionSource<>();
            if (!z10) {
                m9349p(abstractC11863u, taskCompletionSource);
                return taskCompletionSource;
            }
            this.f7338i.m37711d();
            if (!m9344k()) {
                m9343h();
                C10889g.m33216f().m33217b("Dropping report due to queue being full: " + abstractC11863u.mo37674d());
                this.f7338i.m37710c();
                taskCompletionSource.trySetResult(abstractC11863u);
                return taskCompletionSource;
            }
            C10889g.m33216f().m33217b("Enqueueing report: " + abstractC11863u.mo37674d());
            C10889g.m33216f().m33217b("Queue size: " + this.f7335f.size());
            this.f7336g.execute(new b(abstractC11863u, taskCompletionSource));
            C10889g.m33216f().m33217b("Closing task for report: " + abstractC11863u.mo37674d());
            taskCompletionSource.trySetResult(abstractC11863u);
            return taskCompletionSource;
        }
    }

    /* renamed from: j */
    public void m9352j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: bd.d
            @Override // java.lang.Runnable
            public final void run() {
                C1726e.this.m9346m(countDownLatch);
            }
        }).start();
        C11870x0.m37946g(countDownLatch, 2L, TimeUnit.SECONDS);
    }
}
