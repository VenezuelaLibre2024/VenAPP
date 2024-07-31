package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzemb extends zzelw {
    private final zzclg zza;
    private final zzdaf zzb;
    private final zzeon zzc;
    private final zzdgo zzd;
    private final zzemh zze;
    private final zzeis zzf;

    public zzemb(zzclg zzclgVar, zzdaf zzdafVar, zzeon zzeonVar, zzdgo zzdgoVar, zzemh zzemhVar, zzeis zzeisVar) {
        this.zza = zzclgVar;
        this.zzb = zzdafVar;
        this.zzc = zzeonVar;
        this.zzd = zzdgoVar;
        this.zze = zzemhVar;
        this.zzf = zzeisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    protected final com.google.common.util.concurrent.f zzc(zzfhh zzfhhVar, Bundle bundle, zzfgm zzfgmVar, zzfgy zzfgyVar) {
        zzdaf zzdafVar = this.zzb;
        zzdafVar.zzi(zzfhhVar);
        zzdafVar.zzf(bundle);
        zzdafVar.zzg(new zzczz(zzfgyVar, zzfgmVar, this.zze));
        if (((Boolean) a0.c().zza(zzbgc.zzds)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzclg zzclgVar = this.zza;
        zzdaf zzdafVar2 = this.zzb;
        zzdkn zzg = zzclgVar.zzg();
        zzg.zze(zzdafVar2.zzj());
        zzg.zzd(this.zzd);
        zzg.zzc(this.zzc);
        zzcxp zza = zzg.zzf().zza();
        return zza.zzi(zza.zzj());
    }
}
