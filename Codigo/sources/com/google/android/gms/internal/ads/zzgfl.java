package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfl extends zzgew {
    final /* synthetic */ zzgfn zza;
    private final zzgdt zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgfl(zzgfn zzgfnVar, zzgdt zzgdtVar) {
        this.zza = zzgfnVar;
        this.zzb = zzgdtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final /* bridge */ /* synthetic */ Object zza() {
        zzgdt zzgdtVar = this.zzb;
        com.google.common.util.concurrent.f zza = zzgdtVar.zza();
        zzfxe.zzd(zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgdtVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final void zzd(Throwable th2) {
        this.zza.zzd(th2);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final /* synthetic */ void zze(Object obj) {
        this.zza.zzs((com.google.common.util.concurrent.f) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgew
    final boolean zzg() {
        return this.zza.isDone();
    }
}
