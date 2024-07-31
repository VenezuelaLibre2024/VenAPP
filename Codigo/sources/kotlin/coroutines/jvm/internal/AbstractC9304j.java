package kotlin.coroutines.jvm.internal;

import p124gk.C7588g;
import p124gk.Continuation;
import p124gk.InterfaceC7587f;

/* renamed from: kotlin.coroutines.jvm.internal.j */
/* loaded from: classes3.dex */
public abstract class AbstractC9304j extends AbstractC9295a {
    public AbstractC9304j(Continuation<Object> continuation) {
        super(continuation);
        if (continuation != null) {
            if (!(continuation.getContext() == C7588g.f17931a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p124gk.Continuation
    public InterfaceC7587f getContext() {
        return C7588g.f17931a;
    }
}
