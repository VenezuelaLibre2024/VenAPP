package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfdt implements zzfed {
    private final zzfed zza;
    private zzdae zzb;

    public zzfdt(zzfed zzfedVar) {
        this.zza = zzfedVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdae zzd() {
        return this.zzb;
    }

    public final synchronized com.google.common.util.concurrent.f zzb(zzfee zzfeeVar, zzfec zzfecVar, zzdae zzdaeVar) {
        this.zzb = zzdaeVar;
        if (zzfeeVar.zza == null) {
            return ((zzfds) this.zza).zzb(zzfeeVar, zzfecVar, zzdaeVar);
        }
        zzcxp zzb = zzdaeVar.zzb();
        return zzb.zzi(zzb.zzk(zzgen.zzh(zzfeeVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzfed
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.f zzc(zzfee zzfeeVar, zzfec zzfecVar, Object obj) {
        return zzb(zzfeeVar, zzfecVar, null);
    }
}
