package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzdvq implements zzdds, zzdcl, zzdba {
    private final zzdwa zza;
    private final zzdwk zzb;

    public zzdvq(zzdwa zzdwaVar, zzdwk zzdwkVar) {
        this.zza = zzdwaVar;
        this.zzb = zzdwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(c3Var.f8626a));
        this.zza.zza().put("ed", c3Var.f8628c);
        this.zzb.zzf(this.zza.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
        this.zza.zzc(zzbzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
        this.zza.zzb(zzfgyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zzf(this.zza.zza());
    }
}
