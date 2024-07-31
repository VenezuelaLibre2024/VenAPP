package p138hc;

import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ec.AbstractC7173c;
import ec.AbstractC7174d;
import ec.AbstractC7175e;
import ec.InterfaceC7171a;
import ec.InterfaceC7172b;
import ee.InterfaceC7183b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p063dc.InterfaceC6879a;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6881c;
import p063dc.InterfaceC6882d;
import p160ic.InterfaceC7957a;
import p180jc.InterfaceC9035a;
import p273od.InterfaceC9919i;
import p485zb.C12867g;
import p485zb.C12873m;

/* renamed from: hc.j */
/* loaded from: classes.dex */
public class C7703j extends AbstractC7175e {

    /* renamed from: a */
    private final C12867g f18317a;

    /* renamed from: b */
    private final InterfaceC7183b<InterfaceC9919i> f18318b;

    /* renamed from: c */
    private final List<InterfaceC9035a> f18319c;

    /* renamed from: d */
    private final List<AbstractC7175e.a> f18320d;

    /* renamed from: e */
    private final C7711r f18321e;

    /* renamed from: f */
    private final C7712s f18322f;

    /* renamed from: g */
    private final Executor f18323g;

    /* renamed from: h */
    private final Executor f18324h;

    /* renamed from: i */
    private final Executor f18325i;

    /* renamed from: j */
    private final Task<Void> f18326j;

    /* renamed from: k */
    private final InterfaceC7957a f18327k;

    /* renamed from: l */
    private InterfaceC7172b f18328l;

    /* renamed from: m */
    private InterfaceC7171a f18329m;

    /* renamed from: n */
    private AbstractC7173c f18330n;

    /* renamed from: o */
    private Task<AbstractC7173c> f18331o;

    public C7703j(C12867g c12867g, InterfaceC7183b<InterfaceC9919i> interfaceC7183b, @InterfaceC6882d Executor executor, @InterfaceC6881c Executor executor2, @InterfaceC6879a Executor executor3, @InterfaceC6880b ScheduledExecutorService scheduledExecutorService) {
        C5276s.m13324j(c12867g);
        C5276s.m13324j(interfaceC7183b);
        this.f18317a = c12867g;
        this.f18318b = interfaceC7183b;
        this.f18319c = new ArrayList();
        this.f18320d = new ArrayList();
        this.f18321e = new C7711r(c12867g.m42630m(), c12867g.m42633s());
        this.f18322f = new C7712s(c12867g.m42630m(), this, executor2, scheduledExecutorService);
        this.f18323g = executor;
        this.f18324h = executor2;
        this.f18325i = executor3;
        this.f18326j = m23455z(executor3);
        this.f18327k = new InterfaceC7957a.a();
    }

    /* renamed from: B */
    private void m23441B(final AbstractC7173c abstractC7173c) {
        this.f18325i.execute(new Runnable() { // from class: hc.i
            @Override // java.lang.Runnable
            public final void run() {
                C7703j.this.m23454y(abstractC7173c);
            }
        });
        m23456A(abstractC7173c);
        this.f18322f.m23494d(abstractC7173c);
    }

