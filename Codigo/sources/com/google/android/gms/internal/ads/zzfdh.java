package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfdh implements zzfjp {
    private final zzfed zza;

    public zzfdh(zzfed zzfedVar) {
        this.zza = zzfedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    public final com.google.common.util.concurrent.f zza(zzfjq zzfjqVar) {
        zzfdi zzfdiVar = (zzfdi) zzfjqVar;
        return ((zzfde) this.zza).zzb(zzfdiVar.zzb, zzfdiVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfjp
    public final void zzb(zzfje zzfjeVar) {
        zzfjeVar.zza = ((zzfde) this.zza).zza();
    }
}
