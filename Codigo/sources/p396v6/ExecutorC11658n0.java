package p396v6;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: v6.n0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ExecutorC11658n0 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f30424a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f30424a.post(runnable);
    }
}
