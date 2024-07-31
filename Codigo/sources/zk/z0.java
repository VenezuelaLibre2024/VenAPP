package zk;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class z0 implements Executor {

    /* renamed from: a */
    public final h0 f32951a;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        h0 h0Var = this.f32951a;
        gk.g gVar = gk.g.f16294a;
        if (h0Var.F0(gVar)) {
            this.f32951a.D0(gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f32951a.toString();
    }
}
