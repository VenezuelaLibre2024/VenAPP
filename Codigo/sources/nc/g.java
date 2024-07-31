package nc;

import android.content.Context;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import hc.o;
import hc.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import xa.e;

/* loaded from: classes.dex */
public class g implements ec.a {

    /* renamed from: a, reason: collision with root package name */
    private final Task<xa.f> f21934a;

    /* renamed from: b, reason: collision with root package name */
    private final o f21935b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f21936c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f21937d;

    /* renamed from: e, reason: collision with root package name */
    private final p f21938e;

    /* renamed from: f, reason: collision with root package name */
    private final String f21939f;

    g(zb.g gVar, o oVar, ca.f fVar, Executor executor, Executor executor2, Executor executor3) {
        s.j(gVar);
        s.j(oVar);
        s.j(fVar);
        s.j(executor2);
        this.f21939f = gVar.r().b();
        this.f21936c = executor;
        this.f21937d = executor3;
        this.f21934a = h(gVar.m(), fVar, executor2);
        this.f21935b = oVar;
        this.f21938e = new p();
    }

    public g(zb.g gVar, @dc.c Executor executor, @dc.a Executor executor2, @dc.b Executor executor3) {
        this(gVar, new o(gVar), ca.f.n(), executor, executor2, executor3);
    }

    private static String g(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 9 ? i10 != 18 ? "Unknown error." : "Google Play services is currently being updated on this device." : "The version of the Google Play services installed on this device is not authentic." : "The installed version of Google Play services has been disabled on this device." : "The installed version of Google Play services is out of date." : "Google Play services is missing on this device.";
    }

    private static Task<xa.f> h(final Context context, final ca.f fVar, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: nc.d
            @Override // java.lang.Runnable
            public final void run() {
                g.l(ca.f.this, context, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ hc.a i(a aVar) {
        return this.f21935b.b(aVar.a().getBytes("UTF-8"), 1, this.f21938e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(hc.a aVar) {
        return Tasks.forResult(hc.b.c(aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task k(xa.f fVar) {
        return fVar.d("".getBytes(), this.f21939f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(ca.f fVar, Context context, TaskCompletionSource taskCompletionSource) {
        int g10 = fVar.g(context);
        if (g10 == 0) {
            taskCompletionSource.setResult(xa.d.a(context));
            return;
        }
        taskCompletionSource.setException(new IllegalStateException("SafetyNet unavailable; unable to connect to Google Play Services: " + g(g10)));
    }

    @Override // ec.a
    public Task<ec.c> a() {
        return this.f21934a.onSuccessTask(this.f21936c, new SuccessContinuation() { // from class: nc.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task k10;
                k10 = g.this.k((xa.f) obj);
                return k10;
            }
        }).onSuccessTask(this.f21936c, new SuccessContinuation() { // from class: nc.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return g.this.f((e.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Task<ec.c> f(e.a aVar) {
        s.j(aVar);
        String c10 = aVar.c();
        s.f(c10);
        final a aVar2 = new a(c10);
        return Tasks.call(this.f21937d, new Callable() { // from class: nc.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hc.a i10;
                i10 = g.this.i(aVar2);
                return i10;
            }
        }).onSuccessTask(this.f21936c, new SuccessContinuation() { // from class: nc.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task j10;
                j10 = g.j((hc.a) obj);
                return j10;
            }
        });
    }
}
