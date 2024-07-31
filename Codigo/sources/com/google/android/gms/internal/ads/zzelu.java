package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzelu extends zzelw {
    private final zzclg zza;
    private final zzdlf zzb;
    private final zzdaf zzc;
    private final zzdgo zzd;
    private final zzemh zze;
    private final zzeis zzf;

    public zzelu(zzclg zzclgVar, zzdlf zzdlfVar, zzdaf zzdafVar, zzdgo zzdgoVar, zzemh zzemhVar, zzeis zzeisVar) {
        this.zza = zzclgVar;
        this.zzb = zzdlfVar;
        this.zzc = zzdafVar;
        this.zzd = zzdgoVar;
        this.zze = zzemhVar;
        this.zzf = zzeisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    protected final com.google.common.util.concurrent.f zzc(zzfhh zzfhhVar, Bundle bundle, zzfgm zzfgmVar, zzfgy zzfgyVar) {
        zzdaf zzdafVar = this.zzc;
        zzdafVar.zzi(zzfhhVar);
        zzdafVar.zzf(bundle);
        zzdafVar.zzg(new zzczz(zzfgyVar, zzfgmVar, this.zze));
        if (((Boolean) a0.c().zza(zzbgc.zzds)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzclg zzclgVar = this.zza;
        zzdaf zzdafVar2 = this.zzc;
        zzdlj zzh = zzclgVar.zzh();
        zzh.zzf(zzdafVar2.zzj());
        zzh.zze(this.zzd);
        zzh.zzd(this.zzb);
        zzh.zzc(new zzcuc(null));
        zzcxp zza = zzh.zzg().zza();
        return zza.zzi(zza.zzj());
    }
}
