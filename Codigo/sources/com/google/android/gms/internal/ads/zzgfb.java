package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class zzgfb extends zzgeh implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzgfb(com.google.common.util.concurrent.f fVar, ScheduledFuture scheduledFuture) {
        super(fVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzgeg, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean cancel = zzb().cancel(z10);
        if (cancel) {
            this.zza.cancel(z10);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
