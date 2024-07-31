package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* loaded from: classes2.dex */
final class zzelm extends zzbul {
    final /* synthetic */ zzeln zza;
    private final zzeiq zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzelm(zzeln zzelnVar, zzeiq zzeiqVar, zzell zzellVar) {
        this.zza = zzelnVar;
        this.zzb = zzeiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zze(String str) {
        ((zzekj) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzf(c3 c3Var) {
        ((zzekj) this.zzb.zzc).zzh(c3Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbum
    public final void zzg(zzbtk zzbtkVar) {
        zzeln.zzc(this.zza, zzbtkVar);
        ((zzekj) this.zzb.zzc).zzo();
    }
}
