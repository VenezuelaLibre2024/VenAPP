package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
public final class zzefi implements zzdds, zzdcl, zzdba {
    private final zzflv zza;
    private final zzflw zzb;
    private final zzcdp zzc;

    public zzefi(zzflv zzflvVar, zzflw zzflwVar, zzcdp zzcdpVar) {
        this.zza = zzflvVar;
        this.zzb = zzflwVar;
        this.zzc = zzcdpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdba
    public final void zzbK(c3 c3Var) {
        zzflv zzflvVar = this.zza;
        zzflvVar.zza("action", "ftl");
        zzflvVar.zza("ftl", String.valueOf(c3Var.f8626a));
        zzflvVar.zza("ed", c3Var.f8628c);
        this.zzb.zzb(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbw(zzbze zzbzeVar) {
        this.zza.zzi(zzbzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzbx(zzfgy zzfgyVar) {
        this.zza.zzh(zzfgyVar, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        zzflv zzflvVar = this.zza;
        zzflvVar.zza("action", "loaded");
        this.zzb.zzb(zzflvVar);
    }
}
