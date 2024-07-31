package zd;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import qd.t;

/* loaded from: classes.dex */
public class h0 implements qd.t {

    /* renamed from: a, reason: collision with root package name */
    private final w0 f32599a;

    /* renamed from: b, reason: collision with root package name */
    private final ce.a f32600b;

    /* renamed from: c, reason: collision with root package name */
    private final o3 f32601c;

    /* renamed from: d, reason: collision with root package name */
    private final m3 f32602d;

    /* renamed from: e, reason: collision with root package name */
    private final k f32603e;

    /* renamed from: f, reason: collision with root package name */
    private final de.m f32604f;

    /* renamed from: g, reason: collision with root package name */
    private final q2 f32605g;

    /* renamed from: h, reason: collision with root package name */
    private final n f32606h;

    /* renamed from: i, reason: collision with root package name */
    private final de.i f32607i;

    /* renamed from: j, reason: collision with root package name */
    private final String f32608j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f32609k = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(w0 w0Var, ce.a aVar, o3 o3Var, m3 m3Var, k kVar, de.m mVar, q2 q2Var, n nVar, de.i iVar, String str) {
        this.f32599a = w0Var;
        this.f32600b = aVar;
        this.f32601c = o3Var;
        this.f32602d = m3Var;
        this.f32603e = kVar;
        this.f32604f = mVar;
        this.f32605g = q2Var;
        this.f32606h = nVar;
        this.f32607i = iVar;
        this.f32608j = str;
    }

    private void A(String str) {
        B(str, null);
    }

    private void B(String str, dj.j<String> jVar) {
        l2.a(jVar != null ? String.format("Not recording: %s. Reason: %s", str, jVar) : this.f32607i.a().c() ? String.format("Not recording: %s. Reason: Message is test message", str) : !this.f32606h.b() ? String.format("Not recording: %s. Reason: Data collection is disabled", str) : String.format("Not recording: %s", str));
    }

    private Task<Void> C(dj.b bVar) {
        if (!this.f32609k) {
            d();
        }
        return F(bVar.q(), this.f32601c.a());
    }

    private Task<Void> D(final de.a aVar) {
        l2.a("Attempting to record: message click to metrics logger");
        return C(dj.b.j(new jj.a() { // from class: zd.y
            @Override // jj.a
            public final void run() {
                h0.this.r(aVar);
            }
        }));
    }

    private dj.b E() {
        String a10 = this.f32607i.a().a();
        l2.a("Attempting to record message impression in impression store for id: " + a10);
        dj.b g10 = this.f32599a.r(pf.a.f0().J(this.f32600b.a()).I(a10).build()).h(new jj.d() { // from class: zd.e0
            @Override // jj.d
            public final void accept(Object obj) {
                l2.b("Impression store write failure");
            }
        }).g(new jj.a() { // from class: zd.f0
            @Override // jj.a
            public final void run() {
                l2.a("Impression store write success");
            }
        });
        return i2.Q(this.f32608j) ? this.f32602d.l(this.f32604f).h(new jj.d() { // from class: zd.g0
            @Override // jj.d
            public final void accept(Object obj) {
                l2.b("Rate limiter client write failure");
            }
        }).g(new jj.a() { // from class: zd.w
            @Override // jj.a
            public final void run() {
                l2.a("Rate limiter client write success");
            }
        }).l().c(g10) : g10;
    }

    private static <T> Task<T> F(dj.j<T> jVar, dj.r rVar) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        jVar.f(new jj.d() { // from class: zd.b0
            @Override // jj.d
            public final void accept(Object obj) {
                TaskCompletionSource.this.setResult(obj);
            }
        }).x(dj.j.l(new Callable() { // from class: zd.c0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object x10;
                x10 = h0.x(TaskCompletionSource.this);
                return x10;
            }
        })).r(new jj.e() { // from class: zd.d0
            @Override // jj.e
            public final Object apply(Object obj) {
                dj.n w10;
                w10 = h0.w(TaskCompletionSource.this, (Throwable) obj);
                return w10;
            }
        }).v(rVar).s();
        return taskCompletionSource.getTask();
    }

    private boolean G() {
        return this.f32606h.b();
    }

    private dj.b H() {
        return dj.b.j(new jj.a() { // from class: zd.x
            @Override // jj.a
            public final void run() {
                h0.this.z();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(t.b bVar) {
        this.f32605g.u(this.f32607i, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q() {
        this.f32605g.s(this.f32607i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(de.a aVar) {
        this.f32605g.t(this.f32607i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ dj.n w(TaskCompletionSource taskCompletionSource, Throwable th2) {
        if (th2 instanceof Exception) {
            taskCompletionSource.setException((Exception) th2);
        } else {
            taskCompletionSource.setException(new RuntimeException(th2));
        }
        return dj.j.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object x(TaskCompletionSource taskCompletionSource) {
        taskCompletionSource.setResult(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(t.a aVar) {
        this.f32605g.q(this.f32607i, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        this.f32609k = true;
    }

    @Override // qd.t
    public Task<Void> a(de.a aVar) {
        if (G()) {
            return aVar.b() == null ? b(t.a.CLICK) : D(aVar);
        }
        A("message click to metrics logger");
        return new TaskCompletionSource().getTask();
    }

    @Override // qd.t
    public Task<Void> b(final t.a aVar) {
        if (!G()) {
            A("message dismissal to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        l2.a("Attempting to record: message dismissal to metrics logger");
        return C(dj.b.j(new jj.a() { // from class: zd.v
            @Override // jj.a
            public final void run() {
                h0.this.y(aVar);
            }
        }));
    }

    @Override // qd.t
    public Task<Void> c(final t.b bVar) {
        if (!G()) {
            A("render error to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        l2.a("Attempting to record: render error to metrics logger");
        return F(E().c(dj.b.j(new jj.a() { // from class: zd.z
            @Override // jj.a
            public final void run() {
                h0.this.p(bVar);
            }
        })).c(H()).q(), this.f32601c.a());
    }

    @Override // qd.t
    public Task<Void> d() {
        if (!G() || this.f32609k) {
            A("message impression to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        l2.a("Attempting to record: message impression to metrics logger");
        return F(E().c(dj.b.j(new jj.a() { // from class: zd.a0
            @Override // jj.a
            public final void run() {
                h0.this.q();
            }
        })).c(H()).q(), this.f32601c.a());
    }
}
