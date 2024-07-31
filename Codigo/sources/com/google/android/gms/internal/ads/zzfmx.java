package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfmx implements zzgej {
    final /* synthetic */ zzfmz zza;
    final /* synthetic */ zzfmo zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfmx(zzfmz zzfmzVar, zzfmo zzfmoVar) {
        this.zza = zzfmzVar;
        this.zzb = zzfmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzfmo zzfmoVar = this.zzb;
        zzfmoVar.zzg(th2);
        zzfmoVar.zzf(false);
        this.zza.zza(zzfmoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
    }
}
