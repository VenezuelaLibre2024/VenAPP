package fj;

import android.os.Handler;
import android.os.Message;
import dj.r;
import gj.c;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class b extends r {

    /* renamed from: b, reason: collision with root package name */
    private final Handler f15248b;

    /* loaded from: classes3.dex */
    private static final class a extends r.b {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f15249a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f15250b;

        a(Handler handler) {
            this.f15249a = handler;
        }

        @Override // dj.r.b
        public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f15250b) {
                return c.a();
            }
            RunnableC0253b runnableC0253b = new RunnableC0253b(this.f15249a, yj.a.s(runnable));
            Message obtain = Message.obtain(this.f15249a, runnableC0253b);
            obtain.obj = this;
            this.f15249a.sendMessageDelayed(obtain, timeUnit.toMillis(j10));
            if (!this.f15250b) {
                return runnableC0253b;
            }
            this.f15249a.removeCallbacks(runnableC0253b);
            return c.a();
        }

        @Override // gj.b
        public void dispose() {
            this.f15250b = true;
            this.f15249a.removeCallbacksAndMessages(this);
        }

        @Override // gj.b
        public boolean h() {
            return this.f15250b;
        }
    }

    /* renamed from: fj.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class RunnableC0253b implements Runnable, gj.b {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f15251a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f15252b;

        /* renamed from: c, reason: collision with root package name */
        private volatile boolean f15253c;

        RunnableC0253b(Handler handler, Runnable runnable) {
            this.f15251a = handler;
            this.f15252b = runnable;
        }

        @Override // gj.b
        public void dispose() {
            this.f15253c = true;
            this.f15251a.removeCallbacks(this);
        }

        @Override // gj.b
        public boolean h() {
            return this.f15253c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f15252b.run();
            } catch (Throwable th2) {
                yj.a.q(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Handler handler) {
        this.f15248b = handler;
    }

    @Override // dj.r
    public r.b a() {
        return new a(this.f15248b);
    }

    @Override // dj.r
    public gj.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0253b runnableC0253b = new RunnableC0253b(this.f15248b, yj.a.s(runnable));
        this.f15248b.postDelayed(runnableC0253b, timeUnit.toMillis(j10));
        return runnableC0253b;
    }
}
