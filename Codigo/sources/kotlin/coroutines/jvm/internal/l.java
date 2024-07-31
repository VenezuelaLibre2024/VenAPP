package kotlin.coroutines.jvm.internal;

import gk.Continuation;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.y;

/* loaded from: classes3.dex */
public abstract class l extends d implements kotlin.jvm.internal.i<Object> {
    private final int arity;

    public l(int i10) {
        this(i10, null);
    }

    public l(int i10, Continuation<Object> continuation) {
        super(continuation);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String f10 = y.f(this);
        n.d(f10, "renderLambdaToString(this)");
        return f10;
    }
}
