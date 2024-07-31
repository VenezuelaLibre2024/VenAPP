package hc;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ec.e;
import ic.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class j extends ec.e {

    /* renamed from: a, reason: collision with root package name */
    private final zb.g f16667a;

    /* renamed from: b, reason: collision with root package name */
    private final ee.b<od.i> f16668b;

    /* renamed from: c, reason: collision with root package name */
    private final List<jc.a> f16669c;

    /* renamed from: d, reason: collision with root package name */
    private final List<e.a> f16670d;

    /* renamed from: e, reason: collision with root package name */
    private final r f16671e;

    /* renamed from: f, reason: collision with root package name */
    private final s f16672f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f16673g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f16674h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f16675i;

    /* renamed from: j, reason: collision with root package name */
    private final Task<Void> f16676j;

    /* renamed from: k, reason: collision with root package name */
    private final ic.a f16677k;

    /* renamed from: l, reason: collision with root package name */
    private ec.b f16678l;

    /* renamed from: m, reason: collision with root package name */
    private ec.a f16679m;

    /* renamed from: n, reason: collision with root package name */
    private ec.c f16680n;

    /* renamed from: o, reason: collision with root package name */
    private Task<ec.c> f16681o;

    public j(zb.g gVar, ee.b<od.i> bVar, @dc.d Executor executor, @dc.c Executor executor2, @dc.a Executor executor3, @dc.b ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.common.internal.s.j(gVar);
        com.google.android.gms.common.internal.s.j(bVar);
        this.f16667a = gVar;
        this.f16668b = bVar;
        this.f16669c = new ArrayList();
        this.f16670d = new ArrayList();
        this.f16671e = new r(gVar.m(), gVar.s());
        this.f16672f = new s(gVar.m(), this, executor2, scheduledExecutorService);
        this.f16673g = executor;
        this.f16674h = executor2;
        this.f16675i = executor3;
        this.f16676j = z(executor3);
        this.f16677k = new a.C0286a();
    }

    private void B(final ec.c cVar) {
        this.f16675i.execute(new Runnable() { // from class: hc.i
            @Override // java.lang.Runnable
            public final void run() {
                j.this.y(cVar);
            }
        });
        A(cVar);
        this.f16672f.d(cVar);
    }

    private boolean r() {
        ec.c cVar = this.f16680n;
        return cVar != null && cVar.a() - this.f16677k.a() > 300000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task t(ec.c cVar) {
        B(cVar);
        Iterator<e.a> it = this.f16670d.iterator();
        while (it.hasNext()) {
            it.next().a(cVar);
        }
        c c10 = c.c(cVar);
        Iterator<jc.a> it2 = this.f16669c.iterator();
        while (it2.hasNext()) {
            it2.next().a(c10);
        }
        return Tasks.forResult(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task u(boolean z10, Task task) {
        if (!z10 && r()) {
            return Tasks.forResult(this.f16680n);
        }
        if (this.f16679m == null) {
            return Tasks.forException(new zb.m("No AppCheckProvider installed."));
        }
        Task<ec.c> task2 = this.f16681o;
        if (task2 == null || task2.isComplete() || this.f16681o.isCanceled()) {
            this.f16681o = p();
        }
        return this.f16681o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task v(Task task) {
        return Tasks.forResult(task.isSuccessful() ? c.c((ec.c) task.getResult()) : c.d(new zb.m(task.getException().getMessage(), task.getException())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task w(boolean z10, Task task) {
        if (!z10 && r()) {
            return Tasks.forResult(c.c(this.f16680n));
        }
        if (this.f16679m == null) {
            return Tasks.forResult(c.d(new zb.m("No AppCheckProvider installed.")));
        }
        Task<ec.c> task2 = this.f16681o;
        if (task2 == null || task2.isComplete() || this.f16681o.isCanceled()) {
            this.f16681o = p();
        }
        return this.f16681o.continueWithTask(this.f16674h, new Continuation() { // from class: hc.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Task v10;
                v10 = j.v(task3);
                return v10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(TaskCompletionSource taskCompletionSource) {
        ec.c d10 = this.f16671e.d();
        if (d10 != null) {
            A(d10);
        }
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(ec.c cVar) {
        this.f16671e.e(cVar);
    }

    private Task<Void> z(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: hc.f
            @Override // java.lang.Runnable
            public final void run() {
                j.this.x(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    void A(ec.c cVar) {
        this.f16680n = cVar;
    }

    @Override // jc.b
    public Task<ec.d> a(final boolean z10) {
        return this.f16676j.continueWithTask(this.f16674h, new Continuation() { // from class: hc.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task w10;
                w10 = j.this.w(z10, task);
                return w10;
            }
        });
    }

    @Override // jc.b
    public void b(jc.a aVar) {
        com.google.android.gms.common.internal.s.j(aVar);
        this.f16669c.add(aVar);
        this.f16672f.e(this.f16669c.size() + this.f16670d.size());
        if (r()) {
            aVar.a(c.c(this.f16680n));
        }
    }

    @Override // ec.e
    public void c(e.a aVar) {
        com.google.android.gms.common.internal.s.j(aVar);
        this.f16670d.add(aVar);
        this.f16672f.e(this.f16669c.size() + this.f16670d.size());
        if (r()) {
            aVar.a(this.f16680n);
        }
    }

    @Override // ec.e
    public Task<ec.c> d(final boolean z10) {
        return this.f16676j.continueWithTask(this.f16674h, new Continuation() { // from class: hc.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task u10;
                u10 = j.this.u(z10, task);
                return u10;
            }
        });
    }

    @Override // ec.e
    public Task<ec.c> f() {
        ec.a aVar = this.f16679m;
        return aVar == null ? Tasks.forException(new zb.m("No AppCheckProvider installed.")) : aVar.a();
    }

    @Override // ec.e
    public void g(ec.b bVar) {
        s(bVar, this.f16667a.x());
    }

    @Override // ec.e
    public void h(e.a aVar) {
        com.google.android.gms.common.internal.s.j(aVar);
        this.f16670d.remove(aVar);
        this.f16672f.e(this.f16669c.size() + this.f16670d.size());
    }

    @Override // ec.e
    public void i(boolean z10) {
        this.f16672f.f(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<ec.c> p() {
        return this.f16679m.a().onSuccessTask(this.f16673g, new SuccessContinuation() { // from class: hc.h
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task t10;
                t10 = j.this.t((ec.c) obj);
                return t10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ee.b<od.i> q() {
        return this.f16668b;
    }

    public void s(ec.b bVar, boolean z10) {
        com.google.android.gms.common.internal.s.j(bVar);
        this.f16678l = bVar;
        this.f16679m = bVar.a(this.f16667a);
        this.f16672f.f(z10);
    }
}
