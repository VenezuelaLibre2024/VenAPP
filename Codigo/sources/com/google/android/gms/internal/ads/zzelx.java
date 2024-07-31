package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a0;

/* loaded from: classes2.dex */
public final class zzelx extends zzelw {
    private final zzclg zza;
    private final zzdaf zzb;
    private final zzdgo zzc;
    private final zzemh zzd;
    private final zzeis zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelx(zzclg zzclgVar, zzdaf zzdafVar, zzdgo zzdgoVar, zzemh zzemhVar, zzeis zzeisVar) {
        this.zza = zzclgVar;
        this.zzb = zzdafVar;
        this.zzc = zzdgoVar;
        this.zzd = zzemhVar;
        this.zze = zzeisVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelw
    protected final com.google.common.util.concurrent.f zzc(zzfhh zzfhhVar, Bundle bundle, zzfgm zzfgmVar, zzfgy zzfgyVar) {
        zzdaf zzdafVar = this.zzb;
        zzdafVar.zzi(zzfhhVar);
        zzdafVar.zzf(bundle);
        zzdafVar.zzg(new zzczz(zzfgyVar, zzfgmVar, this.zzd));
        if (((Boolean) a0.c().zza(zzbgc.zzds)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzclg zzclgVar = this.zza;
        zzdaf zzdafVar2 = this.zzb;
        zzcts zzd = zzclgVar.zzd();
        zzd.zzd(zzdafVar2.zzj());
        zzd.zzc(this.zzc);
        zzcxp zzb = zzd.zze().zzb();
        return zzb.zzi(zzb.zzj());
    }
}
