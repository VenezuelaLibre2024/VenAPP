package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public class x {
    public static void a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        b(status, null, taskCompletionSource);
    }

    public static <ResultT> void b(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.y1()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(com.google.android.gms.common.internal.b.a(status));
        }
    }

    public static <ResultT> boolean c(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.y1() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(com.google.android.gms.common.internal.b.a(status));
    }
}
