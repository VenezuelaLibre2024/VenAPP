package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgdh extends zzgdj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgdh(com.google.common.util.concurrent.f fVar, zzgdu zzgduVar) {
        super(fVar, zzgduVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzgdu zzgduVar = (zzgdu) obj;
        com.google.common.util.concurrent.f zza = zzgduVar.zza(obj2);
        zzfxe.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgduVar);
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    final /* synthetic */ void zzf(Object obj) {
        zzs((com.google.common.util.concurrent.f) obj);
    }
}
