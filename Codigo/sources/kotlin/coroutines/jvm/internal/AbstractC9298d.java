package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C9322n;
import p124gk.Continuation;
import p124gk.InterfaceC7585d;
import p124gk.InterfaceC7587f;

/* renamed from: kotlin.coroutines.jvm.internal.d */
/* loaded from: classes3.dex */
public abstract class AbstractC9298d extends AbstractC9295a {
    private final InterfaceC7587f _context;
    private transient Continuation<Object> intercepted;

    public AbstractC9298d(Continuation<Object> continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }

    public AbstractC9298d(Continuation<Object> continuation, InterfaceC7587f interfaceC7587f) {
        super(continuation);
        this._context = interfaceC7587f;
    }

    @Override // p124gk.Continuation
    public InterfaceC7587f getContext() {
        InterfaceC7587f interfaceC7587f = this._context;
        C9322n.m27778b(interfaceC7587f);
        return interfaceC7587f;
    }

    public final Continuation<Object> intercepted() {
        Continuation<Object> continuation = this.intercepted;
        if (continuation == null) {
            InterfaceC7585d interfaceC7585d = (InterfaceC7585d) getContext().mo20647b(InterfaceC7585d.f17928n);
            if (interfaceC7585d == null || (continuation = interfaceC7585d.mo23036E(this)) == null) {
                continuation = this;
            }
            this.intercepted = continuation;
        }
        return continuation;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
    public void releaseIntercepted() {
        Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            InterfaceC7587f.b mo20647b = getContext().mo20647b(InterfaceC7585d.f17928n);
            C9322n.m27778b(mo20647b);
            ((InterfaceC7585d) mo20647b).mo23037h0(continuation);
        }
        this.intercepted = C9297c.f22555a;
    }
}
