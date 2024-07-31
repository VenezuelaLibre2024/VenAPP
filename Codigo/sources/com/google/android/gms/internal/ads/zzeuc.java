package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeuc implements zzhhd {
    private final zzhhu zza;
    private final zzhhu zzb;

    public zzeuc(zzhhu zzhhuVar, zzhhu zzhhuVar2) {
        this.zza = zzhhuVar;
        this.zzb = zzhhuVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhhu
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgaf zzn;
        zzets zza = zzetu.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) a0.c().zza(zzbgc.zzdV)).booleanValue()) {
            zzn = zzgaf.zzo(new zzevy(zza, ((Integer) a0.c().zza(zzbgc.zzdW)).intValue(), scheduledExecutorService));
        } else {
            zzn = zzgaf.zzn();
        }
        zzhhl.zzb(zzn);
        return zzn;
    }
}
