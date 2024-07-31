package p122gc;

import android.util.Log;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ec.AbstractC7173c;
import ec.InterfaceC7171a;
import ee.InterfaceC7183b;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6879a;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6881c;
import p104fc.InterfaceC7327c;
import p138hc.C7694a;
import p138hc.C7695b;
import p138hc.C7708o;
import p138hc.C7709p;
import p485zb.C12867g;

/* renamed from: gc.e */
/* loaded from: classes.dex */
public class C7542e implements InterfaceC7171a {

    /* renamed from: f */
    private static final String f17829f = "gc.e";

    /* renamed from: a */
    private final C7708o f17830a;

    /* renamed from: b */
    private final Executor f17831b;

    /* renamed from: c */
    private final Executor f17832c;

    /* renamed from: d */
    private final C7709p f17833d;

    /* renamed from: e */
    private final Task<String> f17834e;

    public C7542e(C12867g c12867g, InterfaceC7183b<InterfaceC7327c> interfaceC7183b, @InterfaceC6881c Executor executor, @InterfaceC6879a Executor executor2, @InterfaceC6880b Executor executor3) {
        C5276s.m13324j(c12867g);
        this.f17830a = new C7708o(c12867g);
        this.f17831b = executor;
        this.f17832c = executor3;
        this.f17833d = new C7709p();
        String m21981a = interfaceC7183b.get() != null ? interfaceC7183b.get().m21981a() : null;
        this.f17834e = m21981a == null ? m22895f(c12867g, executor2) : Tasks.forResult(m21981a);
    }

    /* renamed from: f */
    static Task<String> m22895f(final C12867g c12867g, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: gc.a
            @Override // java.lang.Runnable
            public final void run() {
                C7542e.m22896g(C12867g.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m22896g(C12867g c12867g, TaskCompletionSource taskCompletionSource) {
        C7544g c7544g = new C7544g(c12867g.m42630m(), c12867g.m42633s());
        String m22901a = c7544g.m22901a();
        if (m22901a == null) {
            m22901a = UUID.randomUUID().toString();
            c7544g.m22902b(m22901a);
        }
        Log.d(f17829f, "Enter this debug secret into the allow list in the Firebase Console for your project: " + m22901a);
        taskCompletionSource.setResult(m22901a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ C7694a m22897h(C7543f c7543f) {
        return this.f17830a.m23478b(c7543f.m22900a().getBytes("UTF-8"), 2, this.f17833d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Task m22898i(String str) {
        final C7543f c7543f = new C7543f(str);
        return Tasks.call(this.f17832c, new Callable() { // from class: gc.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7694a m22897h;
                m22897h = C7542e.this.m22897h(c7543f);
                return m22897h;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Task m22899j(C7694a c7694a) {
        return Tasks.forResult(C7695b.m23432c(c7694a));
    }

    @Override // ec.InterfaceC7171a
    /* renamed from: a */
    public Task<AbstractC7173c> mo21365a() {
        return this.f17834e.onSuccessTask(this.f17831b, new SuccessContinuation() { // from class: gc.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m22898i;
                m22898i = C7542e.this.m22898i((String) obj);
                return m22898i;
            }
        }).onSuccessTask(this.f17831b, new SuccessContinuation() { // from class: gc.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m22899j;
                m22899j = C7542e.m22899j((C7694a) obj);
                return m22899j;
            }
        });
    }
}
