package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzfba {
    /* JADX WARN: Multi-variable type inference failed */
    public static zzexq zza(zzfae zzfaeVar, zzevq zzevqVar, ScheduledExecutorService scheduledExecutorService, int i10) {
        if (i10 == 0) {
            zzfaeVar = zzevqVar;
        }
        return new zzevy(zzfaeVar, 0L, scheduledExecutorService);
    }

    public static zzexq zzb(zzfao zzfaoVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzevy(zzfaoVar, ((Long) a0.c().zza(zzbgc.zzdZ)).longValue(), scheduledExecutorService);
    }

    public static zzexq zzc(zzfbj zzfbjVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzevy(zzfbjVar, 0L, scheduledExecutorService);
    }
}
