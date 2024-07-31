package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzboy implements zzgdu {
    final /* synthetic */ zzboq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzboy(zzbpc zzbpcVar, zzboq zzboqVar) {
        this.zza = zzboqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdu
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.f zza(Object obj) {
        zzceu zzceuVar = new zzceu();
        ((zzbow) obj).zze(this.zza, new zzbox(this, zzceuVar));
        return zzceuVar;
    }
}
