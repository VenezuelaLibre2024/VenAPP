package p494zk;

import java.util.concurrent.Executor;
import p124gk.C7588g;

/* renamed from: zk.z0 */
/* loaded from: classes3.dex */
final class ExecutorC13136z0 implements Executor {

    /* renamed from: a */
    public final AbstractC13064h0 f35502a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        AbstractC13064h0 abstractC13064h0 = this.f35502a;
        C7588g c7588g = C7588g.f17931a;
        if (abstractC13064h0.mo626F0(c7588g)) {
            this.f35502a.mo625D0(c7588g, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f35502a.toString();
    }
}
