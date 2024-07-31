package kotlin.coroutines.jvm.internal;

import gk.Continuation;
import gk.f;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public abstract class d extends a {
    private final gk.f _context;
    private transient Continuation<Object> intercepted;

    public d(Continuation<Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }

    public d(Continuation<Object> continuation, gk.f fVar) {
        super(continuation);
        this._context = fVar;
    }

    @Override // gk.Continuation
    public gk.f getContext() {
        gk.f fVar = this._context;
        n.b(fVar);
        return fVar;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation == null) {
            gk.d dVar = (gk.d) getContext().b(gk.d.f16291n);
            if (dVar == null || (continuation = dVar.E(this)) == null) {
                continuation = this;
            }
            this.intercepted = continuation;
        }
        return continuation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            f.b b10 = getContext().b(gk.d.f16291n);
            n.b(b10);
            ((gk.d) b10).h0(continuation);
        }
        this.intercepted = c.f20733a;
    }
}
