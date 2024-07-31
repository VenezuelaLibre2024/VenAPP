package j1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.k;
import androidx.core.util.j;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class a<D> extends b<D> {

    /* renamed from: i, reason: collision with root package name */
    private final Executor f19489i;

    /* renamed from: j, reason: collision with root package name */
    volatile a<D>.RunnableC0304a f19490j;

    /* renamed from: k, reason: collision with root package name */
    volatile a<D>.RunnableC0304a f19491k;

    /* renamed from: l, reason: collision with root package name */
    long f19492l;

    /* renamed from: m, reason: collision with root package name */
    long f19493m;

    /* renamed from: n, reason: collision with root package name */
    Handler f19494n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class RunnableC0304a extends c<Void, Void, D> implements Runnable {

        /* renamed from: v, reason: collision with root package name */
        private final CountDownLatch f19495v = new CountDownLatch(1);

        /* renamed from: w, reason: collision with root package name */
        boolean f19496w;

        RunnableC0304a() {
        }

        @Override // j1.c
        protected void h(D d10) {
            try {
                a.this.x(this, d10);
            } finally {
                this.f19495v.countDown();
            }
        }

        @Override // j1.c
        protected void i(D d10) {
            try {
                a.this.y(this, d10);
            } finally {
                this.f19495v.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j1.c
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.C();
            } catch (k e10) {
                if (f()) {
                    return null;
                }
                throw e10;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19496w = false;
            a.this.z();
        }
    }

    public a(Context context) {
        this(context, c.f19508s);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.f19493m = -10000L;
        this.f19489i = executor;
    }

    public abstract D A();

    public void B(D d10) {
    }

    protected D C() {
        return A();
    }

    @Override // j1.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f19490j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f19490j);
            printWriter.print(" waiting=");
            printWriter.println(this.f19490j.f19496w);
        }
        if (this.f19491k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f19491k);
            printWriter.print(" waiting=");
            printWriter.println(this.f19491k.f19496w);
        }
        if (this.f19492l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            j.c(this.f19492l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            j.b(this.f19493m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // j1.b
    protected boolean k() {
        if (this.f19490j == null) {
            return false;
        }
        if (!this.f19501d) {
            this.f19504g = true;
        }
        if (this.f19491k != null) {
            if (this.f19490j.f19496w) {
                this.f19490j.f19496w = false;
                this.f19494n.removeCallbacks(this.f19490j);
            }
            this.f19490j = null;
            return false;
        }
        if (this.f19490j.f19496w) {
            this.f19490j.f19496w = false;
            this.f19494n.removeCallbacks(this.f19490j);
            this.f19490j = null;
            return false;
        }
        boolean a10 = this.f19490j.a(false);
        if (a10) {
            this.f19491k = this.f19490j;
            w();
        }
        this.f19490j = null;
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j1.b
    public void m() {
        super.m();
        b();
        this.f19490j = new RunnableC0304a();
        z();
    }

    public void w() {
    }

    void x(a<D>.RunnableC0304a runnableC0304a, D d10) {
        B(d10);
        if (this.f19491k == runnableC0304a) {
            s();
            this.f19493m = SystemClock.uptimeMillis();
            this.f19491k = null;
            e();
            z();
        }
    }

    void y(a<D>.RunnableC0304a runnableC0304a, D d10) {
        if (this.f19490j != runnableC0304a) {
            x(runnableC0304a, d10);
            return;
        }
        if (i()) {
            B(d10);
            return;
        }
        c();
        this.f19493m = SystemClock.uptimeMillis();
        this.f19490j = null;
        f(d10);
    }

    void z() {
        if (this.f19491k != null || this.f19490j == null) {
            return;
        }
        if (this.f19490j.f19496w) {
            this.f19490j.f19496w = false;
            this.f19494n.removeCallbacks(this.f19490j);
        }
        if (this.f19492l <= 0 || SystemClock.uptimeMillis() >= this.f19493m + this.f19492l) {
            this.f19490j.c(this.f19489i, null);
        } else {
            this.f19490j.f19496w = true;
            this.f19494n.postAtTime(this.f19490j, this.f19493m + this.f19492l);
        }
    }
}
