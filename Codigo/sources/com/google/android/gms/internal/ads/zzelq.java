package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzelq implements zzgej {
    final /* synthetic */ zzfgm zza;
    final /* synthetic */ zzelr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzelq(zzelr zzelrVar, zzfgm zzfgmVar) {
        this.zza = zzfgmVar;
        this.zzb = zzelrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzels zzelsVar;
        zzels zzelsVar2;
        zzels zzelsVar3;
        synchronized (this.zzb) {
            zzelsVar = this.zzb.zzh;
            zzelsVar.zzb(th2, this.zza);
            zzelsVar2 = this.zzb.zzh;
            if (zzelsVar2.zze()) {
                zzelr zzelrVar = this.zzb;
                zzelsVar3 = zzelrVar.zzh;
                zzelrVar.zze(zzelsVar3.zza());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzels zzelsVar;
        zzels zzelsVar2;
        zzels zzelsVar3;
        zzemi zzemiVar = (zzemi) obj;
        synchronized (this.zzb) {
            zzelsVar = this.zzb.zzh;
            zzelsVar.zzc(zzemiVar, this.zza);
            zzelsVar2 = this.zzb.zzh;
            if (zzelsVar2.zze()) {
                zzelr zzelrVar = this.zzb;
                zzelsVar3 = zzelrVar.zzh;
                zzelrVar.zze(zzelsVar3.zza());
            }
        }
    }
}
