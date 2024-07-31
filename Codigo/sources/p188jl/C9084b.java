package p188jl;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import hk.C7751c;
import hk.C7752d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.C9302h;
import kotlin.jvm.internal.AbstractC9323o;
import p124gk.Continuation;
import p280ok.InterfaceC9998l;
import p494zk.C13087n;
import p494zk.InterfaceC13083m;

/* renamed from: jl.b */
/* loaded from: classes3.dex */
public final class C9084b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jl.b$a */
    /* loaded from: classes3.dex */
    public static final class a<TResult> implements OnCompleteListener {

        /* renamed from: a */
        final /* synthetic */ InterfaceC13083m<T> f21769a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC13083m<? super T> interfaceC13083m) {
            this.f21769a = interfaceC13083m;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                Continuation continuation = this.f21769a;
                C2029n.a aVar = C2029n.f8078b;
                continuation.resumeWith(C2029n.m10340b(C2030o.m10348a(exception)));
            } else {
                if (task.isCanceled()) {
                    InterfaceC13083m.a.m43235a(this.f21769a, null, 1, null);
                    return;
                }
                Continuation continuation2 = this.f21769a;
                C2029n.a aVar2 = C2029n.f8078b;
                continuation2.resumeWith(C2029n.m10340b(task.getResult()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jl.b$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC9323o implements InterfaceC9998l<Throwable, C2037v> {

        /* renamed from: a */
        final /* synthetic */ CancellationTokenSource f21770a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f21770a = cancellationTokenSource;
        }

        /* renamed from: a */
        public final void m26693a(Throwable th2) {
            this.f21770a.cancel();
        }

        @Override // p280ok.InterfaceC9998l
        public /* bridge */ /* synthetic */ C2037v invoke(Throwable th2) {
            m26693a(th2);
            return C2037v.f8089a;
        }
    }

    /* renamed from: a */
    public static final <T> Object m26691a(Task<T> task, Continuation<? super T> continuation) {
        return m26692b(task, null, continuation);
    }

    /* renamed from: b */
    private static final <T> Object m26692b(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) {
        Continuation m23654b;
        Object m23655c;
        if (task.isComplete()) {
            Exception exception = task.getException();
            if (exception != null) {
                throw exception;
            }
            if (!task.isCanceled()) {
                return task.getResult();
            }
            throw new CancellationException("Task " + task + " was cancelled normally.");
        }
        m23654b = C7751c.m23654b(continuation);
        C13087n c13087n = new C13087n(m23654b, 1);
        c13087n.m43269z();
        task.addOnCompleteListener(ExecutorC9083a.f21768a, new a(c13087n));
        if (cancellationTokenSource != null) {
            c13087n.mo24601k(new b(cancellationTokenSource));
        }
        Object m43267w = c13087n.m43267w();
        m23655c = C7752d.m23655c();
        if (m43267w == m23655c) {
            C9302h.m27753c(continuation);
        }
        return m43267w;
    }
}
