package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfmw implements zzgej {
    final /* synthetic */ zzfmz zza;
    final /* synthetic */ zzfmo zzb;
    final /* synthetic */ boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmw(zzfmz zzfmzVar, zzfmo zzfmoVar, boolean z10) {
        this.zza = zzfmzVar;
        this.zzb = zzfmoVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzfmo zzfmoVar = this.zzb;
        if (zzfmoVar.zzj()) {
            zzfmz zzfmzVar = this.zza;
            zzfmoVar.zzg(th2);
            zzfmoVar.zzf(false);
            zzfmzVar.zza(zzfmoVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
        zzfmo zzfmoVar = this.zzb;
        zzfmoVar.zzf(true);
        this.zza.zza(zzfmoVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
