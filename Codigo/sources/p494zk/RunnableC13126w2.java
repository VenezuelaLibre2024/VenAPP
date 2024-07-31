package p494zk;

import p089el.C7215d0;
import p124gk.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: zk.w2 */
/* loaded from: classes3.dex */
public final class RunnableC13126w2<U, T extends U> extends C7215d0<T> implements Runnable {

    /* renamed from: e */
    public final long f35493e;

    public RunnableC13126w2(long j10, Continuation<? super U> continuation) {
        super(continuation.getContext(), continuation);
        this.f35493e = j10;
    }

    @Override // p494zk.AbstractC13032a, p494zk.C13050d2
    /* renamed from: p0 */
    public String mo43035p0() {
        return super.mo43035p0() + "(timeMillis=" + this.f35493e + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        m43127w(C13130x2.m43322a(this.f35493e, C13116u0.m43301a(getContext()), this));
    }
}
