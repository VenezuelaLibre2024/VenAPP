package kotlin.coroutines.jvm.internal;

import gk.Continuation;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Continuation<T> a(Continuation<? super T> completion) {
        n.e(completion, "completion");
        return completion;
    }

    public static final void b(Continuation<?> frame) {
        n.e(frame, "frame");
    }

    public static final void c(Continuation<?> frame) {
        n.e(frame, "frame");
    }
}
