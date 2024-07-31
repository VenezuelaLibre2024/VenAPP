package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgcx extends zzgcz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgcx(com.google.common.util.concurrent.f fVar, Class cls, zzgdu zzgduVar) {
        super(fVar, cls, zzgduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    final /* bridge */ /* synthetic */ Object zze(Object obj, Throwable th2) {
        zzgdu zzgduVar = (zzgdu) obj;
        com.google.common.util.concurrent.f zza = zzgduVar.zza(th2);
        zzfxe.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgduVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgcz
    final /* synthetic */ void zzf(Object obj) {
        zzs((com.google.common.util.concurrent.f) obj);
    }
}
