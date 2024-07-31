package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfk extends zzged {
    private com.google.common.util.concurrent.f zza;
    private ScheduledFuture zzb;

    private zzgfk(com.google.common.util.concurrent.f fVar) {
        fVar.getClass();
        this.zza = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.common.util.concurrent.f zzf(com.google.common.util.concurrent.f fVar, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzgfk zzgfkVar = new zzgfk(fVar);
        zzgfh zzgfhVar = new zzgfh(zzgfkVar);
        zzgfkVar.zzb = scheduledExecutorService.schedule(zzgfhVar, j10, timeUnit);
        fVar.addListener(zzgfhVar, zzgeb.INSTANCE);
        return zzgfkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String zza() {
        com.google.common.util.concurrent.f fVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (fVar == null) {
            return null;
        }
        String str = "inputFuture=[" + fVar.toString() + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    protected final void zzb() {
        zzr(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
