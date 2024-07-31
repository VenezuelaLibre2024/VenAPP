package p494zk;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: zk.o1 */
/* loaded from: classes3.dex */
public final class C13093o1 {
    /* renamed from: a */
    public static final AbstractC13064h0 m43276a(Executor executor) {
        AbstractC13064h0 abstractC13064h0;
        ExecutorC13136z0 executorC13136z0 = executor instanceof ExecutorC13136z0 ? (ExecutorC13136z0) executor : null;
        return (executorC13136z0 == null || (abstractC13064h0 = executorC13136z0.f35502a) == null) ? new C13089n1(executor) : abstractC13064h0;
    }

    /* renamed from: b */
    public static final AbstractC13085m1 m43277b(ExecutorService executorService) {
        return new C13089n1(executorService);
    }
}
