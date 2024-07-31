package p494zk;

import java.util.concurrent.Future;

/* renamed from: zk.b1 */
/* loaded from: classes3.dex */
final class C13039b1 implements InterfaceC13044c1 {

    /* renamed from: a */
    private final Future<?> f35396a;

    public C13039b1(Future<?> future) {
        this.f35396a = future;
    }

    @Override // p494zk.InterfaceC13044c1
    public void dispose() {
        this.f35396a.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f35396a + ']';
    }
}
