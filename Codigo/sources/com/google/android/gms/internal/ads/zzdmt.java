package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdmt implements zzgej {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdmv zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdmt(zzdmv zzdmvVar, String str, boolean z10) {
        this.zzb = zzdmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        if (((Boolean) a0.c().zza(zzbgc.zzfb)).booleanValue()) {
            t.q().zzv(th2, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdna zzdnaVar;
        zzdna zzdnaVar2;
        zzdnaVar = this.zzb.zze;
        zzdnaVar.zzT((zzcjk) obj);
        zzdmv zzdmvVar = this.zzb;
        zzdnaVar2 = zzdmvVar.zze;
        zzceu zzp = zzdnaVar2.zzp();
        zzfod zzf = zzdmvVar.zzf(this.zza, true);
        if (zzf != null && zzp != null) {
            zzp.zzc(zzf);
        } else if (zzp != null) {
            zzp.cancel(false);
        }
    }
}