    /* renamed from: r */
    private boolean m23448r() {
        AbstractC7173c abstractC7173c = this.f18330n;
        return abstractC7173c != null && abstractC7173c.mo21367a() - this.f18327k.mo24442a() > 300000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ Task m23449t(AbstractC7173c abstractC7173c) {
        m23441B(abstractC7173c);
        Iterator<AbstractC7175e.a> it = this.f18320d.iterator();
        while (it.hasNext()) {
            it.next().mo21378a(abstractC7173c);
        }
        C7696c m23439c = C7696c.m23439c(abstractC7173c);
        Iterator<InterfaceC9035a> it2 = this.f18319c.iterator();
        while (it2.hasNext()) {
            it2.next().mo17873a(m23439c);
        }
        return Tasks.forResult(abstractC7173c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Task m23450u(boolean z10, Task task) {
        if (!z10 && m23448r()) {
            return Tasks.forResult(this.f18330n);
        }
        if (this.f18329m == null) {
            return Tasks.forException(new C12873m("No AppCheckProvider installed."));
        }
        Task<AbstractC7173c> task2 = this.f18331o;
        if (task2 == null || task2.isComplete() || this.f18331o.isCanceled()) {
            this.f18331o = m23459p();
        }
        return this.f18331o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ Task m23451v(Task task) {
        return Tasks.forResult(task.isSuccessful() ? C7696c.m23439c((AbstractC7173c) task.getResult()) : C7696c.m23440d(new C12873m(task.getException().getMessage(), task.getException())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ Task m23452w(boolean z10, Task task) {
        if (!z10 && m23448r()) {
            return Tasks.forResult(C7696c.m23439c(this.f18330n));
        }
        if (this.f18329m == null) {
            return Tasks.forResult(C7696c.m23440d(new C12873m("No AppCheckProvider installed.")));
        }
        Task<AbstractC7173c> task2 = this.f18331o;
        if (task2 == null || task2.isComplete() || this.f18331o.isCanceled()) {
            this.f18331o = m23459p();
        }
        return this.f18331o.continueWithTask(this.f18324h, new Continuation() { // from class: hc.g
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task3) {
                Task m23451v;
                m23451v = C7703j.m23451v(task3);
                return m23451v;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m23453x(TaskCompletionSource taskCompletionSource) {
        AbstractC7173c m23488d = this.f18321e.m23488d();
        if (m23488d != null) {
            m23456A(m23488d);
        }
        taskCompletionSource.setResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m23454y(AbstractC7173c abstractC7173c) {
        this.f18321e.m23489e(abstractC7173c);
    }

    /* renamed from: z */
    private Task<Void> m23455z(Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: hc.f
            @Override // java.lang.Runnable
            public final void run() {
                C7703j.this.m23453x(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: A */
    void m23456A(AbstractC7173c abstractC7173c) {
        this.f18330n = abstractC7173c;
    }

    @Override // p180jc.InterfaceC9036b
    /* renamed from: a */
    public Task<AbstractC7174d> mo23457a(final boolean z10) {
        return this.f18326j.continueWithTask(this.f18324h, new Continuation() { // from class: hc.e
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m23452w;
                m23452w = C7703j.this.m23452w(z10, task);
                return m23452w;
            }
        });
    }

    @Override // p180jc.InterfaceC9036b
    /* renamed from: b */
    public void mo23458b(InterfaceC9035a interfaceC9035a) {
        C5276s.m13324j(interfaceC9035a);
        this.f18319c.add(interfaceC9035a);
        this.f18322f.m23495e(this.f18319c.size() + this.f18320d.size());
        if (m23448r()) {
            interfaceC9035a.mo17873a(C7696c.m23439c(this.f18330n));
        }
    }

    @Override // ec.AbstractC7175e
    /* renamed from: c */
    public void mo21372c(AbstractC7175e.a aVar) {
        C5276s.m13324j(aVar);
        this.f18320d.add(aVar);
        this.f18322f.m23495e(this.f18319c.size() + this.f18320d.size());
        if (m23448r()) {
            aVar.mo21378a(this.f18330n);
        }
    }

    @Override // ec.AbstractC7175e
    /* renamed from: d */
    public Task<AbstractC7173c> mo21373d(final boolean z10) {
        return this.f18326j.continueWithTask(this.f18324h, new Continuation() { // from class: hc.d
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task m23450u;
                m23450u = C7703j.this.m23450u(z10, task);
                return m23450u;
            }
        });
    }

    @Override // ec.AbstractC7175e
    /* renamed from: f */
    public Task<AbstractC7173c> mo21374f() {
        InterfaceC7171a interfaceC7171a = this.f18329m;
        return interfaceC7171a == null ? Tasks.forException(new C12873m("No AppCheckProvider installed.")) : interfaceC7171a.mo21365a();
    }

    @Override // ec.AbstractC7175e
    /* renamed from: g */
    public void mo21375g(InterfaceC7172b interfaceC7172b) {
        m23461s(interfaceC7172b, this.f18317a.m42634x());
    }

    @Override // ec.AbstractC7175e
    /* renamed from: h */
    public void mo21376h(AbstractC7175e.a aVar) {
        C5276s.m13324j(aVar);
        this.f18320d.remove(aVar);
        this.f18322f.m23495e(this.f18319c.size() + this.f18320d.size());
    }

    @Override // ec.AbstractC7175e
    /* renamed from: i */
    public void mo21377i(boolean z10) {
        this.f18322f.m23496f(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public Task<AbstractC7173c> m23459p() {
        return this.f18329m.mo21365a().onSuccessTask(this.f18323g, new SuccessContinuation() { // from class: hc.h
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m23449t;
                m23449t = C7703j.this.m23449t((AbstractC7173c) obj);
                return m23449t;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public InterfaceC7183b<InterfaceC9919i> m23460q() {
        return this.f18318b;
    }

    /* renamed from: s */
    public void m23461s(InterfaceC7172b interfaceC7172b, boolean z10) {
        C5276s.m13324j(interfaceC7172b);
        this.f18328l = interfaceC7172b;
        this.f18329m = interfaceC7172b.mo21366a(this.f18317a);
        this.f18322f.m23496f(z10);
    }
}
