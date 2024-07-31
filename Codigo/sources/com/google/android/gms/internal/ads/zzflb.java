package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzflb implements zzgej {
    final /* synthetic */ zzfkr zza;
    final /* synthetic */ zzfld zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzflb(zzfld zzfldVar, zzfkr zzfkrVar) {
        this.zza = zzfkrVar;
        this.zzb = zzfldVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zza(Throwable th2) {
        zzflf zzflfVar;
        zzflfVar = this.zzb.zza.zzd;
        zzflfVar.zzb(this.zza, th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgej
    public final void zzb(Object obj) {
        zzflf zzflfVar;
        zzflfVar = this.zzb.zza.zzd;
        zzflfVar.zzd(this.zza);
    }
}
