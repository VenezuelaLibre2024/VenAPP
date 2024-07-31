package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C5224b;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.common.api.internal.x */
/* loaded from: classes.dex */
public class C5191x {
    /* renamed from: a */
    public static void m13202a(Status status, TaskCompletionSource<Void> taskCompletionSource) {
        m13203b(status, null, taskCompletionSource);
    }

    /* renamed from: b */
    public static <ResultT> void m13203b(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        if (status.m12972y1()) {
            taskCompletionSource.setResult(resultt);
        } else {
            taskCompletionSource.setException(C5224b.m13226a(status));
        }
    }

    /* renamed from: c */
    public static <ResultT> boolean m13204c(Status status, ResultT resultt, TaskCompletionSource<ResultT> taskCompletionSource) {
        return status.m12972y1() ? taskCompletionSource.trySetResult(resultt) : taskCompletionSource.trySetException(C5224b.m13226a(status));
    }
}
