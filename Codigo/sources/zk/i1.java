package zk;

import java.util.concurrent.locks.LockSupport;
import zk.h1;

/* loaded from: classes3.dex */
public abstract class i1 extends g1 {
    protected abstract Thread u1();

    /* JADX INFO: Access modifiers changed from: protected */
    public void v1(long j10, h1.b bVar) {
        p0.f32919t.G1(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w1() {
        Thread u12 = u1();
        if (Thread.currentThread() != u12) {
            c.a();
            LockSupport.unpark(u12);
        }
    }
}
