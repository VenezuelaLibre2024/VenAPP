package zk;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class o1 {
    public static final h0 a(Executor executor) {
        h0 h0Var;
        z0 z0Var = executor instanceof z0 ? (z0) executor : null;
        return (z0Var == null || (h0Var = z0Var.f32951a) == null) ? new n1(executor) : h0Var;
    }

    public static final m1 b(ExecutorService executorService) {
        return new n1(executorService);
    }
}
