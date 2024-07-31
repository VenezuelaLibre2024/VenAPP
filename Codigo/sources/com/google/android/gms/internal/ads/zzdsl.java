package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdsl implements zzbnw {
    private final zzdce zza;
    private final zzcag zzb;
    private final String zzc;
    private final String zzd;

    public zzdsl(zzdce zzdceVar, zzfgm zzfgmVar) {
        this.zza = zzdceVar;
        this.zzb = zzfgmVar.zzm;
        this.zzc = zzfgmVar.zzk;
        this.zzd = zzfgmVar.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zza(zzcag zzcagVar) {
        int i10;
        String str;
        zzcag zzcagVar2 = this.zzb;
        if (zzcagVar2 != null) {
            zzcagVar = zzcagVar2;
        }
        if (zzcagVar != null) {
            str = zzcagVar.zza;
            i10 = zzcagVar.zzb;
        } else {
            i10 = 1;
            str = "";
        }
        this.zza.zzd(new zzbzr(str, i10), this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzb() {
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final void zzc() {
        this.zza.zzf();
    }
}
