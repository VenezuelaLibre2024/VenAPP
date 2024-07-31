package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import kotlin.jvm.internal.n;

/* loaded from: classes.dex */
public final class CombineContinuationsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        n.e(context, "context");
        n.e(workerParams, "workerParams");
    }

    @Override // androidx.work.Worker
    public c.a doWork() {
        c.a e10 = c.a.e(getInputData());
        n.d(e10, "success(inputData)");
        return e10;
    }
}
