package kotlin.jvm.internal;

import java.io.Serializable;

/* renamed from: kotlin.jvm.internal.o */
/* loaded from: classes3.dex */
public abstract class AbstractC9323o<R> implements InterfaceC9317i<R>, Serializable {
    private final int arity;

    public AbstractC9323o(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC9317i
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String m27802g = C9333y.m27802g(this);
        C9322n.m27780d(m27802g, "renderLambdaToString(this)");
        return m27802g;
    }
}
