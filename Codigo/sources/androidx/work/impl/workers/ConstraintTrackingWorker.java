package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.e0;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.f;
import dk.q;
import f2.j;
import h2.e;
import java.util.List;
import k2.u;
import k2.v;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class ConstraintTrackingWorker extends c implements h2.c {

    /* renamed from: e, reason: collision with root package name */
    private final WorkerParameters f5947e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f5948f;

    /* renamed from: r, reason: collision with root package name */
    private volatile boolean f5949r;

    /* renamed from: s, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<c.a> f5950s;

    /* renamed from: t, reason: collision with root package name */
    private c f5951t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        n.e(appContext, "appContext");
        n.e(workerParameters, "workerParameters");
        this.f5947e = workerParameters;
        this.f5948f = new Object();
        this.f5950s = androidx.work.impl.utils.futures.c.s();
    }

    private final void g() {
        List e10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f5950s.isCancelled()) {
            return;
        }
        String l10 = getInputData().l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        j e11 = j.e();
        n.d(e11, "get()");
        if (l10 == null || l10.length() == 0) {
            str6 = n2.c.f21686a;
            e11.c(str6, "No worker to delegate to.");
        } else {
            c b10 = getWorkerFactory().b(getApplicationContext(), l10, this.f5947e);
            this.f5951t = b10;
            if (b10 == null) {
                str5 = n2.c.f21686a;
                e11.a(str5, "No worker to delegate to.");
            } else {
                e0 m10 = e0.m(getApplicationContext());
                n.d(m10, "getInstance(applicationContext)");
                v J = m10.r().J();
                String uuid = getId().toString();
                n.d(uuid, "id.toString()");
                u h10 = J.h(uuid);
                if (h10 != null) {
                    j2.n q10 = m10.q();
                    n.d(q10, "workManagerImpl.trackers");
                    e eVar = new e(q10, this);
                    e10 = q.e(h10);
                    eVar.a(e10);
                    String uuid2 = getId().toString();
                    n.d(uuid2, "id.toString()");
                    if (!eVar.d(uuid2)) {
                        str = n2.c.f21686a;
                        e11.a(str, "Constraints not met for delegate " + l10 + ". Requesting retry.");
                        androidx.work.impl.utils.futures.c<c.a> future = this.f5950s;
                        n.d(future, "future");
                        n2.c.e(future);
                        return;
                    }
                    str2 = n2.c.f21686a;
                    e11.a(str2, "Constraints met for delegate " + l10);
                    try {
                        c cVar = this.f5951t;
                        n.b(cVar);
                        final f<c.a> startWork = cVar.startWork();
                        n.d(startWork, "delegate!!.startWork()");
                        startWork.addListener(new Runnable() { // from class: n2.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConstraintTrackingWorker.h(ConstraintTrackingWorker.this, startWork);
                            }
                        }, getBackgroundExecutor());
                        return;
                    } catch (Throwable th2) {
                        str3 = n2.c.f21686a;
                        e11.b(str3, "Delegated worker " + l10 + " threw exception in startWork.", th2);
                        synchronized (this.f5948f) {
                            if (!this.f5949r) {
                                androidx.work.impl.utils.futures.c<c.a> future2 = this.f5950s;
                                n.d(future2, "future");
                                n2.c.d(future2);
                                return;
                            } else {
                                str4 = n2.c.f21686a;
                                e11.a(str4, "Constraints were unmet, Retrying.");
                                androidx.work.impl.utils.futures.c<c.a> future3 = this.f5950s;
                                n.d(future3, "future");
                                n2.c.e(future3);
                                return;
                            }
                        }
                    }
                }
            }
        }
        androidx.work.impl.utils.futures.c<c.a> future4 = this.f5950s;
        n.d(future4, "future");
        n2.c.d(future4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(ConstraintTrackingWorker this$0, f innerFuture) {
        n.e(this$0, "this$0");
        n.e(innerFuture, "$innerFuture");
        synchronized (this$0.f5948f) {
            if (this$0.f5949r) {
                androidx.work.impl.utils.futures.c<c.a> future = this$0.f5950s;
                n.d(future, "future");
                n2.c.e(future);
            } else {
                this$0.f5950s.q(innerFuture);
            }
            ck.v vVar = ck.v.f7137a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(ConstraintTrackingWorker this$0) {
        n.e(this$0, "this$0");
        this$0.g();
    }

    @Override // h2.c
    public void b(List<u> workSpecs) {
        String str;
        n.e(workSpecs, "workSpecs");
        j e10 = j.e();
        str = n2.c.f21686a;
        e10.a(str, "Constraints changed for " + workSpecs);
        synchronized (this.f5948f) {
            this.f5949r = true;
            ck.v vVar = ck.v.f7137a;
        }
    }

    @Override // h2.c
    public void f(List<u> workSpecs) {
        n.e(workSpecs, "workSpecs");
    }

    @Override // androidx.work.c
    public void onStopped() {
        super.onStopped();
        c cVar = this.f5951t;
        if (cVar == null || cVar.isStopped()) {
            return;
        }
        cVar.stop();
    }

    @Override // androidx.work.c
    public f<c.a> startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: n2.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.i(ConstraintTrackingWorker.this);
            }
        });
        androidx.work.impl.utils.futures.c<c.a> future = this.f5950s;
        n.d(future, "future");
        return future;
    }
}
