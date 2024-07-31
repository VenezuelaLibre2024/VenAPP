package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzekg implements zzgej {
    final /* synthetic */ zzekh zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekg(zzekh zzekhVar) {
        this.zza = zzekhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzcvc zzcvcVar;
        zzdaz zzdazVar;
        zzcvcVar = this.zza.zza;
        c3 zza = zzcvcVar.zzd().zza(th2);
        zzdazVar = this.zza.zzd;
        zzdazVar.zzbK(zza);
        zzfie.zzb(zza.f8626a, th2, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcuf) obj).zzj();
    }
}
