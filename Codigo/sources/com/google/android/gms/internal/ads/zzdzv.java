package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdzv implements zzgej {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdzx zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdzv(zzdzx zzdzxVar, String str) {
        this.zza = str;
        this.zzb = zzdzxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdzl zzdzlVar;
        ((zzdyr) obj).zze();
        zzdzlVar = this.zzb.zzd;
        zzdzlVar.zzk(this.zza);
    }
}