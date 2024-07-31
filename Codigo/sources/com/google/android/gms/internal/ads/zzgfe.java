package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzgfe {
    public static zzgey zza(ExecutorService executorService) {
        if (executorService instanceof zzgey) {
            return (zzgey) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgfd((ScheduledExecutorService) executorService) : new zzgfa(executorService);
    }

    public static Executor zzb() {
        return zzgeb.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor zzc(Executor executor, zzgdb zzgdbVar) {
        executor.getClass();
        return executor == zzgeb.INSTANCE ? executor : new zzgez(executor, zzgdbVar);
    }
}
