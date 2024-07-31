package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzemd extends zzelw {
    private final zzclg zza;
    private final zzdaf zzb;
    private final zzdgo zzc;
    private final zzemh zzd;
    private final zzfgz zze;
    private final zzeis zzf;

    public zzemd(zzclg zzclgVar, zzdaf zzdafVar, zzdgo zzdgoVar, zzfgz zzfgzVar, zzemh zzemhVar, zzeis zzeisVar) {
        this.zza = zzclgVar;
        this.zzb = zzdafVar;
        this.zzc = zzdgoVar;
        this.zze = zzfgzVar;
        this.zzd = zzemhVar;
        this.zzf = zzeisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    protected final com.google.common.util.concurrent.f zzc(zzfhh zzfhhVar, Bundle bundle, zzfgm zzfgmVar, zzfgy zzfgyVar) {
        zzfgz zzfgzVar;
        zzdaf zzdafVar = this.zzb;
        zzdafVar.zzi(zzfhhVar);
        zzdafVar.zzf(bundle);
        zzdafVar.zzg(new zzczz(zzfgyVar, zzfgmVar, this.zzd));
        if (((Boolean) a0.c().zza(zzbgc.zzdr)).booleanValue() && (zzfgzVar = this.zze) != null) {
            this.zzb.zzh(zzfgzVar);
        }
        if (((Boolean) a0.c().zza(zzbgc.zzds)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzclg zzclgVar = this.zza;
        zzdaf zzdafVar2 = this.zzb;
        zzdss zzi = zzclgVar.zzi();
        zzi.zzd(zzdafVar2.zzj());
        zzi.zzc(this.zzc);
        zzcxp zzb = zzi.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
