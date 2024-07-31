package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfds implements zzfed {
    private zzdae zza;

    @Override // com.google.android.gms.internal.ads.zzfed
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdae zzd() {
        return this.zza;
    }

    public final synchronized com.google.common.util.concurrent.f zzb(zzfee zzfeeVar, zzfec zzfecVar, zzdae zzdaeVar) {
        zzcxp zzb;
        if (zzdaeVar != null) {
            this.zza = zzdaeVar;
        } else {
            this.zza = (zzdae) zzfecVar.zza(zzfeeVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.f zzc(zzfee zzfeeVar, zzfec zzfecVar, Object obj) {
        return zzb(zzfeeVar, zzfecVar, null);
    }
}
