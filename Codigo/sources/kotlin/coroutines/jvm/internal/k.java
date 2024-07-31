package kotlin.coroutines.jvm.internal;

import gk.Continuation;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.y;

/* loaded from: classes3.dex */
public abstract class k extends j implements kotlin.jvm.internal.i<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final int f20740a;

    public k(int i10, Continuation<Object> continuation) {
        super(continuation);
        this.f20740a = i10;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.f20740a;
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
