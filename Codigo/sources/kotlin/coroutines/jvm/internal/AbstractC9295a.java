package kotlin.coroutines.jvm.internal;

import ck.C2029n;
import ck.C2030o;
import ck.C2037v;
import hk.C7752d;
import java.io.Serializable;
import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;

/* renamed from: kotlin.coroutines.jvm.internal.a */
/* loaded from: classes3.dex */
public abstract class AbstractC9295a implements Continuation<Object>, InterfaceC9299e, Serializable {
    private final Continuation<Object> completion;

    public AbstractC9295a(Continuation<Object> continuation) {
        this.completion = continuation;
    }

    public Continuation<C2037v> create(Continuation<?> completion) {
        C9322n.m27781e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public Continuation<C2037v> create(Object obj, Continuation<?> completion) {
        C9322n.m27781e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC9299e getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof InterfaceC9299e) {
            return (InterfaceC9299e) continuation;
        }
        return null;
    }

    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return C9301g.m27750d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p124gk.Continuation
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        Object m23655c;
        Continuation continuation = this;
        while (true) {
            C9302h.m27752b(continuation);
            AbstractC9295a abstractC9295a = (AbstractC9295a) continuation;
            Continuation continuation2 = abstractC9295a.completion;
            C9322n.m27778b(continuation2);
            try {
                invokeSuspend = abstractC9295a.invokeSuspend(obj);
                m23655c = C7752d.m23655c();
            } catch (Throwable th2) {
                C2029n.a aVar = C2029n.f8078b;
                obj = C2029n.m10340b(C2030o.m10348a(th2));
            }
            if (invokeSuspend == m23655c) {
                return;
            }
            obj = C2029n.m10340b(invokeSuspend);
            abstractC9295a.releaseIntercepted();
            if (!(continuation2 instanceof AbstractC9295a)) {
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
