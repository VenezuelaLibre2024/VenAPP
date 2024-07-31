package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C9322n;
import kotlin.jvm.internal.C9333y;
import kotlin.jvm.internal.InterfaceC9317i;
import p124gk.Continuation;

/* renamed from: kotlin.coroutines.jvm.internal.k */
/* loaded from: classes3.dex */
public abstract class AbstractC9305k extends AbstractC9304j implements InterfaceC9317i<Object> {

    /* renamed from: a */
    private final int f22562a;

    public AbstractC9305k(int i10, Continuation<Object> continuation) {
        super(continuation);
        this.f22562a = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC9317i
    public int getArity() {
        return this.f22562a;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC9295a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String m27801f = C9333y.m27801f(this);
        C9322n.m27780d(m27801f, "renderLambdaToString(this)");
        return m27801f;
    }
}
