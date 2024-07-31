package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzcym implements zzdgi, zzdcl {
    private final la.f zza;
    private final zzcyo zzb;
    private final zzfhh zzc;
    private final String zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcym(la.f fVar, zzcyo zzcyoVar, zzfhh zzfhhVar, String str) {
        this.zza = fVar;
        this.zzb = zzcyoVar;
        this.zzc = zzfhhVar;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdgi
    public final void zza() {
        this.zzb.zze(this.zzd, this.zza.b());
    }

    @Override // com.google.android.gms.internal.ads.zzdcl
    public final void zzr() {
        zzfhh zzfhhVar = this.zzc;
        this.zzb.zzd(zzfhhVar.zzf, this.zzd, this.zza.b());
    }
}
