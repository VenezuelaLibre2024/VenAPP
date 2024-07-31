package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class o<R> implements i<R>, Serializable {
    private final int arity;

    public o(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String g10 = y.g(this);
        n.d(g10, "renderLambdaToString(this)");
        return g10;
    }
}
