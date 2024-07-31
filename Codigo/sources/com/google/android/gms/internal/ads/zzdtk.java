package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;

/* loaded from: classes2.dex */
public final class zzdtk {
    private final zzcjx zza;
    private final Context zzb;
    private final zzavi zzc;
    private final zzbhj zzd;
    private final zzcei zze;
    private final com.google.android.gms.ads.internal.a zzf;
    private final zzbbp zzg;
    private final zzddm zzh;
    private final zzehs zzi;
    private final zzfhl zzj;

    public zzdtk(zzcjx zzcjxVar, Context context, zzavi zzaviVar, zzbhj zzbhjVar, zzcei zzceiVar, com.google.android.gms.ads.internal.a aVar, zzbbp zzbbpVar, zzddm zzddmVar, zzehs zzehsVar, zzfhl zzfhlVar) {
        this.zza = zzcjxVar;
        this.zzb = context;
        this.zzc = zzaviVar;
        this.zzd = zzbhjVar;
        this.zze = zzceiVar;
        this.zzf = aVar;
        this.zzg = zzbbpVar;
        this.zzh = zzddmVar;
        this.zzi = zzehsVar;
        this.zzj = zzfhlVar;
    }

    public final zzcjk zza(z4 z4Var, zzfgm zzfgmVar, zzfgp zzfgpVar) {
        zzcla zzc = zzcla.zzc(z4Var);
        String str = z4Var.f8831a;
        zzdsz zzdszVar = new zzdsz(this);
        zzehs zzehsVar = this.zzi;
        zzfhl zzfhlVar = this.zzj;
        com.google.android.gms.ads.internal.a aVar = this.zzf;
        zzbbp zzbbpVar = this.zzg;
        return zzcjx.zza(this.zzb, zzc, str, false, false, this.zzc, this.zzd, this.zze, null, zzdszVar, aVar, zzbbpVar, zzfgmVar, zzfgpVar, zzehsVar, zzfhlVar);
    }
}
