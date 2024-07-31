package nc;

import android.content.Context;
import ca.C1902f;
import com.google.android.gms.common.internal.C5276s;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ec.AbstractC7173c;
import ec.InterfaceC7171a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p063dc.InterfaceC6879a;
import p063dc.InterfaceC6880b;
import p063dc.InterfaceC6881c;
import p138hc.C7694a;
import p138hc.C7695b;
import p138hc.C7708o;
import p138hc.C7709p;
import p440xa.C12397d;
import p440xa.C12399f;
import p440xa.InterfaceC12398e;
import p485zb.C12867g;

/* renamed from: nc.g */
/* loaded from: classes.dex */
public class C9704g implements InterfaceC7171a {

    /* renamed from: a */
    private final Task<C12399f> f23867a;

    /* renamed from: b */
    private final C7708o f23868b;

    /* renamed from: c */
    private final Executor f23869c;

    /* renamed from: d */
    private final Executor f23870d;

    /* renamed from: e */
    private final C7709p f23871e;

    /* renamed from: f */
    private final String f23872f;

    C9704g(C12867g c12867g, C7708o c7708o, C1902f c1902f, Executor executor, Executor executor2, Executor executor3) {
        C5276s.m13324j(c12867g);
        C5276s.m13324j(c7708o);
        C5276s.m13324j(c1902f);
        C5276s.m13324j(executor2);
        this.f23872f = c12867g.m42632r().m42643b();
        this.f23869c = executor;
        this.f23870d = executor3;
        this.f23867a = m29089h(c12867g.m42630m(), c1902f, executor2);
        this.f23868b = c7708o;
        this.f23871e = new C7709p();
    }

    public C9704g(C12867g c12867g, @InterfaceC6881c Executor executor, @InterfaceC6879a Executor executor2, @InterfaceC6880b Executor executor3) {
        this(c12867g, new C7708o(c12867g), C1902f.m10067n(), executor, executor2, executor3);
    }

    /* renamed from: g */
    private static String m29088g(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 9 ? i10 != 18 ? "Unknown error." : "Google Play services is currently being updated on this device." : "The version of the Google Play services installed on this device is not authentic." : "The installed version of Google Play services has been disabled on this device." : "The installed version of Google Play services is out of date." : "Google Play services is missing on this device.";
    }

    /* renamed from: h */
    private static Task<C12399f> m29089h(final Context context, final C1902f c1902f, Executor executor) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: nc.d
            @Override // java.lang.Runnable
            public final void run() {
                C9704g.m29093l(C1902f.this, context, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ C7694a m29090i(C9698a c9698a) {
        return this.f23868b.m23478b(c9698a.m29083a().getBytes("UTF-8"), 1, this.f23871e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ Task m29091j(C7694a c7694a) {
        return Tasks.forResult(C7695b.m23432c(c7694a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Task m29092k(C12399f c12399f) {
        return c12399f.m40064d("".getBytes(), this.f23872f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m29093l(C1902f c1902f, Context context, TaskCompletionSource taskCompletionSource) {
        int mo10071g = c1902f.mo10071g(context);
        if (mo10071g == 0) {
            taskCompletionSource.setResult(C12397d.m40061a(context));
            return;
        }
        taskCompletionSource.setException(new IllegalStateException("SafetyNet unavailable; unable to connect to Google Play Services: " + m29088g(mo10071g)));
    }

    @Override // ec.InterfaceC7171a
    /* renamed from: a */
    public Task<AbstractC7173c> mo21365a() {
        return this.f23867a.onSuccessTask(this.f23869c, new SuccessContinuation() { // from class: nc.b
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m29092k;
                m29092k = C9704g.this.m29092k((C12399f) obj);
                return m29092k;
            }
        }).onSuccessTask(this.f23869c, new SuccessContinuation() { // from class: nc.c
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return C9704g.this.m29094f((InterfaceC12398e.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Task<AbstractC7173c> m29094f(InterfaceC12398e.a aVar) {
        C5276s.m13324j(aVar);
        String m40062c = aVar.m40062c();
        C5276s.m13320f(m40062c);
        final C9698a c9698a = new C9698a(m40062c);
        return Tasks.call(this.f23870d, new Callable() { // from class: nc.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C7694a m29090i;
                m29090i = C9704g.this.m29090i(c9698a);
                return m29090i;
            }
        }).onSuccessTask(this.f23869c, new SuccessContinuation() { // from class: nc.f
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m29091j;
                m29091j = C9704g.m29091j((C7694a) obj);
                return m29091j;
            }
        });
    }
}
