package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
enum zzeh implements Executor {
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