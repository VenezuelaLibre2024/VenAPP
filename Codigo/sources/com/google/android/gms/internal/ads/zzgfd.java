package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzgfd extends zzgfa implements ScheduledExecutorService {
    final ScheduledExecutorService zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgfd(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.zza;
        zzgfn zze = zzgfn.zze(runnable, null);
        return new zzgfb(zze, scheduledExecutorService.schedule(zze, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzgfn zzgfnVar = new zzgfn(callable);
        return new zzgfb(zzgfnVar, this.zza.schedule(zzgfnVar, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzgfc zzgfcVar = new zzgfc(runnable);
        return new zzgfb(zzgfcVar, this.zza.scheduleAtFixedRate(zzgfcVar, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzgfc zzgfcVar = new zzgfc(runnable);
        return new zzgfb(zzgfcVar, this.zza.scheduleWithFixedDelay(zzgfcVar, j10, j11, timeUnit));
    }
}
