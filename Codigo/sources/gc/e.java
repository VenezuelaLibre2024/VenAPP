package gc;

import android.util.Log;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import hc.o;
import hc.p;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class e implements ec.a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f16192f = "gc.e";

    /* renamed from: a, reason: collision with root package name */
    private final o f16193a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16194b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f16195c;

    /* renamed from: d, reason: collision with root package name */
    private final p f16196d;

    /* renamed from: e, reason: collision with root package name */
    private final Task<String> f16197e;

    public e(zb.g gVar, ee.b<fc.c> bVar, @dc.c Executor executor, @dc.a Executor executor2, @dc.b Executor executor3) {
        s.j(gVar);
        this.f16193a = new o(gVar);
        this.f16194b = executor;
        this.f16195c = executor3;
        this.f16196d = new p();
        String a10 = bVar.get() != null ? bVar.get().a() : null;
        this.f16197e = a10 == null ? f(gVar, executor2) : Tasks.forResult(a10);
    }

    static Task<String> f(final zb.g gVar, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: gc.a
            @Override // java.lang.Runnable
            public final void run() {
                e.g(zb.g.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(zb.g gVar, TaskCompletionSource taskCompletionSource) {
        g gVar2 = new g(gVar.m(), gVar.s());
        String a10 = gVar2.a();
        if (a10 == null) {
            a10 = UUID.randomUUID().toString();
            gVar2.b(a10);
        }
        Log.d(f16192f, "Enter this debug secret into the allow list in the Firebase Console for your project: " + a10);
        taskCompletionSource.setResult(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ hc.a h(f fVar) {
        return this.f16193a.b(fVar.a().getBytes("UTF-8"), 2, this.f16196d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task i(String str) {
        final f fVar = new f(str);
        return Tasks.call(this.f16195c, new Callable() { // from class: gc.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                hc.a h10;
                h10 = e.this.h(fVar);
                return h10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task j(hc.a aVar) {
        return Tasks.forResult(hc.b.c(aVar));
    }

    @Override // ec.a
    public Task<ec.c> a() {
        return this.f16197e.onSuccessTask(this.f16194b, new SuccessContinuation() { // from class: gc.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task i10;
                i10 = e.this.i((String) obj);
                return i10;
            }
        }).onSuccessTask(this.f16194b, new SuccessContinuation() { // from class: gc.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task j10;
                j10 = e.j((hc.a) obj);
                return j10;
            }
        });
    }
}
