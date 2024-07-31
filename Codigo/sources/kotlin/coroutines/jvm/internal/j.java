package kotlin.coroutines.jvm.internal;

import gk.Continuation;

/* loaded from: classes3.dex */
public abstract class j extends a {
    public j(Continuation<Object> continuation) {
        super(continuation);
        if (continuation != null) {
            if (!(continuation.getContext() == gk.g.f16294a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // gk.Continuation
    public gk.f getContext() {
        return gk.g.f16294a;
    }
}
