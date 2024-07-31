package androidx.work;

import android.content.Context;
import androidx.work.c;
import com.google.common.util.concurrent.f;
import f2.e;

/* loaded from: classes.dex */
public abstract class Worker extends c {

    /* renamed from: e, reason: collision with root package name */
    androidx.work.impl.utils.futures.c<c.a> f5664e;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f5664e.o(Worker.this.doWork());
            } catch (Throwable th2) {
                Worker.this.f5664e.p(th2);
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f5666a;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f5666a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5666a.o(Worker.this.getForegroundInfo());
            } catch (Throwable th2) {
                this.f5666a.p(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract c.a doWork();

    public e getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.c
    public f<e> getForegroundInfoAsync() {
        androidx.work.impl.utils.futures.c s10 = androidx.work.impl.utils.futures.c.s();
        getBackgroundExecutor().execute(new b(s10));
        return s10;
    }

    @Override // androidx.work.c
    public final f<c.a> startWork() {
        this.f5664e = androidx.work.impl.utils.futures.c.s();
        getBackgroundExecutor().execute(new a());
        return this.f5664e;
    }
}
