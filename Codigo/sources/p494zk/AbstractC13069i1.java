package p494zk;

import java.util.concurrent.locks.LockSupport;
import p494zk.AbstractC13065h1;

/* renamed from: zk.i1 */
/* loaded from: classes3.dex */
public abstract class AbstractC13069i1 extends AbstractC13061g1 {
    /* renamed from: u1 */
    protected abstract Thread mo43162u1();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v1 */
    public void mo43213v1(long j10, AbstractC13065h1.b bVar) {
        RunnableC13096p0.f35470t.m43205G1(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w1 */
    public final void m43214w1() {
        Thread mo43162u1 = mo43162u1();
        if (Thread.currentThread() != mo43162u1) {
            C13042c.m43062a();
            LockSupport.unpark(mo43162u1);
        }
    }
}
