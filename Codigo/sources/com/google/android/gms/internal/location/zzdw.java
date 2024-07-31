package com.google.android.gms.internal.location;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
enum zzdw implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
