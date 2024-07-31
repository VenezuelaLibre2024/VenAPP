package jl;

import ck.n;
import ck.o;
import ck.v;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import gk.Continuation;
import hk.c;
import hk.d;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.h;
import ok.l;
import zk.m;

/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a<TResult> implements OnCompleteListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m<T> f19990a;

        /* JADX WARN: Multi-variable type inference failed */
        a(m<? super T> mVar) {
            this.f19990a = mVar;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Exception exception = task.getException();
            if (exception != null) {
                Continuation continuation = this.f19990a;
                n.a aVar = n.f7126b;
                continuation.resumeWith(n.b(o.a(exception)));
            } else {
                if (task.isCanceled()) {
                    m.a.a(this.f19990a, null, 1, null);
                    return;
                }
                Continuation continuation2 = this.f19990a;
                n.a aVar2 = n.f7126b;
                continuation2.resumeWith(n.b(task.getResult()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jl.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0314b extends kotlin.jvm.internal.o implements l<Throwable, v> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CancellationTokenSource f19991a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0314b(CancellationTokenSource cancellationTokenSource) {
            super(1);
            this.f19991a = cancellationTokenSource;
        }

        public final void a(Throwable th2) {
            this.f19991a.cancel();
        }

        @Override // ok.l
        public /* bridge */ /* synthetic */ v invoke(Throwable th2) {
            a(th2);
            return v.f7137a;
        }
    }

    public static final <T> Object a(Task<T> task, Continuation<? super T> continuation) {
        return b(task, null, continuation);
    }

    private static final <T> Object b(Task<T> task, CancellationTokenSource cancellationTokenSource, Continuation<? super T> continuation) {
        Continuation b10;
        Object c10;
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
        b10 = c.b(continuation);
        zk.n nVar = new zk.n(b10, 1);
        nVar.z();
        task.addOnCompleteListener(jl.a.f19989a, new a(nVar));
        if (cancellationTokenSource != null) {
            nVar.k(new C0314b(cancellationTokenSource));
        }
        Object w10 = nVar.w();
        c10 = d.c();
        if (w10 == c10) {
            h.c(continuation);
        }
        return w10;
    }
}
