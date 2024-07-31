package kotlin.coroutines.jvm.internal;

import ck.n;
import ck.o;
import ck.v;
import gk.Continuation;
import java.io.Serializable;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public abstract class a implements Continuation<Object>, e, Serializable {
    private final Continuation<Object> completion;

    public a(Continuation<Object> continuation) {
        this.completion = continuation;
    }

    public Continuation<v> create(Continuation<?> completion) {
        n.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public Continuation<v> create(Object obj, Continuation<?> completion) {
        n.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public e getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof e) {
            return (e) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return g.d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gk.Continuation
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object c10;
        Continuation continuation = this;
        while (true) {
            h.b(continuation);
            a aVar = (a) continuation;
            Continuation continuation2 = aVar.completion;
            n.b(continuation2);
            try {
                invokeSuspend = aVar.invokeSuspend(obj);
                c10 = hk.d.c();
            } catch (Throwable th2) {
                n.a aVar2 = ck.n.f7126b;
                obj = ck.n.b(o.a(th2));
            }
            if (invokeSuspend == c10) {
                return;
            }
            obj = ck.n.b(invokeSuspend);
            aVar.releaseIntercepted();
            if (!(continuation2 instanceof a)) {
                continuation2.resumeWith(obj);
                return;
            }
            continuation = continuation2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
